import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ba", name = "K", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!ba", name = "N", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!ba", name = "R", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!ba", name = "V", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
	public int anInt299;

	@OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
	private int anInt295 = 0;

	@OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
	public int anInt294 = -1;

	@OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
	private int anInt285 = 0;

	@OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
	private int anInt289 = 128;

	@OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
	private int anInt291 = 128;

	@OriginalMember(owner = "client!ba", name = "hb", descriptor = "Z")
	public boolean aBoolean13 = false;

	@OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
	private int anInt297 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!fj;I)V")
	private void method294(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt293 = arg1.method2765();
		} else if (arg0 == 2) {
			this.anInt294 = arg1.method2765();
		} else if (arg0 == 4) {
			this.anInt289 = arg1.method2765();
		} else if (arg0 == 5) {
			this.anInt291 = arg1.method2765();
		} else if (arg0 == 6) {
			this.anInt285 = arg1.method2765();
		} else if (arg0 == 7) {
			this.anInt297 = arg1.method2771();
			return;
		} else if (arg0 == 8) {
			this.anInt295 = arg1.method2771();
			return;
		} else if (arg0 == 9) {
			this.aBoolean13 = true;
			return;
		} else {
			@Pc(89) int local89;
			@Pc(99) int local99;
			if (arg0 == 40) {
				local89 = arg1.method2771();
				this.aShortArray16 = new short[local89];
				this.aShortArray18 = new short[local89];
				for (local99 = 0; local99 < local89; local99++) {
					this.aShortArray16[local99] = (short) arg1.method2765();
					this.aShortArray18[local99] = (short) arg1.method2765();
				}
				return;
			}
			if (arg0 == 41) {
				local89 = arg1.method2771();
				this.aShortArray15 = new short[local89];
				this.aShortArray17 = new short[local89];
				for (local99 = 0; local99 < local89; local99++) {
					this.aShortArray17[local99] = (short) arg1.method2765();
					this.aShortArray15[local99] = (short) arg1.method2765();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZI)Lclient!lg;")
	public Class5_Sub1 method299(@OriginalArg(1) int arg0) {
		@Pc(20) Class5_Sub1 local20 = (Class5_Sub1) Static156.aClass46_10.method1588((long) this.anInt299);
		if (local20 == null) {
			@Pc(28) Class5_Sub6 local28 = Static171.method2955(Static37.aClass69_9, this.anInt293);
			if (local28 == null) {
				return null;
			}
			@Pc(37) int local37;
			if (this.aShortArray16 != null) {
				for (local37 = 0; local37 < this.aShortArray16.length; local37++) {
					local28.method2936(this.aShortArray16[local37], this.aShortArray18[local37]);
				}
			}
			if (this.aShortArray17 != null) {
				for (local37 = 0; local37 < this.aShortArray17.length; local37++) {
					local28.method2934(this.aShortArray17[local37], this.aShortArray15[local37]);
				}
			}
			local20 = local28.method2942(this.anInt297 + 64, this.anInt295 + 850, -30, -50, -30);
			Static156.aClass46_10.method1586(local20, (long) this.anInt299);
		}
		@Pc(120) Class5_Sub1 local120;
		if (this.anInt294 == -1 || arg0 == -1) {
			local120 = local20.method162(true);
		} else {
			local120 = Static85.method2622(this.anInt294).method3076(arg0, local20);
		}
		if (this.anInt289 != 128 || this.anInt291 != 128) {
			local120.method154(this.anInt289, this.anInt291, this.anInt289);
		}
		if (this.anInt285 != 0) {
			if (this.anInt285 == 90) {
				local120.method168();
			}
			if (this.anInt285 == 180) {
				local120.method157();
			}
			if (this.anInt285 == 270) {
				local120.method159();
			}
		}
		return local120;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLclient!fj;)V")
	public void method301(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method2771();
			if (local14 == 0) {
				return;
			}
			this.method294(local14, arg0);
		}
	}
}
