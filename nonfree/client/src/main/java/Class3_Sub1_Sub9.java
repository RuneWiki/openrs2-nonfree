import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!h", name = "N", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!h", name = "P", descriptor = "[I")
	private int[] anIntArray145;

	@OriginalMember(owner = "client!h", name = "T", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!h", name = "W", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!h", name = "db", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!h", name = "O", descriptor = "Z")
	public boolean aBoolean91 = false;

	@OriginalMember(owner = "client!h", name = "Y", descriptor = "I")
	public int anInt1364 = -1;

	@OriginalMember(owner = "client!h", name = "eb", descriptor = "[I")
	private final int[] anIntArray146 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!h", name = "j", descriptor = "(I)Z")
	public boolean method1014() {
		if (this.anIntArray145 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray145.length; local14++) {
			if (!Static75.aClass13_15.method349(0, this.anIntArray145[local14])) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!h", name = "k", descriptor = "(I)Z")
	public boolean method1016() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray146[local9] != -1 && !Static75.aClass13_15.method349(0, this.anIntArray146[local9])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BILclient!ff;)V")
	private void method1017(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt1364 = arg1.method1354();
			return;
		}
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (arg0 == 2) {
			local20 = arg1.method1354();
			this.anIntArray145 = new int[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.anIntArray145[local26] = arg1.method1359();
			}
		} else if (arg0 == 3) {
			this.aBoolean91 = true;
		} else if (arg0 == 40) {
			local20 = arg1.method1354();
			this.aShortArray8 = new short[local20];
			this.aShortArray10 = new short[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.aShortArray8[local26] = (short) arg1.method1359();
				this.aShortArray10[local26] = (short) arg1.method1359();
			}
		} else if (arg0 == 41) {
			local20 = arg1.method1354();
			this.aShortArray9 = new short[local20];
			this.aShortArray11 = new short[local20];
			for (local26 = 0; local26 < local20; local26++) {
				this.aShortArray9[local26] = (short) arg1.method1359();
				this.aShortArray11[local26] = (short) arg1.method1359();
			}
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray146[arg0 - 60] = arg1.method1359();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)Lclient!lb;")
	public Class3_Sub1_Sub4_Sub4 method1018() {
		if (this.anIntArray145 == null) {
			return null;
		}
		@Pc(15) Class3_Sub1_Sub4_Sub4[] local15 = new Class3_Sub1_Sub4_Sub4[this.anIntArray145.length];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray145.length; local22++) {
			local15[local22] = Static89.method1571(Static75.aClass13_15, this.anIntArray145[local22]);
		}
		@Pc(55) Class3_Sub1_Sub4_Sub4 local55;
		if (local15.length == 1) {
			local55 = local15[0];
		} else {
			local55 = new Class3_Sub1_Sub4_Sub4(local15, local15.length);
		}
		@Pc(66) int local66;
		if (this.aShortArray8 != null) {
			for (local66 = 0; local66 < this.aShortArray8.length; local66++) {
				local55.method1552(this.aShortArray8[local66], this.aShortArray10[local66]);
			}
		}
		if (this.aShortArray9 != null) {
			for (local66 = 0; local66 < this.aShortArray9.length; local66++) {
				local55.method1565(this.aShortArray9[local66], this.aShortArray11[local66]);
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!ff;I)V")
	public void method1019(@OriginalArg(0) Class3_Sub12 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1354();
			if (local14 == 0) {
				return;
			}
			this.method1017(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "m", descriptor = "(I)Lclient!lb;")
	public Class3_Sub1_Sub4_Sub4 method1021() {
		@Pc(13) Class3_Sub1_Sub4_Sub4[] local13 = new Class3_Sub1_Sub4_Sub4[5];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray146[local17] != -1) {
				local13[local15++] = Static89.method1571(Static75.aClass13_15, this.anIntArray146[local17]);
			}
		}
		@Pc(46) Class3_Sub1_Sub4_Sub4 local46 = new Class3_Sub1_Sub4_Sub4(local13, local15);
		@Pc(51) int local51;
		if (this.aShortArray8 != null) {
			for (local51 = 0; local51 < this.aShortArray8.length; local51++) {
				local46.method1552(this.aShortArray8[local51], this.aShortArray10[local51]);
			}
		}
		if (this.aShortArray9 != null) {
			for (local51 = 0; local51 < this.aShortArray9.length; local51++) {
				local46.method1565(this.aShortArray9[local51], this.aShortArray11[local51]);
			}
		}
		return local46;
	}
}
