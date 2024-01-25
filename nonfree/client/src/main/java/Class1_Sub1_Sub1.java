import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "I", descriptor = "I")
	private int anInt53 = 1;

	@OriginalMember(owner = "client!a", name = "L", descriptor = "I")
	private int anInt56 = 1;

	static {
		new Class106("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
		new Class106("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(28) int local28 = this.anInt56 + this.anInt56 + 1;
			@Pc(32) int local32 = 65536 / local28;
			@Pc(40) int local40 = this.anInt53 + this.anInt53 + 1;
			@Pc(44) int local44 = 65536 / local40;
			@Pc(47) int[][][] local47 = new int[local28][][];
			@Pc(71) int local71;
			@Pc(73) int local73;
			for (@Pc(53) int local53 = arg0 - this.anInt56; local53 <= this.anInt56 + arg0; local53++) {
				@Pc(63) int[][] local63 = this.method6006(0, Static279.anInt5435 & local53);
				@Pc(67) int[][] local67 = new int[3][Static85.anInt1910];
				@Pc(69) int local69 = 0;
				local71 = 0;
				local73 = 0;
				@Pc(77) int[] local77 = local63[0];
				@Pc(81) int[] local81 = local63[1];
				@Pc(85) int[] local85 = local63[2];
				for (@Pc(89) int local89 = -this.anInt53; local89 <= this.anInt53; local89++) {
					@Pc(95) int local95 = Static346.anInt6542 & local89;
					local71 += local81[local95];
					local73 += local85[local95];
					local69 += local77[local95];
				}
				@Pc(122) int[] local122 = local67[0];
				@Pc(126) int[] local126 = local67[1];
				@Pc(130) int[] local130 = local67[2];
				@Pc(132) int local132 = 0;
				while (Static85.anInt1910 > local132) {
					local122[local132] = local44 * local69 >> 16;
					local126[local132] = local44 * local71 >> 16;
					local130[local132] = local44 * local73 >> 16;
					@Pc(166) int local166 = local132 - this.anInt53 & Static346.anInt6542;
					local69 -= local77[local166];
					local71 -= local81[local166];
					local132++;
					local73 -= local85[local166];
					@Pc(192) int local192 = Static346.anInt6542 & this.anInt53 + local132;
					local73 += local85[local192];
					local71 += local81[local192];
					local69 += local77[local192];
				}
				local47[this.anInt56 + local53 - arg0] = local67;
			}
			@Pc(238) int[] local238 = local16[0];
			@Pc(242) int[] local242 = local16[1];
			@Pc(246) int[] local246 = local16[2];
			for (local71 = 0; local71 < Static85.anInt1910; local71++) {
				local73 = 0;
				@Pc(254) int local254 = 0;
				@Pc(256) int local256 = 0;
				for (@Pc(258) int local258 = 0; local258 < local28; local258++) {
					@Pc(264) int[][] local264 = local47[local258];
					local256 += local264[2][local71];
					local73 += local264[0][local71];
					local254 += local264[1][local71];
				}
				local238[local71] = local73 * local32 >> 16;
				local242[local71] = local32 * local254 >> 16;
				local246[local71] = local32 * local256 >> 16;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			@Pc(32) int local32 = this.anInt56 + this.anInt56 + 1;
			@Pc(36) int local36 = 65536 / local32;
			@Pc(44) int local44 = this.anInt53 + this.anInt53 + 1;
			@Pc(48) int local48 = 65536 / local44;
			@Pc(51) int[][] local51 = new int[local32][];
			@Pc(73) int local73;
			for (@Pc(56) int local56 = arg0 - this.anInt56; local56 <= this.anInt56 + arg0; local56++) {
				@Pc(68) int[] local68 = this.method6013(Static279.anInt5435 & local56, 0);
				@Pc(71) int[] local71 = new int[Static85.anInt1910];
				local73 = 0;
				for (@Pc(77) int local77 = -this.anInt53; local77 <= this.anInt53; local77++) {
					local73 += local68[local77 & Static346.anInt6542];
				}
				@Pc(98) int local98 = 0;
				while (Static85.anInt1910 > local98) {
					local71[local98] = local48 * local73 >> 16;
					local73 -= local68[local98 - this.anInt53 & Static346.anInt6542];
					local98++;
					local73 += local68[local98 + this.anInt53 & Static346.anInt6542];
				}
				local51[local56 + this.anInt56 - arg0] = local71;
			}
			for (@Pc(154) int local154 = 0; local154 < Static85.anInt1910; local154++) {
				@Pc(158) int local158 = 0;
				for (local73 = 0; local73 < local32; local73++) {
					local158 += local51[local73][local154];
				}
				local20[local154] = local158 * local36 >> 16;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt53 = arg1.method2132();
		} else if (arg0 == 1) {
			this.anInt56 = arg1.method2132();
		} else if (arg0 == 2) {
			super.aBoolean509 = arg1.method2132() == 1;
		}
	}
}
