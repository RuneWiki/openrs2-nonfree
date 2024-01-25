import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class343 implements Interface14 {

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "[I")
	public static final int[] anIntArray516 = new int[256];

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "Ljava/lang/String;")
	public final String aString97;

	@OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
	public final int anInt9407;

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
	public final int anInt9399;

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
	public final int anInt9405;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
	public final int anInt9401;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
	public final int anInt9398;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "Lclient!aba;")
	public final Class4 aClass4_12;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
	public final int anInt9408;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
	public final int anInt9403;

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
	public final int anInt9402;

	@OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
	public final int anInt9409;

	@OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
	public final int anInt9410;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "Lclient!fda;")
	public final Class112 aClass112_17;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray516[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!fda;Lclient!aba;IIIIIIIIII)V")
	public Class343(@OriginalArg(0) String arg0, @OriginalArg(1) Class112 arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aString97 = arg0;
		this.anInt9407 = arg11;
		this.anInt9399 = arg12;
		this.anInt9405 = arg7;
		this.anInt9401 = arg4;
		this.anInt9398 = arg9;
		this.aClass4_12 = arg2;
		this.anInt9408 = arg6;
		this.anInt9403 = arg10;
		this.anInt9402 = arg8;
		this.anInt9409 = arg5;
		this.anInt9410 = arg3;
		this.aClass112_17 = arg1;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)Lclient!ve;")
	@Override
	public Class370 method7954() {
		return Static355.aClass370_4;
	}
}
