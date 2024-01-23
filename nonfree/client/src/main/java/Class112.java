import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class112 {

	@OriginalMember(owner = "client!li", name = "i", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!li", name = "l", descriptor = "I")
	private int anInt3136;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "I")
	public int anInt3138;

	@OriginalMember(owner = "client!li", name = "v", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!li", name = "w", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!li", name = "x", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	private int anInt3130 = 0;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "I")
	public int anInt3134 = -1;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "I")
	private int anInt3133 = 128;

	@OriginalMember(owner = "client!li", name = "u", descriptor = "I")
	private int anInt3144 = 128;

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	private int anInt3137 = 0;

	@OriginalMember(owner = "client!li", name = "s", descriptor = "Z")
	public boolean aBoolean222 = false;

	@OriginalMember(owner = "client!li", name = "d", descriptor = "I")
	private int anInt3132 = 0;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!fd;)V")
	private void method2577(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt3136 = arg1.method4653();
		} else if (arg0 == 2) {
			this.anInt3134 = arg1.method4653();
		} else if (arg0 == 4) {
			this.anInt3133 = arg1.method4653();
		} else if (arg0 == 5) {
			this.anInt3144 = arg1.method4653();
		} else if (arg0 == 6) {
			this.anInt3137 = arg1.method4653();
		} else if (arg0 == 7) {
			this.anInt3130 = arg1.method4666();
		} else if (arg0 == 8) {
			this.anInt3132 = arg1.method4666();
		} else if (arg0 == 9) {
			this.aBoolean221 = true;
		} else if (arg0 == 10) {
			this.aBoolean222 = true;
		} else {
			@Pc(93) int local93;
			@Pc(103) int local103;
			if (arg0 == 40) {
				local93 = arg1.method4666();
				this.aShortArray45 = new short[local93];
				this.aShortArray49 = new short[local93];
				for (local103 = 0; local103 < local93; local103++) {
					this.aShortArray49[local103] = (short) arg1.method4653();
					this.aShortArray45[local103] = (short) arg1.method4653();
				}
			} else if (arg0 == 41) {
				local93 = arg1.method4666();
				this.aShortArray47 = new short[local93];
				this.aShortArray48 = new short[local93];
				for (local103 = 0; local103 < local93; local103++) {
					this.aShortArray47[local103] = (short) arg1.method4653();
					this.aShortArray48[local103] = (short) arg1.method4653();
				}
			}
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!fd;Z)V")
	public void method2581(@OriginalArg(0) Class4_Sub10 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method4666();
			if (local9 == 0) {
				return;
			}
			this.method2577(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIB)Lclient!vg;")
	public Class53_Sub4 method2582(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class53_Sub4 local9 = (Class53_Sub4) Static296.aClass26_57.method518((long) this.anInt3138);
		if (local9 == null) {
			@Pc(22) Class53_Sub3 local22 = Static176.method2765(Static138.aClass58_64, this.anInt3136);
			if (local22 == null) {
				return null;
			}
			@Pc(34) int local34;
			if (this.aShortArray49 != null) {
				for (local34 = 0; local34 < this.aShortArray49.length; local34++) {
					local22.method2781(this.aShortArray49[local34], this.aShortArray45[local34]);
				}
			}
			if (this.aShortArray47 != null) {
				for (local34 = 0; local34 < this.aShortArray47.length; local34++) {
					local22.method2766(this.aShortArray47[local34], this.aShortArray48[local34]);
				}
			}
			local9 = local22.method2774(this.anInt3130 + 64, this.anInt3132 + 850, -30, -50, -30);
			Static296.aClass26_57.method510(local9, (long) this.anInt3138);
		}
		@Pc(113) Class53_Sub4 local113;
		if (this.anInt3134 == -1 || arg2 == -1) {
			local113 = local9.method3873(true, true, true);
		} else {
			local113 = Static156.method2501(this.anInt3134).method1018(arg2, arg1, local9, arg0);
		}
		if (this.anInt3133 != 128 || this.anInt3144 != 128) {
			local113.method3861(this.anInt3133, this.anInt3144, this.anInt3133);
		}
		if (this.anInt3137 != 0) {
			if (this.anInt3137 == 90) {
				local113.method3857();
			}
			if (this.anInt3137 == 180) {
				local113.method3865();
			}
			if (this.anInt3137 == 270) {
				local113.method3864();
			}
		}
		return local113;
	}
}
