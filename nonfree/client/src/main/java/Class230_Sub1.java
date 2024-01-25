import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public final class Class230_Sub1 extends Class230 {

	@OriginalMember(owner = "client!nfa", name = "h", descriptor = "Ljava/net/Socket;")
	private final Socket aSocket1;

	@OriginalMember(owner = "client!nfa", name = "k", descriptor = "Lclient!pda;")
	private final Class258 aClass258_1;

	@OriginalMember(owner = "client!nfa", name = "i", descriptor = "Lclient!wca;")
	private final Class368 aClass368_1;

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
	public Class230_Sub1(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1) throws IOException {
		this.aSocket1 = arg0;
		this.aSocket1.setSoTimeout(30000);
		this.aSocket1.setTcpNoDelay(true);
		this.aClass258_1 = new Class258(this.aSocket1.getInputStream(), arg1);
		this.aClass368_1 = new Class368(this.aSocket1.getOutputStream(), arg1);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V")
	@Override
	public void method6027() {
		this.aClass258_1.method6662();
		this.aClass368_1.method8589();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z[BII)I")
	@Override
	public int method6029(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		return this.aClass258_1.method6663(arg1, arg2, arg0);
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method6031(@OriginalArg(0) int arg0) throws IOException {
		return this.aClass258_1.method6664(arg0);
	}

	@OriginalMember(owner = "client!nfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		this.method6028();
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "([BIII)V")
	@Override
	public void method6030(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		this.aClass368_1.method8586(arg0, arg1);
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(Z)V")
	@Override
	public void method6028() {
		try {
			this.aSocket1.close();
		} catch (@Pc(13) IOException local13) {
		}
		this.aClass258_1.method6661();
		this.aClass368_1.method8588();
	}
}
