import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class292 implements Interface8 {

	@OriginalMember(owner = "client!um", name = "e", descriptor = "Lclient!uk;")
	private final Class290 aClass290_3 = new Class290(256);

	@OriginalMember(owner = "client!um", name = "d", descriptor = "Lclient!kda;")
	private final Class160 aClass160_96;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "Lclient!kda;")
	private final Class160 aClass160_95;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "I")
	private final int anInt8388;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "[Lclient!lba;")
	private final Class175[] aClass175Array1;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!kda;Lclient!kda;Lclient!kda;)V")
	public Class292(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) Class160 arg2) {
		this.aClass160_96 = arg1;
		this.aClass160_95 = arg2;
		@Pc(22) Class1_Sub13 local22 = new Class1_Sub13(arg0.method4198(0, 0));
		this.anInt8388 = local22.method3056();
		this.aClass175Array1 = new Class175[this.anInt8388];
		for (@Pc(34) int local34 = 0; local34 < this.anInt8388; local34++) {
			if (local22.method3043() == 1) {
				this.aClass175Array1[local34] = new Class175();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt8388; local58++) {
			if (this.aClass175Array1[local58] != null) {
				this.aClass175Array1[local58].aBoolean356 = local22.method3043() == 0;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < this.anInt8388; local87++) {
			if (this.aClass175Array1[local87] != null) {
				this.aClass175Array1[local87].aBoolean359 = local22.method3043() == 1;
			}
		}
		for (@Pc(115) int local115 = 0; local115 < this.anInt8388; local115++) {
			if (this.aClass175Array1[local115] != null) {
				this.aClass175Array1[local115].aBoolean354 = local22.method3043() == 1;
			}
		}
		for (@Pc(145) int local145 = 0; local145 < this.anInt8388; local145++) {
			if (this.aClass175Array1[local145] != null) {
				this.aClass175Array1[local145].aBoolean350 = local22.method3043() == 1;
			}
		}
		for (@Pc(177) int local177 = 0; local177 < this.anInt8388; local177++) {
			if (this.aClass175Array1[local177] != null) {
				this.aClass175Array1[local177].aByte58 = local22.method3073();
			}
		}
		for (@Pc(202) int local202 = 0; local202 < this.anInt8388; local202++) {
			if (this.aClass175Array1[local202] != null) {
				this.aClass175Array1[local202].aByte59 = local22.method3073();
			}
		}
		for (@Pc(223) int local223 = 0; local223 < this.anInt8388; local223++) {
			if (this.aClass175Array1[local223] != null) {
				this.aClass175Array1[local223].aByte54 = local22.method3073();
			}
		}
		for (@Pc(248) int local248 = 0; local248 < this.anInt8388; local248++) {
			if (this.aClass175Array1[local248] != null) {
				this.aClass175Array1[local248].aByte56 = local22.method3073();
			}
		}
		for (@Pc(273) int local273 = 0; local273 < this.anInt8388; local273++) {
			if (this.aClass175Array1[local273] != null) {
				this.aClass175Array1[local273].aShort81 = (short) local22.method3056();
			}
		}
		for (@Pc(299) int local299 = 0; local299 < this.anInt8388; local299++) {
			if (this.aClass175Array1[local299] != null) {
				this.aClass175Array1[local299].aByte57 = local22.method3073();
			}
		}
		for (@Pc(320) int local320 = 0; local320 < this.anInt8388; local320++) {
			if (this.aClass175Array1[local320] != null) {
				this.aClass175Array1[local320].aByte60 = local22.method3073();
			}
		}
		for (@Pc(345) int local345 = 0; local345 < this.anInt8388; local345++) {
			if (this.aClass175Array1[local345] != null) {
				this.aClass175Array1[local345].aBoolean355 = local22.method3043() == 1;
			}
		}
		for (@Pc(373) int local373 = 0; local373 < this.anInt8388; local373++) {
			if (this.aClass175Array1[local373] != null) {
				this.aClass175Array1[local373].aBoolean351 = local22.method3043() == 1;
			}
		}
		for (@Pc(403) int local403 = 0; local403 < this.anInt8388; local403++) {
			if (this.aClass175Array1[local403] != null) {
				this.aClass175Array1[local403].aByte55 = local22.method3073();
			}
		}
		for (@Pc(428) int local428 = 0; local428 < this.anInt8388; local428++) {
			if (this.aClass175Array1[local428] != null) {
				this.aClass175Array1[local428].aBoolean358 = local22.method3043() == 1;
			}
		}
		for (@Pc(458) int local458 = 0; local458 < this.anInt8388; local458++) {
			if (this.aClass175Array1[local458] != null) {
				this.aClass175Array1[local458].aBoolean357 = local22.method3043() == 1;
			}
		}
		for (@Pc(484) int local484 = 0; local484 < this.anInt8388; local484++) {
			if (this.aClass175Array1[local484] != null) {
				this.aClass175Array1[local484].aBoolean352 = local22.method3043() == 1;
			}
		}
		for (@Pc(512) int local512 = 0; local512 < this.anInt8388; local512++) {
			if (this.aClass175Array1[local512] != null) {
				this.aClass175Array1[local512].anInt5193 = local22.method3043();
			}
		}
		for (@Pc(537) int local537 = 0; local537 < this.anInt8388; local537++) {
			if (this.aClass175Array1[local537] != null) {
				this.aClass175Array1[local537].anInt5194 = local22.method3037();
			}
		}
		for (@Pc(562) int local562 = 0; local562 < this.anInt8388; local562++) {
			if (this.aClass175Array1[local562] != null) {
				this.aClass175Array1[local562].aBoolean353 = local22.method3043() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IFIZZI)[F")
	@Override
	public float[] method7083(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		return this.method7090(arg0).method2687(arg2, arg3, this.aClass175Array1[arg0].aBoolean351, this.aClass160_95, this);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZIIIF)[I")
	@Override
	public int[] method7086(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3) {
		return this.method7090(arg2).method2680((double) arg3, this.aClass160_95, arg0, this, this.aClass175Array1[arg2].aBoolean351, arg1);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)I")
	@Override
	public int method7087() {
		return this.anInt8388;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method7084(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub1_Sub5 local15 = this.method7090(arg0);
		return local15 != null && local15.method2681(this.aClass160_95, this);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(II)Lclient!ev;")
	private Class1_Sub1_Sub5 method7090(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1 local10 = this.aClass290_3.method7078((long) arg0);
		if (local10 != null) {
			return (Class1_Sub1_Sub5) local10;
		}
		@Pc(23) byte[] local23 = this.aClass160_96.method4216(arg0);
		if (local23 == null) {
			return null;
		} else {
			@Pc(39) Class1_Sub1_Sub5 local39 = new Class1_Sub1_Sub5(new Class1_Sub13(local23));
			this.aClass290_3.method7077((long) arg0, local39);
			return local39;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)Lclient!lba;")
	@Override
	public Class175 method7085(@OriginalArg(0) int arg0) {
		return this.aClass175Array1[arg0];
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZIIFI)[I")
	@Override
	public int[] method7088(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4) {
		return this.method7090(arg4).method2685(arg0, arg2, this.aClass160_95, this, arg1, this.aClass175Array1[arg4].aBoolean351, (double) arg3);
	}
}
