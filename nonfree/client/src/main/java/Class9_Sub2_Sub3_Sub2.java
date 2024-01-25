import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class9_Sub2_Sub3_Sub2 extends Class9_Sub2_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!oq", name = "O", descriptor = "Lclient!iha;")
	private Class160 aClass160_5;

	@OriginalMember(owner = "client!oq", name = "L", descriptor = "Z")
	private boolean aBoolean523 = false;

	@OriginalMember(owner = "client!oq", name = "cb", descriptor = "Lclient!dj;")
	public final Class71 aClass71_3;

	@OriginalMember(owner = "client!oq", name = "M", descriptor = "Z")
	private final boolean aBoolean524;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!ha;Lclient!ts;IIIIIZIII)V")
	public Class9_Sub2_Sub3_Sub2(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class330 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, arg2, arg3, Static152.method2718(arg8, arg9));
		this.aClass71_3 = new Class71(arg0, arg1, arg8, arg9, super.aByte127, arg3, this, arg7, arg10);
		this.aBoolean524 = arg1.anInt9228 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "(I)Z")
	@Override
	public boolean method8597() {
		return false;
	}

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "(I)I")
	@Override
	public int method8613() {
		return this.aClass71_3.method1697();
	}

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "(I)Z")
	@Override
	public boolean method8607() {
		return this.aBoolean523;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)I")
	@Override
	public int method7500() {
		return this.aClass71_3.anInt2024;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)I")
	@Override
	public int method7495() {
		return this.aClass71_3.anInt2033;
	}

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7499() {
		return this.aClass71_3.method1691();
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!ha;I)Lclient!ua;")
	@Override
	public Class9_Sub10 method8603(@OriginalArg(0) Class82 arg0) {
		@Pc(14) Class75 local14 = this.aClass71_3.method1702(true, false, arg0, 2048);
		if (local14 == null) {
			return null;
		}
		@Pc(21) Class31 local21 = arg0.method6125();
		local21.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
		@Pc(40) Class9_Sub10 local40 = Static635.method8548(1, this.aBoolean524);
		@Pc(45) int local45 = super.anInt10152 >> 9;
		@Pc(50) int local50 = super.anInt10158 >> 9;
		this.aClass71_3.method1694(local21, local50, local45, local14, local50, arg0, true, local45);
		if (Static40.aBoolean34) {
			local14.method6788(local21, local40.aClass9_Sub5Array1[0], Static562.anInt9327, 0);
		} else {
			local14.method6799(local21, local40.aClass9_Sub5Array1[0], 0);
		}
		if (this.aClass71_3.aClass9_Sub8_3 != null) {
			@Pc(92) Class162 local92 = this.aClass71_3.aClass9_Sub8_3.method5949();
			if (Static40.aBoolean34) {
				arg0.method6107(local92, Static562.anInt9327);
			} else {
				arg0.method6161(local92);
			}
		}
		this.aBoolean523 = local14.F() || this.aClass71_3.aClass9_Sub8_3 != null;
		if (this.aClass160_5 == null) {
			this.aClass160_5 = Static365.method5854(super.anInt10158, super.anInt10154, local14, super.anInt10152);
		} else {
			Static412.method6388(super.anInt10152, super.anInt10158, local14, super.anInt10154, this.aClass160_5);
		}
		return local40;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!ha;B)V")
	@Override
	public void method7498(@OriginalArg(0) Class82 arg0) {
		this.aClass71_3.method1699(arg0);
	}

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "(I)V")
	@Override
	public void method8612() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V")
	@Override
	public void method7497() {
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(I)I")
	@Override
	public int method7496() {
		return this.aClass71_3.anInt2039;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BLclient!ha;ZILclient!uq;II)V")
	@Override
	public void method8609(@OriginalArg(1) Class82 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class9_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(Lclient!ha;B)Lclient!iha;")
	@Override
	public Class160 method8604(@OriginalArg(0) Class82 arg0) {
		return this.aClass160_5;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!kea;I)V")
	public void method6434(@OriginalArg(0) Class187 arg0) {
		this.aClass71_3.method1703(arg0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!ha;IB)Z")
	@Override
	public boolean method8605(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class75 local12 = this.aClass71_3.method1702(false, false, arg1, 131072);
		if (local12 == null) {
			return false;
		} else {
			@Pc(26) Class31 local26 = arg1.method6125();
			local26.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
			return Static40.aBoolean34 ? local12.method6800(arg0, arg2, local26, false, 0, Static562.anInt9327) : local12.method6804(arg0, arg2, local26, false, 0);
		}
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(B)I")
	@Override
	public int method8611(@OriginalArg(0) byte arg0) {
		if (arg0 != -86) {
			Static415.method6436();
		}
		return this.aClass71_3.method1693(10);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method7501(@OriginalArg(0) Class82 arg0) {
		this.aClass71_3.method1692(arg0);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZLclient!ha;)V")
	@Override
	public void method8600(@OriginalArg(1) Class82 arg0) {
		@Pc(19) Class75 local19 = this.aClass71_3.method1702(true, true, arg0, 262144);
		if (local19 == null) {
			return;
		}
		@Pc(26) int local26 = super.anInt10152 >> 9;
		@Pc(31) int local31 = super.anInt10158 >> 9;
		@Pc(34) Class31 local34 = arg0.method6125();
		local34.method7921(super.anInt10152, super.anInt10154, super.anInt10158);
		this.aClass71_3.method1694(local34, local31, local26, local19, local31, arg0, false, local26);
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8610() {
		return false;
	}
}
