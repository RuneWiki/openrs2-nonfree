import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!hw", name = "D", descriptor = "Lclient!an;")
	public static Class16 aClass16_51;

	@OriginalMember(owner = "client!hw", name = "H", descriptor = "Lclient!an;")
	public static Class16 aClass16_52;

	@OriginalMember(owner = "client!hw", name = "A", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_39 = new Class77(80, 8);

	@OriginalMember(owner = "client!hw", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Lclient!vw;")
	public static Class7_Sub8 method3703(@OriginalArg(1) int arg0) {
		@Pc(12) Class149[] local12 = Class212.aClass149Array1;
		synchronized (Class212.aClass149Array1) {
			@Pc(32) Class7_Sub8 local32;
			if (Class212.aClass149Array1.length <= arg0 || Class212.aClass149Array1[arg0].method3985()) {
				local32 = new Class7_Sub8();
				local32.aClass7_Sub4Array1 = new Class7_Sub4[arg0];
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					local32.aClass7_Sub4Array1[local38] = new Class7_Sub4();
				}
			} else {
				local32 = (Class7_Sub8) Class212.aClass149Array1[arg0].method3981();
				local32.method7760();
				@Pc(67) int local67 = Static330.anIntArray435[arg0]--;
			}
			return local32;
		}
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)Lclient!kf;")
	public static Class23_Sub1 method3705() {
		Static37.anInt7514 = 0;
		return Static409.method6397();
	}

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(B)V")
	public static void method3706() {
		for (@Pc(15) Class12_Sub17 local15 = (Class12_Sub17) Static179.aClass73_31.method2005(); local15 != null; local15 = (Class12_Sub17) Static179.aClass73_31.method2009()) {
			if (local15.anInt3841 == -1) {
				local15.anInt3836 = 0;
				if (local15.anInt3846 >= 0 && local15.anInt3840 >= 0 && local15.anInt3846 < Static37.anInt7512 && local15.anInt3840 < Static329.anInt6247) {
					Static107.method2238(local15);
				}
			} else {
				local15.method7967();
			}
		}
	}
}
