import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private int anInt523;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[I")
	public int[] anIntArray159;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	private int anInt522;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ZLclient!lb;)V")
	public Class10(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt523 = arg1.method474();
			this.anIntArray159 = new int[this.anInt523];
			this.anIntArrayArray12 = new int[this.anInt523][];
			for (@Pc(19) int local19 = 0; local19 < this.anInt523; local19++) {
				this.anIntArray159[local19] = arg1.method474();
			}
			for (@Pc(34) int local34 = 0; local34 < this.anInt523; local34++) {
				@Pc(39) int local39 = arg1.method474();
				this.anIntArrayArray12[local34] = new int[local39];
				for (@Pc(47) int local47 = 0; local47 < local39; local47++) {
					this.anIntArrayArray12[local34][local47] = arg1.method474();
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("89409, " + arg0 + ", " + arg1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
