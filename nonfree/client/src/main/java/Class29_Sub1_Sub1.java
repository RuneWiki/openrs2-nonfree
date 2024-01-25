import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class29_Sub1_Sub1 extends Class29_Sub1 implements Interface6 {

	@OriginalMember(owner = "client!hs", name = "N", descriptor = "Lclient!vg;")
	private Class330 aClass330_3;

	@OriginalMember(owner = "client!hs", name = "R", descriptor = "Z")
	private final boolean aBoolean226;

	@OriginalMember(owner = "client!hs", name = "D", descriptor = "B")
	private final byte aByte48;

	@OriginalMember(owner = "client!hs", name = "w", descriptor = "S")
	private final short aShort70;

	@OriginalMember(owner = "client!hs", name = "O", descriptor = "B")
	private final byte aByte49;

	@OriginalMember(owner = "client!hs", name = "X", descriptor = "B")
	private final byte aByte50;

	@OriginalMember(owner = "client!hs", name = "E", descriptor = "Z")
	private final boolean aBoolean225;

	@OriginalMember(owner = "client!hs", name = "y", descriptor = "Z")
	private final boolean aBoolean224;

	@OriginalMember(owner = "client!hs", name = "H", descriptor = "Lclient!w;")
	private Class6_Sub1_Sub12 aClass6_Sub1_Sub12_2;

	@OriginalMember(owner = "client!hs", name = "M", descriptor = "Lclient!ba;")
	private Class22 aClass22_3;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!oa;Lclient!uca;IIIIZIIIII)V")
	public Class29_Sub1_Sub1(@OriginalArg(0) Class121 arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static469.method6572(arg10, arg11));
		this.aBoolean226 = arg1.lb != 0 && !arg6;
		super.anInt7307 = arg5;
		super.anInt7302 = arg3;
		this.aByte48 = (byte) arg11;
		this.aShort70 = (short) arg1.anInt8480;
		this.aByte49 = (byte) arg10;
		this.aByte50 = (byte) arg2;
		this.aBoolean225 = arg6;
		this.aBoolean224 = arg0.method7126() && arg1.aBoolean582 && !this.aBoolean225 && Static480.aClass6_Sub37_Sub1_1.method5149(Static567.anInt9503) != 0;
		@Pc(74) Class300 local74 = this.method2958(arg0, 2048, this.aBoolean224);
		if (local74 != null) {
			this.aClass6_Sub1_Sub12_2 = local74.aClass6_Sub1_Sub12_6;
			this.aClass22_3 = local74.aClass22_7;
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)I")
	@Override
	public int method7555() {
		return this.aShort70 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(Z)V")
	@Override
	public void method7554() {
		if (this.aClass22_3 != null) {
			this.aClass22_3.method4706();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7552(@OriginalArg(1) Class121 arg0) {
		@Pc(18) Class6_Sub1_Sub12 local18;
		if (this.aClass6_Sub1_Sub12_2 == null && this.aBoolean224) {
			@Pc(29) Class300 local29 = this.method2958(arg0, 262144, true);
			local18 = local29 == null ? null : local29.aClass6_Sub1_Sub12_6;
		} else {
			local18 = this.aClass6_Sub1_Sub12_2;
			this.aClass6_Sub1_Sub12_2 = null;
		}
		if (local18 != null) {
			Static287.method7856(local18, this.aByte50, super.anInt7302, super.anInt7307, null);
		}
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(ILclient!oa;)V")
	@Override
	public void method7556(@OriginalArg(1) Class121 arg0) {
		@Pc(20) Class6_Sub1_Sub12 local20;
		if (this.aClass6_Sub1_Sub12_2 == null && this.aBoolean224) {
			@Pc(33) Class300 local33 = this.method2958(arg0, 262144, true);
			local20 = local33 == null ? null : local33.aClass6_Sub1_Sub12_6;
		} else {
			local20 = this.aClass6_Sub1_Sub12_2;
			this.aClass6_Sub1_Sub12_2 = null;
		}
		if (local20 != null) {
			Static128.method1938(local20, this.aByte50, super.anInt7302, super.anInt7307, null);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)I")
	@Override
	public int method7553() {
		return this.aByte48;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)I")
	@Override
	public int method7551() {
		return this.aByte49;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	@Override
	public Class22 method7557(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		return this.method2959(arg0, arg1);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method7550() {
		return this.aBoolean224;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!oa;IIZ)Lclient!taa;")
	private Class300 method2958(@OriginalArg(0) Class121 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class313 local13 = Static260.aClass100_1.method2008(this.aShort70 & 0xFFFF);
		@Pc(26) Class60 local26;
		@Pc(34) Class60 local34;
		if (this.aBoolean225) {
			local34 = Static34.aClass60Array10[0];
			local26 = Static127.aClass60Array7[this.aByte50];
		} else {
			local26 = Static34.aClass60Array10[this.aByte50];
			if (this.aByte50 >= 3) {
				local34 = null;
			} else {
				local34 = Static34.aClass60Array10[this.aByte50 + 1];
			}
		}
		return local13.method6963(local26, this.aByte49, super.anInt7302, this.aByte48, arg0, super.anInt7307, arg2, super.anInt7311, local34, arg1);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBLclient!oa;)Lclient!ba;")
	private Class22 method2959(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1) {
		if (this.aClass22_3 != null && arg1.method7150(this.aClass22_3.h(), arg0) == 0) {
			return this.aClass22_3;
		} else {
			@Pc(34) Class300 local34 = this.method2958(arg1, arg0, false);
			return local34 == null ? null : local34.aClass22_7;
		}
	}

	@OriginalMember(owner = "client!hs", name = "f", descriptor = "(I)I")
	@Override
	public int method6070() {
		return this.aClass22_3 == null ? 0 : this.aClass22_3.DA();
	}

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "(BLclient!oa;)V")
	@Override
	public void method7544(@OriginalArg(1) Class121 arg0) {
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(BLclient!oa;)Lclient!vg;")
	@Override
	public Class330 method7539(@OriginalArg(1) Class121 arg0) {
		if (this.aClass330_3 == null) {
			this.aClass330_3 = Static9.method170(this.method2959(0, arg0), super.anInt7302, super.anInt7311, super.anInt7307);
		}
		return this.aClass330_3;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIILclient!oa;)Z")
	@Override
	public boolean method7542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class121 arg2) {
		@Pc(9) Class22 local9 = this.method2959(131072, arg2);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class34 local14 = arg2.method7096();
			local14.GA(super.anInt7302, super.anInt7311, super.anInt7307);
			return local9.method4698(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lclient!oa;B)Lclient!lt;")
	@Override
	public Class102_Sub2 method7545(@OriginalArg(0) Class121 arg0) {
		if (this.aClass22_3 == null) {
			return null;
		}
		@Pc(16) Class34 local16 = arg0.method7096();
		local16.GA(super.anInt7304 + super.anInt7302, super.anInt7311, super.anInt7312 + super.anInt7307);
		@Pc(32) Class102_Sub2 local32 = null;
		if (this.aBoolean226) {
			local32 = Static228.method3369(1);
		}
		this.aClass22_3.method4689(local16, local32 == null ? null : local32.aClass102_Sub5Array1[0], 0);
		return local32;
	}
}
