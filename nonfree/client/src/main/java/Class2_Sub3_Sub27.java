import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public final class Class2_Sub3_Sub27 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
	private int anInt4356;

	@OriginalMember(owner = "client!sh", name = "N", descriptor = "[S")
	private short[] aShortArray137;

	@OriginalMember(owner = "client!sh", name = "bb", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!sh", name = "gb", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!sh", name = "hb", descriptor = "I")
	public int anInt4371;

	@OriginalMember(owner = "client!sh", name = "kb", descriptor = "[S")
	private short[] aShortArray140;

	@OriginalMember(owner = "client!sh", name = "Q", descriptor = "Z")
	public boolean aBoolean188 = false;

	@OriginalMember(owner = "client!sh", name = "T", descriptor = "I")
	private int anInt4360 = 128;

	@OriginalMember(owner = "client!sh", name = "eb", descriptor = "I")
	private int anInt4369 = 128;

	@OriginalMember(owner = "client!sh", name = "W", descriptor = "I")
	private int anInt4363 = 0;

	@OriginalMember(owner = "client!sh", name = "Z", descriptor = "I")
	private int anInt4365 = 0;

	@OriginalMember(owner = "client!sh", name = "U", descriptor = "I")
	public int anInt4361 = -1;

	@OriginalMember(owner = "client!sh", name = "db", descriptor = "I")
	private int anInt4368 = 0;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!nh;)V")
	public void method3451(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2122();
			if (local13 == 0) {
				return;
			}
			this.method3454(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(II)Lclient!qc;")
	public Class5_Sub3 method3452(@OriginalArg(1) int arg0) {
		@Pc(9) Class5_Sub3 local9 = (Class5_Sub3) Static89.aClass53_7.method1793((long) this.anInt4371);
		if (local9 == null) {
			@Pc(21) Class5_Sub7 local21 = Static218.method3807(Static226.aClass72_286, this.anInt4356);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray139 != null) {
				for (local30 = 0; local30 < this.aShortArray139.length; local30++) {
					local21.method3794(this.aShortArray139[local30], this.aShortArray137[local30]);
				}
			}
			if (this.aShortArray140 != null) {
				for (local30 = 0; local30 < this.aShortArray140.length; local30++) {
					local21.method3791(this.aShortArray140[local30], this.aShortArray138[local30]);
				}
			}
			local9 = local21.method3795(this.anInt4368 + 64, this.anInt4363 + 850, -30, -50, -30);
			Static89.aClass53_7.method1794(local9, (long) this.anInt4371);
		}
		@Pc(108) Class5_Sub3 local108;
		if (this.anInt4361 == -1 || arg0 == -1) {
			local108 = local9.method1417(true, true);
		} else {
			local108 = Static187.method3447(this.anInt4361).method329(local9, arg0);
		}
		if (this.anInt4360 != 128 || this.anInt4369 != 128) {
			local108.method1412(this.anInt4360, this.anInt4369, this.anInt4360);
		}
		if (this.anInt4365 != 0) {
			if (this.anInt4365 == 90) {
				local108.method1429();
			}
			if (this.anInt4365 == 180) {
				local108.method1427();
			}
			if (this.anInt4365 == 270) {
				local108.method1424();
			}
		}
		return local108;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBLclient!nh;)V")
	private void method3454(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		if (arg0 == 1) {
			this.anInt4356 = arg1.method2095();
		} else if (arg0 == 2) {
			this.anInt4361 = arg1.method2095();
		} else if (arg0 == 4) {
			this.anInt4360 = arg1.method2095();
		} else if (arg0 == 5) {
			this.anInt4369 = arg1.method2095();
		} else if (arg0 == 6) {
			this.anInt4365 = arg1.method2095();
		} else if (arg0 == 7) {
			this.anInt4368 = arg1.method2122();
		} else if (arg0 == 8) {
			this.anInt4363 = arg1.method2122();
		} else if (arg0 == 9) {
			this.aBoolean188 = true;
		} else {
			@Pc(61) int local61;
			@Pc(71) int local71;
			if (arg0 == 40) {
				local61 = arg1.method2122();
				this.aShortArray137 = new short[local61];
				this.aShortArray139 = new short[local61];
				for (local71 = 0; local71 < local61; local71++) {
					this.aShortArray139[local71] = (short) arg1.method2095();
					this.aShortArray137[local71] = (short) arg1.method2095();
				}
			} else if (arg0 == 41) {
				local61 = arg1.method2122();
				this.aShortArray138 = new short[local61];
				this.aShortArray140 = new short[local61];
				for (local71 = 0; local71 < local61; local71++) {
					this.aShortArray140[local71] = (short) arg1.method2095();
					this.aShortArray138[local71] = (short) arg1.method2095();
				}
				return;
			}
		}
	}
}
