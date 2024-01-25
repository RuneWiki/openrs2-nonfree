import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class23_Sub2_Sub5_Sub1 extends Class23_Sub2_Sub5 implements Interface2 {

	@OriginalMember(owner = "client!qa", name = "Z", descriptor = "Lclient!dg;")
	private Class77 aClass77_5;

	@OriginalMember(owner = "client!qa", name = "bb", descriptor = "Z")
	private boolean aBoolean612 = false;

	@OriginalMember(owner = "client!qa", name = "L", descriptor = "Lclient!vw;")
	public final Class381 aClass381_3;

	@OriginalMember(owner = "client!qa", name = "P", descriptor = "Z")
	private final boolean aBoolean611;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!ha;Lclient!ij;IIIIIZIII)V")
	public Class23_Sub2_Sub5_Sub1(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class178 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static498.method7099(arg8, arg9));
		this.aClass381_3 = new Class381(arg0, arg1, arg8, arg9, super.aByte142, arg3, this, arg7, arg10);
		this.aBoolean611 = arg1.anInt4743 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(BLclient!ha;)Lclient!hga;")
	@Override
	public Class23_Sub6 method8603(@OriginalArg(1) Class16 arg0) {
		@Pc(14) Class28 local14 = this.aClass381_3.method8541(arg0, true, false, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(27) Class25 local27 = arg0.method8156();
		local27.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
		@Pc(41) Class23_Sub6 local41 = Static564.method8406(1, this.aBoolean611);
		@Pc(46) int local46 = super.anInt10108 >> 9;
		@Pc(51) int local51 = super.anInt10109 >> 9;
		this.aClass381_3.method8531(local46, arg0, local14, local27, true, local51, local51, local46);
		if (Static148.aBoolean221) {
			local14.method6894(local27, local41.aClass23_Sub4Array1[0], Static209.anInt10104, 0);
		} else {
			local14.method6908(local27, local41.aClass23_Sub4Array1[0], 0);
		}
		if (this.aClass381_3.aClass23_Sub5_7 != null) {
			@Pc(93) Class237 local93 = this.aClass381_3.aClass23_Sub5_7.method2587();
			if (Static148.aBoolean221) {
				arg0.method8115(local93, Static209.anInt10104);
			} else {
				arg0.method8119(local93);
			}
		}
		this.aBoolean612 = local14.F() || this.aClass381_3.aClass23_Sub5_7 != null;
		if (this.aClass77_5 == null) {
			this.aClass77_5 = Static109.method2088(super.anInt10109, super.anInt10108, local14, super.anInt10114);
		} else {
			Static446.method6451(super.anInt10108, super.anInt10109, local14, this.aClass77_5, super.anInt10114);
		}
		return local41;
	}

	@OriginalMember(owner = "client!qa", name = "j", descriptor = "(I)Z")
	@Override
	public boolean method8608() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return false;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!dja;)V")
	public void method6804(@OriginalArg(1) Class81 arg0) {
		this.aClass381_3.method8533(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)I")
	@Override
	public int method8606(@OriginalArg(0) int arg0) {
		if (arg0 != 0) {
			this.method7825((Class16) null);
		}
		return this.aClass381_3.method8537(3162);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8594() {
		return this.aBoolean612;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method7825(@OriginalArg(0) Class16 arg0) {
		this.aClass381_3.method8532(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLclient!ha;)V")
	@Override
	public void method8590(@OriginalArg(1) Class16 arg0) {
		@Pc(12) Class28 local12 = this.aClass381_3.method8541(arg0, true, true, 262144);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10108 >> 9;
		@Pc(24) int local24 = super.anInt10109 >> 9;
		@Pc(27) Class25 local27 = arg0.method8156();
		local27.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
		this.aClass381_3.method8531(local19, arg0, local12, local27, false, local24, local24, local19);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ha;Lclient!cn;IIBZI)V")
	@Override
	public void method8596(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class23_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)I")
	@Override
	public int method7823() {
		return this.aClass381_3.anInt10036;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7828() {
		return this.aClass381_3.method8539();
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	@Override
	public void method7826() {
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Lclient!ha;B)Lclient!dg;")
	@Override
	public Class77 method8595(@OriginalArg(0) Class16 arg0) {
		return this.aClass77_5;
	}

	@OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)I")
	@Override
	public int method8601() {
		return this.aClass381_3.method8536();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I")
	@Override
	public int method7824() {
		return this.aClass381_3.anInt10037;
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
	@Override
	public void method8592() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7829(@OriginalArg(0) Class16 arg0) {
		this.aClass381_3.method8534(arg0);
	}

	@OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)I")
	@Override
	public int method7827() {
		return this.aClass381_3.anInt10049;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!ha;III)Z")
	@Override
	public boolean method8600(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class28 local12 = this.aClass381_3.method8541(arg0, false, false, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class25 local19 = arg0.method8156();
			local19.method4303(super.anInt10108, super.anInt10114, super.anInt10109);
			return Static148.aBoolean221 ? local12.method6904(arg1, arg2, local19, false, 0, Static209.anInt10104) : local12.method6887(arg1, arg2, local19, false, 0);
		}
	}
}
