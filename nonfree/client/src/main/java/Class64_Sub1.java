import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!db", name = "k", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Lclient!kf;")
	private final Class180 aClass180_1;

	@OriginalMember(owner = "client!db", name = "l", descriptor = "Lclient!l;")
	private final Class191 aClass191_1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class64_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass180_1 = new Class180(this.aSocket1.getInputStream(), arg1);
		this.aClass191_1 = new Class191(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!db", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1812();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "([BIII)I")
	@Override
	public int method1813(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass180_1.method4571(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(III[B)V")
	@Override
	public void method1819(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass191_1.method4690(arg1, arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	@Override
	public void method1812() {
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass180_1.method4570();
		this.aClass191_1.method4687();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1820(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass180_1.method4566(arg0);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	@Override
	public void method1816() {
		this.aClass180_1.method4567();
		this.aClass191_1.method4689();
	}
}
