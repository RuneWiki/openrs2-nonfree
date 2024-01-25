import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public final class Class23_Sub2_Sub2_Sub1 extends Class23_Sub2_Sub2 implements Interface2 {

	@OriginalMember(owner = "client!bw", name = "M", descriptor = "Lclient!dg;")
	private Class77 aClass77_1;

	@OriginalMember(owner = "client!bw", name = "X", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!bw", name = "K", descriptor = "Lclient!vw;")
	public final Class381 aClass381_1;

	@OriginalMember(owner = "client!bw", name = "S", descriptor = "Z")
	private final boolean aBoolean135;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!ha;Lclient!ij;IIIIIZIIIII)V")
	public Class23_Sub2_Sub2_Sub1(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass381_1 = new Class381(arg0, arg1, arg10, arg11, super.aByte142, arg3, this, arg7, arg12);
		this.aBoolean135 = arg1.anInt4743 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I")
	@Override
	public int method7824() {
		return this.aClass381_1.anInt10037;
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8594() {
		return this.aBoolean136;
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	@Override
	public Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0) {
		@Pc(14) Class28 local14 = this.aClass381_1.method8541(arg0, true, false, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class25 local21 = arg0.method8156();
		local21.method4303(super.aShort114 + super.anInt10108, super.anInt10114, super.anInt10109 + super.aShort113);
		@Pc(41) Class23_Sub6 local41 = Static564.method8406(1, this.aBoolean135);
		@Pc(46) int local46 = super.anInt10108 >> 9;
		@Pc(58) int local58 = super.anInt10109 >> 9;
		this.aClass381_1.method8531(local46, arg0, local14, local21, true, local58, local58, local46);
		if (Static148.aBoolean221) {
			local14.method6894(local21, local41.aClass23_Sub4Array1[0], Static209.anInt10104, 0);
		} else {
			local14.method6908(local21, local41.aClass23_Sub4Array1[0], 0);
		}
		if (this.aClass381_1.aClass23_Sub5_7 != null) {
			@Pc(100) Class237 local100 = this.aClass381_1.aClass23_Sub5_7.method2587();
			if (Static148.aBoolean221) {
				arg0.method8115(local100, Static209.anInt10104);
			} else {
				arg0.method8119(local100);
			}
		}
		this.aBoolean136 = local14.F() || this.aClass381_1.aClass23_Sub5_7 != null;
		if (this.aClass77_1 == null) {
			this.aClass77_1 = Static109.method2088(super.anInt10109, super.anInt10108, local14, super.anInt10114);
		} else {
			Static446.method6451(super.anInt10108, super.anInt10109, local14, this.aClass77_1, super.anInt10114);
		}
		return local41;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)I")
	@Override
	public int method7823() {
		return this.aClass381_1.anInt10036;
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aClass381_1.anInt10049;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!dja;I)V")
	public void method1515(@OriginalArg(0) Class81 arg0) {
		this.aClass381_1.method8533(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	@Override
	public Class77 method8595(@OriginalArg(0) Class16 arg0) {
		return this.aClass77_1;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7828() {
		return this.aClass381_1.method8539();
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7829(@OriginalArg(0) Class16 arg0) {
		this.aClass381_1.method8534(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class28 local14 = this.aClass381_1.method8541(arg0, false, false, 131072);
		if (local14 == null) {
			return false;
		} else {
			@Pc(21) Class25 local21 = arg0.method8156();
			local21.method4303(super.aShort114 + super.anInt10108, super.anInt10114, super.anInt10109 + super.aShort113);
			return Static148.aBoolean221 ? local14.method6904(arg1, arg2, local21, false, 0, Static209.anInt10104) : local14.method6887(arg1, arg2, local21, false, 0);
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V")
	@Override
	public void method7826() {
	}

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8608() {
		return false;
	}

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "(I)I")
	@Override
	public int method8601() {
		return this.aClass381_1.method8536();
	}

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "(I)I")
	@Override
	public int method8606(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method8601();
		}
		return this.aClass381_1.method8537(3162);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7825(@OriginalArg(0) Class16 arg0) {
		this.aClass381_1.method8532(arg0);
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8590(@OriginalArg(1) Class16 arg0) {
		@Pc(12) Class28 local12 = this.aClass381_1.method8541(arg0, true, false, 262144);
		if (local12 == null) {
			return;
		}
		@Pc(26) int local26 = super.anInt10108 >> 9;
		@Pc(31) int local31 = super.anInt10109 >> 9;
		@Pc(34) Class25 local34 = arg0.method8156();
		local34.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
		this.aClass381_1.method8531(local26, arg0, local12, local34, false, local31, local31, local26);
	}
}
