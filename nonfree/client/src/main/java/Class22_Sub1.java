import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!taa")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!taa", name = "x", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!taa", name = "n", descriptor = "Lclient!nba;")
	private final Class236 aClass236_1;

	@OriginalMember(owner = "client!taa", name = "o", descriptor = "Lclient!lt;")
	private final Class217 aClass217_1;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class22_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass236_1 = new Class236(this.aSocket1.getInputStream(), arg1);
		this.aClass217_1 = new Class217(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "(I)V")
	@Override
	public void method7462() {
		this.aClass236_1.method5545();
		this.aClass217_1.method5097();
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7464(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass236_1.method5547(arg0);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(II[BI)I")
	@Override
	public int method7461(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass236_1.method5546(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method7459(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass217_1.method5098(arg1, arg0);
	}

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)V")
	@Override
	public void method7460() {
		try {
			this.aSocket1.close();
		} catch (@Pc(14) IOException local14) {
		}
		this.aClass236_1.method5544();
		this.aClass217_1.method5100();
	}

	@OriginalMember(owner = "client!taa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7460();
	}
}
