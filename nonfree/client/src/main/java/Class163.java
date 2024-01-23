import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class163 {

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public int anInt4842;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
	public int anInt4844;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
	private int anInt4845;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIILclient!fh;)V")
	private void method4042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub13 arg2) {
		if (arg1 == 1) {
			this.anInt4845 = arg2.method1879();
		} else if (arg1 == 2) {
			this.anInt4844 = arg2.method1853();
			this.anInt4842 = arg2.method1853();
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!fh;IB)V")
	public void method4045(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method1853();
			if (local17 == 0) {
				return;
			}
			this.method4042(arg1, local17, arg0);
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)Lclient!le;")
	public Class1_Sub5_Sub6_Sub1 method4046() {
		@Pc(7) Class1_Sub5_Sub6_Sub1 local7 = (Class1_Sub5_Sub6_Sub1) Static85.aClass175_12.method4295((long) this.anInt4845);
		if (local7 != null) {
			return local7;
		}
		local7 = Static124.method562(this.anInt4845, Static48.aClass119_17);
		if (local7 != null) {
			Static85.aClass175_12.method4285(local7, (long) this.anInt4845);
		}
		return local7;
	}
}
