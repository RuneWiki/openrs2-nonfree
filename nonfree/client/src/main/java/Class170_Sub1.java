import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uba")
public final class Class170_Sub1 extends Class170 {

	@OriginalMember(owner = "client!uba", name = "p", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!uba", name = "h", descriptor = "Lclient!mm;")
	private final Class234 aClass234_1;

	@OriginalMember(owner = "client!uba", name = "i", descriptor = "Lclient!gl;")
	private final Class128 aClass128_1;

	@OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class170_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass234_1 = new Class234(this.aSocket1.getInputStream(), arg1);
		this.aClass128_1 = new Class128(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method8122(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass234_1.method5209(arg0);
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(III[B)V")
	@Override
	public void method8116(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass128_1.method2800(arg0, arg1);
	}

	@OriginalMember(owner = "client!uba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method8119();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
	@Override
	public void method8117() {
		this.aClass234_1.method5211();
		this.aClass128_1.method2799();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
	@Override
	public void method8119() {
		try {
			this.aSocket1.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass234_1.method5207();
		this.aClass128_1.method2801();
	}

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "(IBI[B)I")
	@Override
	public int method8123(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		return this.aClass234_1.method5213(arg0, arg2, arg1);
	}
}
