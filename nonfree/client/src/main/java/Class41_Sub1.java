import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!caa", name = "q", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!caa", name = "p", descriptor = "Lclient!ik;")
	private final Class143 aClass143_1;

	@OriginalMember(owner = "client!caa", name = "h", descriptor = "Lclient!st;")
	private final Class314 aClass314_1;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class41_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass143_1 = new Class143(this.aSocket1.getInputStream(), arg1);
		this.aClass314_1 = new Class314(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V")
	@Override
	public void method1730() {
		this.aClass143_1.method4391();
		this.aClass314_1.method7561();
	}

	@OriginalMember(owner = "client!caa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1733();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "([BIII)I")
	@Override
	public int method1734(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass143_1.method4393(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
	@Override
	public void method1733() {
		try {
			this.aSocket1.close();
		} catch (@Pc(14) IOException local14) {
		}
		this.aClass143_1.method4392();
		this.aClass314_1.method7564();
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method1728(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		this.aClass314_1.method7563(arg0, arg1);
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1729(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass143_1.method4394(arg0);
	}
}
