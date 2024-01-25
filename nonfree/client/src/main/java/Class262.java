import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class262 {

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "[I")
	public int[] anIntArray461;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
	public int[] anIntArray462;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "[I")
	public int[] anIntArray463;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
	public int anInt7208 = -1;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
	public int anInt7210 = -1;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lclient!lga;)V")
	public Class262(@OriginalArg(0) Class223 arg0) {
		@Pc(12) byte[] local12 = arg0.method5275(6);
		this.method6408(new Class6_Sub15(local12));
		if (this.anIntArray463 == null) {
			throw new RuntimeException("");
		}
	}

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	private Class262() {
		this.anIntArray463 = new int[0];
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!jc;B)V")
	private void method6408(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method3030();
			if (local10 == 0) {
				return;
			}
			@Pc(59) int local59;
			if (local10 == 1) {
				local59 = arg0.method3030();
				this.anIntArray463 = new int[local59];
				for (@Pc(135) int local135 = 0; local135 < this.anIntArray463.length; local135++) {
					this.anIntArray463[local135] = arg0.method3030();
				}
			} else if (local10 == 3) {
				this.anInt7208 = arg0.method3030();
			} else if (local10 == 4) {
				this.anInt7210 = arg0.method3030();
			} else if (local10 == 5) {
				this.anIntArray462 = new int[arg0.method3030()];
				for (local59 = 0; local59 < this.anIntArray462.length; local59++) {
					this.anIntArray462[local59] = arg0.method3030();
				}
			} else if (local10 == 6) {
				this.anIntArray461 = new int[arg0.method3030()];
				for (local59 = 0; local59 < this.anIntArray461.length; local59++) {
					this.anIntArray461[local59] = arg0.method3030();
				}
			}
		}
	}
}
