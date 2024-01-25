import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class176 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "[I")
	public static final int[] anIntArray392 = new int[120];

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "Lclient!ka;")
	private final Class132 aClass132_41 = new Class132(64);

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "Lclient!dk;")
	private final Class54 aClass54_79;

	static {
		@Pc(112) int local112 = 0;
		for (@Pc(114) int local114 = 0; local114 < 120; local114++) {
			@Pc(119) int local119 = local114 + 1;
			@Pc(132) int local132 = (int) ((double) local119 + Math.pow(2.0D, (double) local119 / 7.0D) * 300.0D);
			local112 += local132;
			anIntArray392[local114] = local112 / 4;
		}
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!ad;ILclient!dk;)V")
	public Class176(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2) {
		this.aClass54_79 = arg2;
		this.aClass54_79.method1123(31);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
	public void method3749() {
		@Pc(7) Class132 local7 = this.aClass132_41;
		synchronized (this.aClass132_41) {
			this.aClass132_41.method2708();
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)V")
	public void method3751() {
		@Pc(6) Class132 local6 = this.aClass132_41;
		synchronized (this.aClass132_41) {
			this.aClass132_41.method2713(5);
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)Lclient!io;")
	public Class116 method3752(@OriginalArg(1) int arg0) {
		@Pc(6) Class132 local6 = this.aClass132_41;
		@Pc(16) Class116 local16;
		synchronized (this.aClass132_41) {
			local16 = (Class116) this.aClass132_41.method2701((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class54 local29 = this.aClass54_79;
		@Pc(38) byte[] local38;
		synchronized (this.aClass54_79) {
			local38 = this.aClass54_79.method1126(31, arg0);
		}
		local16 = new Class116();
		if (local38 != null) {
			local16.method2464(new Class2_Sub13(local38));
		}
		@Pc(65) Class132 local65 = this.aClass132_41;
		synchronized (this.aClass132_41) {
			this.aClass132_41.method2711(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
	public void method3753() {
		@Pc(6) Class132 local6 = this.aClass132_41;
		synchronized (this.aClass132_41) {
			this.aClass132_41.method2698();
		}
	}
}
