import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public int anInt482;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public int anInt483;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public int anInt484;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public int anInt485;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public int anInt486;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	public int anInt487;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public int anInt488;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public int anInt489;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIZIIII)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			this.anInt482 = arg6;
			this.anInt483 = arg5;
			this.anInt484 = arg1;
			this.anInt485 = arg2;
			this.anInt486 = arg8;
			this.anInt487 = arg7;
			this.anInt488 = arg3;
			this.anInt489 = arg0;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("19069, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
