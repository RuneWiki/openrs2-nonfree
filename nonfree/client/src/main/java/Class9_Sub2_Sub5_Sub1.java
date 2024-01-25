import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class9_Sub2_Sub5_Sub1 extends Class9_Sub2_Sub5 implements Interface2 {

	@OriginalMember(owner = "client!re", name = "db", descriptor = "Lclient!iha;")
	private Class160 aClass160_7;

	@OriginalMember(owner = "client!re", name = "ab", descriptor = "Z")
	private boolean aBoolean601 = false;

	@OriginalMember(owner = "client!re", name = "M", descriptor = "Lclient!dj;")
	public final Class71 aClass71_4;

	@OriginalMember(owner = "client!re", name = "T", descriptor = "Z")
	private final boolean aBoolean600;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!ha;Lclient!ts;IIIIIZIIIII)V")
	public Class9_Sub2_Sub5_Sub1(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
		this.aClass71_4 = new Class71(arg0, arg1, arg10, arg11, super.aByte127, arg3, this, arg7, arg12);
		this.aBoolean600 = arg1.anInt9228 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	@Override
	public Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0) {
		@Pc(14) Class75 local14 = this.aClass71_4.method1702(true, false, arg0, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class31 local21 = arg0.method6125();
		local21.method7921(super.aShort98 + super.anInt10152, super.anInt10154, super.anInt10158 + super.aShort97);
		@Pc(44) Class9_Sub10 local44 = Static635.method8548(1, this.aBoolean600);
		@Pc(49) int local49 = super.anInt10152 >> 9;
		@Pc(54) int local54 = super.anInt10158 >> 9;
		this.aClass71_4.method1694(local21, local54, local49, local14, local54, arg0, true, local49);
		if (Static40.aBoolean34) {
			local14.method6788(local21, local44.aClass9_Sub5Array1[0], Static562.anInt9327, 0);
		} else {
			local14.method6799(local21, local44.aClass9_Sub5Array1[0], 0);
		}
		if (this.aClass71_4.aClass9_Sub8_3 != null) {
			@Pc(96) Class162 local96 = this.aClass71_4.aClass9_Sub8_3.method5949();
			if (Static40.aBoolean34) {
				arg0.method6107(local96, Static562.anInt9327);
			} else {
				arg0.method6161(local96);
			}
		}
		this.aBoolean601 = local14.F() || this.aClass71_4.aClass9_Sub8_3 != null;
		if (this.aClass160_7 == null) {
			this.aClass160_7 = Static365.method5854(super.anInt10158, super.anInt10154, local14, super.anInt10152);
		} else {
			Static412.method6388(super.anInt10152, super.anInt10158, local14, super.anInt10154, this.aClass160_7);
		}
		return local44;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	@Override
	public Class160 method8604(@OriginalArg(0) Class82 arg0) {
		return this.aClass160_7;
	}

	@OriginalMember(owner = "client!re", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8597() {
		return false;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)I")
	@Override
	public int method8611(@OriginalArg(0) byte arg0) {
		if (arg0 != -86) {
			this.method7192((Class187) null);
		}
		return this.aClass71_4.method1693(10);
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7499() {
		return this.aClass71_4.method1691();
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
	@Override
	public void method7497() {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(I)I")
	@Override
	public int method7495() {
		return this.aClass71_4.anInt2033;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)I")
	@Override
	public int method7496() {
		return this.aClass71_4.anInt2039;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!kea;)V")
	public void method7192(@OriginalArg(1) Class187 arg0) {
		this.aClass71_4.method1703(arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8600(@OriginalArg(1) Class82 arg0) {
		@Pc(12) Class75 local12 = this.aClass71_4.method1702(true, false, arg0, 262144);
		if (local12 == null) {
			return;
		}
		@Pc(19) int local19 = super.anInt10152 >> 9;
		@Pc(24) int local24 = super.anInt10158 >> 9;
		@Pc(27) Class31 local27 = arg0.method6125();
		local27.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
		this.aClass71_4.method1694(local27, local24, local19, local12, local24, arg0, false, local19);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7501(@OriginalArg(0) Class82 arg0) {
		this.aClass71_4.method1692(arg0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!ha;IB)Z")
	@Override
	public boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class75 local12 = this.aClass71_4.method1702(false, false, arg1, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class31 local19 = arg1.method6125();
			local19.method7921(super.aShort98 + super.anInt10152, super.anInt10154, super.aShort97 + super.anInt10158);
			return Static40.aBoolean34 ? local12.method6800(arg0, arg2, local19, false, 0, Static562.anInt9327) : local12.method6804(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I")
	@Override
	public int method7500() {
		return this.aClass71_4.anInt2024;
	}

	@OriginalMember(owner = "client!re", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.aBoolean601;
	}

	@OriginalMember(owner = "client!re", name = "n", descriptor = "(I)I")
	@Override
	public int method8613() {
		return this.aClass71_4.method1697();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7498(@OriginalArg(0) Class82 arg0) {
		this.aClass71_4.method1699(arg0);
	}
}
