import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class181 implements Interface24 {

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	public final int anInt5616;

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "I")
	public final int anInt5630;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "Lclient!dg;")
	public final Class81 aClass81_13;

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
	public final int anInt5618;

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
	public final int anInt5615;

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
	public final int anInt5626;

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
	public final int anInt5624;

	@OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
	public final int anInt5620;

	@OriginalMember(owner = "client!jk", name = "i", descriptor = "Lclient!pf;")
	public final Class275 aClass275_10;

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
	public final int anInt5617;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
	public final int anInt5622;

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString46;

	@OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
	public final int anInt5627;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!pf;Lclient!dg;IIIIIIIIII)V")
	public Class181(@OriginalArg(0) String arg0, @OriginalArg(1) Class275 arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt5616 = arg9;
		this.anInt5630 = arg3;
		this.aClass81_13 = arg2;
		this.anInt5618 = arg7;
		this.anInt5615 = arg6;
		this.anInt5626 = arg11;
		this.anInt5624 = arg12;
		this.anInt5620 = arg8;
		this.aClass275_10 = arg1;
		this.anInt5617 = arg5;
		this.anInt5622 = arg4;
		this.aString46 = arg0;
		this.anInt5627 = arg10;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)Lclient!gp;")
	@Override
	public Class139 method8810() {
		return Static212.aClass139_4;
	}
}
