import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kw")
public final class Class197_Sub1 extends Class197 {

	@OriginalMember(owner = "client!kw", name = "q", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!kw", name = "k", descriptor = "Lclient!dk;")
	private final Class72 aClass72_1;

	@OriginalMember(owner = "client!kw", name = "n", descriptor = "Lclient!jq;")
	private final Class181 aClass181_1;

	@OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class197_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass72_1 = new Class72(this.aSocket1.getInputStream(), arg1);
		this.aClass181_1 = new Class181(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIB[B)V")
	@Override
	public void method5190(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		this.aClass181_1.method4542(arg0, arg1);
	}

	@OriginalMember(owner = "client!kw", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method5188();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method5195(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass72_1.method1719(arg0);
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V")
	@Override
	public void method5193() {
		this.aClass72_1.method1720();
		this.aClass181_1.method4544();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)V")
	@Override
	public void method5188() {
		try {
			this.aSocket1.close();
		} catch (@Pc(16) IOException local16) {
		}
		this.aClass72_1.method1715();
		this.aClass181_1.method4543();
	}

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "([BIIB)I")
	@Override
	public int method5194(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		return this.aClass72_1.method1718(arg1, arg0, arg2);
	}
}
