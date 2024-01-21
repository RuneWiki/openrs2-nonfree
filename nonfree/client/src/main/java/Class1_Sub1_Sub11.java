import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
	private int anInt2571;

	@OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
	public int anInt2576;

	@OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
	private int anInt2577 = 0;

	@OriginalMember(owner = "client!rc", name = "ab", descriptor = "[S")
	private final short[] aShortArray15 = new short[6];

	@OriginalMember(owner = "client!rc", name = "nb", descriptor = "I")
	public int anInt2581 = -1;

	@OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
	private int anInt2575 = 128;

	@OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
	private int anInt2572 = 128;

	@OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
	private int anInt2578 = 0;

	@OriginalMember(owner = "client!rc", name = "ob", descriptor = "I")
	private int anInt2582 = 0;

	@OriginalMember(owner = "client!rc", name = "vb", descriptor = "[S")
	private final short[] aShortArray16 = new short[6];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!of;)V")
	public void method1706(@OriginalArg(1) Class1_Sub19 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2072();
			if (local5 == 0) {
				return;
			}
			this.method1709(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)Lclient!ka;")
	public Class1_Sub1_Sub1_Sub2 method1707(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub1_Sub1_Sub2 local13 = (Class1_Sub1_Sub1_Sub2) Static11.aClass63_5.method1663((long) this.anInt2576);
		if (local13 == null) {
			@Pc(27) Class1_Sub1_Sub1_Sub4 local27 = Static83.method1412(Static61.aClass35_13, this.anInt2571);
			if (local27 == null) {
				return null;
			}
			for (@Pc(33) int local33 = 0; local33 < 6; local33++) {
				if (this.aShortArray15[0] != 0) {
					local27.method1415(this.aShortArray15[local33], this.aShortArray16[local33]);
				}
			}
			local13 = local27.method1410(this.anInt2578 + 64, this.anInt2577 + 850, -30, -50, -30);
			Static11.aClass63_5.method1659(local13, (long) this.anInt2576);
		}
		@Pc(95) Class1_Sub1_Sub1_Sub2 local95;
		if (this.anInt2581 == -1 || arg0 == -1) {
			local95 = local13.method1085(true);
		} else {
			local95 = Static40.method687(this.anInt2581).method719(local13, arg0);
		}
		if (this.anInt2575 != 128 || this.anInt2572 != 128) {
			local95.method1084(this.anInt2575, this.anInt2572, this.anInt2575);
		}
		if (this.anInt2582 != 0) {
			if (this.anInt2582 == 90) {
				local95.method1081();
			}
			if (this.anInt2582 == 180) {
				local95.method1081();
				local95.method1081();
			}
			if (this.anInt2582 == 270) {
				local95.method1081();
				local95.method1081();
				local95.method1081();
			}
		}
		return local95;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!of;IZ)V")
	private void method1709(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2571 = arg0.method2051();
		} else if (arg1 == 2) {
			this.anInt2581 = arg0.method2051();
		} else if (arg1 == 4) {
			this.anInt2575 = arg0.method2051();
		} else if (arg1 == 5) {
			this.anInt2572 = arg0.method2051();
		} else if (arg1 == 6) {
			this.anInt2582 = arg0.method2051();
		} else if (arg1 == 7) {
			this.anInt2578 = arg0.method2072();
		} else if (arg1 == 8) {
			this.anInt2577 = arg0.method2072();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.aShortArray15[arg1 - 40] = (short) arg0.method2051();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.aShortArray16[arg1 - 50] = (short) arg0.method2051();
		}
	}
}
