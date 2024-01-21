import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class6_Sub3_Sub13 extends Class6_Sub3 {

	@OriginalMember(owner = "client!oa", name = "hb", descriptor = "[I")
	private int[] anIntArray251;

	@OriginalMember(owner = "client!oa", name = "gb", descriptor = "[I")
	private final int[] anIntArray250 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "[S")
	private final short[] aShortArray13 = new short[6];

	@OriginalMember(owner = "client!oa", name = "jb", descriptor = "Z")
	public boolean aBoolean113 = false;

	@OriginalMember(owner = "client!oa", name = "ob", descriptor = "[S")
	private final short[] aShortArray14 = new short[6];

	@OriginalMember(owner = "client!oa", name = "kb", descriptor = "I")
	public int anInt2213 = -1;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)Z")
	public boolean method1481() {
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray250[local14] != -1 && !Static58.aClass7_35.method109(this.anIntArray250[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!bf;B)V")
	public void method1482(@OriginalArg(0) Class6_Sub4 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1321();
			if (local9 == 0) {
				return;
			}
			this.method1485(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)Lclient!bc;")
	public Class6_Sub3_Sub1_Sub1 method1484() {
		@Pc(8) Class6_Sub3_Sub1_Sub1[] local8 = new Class6_Sub3_Sub1_Sub1[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray250[local12] != -1) {
				local8[local10++] = Static9.method212(Static58.aClass7_35, this.anIntArray250[local12]);
			}
		}
		@Pc(49) Class6_Sub3_Sub1_Sub1 local49 = new Class6_Sub3_Sub1_Sub1(local8, local10);
		for (@Pc(51) int local51 = 0; local51 < 6 && this.aShortArray14[local51] != 0; local51++) {
			local49.method229(this.aShortArray14[local51], this.aShortArray13[local51]);
		}
		return local49;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!bf;)V")
	private void method1485(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt2213 = arg1.method1321();
		} else if (arg0 == 2) {
			@Pc(88) int local88 = arg1.method1321();
			this.anIntArray251 = new int[local88];
			for (@Pc(94) int local94 = 0; local94 < local88; local94++) {
				this.anIntArray251[local94] = arg1.method1306();
			}
		} else if (arg0 == 3) {
			this.aBoolean113 = true;
		} else if (arg0 >= 40 && arg0 < 50) {
			this.aShortArray14[arg0 - 40] = (short) arg1.method1306();
		} else if (arg0 >= 50 && arg0 < 60) {
			this.aShortArray13[arg0 - 50] = (short) arg1.method1306();
		} else if (arg0 >= 60 && arg0 < 70) {
			this.anIntArray250[arg0 - 60] = arg1.method1306();
		}
	}

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)Lclient!bc;")
	public Class6_Sub3_Sub1_Sub1 method1487() {
		if (this.anIntArray251 == null) {
			return null;
		}
		@Pc(15) Class6_Sub3_Sub1_Sub1[] local15 = new Class6_Sub3_Sub1_Sub1[this.anIntArray251.length];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArray251.length; local23++) {
			local15[local23] = Static9.method212(Static58.aClass7_35, this.anIntArray251[local23]);
		}
		@Pc(49) Class6_Sub3_Sub1_Sub1 local49;
		if (local15.length == 1) {
			local49 = local15[0];
		} else {
			local49 = new Class6_Sub3_Sub1_Sub1(local15, local15.length);
		}
		for (@Pc(60) int local60 = 0; local60 < 6 && this.aShortArray14[local60] != 0; local60++) {
			local49.method229(this.aShortArray14[local60], this.aShortArray13[local60]);
		}
		return local49;
	}

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)Z")
	public boolean method1488() {
		if (this.anIntArray251 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray251.length; local14++) {
			if (!Static58.aClass7_35.method109(this.anIntArray251[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}
}
