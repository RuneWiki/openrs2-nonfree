import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class3_Sub5_Sub1 extends Class3_Sub5 implements Interface2 {

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "B")
	private final byte aByte56;

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "Z")
	private final boolean aBoolean342;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "B")
	private final byte aByte57;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "Z")
	private boolean aBoolean343;

	@OriginalMember(owner = "client!pc", name = "I", descriptor = "Z")
	private final boolean aBoolean344;

	@OriginalMember(owner = "client!pc", name = "S", descriptor = "S")
	private final short aShort58;

	@OriginalMember(owner = "client!pc", name = "R", descriptor = "Z")
	private final boolean aBoolean345;

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "Lclient!i;")
	private Class2_Sub5_Sub7 aClass2_Sub5_Sub7_4;

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "Lclient!e;")
	private Class59 aClass59_5;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lclient!za;Lclient!pm;IIIIZIZ)V")
	public Class3_Sub5_Sub1(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt5330, arg1.aBoolean394, arg1.aBoolean398);
		this.aByte56 = (byte) arg7;
		this.aBoolean342 = arg1.anInt5357 != 0 && !arg6;
		super.anInt6620 = arg5;
		super.anInt6616 = arg3;
		this.aByte57 = (byte) arg2;
		this.aBoolean343 = arg8;
		this.aBoolean344 = arg6;
		this.aShort58 = (short) arg1.anInt5325;
		this.aBoolean345 = arg0.method5544() && arg1.aBoolean392 && !this.aBoolean344 && Static2.aClass148_Sub1_1.method3036(Static288.anInt4743) != 0;
		@Pc(72) int local72 = 2048;
		if (this.aBoolean343) {
			local72 |= 0x10000;
		}
		@Pc(87) Class247 local87 = this.method3967(local72, arg0, this.aBoolean345);
		if (local87 != null) {
			this.aClass2_Sub5_Sub7_4 = local87.aClass2_Sub5_Sub7_5;
			this.aClass59_5 = local87.aClass59_6;
			if (this.aBoolean343) {
				this.aClass59_5 = this.aClass59_5.method5737((byte) 0, local72, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZLclient!za;Z)Lclient!uo;")
	private Class247 method3967(@OriginalArg(0) int arg0, @OriginalArg(2) Class163 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class192 local13 = Static50.aClass190_1.method4218(this.aShort58 & 0xFFFF);
		@Pc(27) Class162 local27;
		@Pc(35) Class162 local35;
		if (this.aBoolean344) {
			local35 = Static314.aClass162Array2[0];
			local27 = Static109.aClass162Array1[this.aByte57];
		} else {
			local27 = Static314.aClass162Array2[this.aByte57];
			if (this.aByte57 >= 3) {
				local35 = null;
			} else {
				local35 = Static314.aClass162Array2[this.aByte57 + 1];
			}
		}
		return local13.method4234(22, arg0, super.anInt6616, super.anInt6617, local35, arg1, local27, super.anInt6620, this.aByte56, arg2);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5293(@OriginalArg(0) Class163 arg0) {
		@Pc(25) Class2_Sub5_Sub7 local25;
		if (this.aClass2_Sub5_Sub7_4 == null && this.aBoolean345) {
			@Pc(18) Class247 local18 = this.method3967(262144, arg0, true);
			local25 = local18 == null ? null : local18.aClass2_Sub5_Sub7_5;
		} else {
			local25 = this.aClass2_Sub5_Sub7_4;
			this.aClass2_Sub5_Sub7_4 = null;
		}
		if (local25 != null) {
			Static357.method4497(local25, this.aByte57, super.anInt6616, super.anInt6620, null);
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)I")
	@Override
	public int method5298() {
		return this.aByte56;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(9) Class59 local9 = this.method3969(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class31 local14 = arg2.method5539();
			local14.U(super.anInt6616, super.anInt6617, super.anInt6620);
			return local9.method5748(arg1, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
	@Override
	public int method5296() {
		return 22;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5295() {
		return this.aBoolean345;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		if (arg0 instanceof Class3_Sub5_Sub1) {
			@Pc(11) Class3_Sub5_Sub1 local11 = (Class3_Sub5_Sub1) arg0;
			if (this.aClass59_5 != null && local11.aClass59_5 != null) {
				this.aClass59_5.method5743(local11.aClass59_5, arg1, arg4, arg3, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	@Override
	public Class59 method5291(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1) {
		return this.method3969(arg1, arg0);
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5294(@OriginalArg(0) Class163 arg0) {
		@Pc(18) Class2_Sub5_Sub7 local18;
		if (this.aClass2_Sub5_Sub7_4 == null && this.aBoolean345) {
			@Pc(29) Class247 local29 = this.method3967(262144, arg0, true);
			local18 = local29 == null ? null : local29.aClass2_Sub5_Sub7_5;
		} else {
			local18 = this.aClass2_Sub5_Sub7_4;
			this.aClass2_Sub5_Sub7_4 = null;
		}
		if (local18 != null) {
			Static92.method1462(local18, this.aByte57, super.anInt6616, super.anInt6620, null);
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	@Override
	public void method5297() {
		if (this.aClass59_5 != null) {
			this.aClass59_5.method5745();
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!za;I)Lclient!e;")
	private Class59 method3969(@OriginalArg(1) Class163 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass59_5 != null && arg0.method5502(this.aClass59_5.RA(), arg1) == 0) {
			return this.aClass59_5;
		} else {
			@Pc(30) Class247 local30 = this.method3967(arg1, arg0, false);
			return local30 == null ? null : local30.aClass59_6;
		}
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
	@Override
	public void method5284() {
		this.aBoolean343 = false;
		if (this.aClass59_5 != null) {
			this.aClass59_5.D(this.aClass59_5.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5277() {
		return this.aBoolean343;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)I")
	@Override
	public int method5292() {
		return this.aShort58 & 0xFFFF;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		if (this.aClass59_5 == null) {
			return null;
		}
		@Pc(16) Class31 local16 = arg0.method5539();
		local16.U(super.anInt6616, super.anInt6617, super.anInt6620);
		@Pc(26) Class21_Sub6 local26 = null;
		if (this.aBoolean342) {
			local26 = Static209.method2805(1);
		}
		this.aClass59_5.method5736(local16, local26 == null ? null : local26.aClass21_Sub7Array1[0], 0);
		return local26;
	}
}
