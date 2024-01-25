import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class2_Sub1_Sub6 extends Class2_Sub1 {

	@OriginalMember(owner = "client!em", name = "L", descriptor = "I")
	private int anInt1868 = 1;

	@OriginalMember(owner = "client!em", name = "N", descriptor = "I")
	private int anInt1870 = 1;

	static {
		new Class62("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6060(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass26_41.method350(arg0);
		if (super.aClass26_41.aBoolean41) {
			@Pc(23) int local23 = this.anInt1868 + this.anInt1868 + 1;
			@Pc(27) int local27 = 65536 / local23;
			@Pc(36) int local36 = this.anInt1870 + this.anInt1870 + 1;
			@Pc(40) int local40 = 65536 / local36;
			@Pc(43) int[][][] local43 = new int[local23][][];
			@Pc(66) int local66;
			@Pc(68) int local68;
			for (@Pc(48) int local48 = arg0 - this.anInt1868; local48 <= arg0 + this.anInt1868; local48++) {
				@Pc(58) int[][] local58 = this.method6061(0, Static67.anInt1510 & local48);
				@Pc(62) int[][] local62 = new int[3][Static391.anInt7118];
				@Pc(64) int local64 = 0;
				local66 = 0;
				local68 = 0;
				@Pc(72) int[] local72 = local58[0];
				@Pc(76) int[] local76 = local58[1];
				@Pc(80) int[] local80 = local58[2];
				for (@Pc(84) int local84 = -this.anInt1870; local84 <= this.anInt1870; local84++) {
					@Pc(90) int local90 = local84 & Static235.anInt4676;
					local66 += local76[local90];
					local64 += local72[local90];
					local68 += local80[local90];
				}
				@Pc(121) int[] local121 = local62[0];
				@Pc(125) int[] local125 = local62[1];
				@Pc(129) int[] local129 = local62[2];
				@Pc(131) int local131 = 0;
				while (local131 < Static391.anInt7118) {
					local121[local131] = local64 * local40 >> 16;
					local125[local131] = local66 * local40 >> 16;
					local129[local131] = local68 * local40 >> 16;
					@Pc(164) int local164 = Static235.anInt4676 & local131 - this.anInt1870;
					local66 -= local76[local164];
					local68 -= local80[local164];
					local131++;
					local64 -= local72[local164];
					@Pc(190) int local190 = Static235.anInt4676 & this.anInt1870 + local131;
					local66 += local76[local190];
					local64 += local72[local190];
					local68 += local80[local190];
				}
				local43[this.anInt1868 + local48 - arg0] = local62;
			}
			@Pc(232) int[] local232 = local11[0];
			@Pc(236) int[] local236 = local11[1];
			@Pc(240) int[] local240 = local11[2];
			for (local66 = 0; local66 < Static391.anInt7118; local66++) {
				local68 = 0;
				@Pc(248) int local248 = 0;
				@Pc(250) int local250 = 0;
				for (@Pc(252) int local252 = 0; local252 < local23; local252++) {
					@Pc(258) int[][] local258 = local43[local252];
					local68 += local258[0][local66];
					local248 += local258[1][local66];
					local250 += local258[2][local66];
				}
				local232[local66] = local68 * local27 >> 16;
				local236[local66] = local27 * local248 >> 16;
				local240[local66] = local27 * local250 >> 16;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt1870 = arg1.method5732();
		} else if (arg0 == 1) {
			this.anInt1868 = arg1.method5732();
		} else if (arg0 == 2) {
			super.aBoolean498 = arg1.method5732() == 1;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(29) int local29 = this.anInt1868 + this.anInt1868 + 1;
			@Pc(33) int local33 = 65536 / local29;
			@Pc(41) int local41 = this.anInt1870 + this.anInt1870 + 1;
			@Pc(45) int local45 = 65536 / local41;
			@Pc(48) int[][] local48 = new int[local29][];
			@Pc(69) int local69;
			for (@Pc(54) int local54 = arg0 - this.anInt1868; local54 <= arg0 + this.anInt1868; local54++) {
				@Pc(64) int[] local64 = this.method6069(0, local54 & Static67.anInt1510);
				@Pc(67) int[] local67 = new int[Static391.anInt7118];
				local69 = 0;
				for (@Pc(73) int local73 = -this.anInt1870; local73 <= this.anInt1870; local73++) {
					local69 += local64[local73 & Static235.anInt4676];
				}
				@Pc(94) int local94 = 0;
				while (Static391.anInt7118 > local94) {
					local67[local94] = local69 * local45 >> 16;
					local69 -= local64[Static235.anInt4676 & local94 - this.anInt1870];
					local94++;
					local69 += local64[Static235.anInt4676 & local94 + this.anInt1870];
				}
				local48[this.anInt1868 + local54 - arg0] = local67;
			}
			for (@Pc(155) int local155 = 0; local155 < Static391.anInt7118; local155++) {
				@Pc(159) int local159 = 0;
				for (local69 = 0; local69 < local29; local69++) {
					local159 += local48[local69][local155];
				}
				local16[local155] = local159 * local33 >> 16;
			}
		}
		return local16;
	}
}
