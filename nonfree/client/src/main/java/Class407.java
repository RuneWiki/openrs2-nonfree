import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class407 implements Interface17 {

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "I")
	public final int anInt11035;

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
	public final int anInt11044;

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "I")
	public final int anInt11036;

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
	public final int anInt11046;

	@OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
	public final int anInt11033;

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
	public final int anInt11037;

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
	public final int anInt11045;

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "Lclient!al;")
	public final Class18 aClass18_17;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
	public final int anInt11043;

	@OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
	public final int anInt11039;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "Lclient!mfa;")
	public final Class239 aClass239_21;

	@OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
	public final int anInt11041;

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString133;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!al;Lclient!mfa;IIIIIIIIII)V")
	public Class407(@OriginalArg(0) String arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt11035 = arg11;
		this.anInt11044 = arg3;
		this.anInt11036 = arg7;
		this.anInt11046 = arg9;
		this.anInt11033 = arg8;
		this.anInt11037 = arg12;
		this.anInt11045 = arg10;
		this.aClass18_17 = arg1;
		this.anInt11043 = arg5;
		this.anInt11039 = arg4;
		this.aClass239_21 = arg2;
		this.anInt11041 = arg6;
		this.aString133 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)Lclient!hfa;")
	@Override
	public Class152 method9627() {
		return Static53.aClass152_1;
	}
}
