import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public final class Class72 implements Interface8 {

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
	public final int anInt2403;

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
	public final int anInt2407;

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
	public final int anInt2412;

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
	public final int anInt2410;

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
	public final int anInt2405;

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "I")
	public final int anInt2409;

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString31;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "Lclient!ffa;")
	public final Class100 aClass100_3;

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "Lclient!oca;")
	public final Class237 aClass237_2;

	@OriginalMember(owner = "client!dv", name = "q", descriptor = "I")
	public final int anInt2416;

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
	public final int anInt2411;

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
	public final int anInt2413;

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "I")
	public final int anInt2414;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!ffa;Lclient!oca;IIIIIIIIII)V")
	public Class72(@OriginalArg(0) String arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt2403 = arg10;
		this.anInt2407 = arg3;
		this.anInt2412 = arg11;
		this.anInt2410 = arg12;
		this.anInt2405 = arg8;
		this.anInt2409 = arg5;
		this.aString31 = arg0;
		this.aClass100_3 = arg1;
		this.aClass237_2 = arg2;
		this.anInt2416 = arg6;
		this.anInt2411 = arg4;
		this.anInt2413 = arg7;
		this.anInt2414 = arg9;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)Lclient!fl;")
	@Override
	public Class103 method7774() {
		return Static595.aClass103_10;
	}
}
