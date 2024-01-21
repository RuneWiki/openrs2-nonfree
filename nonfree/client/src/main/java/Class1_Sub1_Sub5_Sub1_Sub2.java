import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class1_Sub1_Sub5_Sub1_Sub2 extends Class1_Sub1_Sub5_Sub1 {

	@OriginalMember(owner = "client!qa", name = "sc", descriptor = "I")
	public int anInt3609;

	@OriginalMember(owner = "client!qa", name = "uc", descriptor = "I")
	public int anInt3611;

	@OriginalMember(owner = "client!qa", name = "xc", descriptor = "Lclient!rg;")
	public Class1_Sub1_Sub5_Sub4 aClass1_Sub1_Sub5_Sub4_1;

	@OriginalMember(owner = "client!qa", name = "Fc", descriptor = "I")
	public int anInt3618;

	@OriginalMember(owner = "client!qa", name = "Lc", descriptor = "I")
	public int anInt3623;

	@OriginalMember(owner = "client!qa", name = "Pc", descriptor = "Lclient!ia;")
	public Class31 aClass31_2;

	@OriginalMember(owner = "client!qa", name = "Rc", descriptor = "I")
	public int anInt3626;

	@OriginalMember(owner = "client!qa", name = "Xc", descriptor = "Lclient!ea;")
	public Class18 aClass18_908;

	@OriginalMember(owner = "client!qa", name = "Yc", descriptor = "I")
	public int anInt3629;

	@OriginalMember(owner = "client!qa", name = "Zc", descriptor = "I")
	public int anInt3630;

	@OriginalMember(owner = "client!qa", name = "ad", descriptor = "I")
	public int anInt3631;

	@OriginalMember(owner = "client!qa", name = "Dc", descriptor = "I")
	public int anInt3617 = -1;

	@OriginalMember(owner = "client!qa", name = "Ic", descriptor = "I")
	public int anInt3621 = 0;

	@OriginalMember(owner = "client!qa", name = "wc", descriptor = "I")
	public int anInt3612 = 0;

	@OriginalMember(owner = "client!qa", name = "Nc", descriptor = "Z")
	public boolean aBoolean156 = false;

	@OriginalMember(owner = "client!qa", name = "Mc", descriptor = "I")
	public int anInt3624 = 0;

	@OriginalMember(owner = "client!qa", name = "Kc", descriptor = "I")
	public int anInt3622 = -1;

	@OriginalMember(owner = "client!qa", name = "Sc", descriptor = "I")
	public int anInt3627 = 0;

	@OriginalMember(owner = "client!qa", name = "rc", descriptor = "I")
	public int anInt3608 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!hc;I)V")
	public void method2487(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.anInt839 = 0;
		@Pc(6) int local6 = -1;
		@Pc(13) int[] local13 = new int[12];
		@Pc(17) int local17 = arg0.method544();
		this.anInt3617 = arg0.method548();
		this.anInt3622 = arg0.method548();
		this.anInt3627 = 0;
		@Pc(50) int local50;
		@Pc(88) int local88;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method544();
			if (local38 == 0) {
				local13[local32] = 0;
			} else {
				local50 = arg0.method544();
				local13[local32] = (local38 << 8) + local50;
				if (local32 == 0 && local13[0] == 65535) {
					local6 = arg0.method546();
					break;
				}
				if (local13[local32] >= 512) {
					local88 = Static101.method2134(local13[local32] - 512).anInt92;
					if (local88 != 0) {
						this.anInt3627 = local88;
					}
				}
			}
		}
		@Pc(103) int[] local103 = new int[5];
		for (local50 = 0; local50 < 5; local50++) {
			local88 = arg0.method544();
			if (local88 < 0 || Static17.aShortArrayArray7[local50].length <= local88) {
				local88 = 0;
			}
			local103[local50] = local88;
		}
		super.anInt3607 = arg0.method546();
		if (super.anInt3607 == 65535) {
			super.anInt3607 = -1;
		}
		super.anInt3594 = arg0.method546();
		if (super.anInt3594 == 65535) {
			super.anInt3594 = -1;
		}
		super.anInt3603 = super.anInt3594;
		super.anInt3570 = arg0.method546();
		if (super.anInt3570 == 65535) {
			super.anInt3570 = -1;
		}
		super.anInt3573 = arg0.method546();
		if (super.anInt3573 == 65535) {
			super.anInt3573 = -1;
		}
		super.anInt3585 = arg0.method546();
		if (super.anInt3585 == 65535) {
			super.anInt3585 = -1;
		}
		super.anInt3587 = arg0.method546();
		if (super.anInt3587 == 65535) {
			super.anInt3587 = -1;
		}
		super.anInt3605 = arg0.method546();
		if (super.anInt3605 == 65535) {
			super.anInt3605 = -1;
		}
		this.aClass18_908 = Static124.method2453(arg0.method537()).method739();
		this.anInt3621 = arg0.method544();
		this.anInt3608 = arg0.method546();
		if (this.aClass31_2 == null) {
			this.aClass31_2 = new Class31();
		}
		this.aClass31_2.method1287(local13, local17 == 1, local103, local6);
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(Z)Lclient!rg;")
	@Override
	public Class1_Sub1_Sub5_Sub4 method2896() {
		if (this.aClass31_2 == null) {
			return null;
		}
		@Pc(28) Class1_Sub1_Sub12 local28 = super.anInt3568 != -1 && super.anInt3597 == 0 ? Static121.method2378(super.anInt3568) : null;
		@Pc(49) Class1_Sub1_Sub12 local49 = super.anInt3562 == -1 || this.aBoolean156 || super.anInt3607 == super.anInt3562 && local28 != null ? null : Static121.method2378(super.anInt3562);
		@Pc(60) Class1_Sub1_Sub5_Sub4 local60 = this.aClass31_2.method1289(local28, super.anInt3554, super.anInt3586, local49);
		if (local60 == null) {
			return null;
		}
		local60.method1008();
		super.anInt3599 = local60.anInt4233;
		@Pc(92) Class1_Sub1_Sub5_Sub4 local92;
		if (!this.aBoolean156 && super.anInt3552 != -1 && super.anInt3567 != -1) {
			local92 = Static155.method2902(super.anInt3552).method3152(super.anInt3567);
			if (local92 != null) {
				local92.method996(0, -super.anInt3601, 0);
				local60 = local60.method1002(local92);
			}
		}
		if (!this.aBoolean156 && this.aClass1_Sub1_Sub5_Sub4_1 != null) {
			if (Static41.anInt1322 >= this.anInt3612) {
				this.aClass1_Sub1_Sub5_Sub4_1 = null;
			}
			if (this.anInt3624 <= Static41.anInt1322 && Static41.anInt1322 < this.anInt3612) {
				local92 = this.aClass1_Sub1_Sub5_Sub4_1;
				local92.method996(this.anInt3626 - super.anInt3579, this.anInt3611 - this.anInt3631, this.anInt3630 - super.anInt3558);
				if (super.anInt3590 == 512) {
					local92.method1006();
					local92.method1006();
					local92.method1006();
				} else if (super.anInt3590 == 1024) {
					local92.method1006();
					local92.method1006();
				} else if (super.anInt3590 == 1536) {
					local92.method1006();
				}
				local60 = local60.method1002(local92);
				if (super.anInt3590 == 512) {
					local92.method1006();
				} else if (super.anInt3590 == 1024) {
					local92.method1006();
					local92.method1006();
				} else if (super.anInt3590 == 1536) {
					local92.method1006();
					local92.method1006();
					local92.method1006();
				}
				local92.method996(super.anInt3579 - this.anInt3626, -this.anInt3611 + this.anInt3631, super.anInt3558 - this.anInt3630);
			}
		}
		local60.aBoolean56 = true;
		return local60;
	}

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)Z")
	@Override
	public boolean method2479() {
		return this.aClass31_2 != null;
	}
}
