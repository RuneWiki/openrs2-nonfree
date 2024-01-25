import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public final class Class88 implements Interface26 {

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
	public final int anInt2143;

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "I")
	public final int anInt2151;

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "Lclient!gi;")
	public final Class131 aClass131_11;

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
	public final int anInt2152;

	@OriginalMember(owner = "client!dv", name = "v", descriptor = "I")
	public final int anInt2160;

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
	public final int anInt2147;

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "I")
	public final int anInt2150;

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
	public final int anInt2146;

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
	public final int anInt2144;

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "Lclient!og;")
	public final Class266 aClass266_8;

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "Ljava/lang/String;")
	public final String aString31;

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "I")
	public final int anInt2157;

	@OriginalMember(owner = "client!dv", name = "q", descriptor = "I")
	public final int anInt2156;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!og;Lclient!gi;IIIIIIIIII)V")
	public Class88(@OriginalArg(0) String arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) Class131 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt2143 = arg4;
		this.anInt2151 = arg11;
		this.aClass131_11 = arg2;
		this.anInt2152 = arg5;
		this.anInt2160 = arg3;
		this.anInt2147 = arg12;
		this.anInt2150 = arg10;
		this.anInt2146 = arg7;
		this.anInt2144 = arg9;
		this.aClass266_8 = arg1;
		this.aString31 = arg0;
		this.anInt2157 = arg8;
		this.anInt2156 = arg6;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(B)Lclient!eo;")
	@Override
	public Class108 method7808() {
		return Static634.aClass108_10;
	}
}
