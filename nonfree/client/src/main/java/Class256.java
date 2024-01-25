import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class256 implements Interface19 {

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "I")
	public final int anInt6834;

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
	public final int anInt6843;

	@OriginalMember(owner = "client!oq", name = "o", descriptor = "Ljava/lang/String;")
	public final String aString79;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
	public final int anInt6835;

	@OriginalMember(owner = "client!oq", name = "l", descriptor = "I")
	public final int anInt6840;

	@OriginalMember(owner = "client!oq", name = "g", descriptor = "I")
	public final int anInt6836;

	@OriginalMember(owner = "client!oq", name = "j", descriptor = "I")
	public final int anInt6838;

	@OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
	public final int anInt6842;

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "Lclient!cp;")
	public final Class58 aClass58_11;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "Lclient!rt;")
	public final Class297 aClass297_10;

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "I")
	public final int anInt6833;

	@OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
	public final int anInt6841;

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
	public final int anInt6844;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!rt;Lclient!cp;IIIIIIIIII)V")
	public Class256(@OriginalArg(0) String arg0, @OriginalArg(1) Class297 arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt6834 = arg12;
		this.anInt6843 = arg3;
		this.aString79 = arg0;
		this.anInt6835 = arg5;
		this.anInt6840 = arg9;
		this.anInt6836 = arg8;
		this.anInt6838 = arg11;
		this.anInt6842 = arg10;
		this.aClass58_11 = arg2;
		this.aClass297_10 = arg1;
		this.anInt6833 = arg6;
		this.anInt6841 = arg7;
		this.anInt6844 = arg4;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)Lclient!os;")
	@Override
	public Class258 method7256() {
		return Static547.aClass258_18;
	}
}
