import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class160_Sub1 extends Class160 {

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "Lclient!sia;")
	private final Class325 aClass325_1;

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "Lclient!nj;")
	private final Class248 aClass248_1;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class160_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass325_1 = new Class325(this.aSocket2.getInputStream(), arg1);
		this.aClass248_1 = new Class248(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
	@Override
	public void method3506() {
		try {
			this.aSocket2.close();
		} catch (@Pc(16) IOException local16) {
		}
		this.aClass325_1.method7555();
		this.aClass248_1.method5729();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB[BI)I")
	@Override
	public int method3511(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass325_1.method7553(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!hj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3506();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method3510(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass325_1.method7552(arg0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	@Override
	public void method3505() {
		this.aClass325_1.method7557();
		this.aClass248_1.method5730();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method3508(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass248_1.method5732(arg0, arg1);
	}
}
