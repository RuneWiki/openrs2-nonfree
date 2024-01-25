import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class210_Sub1 extends Class210 {

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!uq", name = "j", descriptor = "Lclient!ho;")
	private final Class150 aClass150_1;

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "Lclient!hp;")
	private final Class151 aClass151_1;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class210_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass150_1 = new Class150(this.aSocket2.getInputStream(), arg1);
		this.aClass151_1 = new Class151(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
	@Override
	public void method8030() {
		try {
			this.aSocket2.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass150_1.method3743();
		this.aClass151_1.method3749();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(III[B)V")
	@Override
	public void method8027(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass151_1.method3751(arg0, arg1);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II[BI)I")
	@Override
	public int method8031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		return this.aClass150_1.method3745(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
	@Override
	public void method8028() {
		this.aClass150_1.method3747();
		this.aClass151_1.method3753();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method8029(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass150_1.method3748(arg0);
	}

	@OriginalMember(owner = "client!uq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8030();
	}
}
