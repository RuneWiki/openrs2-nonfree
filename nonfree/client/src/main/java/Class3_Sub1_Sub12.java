import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!md", name = "bb", descriptor = "I")
	private int anInt2472;

	@OriginalMember(owner = "client!md", name = "cb", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!md", name = "db", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!md", name = "fb", descriptor = "I")
	public int anInt2474;

	@OriginalMember(owner = "client!md", name = "hb", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!md", name = "ib", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!md", name = "X", descriptor = "I")
	private int anInt2469 = 128;

	@OriginalMember(owner = "client!md", name = "M", descriptor = "I")
	private int anInt2461 = 0;

	@OriginalMember(owner = "client!md", name = "W", descriptor = "I")
	private int anInt2468 = 0;

	@OriginalMember(owner = "client!md", name = "V", descriptor = "I")
	private int anInt2467 = 128;

	@OriginalMember(owner = "client!md", name = "eb", descriptor = "I")
	private int anInt2473 = 0;

	@OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
	public int anInt2463 = -1;

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(II)Lclient!vf;")
	public Class3_Sub1_Sub5_Sub3 method1708(@OriginalArg(0) int arg0) {
		@Pc(21) Class3_Sub1_Sub5_Sub3 local21 = (Class3_Sub1_Sub5_Sub3) Static92.aClass5_41.method139((long) this.anInt2474);
		if (local21 == null) {
			@Pc(29) Class3_Sub1_Sub5_Sub5 local29 = Static127.method1911(Static130.aClass1_19, this.anInt2472);
			if (local29 == null) {
				return null;
			}
			@Pc(38) int local38;
			if (this.aShortArray26 != null) {
				for (local38 = 0; local38 < this.aShortArray26.length; local38++) {
					local29.method1901(this.aShortArray26[local38], this.aShortArray25[local38]);
				}
			}
			if (this.aShortArray27 != null) {
				for (local38 = 0; local38 < this.aShortArray27.length; local38++) {
					local29.method1899(this.aShortArray27[local38], this.aShortArray24[local38]);
				}
			}
			local21 = local29.method1908(this.anInt2473 + 64, this.anInt2461 + 850, -30, -50, -30, true);
			Static92.aClass5_41.method145(local21, (long) this.anInt2474);
		}
		@Pc(118) Class3_Sub1_Sub5_Sub3 local118;
		if (this.anInt2463 == -1 || arg0 == -1) {
			local118 = local21.method1375(true);
		} else {
			local118 = Static148.method2368(this.anInt2463).method2533(arg0, local21);
		}
		if (this.anInt2467 != 128 || this.anInt2469 != 128) {
			local118.method1369(this.anInt2467, this.anInt2469, this.anInt2467);
		}
		if (this.anInt2468 != 0) {
			if (this.anInt2468 == 90) {
				local118.method1374();
			}
			if (this.anInt2468 == 180) {
				local118.method1374();
				local118.method1374();
			}
			if (this.anInt2468 == 270) {
				local118.method1374();
				local118.method1374();
				local118.method1374();
			}
		}
		return local118;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method1709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2472 = arg0.method2111();
		} else if (arg1 == 2) {
			this.anInt2463 = arg0.method2111();
		} else if (arg1 == 4) {
			this.anInt2467 = arg0.method2111();
		} else if (arg1 == 5) {
			this.anInt2469 = arg0.method2111();
		} else if (arg1 == 6) {
			this.anInt2468 = arg0.method2111();
		} else if (arg1 == 7) {
			this.anInt2473 = arg0.method2107();
		} else if (arg1 == 8) {
			this.anInt2461 = arg0.method2107();
		} else if (arg1 != 9) {
			@Pc(76) int local76;
			@Pc(86) int local86;
			if (arg1 == 40) {
				local76 = arg0.method2107();
				this.aShortArray25 = new short[local76];
				this.aShortArray26 = new short[local76];
				for (local86 = 0; local86 < local76; local86++) {
					this.aShortArray26[local86] = (short) arg0.method2111();
					this.aShortArray25[local86] = (short) arg0.method2111();
				}
				return;
			}
			if (arg1 == 41) {
				local76 = arg0.method2107();
				this.aShortArray24 = new short[local76];
				this.aShortArray27 = new short[local76];
				for (local86 = 0; local86 < local76; local86++) {
					this.aShortArray27[local86] = (short) arg0.method2111();
					this.aShortArray24[local86] = (short) arg0.method2111();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLclient!mb;)V")
	public void method1716(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2107();
			if (local9 == 0) {
				return;
			}
			this.method1709(arg0, local9);
		}
	}
}
