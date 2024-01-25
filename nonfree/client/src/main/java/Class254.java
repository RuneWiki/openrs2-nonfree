import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class254 implements Interface2 {

	@OriginalMember(owner = "client!og", name = "c", descriptor = "Lclient!pw;")
	private final Class280 aClass280_4 = new Class280(256);

	@OriginalMember(owner = "client!og", name = "m", descriptor = "Lclient!nd;")
	private final Class238 aClass238_185;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "Lclient!nd;")
	private final Class238 aClass238_186;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "I")
	private final int anInt6904;

	@OriginalMember(owner = "client!og", name = "b", descriptor = "[Lclient!pga;")
	private final Class271[] aClass271Array1;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!nd;Lclient!nd;Lclient!nd;)V")
	public Class254(@OriginalArg(0) Class238 arg0, @OriginalArg(1) Class238 arg1, @OriginalArg(2) Class238 arg2) {
		this.aClass238_185 = arg1;
		this.aClass238_186 = arg2;
		@Pc(24) Class2_Sub17 local24 = new Class2_Sub17(arg0.method5567(0, 0));
		this.anInt6904 = local24.method2825();
		this.aClass271Array1 = new Class271[this.anInt6904];
		for (@Pc(36) int local36 = 0; local36 < this.anInt6904; local36++) {
			if (local24.method2859() == 1) {
				this.aClass271Array1[local36] = new Class271();
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anInt6904; local59++) {
			if (this.aClass271Array1[local59] != null) {
				this.aClass271Array1[local59].aBoolean514 = local24.method2859() == 0;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < this.anInt6904; local92++) {
			if (this.aClass271Array1[local92] != null) {
				this.aClass271Array1[local92].aBoolean516 = local24.method2859() == 1;
			}
		}
		for (@Pc(125) int local125 = 0; local125 < this.anInt6904; local125++) {
			if (this.aClass271Array1[local125] != null) {
				this.aClass271Array1[local125].aBoolean515 = local24.method2859() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < this.anInt6904; local152++) {
			if (this.aClass271Array1[local152] != null) {
				this.aClass271Array1[local152].aByte91 = local24.method2860();
			}
		}
		for (@Pc(174) int local174 = 0; local174 < this.anInt6904; local174++) {
			if (this.aClass271Array1[local174] != null) {
				this.aClass271Array1[local174].aByte92 = local24.method2860();
			}
		}
		for (@Pc(196) int local196 = 0; local196 < this.anInt6904; local196++) {
			if (this.aClass271Array1[local196] != null) {
				this.aClass271Array1[local196].aByte94 = local24.method2860();
			}
		}
		for (@Pc(218) int local218 = 0; local218 < this.anInt6904; local218++) {
			if (this.aClass271Array1[local218] != null) {
				this.aClass271Array1[local218].aByte97 = local24.method2860();
			}
		}
		for (@Pc(240) int local240 = 0; local240 < this.anInt6904; local240++) {
			if (this.aClass271Array1[local240] != null) {
				this.aClass271Array1[local240].aShort94 = (short) local24.method2825();
			}
		}
		for (@Pc(263) int local263 = 0; local263 < this.anInt6904; local263++) {
			if (this.aClass271Array1[local263] != null) {
				this.aClass271Array1[local263].aByte93 = local24.method2860();
			}
		}
		for (@Pc(285) int local285 = 0; local285 < this.anInt6904; local285++) {
			if (this.aClass271Array1[local285] != null) {
				this.aClass271Array1[local285].aByte95 = local24.method2860();
			}
		}
		for (@Pc(307) int local307 = 0; local307 < this.anInt6904; local307++) {
			if (this.aClass271Array1[local307] != null) {
				this.aClass271Array1[local307].aBoolean512 = local24.method2859() == 1;
			}
		}
		for (@Pc(334) int local334 = 0; local334 < this.anInt6904; local334++) {
			if (this.aClass271Array1[local334] != null) {
				this.aClass271Array1[local334].aBoolean509 = local24.method2859() == 1;
			}
		}
		for (@Pc(363) int local363 = 0; local363 < this.anInt6904; local363++) {
			if (this.aClass271Array1[local363] != null) {
				this.aClass271Array1[local363].aByte96 = local24.method2860();
			}
		}
		for (@Pc(389) int local389 = 0; local389 < this.anInt6904; local389++) {
			if (this.aClass271Array1[local389] != null) {
				this.aClass271Array1[local389].aBoolean513 = local24.method2859() == 1;
			}
		}
		for (@Pc(422) int local422 = 0; local422 < this.anInt6904; local422++) {
			if (this.aClass271Array1[local422] != null) {
				this.aClass271Array1[local422].aBoolean510 = local24.method2859() == 1;
			}
		}
		for (@Pc(455) int local455 = 0; local455 < this.anInt6904; local455++) {
			if (this.aClass271Array1[local455] != null) {
				this.aClass271Array1[local455].aBoolean511 = local24.method2859() == 1;
			}
		}
		for (@Pc(484) int local484 = 0; local484 < this.anInt6904; local484++) {
			if (this.aClass271Array1[local484] != null) {
				this.aClass271Array1[local484].anInt7163 = local24.method2859();
			}
		}
		for (@Pc(510) int local510 = 0; local510 < this.anInt6904; local510++) {
			if (this.aClass271Array1[local510] != null) {
				this.aClass271Array1[local510].anInt7159 = local24.method2881();
			}
		}
		for (@Pc(532) int local532 = 0; local532 < this.anInt6904; local532++) {
			if (this.aClass271Array1[local532] != null) {
				this.aClass271Array1[local532].anInt7162 = local24.method2859();
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Lclient!nk;")
	private Class2_Sub7_Sub11 method6029(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub7 local10 = this.aClass280_4.method6424((long) arg0);
		if (local10 != null) {
			return (Class2_Sub7_Sub11) local10;
		}
		@Pc(28) byte[] local28 = this.aClass238_185.method5580(arg0);
		if (local28 == null) {
			return null;
		} else {
			@Pc(40) Class2_Sub7_Sub11 local40 = new Class2_Sub7_Sub11(new Class2_Sub17(local28));
			this.aClass280_4.method6428((long) arg0, local40);
			return local40;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)Z")
	@Override
	public boolean method6026(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub7_Sub11 local8 = this.method6029(arg0);
		return local8 != null && local8.method5707(this, this.aClass238_186);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)I")
	@Override
	public int method6025() {
		return this.anInt6904;
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIZIFI)[I")
	@Override
	public int[] method6024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		return this.method6029(arg1).method5704(arg2, this.aClass238_186, arg0, this.aClass271Array1[arg1].aBoolean509, arg3, (double) arg4, this);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(FZIIII)[F")
	@Override
	public float[] method6022(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return this.method6029(arg1).method5706(this.aClass271Array1[arg1].aBoolean509, this, arg2, arg3, this.aClass238_186);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IFIIZI)[I")
	@Override
	public int[] method6023(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return this.method6029(arg2).method5709(arg0, (double) arg1, this, this.aClass271Array1[arg2].aBoolean509, arg3, this.aClass238_186);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)Lclient!pga;")
	@Override
	public Class271 method6027(@OriginalArg(0) int arg0) {
		return this.aClass271Array1[arg0];
	}
}
