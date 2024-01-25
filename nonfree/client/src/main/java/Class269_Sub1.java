import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pi")
public final class Class269_Sub1 extends Class269 {

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!qh;")
	private final Class285 aClass285_1;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "Lclient!fq;")
	private final Class108 aClass108_1;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class269_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass285_1 = new Class285(this.aSocket1.getInputStream(), arg1);
		this.aClass108_1 = new Class108(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III[B)V")
	@Override
	public void method6698(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass108_1.method3154(arg1, arg0);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6699(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass285_1.method7053(arg0);
	}

	@OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6697();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	@Override
	public void method6697() {
		try {
			this.aSocket1.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass285_1.method7050();
		this.aClass108_1.method3153();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II[BI)I")
	@Override
	public int method6702(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass285_1.method7055(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	@Override
	public void method6700() {
		this.aClass285_1.method7049();
		this.aClass108_1.method3155();
	}
}
