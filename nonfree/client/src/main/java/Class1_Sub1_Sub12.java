import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class1_Sub1_Sub12 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ja", name = "fb", descriptor = "[I")
	private int[] anIntArray219;

	@OriginalMember(owner = "client!ja", name = "ab", descriptor = "[S")
	private final short[] aShortArray4 = new short[6];

	@OriginalMember(owner = "client!ja", name = "db", descriptor = "I")
	public int anInt1543 = -1;

	@OriginalMember(owner = "client!ja", name = "bb", descriptor = "[I")
	private final int[] anIntArray218 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ja", name = "S", descriptor = "[S")
	private final short[] aShortArray3 = new short[6];

	@OriginalMember(owner = "client!ja", name = "W", descriptor = "Z")
	public boolean aBoolean135 = false;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)Lclient!je;")
	public Class1_Sub1_Sub2_Sub5 method1023() {
		if (this.anIntArray219 == null) {
			return null;
		}
		@Pc(15) Class1_Sub1_Sub2_Sub5[] local15 = new Class1_Sub1_Sub2_Sub5[this.anIntArray219.length];
		for (@Pc(22) int local22 = 0; local22 < this.anIntArray219.length; local22++) {
			local15[local22] = Static60.method1097(Static33.aClass62_8, this.anIntArray219[local22]);
		}
		@Pc(54) Class1_Sub1_Sub2_Sub5 local54;
		if (local15.length == 1) {
			local54 = local15[0];
		} else {
			local54 = new Class1_Sub1_Sub2_Sub5(local15, local15.length);
		}
		for (@Pc(65) int local65 = 0; local65 < 6 && this.aShortArray3[local65] != 0; local65++) {
			local54.method1104(this.aShortArray3[local65], this.aShortArray4[local65]);
		}
		return local54;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)Z")
	public boolean method1024() {
		if (this.anIntArray219 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray219.length; local14++) {
			if (!Static33.aClass62_8.method2019(this.anIntArray219[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!qc;I)V")
	public void method1025(@OriginalArg(0) Class1_Sub18 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method2169();
			if (local9 == 0) {
				return;
			}
			this.method1028(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)Z")
	public boolean method1026() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < 5; local5++) {
			if (this.anIntArray218[local5] != -1 && !Static33.aClass62_8.method2019(this.anIntArray218[local5], 0)) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!qc;B)V")
	private void method1028(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub18 arg1) {
		if (arg0 == 1) {
			this.anInt1543 = arg1.method2169();
		} else if (arg0 == 2) {
			@Pc(22) int local22 = arg1.method2169();
			this.anIntArray219 = new int[local22];
			for (@Pc(28) int local28 = 0; local28 < local22; local28++) {
				this.anIntArray219[local28] = arg1.method2156();
			}
		} else if (arg0 == 3) {
			this.aBoolean135 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray3[arg0 - 40] = (short) arg1.method2156();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray4[arg0 - 50] = (short) arg1.method2156();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray218[arg0 - 60] = arg1.method2156();
		}
	}

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)Lclient!je;")
	public Class1_Sub1_Sub2_Sub5 method1030() {
		@Pc(8) Class1_Sub1_Sub2_Sub5[] local8 = new Class1_Sub1_Sub2_Sub5[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray218[local12] != -1) {
				local8[local10++] = Static60.method1097(Static33.aClass62_8, this.anIntArray218[local12]);
			}
		}
		@Pc(46) Class1_Sub1_Sub2_Sub5 local46 = new Class1_Sub1_Sub2_Sub5(local8, local10);
		for (@Pc(48) int local48 = 0; local48 < 6 && this.aShortArray3[local48] != 0; local48++) {
			local46.method1104(this.aShortArray3[local48], this.aShortArray4[local48]);
		}
		return local46;
	}
}
