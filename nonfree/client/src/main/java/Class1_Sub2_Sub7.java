import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fg", name = "D", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!fg", name = "G", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
	private int anInt1209;

	@OriginalMember(owner = "client!fg", name = "U", descriptor = "I")
	public int anInt1218;

	@OriginalMember(owner = "client!fg", name = "Y", descriptor = "[S")
	private short[] aShortArray15;

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
	private int anInt1207 = 128;

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
	private int anInt1205 = 0;

	@OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
	private int anInt1210 = 0;

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
	public int anInt1217 = -1;

	@OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
	private int anInt1220 = 128;

	@OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
	private int anInt1222 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method912(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub2_Sub1_Sub4 local13 = (Class1_Sub2_Sub1_Sub4) Static172.aClass59_28.method1970((long) this.anInt1218);
		if (local13 == null) {
			@Pc(21) Class1_Sub2_Sub1_Sub6 local21 = Static159.method2767(Static140.aClass82_55, this.anInt1209);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray15 != null) {
				for (local30 = 0; local30 < this.aShortArray15.length; local30++) {
					local21.method2752(this.aShortArray15[local30], this.aShortArray13[local30]);
				}
			}
			if (this.aShortArray12 != null) {
				for (local30 = 0; local30 < this.aShortArray12.length; local30++) {
					local21.method2756(this.aShortArray12[local30], this.aShortArray14[local30]);
				}
			}
			local13 = local21.method2745(this.anInt1205 + 64, this.anInt1210 + 850, -30, -50, -30, true);
			Static172.aClass59_28.method1973(local13, (long) this.anInt1218);
		}
		@Pc(118) Class1_Sub2_Sub1_Sub4 local118;
		if (this.anInt1217 == -1 || arg0 == -1) {
			local118 = local13.method1461(true);
		} else {
			local118 = Static73.method1277(this.anInt1217).method2897(arg0, local13);
		}
		if (this.anInt1207 != 128 || this.anInt1220 != 128) {
			local118.method1457(this.anInt1207, this.anInt1220, this.anInt1207);
		}
		if (this.anInt1222 != 0) {
			if (this.anInt1222 == 90) {
				local118.method1453();
			}
			if (this.anInt1222 == 180) {
				local118.method1453();
				local118.method1453();
			}
			if (this.anInt1222 == 270) {
				local118.method1453();
				local118.method1453();
				local118.method1453();
			}
		}
		return local118;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZLclient!ka;)V")
	private void method915(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt1209 = arg1.method359();
		} else if (arg0 == 2) {
			this.anInt1217 = arg1.method359();
		} else if (arg0 == 4) {
			this.anInt1207 = arg1.method359();
		} else if (arg0 == 5) {
			this.anInt1220 = arg1.method359();
		} else if (arg0 == 6) {
			this.anInt1222 = arg1.method359();
		} else if (arg0 == 7) {
			this.anInt1205 = arg1.method336();
		} else if (arg0 == 8) {
			this.anInt1210 = arg1.method336();
		} else {
			@Pc(99) int local99;
			@Pc(109) int local109;
			if (arg0 == 40) {
				local99 = arg1.method336();
				this.aShortArray15 = new short[local99];
				this.aShortArray13 = new short[local99];
				for (local109 = 0; local109 < local99; local109++) {
					this.aShortArray15[local109] = (short) arg1.method359();
					this.aShortArray13[local109] = (short) arg1.method359();
				}
			} else if (arg0 == 41) {
				local99 = arg1.method336();
				this.aShortArray12 = new short[local99];
				this.aShortArray14 = new short[local99];
				for (local109 = 0; local109 < local99; local109++) {
					this.aShortArray12[local109] = (short) arg1.method359();
					this.aShortArray14[local109] = (short) arg1.method359();
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!ka;Z)V")
	public void method916(@OriginalArg(0) Class1_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method336();
			if (local9 == 0) {
				return;
			}
			this.method915(local9, arg0);
		}
	}
}
