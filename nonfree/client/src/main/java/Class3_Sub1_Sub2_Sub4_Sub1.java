import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class3_Sub1_Sub2_Sub4_Sub1 extends Class3_Sub1_Sub2_Sub4 {

	@OriginalMember(owner = "client!hf", name = "Kc", descriptor = "I")
	public int anInt1369;

	@OriginalMember(owner = "client!hf", name = "Oc", descriptor = "I")
	public int anInt1372;

	@OriginalMember(owner = "client!hf", name = "Qc", descriptor = "Lclient!oa;")
	public Class56 aClass56_764;

	@OriginalMember(owner = "client!hf", name = "Uc", descriptor = "Lclient!t;")
	public Class3_Sub1_Sub2_Sub6 aClass3_Sub1_Sub2_Sub6_1;

	@OriginalMember(owner = "client!hf", name = "Xc", descriptor = "Lclient!kb;")
	public Class42 aClass42_1;

	@OriginalMember(owner = "client!hf", name = "bd", descriptor = "I")
	public int anInt1381;

	@OriginalMember(owner = "client!hf", name = "cd", descriptor = "I")
	public int anInt1382;

	@OriginalMember(owner = "client!hf", name = "dd", descriptor = "I")
	public int anInt1383;

	@OriginalMember(owner = "client!hf", name = "gd", descriptor = "I")
	public int anInt1384;

	@OriginalMember(owner = "client!hf", name = "ld", descriptor = "I")
	public int anInt1387;

	@OriginalMember(owner = "client!hf", name = "pd", descriptor = "I")
	public int anInt1390;

	@OriginalMember(owner = "client!hf", name = "Ic", descriptor = "I")
	public int anInt1368 = 0;

	@OriginalMember(owner = "client!hf", name = "Yc", descriptor = "I")
	public int anInt1378 = -1;

	@OriginalMember(owner = "client!hf", name = "Zc", descriptor = "I")
	public int anInt1379 = 0;

	@OriginalMember(owner = "client!hf", name = "Tc", descriptor = "I")
	public int anInt1375 = -1;

	@OriginalMember(owner = "client!hf", name = "kd", descriptor = "I")
	public int anInt1386 = 0;

	@OriginalMember(owner = "client!hf", name = "hd", descriptor = "Z")
	public boolean aBoolean60 = false;

	@OriginalMember(owner = "client!hf", name = "Nc", descriptor = "I")
	public int anInt1371 = 0;

	@OriginalMember(owner = "client!hf", name = "jd", descriptor = "I")
	public int anInt1385 = 0;

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method2033() {
		return this.aClass42_1 != null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILclient!b;)V")
	public void method877(@OriginalArg(1) Class3_Sub2 arg0) {
		arg0.anInt413 = 0;
		@Pc(10) int local10 = -1;
		@Pc(14) int local14 = arg0.method270();
		@Pc(17) int[] local17 = new int[12];
		this.anInt1375 = arg0.method265();
		this.anInt1378 = arg0.method265();
		this.anInt1385 = 0;
		@Pc(50) int local50;
		@Pc(88) int local88;
		for (@Pc(32) int local32 = 0; local32 < 12; local32++) {
			@Pc(38) int local38 = arg0.method270();
			if (local38 == 0) {
				local17[local32] = 0;
			} else {
				local50 = arg0.method270();
				local17[local32] = (local38 << 8) + local50;
				if (local32 == 0 && local17[0] == 65535) {
					local10 = arg0.method276();
					break;
				}
				if (local17[local32] >= 512) {
					local88 = Static12.method239(local17[local32] - 512).anInt1758;
					if (local88 != 0) {
						this.anInt1385 = local88;
					}
				}
			}
		}
		@Pc(103) int[] local103 = new int[5];
		for (local50 = 0; local50 < 5; local50++) {
			local88 = arg0.method270();
			if (local88 < 0 || Static57.aShortArrayArray1[local50].length <= local88) {
				local88 = 0;
			}
			local103[local50] = local88;
		}
		super.anInt3162 = arg0.method276();
		if (super.anInt3162 == 65535) {
			super.anInt3162 = -1;
		}
		super.anInt3153 = arg0.method276();
		if (super.anInt3153 == 65535) {
			super.anInt3153 = -1;
		}
		super.anInt3176 = super.anInt3153;
		super.anInt3154 = arg0.method276();
		if (super.anInt3154 == 65535) {
			super.anInt3154 = -1;
		}
		super.anInt3174 = arg0.method276();
		if (super.anInt3174 == 65535) {
			super.anInt3174 = -1;
		}
		super.anInt3160 = arg0.method276();
		if (super.anInt3160 == 65535) {
			super.anInt3160 = -1;
		}
		super.anInt3164 = arg0.method276();
		if (super.anInt3164 == 65535) {
			super.anInt3164 = -1;
		}
		super.anInt3173 = arg0.method276();
		if (super.anInt3173 == 65535) {
			super.anInt3173 = -1;
		}
		this.aClass56_764 = Static16.method342(arg0.method266()).method1421();
		this.anInt1368 = arg0.method270();
		this.anInt1371 = arg0.method276();
		if (this.aClass42_1 == null) {
			this.aClass42_1 = new Class42();
		}
		this.aClass42_1.method1077(local17, local103, local10, local14 == 1);
	}

	@OriginalMember(owner = "client!hf", name = "e", descriptor = "(B)Lclient!t;")
	@Override
	public Class3_Sub1_Sub2_Sub6 method2028() {
		if (this.aClass42_1 == null) {
			return null;
		}
		@Pc(24) Class3_Sub1_Sub4 local24 = super.anInt3149 != -1 && super.anInt3144 == 0 ? Static41.method770(super.anInt3149) : null;
		@Pc(49) Class3_Sub1_Sub4 local49 = super.anInt3186 == -1 || this.aBoolean60 || super.anInt3162 == super.anInt3186 && local24 != null ? null : Static41.method770(super.anInt3186);
		@Pc(60) Class3_Sub1_Sub2_Sub6 local60 = this.aClass42_1.method1082(super.anInt3175, local49, super.anInt3166, local24);
		if (local60 == null) {
			return null;
		}
		local60.method1798();
		super.anInt3181 = local60.anInt3141;
		@Pc(91) Class3_Sub1_Sub2_Sub6 local91;
		@Pc(111) Class3_Sub1_Sub2_Sub6[] local111;
		if (!this.aBoolean60 && super.anInt3198 != -1 && super.anInt3163 != -1) {
			local91 = Static43.method800(super.anInt3198).method341(super.anInt3163);
			if (local91 != null) {
				local91.method1783(0, -super.anInt3178, 0);
				local111 = new Class3_Sub1_Sub2_Sub6[] { local60, local91 };
				local60 = new Class3_Sub1_Sub2_Sub6(local111, 2);
			}
		}
		if (!this.aBoolean60 && this.aClass3_Sub1_Sub2_Sub6_1 != null) {
			if (this.anInt1379 <= Static98.anInt2566) {
				this.aClass3_Sub1_Sub2_Sub6_1 = null;
			}
			if (this.anInt1386 <= Static98.anInt2566 && this.anInt1379 > Static98.anInt2566) {
				local91 = this.aClass3_Sub1_Sub2_Sub6_1;
				local91.method1783(this.anInt1384 - super.anInt3187, -this.anInt1381 + this.anInt1387, this.anInt1372 - super.anInt3196);
				if (super.anInt3183 == 512) {
					local91.method1784();
					local91.method1784();
					local91.method1784();
				} else if (super.anInt3183 == 1024) {
					local91.method1784();
					local91.method1784();
				} else if (super.anInt3183 == 1536) {
					local91.method1784();
				}
				local111 = new Class3_Sub1_Sub2_Sub6[] { local60, local91 };
				local60 = new Class3_Sub1_Sub2_Sub6(local111, 2);
				if (super.anInt3183 == 512) {
					local91.method1784();
				} else if (super.anInt3183 == 1024) {
					local91.method1784();
					local91.method1784();
				} else if (super.anInt3183 == 1536) {
					local91.method1784();
					local91.method1784();
					local91.method1784();
				}
				local91.method1783(super.anInt3187 - this.anInt1384, -this.anInt1387 + this.anInt1381, super.anInt3196 - this.anInt1372);
			}
		}
		local60.aBoolean125 = true;
		return local60;
	}
}
