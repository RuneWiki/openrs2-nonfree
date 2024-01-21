import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nb")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "B")
	private byte aByte36 = -50;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	public int anInt630;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!jc;")
	public Class19 aClass19_2;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public int anInt631;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	public int anInt632;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIILclient!jc;IIBZ)V")
	public Class1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) boolean arg7) {
		try {
			this.anInt626 = arg2;
			this.anInt627 = arg5;
			this.anInt628 = arg4;
			this.anInt629 = arg1;
			if (arg6 != this.aByte36) {
				throw new NullPointerException();
			}
			this.anInt630 = arg0;
			this.aClass19_2 = arg3;
			if (arg7 && arg3.anInt522 != -1) {
				this.anInt631 = (int) (Math.random() * (double) this.aClass19_2.anInt521);
				this.anInt632 = (int) (Math.random() * (double) this.aClass19_2.anIntArray188[this.anInt631]);
			} else {
				this.anInt631 = -1;
				this.anInt632 = 0;
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("99154, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
