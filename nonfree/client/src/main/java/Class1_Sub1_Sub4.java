import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cg", name = "T", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!cg", name = "Y", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!cg", name = "Z", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!cg", name = "cb", descriptor = "[I")
	private int[] anIntArray102;

	@OriginalMember(owner = "client!cg", name = "fb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!cg", name = "H", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!cg", name = "V", descriptor = "[I")
	private final int[] anIntArray101 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!cg", name = "db", descriptor = "I")
	public int anInt724 = -1;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)Z")
	public boolean method412() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			if (this.anIntArray101[local5] != -1 && !Static176.aClass30_62.method1284(this.anIntArray101[local5], 0)) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Lclient!sf;")
	public Class1_Sub1_Sub1_Sub6 method414() {
		@Pc(12) int local12 = 0;
		@Pc(15) Class1_Sub1_Sub1_Sub6[] local15 = new Class1_Sub1_Sub1_Sub6[5];
		for (@Pc(17) int local17 = 0; local17 < 5; local17++) {
			if (this.anIntArray101[local17] != -1) {
				local15[local12++] = Static151.method2610(Static176.aClass30_62, this.anIntArray101[local17]);
			}
		}
		@Pc(46) Class1_Sub1_Sub1_Sub6 local46 = new Class1_Sub1_Sub1_Sub6(local15, local12);
		@Pc(51) int local51;
		if (this.aShortArray10 != null) {
			for (local51 = 0; local51 < this.aShortArray10.length; local51++) {
				local46.method2593(this.aShortArray10[local51], this.aShortArray12[local51]);
			}
		}
		if (this.aShortArray13 != null) {
			for (local51 = 0; local51 < this.aShortArray13.length; local51++) {
				local46.method2603(this.aShortArray13[local51], this.aShortArray11[local51]);
			}
		}
		return local46;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZLclient!jg;)V")
	public void method415(@OriginalArg(1) Class1_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method861();
			if (local13 == 0) {
				return;
			}
			this.method417(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)Z")
	public boolean method416() {
		if (this.anIntArray102 == null) {
			return true;
		}
		@Pc(19) boolean local19 = true;
		for (@Pc(21) int local21 = 0; local21 < this.anIntArray102.length; local21++) {
			if (!Static176.aClass30_62.method1284(this.anIntArray102[local21], 0)) {
				local19 = false;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!jg;IZ)V")
	private void method417(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt724 = arg0.method861();
			return;
		}
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (arg1 == 2) {
			local22 = arg0.method861();
			this.anIntArray102 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray102[local28] = arg0.method878();
			}
		} else if (arg1 == 3) {
			this.aBoolean35 = true;
		} else if (arg1 == 40) {
			local22 = arg0.method861();
			this.aShortArray12 = new short[local22];
			this.aShortArray10 = new short[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.aShortArray10[local28] = (short) arg0.method878();
				this.aShortArray12[local28] = (short) arg0.method878();
			}
		} else if (arg1 == 41) {
			local22 = arg0.method861();
			this.aShortArray11 = new short[local22];
			this.aShortArray13 = new short[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.aShortArray13[local28] = (short) arg0.method878();
				this.aShortArray11[local28] = (short) arg0.method878();
			}
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray101[arg1 - 60] = arg0.method878();
			return;
		}
	}

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)Lclient!sf;")
	public Class1_Sub1_Sub1_Sub6 method418() {
		if (this.anIntArray102 == null) {
			return null;
		}
		@Pc(15) Class1_Sub1_Sub1_Sub6[] local15 = new Class1_Sub1_Sub1_Sub6[this.anIntArray102.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray102.length; local17++) {
			local15[local17] = Static151.method2610(Static176.aClass30_62, this.anIntArray102[local17]);
		}
		@Pc(51) Class1_Sub1_Sub1_Sub6 local51;
		if (local15.length == 1) {
			local51 = local15[0];
		} else {
			local51 = new Class1_Sub1_Sub1_Sub6(local15, local15.length);
		}
		@Pc(65) int local65;
		if (this.aShortArray10 != null) {
			for (local65 = 0; local65 < this.aShortArray10.length; local65++) {
				local51.method2593(this.aShortArray10[local65], this.aShortArray12[local65]);
			}
		}
		if (this.aShortArray13 != null) {
			for (local65 = 0; local65 < this.aShortArray13.length; local65++) {
				local51.method2603(this.aShortArray13[local65], this.aShortArray11[local65]);
			}
		}
		return local51;
	}
}
