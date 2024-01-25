import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class124_Sub1 extends Class124 {

	@OriginalMember(owner = "client!gh", name = "r", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "Lclient!le;")
	private final Class204 aClass204_1;

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "Lclient!jv;")
	private final Class185 aClass185_1;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class124_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass204_1 = new Class204(this.aSocket1.getInputStream(), arg1);
		this.aClass185_1 = new Class185(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V")
	@Override
	public void method2255() {
		this.aClass204_1.method4348();
		this.aClass185_1.method3675();
	}

	@OriginalMember(owner = "client!gh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2256();
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(B)V")
	@Override
	public void method2256() {
		try {
			this.aSocket1.close();
		} catch (@Pc(16) IOException local16) {
		}
		this.aClass204_1.method4349();
		this.aClass185_1.method3676();
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2253(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass204_1.method4351(arg0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZI[BI)I")
	@Override
	public int method2250(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass204_1.method4353(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ZII[B)V")
	@Override
	public void method2257(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass185_1.method3673(arg0, arg1);
	}
}
