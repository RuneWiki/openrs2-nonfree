import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class131 {

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	public int anInt4145;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	private int anInt4148;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	public int anInt4149;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBLclient!cg;)V")
	public void method3292(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub11 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method2690();
			if (local5 == 0) {
				return;
			}
			this.method3295(local5, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIILclient!cg;)V")
	private void method3295(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub11 arg2) {
		if (arg0 == 1) {
			this.anInt4148 = arg2.method2691();
		} else if (arg0 == 2) {
			this.anInt4145 = arg2.method2690();
			this.anInt4149 = arg2.method2690();
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Lclient!kn;")
	public Class1_Sub2_Sub11_Sub2 method3296() {
		@Pc(11) Class1_Sub2_Sub11_Sub2 local11 = (Class1_Sub2_Sub11_Sub2) Static47.aClass135_1.method3316((long) this.anInt4148);
		if (local11 != null) {
			return local11;
		}
		local11 = Static187.method3141(this.anInt4148, Static45.aClass91_43);
		if (local11 != null) {
			Static47.aClass135_1.method3321((long) this.anInt4148, local11);
		}
		return local11;
	}
}
