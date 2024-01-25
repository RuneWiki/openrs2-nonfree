import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class295_Sub1 extends Class295 {

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket2;

	@OriginalMember(owner = "client!ql", name = "o", descriptor = "Lclient!bea;")
	private final Class35 aClass35_1;

	@OriginalMember(owner = "client!ql", name = "m", descriptor = "Lclient!pw;")
	private final Class284 aClass284_1;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class295_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket2 = arg0;
		this.aSocket2.setSoTimeout(30000);
		this.aSocket2.setTcpNoDelay(true);
		this.aClass35_1 = new Class35(this.aSocket2.getInputStream(), arg1);
		this.aClass284_1 = new Class284(this.aSocket2.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III[B)I")
	@Override
	public int method7020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		return this.aClass35_1.method689(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I[BII)V")
	@Override
	public void method7026(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		this.aClass284_1.method6795(arg1, arg0);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(B)V")
	@Override
	public void method7019() {
		this.aClass35_1.method683();
		this.aClass284_1.method6790();
	}

	@OriginalMember(owner = "client!ql", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method7023();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
	@Override
	public void method7023() {
		try {
			this.aSocket2.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass35_1.method686();
		this.aClass284_1.method6793();
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7021(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass35_1.method685(arg0);
	}
}
