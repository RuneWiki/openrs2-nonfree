import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class Class110 implements Interface2 {

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
	public final int anInt7735;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	public final int anInt7743;

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
	public final int anInt7738;

	@OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
	public final int anInt7739;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
	public final int anInt7733;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "Lclient!ec;")
	public final Class86 aClass86_10;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	public final int anInt7742;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "Lclient!sd;")
	public final Class309 aClass309_11;

	@OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
	public final int anInt7736;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!sd;Lclient!ec;IIIIIII)V")
	public Class110(@OriginalArg(0) Class309 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt7735 = arg8;
		this.anInt7743 = arg4;
		this.anInt7738 = arg7;
		this.anInt7739 = arg6;
		this.anInt7733 = arg3;
		this.aClass86_10 = arg1;
		this.anInt7742 = arg2;
		this.aClass309_11 = arg0;
		this.anInt7736 = arg5;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)Lclient!ad;")
	@Override
	public Class6 method9087() {
		return null;
	}
}
