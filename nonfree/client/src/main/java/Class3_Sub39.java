import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public abstract class Class3_Sub39 extends Class3 {

	@OriginalMember(owner = "client!wo", name = "x", descriptor = "[I")
	public static final int[] anIntArray359;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "Z")
	public boolean aBoolean415;

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "Lclient!nq;")
	protected final Class167_Sub1 aClass167_Sub1_35;

	static {
		new Class174("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
		anIntArray359 = new int[4096];
		for (@Pc(16) int local16 = 0; local16 < 4096; local16++) {
			anIntArray359[local16] = Static307.method4644(local16);
		}
	}

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!nq;)V")
	public Class3_Sub39(@OriginalArg(0) Class167_Sub1 arg0) {
		this.aClass167_Sub1_35 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Z")
	public final boolean method4913() {
		return this.aBoolean415;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)Z")
	public abstract boolean method4915();

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)Z")
	public abstract boolean method4916();

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V")
	public abstract void method4917(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!wv;Lclient!wv;I)V")
	public abstract void method4918(@OriginalArg(1) Class137_Sub1 arg0, @OriginalArg(2) Class137_Sub1 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(III)V")
	public abstract void method4920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wo", name = "i", descriptor = "(I)V")
	public abstract void method4924();

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)Z")
	public final boolean method4925() {
		return false;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)I")
	public final int method4926() {
		return 1;
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)I")
	public int method4927() {
		return 0;
	}
}
