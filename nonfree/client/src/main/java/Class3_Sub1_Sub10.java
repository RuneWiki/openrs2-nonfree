import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
	private int anInt2051;

	@OriginalMember(owner = "client!ki", name = "N", descriptor = "Lclient!lc;")
	private Class54 aClass54_8;

	@OriginalMember(owner = "client!ki", name = "W", descriptor = "I")
	public int anInt2057;

	@OriginalMember(owner = "client!ki", name = "Y", descriptor = "I")
	public int anInt2059;

	@OriginalMember(owner = "client!ki", name = "L", descriptor = "Lclient!rd;")
	private Class80 aClass80_831 = Static112.aClass80_997;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!mb;II)V")
	private void method1459(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2057 = arg0.method2107();
		} else if (arg1 == 2) {
			this.anInt2059 = arg0.method2107();
		} else if (arg1 == 3) {
			this.aClass80_831 = arg0.method2102();
		} else if (arg1 == 4) {
			this.anInt2051 = arg0.method2132();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(49) int local49 = arg0.method2111();
			this.aClass54_8 = new Class54(Static129.method1945(local49));
			for (@Pc(59) int local59 = 0; local59 < local49; local59++) {
				@Pc(67) int local67 = arg0.method2132();
				@Pc(81) Class3 local81;
				if (arg1 == 5) {
					local81 = new Class3_Sub21(arg0.method2102());
				} else {
					local81 = new Class3_Sub11(arg0.method2132());
				}
				this.aClass54_8.method1494((long) local67, local81);
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)Lclient!rd;")
	public Class80 method1461(@OriginalArg(0) int arg0) {
		if (this.aClass54_8 == null) {
			return this.aClass80_831;
		} else {
			@Pc(25) Class3_Sub21 local25 = (Class3_Sub21) this.aClass54_8.method1496((long) arg0);
			return local25 == null ? this.aClass80_831 : local25.aClass80_1355;
		}
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)I")
	public int method1463(@OriginalArg(1) int arg0) {
		if (this.aClass54_8 == null) {
			return this.anInt2051;
		} else {
			@Pc(23) Class3_Sub11 local23 = (Class3_Sub11) this.aClass54_8.method1496((long) arg0);
			return local23 == null ? this.anInt2051 : local23.anInt1537;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILclient!mb;)V")
	public void method1464(@OriginalArg(1) Class3_Sub17 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2107();
			if (local13 == 0) {
				return;
			}
			this.method1459(arg0, local13);
		}
	}
}
