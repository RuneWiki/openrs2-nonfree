import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nb")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	private int anInt654 = 4;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	public int anInt655;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	public int anInt656;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public int anInt657;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public int anInt658;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public int anInt659;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!jc;")
	public Class19 aClass19_2;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
	public int anInt660;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public int anInt661;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIZLclient!jc;III)V")
	public Class1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class19 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.anInt655 = arg2;
			this.anInt656 = arg0;
			if (arg5 < this.anInt654 || arg5 > this.anInt654) {
				this.anInt654 = -40;
			}
			this.anInt657 = arg7;
			this.anInt658 = arg1;
			this.anInt659 = arg6;
			this.aClass19_2 = arg4;
			if (arg3 && arg4.anInt547 != -1) {
				this.anInt660 = (int) (Math.random() * (double) this.aClass19_2.anInt546);
				this.anInt661 = (int) (Math.random() * (double) this.aClass19_2.anIntArray188[this.anInt660]);
			} else {
				this.anInt660 = -1;
				this.anInt661 = 0;
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("40239, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
