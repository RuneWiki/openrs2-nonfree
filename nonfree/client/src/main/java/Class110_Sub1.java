import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class Class110_Sub1 extends Class110 {

	@OriginalMember(owner = "client!gea", name = "v", descriptor = "I")
	public final int anInt3561;

	@OriginalMember(owner = "client!gea", name = "q", descriptor = "I")
	public final int anInt3556;

	@OriginalMember(owner = "client!gea", name = "s", descriptor = "I")
	public final int anInt3558;

	@OriginalMember(owner = "client!gea", name = "u", descriptor = "I")
	public final int anInt3560;

	@OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
	public final int anInt3563;

	@OriginalMember(owner = "client!gea", name = "t", descriptor = "I")
	public final int anInt3559;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!fda;Lclient!aba;IIIIIIIIIIIII)V")
	public Class110_Sub1(@OriginalArg(0) Class112 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt3561 = arg14;
		this.anInt3556 = arg9;
		this.anInt3558 = arg12;
		this.anInt3560 = arg10;
		this.anInt3563 = arg11;
		this.anInt3559 = arg13;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)Lclient!ve;")
	@Override
	public Class370 method7954() {
		return Static114.aClass370_1;
	}
}
