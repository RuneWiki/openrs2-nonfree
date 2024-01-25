import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class1_Sub2_Sub29 extends Class1_Sub2 {

	@OriginalMember(owner = "client!oo", name = "H", descriptor = "I")
	private int anInt4464 = 1;

	@OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
	private int anInt4470 = 1;

	static {
		new Class169("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub29() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(23) int local23 = this.anInt4470 + this.anInt4470 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(35) int local35 = this.anInt4464 + this.anInt4464 + 1;
			@Pc(39) int local39 = 65536 / local35;
			@Pc(42) int[][][] local42 = new int[local23][][];
			@Pc(65) int local65;
			@Pc(67) int local67;
			for (@Pc(47) int local47 = arg0 - this.anInt4470; local47 <= arg0 + this.anInt4470; local47++) {
				@Pc(57) int[][] local57 = this.method5514(local47 & Static13.anInt189, 0);
				@Pc(61) int[][] local61 = new int[3][Static158.anInt2658];
				@Pc(63) int local63 = 0;
				local65 = 0;
				local67 = 0;
				@Pc(71) int[] local71 = local57[0];
				@Pc(75) int[] local75 = local57[1];
				@Pc(79) int[] local79 = local57[2];
				for (@Pc(83) int local83 = -this.anInt4464; local83 <= this.anInt4464; local83++) {
					@Pc(89) int local89 = Static271.anInt4721 & local83;
					local65 += local75[local89];
					local67 += local79[local89];
					local63 += local71[local89];
				}
				@Pc(120) int[] local120 = local61[0];
				@Pc(124) int[] local124 = local61[1];
				@Pc(128) int[] local128 = local61[2];
				@Pc(130) int local130 = 0;
				while (Static158.anInt2658 > local130) {
					local120[local130] = local63 * local39 >> 16;
					local124[local130] = local39 * local65 >> 16;
					local128[local130] = local67 * local39 >> 16;
					@Pc(164) int local164 = local130 - this.anInt4464 & Static271.anInt4721;
					local130++;
					local65 -= local75[local164];
					local67 -= local79[local164];
					local63 -= local71[local164];
					@Pc(190) int local190 = local130 + this.anInt4464 & Static271.anInt4721;
					local67 += local79[local190];
					local63 += local71[local190];
					local65 += local75[local190];
				}
				local42[this.anInt4470 + local47 - arg0] = local61;
			}
			@Pc(241) int[] local241 = local11[0];
			@Pc(245) int[] local245 = local11[1];
			@Pc(249) int[] local249 = local11[2];
			for (local65 = 0; local65 < Static158.anInt2658; local65++) {
				local67 = 0;
				@Pc(257) int local257 = 0;
				@Pc(259) int local259 = 0;
				for (@Pc(261) int local261 = 0; local261 < local23; local261++) {
					@Pc(267) int[][] local267 = local42[local261];
					local257 += local267[1][local65];
					local259 += local267[2][local65];
					local67 += local267[0][local65];
				}
				local241[local65] = local67 * local27 >> 16;
				local245[local65] = local27 * local257 >> 16;
				local249[local65] = local259 * local27 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt4464 = arg1.method5174();
		} else if (arg0 == 1) {
			this.anInt4470 = arg1.method5174();
		} else if (arg0 == 2) {
			super.aBoolean586 = arg1.method5174() == 1;
		}
	}

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass74_41.method1354(arg0);
		if (super.aClass74_41.aBoolean145) {
			@Pc(30) int local30 = this.anInt4470 + this.anInt4470 + 1;
			@Pc(34) int local34 = 65536 / local30;
			@Pc(43) int local43 = this.anInt4464 + this.anInt4464 + 1;
			@Pc(47) int local47 = 65536 / local43;
			@Pc(50) int[][] local50 = new int[local30][];
			@Pc(71) int local71;
			for (@Pc(56) int local56 = arg0 - this.anInt4470; local56 <= arg0 + this.anInt4470; local56++) {
				@Pc(66) int[] local66 = this.method5510(local56 & Static13.anInt189, 0);
				@Pc(69) int[] local69 = new int[Static158.anInt2658];
				local71 = 0;
				for (@Pc(75) int local75 = -this.anInt4464; local75 <= this.anInt4464; local75++) {
					local71 += local66[Static271.anInt4721 & local75];
				}
				@Pc(96) int local96 = 0;
				while (Static158.anInt2658 > local96) {
					local69[local96] = local71 * local47 >> 16;
					local71 -= local66[Static271.anInt4721 & local96 - this.anInt4464];
					local96++;
					local71 += local66[Static271.anInt4721 & local96 + this.anInt4464];
				}
				local50[this.anInt4470 + local56 - arg0] = local69;
			}
			for (@Pc(153) int local153 = 0; local153 < Static158.anInt2658; local153++) {
				@Pc(157) int local157 = 0;
				for (local71 = 0; local71 < local30; local71++) {
					local157 += local50[local71][local153];
				}
				local18[local153] = local34 * local157 >> 16;
			}
		}
		return local18;
	}
}
