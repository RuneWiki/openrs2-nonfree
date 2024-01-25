import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class165_Sub1 extends Class165 {

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "Lclient!ti;")
	private final Class326 aClass326_1;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "Lclient!db;")
	private final Class62 aClass62_1;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class165_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass326_1 = new Class326(this.aSocket1.getInputStream(), arg1);
		this.aClass62_1 = new Class62(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	@Override
	public void method3977() {
		try {
			this.aSocket1.close();
		} catch (@Pc(11) IOException local11) {
		}
		this.aClass326_1.method6868();
		this.aClass62_1.method1675();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IB[BI)I")
	@Override
	public int method3976(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass326_1.method6865(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V")
	@Override
	public void method3981() {
		this.aClass326_1.method6870();
		this.aClass62_1.method1676();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method3982(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass326_1.method6866(arg0);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[B)V")
	@Override
	public void method3975(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass62_1.method1673(arg1, arg0);
	}

	@OriginalMember(owner = "client!jr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method3977();
	}
}
