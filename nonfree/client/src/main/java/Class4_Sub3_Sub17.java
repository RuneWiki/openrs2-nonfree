import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public final class Class4_Sub3_Sub17 extends Class4_Sub3 {

	@OriginalMember(owner = "client!we", name = "M", descriptor = "I")
	public int anInt2970;

	@OriginalMember(owner = "client!we", name = "T", descriptor = "I")
	public int anInt2973;

	@OriginalMember(owner = "client!we", name = "U", descriptor = "I")
	public int anInt2974;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLclient!tf;I)V")
	private void method1997(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2973 = arg0.method816();
			this.anInt2970 = arg0.method773();
			this.anInt2974 = arg0.method773();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!tf;)V")
	public void method1998(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method773();
			if (local5 == 0) {
				return;
			}
			this.method1997(arg0, local5);
		}
	}
}
