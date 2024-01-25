import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class221_Sub3 extends Class221 {

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
	private final int anInt8258;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
	private final int anInt8261;

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
	private final int anInt8269;

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
	private final int anInt8268;

	@OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
	private final int anInt8266;

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
	private final int anInt8265;

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
	private final int anInt8260;

	@OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
	private final int anInt8262;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class221_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt8258 = arg6;
		this.anInt8261 = arg4;
		this.anInt8269 = arg7;
		this.anInt8268 = arg3;
		this.anInt8266 = arg1;
		this.anInt8265 = arg0;
		this.anInt8260 = arg2;
		this.anInt8262 = arg5;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)V")
	@Override
	public void method7274(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(III)V")
	@Override
	public void method7276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt8265 * arg1 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt8266 >> 12;
		@Pc(24) int local24 = this.anInt8260 * arg1 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt8268 >> 12;
		@Pc(42) int local42 = this.anInt8261 * arg1 >> 12;
		@Pc(49) int local49 = this.anInt8262 * arg0 >> 12;
		@Pc(56) int local56 = this.anInt8258 * arg1 >> 12;
		@Pc(63) int local63 = this.anInt8269 * arg0 >> 12;
		Static68.method1123(local10, local42, local17, super.anInt8713, local35, local63, local56, local24, local49);
	}
}
