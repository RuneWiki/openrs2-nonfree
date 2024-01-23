import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class30 {

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
	private int anInt1120;

	@OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
	public int anInt1122;

	@OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
	public int anInt1123;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!oe;BI)V")
	public void method815(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method2146();
			if (local5 == 0) {
				return;
			}
			this.method818(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Lclient!sc;")
	public Class2_Sub8_Sub1_Sub1 method817() {
		@Pc(13) Class2_Sub8_Sub1_Sub1 local13 = (Class2_Sub8_Sub1_Sub1) Static90.aClass157_20.method4031((long) this.anInt1120);
		if (local13 != null) {
			return local13;
		}
		local13 = Static219.method3633(Static4.aClass42_2, this.anInt1120);
		if (local13 != null) {
			Static90.aClass157_20.method4026((long) this.anInt1120, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZILclient!oe;)V")
	private void method818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub16 arg2) {
		if (arg1 == 1) {
			this.anInt1120 = arg2.method2130();
		} else if (arg1 == 2) {
			this.anInt1122 = arg2.method2146();
			this.anInt1123 = arg2.method2146();
		}
	}
}
