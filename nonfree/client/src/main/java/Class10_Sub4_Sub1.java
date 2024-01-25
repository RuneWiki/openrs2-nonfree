import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class10_Sub4_Sub1 extends Class10_Sub4 implements Interface17 {

	@OriginalMember(owner = "client!dq", name = "F", descriptor = "Lclient!dd;")
	private Class68 aClass68_2;

	@OriginalMember(owner = "client!dq", name = "y", descriptor = "B")
	private final byte aByte29;

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "Z")
	private final boolean aBoolean200;

	@OriginalMember(owner = "client!dq", name = "O", descriptor = "B")
	private final byte aByte31;

	@OriginalMember(owner = "client!dq", name = "J", descriptor = "Z")
	private final boolean aBoolean201;

	@OriginalMember(owner = "client!dq", name = "D", descriptor = "B")
	private final byte aByte30;

	@OriginalMember(owner = "client!dq", name = "W", descriptor = "S")
	private final short aShort40;

	@OriginalMember(owner = "client!dq", name = "R", descriptor = "Z")
	private final boolean aBoolean202;

	@OriginalMember(owner = "client!dq", name = "z", descriptor = "Lclient!w;")
	private Class4_Sub7_Sub3 aClass4_Sub7_Sub3_2;

	@OriginalMember(owner = "client!dq", name = "A", descriptor = "Lclient!ba;")
	private Class9 aClass9_2;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lclient!oa;Lclient!bd;IIIIZIIIII)V")
	public Class10_Sub4_Sub1(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static566.method7773(arg11, arg10));
		this.aByte29 = (byte) arg2;
		this.aBoolean200 = arg6;
		super.anInt8732 = arg3;
		this.aByte31 = (byte) arg10;
		this.aBoolean201 = arg1.anInt599 != 0 && !arg6;
		this.aByte30 = (byte) arg11;
		super.anInt8737 = arg5;
		this.aShort40 = (short) arg1.anInt605;
		this.aBoolean202 = arg0.method6789() && arg1.aBoolean57 && !this.aBoolean200 && Static189.aClass4_Sub2_Sub1_1.method7643(Static403.anInt6994) != 0;
		@Pc(80) Class339 local80 = this.method2244(2048, arg0, this.aBoolean202);
		if (local80 != null) {
			this.aClass4_Sub7_Sub3_2 = local80.aClass4_Sub7_Sub3_5;
			this.aClass9_2 = local80.aClass9_6;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V")
	@Override
	public void method7741() {
		if (this.aClass9_2 != null) {
			this.aClass9_2.method4016();
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7739() {
		return this.aBoolean202;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!oa;BI)Lclient!ba;")
	@Override
	public Class9 method7740(@OriginalArg(0) Class66 arg0, @OriginalArg(2) int arg1) {
		return this.method2242(arg1, arg0);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(B)I")
	@Override
	public int method7742() {
		return this.aByte31;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!oa;)Lclient!dd;")
	@Override
	public Class68 method7731(@OriginalArg(1) Class66 arg0) {
		if (this.aClass68_2 == null) {
			this.aClass68_2 = Static56.method848(super.anInt8740, this.method2242(0, arg0), super.anInt8732, super.anInt8737);
		}
		return this.aClass68_2;
	}

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "(B)I")
	@Override
	public int method7188() {
		return this.aClass9_2 == null ? 0 : this.aClass9_2.DA();
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!oa;B)V")
	@Override
	public void method7745(@OriginalArg(0) Class66 arg0) {
		@Pc(32) Class4_Sub7_Sub3 local32;
		if (this.aClass4_Sub7_Sub3_2 == null && this.aBoolean202) {
			@Pc(25) Class339 local25 = this.method2244(262144, arg0, true);
			local32 = local25 == null ? null : local25.aClass4_Sub7_Sub3_5;
		} else {
			local32 = this.aClass4_Sub7_Sub3_2;
			this.aClass4_Sub7_Sub3_2 = null;
		}
		if (local32 != null) {
			Static55.method846(local32, this.aByte29, super.anInt8732, super.anInt8737, null);
		}
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(Z)I")
	@Override
	public int method7743() {
		return this.aShort40 & 0xFFFF;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class66 arg0) {
		@Pc(21) Class4_Sub7_Sub3 local21;
		if (this.aClass4_Sub7_Sub3_2 == null && this.aBoolean202) {
			@Pc(34) Class339 local34 = this.method2244(262144, arg0, true);
			local21 = local34 == null ? null : local34.aClass4_Sub7_Sub3_5;
		} else {
			local21 = this.aClass4_Sub7_Sub3_2;
			this.aClass4_Sub7_Sub3_2 = null;
		}
		if (local21 != null) {
			Static159.method3156(local21, this.aByte29, super.anInt8732, super.anInt8737, null);
		}
	}

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(Z)I")
	@Override
	public int method7744() {
		return this.aByte30;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IBLclient!oa;)Lclient!ba;")
	private Class9 method2242(@OriginalArg(0) int arg0, @OriginalArg(2) Class66 arg1) {
		if (this.aClass9_2 != null && arg1.method6831(this.aClass9_2.h(), arg0) == 0) {
			return this.aClass9_2;
		} else {
			@Pc(31) Class339 local31 = this.method2244(arg0, arg1, false);
			return local31 == null ? null : local31.aClass9_6;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLclient!oa;)Lclient!pe;")
	@Override
	public Class26_Sub6 method7727(@OriginalArg(1) Class66 arg0) {
		if (this.aClass9_2 == null) {
			return null;
		}
		@Pc(11) Class134 local11 = arg0.method6842();
		local11.GA(super.anInt8735 + super.anInt8732, super.anInt8740, super.anInt8729 + super.anInt8737);
		@Pc(27) Class26_Sub6 local27 = null;
		if (this.aBoolean201) {
			local27 = Static292.method4579(1);
		}
		this.aClass9_2.method4023(local11, local27 == null ? null : local27.aClass26_Sub5Array1[0], 0);
		return local27;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(BILclient!oa;I)Z")
	@Override
	public boolean method7728(@OriginalArg(1) int arg0, @OriginalArg(2) Class66 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Class9 local17 = this.method2242(131072, arg1);
		if (local17 == null) {
			return false;
		} else {
			@Pc(22) Class134 local22 = arg1.method6842();
			local22.GA(super.anInt8732, super.anInt8740, super.anInt8737);
			return local17.method4007(arg2, arg0, local22, false);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!oa;IZ)Lclient!un;")
	private Class339 method2244(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(18) Class25 local18 = Static553.aClass288_4.method6419(this.aShort40 & 0xFFFF);
		@Pc(30) Class16 local30;
		@Pc(25) Class16 local25;
		if (this.aBoolean200) {
			local25 = Static45.aClass16Array1[0];
			local30 = Static109.aClass16Array2[this.aByte29];
		} else {
			local30 = Static45.aClass16Array1[this.aByte29];
			if (this.aByte29 >= 3) {
				local25 = null;
			} else {
				local25 = Static45.aClass16Array1[this.aByte29 + 1];
			}
		}
		return local18.method564(local25, super.anInt8732, super.anInt8737, arg0, super.anInt8740, arg1, arg2, this.aByte31, local30, this.aByte30);
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lclient!oa;Z)V")
	@Override
	public void method7729(@OriginalArg(0) Class66 arg0) {
	}
}
