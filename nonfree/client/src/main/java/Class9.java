import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class9 implements Interface3 {

	@OriginalMember(owner = "client!ak", name = "k", descriptor = "Lclient!oa;")
	private final Class144 aClass144_1 = new Class144(256);

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "Lclient!iq;")
	private final Class104 aClass104_7;

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "Lclient!iq;")
	private final Class104 aClass104_8;

	@OriginalMember(owner = "client!ak", name = "o", descriptor = "[Lclient!he;")
	private final Class89[] aClass89Array1;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!iq;Lclient!iq;Lclient!iq;)V")
	public Class9(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class104 arg1, @OriginalArg(2) Class104 arg2) {
		this.aClass104_7 = arg1;
		this.aClass104_8 = arg2;
		@Pc(24) Class2_Sub12 local24 = new Class2_Sub12(arg0.method2756(0, 0));
		@Pc(28) int local28 = local24.method3104();
		this.aClass89Array1 = new Class89[local28];
		for (@Pc(34) int local34 = 0; local34 < local28; local34++) {
			if (local24.method3124() == 1) {
				this.aClass89Array1[local34] = new Class89();
			}
		}
		for (@Pc(58) int local58 = 0; local58 < local28; local58++) {
			if (this.aClass89Array1[local58] != null) {
				this.aClass89Array1[local58].aBoolean250 = local24.method3124() == 0;
			}
		}
		for (@Pc(90) int local90 = 0; local90 < local28; local90++) {
			if (this.aClass89Array1[local90] != null) {
				this.aClass89Array1[local90].aBoolean245 = local24.method3124() == 1;
			}
		}
		for (@Pc(122) int local122 = 0; local122 < local28; local122++) {
			if (this.aClass89Array1[local122] != null) {
				this.aClass89Array1[local122].aBoolean249 = local24.method3124() == 1;
			}
		}
		for (@Pc(152) int local152 = 0; local152 < local28; local152++) {
			if (this.aClass89Array1[local152] != null) {
				this.aClass89Array1[local152].aBoolean243 = local24.method3124() == 1;
			}
		}
		for (@Pc(182) int local182 = 0; local182 < local28; local182++) {
			if (this.aClass89Array1[local182] != null) {
				this.aClass89Array1[local182].aByte25 = local24.method3122();
			}
		}
		for (@Pc(203) int local203 = 0; local203 < local28; local203++) {
			if (this.aClass89Array1[local203] != null) {
				this.aClass89Array1[local203].aByte27 = local24.method3122();
			}
		}
		for (@Pc(224) int local224 = 0; local224 < local28; local224++) {
			if (this.aClass89Array1[local224] != null) {
				this.aClass89Array1[local224].aByte28 = local24.method3122();
			}
		}
		for (@Pc(249) int local249 = 0; local249 < local28; local249++) {
			if (this.aClass89Array1[local249] != null) {
				this.aClass89Array1[local249].aByte30 = local24.method3122();
			}
		}
		for (@Pc(274) int local274 = 0; local274 < local28; local274++) {
			if (this.aClass89Array1[local274] != null) {
				this.aClass89Array1[local274].aShort40 = (short) local24.method3104();
			}
		}
		for (@Pc(296) int local296 = 0; local296 < local28; local296++) {
			if (this.aClass89Array1[local296] != null) {
				this.aClass89Array1[local296].aByte26 = local24.method3122();
			}
		}
		for (@Pc(321) int local321 = 0; local321 < local28; local321++) {
			if (this.aClass89Array1[local321] != null) {
				this.aClass89Array1[local321].aByte29 = local24.method3122();
			}
		}
		for (@Pc(346) int local346 = 0; local346 < local28; local346++) {
			if (this.aClass89Array1[local346] != null) {
				this.aClass89Array1[local346].aBoolean247 = local24.method3124() == 1;
			}
		}
		for (@Pc(376) int local376 = 0; local376 < local28; local376++) {
			if (this.aClass89Array1[local376] != null) {
				this.aClass89Array1[local376].aBoolean251 = local24.method3124() == 1;
			}
		}
		for (@Pc(406) int local406 = 0; local406 < local28; local406++) {
			if (this.aClass89Array1[local406] != null) {
				this.aClass89Array1[local406].aByte31 = local24.method3122();
			}
		}
		for (@Pc(427) int local427 = 0; local427 < local28; local427++) {
			if (this.aClass89Array1[local427] != null) {
				this.aClass89Array1[local427].aBoolean248 = local24.method3124() == 1;
			}
		}
		for (@Pc(459) int local459 = 0; local459 < local28; local459++) {
			if (this.aClass89Array1[local459] != null) {
				this.aClass89Array1[local459].aBoolean252 = local24.method3124() == 1;
			}
		}
		for (@Pc(487) int local487 = 0; local487 < local28; local487++) {
			if (this.aClass89Array1[local487] != null) {
				this.aClass89Array1[local487].aBoolean246 = local24.method3124() == 1;
			}
		}
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)Lclient!ij;")
	private Class2_Sub9_Sub10 method168(@OriginalArg(1) int arg0) {
		@Pc(17) Class2_Sub9 local17 = this.aClass144_1.method4186((long) arg0);
		if (local17 != null) {
			return (Class2_Sub9_Sub10) local17;
		}
		@Pc(28) byte[] local28 = this.aClass104_7.method2758(arg0);
		if (local28 == null) {
			return null;
		} else {
			@Pc(40) Class2_Sub9_Sub10 local40 = new Class2_Sub9_Sub10(new Class2_Sub12(local28));
			this.aClass144_1.method4188((long) arg0, local40);
			return local40;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method167(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub9_Sub10 local13 = this.method168(arg0);
		return local13 != null && local13.method2692(this, this.aClass104_8);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lclient!he;")
	@Override
	public Class89 method166(@OriginalArg(0) int arg0) {
		return this.aClass89Array1[arg0];
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZFBI)[F")
	@Override
	public float[] method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(5) int arg3) {
		return this.method168(arg1).method2696(arg3, this, this.aClass89Array1[arg1].aBoolean251, this.aClass104_8, arg0);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IFIIZI)[I")
	@Override
	public int[] method164(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		return this.method168(arg2).method2697(arg3, this.aClass104_8, (double) arg0, arg1, this.aClass89Array1[arg2].aBoolean251, this);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZIFII)[I")
	@Override
	public int[] method165(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(5) int arg4) {
		return this.method168(arg4).method2694(this, arg2, arg0, arg1, (double) arg3, this.aClass89Array1[arg4].aBoolean251, this.aClass104_8);
	}
}
