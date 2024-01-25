import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eo")
public final class Class66 {

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "[I")
	public int[] anIntArray130;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "I")
	public int anInt2186 = -1;

	@OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
	public int anInt2189 = -1;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!cu;Z)V")
	public void method1696(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2582();
			if (local3 == 0) {
				return;
			}
			this.method1698(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(IILclient!cu;)V")
	private void method1698(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt2186 = arg1.method2588();
		} else if (arg0 == 2) {
			this.anIntArray130 = new int[arg1.method2582()];
			for (@Pc(23) int local23 = 0; local23 < this.anIntArray130.length; local23++) {
				this.anIntArray130[local23] = arg1.method2588();
			}
			return;
		} else if (arg0 == 3) {
			this.anInt2189 = arg1.method2582();
			return;
		}
	}
}
