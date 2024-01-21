import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	private int anInt634 = 478;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public int anInt635;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public int anInt636;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public int anInt637;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public int anInt638;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	public int anInt639;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public int anInt640;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public int anInt641;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public int anInt642;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			this.anInt635 = arg1;
			this.anInt636 = arg4;
			this.anInt637 = arg7;
			this.anInt638 = arg6;
			this.anInt639 = arg5;
			this.anInt640 = arg0;
			this.anInt641 = arg2;
			this.anInt642 = arg3;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("75562, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}
}
