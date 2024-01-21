import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nb")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	private int anInt494 = 49498;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	public int anInt495;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	public int anInt496;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public int anInt497;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public int anInt498;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public int anInt499;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "Lclient!gc;")
	public Class13 aClass13_2;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
	public int anInt500;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public int anInt501;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIZLclient!gc;II)V")
	public Class1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class13 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			this.anInt495 = arg2;
			this.anInt496 = arg0;
			this.anInt497 = arg7;
			this.anInt498 = arg6;
			this.anInt499 = arg3;
			this.aClass13_2 = arg5;
			if (arg4) {
				this.anInt500 = (int) (Math.random() * (double) this.aClass13_2.anInt332);
				this.anInt501 = (int) (Math.random() * (double) this.aClass13_2.anIntArray132[this.anInt500]);
			} else {
				this.anInt500 = -1;
				this.anInt501 = 0;
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("15951, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}
}
