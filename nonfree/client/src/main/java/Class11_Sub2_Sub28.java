import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class11_Sub2_Sub28 extends Class11_Sub2 {

	static {
		new Class117("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
	}

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub28() {
		super(3, false);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean427 = arg0.method5185() == 1;
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5709(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass63_41.method1118(arg0);
		if (super.aClass63_41.aBoolean85) {
			@Pc(26) int[] local26 = this.method5710(2, arg0);
			@Pc(32) int[][] local32 = this.method5715(arg0, 0);
			@Pc(38) int[][] local38 = this.method5715(arg0, 1);
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local11[1];
			@Pc(50) int[] local50 = local11[2];
			@Pc(54) int[] local54 = local32[0];
			@Pc(58) int[] local58 = local32[1];
			@Pc(62) int[] local62 = local32[2];
			@Pc(66) int[] local66 = local38[0];
			@Pc(70) int[] local70 = local38[1];
			@Pc(74) int[] local74 = local38[2];
			for (@Pc(76) int local76 = 0; local76 < Static339.anInt6549; local76++) {
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
					@Pc(112) int local112 = 4096 - local82;
					local42[local76] = local54[local76] * local82 + local112 * local66[local76] >> 12;
					local46[local76] = local70[local76] * local112 + local58[local76] * local82 >> 12;
					local50[local76] = local62[local76] * local82 + local112 * local74[local76] >> 12;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(26) int[] local26 = this.method5710(0, arg0);
			@Pc(32) int[] local32 = this.method5710(1, arg0);
			@Pc(38) int[] local38 = this.method5710(2, arg0);
			for (@Pc(40) int local40 = 0; local40 < Static339.anInt6549; local40++) {
				@Pc(46) int local46 = local38[local40];
				if (local46 == 4096) {
					local16[local40] = local26[local40];
				} else if (local46 == 0) {
					local16[local40] = local32[local40];
				} else {
					local16[local40] = local32[local40] * (4096 - local46) + local26[local40] * local46 >> 12;
				}
			}
		}
		return local16;
	}
}
