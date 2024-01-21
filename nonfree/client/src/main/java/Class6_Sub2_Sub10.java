import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class6_Sub2_Sub10 extends Class6_Sub2 {

	@OriginalMember(owner = "client!sa", name = "lb", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!sa", name = "db", descriptor = "Z")
	public boolean aBoolean117 = false;

	@OriginalMember(owner = "client!sa", name = "cb", descriptor = "I")
	public int anInt2516 = -1;

	@OriginalMember(owner = "client!sa", name = "rb", descriptor = "[I")
	private final int[] anIntArray241 = new int[6];

	@OriginalMember(owner = "client!sa", name = "wb", descriptor = "[I")
	private final int[] anIntArray244 = new int[6];

	@OriginalMember(owner = "client!sa", name = "tb", descriptor = "[I")
	private final int[] anIntArray242 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BLclient!b;)V")
	public void method1717(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method1495();
			if (local17 == 0) {
				return;
			}
			this.method1724(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)Z")
	public boolean method1719() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray242[local9] != -1 && !Static15.aClass40_14.method1223(this.anIntArray242[local9], 0)) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method1720() {
		@Pc(8) Class6_Sub2_Sub3_Sub3[] local8 = new Class6_Sub2_Sub3_Sub3[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray242[local12] != -1) {
				local8[local10++] = Static42.method974(Static15.aClass40_14, this.anIntArray242[local12]);
			}
		}
		@Pc(49) Class6_Sub2_Sub3_Sub3 local49 = new Class6_Sub2_Sub3_Sub3(local8, local10);
		for (@Pc(51) int local51 = 0; local51 < 6 && this.anIntArray244[local51] != 0; local51++) {
			local49.method961(this.anIntArray244[local51], this.anIntArray241[local51]);
		}
		return local49;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)Z")
	public boolean method1722() {
		if (this.anIntArray240 == null) {
			return true;
		}
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray240.length; local22++) {
			if (!Static15.aClass40_14.method1223(this.anIntArray240[local22], 0)) {
				local20 = false;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)Lclient!jb;")
	public Class6_Sub2_Sub3_Sub3 method1723() {
		if (this.anIntArray240 == null) {
			return null;
		}
		@Pc(22) Class6_Sub2_Sub3_Sub3[] local22 = new Class6_Sub2_Sub3_Sub3[this.anIntArray240.length];
		for (@Pc(24) int local24 = 0; local24 < this.anIntArray240.length; local24++) {
			local22[local24] = Static42.method974(Static15.aClass40_14, this.anIntArray240[local24]);
		}
		@Pc(55) Class6_Sub2_Sub3_Sub3 local55;
		if (local22.length == 1) {
			local55 = local22[0];
		} else {
			local55 = new Class6_Sub2_Sub3_Sub3(local22, local22.length);
		}
		for (@Pc(63) int local63 = 0; local63 < 6 && this.anIntArray244[local63] != 0; local63++) {
			local55.method961(this.anIntArray244[local63], this.anIntArray241[local63]);
		}
		return local55;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILclient!b;)V")
	private void method1724(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt2516 = arg1.method1495();
		} else if (arg0 == 2) {
			@Pc(15) int local15 = arg1.method1495();
			this.anIntArray240 = new int[local15];
			for (@Pc(21) int local21 = 0; local21 < local15; local21++) {
				this.anIntArray240[local21] = arg1.method1500();
			}
		} else if (arg0 == 3) {
			this.aBoolean117 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.anIntArray244[arg0 - 40] = arg1.method1500();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.anIntArray241[arg0 - 50] = arg1.method1500();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray242[arg0 - 60] = arg1.method1500();
		}
	}
}
