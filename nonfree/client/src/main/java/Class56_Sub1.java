import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "Lclient!wl;")
	private final Class314 aClass314_1;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "Lclient!ko;")
	private final Class169 aClass169_1;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class56_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass314_1 = new Class314(this.aSocket1.getInputStream(), arg1);
		this.aClass169_1 = new Class169(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIB[B)V")
	@Override
	public void method1315(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass169_1.method4303(arg0, arg1);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(III[B)I")
	@Override
	public int method1316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		return this.aClass314_1.method7450(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
	@Override
	public void method1311() {
		this.aClass314_1.method7443();
		this.aClass169_1.method4300();
	}

	@OriginalMember(owner = "client!cv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1312();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1313(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass314_1.method7448(arg0);
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V")
	@Override
	public void method1312() {
		try {
			this.aSocket1.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass314_1.method7449();
		this.aClass169_1.method4301();
	}
}
