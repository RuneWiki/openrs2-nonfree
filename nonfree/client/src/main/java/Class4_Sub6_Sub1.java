import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class4_Sub6_Sub1 extends Class4_Sub6 {

	@OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
	private int anInt584;

	@OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
	private int anInt586;

	@OriginalMember(owner = "client!bj", name = "G", descriptor = "I")
	private int anInt588;

	static {
		new Class83("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(I)V")
	private Class4_Sub6_Sub1(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method620(arg0);
	}

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub1() {
		this(0);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILclient!iv;)V")
	@Override
	public void method5518(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 0) {
			this.method620(arg1.method2493());
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5514(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass153_41.method3679(arg0);
		if (super.aClass153_41.aBoolean437) {
			@Pc(24) int[] local24 = local11[0];
			@Pc(28) int[] local28 = local11[1];
			@Pc(32) int[] local32 = local11[2];
			for (@Pc(34) int local34 = 0; local34 < Static80.anInt1616; local34++) {
				local24[local34] = this.anInt584;
				local28[local34] = this.anInt588;
				local32[local34] = this.anInt586;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)V")
	private void method620(@OriginalArg(0) int arg0) {
		this.anInt588 = arg0 >> 4 & 0xFF0;
		this.anInt584 = arg0 >> 12 & 0xFF0;
		this.anInt586 = (arg0 & 0xFF) << 4;
	}
}
