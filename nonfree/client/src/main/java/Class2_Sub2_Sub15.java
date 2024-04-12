import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!v", name = "P", descriptor = "[Z")
	public static boolean[] aBooleanArray37 = new boolean[112];

	@OriginalMember(owner = "client!v", name = "O", descriptor = "Lclient!o;")
	public static Class40 aClass40_688 = Static12.method257("Invalid loginserver requested");

	@OriginalMember(owner = "client!v", name = "cb", descriptor = "[Lclient!kc;")
	public static Class2_Sub2_Sub12_Sub1_Sub1[] aClass2_Sub2_Sub12_Sub1_Sub1Array1 = new Class2_Sub2_Sub12_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!v", name = "X", descriptor = "Lclient!o;")
	public static Class40 aClass40_689 = Static12.method257("@gre@");

	@OriginalMember(owner = "client!v", name = "ib", descriptor = "Lclient!o;")
	public static Class40 aClass40_690 = Static12.method257("To ");

	@OriginalMember(owner = "client!v", name = "gb", descriptor = "I")
	public static int anInt2396 = 0;

	@OriginalMember(owner = "client!v", name = "db", descriptor = "I")
	public static int anInt2394 = 0;

	@OriginalMember(owner = "client!v", name = "kb", descriptor = "Lclient!o;")
	public static Class40 aClass40_691 = Static12.method257("Connecting to update server");

	@OriginalMember(owner = "client!v", name = "jb", descriptor = "[I")
	private int[] anIntArray516;

	@OriginalMember(owner = "client!v", name = "V", descriptor = "Z")
	public boolean aBoolean178 = false;

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "[I")
	private final int[] anIntArray515 = new int[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!v", name = "T", descriptor = "[I")
	private final int[] anIntArray514 = new int[6];

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
	public int anInt2386 = -1;

	@OriginalMember(owner = "client!v", name = "lb", descriptor = "[I")
	private final int[] anIntArray517 = new int[6];

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Lclient!ne;", line = 6)
	public Class2_Sub2_Sub12_Sub4 method1579() {
		if (this.anIntArray516 == null) {
			return null;
		}
		@Pc(15) Class2_Sub2_Sub12_Sub4[] local15 = new Class2_Sub2_Sub12_Sub4[this.anIntArray516.length];
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray516.length; local17++) {
			local15[local17] = Static65.method1163(Static66.aClass5_22, this.anIntArray516[local17]);
		}
		@Pc(45) Class2_Sub2_Sub12_Sub4 local45;
		if (local15.length == 1) {
			local45 = local15[0];
		} else {
			local45 = new Class2_Sub2_Sub12_Sub4(local15, local15.length);
		}
		for (@Pc(61) int local61 = 0; local61 < 6 && this.anIntArray514[local61] != 0; local61++) {
			local45.method1140(this.anIntArray514[local61], this.anIntArray517[local61]);
		}
		return local45;
	}

	@OriginalMember(owner = "client!v", name = "g", descriptor = "(I)Z", line = 87)
	public boolean method1582() {
		if (this.anIntArray516 == null) {
			return true;
		}
		@Pc(10) boolean local10 = true;
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray516.length; local12++) {
			if (!Static66.aClass5_22.method64(0, this.anIntArray516[local12])) {
				local10 = false;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!v", name = "i", descriptor = "(I)Z", line = 178)
	public boolean method1585() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < 5; local9++) {
			if (this.anIntArray515[local9] != -1 && !Static66.aClass5_22.method64(0, this.anIntArray515[local9])) {
				local7 = false;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!v", name = "j", descriptor = "(I)Lclient!ne;", line = 205)
	public Class2_Sub2_Sub12_Sub4 method1586() {
		@Pc(4) Class2_Sub2_Sub12_Sub4[] local4 = new Class2_Sub2_Sub12_Sub4[5];
		@Pc(6) int local6 = 0;
		for (@Pc(12) int local12 = 0; local12 < 5; local12++) {
			if (this.anIntArray515[local12] != -1) {
				local4[local6++] = Static65.method1163(Static66.aClass5_22, this.anIntArray515[local12]);
			}
		}
		@Pc(46) Class2_Sub2_Sub12_Sub4 local46 = new Class2_Sub2_Sub12_Sub4(local4, local6);
		for (@Pc(48) int local48 = 0; local48 < 6 && this.anIntArray514[local48] != 0; local48++) {
			local46.method1140(this.anIntArray514[local48], this.anIntArray517[local48]);
		}
		return local46;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!eb;I)V", line = 284)
	public void method1587(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1708();
			if (local13 == 0) {
				return;
			}
			this.method1588(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!eb;II)V", line = 305)
	private void method1588(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt2386 = arg0.method1708();
		} else if (arg1 == 2) {
			@Pc(17) int local17 = arg0.method1708();
			this.anIntArray516 = new int[local17];
			for (@Pc(23) int local23 = 0; local23 < local17; local23++) {
				this.anIntArray516[local23] = arg0.method1704();
			}
		} else if (arg1 == 3) {
			this.aBoolean178 = true;
		} else if (arg1 >= 40 && arg1 < 50) {
			this.anIntArray514[arg1 - 40] = arg0.method1704();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.anIntArray517[arg1 - 50] = arg0.method1704();
		} else if (arg1 >= 60 && arg1 < 70) {
			this.anIntArray515[arg1 - 60] = arg0.method1704();
		}
	}
}
