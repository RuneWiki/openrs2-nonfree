import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class25 implements Interface8 {

	@OriginalMember(owner = "client!bg", name = "p", descriptor = "Lclient!nc;")
	private final Class201 aClass201_1 = new Class201(256);

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Lclient!kr;")
	private final Class171 aClass171_21;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!kr;")
	private final Class171 aClass171_20;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	private final int anInt831;

	@OriginalMember(owner = "client!bg", name = "m", descriptor = "[Lclient!oo;")
	private final Class220[] aClass220Array1;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Lclient!kr;Lclient!kr;Lclient!kr;)V")
	public Class25(@OriginalArg(0) Class171 arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class171 arg2) {
		this.aClass171_21 = arg1;
		this.aClass171_20 = arg2;
		@Pc(24) Class1_Sub6 local24 = new Class1_Sub6(arg0.method4339(0, 0));
		this.anInt831 = local24.method3967();
		this.aClass220Array1 = new Class220[this.anInt831];
		for (@Pc(36) int local36 = 0; local36 < this.anInt831; local36++) {
			if (local24.method3922() == 1) {
				this.aClass220Array1[local36] = new Class220();
			}
		}
		for (@Pc(59) int local59 = 0; local59 < this.anInt831; local59++) {
			if (this.aClass220Array1[local59] != null) {
				this.aClass220Array1[local59].aBoolean446 = local24.method3922() == 0;
			}
		}
		for (@Pc(88) int local88 = 0; local88 < this.anInt831; local88++) {
			if (this.aClass220Array1[local88] != null) {
				this.aClass220Array1[local88].aBoolean449 = local24.method3922() == 1;
			}
		}
		for (@Pc(121) int local121 = 0; local121 < this.anInt831; local121++) {
			if (this.aClass220Array1[local121] != null) {
				this.aClass220Array1[local121].aBoolean451 = local24.method3922() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < this.anInt831; local152++) {
			if (this.aClass220Array1[local152] != null) {
				this.aClass220Array1[local152].aBoolean448 = local24.method3922() == 1;
			}
		}
		for (@Pc(179) int local179 = 0; local179 < this.anInt831; local179++) {
			if (this.aClass220Array1[local179] != null) {
				this.aClass220Array1[local179].aByte84 = local24.method3928();
			}
		}
		for (@Pc(205) int local205 = 0; local205 < this.anInt831; local205++) {
			if (this.aClass220Array1[local205] != null) {
				this.aClass220Array1[local205].aByte81 = local24.method3928();
			}
		}
		for (@Pc(231) int local231 = 0; local231 < this.anInt831; local231++) {
			if (this.aClass220Array1[local231] != null) {
				this.aClass220Array1[local231].aByte87 = local24.method3928();
			}
		}
		for (@Pc(253) int local253 = 0; local253 < this.anInt831; local253++) {
			if (this.aClass220Array1[local253] != null) {
				this.aClass220Array1[local253].aByte86 = local24.method3928();
			}
		}
		for (@Pc(279) int local279 = 0; local279 < this.anInt831; local279++) {
			if (this.aClass220Array1[local279] != null) {
				this.aClass220Array1[local279].aShort100 = (short) local24.method3967();
			}
		}
		for (@Pc(302) int local302 = 0; local302 < this.anInt831; local302++) {
			if (this.aClass220Array1[local302] != null) {
				this.aClass220Array1[local302].aByte82 = local24.method3928();
			}
		}
		for (@Pc(324) int local324 = 0; local324 < this.anInt831; local324++) {
			if (this.aClass220Array1[local324] != null) {
				this.aClass220Array1[local324].aByte85 = local24.method3928();
			}
		}
		for (@Pc(350) int local350 = 0; local350 < this.anInt831; local350++) {
			if (this.aClass220Array1[local350] != null) {
				this.aClass220Array1[local350].aBoolean450 = local24.method3922() == 1;
			}
		}
		for (@Pc(377) int local377 = 0; local377 < this.anInt831; local377++) {
			if (this.aClass220Array1[local377] != null) {
				this.aClass220Array1[local377].aBoolean452 = local24.method3922() == 1;
			}
		}
		for (@Pc(410) int local410 = 0; local410 < this.anInt831; local410++) {
			if (this.aClass220Array1[local410] != null) {
				this.aClass220Array1[local410].aByte83 = local24.method3928();
			}
		}
		for (@Pc(432) int local432 = 0; local432 < this.anInt831; local432++) {
			if (this.aClass220Array1[local432] != null) {
				this.aClass220Array1[local432].aBoolean453 = local24.method3922() == 1;
			}
		}
		for (@Pc(459) int local459 = 0; local459 < this.anInt831; local459++) {
			if (this.aClass220Array1[local459] != null) {
				this.aClass220Array1[local459].aBoolean447 = local24.method3922() == 1;
			}
		}
		for (@Pc(492) int local492 = 0; local492 < this.anInt831; local492++) {
			if (this.aClass220Array1[local492] != null) {
				this.aClass220Array1[local492].aBoolean454 = local24.method3922() == 1;
			}
		}
		for (@Pc(521) int local521 = 0; local521 < this.anInt831; local521++) {
			if (this.aClass220Array1[local521] != null) {
				this.aClass220Array1[local521].anInt6250 = local24.method3922();
			}
		}
		for (@Pc(547) int local547 = 0; local547 < this.anInt831; local547++) {
			if (this.aClass220Array1[local547] != null) {
				this.aClass220Array1[local547].anInt6249 = local24.method3925();
			}
		}
		for (@Pc(569) int local569 = 0; local569 < this.anInt831; local569++) {
			if (this.aClass220Array1[local569] != null) {
				this.aClass220Array1[local569].aBoolean445 = local24.method3922() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBZIFI)[I")
	@Override
	public int[] method876(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4) {
		return this.method883(arg0).method1829(arg2, this.aClass171_20, arg4, this, this.aClass220Array1[arg0].aBoolean452, arg1, (double) arg3);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method879(@OriginalArg(1) int arg0) {
		@Pc(8) Class1_Sub1_Sub3 local8 = this.method883(arg0);
		return local8 != null && local8.method1828(this, this.aClass171_20);
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(II)Lclient!eea;")
	private Class1_Sub1_Sub3 method883(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1 local10 = this.aClass201_1.method4927((long) arg0);
		if (local10 != null) {
			return (Class1_Sub1_Sub3) local10;
		}
		@Pc(21) byte[] local21 = this.aClass171_21.method4361(arg0);
		if (local21 == null) {
			return null;
		} else {
			@Pc(41) Class1_Sub1_Sub3 local41 = new Class1_Sub1_Sub3(new Class1_Sub6(local21));
			this.aClass201_1.method4925(local41, (long) arg0);
			return local41;
		}
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(IIIIZF)[I")
	@Override
	public int[] method880(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3) {
		return this.method883(arg1).method1827(arg2, this.aClass220Array1[arg1].aBoolean452, this, arg0, this.aClass171_20, (double) arg3);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)I")
	@Override
	public int method881() {
		return this.anInt831;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIZF)[F")
	@Override
	public float[] method877(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3) {
		return this.method883(arg1).method1831(arg2, this.aClass220Array1[arg1].aBoolean452, this.aClass171_20, arg0, this);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)Lclient!oo;")
	@Override
	public Class220 method878(@OriginalArg(1) int arg0) {
		return this.aClass220Array1[arg0];
	}
}
