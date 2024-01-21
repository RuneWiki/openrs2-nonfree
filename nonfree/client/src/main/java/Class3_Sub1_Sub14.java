import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class3_Sub1_Sub14 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ra", name = "eb", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!ra", name = "X", descriptor = "[I")
	private final int[] anIntArray248 = new int[6];

	@OriginalMember(owner = "client!ra", name = "sb", descriptor = "Z")
	public boolean aBoolean138 = false;

	@OriginalMember(owner = "client!ra", name = "ub", descriptor = "[I")
	private final int[] anIntArray251 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ra", name = "qb", descriptor = "[I")
	private final int[] anIntArray250 = new int[6];

	@OriginalMember(owner = "client!ra", name = "wb", descriptor = "I")
	public int anInt2309 = -1;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method1410() {
		@Pc(8) Class3_Sub1_Sub3_Sub3[] local8 = new Class3_Sub1_Sub3_Sub3[5];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray251[local12] != -1) {
				local8[local10++] = Static57.method949(Static100.aClass42_66, this.anIntArray251[local12]);
			}
		}
		@Pc(41) Class3_Sub1_Sub3_Sub3 local41 = new Class3_Sub1_Sub3_Sub3(local8, local10);
		for (@Pc(49) int local49 = 0; local49 < 6 && this.anIntArray248[local49] != 0; local49++) {
			local41.method965(this.anIntArray248[local49], this.anIntArray250[local49]);
		}
		return local41;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!kd;)V")
	public void method1411(@OriginalArg(1) Class3_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1803();
			if (local9 == 0) {
				return;
			}
			this.method1419(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)Lclient!lb;")
	public Class3_Sub1_Sub3_Sub3 method1415() {
		if (this.anIntArray249 == null) {
			return null;
		}
		@Pc(15) Class3_Sub1_Sub3_Sub3[] local15 = new Class3_Sub1_Sub3_Sub3[this.anIntArray249.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray249.length; local17++) {
			local15[local17] = Static57.method949(Static100.aClass42_66, this.anIntArray249[local17]);
		}
		@Pc(54) Class3_Sub1_Sub3_Sub3 local54;
		if (local15.length == 1) {
			local54 = local15[0];
		} else {
			local54 = new Class3_Sub1_Sub3_Sub3(local15, local15.length);
		}
		for (@Pc(65) int local65 = 0; local65 < 6 && this.anIntArray248[local65] != 0; local65++) {
			local54.method965(this.anIntArray248[local65], this.anIntArray250[local65]);
		}
		return local54;
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(B)Z")
	public boolean method1417() {
		@Pc(7) boolean local7 = true;
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			if (this.anIntArray251[local15] != -1 && !Static100.aClass42_66.method1493(0, this.anIntArray251[local15])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!kd;II)V")
	private void method1419(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2309 = arg0.method1803();
		} else if (arg1 == 2) {
			@Pc(78) int local78 = arg0.method1803();
			this.anIntArray249 = new int[local78];
			for (@Pc(84) int local84 = 0; local84 < local78; local84++) {
				this.anIntArray249[local84] = arg0.method1789();
			}
		} else if (arg1 == 3) {
			this.aBoolean138 = true;
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray248[arg1 - 40] = arg0.method1789();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray250[arg1 - 50] = arg0.method1789();
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray251[arg1 - 60] = arg0.method1789();
		}
	}

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "(I)Z")
	public boolean method1420() {
		if (this.anIntArray249 == null) {
			return true;
		}
		@Pc(12) boolean local12 = true;
		for (@Pc(19) int local19 = 0; local19 < this.anIntArray249.length; local19++) {
			if (!Static100.aClass42_66.method1493(0, this.anIntArray249[local19])) {
				local12 = false;
			}
		}
		return local12;
	}
}
