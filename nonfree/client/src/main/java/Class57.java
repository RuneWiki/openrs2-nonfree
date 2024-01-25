import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cda")
public final class Class57 {

	@OriginalMember(owner = "client!cda", name = "g", descriptor = "[I")
	public int[] anIntArray65;

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
	public int anInt1040 = -1;

	@OriginalMember(owner = "client!cda", name = "h", descriptor = "I")
	public int anInt1039 = 0;

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "I")
	public int anInt1041 = -1;

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "I")
	public int anInt1042 = -1;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ILclient!jc;)V")
	public void method1073(@OriginalArg(1) Class14_Sub21 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method7695(97);
			if (local17 == 0) {
				return;
			}
			this.method1074(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!jc;II)V")
	private void method1074(@OriginalArg(0) Class14_Sub21 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1041 = arg0.method7717(-1978450544);
		} else if (arg1 == 2) {
			this.anIntArray65 = new int[arg0.method7695(116)];
			for (@Pc(24) int local24 = 0; local24 < this.anIntArray65.length; local24++) {
				this.anIntArray65[local24] = arg0.method7717(-1978450544);
			}
		} else if (arg1 == 3) {
			this.anInt1040 = arg0.method7695(97);
		} else if (arg1 == 4) {
			this.anInt1039 = arg0.method7695(116);
		} else if (arg1 == 5) {
			this.anInt1042 = arg0.method7717(-1978450544);
		}
	}
}
