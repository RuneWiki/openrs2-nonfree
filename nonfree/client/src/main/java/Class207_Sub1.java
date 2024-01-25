import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class207_Sub1 extends Class207 {

	@OriginalMember(owner = "client!la", name = "l", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!vea;")
	private final Class371 aClass371_1;

	@OriginalMember(owner = "client!la", name = "i", descriptor = "Lclient!du;")
	private final Class81 aClass81_1;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class207_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass371_1 = new Class371(this.aSocket2.getInputStream(), arg1);
		this.aClass81_1 = new Class81(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	@Override
	public void method5435() {
		this.aClass371_1.method9327();
		this.aClass81_1.method2048();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method5439(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass371_1.method9329(arg0);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method5434(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		this.aClass81_1.method2047(arg0, arg1);
	}

	@OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5436();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I[BII)I")
	@Override
	public int method5438(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass371_1.method9332(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
	@Override
	public void method5436() {
		try {
			this.aSocket2.close();
		} catch (@Pc(13) IOException local13) {
		}
		this.aClass371_1.method9331();
		this.aClass81_1.method2051();
	}
}
