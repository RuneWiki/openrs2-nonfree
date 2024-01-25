import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class154_Sub1 extends Class154 {

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "Lclient!go;")
	private final Class108 aClass108_1;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "Lclient!uba;")
	private final Class284 aClass284_1;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class154_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass108_1 = new Class108(this.aSocket2.getInputStream(), arg1);
		this.aClass284_1 = new Class284(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4020();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III[B)V")
	@Override
	public void method4023(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass284_1.method6937(arg1, arg0);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	@Override
	public void method4020() {
		try {
			this.aSocket2.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass108_1.method3264();
		this.aClass284_1.method6936();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method4019(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass108_1.method3265(arg0);
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V")
	@Override
	public void method4017() {
		this.aClass108_1.method3266();
		this.aClass284_1.method6935();
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB[BI)I")
	@Override
	public int method4022(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass108_1.method3261(arg2, arg0, arg1);
	}
}
