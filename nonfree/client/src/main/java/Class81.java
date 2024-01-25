import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class81 {

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "I")
	public int anInt2184;

	@OriginalMember(owner = "client!ega", name = "d", descriptor = "I")
	public int anInt2185;

	@OriginalMember(owner = "client!ega", name = "k", descriptor = "I")
	public int anInt2189;

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method1996(@OriginalArg(0) Class6_Sub21 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method6069();
			if (local5 == 0) {
				return;
			}
			this.method1997(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(Lclient!ji;II)V")
	private void method1997(@OriginalArg(0) Class6_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2184 = arg0.method6003();
			this.anInt2185 = arg0.method6069();
			this.anInt2189 = arg0.method6069();
		}
	}
}
