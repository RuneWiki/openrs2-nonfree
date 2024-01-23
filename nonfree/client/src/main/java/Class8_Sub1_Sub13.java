import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class8_Sub1_Sub13 extends Class8_Sub1 {

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "Ljava/lang/String;")
	public String aString152;

	@OriginalMember(owner = "client!qa", name = "y", descriptor = "C")
	private char aChar2;

	@OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
	public int anInt4335;

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(Lclient!aj;I)V")
	public void method3306(@OriginalArg(0) Class8_Sub2 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2334();
			if (local13 == 0) {
				return;
			}
			this.method3311(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)Z")
	public boolean method3308() {
		return this.aChar2 == 's';
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!aj;I)V")
	private void method3311(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub2 arg1) {
		if (arg0 == 1) {
			this.aChar2 = Static274.method4077(arg1.method2374());
		} else if (arg0 == 2) {
			this.anInt4335 = arg1.method2352();
		} else if (arg0 == 5) {
			this.aString152 = arg1.method2372();
		}
	}
}
