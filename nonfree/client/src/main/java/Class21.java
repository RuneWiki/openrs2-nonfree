import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public final class Class21 implements Interface23 {

	@OriginalMember(owner = "client!ar", name = "g", descriptor = "Lclient!rg;")
	public final Class293 aClass293_1;

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
	public final int anInt350;

	@OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
	public final int anInt355;

	@OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
	public final int anInt346;

	@OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
	public final int anInt357;

	@OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
	public final int anInt354;

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
	public final int anInt342;

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
	public final int anInt353;

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "Lclient!al;")
	public final Class15 aClass15_1;

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
	public final int anInt358;

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
	public final int anInt348;

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "Ljava/lang/String;")
	public final String aString2;

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
	public final int anInt352;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!rg;Lclient!al;IIIIIIIIII)V")
	public Class21(@OriginalArg(0) String arg0, @OriginalArg(1) Class293 arg1, @OriginalArg(2) Class15 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aClass293_1 = arg1;
		this.anInt350 = arg5;
		this.anInt355 = arg12;
		this.anInt346 = arg8;
		this.anInt357 = arg6;
		this.anInt354 = arg4;
		this.anInt342 = arg3;
		this.anInt353 = arg10;
		this.aClass15_1 = arg2;
		this.anInt358 = arg9;
		this.anInt348 = arg7;
		this.aString2 = arg0;
		this.anInt352 = arg11;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)Lclient!ww;")
	@Override
	public Class384 method8182() {
		return Static200.aClass384_32;
	}
}
