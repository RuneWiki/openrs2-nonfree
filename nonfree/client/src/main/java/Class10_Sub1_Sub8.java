import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class10_Sub1_Sub8 extends Class10_Sub1 {

	@OriginalMember(owner = "client!j", name = "mb", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!j", name = "O", descriptor = "I")
	public int anInt1233 = -1;

	@OriginalMember(owner = "client!j", name = "Y", descriptor = "[I")
	private final int[] anIntArray136 = new int[6];

	@OriginalMember(owner = "client!j", name = "hb", descriptor = "[I")
	private final int[] anIntArray137 = new int[6];

	@OriginalMember(owner = "client!j", name = "ib", descriptor = "Z")
	public boolean aBoolean53 = false;

	@OriginalMember(owner = "client!j", name = "lb", descriptor = "[I")
	private final int[] anIntArray138 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)Z")
	public boolean method705() {
		@Pc(3) boolean local3 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray138[local9] != -1 && !Static1.aClass11_1.method218(this.anIntArray138[local9], 0)) {
				local3 = false;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!tc;I)V")
	private void method708(@OriginalArg(1) Class10_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1233 = arg0.method1111();
		} else if (arg1 == 2) {
			@Pc(95) int local95 = arg0.method1111();
			this.anIntArray139 = new int[local95];
			for (@Pc(101) int local101 = 0; local101 < local95; local101++) {
				this.anIntArray139[local101] = arg0.method1160();
			}
		} else if (arg1 == 3) {
			this.aBoolean53 = true;
			return;
		} else if (arg1 < 40 || arg1 >= 50) {
			if (arg1 >= 50 && arg1 < 60) {
				this.anIntArray137[arg1 - 50] = arg0.method1160();
				return;
			}
			if (arg1 >= 60 && arg1 < 70) {
				this.anIntArray138[arg1 - 60] = arg0.method1160();
				return;
			}
		} else {
			this.anIntArray136[arg1 - 40] = arg0.method1160();
			return;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(ILclient!tc;)V")
	public void method709(@OriginalArg(1) Class10_Sub10 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1111();
			if (local13 == 0) {
				return;
			}
			this.method708(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(I)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method710() {
		@Pc(8) Class10_Sub1_Sub5_Sub4[] local8 = new Class10_Sub1_Sub5_Sub4[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray138[local12] != -1) {
				local8[local10++] = Static84.method1335(Static1.aClass11_1, this.anIntArray138[local12]);
			}
		}
		@Pc(43) Class10_Sub1_Sub5_Sub4 local43 = new Class10_Sub1_Sub5_Sub4(local8, local10);
		for (@Pc(50) int local50 = 0; local50 < 6 && this.anIntArray136[local50] != 0; local50++) {
			local43.method1328(this.anIntArray136[local50], this.anIntArray137[local50]);
		}
		return local43;
	}

	@OriginalMember(owner = "client!j", name = "e", descriptor = "(B)Lclient!rb;")
	public Class10_Sub1_Sub5_Sub4 method711() {
		if (this.anIntArray139 == null) {
			return null;
		}
		@Pc(23) Class10_Sub1_Sub5_Sub4[] local23 = new Class10_Sub1_Sub5_Sub4[this.anIntArray139.length];
		for (@Pc(25) int local25 = 0; local25 < this.anIntArray139.length; local25++) {
			local23[local25] = Static84.method1335(Static1.aClass11_1, this.anIntArray139[local25]);
		}
		@Pc(55) Class10_Sub1_Sub5_Sub4 local55;
		if (local23.length == 1) {
			local55 = local23[0];
		} else {
			local55 = new Class10_Sub1_Sub5_Sub4(local23, local23.length);
		}
		for (@Pc(66) int local66 = 0; local66 < 6 && this.anIntArray136[local66] != 0; local66++) {
			local55.method1328(this.anIntArray136[local66], this.anIntArray137[local66]);
		}
		return local55;
	}

	@OriginalMember(owner = "client!j", name = "f", descriptor = "(B)Z")
	public boolean method714() {
		if (this.anIntArray139 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray139.length; local20++) {
			if (!Static1.aClass11_1.method218(this.anIntArray139[local20], 0)) {
				local12 = false;
			}
		}
		return local12;
	}
}
