import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class170 {

	@OriginalMember(owner = "client!oh", name = "f", descriptor = "[I")
	public int[] anIntArray341;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	public int anInt5190 = -1;

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
	public int anInt5189 = -1;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!iv;I)V")
	public void method3966(@OriginalArg(0) Class4_Sub12 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method2490();
			if (local18 == 0) {
				return;
			}
			this.method3968(local18, arg0);
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILclient!iv;)V")
	private void method3968(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub12 arg1) {
		if (arg0 == 1) {
			this.anInt5190 = arg1.method2536();
		} else if (arg0 == 2) {
			this.anIntArray341 = new int[arg1.method2490()];
			for (@Pc(26) int local26 = 0; local26 < this.anIntArray341.length; local26++) {
				this.anIntArray341[local26] = arg1.method2536();
			}
		} else if (arg0 == 3) {
			this.anInt5189 = arg1.method2490();
		}
	}
}
