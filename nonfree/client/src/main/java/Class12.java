import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!g")
public final class Class12 {

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Z")
	private boolean aBoolean125 = true;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	private int anInt568;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "[I")
	public int[] anIntArray163;

	@OriginalMember(owner = "client!g", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(ZLclient!mb;)V")
	public Class12(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			this.anInt568 = arg1.method496();
			this.anIntArray163 = new int[this.anInt568];
			this.anIntArrayArray11 = new int[this.anInt568][];
			for (@Pc(32) int local32 = 0; local32 < this.anInt568; local32++) {
				this.anIntArray163[local32] = arg1.method496();
			}
			for (@Pc(47) int local47 = 0; local47 < this.anInt568; local47++) {
				@Pc(52) int local52 = arg1.method496();
				this.anIntArrayArray11[local47] = new int[local52];
				for (@Pc(60) int local60 = 0; local60 < local52; local60++) {
					this.anIntArrayArray11[local47][local60] = arg1.method496();
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("47930, " + arg0 + ", " + arg1 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}
}
