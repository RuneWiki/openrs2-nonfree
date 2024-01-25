import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public final class Class194 implements Interface4 {

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
	public final int anInt5037;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "Lclient!or;")
	public final Class259 aClass259_8;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
	public final int anInt5035;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
	public final int anInt5034;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "Lclient!ma;")
	public final Class216 aClass216_8;

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "Z")
	public final boolean aBoolean383;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	public final int anInt5039;

	@OriginalMember(owner = "client!kp", name = "n", descriptor = "I")
	public final int anInt5042;

	@OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
	public final int anInt5038;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
	public final int anInt5040;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
	public final int anInt5036;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(ILclient!or;Lclient!ma;IIIIIIIZ)V")
	public Class194(@OriginalArg(0) int arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class216 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) boolean arg10) {
		this.anInt5037 = arg9;
		this.aClass259_8 = arg1;
		this.anInt5035 = arg0;
		this.anInt5034 = arg5;
		this.aClass216_8 = arg2;
		this.aBoolean383 = arg10;
		this.anInt5039 = arg8;
		this.anInt5042 = arg6;
		this.anInt5038 = arg4;
		this.anInt5040 = arg3;
		this.anInt5036 = arg7;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)Lclient!oh;")
	@Override
	public Class252 method6715() {
		return Static237.aClass252_8;
	}
}
