import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class3_Sub4_Sub6 extends Class3_Sub4 implements Interface2 {

	@OriginalMember(owner = "client!uu", name = "P", descriptor = "Z")
	private boolean aBoolean494;

	@OriginalMember(owner = "client!uu", name = "S", descriptor = "S")
	private final short aShort93;

	@OriginalMember(owner = "client!uu", name = "gb", descriptor = "Z")
	private final boolean aBoolean498;

	@OriginalMember(owner = "client!uu", name = "fb", descriptor = "Z")
	private final boolean aBoolean497;

	@OriginalMember(owner = "client!uu", name = "T", descriptor = "B")
	private final byte aByte93;

	@OriginalMember(owner = "client!uu", name = "X", descriptor = "B")
	private final byte aByte94;

	@OriginalMember(owner = "client!uu", name = "db", descriptor = "B")
	private final byte aByte95;

	@OriginalMember(owner = "client!uu", name = "F", descriptor = "Z")
	private final boolean aBoolean493;

	@OriginalMember(owner = "client!uu", name = "G", descriptor = "Lclient!e;")
	public Class59 aClass59_7;

	@OriginalMember(owner = "client!uu", name = "K", descriptor = "Lclient!i;")
	private Class2_Sub5_Sub7 aClass2_Sub5_Sub7_6;

	static {
		new Class134("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
	}

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!za;Lclient!pm;IIIIIZIIIIIIZ)V")
	public Class3_Sub4_Sub6(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class192 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.anInt5339 == 1, Static301.method2670(arg13, arg12));
		this.aBoolean494 = arg14;
		this.aShort93 = (short) arg1.anInt5325;
		this.aBoolean498 = arg1.anInt5357 != 0 && !arg7;
		this.aBoolean497 = arg7;
		this.aByte93 = (byte) arg13;
		this.aByte94 = (byte) arg3;
		this.aByte95 = (byte) arg12;
		this.aBoolean493 = arg0.method5544() && arg1.aBoolean392 && !this.aBoolean497 && Static2.aClass148_Sub1_1.method3036(Static288.anInt4743) != 0;
		@Pc(80) int local80 = 2048;
		if (this.aBoolean494) {
			local80 |= 0x10000;
		}
		@Pc(95) Class247 local95 = this.method5300(arg0, local80, this.aBoolean493);
		if (local95 != null) {
			this.aClass59_7 = local95.aClass59_6;
			this.aClass2_Sub5_Sub7_6 = local95.aClass2_Sub5_Sub7_5;
			if (this.aBoolean494) {
				this.aClass59_7 = this.aClass59_7.method5737((byte) 0, local80, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5293(@OriginalArg(0) Class163 arg0) {
		@Pc(19) Class2_Sub5_Sub7 local19;
		if (this.aClass2_Sub5_Sub7_6 == null && this.aBoolean493) {
			@Pc(30) Class247 local30 = this.method5300(arg0, 262144, true);
			local19 = local30 == null ? null : local30.aClass2_Sub5_Sub7_5;
		} else {
			local19 = this.aClass2_Sub5_Sub7_6;
			this.aClass2_Sub5_Sub7_6 = null;
		}
		if (local19 != null) {
			Static357.method4497(local19, this.aByte94, super.anInt6833, super.anInt6835, null);
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(B)I")
	@Override
	public int method5298() {
		return this.aByte93;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method5295() {
		return this.aBoolean493;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBILclient!za;)Z")
	@Override
	public boolean method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class163 arg2) {
		@Pc(9) Class59 local9 = this.method5303(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class31 local14 = arg2.method5539();
			local14.U(super.anInt6833, super.anInt6832, super.anInt6835);
			return local9.method5748(arg1, arg0, local14, false);
		}
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5277() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V")
	@Override
	public void method5297() {
		if (this.aClass59_7 != null) {
			this.aClass59_7.method5745();
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	@Override
	public Class59 method5291(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1) {
		return this.method5303(arg1, arg0);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!lb;IZIBILclient!za;)V")
	@Override
	public void method5281(@OriginalArg(0) Class3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class163 arg5) {
		if (arg0 instanceof Class3_Sub2_Sub2) {
			@Pc(13) Class3_Sub2_Sub2 local13 = (Class3_Sub2_Sub2) arg0;
			if (this.aClass59_7 != null && local13.aClass59_3 != null) {
				this.aClass59_7.method5743(local13.aClass59_3, arg1, arg4, arg3, arg2);
			}
		} else if (arg0 instanceof Class3_Sub4_Sub6) {
			@Pc(35) Class3_Sub4_Sub6 local35 = (Class3_Sub4_Sub6) arg0;
			if (this.aClass59_7 != null && local35.aClass59_7 != null) {
				this.aClass59_7.method5743(local35.aClass59_7, arg1, arg4, arg3, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "(I)I")
	@Override
	public int method5286() {
		return this.aClass59_7 == null ? 0 : this.aClass59_7.B();
	}

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5294(@OriginalArg(0) Class163 arg0) {
		@Pc(29) Class2_Sub5_Sub7 local29;
		if (this.aClass2_Sub5_Sub7_6 == null && this.aBoolean493) {
			@Pc(22) Class247 local22 = this.method5300(arg0, 262144, true);
			local29 = local22 == null ? null : local22.aClass2_Sub5_Sub7_5;
		} else {
			local29 = this.aClass2_Sub5_Sub7_6;
			this.aClass2_Sub5_Sub7_6 = null;
		}
		if (local29 != null) {
			Static92.method1462(local29, this.aByte94, super.anInt6833, super.anInt6835, null);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLclient!za;)Lclient!ql;")
	@Override
	public Class21_Sub6 method5280(@OriginalArg(1) Class163 arg0) {
		if (this.aClass59_7 == null) {
			return null;
		}
		@Pc(16) Class31 local16 = arg0.method5539();
		local16.U(super.anInt6833, super.anInt6832, super.anInt6835);
		@Pc(26) Class21_Sub6 local26 = null;
		if (this.aBoolean498) {
			local26 = Static209.method2805(1);
		}
		this.aClass59_7.method5736(local16, local26 == null ? null : local26.aClass21_Sub7Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)V")
	@Override
	public void method5284() {
		this.aBoolean494 = false;
		if (this.aClass59_7 != null) {
			this.aClass59_7.D(this.aClass59_7.RA() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!za;IZI)Lclient!uo;")
	private Class247 method5300(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(13) Class192 local13 = Static50.aClass190_1.method4218(this.aShort93 & 0xFFFF);
		@Pc(38) Class162 local38;
		@Pc(29) Class162 local29;
		if (this.aBoolean497) {
			local29 = Static314.aClass162Array2[0];
			local38 = Static109.aClass162Array1[this.aByte94];
		} else {
			if (this.aByte94 < 3) {
				local29 = Static314.aClass162Array2[this.aByte94 + 1];
			} else {
				local29 = null;
			}
			local38 = Static314.aClass162Array2[this.aByte94];
		}
		return local13.method4234(this.aByte95 == 11 ? 10 : this.aByte95, arg1, super.anInt6833, super.anInt6832, local29, arg0, local38, super.anInt6835, this.aByte95 == 11 ? this.aByte93 + 4 : this.aByte93, arg2);
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(Lclient!za;I)V")
	@Override
	public void method5285(@OriginalArg(0) Class163 arg0) {
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)I")
	@Override
	public int method5296() {
		return this.aByte95;
	}

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "(B)I")
	public int method5302() {
		return this.aClass59_7 == null ? 15 : this.aClass59_7.k() / 4;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!za;IB)Lclient!e;")
	private Class59 method5303(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass59_7 != null && arg0.method5502(this.aClass59_7.RA(), arg1) == 0) {
			return this.aClass59_7;
		} else {
			@Pc(28) Class247 local28 = this.method5300(arg0, arg1, false);
			return local28 == null ? null : local28.aClass59_6;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)I")
	@Override
	public int method5292() {
		return this.aShort93 & 0xFFFF;
	}
}
