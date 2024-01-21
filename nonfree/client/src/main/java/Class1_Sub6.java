import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!nb")
public final class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "Z")
	private boolean aBoolean154 = false;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	public int anInt634;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	public int anInt636;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	public int anInt637;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	public int anInt638;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "Lclient!jc;")
	public Class19 aClass19_2;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	public int anInt639;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	public int anInt640;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(ZIBIILclient!jc;II)V")
	public Class1_Sub6(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class19 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(9) boolean local9 = false;
			this.anInt634 = arg6;
			this.anInt635 = arg7;
			this.anInt636 = arg3;
			this.anInt637 = arg4;
			this.anInt638 = arg1;
			this.aClass19_2 = arg5;
			if (arg0 && arg5.anInt531 != -1) {
				this.anInt639 = (int) (Math.random() * (double) this.aClass19_2.anInt530);
				this.anInt640 = (int) (Math.random() * (double) this.aClass19_2.anIntArray188[this.anInt639]);
			} else {
				this.anInt639 = -1;
				this.anInt640 = 0;
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("49487, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
