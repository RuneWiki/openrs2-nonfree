import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class9_Sub2_Sub1_Sub1 extends Class9_Sub2_Sub1 implements Interface2 {

	@OriginalMember(owner = "client!bo", name = "kb", descriptor = "Lclient!iha;")
	private Class160 aClass160_1;

	@OriginalMember(owner = "client!bo", name = "lb", descriptor = "Z")
	private boolean lb = false;

	@OriginalMember(owner = "client!bo", name = "db", descriptor = "Lclient!dj;")
	public final Class71 aClass71_1;

	@OriginalMember(owner = "client!bo", name = "gb", descriptor = "Z")
	private final boolean aBoolean48;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!ha;Lclient!ts;IIIIIZIIIIIII)V")
	public Class9_Sub2_Sub1_Sub1(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt9217 == 1, Static359.method5777(arg13, arg12));
		this.aClass71_1 = new Class71(arg0, arg1, arg12, arg13, super.aByte127, arg3, this, arg7, arg14);
		this.aBoolean48 = arg1.anInt9228 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7501(@OriginalArg(0) Class82 arg0) {
		this.aClass71_1.method1692(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7498(@OriginalArg(0) Class82 arg0) {
		this.aClass71_1.method1699(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BLclient!ha;ZILclient!uq;II)V")
	@Override
	public void method8609(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!ha;IB)Z")
	@Override
	public boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class75 local12 = this.aClass71_1.method1702(false, false, arg1, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(19) Class31 local19 = arg1.method6125();
			local19.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
			return Static40.aBoolean34 ? local12.method6800(arg0, arg2, local19, false, 0, Static562.anInt9327) : local12.method6804(arg0, arg2, local19, false, 0);
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)I")
	@Override
	public int method7496() {
		return this.aClass71_1.anInt2039;
	}

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.lb;
	}

	@OriginalMember(owner = "client!bo", name = "m", descriptor = "(I)V")
	@Override
	public void method8612() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8600(@OriginalArg(1) Class82 arg0) {
		@Pc(16) Class75 local16 = this.aClass71_1.method1702(true, true, arg0, 262144);
		if (local16 != null) {
			@Pc(21) Class31 local21 = arg0.method6125();
			local21.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
			this.aClass71_1.method1694(local21, super.aShort125, super.aShort127, local16, super.aShort124, arg0, false, super.aShort126);
		}
	}

	@OriginalMember(owner = "client!bo", name = "n", descriptor = "(I)I")
	@Override
	public int method8613() {
		return this.aClass71_1.method1697();
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	@Override
	public Class160 method8604(@OriginalArg(0) Class82 arg0) {
		return this.aClass160_1;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V")
	@Override
	public void method7497() {
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!kea;Z)V")
	public void method898(@OriginalArg(0) Class187 arg0) {
		this.aClass71_1.method1703(arg0);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)I")
	@Override
	public int method7495() {
		return this.aClass71_1.anInt2033;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)I")
	@Override
	public int method8611(@OriginalArg(0) byte arg0) {
		if (arg0 != -86) {
			this.method7498((Class82) null);
		}
		return this.aClass71_1.method1693(10);
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	@Override
	public Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0) {
		@Pc(14) Class75 local14 = this.aClass71_1.method1702(true, false, arg0, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class31 local21 = arg0.method6125();
		local21.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
		@Pc(40) Class9_Sub10 local40 = Static635.method8548(1, this.aBoolean48);
		this.aClass71_1.method1694(local21, super.aShort125, super.aShort127, local14, super.aShort124, arg0, true, super.aShort126);
		if (Static40.aBoolean34) {
			local14.method6788(local21, local40.aClass9_Sub5Array1[0], Static562.anInt9327, 0);
		} else {
			local14.method6799(local21, local40.aClass9_Sub5Array1[0], 0);
		}
		if (this.aClass71_1.aClass9_Sub8_3 != null) {
			@Pc(86) Class162 local86 = this.aClass71_1.aClass9_Sub8_3.method5949();
			if (Static40.aBoolean34) {
				arg0.method6107(local86, Static562.anInt9327);
			} else {
				arg0.method6161(local86);
			}
		}
		this.lb = local14.F() || this.aClass71_1.aClass9_Sub8_3 != null;
		if (this.aClass160_1 == null) {
			this.aClass160_1 = Static365.method5854(super.anInt10158, super.anInt10154, local14, super.anInt10152);
		} else {
			Static412.method6388(super.anInt10152, super.anInt10158, local14, super.anInt10154, this.aClass160_1);
		}
		return local40;
	}

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8597() {
		return false;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)I")
	@Override
	public int method7500() {
		return this.aClass71_1.anInt2024;
	}

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7499() {
		return this.aClass71_1.method1691();
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8610() {
		return false;
	}
}
