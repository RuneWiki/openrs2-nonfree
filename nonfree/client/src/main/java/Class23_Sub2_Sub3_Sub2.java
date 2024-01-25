import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class23_Sub2_Sub3_Sub2 extends Class23_Sub2_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!tm", name = "ab", descriptor = "Lclient!dg;")
	private Class77 aClass77_8;

	@OriginalMember(owner = "client!tm", name = "W", descriptor = "Z")
	private boolean aBoolean685 = false;

	@OriginalMember(owner = "client!tm", name = "P", descriptor = "Lclient!vw;")
	public final Class381 aClass381_4;

	@OriginalMember(owner = "client!tm", name = "Y", descriptor = "Z")
	private final boolean aBoolean686;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!ha;Lclient!ij;IIIIIZII)V")
	public Class23_Sub2_Sub3_Sub2(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg2, arg3, arg1.anInt4759);
		this.aClass381_4 = new Class381(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
		this.aBoolean686 = arg1.anInt4743 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	@Override
	public Class77 method8595(@OriginalArg(0) Class16 arg0) {
		return this.aClass77_8;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
	@Override
	public void method7826() {
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
	@Override
	public void method8592() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7829(@OriginalArg(0) Class16 arg0) {
		this.aClass381_4.method8534(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8590(@OriginalArg(1) Class16 arg0) {
		@Pc(17) Class28 local17 = this.aClass381_4.method8541(arg0, true, true, 262144);
		if (local17 == null) {
			return;
		}
		@Pc(24) int local24 = super.anInt10108 >> 9;
		@Pc(29) int local29 = super.anInt10109 >> 9;
		@Pc(32) Class25 local32 = arg0.method8156();
		local32.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
		this.aClass381_4.method8531(local24, arg0, local17, local32, false, local29, local29, local24);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(BLclient!dja;)V")
	public void method7830(@OriginalArg(1) Class81 arg0) {
		this.aClass381_4.method8533(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)I")
	@Override
	public int method8601() {
		return this.aClass381_4.method8536();
	}

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return false;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8594() {
		return this.aBoolean685;
	}

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "(I)I")
	@Override
	public int method8606(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method7827();
		}
		return this.aClass381_4.method8537(3162);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)I")
	@Override
	public int method7823() {
		return this.aClass381_4.anInt10036;
	}

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8608() {
		return false;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IIBZI)V")
	@Override
	public void method8596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	@Override
	public Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0) {
		@Pc(14) Class28 local14 = this.aClass381_4.method8541(arg0, true, false, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(31) Class25 local31 = arg0.method8156();
		local31.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
		@Pc(45) Class23_Sub6 local45 = Static564.method8406(1, this.aBoolean686);
		@Pc(50) int local50 = super.anInt10108 >> 9;
		@Pc(55) int local55 = super.anInt10109 >> 9;
		this.aClass381_4.method8531(local50, arg0, local14, local31, true, local55, local55, local50);
		if (Static148.aBoolean221) {
			local14.method6894(local31, local45.aClass23_Sub4Array1[0], Static209.anInt10104, 0);
		} else {
			local14.method6908(local31, local45.aClass23_Sub4Array1[0], 0);
		}
		if (this.aClass381_4.aClass23_Sub5_7 != null) {
			@Pc(97) Class237 local97 = this.aClass381_4.aClass23_Sub5_7.method2587();
			if (Static148.aBoolean221) {
				arg0.method8115(local97, Static209.anInt10104);
			} else {
				arg0.method8119(local97);
			}
		}
		this.aBoolean685 = local14.F() || this.aClass381_4.aClass23_Sub5_7 != null;
		if (this.aClass77_8 == null) {
			this.aClass77_8 = Static109.method2088(super.anInt10109, super.anInt10108, local14, super.anInt10114);
		} else {
			Static446.method6451(super.anInt10108, super.anInt10109, local14, this.aClass77_8, super.anInt10114);
		}
		return local45;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)I")
	@Override
	public int method7824() {
		return this.aClass381_4.anInt10037;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class28 local12 = this.aClass381_4.method8541(arg0, false, false, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class25 local19 = arg0.method8156();
			local19.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
			return Static148.aBoolean221 ? local12.method6904(arg1, arg2, local19, false, 0, Static209.anInt10104) : local12.method6887(arg1, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7828() {
		return this.aClass381_4.method8539();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7825(@OriginalArg(0) Class16 arg0) {
		this.aClass381_4.method8532(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aClass381_4.anInt10049;
	}
}
