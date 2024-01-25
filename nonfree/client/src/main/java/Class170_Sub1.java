import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class170_Sub1 extends Class170 {

	@OriginalMember(owner = "client!vp", name = "i", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!vp", name = "s", descriptor = "Lclient!wv;")
	private final Class395 aClass395_1;

	@OriginalMember(owner = "client!vp", name = "q", descriptor = "Lclient!nha;")
	private final Class241 aClass241_1;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class170_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass395_1 = new Class395(this.aSocket2.getInputStream(), arg1);
		this.aClass241_1 = new Class241(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method8769(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass395_1.method9167(arg0);
	}

	@OriginalMember(owner = "client!vp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8770();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
	@Override
	public void method8768() {
		this.aClass395_1.method9166();
		this.aClass241_1.method5576();
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V")
	@Override
	public void method8770() {
		try {
			this.aSocket2.close();
		} catch (@Pc(13) IOException local13) {
		}
		this.aClass395_1.method9170();
		this.aClass241_1.method5577();
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(I[BII)I")
	@Override
	public int method8776(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass395_1.method9168(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II[BB)V")
	@Override
	public void method8773(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		this.aClass241_1.method5575(arg1, arg0);
	}
}
