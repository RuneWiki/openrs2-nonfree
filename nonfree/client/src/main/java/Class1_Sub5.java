import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public int anInt614;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	public int anInt615;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	public int anInt616;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	public int anInt617;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	public int anInt619;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public int anInt620;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIBIIIIII)V")
	public Class1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			this.anInt614 = arg8;
			this.anInt615 = arg5;
			this.anInt616 = arg4;
			this.anInt617 = arg7;
			this.anInt618 = arg6;
			this.anInt619 = arg1;
			@Pc(26) boolean local26 = false;
			this.anInt620 = arg3;
			this.anInt621 = arg0;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("64477, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}
}
