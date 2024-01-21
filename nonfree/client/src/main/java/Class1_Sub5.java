import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public int anInt622;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public int anInt623;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public int anInt624;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIII)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			this.anInt621 = arg0;
			this.anInt622 = arg7;
			this.anInt623 = arg4;
			this.anInt624 = arg1;
			this.anInt625 = arg8;
			this.anInt626 = arg3;
			this.anInt627 = arg5;
			this.anInt628 = arg2;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("94905, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
