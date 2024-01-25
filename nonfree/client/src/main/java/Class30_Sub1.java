import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bea", name = "u", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!bea", name = "l", descriptor = "Lclient!gca;")
	private final Class122 aClass122_1;

	@OriginalMember(owner = "client!bea", name = "h", descriptor = "Lclient!hn;")
	private final Class146 aClass146_1;

	@OriginalMember(owner = "client!bea", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class30_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass122_1 = new Class122(this.aSocket1.getInputStream(), arg1);
		this.aClass146_1 = new Class146(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "([BIII)I")
	@Override
	public int method677(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass122_1.method2673(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method669(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass122_1.method2674(arg0);
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)V")
	@Override
	public void method671() {
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass122_1.method2672();
		this.aClass146_1.method3304();
	}

	@OriginalMember(owner = "client!bea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method671();
	}

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
	@Override
	public void method676() {
		this.aClass122_1.method2671();
		this.aClass146_1.method3299();
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method672(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		this.aClass146_1.method3301(arg0, arg1);
	}
}
