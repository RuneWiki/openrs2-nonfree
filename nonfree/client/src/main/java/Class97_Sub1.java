import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class97_Sub1 extends Class97 {

	@OriginalMember(owner = "client!er", name = "o", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!er", name = "j", descriptor = "Lclient!jn;")
	private final Class186 aClass186_1;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "Lclient!qu;")
	private final Class291 aClass291_1;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class97_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass186_1 = new Class186(this.aSocket1.getInputStream(), arg1);
		this.aClass291_1 = new Class291(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method2290(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass186_1.method4069(arg0);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B[BII)V")
	@Override
	public void method2289(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass291_1.method7320(arg1, arg0);
	}

	@OriginalMember(owner = "client!er", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method2286();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II[BI)I")
	@Override
	public int method2294(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass186_1.method4073(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V")
	@Override
	public void method2293() {
		this.aClass186_1.method4067();
		this.aClass291_1.method7321();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	@Override
	public void method2286() {
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass186_1.method4070();
		this.aClass291_1.method7318();
	}
}
