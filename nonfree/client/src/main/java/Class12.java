import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "I")
	private int anInt568 = -39218;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	private int anInt569;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[I")
	public int[] anIntArray164;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!mb;I)V")
	public Class12(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt569 = arg0.method498();
			this.anIntArray164 = new int[this.anInt569];
			this.anIntArrayArray11 = new int[this.anInt569][];
			for (@Pc(28) int local28 = 0; local28 < this.anInt569; local28++) {
				this.anIntArray164[local28] = arg0.method498();
			}
			for (@Pc(43) int local43 = 0; local43 < this.anInt569; local43++) {
				@Pc(48) int local48 = arg0.method498();
				this.anIntArrayArray11[local43] = new int[local48];
				for (@Pc(56) int local56 = 0; local56 < local48; local56++) {
					this.anIntArrayArray11[local43][local56] = arg0.method498();
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("3468, " + arg0 + ", " + arg1 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}
}
