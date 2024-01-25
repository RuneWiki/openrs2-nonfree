import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public final class Class99_Sub1 extends Class99 {

	@OriginalMember(owner = "client!ss", name = "m", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!ss", name = "j", descriptor = "Lclient!ti;")
	private final Class231 aClass231_1;

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "Lclient!ev;")
	private final Class70 aClass70_1;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class99_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass231_1 = new Class231(this.aSocket2.getInputStream(), arg1);
		this.aClass70_1 = new Class70(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I[BII)I")
	@Override
	public int method4959(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass231_1.method5097(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
	@Override
	public void method4963() {
		try {
			this.aSocket2.close();
		} catch (@Pc(4) IOException local4) {
		}
		this.aClass231_1.method5098();
		this.aClass70_1.method1501();
	}

	@OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
	@Override
	public void method4960() {
		this.aClass231_1.method5099();
		this.aClass70_1.method1498();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method4961(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass231_1.method5095(arg0);
	}

	@OriginalMember(owner = "client!ss", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method4963();
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(III[B)V")
	@Override
	public void method4964(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass70_1.method1499(arg0, arg1);
	}
}
