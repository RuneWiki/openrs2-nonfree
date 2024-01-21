import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class5_Sub2_Sub17 extends Class5_Sub2 {

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "I")
	public int anInt3304;

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
	private int anInt3311;

	@OriginalMember(owner = "client!rf", name = "W", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!rf", name = "Y", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
	private int anInt3308 = 128;

	@OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
	private int anInt3307 = 0;

	@OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
	public int anInt3309 = -1;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
	private int anInt3310 = 0;

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "I")
	private int anInt3314 = 0;

	@OriginalMember(owner = "client!rf", name = "eb", descriptor = "I")
	private int anInt3319 = 128;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!ce;)V")
	public void method2505(@OriginalArg(1) Class5_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3062();
			if (local5 == 0) {
				return;
			}
			this.method2510(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IB)Lclient!a;")
	public Class1_Sub1 method2506(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub1 local13 = (Class1_Sub1) Static73.aClass84_12.method2332((long) this.anInt3304);
		if (local13 == null) {
			@Pc(21) Class1_Sub5 local21 = Static112.method1814(Static154.aClass23_56, this.anInt3311);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray44 != null) {
				for (local30 = 0; local30 < this.aShortArray44.length; local30++) {
					local21.method1819(this.aShortArray44[local30], this.aShortArray43[local30]);
				}
			}
			if (this.aShortArray42 != null) {
				for (local30 = 0; local30 < this.aShortArray42.length; local30++) {
					local21.method1797(this.aShortArray42[local30], this.aShortArray45[local30]);
				}
			}
			local13 = local21.method1818(this.anInt3307 + 64, 850 - -this.anInt3310, -30, -50, -30);
			Static73.aClass84_12.method2331((long) this.anInt3304, local13);
		}
		@Pc(112) Class1_Sub1 local112;
		if (this.anInt3309 == -1 || arg0 == -1) {
			local112 = local13.method660(true, true);
		} else {
			local112 = Static14.method253(this.anInt3309).method2752(local13, arg0);
		}
		if (this.anInt3308 != 128 || this.anInt3319 != 128) {
			local112.method657(this.anInt3308, this.anInt3319, this.anInt3308);
		}
		if (this.anInt3314 != 0) {
			if (this.anInt3314 == 90) {
				local112.method664();
			}
			if (this.anInt3314 == 180) {
				local112.method661();
			}
			if (this.anInt3314 == 270) {
				local112.method662();
			}
		}
		return local112;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!ce;II)V")
	private void method2510(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt3311 = arg0.method3077();
		} else if (arg1 == 2) {
			this.anInt3309 = arg0.method3077();
		} else if (arg1 == 4) {
			this.anInt3308 = arg0.method3077();
		} else if (arg1 == 5) {
			this.anInt3319 = arg0.method3077();
		} else if (arg1 == 6) {
			this.anInt3314 = arg0.method3077();
		} else if (arg1 == 7) {
			this.anInt3307 = arg0.method3062();
		} else if (arg1 == 8) {
			this.anInt3310 = arg0.method3062();
		} else if (arg1 == 9) {
			this.aBoolean146 = true;
		} else {
			@Pc(71) int local71;
			@Pc(81) int local81;
			if (arg1 == 40) {
				local71 = arg0.method3062();
				this.aShortArray44 = new short[local71];
				this.aShortArray43 = new short[local71];
				for (local81 = 0; local81 < local71; local81++) {
					this.aShortArray44[local81] = (short) arg0.method3077();
					this.aShortArray43[local81] = (short) arg0.method3077();
				}
			} else if (arg1 == 41) {
				local71 = arg0.method3062();
				this.aShortArray42 = new short[local71];
				this.aShortArray45 = new short[local71];
				for (local81 = 0; local81 < local71; local81++) {
					this.aShortArray42[local81] = (short) arg0.method3077();
					this.aShortArray45[local81] = (short) arg0.method3077();
				}
			}
		}
	}
}
