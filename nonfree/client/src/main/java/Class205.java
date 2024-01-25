import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public final class Class205 implements Interface16 {

	@OriginalMember(owner = "client!mea", name = "l", descriptor = "I")
	public final int anInt5668;

	@OriginalMember(owner = "client!mea", name = "r", descriptor = "Lclient!pd;")
	public final Class247 aClass247_7;

	@OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
	public final int anInt5667;

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
	public final int anInt5661;

	@OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
	public final int anInt5662;

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
	public final int anInt5660;

	@OriginalMember(owner = "client!mea", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString44;

	@OriginalMember(owner = "client!mea", name = "s", descriptor = "I")
	public final int anInt5673;

	@OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
	public final int anInt5664;

	@OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
	public final int anInt5663;

	@OriginalMember(owner = "client!mea", name = "g", descriptor = "Lclient!tl;")
	public final Class319 aClass319_8;

	@OriginalMember(owner = "client!mea", name = "n", descriptor = "I")
	public final int anInt5669;

	@OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
	public final int anInt5666;

	@OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!tl;Lclient!pd;IIIIIIIIII)V")
	public Class205(@OriginalArg(0) String arg0, @OriginalArg(1) Class319 arg1, @OriginalArg(2) Class247 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt5668 = arg4;
		this.aClass247_7 = arg2;
		this.anInt5667 = arg6;
		this.anInt5661 = arg9;
		this.anInt5662 = arg12;
		this.anInt5660 = arg10;
		this.aString44 = arg0;
		this.anInt5673 = arg11;
		this.anInt5664 = arg5;
		this.anInt5663 = arg8;
		this.aClass319_8 = arg1;
		this.anInt5669 = arg3;
		this.anInt5666 = arg7;
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)Lclient!jd;")
	@Override
	public Class153 method6332() {
		return Static455.aClass153_10;
	}
}
