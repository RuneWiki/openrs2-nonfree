import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class3_Sub1_Sub23 extends Class3_Sub1 {

	static {
		new Class57("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
	}

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub23() {
		super(3, false);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean487 = arg0.method2739() == 1;
		}
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(26) int[] local26 = this.method5547(arg0, 0);
			@Pc(32) int[] local32 = this.method5547(arg0, 1);
			@Pc(38) int[] local38 = this.method5547(arg0, 2);
			for (@Pc(40) int local40 = 0; local40 < Static238.anInt4221; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local11[local40] = local26[local40];
				} else if (local46 == 0) {
					local11[local40] = local32[local40];
				} else {
					local11[local40] = (4096 - local46) * local32[local40] + local26[local40] * local46 >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(26) int[] local26 = this.method5547(arg0, 2);
			@Pc(32) int[][] local32 = this.method5551(0, arg0);
			@Pc(38) int[][] local38 = this.method5551(1, arg0);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static238.anInt4221; local76++) {
				@Pc(82) int local82 = local26[local76];
				if (local82 == 4096) {
					local42[local76] = local54[local76];
					local46[local76] = local58[local76];
					local50[local76] = local62[local76];
				} else if (local82 == 0) {
					local42[local76] = local66[local76];
					local46[local76] = local70[local76];
					local50[local76] = local74[local76];
				} else {
					@Pc(117) int local117 = 4096 - local82;
					local42[local76] = local66[local76] * local117 + local54[local76] * local82 >> 12;
					local46[local76] = local82 * local58[local76] + local70[local76] * local117 >> 12;
					local50[local76] = local117 * local74[local76] + local82 * local62[local76] >> 12;
				}
			}
		}
		return local11;
	}
}
