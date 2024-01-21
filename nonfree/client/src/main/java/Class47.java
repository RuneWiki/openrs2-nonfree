import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YPJRJNAP")
public final class Class47 {

	@OriginalMember(owner = "client!YPJRJNAP", name = "a", descriptor = "I")
	private int anInt780 = -958;

	@OriginalMember(owner = "client!YPJRJNAP", name = "b", descriptor = "I")
	private int anInt781;

	@OriginalMember(owner = "client!YPJRJNAP", name = "c", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!YPJRJNAP", name = "d", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!YPJRJNAP", name = "<init>", descriptor = "(Lclient!IMUIZRAF;I)V")
	public Class47(@OriginalArg(0) Class3_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt781 = arg0.method146();
			this.anIntArray205 = new int[this.anInt781];
			this.anIntArrayArray21 = new int[this.anInt781][];
			for (@Pc(27) int local27 = 0; local27 < this.anInt781; local27++) {
				this.anIntArray205[local27] = arg0.method146();
			}
			for (@Pc(42) int local42 = 0; local42 < this.anInt781; local42++) {
				@Pc(47) int local47 = arg0.method146();
				this.anIntArrayArray21[local42] = new int[local47];
				for (@Pc(55) int local55 = 0; local55 < local47; local55++) {
					this.anIntArrayArray21[local42][local55] = arg0.method146();
				}
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("88291, " + arg0 + ", " + arg1 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
