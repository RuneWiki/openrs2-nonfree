import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class2_Sub2_Sub11 extends Class2_Sub2 {

	@OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
	public int anInt2078;

	@OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
	private int anInt2080;

	@OriginalMember(owner = "client!lh", name = "P", descriptor = "[S")
	private short[] aShortArray19;

	@OriginalMember(owner = "client!lh", name = "Q", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!lh", name = "V", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!lh", name = "W", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
	private int anInt2079 = 128;

	@OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
	private int anInt2084 = 0;

	@OriginalMember(owner = "client!lh", name = "O", descriptor = "I")
	private int anInt2083 = 0;

	@OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
	private int anInt2088 = 128;

	@OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
	public int anInt2089 = -1;

	@OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
	private int anInt2087 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)Lclient!ue;")
	public Class2_Sub2_Sub3_Sub4 method1698(@OriginalArg(0) int arg0) {
		@Pc(19) Class2_Sub2_Sub3_Sub4 local19 = (Class2_Sub2_Sub3_Sub4) Static150.aClass74_82.method2345((long) this.anInt2078);
		if (local19 == null) {
			@Pc(27) Class2_Sub2_Sub3_Sub6 local27 = Static119.method2029(Static154.aClass11_120, this.anInt2080);
			if (local27 == null) {
				return null;
			}
			@Pc(36) int local36;
			if (this.aShortArray21 != null) {
				for (local36 = 0; local36 < this.aShortArray21.length; local36++) {
					local27.method2025(this.aShortArray21[local36], this.aShortArray20[local36]);
				}
			}
			if (this.aShortArray19 != null) {
				for (local36 = 0; local36 < this.aShortArray19.length; local36++) {
					local27.method2034(this.aShortArray19[local36], this.aShortArray22[local36]);
				}
			}
			local19 = local27.method2027(this.anInt2087 + 64, this.anInt2083 + 850, -30, -50, -30, true);
			Static150.aClass74_82.method2341((long) this.anInt2078, local19);
		}
		@Pc(116) Class2_Sub2_Sub3_Sub4 local116;
		if (this.anInt2089 == -1 || arg0 == -1) {
			local116 = local19.method1045(true);
		} else {
			local116 = Static29.method543(this.anInt2089).method364(local19, arg0);
		}
		if (this.anInt2079 != 128 || this.anInt2088 != 128) {
			local116.method1048(this.anInt2079, this.anInt2088, this.anInt2079);
		}
		if (this.anInt2084 != 0) {
			if (this.anInt2084 == 90) {
				local116.method1053();
			}
			if (this.anInt2084 == 180) {
				local116.method1053();
				local116.method1053();
			}
			if (this.anInt2084 == 270) {
				local116.method1053();
				local116.method1053();
				local116.method1053();
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ja;Z)V")
	public void method1700(@OriginalArg(0) Class2_Sub13 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2962();
			if (local5 == 0) {
				return;
			}
			this.method1702(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILclient!ja;)V")
	private void method1702(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt2080 = arg1.method2933();
		} else if (arg0 == 2) {
			this.anInt2089 = arg1.method2933();
		} else if (arg0 == 4) {
			this.anInt2079 = arg1.method2933();
		} else if (arg0 == 5) {
			this.anInt2088 = arg1.method2933();
		} else if (arg0 == 6) {
			this.anInt2084 = arg1.method2933();
		} else if (arg0 == 7) {
			this.anInt2087 = arg1.method2962();
		} else if (arg0 == 8) {
			this.anInt2083 = arg1.method2962();
		} else {
			@Pc(80) int local80;
			@Pc(90) int local90;
			if (arg0 == 40) {
				local80 = arg1.method2962();
				this.aShortArray21 = new short[local80];
				this.aShortArray20 = new short[local80];
				for (local90 = 0; local90 < local80; local90++) {
					this.aShortArray21[local90] = (short) arg1.method2933();
					this.aShortArray20[local90] = (short) arg1.method2933();
				}
			} else if (arg0 == 41) {
				local80 = arg1.method2962();
				this.aShortArray22 = new short[local80];
				this.aShortArray19 = new short[local80];
				for (local90 = 0; local90 < local80; local90++) {
					this.aShortArray19[local90] = (short) arg1.method2933();
					this.aShortArray22[local90] = (short) arg1.method2933();
				}
			}
		}
	}
}
