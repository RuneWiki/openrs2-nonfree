import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public class Class34 {

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "[I")
	public static int[] anIntArray501 = new int[4096];

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Lclient!sc;")
	public Class34 aClass34_11;

	@OriginalMember(owner = "client!sc", name = "q", descriptor = "Lclient!sc;")
	public Class34 aClass34_12;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray501[local4] = Static60.method1083(local4);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
	public final void method4182() {
		if (this.aClass34_11 != null) {
			this.aClass34_11.aClass34_12 = this.aClass34_12;
			this.aClass34_12.aClass34_11 = this.aClass34_11;
			this.aClass34_12 = null;
			this.aClass34_11 = null;
		}
	}
}
