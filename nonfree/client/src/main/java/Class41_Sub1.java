import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "Lclient!id;")
	private final Class131 aClass131_1;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!pu;")
	private final Class237 aClass237_1;

	static {
		new Class67("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class41_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass131_1 = new Class131(this.aSocket1.getInputStream(), arg1);
		this.aClass237_1 = new Class237(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method1065(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		this.aClass237_1.method5925(arg0, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1071(@OriginalArg(1) int arg0) throws IOException {
		return this.aClass131_1.method3747(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method1066();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II[BI)I")
	@Override
	public int method1068(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass131_1.method3744(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	@Override
	public void method1066() {
		try {
			this.aSocket1.close();
		} catch (@Pc(12) IOException local12) {
		}
		this.aClass131_1.method3749();
		this.aClass237_1.method5926();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	@Override
	public void method1067() {
		this.aClass131_1.method3748();
		this.aClass237_1.method5927();
	}
}
