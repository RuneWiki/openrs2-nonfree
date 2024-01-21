import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nb")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	public int anInt639;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	public int anInt640;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	public int anInt641;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public int anInt642;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "Lclient!jc;")
	public Class19 aClass19_2;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	public int anInt644;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
	public int anInt645;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IILclient!jc;IIZII)V")
	public Class1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.anInt639 = arg6;
			this.anInt640 = arg3;
			this.anInt641 = arg1;
			this.anInt642 = arg0;
			this.anInt643 = arg4;
			this.aClass19_2 = arg2;
			if (arg5 && arg2.anInt539 != -1) {
				this.anInt644 = (int) (Math.random() * (double) this.aClass19_2.anInt538);
				this.anInt645 = (int) (Math.random() * (double) this.aClass19_2.anIntArray188[this.anInt644]);
			} else {
				this.anInt644 = -1;
				this.anInt645 = 0;
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("73656, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}
}
