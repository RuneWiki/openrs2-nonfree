import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public final class Class36 implements Interface4 {

	@OriginalMember(owner = "client!cca", name = "g", descriptor = "I")
	public final int anInt1055;

	@OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
	public final int anInt1053;

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "I")
	public final int anInt1061;

	@OriginalMember(owner = "client!cca", name = "k", descriptor = "I")
	public final int anInt1059;

	@OriginalMember(owner = "client!cca", name = "f", descriptor = "I")
	public final int anInt1054;

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
	public final int anInt1050;

	@OriginalMember(owner = "client!cca", name = "l", descriptor = "Lclient!or;")
	public final Class259 aClass259_2;

	@OriginalMember(owner = "client!cca", name = "n", descriptor = "I")
	public final int anInt1060;

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "I")
	public final int anInt1051;

	@OriginalMember(owner = "client!cca", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString7;

	@OriginalMember(owner = "client!cca", name = "j", descriptor = "I")
	public final int anInt1058;

	@OriginalMember(owner = "client!cca", name = "p", descriptor = "Lclient!ma;")
	public final Class216 aClass216_3;

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
	public final int anInt1052;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!or;Lclient!ma;IIIIIIIIII)V")
	public Class36(@OriginalArg(0) String arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class216 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.anInt1055 = arg3;
		this.anInt1053 = arg10;
		this.anInt1061 = arg5;
		this.anInt1059 = arg8;
		this.anInt1054 = arg12;
		this.anInt1050 = arg11;
		this.aClass259_2 = arg1;
		this.anInt1060 = arg7;
		this.anInt1051 = arg6;
		this.aString7 = arg0;
		this.anInt1058 = arg4;
		this.aClass216_3 = arg2;
		this.anInt1052 = arg9;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)Lclient!oh;")
	@Override
	public Class252 method6715() {
		return Static241.aClass252_9;
	}
}
