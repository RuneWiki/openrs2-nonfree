import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class2_Sub2_Sub5 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cj", name = "G", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!cj", name = "O", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
	public int anInt724;

	@OriginalMember(owner = "client!cj", name = "Y", descriptor = "I")
	private int anInt731;

	@OriginalMember(owner = "client!cj", name = "Z", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!cj", name = "ab", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
	private int anInt720 = 128;

	@OriginalMember(owner = "client!cj", name = "I", descriptor = "I")
	private int anInt718 = 0;

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
	private int anInt725 = 128;

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "Z")
	public boolean aBoolean37 = false;

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
	private int anInt729 = 0;

	@OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
	public int anInt727 = -1;

	@OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
	private int anInt732 = 0;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!ea;B)V")
	private void method564(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt731 = arg1.method163();
		} else if (arg0 == 2) {
			this.anInt727 = arg1.method163();
		} else if (arg0 == 4) {
			this.anInt725 = arg1.method163();
		} else if (arg0 == 5) {
			this.anInt720 = arg1.method163();
		} else if (arg0 == 6) {
			this.anInt729 = arg1.method163();
		} else if (arg0 == 7) {
			this.anInt732 = arg1.method209();
		} else if (arg0 == 8) {
			this.anInt718 = arg1.method209();
		} else if (arg0 == 9) {
			this.aBoolean37 = true;
		} else {
			@Pc(84) int local84;
			@Pc(94) int local94;
			if (arg0 == 40) {
				local84 = arg1.method209();
				this.aShortArray19 = new short[local84];
				this.aShortArray21 = new short[local84];
				for (local94 = 0; local94 < local84; local94++) {
					this.aShortArray19[local94] = (short) arg1.method163();
					this.aShortArray21[local94] = (short) arg1.method163();
				}
			} else if (arg0 == 41) {
				local84 = arg1.method209();
				this.aShortArray20 = new short[local84];
				this.aShortArray18 = new short[local84];
				for (local94 = 0; local94 < local84; local94++) {
					this.aShortArray18[local94] = (short) arg1.method163();
					this.aShortArray20[local94] = (short) arg1.method163();
				}
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IB)Lclient!cg;")
	public Class12_Sub2 method565(@OriginalArg(0) int arg0) {
		@Pc(21) Class12_Sub2 local21 = (Class12_Sub2) Static204.aClass16_10.method437((long) this.anInt724);
		if (local21 == null) {
			@Pc(29) Class12_Sub6 local29 = Static72.method1336(Static126.aClass15_24, this.anInt731);
			if (local29 == null) {
				return null;
			}
			@Pc(38) int local38;
			if (this.aShortArray19 != null) {
				for (local38 = 0; local38 < this.aShortArray19.length; local38++) {
					local29.method1332(this.aShortArray19[local38], this.aShortArray21[local38]);
				}
			}
			if (this.aShortArray18 != null) {
				for (local38 = 0; local38 < this.aShortArray18.length; local38++) {
					local29.method1322(this.aShortArray18[local38], this.aShortArray20[local38]);
				}
			}
			local21 = local29.method1315(this.anInt732 + 64, this.anInt718 + 850, -30, -50, -30);
			Static204.aClass16_10.method432((long) this.anInt724, local21);
		}
		@Pc(118) Class12_Sub2 local118;
		if (this.anInt727 == -1 || arg0 == -1) {
			local118 = local21.method1854(true, true);
		} else {
			local118 = Static14.method299(this.anInt727).method1652(local21, arg0);
		}
		if (this.anInt725 != 128 || this.anInt720 != 128) {
			local118.method1852(this.anInt725, this.anInt720, this.anInt725);
		}
		if (this.anInt729 != 0) {
			if (this.anInt729 == 90) {
				local118.method1851();
			}
			if (this.anInt729 == 180) {
				local118.method1859();
			}
			if (this.anInt729 == 270) {
				local118.method1850();
			}
		}
		return local118;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ea;B)V")
	public void method567(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method209();
			if (local14 == 0) {
				return;
			}
			this.method564(local14, arg0);
		}
	}
}
