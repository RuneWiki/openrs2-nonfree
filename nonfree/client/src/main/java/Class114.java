import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class114 {

	@OriginalMember(owner = "client!n", name = "b", descriptor = "I")
	private int anInt3470;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!n", name = "k", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "I")
	public int anInt3483;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "I")
	private int anInt3476 = 0;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
	public boolean aBoolean234 = false;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "I")
	public int anInt3473 = -1;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "I")
	private int anInt3478 = 128;

	@OriginalMember(owner = "client!n", name = "i", descriptor = "I")
	private int anInt3474 = 128;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "I")
	private int anInt3471 = 0;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "I")
	private int anInt3475 = 0;

	@OriginalMember(owner = "client!n", name = "w", descriptor = "Z")
	public boolean aBoolean235 = false;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)Lclient!bf;")
	public Class15_Sub2 method2985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(13) Class15_Sub2 local13 = (Class15_Sub2) Static131.aClass187_71.method4527((long) this.anInt3483);
		if (local13 == null) {
			@Pc(23) Class15_Sub6 local23 = Static241.method3755(Static232.aClass121_101, this.anInt3470);
			if (local23 == null) {
				return null;
			}
			@Pc(33) int local33;
			if (this.aShortArray61 != null) {
				for (local33 = 0; local33 < this.aShortArray61.length; local33++) {
					local23.method3775(this.aShortArray61[local33], this.aShortArray64[local33]);
				}
			}
			if (this.aShortArray62 != null) {
				for (local33 = 0; local33 < this.aShortArray62.length; local33++) {
					local23.method3767(this.aShortArray62[local33], this.aShortArray63[local33]);
				}
			}
			local13 = local23.method3760(this.anInt3475 + 64, this.anInt3471 + 850, -30, -50, -30);
			Static131.aClass187_71.method4524((long) this.anInt3483, local13);
		}
		@Pc(125) Class15_Sub2 local125;
		if (this.anInt3473 == -1 || arg2 == -1) {
			local125 = local13.method1032(true, true, true);
		} else {
			local125 = Static80.method1561(this.anInt3473).method3942(arg0, arg2, local13, arg1);
		}
		if (this.anInt3478 != 128 || this.anInt3474 != 128) {
			local125.method1040(this.anInt3478, this.anInt3474, this.anInt3478);
		}
		if (this.anInt3476 != 0) {
			if (this.anInt3476 == 90) {
				local125.method1042();
			}
			if (this.anInt3476 == 180) {
				local125.method1045();
			}
			if (this.anInt3476 == 270) {
				local125.method1025();
			}
		}
		return local125;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!lf;I)V")
	public void method2989(@OriginalArg(0) Class1_Sub14 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1378();
			if (local14 == 0) {
				return;
			}
			this.method2990(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BILclient!lf;)V")
	private void method2990(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 1) {
			this.anInt3470 = arg1.method1386();
		} else if (arg0 == 2) {
			this.anInt3473 = arg1.method1386();
		} else if (arg0 == 4) {
			this.anInt3478 = arg1.method1386();
		} else if (arg0 == 5) {
			this.anInt3474 = arg1.method1386();
		} else if (arg0 == 6) {
			this.anInt3476 = arg1.method1386();
		} else if (arg0 == 7) {
			this.anInt3475 = arg1.method1378();
		} else if (arg0 == 8) {
			this.anInt3471 = arg1.method1378();
		} else if (arg0 == 9) {
			this.aBoolean234 = true;
		} else if (arg0 == 10) {
			this.aBoolean235 = true;
		} else {
			@Pc(84) int local84;
			@Pc(94) int local94;
			if (arg0 == 40) {
				local84 = arg1.method1378();
				this.aShortArray61 = new short[local84];
				this.aShortArray64 = new short[local84];
				for (local94 = 0; local94 < local84; local94++) {
					this.aShortArray61[local94] = (short) arg1.method1386();
					this.aShortArray64[local94] = (short) arg1.method1386();
				}
			} else if (arg0 == 41) {
				local84 = arg1.method1378();
				this.aShortArray63 = new short[local84];
				this.aShortArray62 = new short[local84];
				for (local94 = 0; local94 < local84; local94++) {
					this.aShortArray62[local94] = (short) arg1.method1386();
					this.aShortArray63[local94] = (short) arg1.method1386();
				}
			}
		}
	}
}
