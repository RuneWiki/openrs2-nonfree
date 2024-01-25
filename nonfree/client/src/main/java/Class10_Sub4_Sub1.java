import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class10_Sub4_Sub1 extends Class10_Sub4 implements Interface4 {

	@OriginalMember(owner = "client!hd", name = "Z", descriptor = "Z")
	private final boolean aBoolean174;

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "B")
	private final byte aByte39;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "S")
	private final short aShort42;

	@OriginalMember(owner = "client!hd", name = "F", descriptor = "Z")
	private final boolean aBoolean173;

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "B")
	private final byte aByte38;

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "Z")
	private final boolean aBoolean175;

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "Lclient!ri;")
	private Class1_Sub2_Sub5 aClass1_Sub2_Sub5_4;

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "Lclient!dc;")
	private Class40 aClass40_5;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lclient!ii;Lclient!ge;IIIIZIIIII)V")
	public Class10_Sub4_Sub1(@OriginalArg(0) Class105 arg0, @OriginalArg(1) Class79 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static291.method5100(arg10, arg11));
		super.anInt6326 = (short) arg3;
		this.aBoolean174 = arg6;
		this.aByte40 = (byte) arg2;
		this.aByte39 = (byte) arg10;
		super.anInt6332 = (short) arg5;
		this.aShort42 = (short) arg1.anInt1898;
		this.aBoolean173 = arg1.anInt1863 != 0 && !arg6;
		this.aByte38 = (byte) arg11;
		this.aBoolean175 = arg0.method4227() && arg1.aBoolean142 && !this.aBoolean174 && Static256.anInt5260 != 0;
		@Pc(73) Class32 local73 = this.method1796(arg0, this.aBoolean175, 1024);
		if (local73 != null) {
			this.aClass1_Sub2_Sub5_4 = local73.aClass1_Sub2_Sub5_1;
			this.aClass40_5 = local73.aClass40_1;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!ii;)V")
	@Override
	public void method5446(@OriginalArg(1) Class105 arg0) {
		@Pc(19) Class1_Sub2_Sub5 local19;
		if (this.aClass1_Sub2_Sub5_4 == null && this.aBoolean175) {
			@Pc(30) Class32 local30 = this.method1796(arg0, true, 131072);
			local19 = local30 == null ? null : local30.aClass1_Sub2_Sub5_1;
		} else {
			local19 = this.aClass1_Sub2_Sub5_4;
			this.aClass1_Sub2_Sub5_4 = null;
		}
		if (local19 != null) {
			Static293.method5138(local19, this.aByte40, super.anInt6326, super.anInt6332, null);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ii;)V")
	@Override
	public void method5822(@OriginalArg(1) Class105 arg0) {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ii;ZII)Lclient!cb;")
	private Class32 method1796(@OriginalArg(0) Class105 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class79 local12 = Static129.method2097(this.aShort42 & 0xFFFF);
		@Pc(28) Class12 local28;
		@Pc(32) Class12 local32;
		if (this.aBoolean174) {
			local28 = Static81.aClass12Array1[this.aByte40];
			local32 = Static278.aClass12Array3[0];
		} else {
			if (this.aByte40 >= 3) {
				local32 = null;
			} else {
				local32 = Static278.aClass12Array3[this.aByte40 + 1];
			}
			local28 = Static278.aClass12Array3[this.aByte40];
		}
		return local12.method1565(local32, super.anInt6332, arg1, super.anInt6326, arg2, this.aByte39, this.aByte38, local28, super.anInt6329, arg0);
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)I")
	@Override
	public int method5452() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)I")
	@Override
	public int method5444() {
		return this.aClass40_5 == null ? 0 : this.aClass40_5.method4572();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ii;I)Lclient!dc;")
	@Override
	public Class40 method5448(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1) {
		return this.method1802(arg0, arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	@Override
	public void method5450() {
		if (this.aClass40_5 != null) {
			this.aClass40_5.method4619();
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5451() {
		return this.aBoolean175;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ii;Z)Lclient!dc;")
	private Class40 method1802(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1) {
		if (this.aClass40_5 != null && arg1.method4223(this.aClass40_5.method4602(), arg0) == 0) {
			return this.aClass40_5;
		} else {
			@Pc(23) Class32 local23 = this.method1796(arg1, false, arg0);
			return local23 == null ? null : local23.aClass40_1;
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lclient!ii;I)Lclient!eb;")
	@Override
	public Class7_Sub3 method5821(@OriginalArg(0) Class105 arg0) {
		if (this.aClass40_5 == null) {
			return null;
		}
		@Pc(19) Class31 local19 = arg0.method4304();
		local19.method3187(super.anInt6335 + super.anInt6326, super.anInt6329, super.anInt6333 + super.anInt6332);
		@Pc(35) Class7_Sub3 local35 = null;
		if (this.aBoolean173) {
			local35 = Static44.method908(1);
		}
		this.aClass40_5.method4587(local19, local35 == null ? null : local35.aClass7_Sub6Array1[0], 0);
		return local35;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ii;I)V")
	@Override
	public void method5447(@OriginalArg(0) Class105 arg0) {
		@Pc(25) Class1_Sub2_Sub5 local25;
		if (this.aClass1_Sub2_Sub5_4 == null && this.aBoolean175) {
			@Pc(18) Class32 local18 = this.method1796(arg0, true, 131072);
			local25 = local18 == null ? null : local18.aClass1_Sub2_Sub5_1;
		} else {
			local25 = this.aClass1_Sub2_Sub5_4;
			this.aClass1_Sub2_Sub5_4 = null;
		}
		if (local25 != null) {
			Static277.method4956(local25, this.aByte40, super.anInt6326, super.anInt6332, null);
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZLclient!ii;)Z")
	@Override
	public boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(9) Class40 local9 = this.method1802(65536, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(21) Class31 local21 = arg2.method4304();
			local21.method3187(super.anInt6326, super.anInt6329, super.anInt6332);
			return local9.method4614(arg0, arg1, local21, false);
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)I")
	@Override
	public int method5449() {
		return this.aByte38;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
	@Override
	public int method5445() {
		return this.aShort42 & 0xFFFF;
	}
}
