import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class116_Sub1 extends Class116 {

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "Lclient!ak;")
	private final Class17 aClass17_1;

	@OriginalMember(owner = "client!fr", name = "r", descriptor = "Lclient!gea;")
	private final Class122 aClass122_1;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class116_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass17_1 = new Class17(this.aSocket1.getInputStream(), arg1);
		this.aClass122_1 = new Class122(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	@Override
	public void method2477() {
		this.aClass17_1.method293();
		this.aClass122_1.method2914();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BI[BI)I")
	@Override
	public int method2476(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass17_1.method297(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)V")
	@Override
	public void method2483() {
		try {
			this.aSocket1.close();
		} catch (@Pc(9) IOException local9) {
		}
		this.aClass17_1.method296();
		this.aClass122_1.method2913();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method2480(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass17_1.method295(arg0);
	}

	@OriginalMember(owner = "client!fr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2483();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "([BIIB)V")
	@Override
	public void method2478(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		this.aClass122_1.method2911(arg0, arg1);
	}
}
