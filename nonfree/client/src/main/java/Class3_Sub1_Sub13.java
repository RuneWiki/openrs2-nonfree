import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ne", name = "hb", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!ne", name = "Y", descriptor = "[I")
	private final int[] anIntArray223 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ne", name = "X", descriptor = "[S")
	private final short[] aShortArray16 = new short[6];

	@OriginalMember(owner = "client!ne", name = "kb", descriptor = "Z")
	public boolean aBoolean126 = false;

	@OriginalMember(owner = "client!ne", name = "cb", descriptor = "[S")
	private final short[] aShortArray17 = new short[6];

	@OriginalMember(owner = "client!ne", name = "sb", descriptor = "I")
	public int anInt2245 = -1;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)Lclient!fe;")
	public Class3_Sub1_Sub5_Sub2 method1412() {
		if (this.anIntArray224 == null) {
			return null;
		}
		@Pc(15) Class3_Sub1_Sub5_Sub2[] local15 = new Class3_Sub1_Sub5_Sub2[this.anIntArray224.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray224.length; local17++) {
			local15[local17] = Static34.method676(Static102.aClass16_127, this.anIntArray224[local17]);
		}
		@Pc(60) Class3_Sub1_Sub5_Sub2 local60;
		if (local15.length == 1) {
			local60 = local15[0];
		} else {
			local60 = new Class3_Sub1_Sub5_Sub2(local15, local15.length);
		}
		for (@Pc(68) int local68 = 0; local68 < 6 && this.aShortArray16[local68] != 0; local68++) {
			local60.method693(this.aShortArray16[local68], this.aShortArray17[local68]);
		}
		return local60;
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Z")
	public boolean method1413() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray223[local9] != -1 && !Static102.aClass16_127.method559(this.anIntArray223[local9], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILclient!m;)V")
	private void method1414(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt2245 = arg1.method981();
		} else if (arg0 == 2) {
			@Pc(91) int local91 = arg1.method981();
			this.anIntArray224 = new int[local91];
			for (@Pc(97) int local97 = 0; local97 < local91; local97++) {
				this.anIntArray224[local97] = arg1.method974();
			}
		} else if (arg0 == 3) {
			this.aBoolean126 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray16[arg0 - 40] = (short) arg1.method974();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray17[arg0 - 50] = (short) arg1.method974();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray223[arg0 - 60] = arg1.method974();
		}
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)Z")
	public boolean method1417() {
		if (this.anIntArray224 == null) {
			return true;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray224.length; local20++) {
			if (!Static102.aClass16_127.method559(this.anIntArray224[local20], 0)) {
				local18 = false;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!m;I)V")
	public void method1419(@OriginalArg(0) Class3_Sub11 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method981();
			if (local5 == 0) {
				return;
			}
			this.method1414(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)Lclient!fe;")
	public Class3_Sub1_Sub5_Sub2 method1420() {
		@Pc(4) Class3_Sub1_Sub5_Sub2[] local4 = new Class3_Sub1_Sub5_Sub2[5];
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray223[local17] != -1) {
				local4[local10++] = Static34.method676(Static102.aClass16_127, this.anIntArray223[local17]);
			}
		}
		@Pc(49) Class3_Sub1_Sub5_Sub2 local49 = new Class3_Sub1_Sub5_Sub2(local4, local10);
		for (@Pc(51) int local51 = 0; local51 < 6 && this.aShortArray16[local51] != 0; local51++) {
			local49.method693(this.aShortArray16[local51], this.aShortArray17[local51]);
		}
		return local49;
	}
}
