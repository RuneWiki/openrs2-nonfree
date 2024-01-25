import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public final class Class252 implements Interface2 {

	@OriginalMember(owner = "client!ot", name = "p", descriptor = "I")
	public final int anInt7731;

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
	public final int anInt7721;

	@OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
	public final int anInt7729;

	@OriginalMember(owner = "client!ot", name = "n", descriptor = "I")
	public final int anInt7730;

	@OriginalMember(owner = "client!ot", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString87;

	@OriginalMember(owner = "client!ot", name = "r", descriptor = "Lclient!sd;")
	public final Class309 aClass309_10;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
	public final int anInt7720;

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
	public final int anInt7727;

	@OriginalMember(owner = "client!ot", name = "q", descriptor = "I")
	public final int anInt7732;

	@OriginalMember(owner = "client!ot", name = "o", descriptor = "Lclient!ec;")
	public final Class86 aClass86_9;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
	public final int anInt7724;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
	public final int anInt7723;

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
	public final int anInt7725;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!sd;Lclient!ec;IIIIIIIIII)V")
	public Class252(@OriginalArg(0) String arg0, @OriginalArg(1) Class309 arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt7731 = arg6;
		this.anInt7721 = arg4;
		this.anInt7729 = arg5;
		this.anInt7730 = arg10;
		this.aString87 = arg0;
		this.aClass309_10 = arg1;
		this.anInt7720 = arg8;
		this.anInt7727 = arg12;
		this.anInt7732 = arg3;
		this.aClass86_9 = arg2;
		this.anInt7724 = arg9;
		this.anInt7723 = arg11;
		this.anInt7725 = arg7;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)Lclient!ad;")
	@Override
	public Class6 method9087() {
		return Static435.aClass6_7;
	}
}
