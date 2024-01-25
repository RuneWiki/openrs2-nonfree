import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class192_Sub1 extends Class192 {

	@OriginalMember(owner = "client!u", name = "t", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!u", name = "p", descriptor = "Lclient!rja;")
	private final Class317 aClass317_1;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Lclient!wha;")
	private final Class387 aClass387_1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class192_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass317_1 = new Class317(this.aSocket1.getInputStream(), arg1);
		this.aClass387_1 = new Class387(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method7787(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass317_1.method7032(arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([BIII)I")
	@Override
	public int method7792(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass317_1.method7036(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	@Override
	public void method7791() {
		try {
			this.aSocket1.close();
		} catch (@Pc(12) IOException local12) {
		}
		this.aClass317_1.method7033();
		this.aClass387_1.method8793();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III[B)V")
	@Override
	public void method7790(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass387_1.method8792(arg1, arg0);
	}

	@OriginalMember(owner = "client!u", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7791();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
	@Override
	public void method7793() {
		this.aClass317_1.method7031();
		this.aClass387_1.method8794();
	}
}
