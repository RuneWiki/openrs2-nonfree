import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class255_Sub1 extends Class255 {

	@OriginalMember(owner = "client!ni", name = "h", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "Lclient!rf;")
	private final Class317 aClass317_1;

	@OriginalMember(owner = "client!ni", name = "j", descriptor = "Lclient!wc;")
	private final Class395 aClass395_1;

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class255_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass317_1 = new Class317(this.aSocket1.getInputStream(), arg1);
		this.aClass395_1 = new Class395(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method6259(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		this.aClass395_1.method9175(arg0, arg1);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
	@Override
	public void method6265() {
		try {
			this.aSocket1.close();
		} catch (@Pc(12) IOException local12) {
		}
		this.aClass317_1.method7738();
		this.aClass395_1.method9173();
	}

	@OriginalMember(owner = "client!ni", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6265();
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(I[BII)I")
	@Override
	public int method6260(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass317_1.method7739(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method6264(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass317_1.method7737(arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
	@Override
	public void method6263() {
		this.aClass317_1.method7736();
		this.aClass395_1.method9172();
	}
}
