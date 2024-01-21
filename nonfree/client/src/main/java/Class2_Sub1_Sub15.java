import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class2_Sub1_Sub15 extends Class2_Sub1 {

	@OriginalMember(owner = "client!re", name = "M", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!re", name = "N", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!re", name = "cb", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!re", name = "fb", descriptor = "[I")
	private int[] anIntArray330;

	@OriginalMember(owner = "client!re", name = "ib", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!re", name = "F", descriptor = "Z")
	public boolean aBoolean136 = false;

	@OriginalMember(owner = "client!re", name = "U", descriptor = "I")
	public int anInt3080 = -1;

	@OriginalMember(owner = "client!re", name = "hb", descriptor = "[I")
	private final int[] anIntArray331 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!va;I)V")
	private void method2192(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3080 = arg0.method1461();
			return;
		}
		@Pc(52) int local52;
		@Pc(62) int local62;
		if (arg1 == 2) {
			local52 = arg0.method1461();
			this.anIntArray330 = new int[local52];
			for (local62 = 0; local62 < local52; local62++) {
				this.anIntArray330[local62] = arg0.method1456();
			}
		} else if (arg1 == 3) {
			this.aBoolean136 = true;
		} else if (arg1 == 40) {
			local52 = arg0.method1461();
			this.aShortArray27 = new short[local52];
			this.aShortArray28 = new short[local52];
			for (local62 = 0; local62 < local52; local62++) {
				this.aShortArray27[local62] = (short) arg0.method1456();
				this.aShortArray28[local62] = (short) arg0.method1456();
			}
		} else if (arg1 == 41) {
			local52 = arg0.method1461();
			this.aShortArray26 = new short[local52];
			this.aShortArray25 = new short[local52];
			for (local62 = 0; local62 < local52; local62++) {
				this.aShortArray26[local62] = (short) arg0.method1456();
				this.aShortArray25[local62] = (short) arg0.method1456();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray331[arg1 - 60] = arg0.method1456();
			return;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)Lclient!v;")
	public Class2_Sub1_Sub3_Sub7 method2193() {
		if (this.anIntArray330 == null) {
			return null;
		}
		@Pc(20) Class2_Sub1_Sub3_Sub7[] local20 = new Class2_Sub1_Sub3_Sub7[this.anIntArray330.length];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray330.length; local22++) {
			local20[local22] = Static166.method2551(Static103.aClass29_45, this.anIntArray330[local22]);
		}
		@Pc(57) Class2_Sub1_Sub3_Sub7 local57;
		if (local20.length == 1) {
			local57 = local20[0];
		} else {
			local57 = new Class2_Sub1_Sub3_Sub7(local20, local20.length);
		}
		@Pc(68) int local68;
		if (this.aShortArray27 != null) {
			for (local68 = 0; local68 < this.aShortArray27.length; local68++) {
				local57.method2566(this.aShortArray27[local68], this.aShortArray28[local68]);
			}
		}
		if (this.aShortArray26 != null) {
			for (local68 = 0; local68 < this.aShortArray26.length; local68++) {
				local57.method2567(this.aShortArray26[local68], this.aShortArray25[local68]);
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "(I)Z")
	public boolean method2194() {
		if (this.anIntArray330 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray330.length; local14++) {
			if (!Static103.aClass29_45.method1016(this.anIntArray330[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!va;I)V")
	public void method2195(@OriginalArg(0) Class2_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1461();
			if (local5 == 0) {
				return;
			}
			this.method2192(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)Lclient!v;")
	public Class2_Sub1_Sub3_Sub7 method2198() {
		@Pc(12) int local12 = 0;
		@Pc(15) Class2_Sub1_Sub3_Sub7[] local15 = new Class2_Sub1_Sub3_Sub7[5];
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray331[local17] != -1) {
				local15[local12++] = Static166.method2551(Static103.aClass29_45, this.anIntArray331[local17]);
			}
		}
		@Pc(48) Class2_Sub1_Sub3_Sub7 local48 = new Class2_Sub1_Sub3_Sub7(local15, local12);
		@Pc(53) int local53;
		if (this.aShortArray27 != null) {
			for (local53 = 0; local53 < this.aShortArray27.length; local53++) {
				local48.method2566(this.aShortArray27[local53], this.aShortArray28[local53]);
			}
		}
		if (this.aShortArray26 != null) {
			for (local53 = 0; local53 < this.aShortArray26.length; local53++) {
				local48.method2567(this.aShortArray26[local53], this.aShortArray25[local53]);
			}
		}
		return local48;
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)Z")
	public boolean method2200() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray331[local9] != -1 && !Static103.aClass29_45.method1016(this.anIntArray331[local9], 0)) {
				local7 = false;
			}
		}
		return local7;
	}
}
