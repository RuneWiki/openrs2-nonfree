import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "Lclient!it;")
	private final Class156 aClass156_1;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "Lclient!taa;")
	private final Class310 aClass310_1;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class36_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass156_1 = new Class156(this.aSocket1.getInputStream(), arg1);
		this.aClass310_1 = new Class310(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)V")
	@Override
	public void method1992() {
		try {
			this.aSocket1.close();
		} catch (@Pc(12) IOException local12) {
		}
		this.aClass156_1.method3713();
		this.aClass310_1.method7169();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)V")
	@Override
	public void method1993() {
		this.aClass156_1.method3714();
		this.aClass310_1.method7170();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(III[B)I")
	@Override
	public int method1995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		return this.aClass156_1.method3715(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!dv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1992();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1994(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass156_1.method3716(arg0);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "([BIIB)V")
	@Override
	public void method1991(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		this.aClass310_1.method7168(arg0, arg1);
	}
}
