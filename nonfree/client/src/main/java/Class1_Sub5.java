import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public int anInt608;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public int anInt609;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public int anInt610;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public int anInt611;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	public int anInt612;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public int anInt613;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public int anInt615;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			this.anInt608 = arg3;
			this.anInt609 = arg1;
			this.anInt610 = arg0;
			this.anInt611 = arg6;
			this.anInt612 = arg4;
			@Pc(20) int local20 = 42 / arg8;
			this.anInt613 = arg2;
			this.anInt614 = arg5;
			this.anInt615 = arg7;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("85738, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}
}
