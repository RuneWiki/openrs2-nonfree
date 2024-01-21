import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!f")
public final class Class10 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Z")
	private boolean aBoolean112 = true;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[I")
	public int[] anIntArray154;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!mb;B)V")
	public Class10(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt505 = arg0.method503();
			this.anIntArray154 = new int[this.anInt505];
			this.anIntArrayArray12 = new int[this.anInt505][];
			@Pc(25) boolean local25 = false;
			for (@Pc(37) int local37 = 0; local37 < this.anInt505; local37++) {
				this.anIntArray154[local37] = arg0.method503();
			}
			for (@Pc(52) int local52 = 0; local52 < this.anInt505; local52++) {
				@Pc(57) int local57 = arg0.method503();
				this.anIntArrayArray12[local52] = new int[local57];
				for (@Pc(65) int local65 = 0; local65 < local57; local65++) {
					this.anIntArrayArray12[local52][local65] = arg0.method503();
				}
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("82540, " + arg0 + ", " + arg1 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}
}
