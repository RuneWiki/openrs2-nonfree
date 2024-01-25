import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public final class Class178 implements Interface3 {

	@OriginalMember(owner = "client!jaa", name = "m", descriptor = "I")
	public final int anInt4643;

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "Lclient!tda;")
	public final Class346 aClass346_7;

	@OriginalMember(owner = "client!jaa", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString48;

	@OriginalMember(owner = "client!jaa", name = "r", descriptor = "I")
	public final int anInt4646;

	@OriginalMember(owner = "client!jaa", name = "j", descriptor = "I")
	public final int anInt4636;

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "I")
	public final int anInt4637;

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "I")
	public final int anInt4635;

	@OriginalMember(owner = "client!jaa", name = "k", descriptor = "Lclient!jk;")
	public final Class189 aClass189_8;

	@OriginalMember(owner = "client!jaa", name = "s", descriptor = "I")
	public final int anInt4633;

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "I")
	public final int anInt4634;

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "I")
	public final int anInt4645;

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "I")
	public final int anInt4638;

	@OriginalMember(owner = "client!jaa", name = "q", descriptor = "I")
	public final int anInt4647;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!jk;Lclient!tda;IIIIIIIIII)V")
	public Class178(@OriginalArg(0) String arg0, @OriginalArg(1) Class189 arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt4643 = arg10;
		this.aClass346_7 = arg2;
		this.aString48 = arg0;
		this.anInt4646 = arg5;
		this.anInt4636 = arg4;
		this.anInt4637 = arg12;
		this.anInt4635 = arg7;
		this.aClass189_8 = arg1;
		this.anInt4633 = arg3;
		this.anInt4634 = arg8;
		this.anInt4645 = arg9;
		this.anInt4638 = arg6;
		this.anInt4647 = arg11;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)Lclient!wh;")
	@Override
	public Class392 method8802() {
		return Static577.aClass392_7;
	}
}
