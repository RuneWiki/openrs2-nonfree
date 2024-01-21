import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class4_Sub1_Sub8 extends Class4_Sub1 {

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
	public int anInt1395;

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "[S")
	private short[] aShortArray16;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "[S")
	private short[] aShortArray17;

	@OriginalMember(owner = "client!gd", name = "T", descriptor = "[S")
	private short[] aShortArray18;

	@OriginalMember(owner = "client!gd", name = "ab", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
	private int anInt1412;

	@OriginalMember(owner = "client!gd", name = "J", descriptor = "I")
	private int anInt1400 = 0;

	@OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
	private int anInt1404 = 128;

	@OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
	private int anInt1399 = 0;

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "I")
	public int anInt1398 = -1;

	@OriginalMember(owner = "client!gd", name = "bb", descriptor = "I")
	private int anInt1411 = 0;

	@OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
	private int anInt1401 = 128;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lclient!dg;")
	public Class4_Sub1_Sub1_Sub4 method1095(@OriginalArg(0) int arg0) {
		@Pc(13) Class4_Sub1_Sub1_Sub4 local13 = (Class4_Sub1_Sub1_Sub4) Static188.aClass66_52.method2225((long) this.anInt1395);
		if (local13 == null) {
			@Pc(21) Class4_Sub1_Sub1_Sub6 local21 = Static51.method1003(Static149.aClass62_38, this.anInt1412);
			if (local21 == null) {
				return null;
			}
			@Pc(30) int local30;
			if (this.aShortArray17 != null) {
				for (local30 = 0; local30 < this.aShortArray17.length; local30++) {
					local21.method1011(this.aShortArray17[local30], this.aShortArray16[local30]);
				}
			}
			if (this.aShortArray19 != null) {
				for (local30 = 0; local30 < this.aShortArray19.length; local30++) {
					local21.method1010(this.aShortArray19[local30], this.aShortArray18[local30]);
				}
			}
			local13 = local21.method1007(this.anInt1411 + 64, 850 - -this.anInt1400, -30, -50, -30, true);
			Static188.aClass66_52.method2222(local13, (long) this.anInt1395);
		}
		@Pc(112) Class4_Sub1_Sub1_Sub4 local112;
		if (this.anInt1398 == -1 || arg0 == -1) {
			local112 = local13.method2828(true);
		} else {
			local112 = Static137.method2394(this.anInt1398).method346(local13, arg0);
		}
		if (this.anInt1404 != 128 || this.anInt1401 != 128) {
			local112.method2826(this.anInt1404, this.anInt1401, this.anInt1404);
		}
		if (this.anInt1399 != 0) {
			if (this.anInt1399 == 90) {
				local112.method2839();
			}
			if (this.anInt1399 == 180) {
				local112.method2839();
				local112.method2839();
			}
			if (this.anInt1399 == 270) {
				local112.method2839();
				local112.method2839();
				local112.method2839();
			}
		}
		return local112;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!h;I)V")
	private void method1098(@OriginalArg(1) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1412 = arg0.method1252();
		} else if (arg1 == 2) {
			this.anInt1398 = arg0.method1252();
		} else if (arg1 == 4) {
			this.anInt1404 = arg0.method1252();
		} else if (arg1 == 5) {
			this.anInt1401 = arg0.method1252();
		} else if (arg1 == 6) {
			this.anInt1399 = arg0.method1252();
		} else if (arg1 == 7) {
			this.anInt1411 = arg0.method1253();
		} else if (arg1 == 8) {
			this.anInt1400 = arg0.method1253();
		} else if (arg1 != 9) {
			@Pc(63) int local63;
			@Pc(73) int local73;
			if (arg1 == 40) {
				local63 = arg0.method1253();
				this.aShortArray16 = new short[local63];
				this.aShortArray17 = new short[local63];
				for (local73 = 0; local73 < local63; local73++) {
					this.aShortArray17[local73] = (short) arg0.method1252();
					this.aShortArray16[local73] = (short) arg0.method1252();
				}
			} else if (arg1 == 41) {
				local63 = arg0.method1253();
				this.aShortArray18 = new short[local63];
				this.aShortArray19 = new short[local63];
				for (local73 = 0; local73 < local63; local73++) {
					this.aShortArray19[local73] = (short) arg0.method1252();
					this.aShortArray18[local73] = (short) arg0.method1252();
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!h;)V")
	public void method1099(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1253();
			if (local15 == 0) {
				return;
			}
			this.method1098(arg0, local15);
		}
	}
}
