import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public final class Class267 implements Interface24 {

	@OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
	public final int anInt7132;

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "Lclient!ut;")
	public final Class335 aClass335_16;

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
	public final int anInt7134;

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
	public final int anInt7123;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
	public final int anInt7135;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
	public final int anInt7121;

	@OriginalMember(owner = "client!pr", name = "l", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
	public final int anInt7128;

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "Lclient!gi;")
	public final Class122 aClass122_13;

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "I")
	public final int anInt7122;

	@OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
	public final int anInt7131;

	@OriginalMember(owner = "client!pr", name = "j", descriptor = "I")
	public final int anInt7130;

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
	public final int anInt7124;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!ut;Lclient!gi;IIIIIIIIII)V")
	public Class267(@OriginalArg(0) String arg0, @OriginalArg(1) Class335 arg1, @OriginalArg(2) Class122 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt7132 = arg8;
		this.aClass335_16 = arg1;
		this.anInt7134 = arg11;
		this.anInt7123 = arg7;
		this.anInt7135 = arg4;
		this.anInt7121 = arg5;
		this.aString71 = arg0;
		this.anInt7128 = arg12;
		this.aClass122_13 = arg2;
		this.anInt7122 = arg9;
		this.anInt7131 = arg3;
		this.anInt7130 = arg6;
		this.anInt7124 = arg10;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)Lclient!rw;")
	@Override
	public Class297 method7306() {
		return Static157.aClass297_7;
	}
}
