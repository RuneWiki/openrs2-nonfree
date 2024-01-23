import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class136 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
	public int anInt4117;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	public int anInt4118;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
	public int anInt4122;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	public int anInt4123;

	@OriginalMember(owner = "client!pd", name = "k", descriptor = "Z")
	public boolean aBoolean284;

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
	public int anInt4127;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	public int anInt4119 = 8;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
	public int anInt4116 = 16777215;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!sb;BI)V")
	public void method3308(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(11) int local11 = arg0.method2595();
			if (local11 == 0) {
				return;
			}
			this.method3309(arg0, local11, arg1);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!sb;IIB)V")
	private void method3309(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt4119 = arg0.method2593();
		} else if (arg1 == 2) {
			this.aBoolean284 = true;
		} else if (arg1 == 3) {
			this.anInt4127 = arg0.method2623();
			this.anInt4123 = arg0.method2623();
			this.anInt4122 = arg0.method2623();
		} else if (arg1 == 4) {
			this.anInt4118 = arg0.method2595();
		} else if (arg1 == 5) {
			this.anInt4117 = arg0.method2593();
		} else if (arg1 == 6) {
			this.anInt4116 = arg0.method2588();
		}
	}
}
