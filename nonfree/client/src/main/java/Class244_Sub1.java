import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class244_Sub1 extends Class244 {

	@OriginalMember(owner = "client!nca", name = "j", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "Lclient!kb;")
	private final Class188 aClass188_1;

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "Lclient!fb;")
	private final Class113 aClass113_1;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class244_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass188_1 = new Class188(this.aSocket1.getInputStream(), arg1);
		this.aClass113_1 = new Class113(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IB)Z")
	@Override
	public boolean method5750(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass188_1.method4803(arg0);
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)V")
	@Override
	public void method5751() {
		this.aClass188_1.method4802();
		this.aClass113_1.method2790();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "([BIII)V")
	@Override
	public void method5752(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		this.aClass113_1.method2793(arg1, arg0);
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IB[BI)I")
	@Override
	public int method5754(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass188_1.method4805(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!nca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5753();
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(I)V")
	@Override
	public void method5753() {
		try {
			this.aSocket1.close();
		} catch (@Pc(8) IOException local8) {
		}
		this.aClass188_1.method4801();
		this.aClass113_1.method2794();
	}
}
