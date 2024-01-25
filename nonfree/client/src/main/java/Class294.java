import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public final class Class294 implements Interface23 {

	@OriginalMember(owner = "client!rp", name = "k", descriptor = "I")
	public final int anInt8598;

	@OriginalMember(owner = "client!rp", name = "o", descriptor = "I")
	public final int anInt8601;

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "I")
	public final int anInt8593;

	@OriginalMember(owner = "client!rp", name = "i", descriptor = "I")
	public final int anInt8596;

	@OriginalMember(owner = "client!rp", name = "m", descriptor = "Lclient!pe;")
	public final Class258 aClass258_9;

	@OriginalMember(owner = "client!rp", name = "f", descriptor = "I")
	public final int anInt8594;

	@OriginalMember(owner = "client!rp", name = "n", descriptor = "I")
	public final int anInt8600;

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "I")
	public final int anInt8597;

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "I")
	public final int anInt8599;

	@OriginalMember(owner = "client!rp", name = "g", descriptor = "I")
	public final int anInt8595;

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "I")
	public final int anInt8590;

	@OriginalMember(owner = "client!rp", name = "h", descriptor = "Lclient!op;")
	public final Class250 aClass250_10;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString82;

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!pe;Lclient!op;IIIIIIIIII)V")
	public Class294(@OriginalArg(0) String arg0, @OriginalArg(1) Class258 arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt8598 = arg8;
		this.anInt8601 = arg7;
		this.anInt8593 = arg5;
		this.anInt8596 = arg6;
		this.aClass258_9 = arg1;
		this.anInt8594 = arg10;
		this.anInt8600 = arg3;
		this.anInt8597 = arg4;
		this.anInt8599 = arg9;
		this.anInt8595 = arg11;
		this.anInt8590 = arg12;
		this.aClass250_10 = arg2;
		this.aString82 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)Lclient!sq;")
	@Override
	public Class307 method8175() {
		return Static268.aClass307_6;
	}
}
