import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!na")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!na", name = "db", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!na", name = "X", descriptor = "I")
	public int anInt2055 = -1;

	@OriginalMember(owner = "client!na", name = "lb", descriptor = "[S")
	private final short[] aShortArray7 = new short[6];

	@OriginalMember(owner = "client!na", name = "gb", descriptor = "[I")
	private final int[] anIntArray178 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!na", name = "nb", descriptor = "[S")
	private final short[] aShortArray8 = new short[6];

	@OriginalMember(owner = "client!na", name = "mb", descriptor = "Z")
	public boolean aBoolean91 = false;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!b;I)V")
	public void method1362(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method270();
			if (local9 == 0) {
				return;
			}
			this.method1363(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!b;II)V")
	private void method1363(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2055 = arg0.method270();
		} else if (arg1 == 2) {
			@Pc(93) int local93 = arg0.method270();
			this.anIntArray177 = new int[local93];
			for (@Pc(99) int local99 = 0; local99 < local93; local99++) {
				this.anIntArray177[local99] = arg0.method276();
			}
		} else if (arg1 == 3) {
			this.aBoolean91 = true;
			return;
		} else if (arg1 < 40 || arg1 >= 50) {
			if (arg1 >= 50 && arg1 < 60) {
				this.aShortArray8[arg1 - 50] = (short) arg0.method276();
				return;
			}
			if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray178[arg1 - 60] = arg0.method276();
				return;
			}
		} else {
			this.aShortArray7[arg1 - 40] = (short) arg0.method276();
			return;
		}
	}

	@OriginalMember(owner = "client!na", name = "d", descriptor = "(I)Z")
	public boolean method1364() {
		if (this.anIntArray177 == null) {
			return true;
		}
		@Pc(17) boolean local17 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray177.length; local19++) {
			if (!Static48.aClass44_31.method1137(this.anIntArray177[local19], 0)) {
				local17 = false;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(B)Z")
	public boolean method1366() {
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < 5; local14++) {
			if (this.anIntArray178[local14] != -1 && !Static48.aClass44_31.method1137(this.anIntArray178[local14], 0)) {
				local12 = false;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!na", name = "f", descriptor = "(I)Lclient!bd;")
	public Class3_Sub1_Sub2_Sub1 method1367() {
		@Pc(8) Class3_Sub1_Sub2_Sub1[] local8 = new Class3_Sub1_Sub2_Sub1[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray178[local12] != -1) {
				local8[local10++] = Static10.method222(Static48.aClass44_31, this.anIntArray178[local12]);
			}
		}
		@Pc(44) Class3_Sub1_Sub2_Sub1 local44 = new Class3_Sub1_Sub2_Sub1(local8, local10);
		for (@Pc(46) int local46 = 0; local46 < 6 && this.aShortArray7[local46] != 0; local46++) {
			local44.method223(this.aShortArray7[local46], this.aShortArray8[local46]);
		}
		return local44;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Lclient!bd;")
	public Class3_Sub1_Sub2_Sub1 method1368() {
		if (this.anIntArray177 == null) {
			return null;
		}
		@Pc(21) Class3_Sub1_Sub2_Sub1[] local21 = new Class3_Sub1_Sub2_Sub1[this.anIntArray177.length];
		for (@Pc(23) int local23 = 0; local23 < this.anIntArray177.length; local23++) {
			local21[local23] = Static10.method222(Static48.aClass44_31, this.anIntArray177[local23]);
		}
		@Pc(53) Class3_Sub1_Sub2_Sub1 local53;
		if (local21.length == 1) {
			local53 = local21[0];
		} else {
			local53 = new Class3_Sub1_Sub2_Sub1(local21, local21.length);
		}
		for (@Pc(64) int local64 = 0; local64 < 6 && this.aShortArray7[local64] != 0; local64++) {
			local53.method223(this.aShortArray7[local64], this.aShortArray8[local64]);
		}
		return local53;
	}
}
