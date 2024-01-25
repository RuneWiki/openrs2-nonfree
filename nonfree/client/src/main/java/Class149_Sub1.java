import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class149_Sub1 extends Class149 {

	@OriginalMember(owner = "client!iaa", name = "v", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!iaa", name = "s", descriptor = "Lclient!ec;")
	private final Class81 aClass81_1;

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "Lclient!kk;")
	private final Class193 aClass193_1;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class149_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass81_1 = new Class81(this.aSocket1.getInputStream(), arg1);
		this.aClass193_1 = new Class193(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z[BII)V")
	@Override
	public void method3282(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		this.aClass193_1.method3868(arg0, arg1);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3280(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass81_1.method1717(arg0);
	}

	@OriginalMember(owner = "client!iaa", name = "b", descriptor = "(Z)V")
	@Override
	public void method3281() {
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass81_1.method1721();
		this.aClass193_1.method3865();
	}

	@OriginalMember(owner = "client!iaa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3281();
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Z)V")
	@Override
	public void method3279() {
		this.aClass81_1.method1715();
		this.aClass193_1.method3866();
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(II[BI)I")
	@Override
	public int method3278(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass81_1.method1720(arg2, arg0, arg1);
	}
}
