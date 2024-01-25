import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public abstract class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
	public int anInt7254;

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "Lclient!ls;")
	protected Class154 aClass154_41;

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "Lclient!ug;")
	protected Class239 aClass239_41;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "Z")
	public boolean aBoolean486;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "[Lclient!ub;")
	public final Class5_Sub1[] aClass5_Sub1Array42;

	static {
		new Class198("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(IZ)V")
	protected Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean486 = arg1;
		this.aClass5_Sub1Array42 = new Class5_Sub1[arg0];
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
	public void method5762() {
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)[[I")
	public int[][] method5763(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZII)[[I")
	protected final int[][] method5764(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass5_Sub1Array42[arg0].aBoolean486) {
			@Pc(22) int[] local22 = this.aClass5_Sub1Array42[arg0].method5770(arg1);
			return new int[][] { local22, local22, local22 };
		} else {
			return this.aClass5_Sub1Array42[arg0].method5763(arg1);
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)I")
	public int method5766() {
		return -1;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BII)V")
	public void method5767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt7254 == 255 ? arg0 : this.anInt7254;
		if (this.aBoolean486) {
			this.aClass239_41 = new Class239(local14, arg0, arg1);
		} else {
			this.aClass154_41 = new Class154(local14, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V")
	public void method5768() {
		if (this.aBoolean486) {
			this.aClass239_41.method5401();
			this.aClass239_41 = null;
		} else {
			this.aClass154_41.method3173();
			this.aClass154_41 = null;
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)I")
	public int method5769() {
		return -1;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I")
	public int[] method5770(@OriginalArg(0) int arg0) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILclient!fh;B)V")
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)[I")
	protected final int[] method5772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.aClass5_Sub1Array42[arg0].aBoolean486 ? this.aClass5_Sub1Array42[arg0].method5770(arg1) : this.aClass5_Sub1Array42[arg0].method5763(arg1)[0];
	}
}
