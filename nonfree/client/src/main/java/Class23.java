import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class Class23 implements Interface4 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public final int anInt8308;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public final int anInt8312;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!ma;")
	public final Class216 aClass216_12;

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
	public final int anInt8311;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public final int anInt8314;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public final int anInt8309;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public final int anInt8315;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!or;")
	public final Class259 aClass259_12;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
	public final int anInt8310;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!or;Lclient!ma;IIIIIII)V")
	public Class23(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		this.anInt8308 = arg3;
		this.anInt8312 = arg6;
		this.aClass216_12 = arg1;
		this.anInt8311 = arg7;
		this.anInt8314 = arg4;
		this.anInt8309 = arg5;
		this.anInt8315 = arg2;
		this.aClass259_12 = arg0;
		this.anInt8310 = arg8;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)Lclient!oh;")
	@Override
	public Class252 method6715() {
		return null;
	}
}
