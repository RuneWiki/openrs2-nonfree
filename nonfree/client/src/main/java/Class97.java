import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class97 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
	public int anInt2707;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
	private int anInt2710;

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
	private int anInt2703 = 128;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
	private int anInt2701 = 128;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
	private int anInt2706 = 0;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
	public int anInt2712 = -1;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "Z")
	public boolean aBoolean195 = false;

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "Z")
	public boolean aBoolean196 = false;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
	private int anInt2714 = 0;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
	private int anInt2705 = 0;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)Lclient!hc;")
	public Class22_Sub4 method2204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class22_Sub4 local19 = (Class22_Sub4) Static267.aClass169_139.method4017((long) this.anInt2707);
		if (local19 == null) {
			@Pc(27) Class22_Sub7 local27 = Static275.method4085(Static92.aClass138_28, this.anInt2710);
			if (local27 == null) {
				return null;
			}
			@Pc(38) int local38;
			if (this.aShortArray54 != null) {
				for (local38 = 0; local38 < this.aShortArray54.length; local38++) {
					local27.method4080(this.aShortArray54[local38], this.aShortArray53[local38]);
				}
			}
			if (this.aShortArray52 != null) {
				for (local38 = 0; local38 < this.aShortArray52.length; local38++) {
					local27.method4078(this.aShortArray52[local38], this.aShortArray51[local38]);
				}
			}
			local19 = local27.method4097(this.anInt2706 + 64, this.anInt2705 + 850, -30, -50, -30);
			Static267.aClass169_139.method4016(local19, (long) this.anInt2707);
		}
		@Pc(124) Class22_Sub4 local124;
		if (this.anInt2712 == -1 || arg2 == -1) {
			local124 = local19.method3568(true, true, true);
		} else {
			local124 = Static313.method4648(this.anInt2712).method3974(arg1, arg2, local19, arg0);
		}
		if (this.anInt2703 != 128 || this.anInt2701 != 128) {
			local124.method3575(this.anInt2703, this.anInt2701, this.anInt2703);
		}
		if (this.anInt2714 != 0) {
			if (this.anInt2714 == 90) {
				local124.method3578();
			}
			if (this.anInt2714 == 180) {
				local124.method3555();
			}
			if (this.anInt2714 == 270) {
				local124.method3556();
			}
		}
		return local124;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!sb;)V")
	public void method2205(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2595();
			if (local9 == 0) {
				return;
			}
			this.method2209(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!sb;II)V")
	private void method2209(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2710 = arg0.method2593();
		} else if (arg1 == 2) {
			this.anInt2712 = arg0.method2593();
		} else if (arg1 == 4) {
			this.anInt2703 = arg0.method2593();
		} else if (arg1 == 5) {
			this.anInt2701 = arg0.method2593();
		} else if (arg1 == 6) {
			this.anInt2714 = arg0.method2593();
		} else if (arg1 == 7) {
			this.anInt2706 = arg0.method2595();
		} else if (arg1 == 8) {
			this.anInt2705 = arg0.method2595();
		} else if (arg1 == 9) {
			this.aBoolean195 = true;
		} else if (arg1 == 10) {
			this.aBoolean196 = true;
		} else {
			@Pc(80) int local80;
			@Pc(90) int local90;
			if (arg1 == 40) {
				local80 = arg0.method2595();
				this.aShortArray53 = new short[local80];
				this.aShortArray54 = new short[local80];
				for (local90 = 0; local90 < local80; local90++) {
					this.aShortArray54[local90] = (short) arg0.method2593();
					this.aShortArray53[local90] = (short) arg0.method2593();
				}
			} else if (arg1 == 41) {
				local80 = arg0.method2595();
				this.aShortArray51 = new short[local80];
				this.aShortArray52 = new short[local80];
				for (local90 = 0; local90 < local80; local90++) {
					this.aShortArray52[local90] = (short) arg0.method2593();
					this.aShortArray51[local90] = (short) arg0.method2593();
				}
			}
		}
	}
}
