import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class75_Sub1 extends Class75 {

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!dq", name = "m", descriptor = "Lclient!dfa;")
	private final Class68 aClass68_1;

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "Lclient!tb;")
	private final Class305 aClass305_1;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class75_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass68_1 = new Class68(this.aSocket1.getInputStream(), arg1);
		this.aClass305_1 = new Class305(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B[BII)I")
	@Override
	public int method1856(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass68_1.method1758(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	@Override
	public void method1857() {
		this.aClass68_1.method1757();
		this.aClass305_1.method6957();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1855(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass68_1.method1759(arg0);
	}

	@OriginalMember(owner = "client!dq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1850();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	@Override
	public void method1850() {
		try {
			this.aSocket1.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass68_1.method1760();
		this.aClass305_1.method6960();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IBI[B)V")
	@Override
	public void method1854(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass305_1.method6959(arg1, arg0);
	}
}
