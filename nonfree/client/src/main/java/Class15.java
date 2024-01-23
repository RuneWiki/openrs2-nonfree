import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class15 {

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
	public int anInt519;

	@OriginalMember(owner = "client!bk", name = "h", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
	private int anInt524 = 0;

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
	public int anInt518 = -1;

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "I")
	private int anInt526 = 0;

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "Z")
	public boolean aBoolean53 = false;

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
	private int anInt528 = 128;

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Z")
	public boolean aBoolean52 = false;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
	private int anInt517 = 0;

	@OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
	private int anInt527 = 128;

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!fh;II)V")
	private void method494(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt523 = arg0.method1879();
		} else if (arg1 == 2) {
			this.anInt518 = arg0.method1879();
		} else if (arg1 == 4) {
			this.anInt527 = arg0.method1879();
		} else if (arg1 == 5) {
			this.anInt528 = arg0.method1879();
		} else if (arg1 == 6) {
			this.anInt526 = arg0.method1879();
		} else if (arg1 == 7) {
			this.anInt524 = arg0.method1853();
		} else if (arg1 == 8) {
			this.anInt517 = arg0.method1853();
		} else if (arg1 == 9) {
			this.aBoolean52 = true;
		} else if (arg1 == 10) {
			this.aBoolean53 = true;
		} else {
			@Pc(89) int local89;
			@Pc(99) int local99;
			if (arg1 == 40) {
				local89 = arg0.method1853();
				this.aShortArray21 = new short[local89];
				this.aShortArray19 = new short[local89];
				for (local99 = 0; local99 < local89; local99++) {
					this.aShortArray21[local99] = (short) arg0.method1879();
					this.aShortArray19[local99] = (short) arg0.method1879();
				}
			} else if (arg1 == 41) {
				local89 = arg0.method1853();
				this.aShortArray18 = new short[local89];
				this.aShortArray20 = new short[local89];
				for (local99 = 0; local99 < local89; local99++) {
					this.aShortArray20[local99] = (short) arg0.method1879();
					this.aShortArray18[local99] = (short) arg0.method1879();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)Lclient!sm;")
	public Class11_Sub1 method496(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class11_Sub1 local13 = (Class11_Sub1) Static281.aClass175_2.method4295((long) this.anInt519);
		if (local13 == null) {
			@Pc(22) Class11_Sub5 local22 = Static180.method3074(Static238.aClass119_67, this.anInt523);
			if (local22 == null) {
				return null;
			}
			@Pc(34) int local34;
			if (this.aShortArray21 != null) {
				for (local34 = 0; local34 < this.aShortArray21.length; local34++) {
					local22.method3053(this.aShortArray21[local34], this.aShortArray19[local34]);
				}
			}
			if (this.aShortArray20 != null) {
				for (local34 = 0; local34 < this.aShortArray20.length; local34++) {
					local22.method3079(this.aShortArray20[local34], this.aShortArray18[local34]);
				}
			}
			local13 = local22.method3055(this.anInt524 + 64, 850 - -this.anInt517, -30, -50, -30);
			Static281.aClass175_2.method4285(local13, (long) this.anInt519);
		}
		@Pc(118) Class11_Sub1 local118;
		if (this.anInt518 == -1 || arg0 == -1) {
			local118 = local13.method2907(true, true, true);
		} else {
			local118 = Static107.method2016(this.anInt518).method3917(arg2, arg0, arg1, local13);
		}
		if (this.anInt527 != 128 || this.anInt528 != 128) {
			local118.method2902(this.anInt527, this.anInt528, this.anInt527);
		}
		if (this.anInt526 != 0) {
			if (this.anInt526 == 90) {
				local118.method2918();
			}
			if (this.anInt526 == 180) {
				local118.method2922();
			}
			if (this.anInt526 == 270) {
				local118.method2920();
			}
		}
		return local118;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!fh;B)V")
	public void method498(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method1853();
			if (local18 == 0) {
				return;
			}
			this.method494(arg0, local18);
		}
	}
}
