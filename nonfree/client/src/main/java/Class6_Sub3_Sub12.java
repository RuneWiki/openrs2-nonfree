import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class6_Sub3_Sub12 extends Class6_Sub3 {

	@OriginalMember(owner = "client!md", name = "ib", descriptor = "I")
	private int anInt2102;

	@OriginalMember(owner = "client!md", name = "xb", descriptor = "I")
	public int anInt2108;

	@OriginalMember(owner = "client!md", name = "eb", descriptor = "I")
	public int anInt2099 = -1;

	@OriginalMember(owner = "client!md", name = "mb", descriptor = "[S")
	private final short[] aShortArray11 = new short[6];

	@OriginalMember(owner = "client!md", name = "nb", descriptor = "I")
	private int anInt2104 = 0;

	@OriginalMember(owner = "client!md", name = "qb", descriptor = "[S")
	private final short[] aShortArray12 = new short[6];

	@OriginalMember(owner = "client!md", name = "cb", descriptor = "I")
	private int anInt2098 = 0;

	@OriginalMember(owner = "client!md", name = "tb", descriptor = "I")
	private int anInt2106 = 128;

	@OriginalMember(owner = "client!md", name = "wb", descriptor = "I")
	private int anInt2107 = 128;

	@OriginalMember(owner = "client!md", name = "yb", descriptor = "I")
	private int anInt2109 = 0;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!bf;)V")
	public void method1414(@OriginalArg(1) Class6_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1321();
			if (local5 == 0) {
				return;
			}
			this.method1415(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!bf;B)V")
	private void method1415(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt2102 = arg1.method1306();
		} else if (arg0 == 2) {
			this.anInt2099 = arg1.method1306();
		} else if (arg0 == 4) {
			this.anInt2106 = arg1.method1306();
		} else if (arg0 == 5) {
			this.anInt2107 = arg1.method1306();
		} else if (arg0 == 6) {
			this.anInt2109 = arg1.method1306();
		} else if (arg0 == 7) {
			this.anInt2098 = arg1.method1321();
		} else if (arg0 == 8) {
			this.anInt2104 = arg1.method1321();
			return;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray11[arg0 - 40] = (short) arg1.method1306();
			return;
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray12[arg0 - 50] = (short) arg1.method1306();
			return;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method1417(@OriginalArg(1) int arg0) {
		@Pc(13) Class6_Sub3_Sub1_Sub3 local13 = (Class6_Sub3_Sub1_Sub3) Static50.aClass49_14.method1397((long) this.anInt2108);
		if (local13 == null) {
			@Pc(21) Class6_Sub3_Sub1_Sub1 local21 = Static9.method212(Static58.aClass7_34, this.anInt2102);
			if (local21 == null) {
				return null;
			}
			for (@Pc(27) int local27 = 0; local27 < 6; local27++) {
				if (this.aShortArray11[0] != 0) {
					local21.method229(this.aShortArray11[local27], this.aShortArray12[local27]);
				}
			}
			local13 = local21.method211(this.anInt2098 + 64, this.anInt2104 + 850, -30, -50, -30);
			Static50.aClass49_14.method1396((long) this.anInt2108, local13);
		}
		@Pc(88) Class6_Sub3_Sub1_Sub3 local88;
		if (this.anInt2099 == -1 || arg0 == -1) {
			local88 = local13.method629(true);
		} else {
			local88 = Static30.method721(this.anInt2099).method933(local13, arg0);
		}
		if (this.anInt2106 != 128 || this.anInt2107 != 128) {
			local88.method622(this.anInt2106, this.anInt2107, this.anInt2106);
		}
		if (this.anInt2109 != 0) {
			if (this.anInt2109 == 90) {
				local88.method640();
			}
			if (this.anInt2109 == 180) {
				local88.method640();
				local88.method640();
			}
			if (this.anInt2109 == 270) {
				local88.method640();
				local88.method640();
				local88.method640();
			}
		}
		return local88;
	}
}
