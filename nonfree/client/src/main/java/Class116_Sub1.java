import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class116_Sub1 extends Class116 {

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!jc", name = "k", descriptor = "Lclient!cn;")
	private final Class34 aClass34_1;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Lclient!uv;")
	private final Class251 aClass251_1;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class116_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass34_1 = new Class34(this.aSocket1.getInputStream(), arg1);
		this.aClass251_1 = new Class251(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!jc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2920();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method2924(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass34_1.method1099(arg0);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([BIII)I")
	@Override
	public int method2919(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass34_1.method1098(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V")
	@Override
	public void method2920() {
		try {
			this.aSocket1.close();
		} catch (@Pc(13) IOException local13) {
		}
		this.aClass34_1.method1101();
		this.aClass251_1.method5826();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
	@Override
	public void method2923() {
		this.aClass34_1.method1102();
		this.aClass251_1.method5825();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ[BI)V")
	@Override
	public void method2918(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		this.aClass251_1.method5824(arg0, arg1);
	}
}
