import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class5_Sub3_Sub7 extends Class5_Sub3 {

	@OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
	private int anInt1407;

	@OriginalMember(owner = "client!ei", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ei", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!ei", name = "gb", descriptor = "[I")
	private int[] anIntArray113;

	@OriginalMember(owner = "client!ei", name = "jb", descriptor = "I")
	private int anInt1424;

	@OriginalMember(owner = "client!ei", name = "kb", descriptor = "I")
	private int anInt1425;

	@OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
	private int anInt1411 = 1024;

	@OriginalMember(owner = "client!ei", name = "W", descriptor = "I")
	private int anInt1414 = 0;

	@OriginalMember(owner = "client!ei", name = "bb", descriptor = "I")
	private int anInt1418 = 204;

	@OriginalMember(owner = "client!ei", name = "db", descriptor = "I")
	private int anInt1420 = 1024;

	@OriginalMember(owner = "client!ei", name = "eb", descriptor = "I")
	private int anInt1421 = 4;

	@OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
	private int anInt1416 = 8;

	@OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
	private int anInt1417 = 409;

	@OriginalMember(owner = "client!ei", name = "hb", descriptor = "I")
	private int anInt1423 = 81;

	static {
		new Class85("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
	}

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method6011(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass188_41.method5318(arg0);
		if (super.aClass188_41.aBoolean490) {
			@Pc(25) int local25 = 0;
			@Pc(33) int local33;
			for (local33 = Static345.anIntArray627[arg0] + this.anInt1414; local33 < 0; local33 += 4096) {
			}
			while (local33 > 4096) {
				local33 -= 4096;
			}
			while (this.anInt1416 > local25 && local33 >= this.anIntArray113[local25]) {
				local25++;
			}
			@Pc(64) int local64 = local25 - 1;
			@Pc(72) boolean local72 = (local25 & 0x1) == 0;
			@Pc(77) int local77 = this.anIntArray113[local25];
			@Pc(84) int local84 = this.anIntArray113[local25 - 1];
			if (local33 > this.anInt1425 + local84 && local77 - this.anInt1425 > local33) {
				for (@Pc(114) int local114 = 0; local114 < Static7.anInt129; local114++) {
					@Pc(125) int local125 = local72 ? this.anInt1411 : -this.anInt1411;
					@Pc(127) int local127 = 0;
					@Pc(139) int local139;
					for (local139 = Static164.anIntArray337[local114] + (this.anInt1407 * local125 >> 12); local139 < 0; local139 += 4096) {
					}
					while (local139 > 4096) {
						local139 -= 4096;
					}
					while (this.anInt1421 > local127 && local139 >= this.anIntArrayArray27[local64][local127]) {
						local127++;
					}
					@Pc(169) int local169 = local127 - 1;
					@Pc(176) int local176 = this.anIntArrayArray27[local64][local169];
					@Pc(183) int local183 = this.anIntArrayArray27[local64][local127];
					if (local176 + this.anInt1425 < local139 && local139 < local183 - this.anInt1425) {
						local19[local114] = this.anIntArrayArray26[local64][local169];
					} else {
						local19[local114] = 0;
					}
				}
			} else {
				Static368.method5428(local19, 0, Static7.anInt129, 0);
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!rg;BI)V")
	@Override
	public void method6017(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1421 = arg0.method5115();
		} else if (arg1 == 1) {
			this.anInt1416 = arg0.method5115();
		} else if (arg1 == 2) {
			this.anInt1417 = arg0.method5106();
		} else if (arg1 == 3) {
			this.anInt1418 = arg0.method5106();
		} else if (arg1 == 4) {
			this.anInt1411 = arg0.method5106();
		} else if (arg1 == 5) {
			this.anInt1414 = arg0.method5106();
		} else if (arg1 == 6) {
			this.anInt1423 = arg0.method5106();
		} else if (arg1 == 7) {
			this.anInt1420 = arg0.method5106();
		}
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)V")
	private void method1355() {
		@Pc(12) Random local12 = new Random((long) this.anInt1416);
		this.anInt1425 = this.anInt1423 / 2;
		this.anInt1424 = 4096 / this.anInt1416;
		this.anInt1407 = 4096 / this.anInt1421;
		@Pc(35) int local35 = this.anInt1407 / 2;
		this.anIntArray113 = new int[this.anInt1416 + 1];
		this.anIntArrayArray26 = new int[this.anInt1416][this.anInt1421];
		this.anIntArrayArray27 = new int[this.anInt1416][this.anInt1421 + 1];
		@Pc(71) int local71 = this.anInt1424 / 2;
		this.anIntArray113[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt1416; local78++) {
			@Pc(88) int local88;
			@Pc(100) int local100;
			if (local78 > 0) {
				local88 = this.anInt1424;
				local100 = (Static329.method5695(local12, 4096) - 2048) * this.anInt1418 >> 12;
				@Pc(108) int local108 = local88 + (local71 * local100 >> 12);
				this.anIntArray113[local78] = this.anIntArray113[local78 - 1] + local108;
			}
			this.anIntArrayArray27[local78][0] = 0;
			for (local88 = 0; local88 < this.anInt1421; local88++) {
				if (local88 > 0) {
					local100 = this.anInt1407;
					@Pc(152) int local152 = (Static329.method5695(local12, 4096) - 2048) * this.anInt1417 >> 12;
					local100 += local152 * local35 >> 12;
					this.anIntArrayArray27[local78][local88] = this.anIntArrayArray27[local78][local88 - 1] + local100;
				}
				this.anIntArrayArray26[local78][local88] = this.anInt1420 > 0 ? 4096 - Static329.method5695(local12, this.anInt1420) : 4096;
			}
			this.anIntArrayArray27[local78][this.anInt1421] = 4096;
		}
		this.anIntArray113[this.anInt1416] = 4096;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
	@Override
	public void method6010() {
		this.method1355();
	}
}
