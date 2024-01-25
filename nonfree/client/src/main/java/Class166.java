import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public final class Class166 implements Interface3 {

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
	public final int anInt4116;

	@OriginalMember(owner = "client!ii", name = "m", descriptor = "I")
	public final int anInt4121;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString39;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
	public final int anInt4118;

	@OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
	public final int anInt4124;

	@OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
	public final int anInt4123;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "Lclient!ft;")
	public final Class125 aClass125_8;

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
	public final int anInt4126;

	@OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
	public final int anInt4125;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	public final int anInt4112;

	@OriginalMember(owner = "client!ii", name = "r", descriptor = "Lclient!ps;")
	public final Class291 aClass291_5;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	public final int anInt4119;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	public final int anInt4114;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!ps;Lclient!ft;IIIIIIIIII)V")
	public Class166(@OriginalArg(0) String arg0, @OriginalArg(1) Class291 arg1, @OriginalArg(2) Class125 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt4116 = arg12;
		this.anInt4121 = arg3;
		this.aString39 = arg0;
		this.anInt4118 = arg8;
		this.anInt4124 = arg5;
		this.anInt4123 = arg9;
		this.aClass125_8 = arg2;
		this.anInt4126 = arg11;
		this.anInt4125 = arg7;
		this.anInt4112 = arg10;
		this.aClass291_5 = arg1;
		this.anInt4119 = arg4;
		this.anInt4114 = arg6;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)Lclient!lf;")
	@Override
	public Class210 method7539() {
		return Static488.aClass210_15;
	}
}
