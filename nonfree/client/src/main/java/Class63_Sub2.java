import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public final class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!hu", name = "u", descriptor = "I")
	public final int anInt3898;

	@OriginalMember(owner = "client!hu", name = "s", descriptor = "I")
	public final int anInt3896;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lclient!ada;Lclient!oe;IIIIIIIII)V")
	public Class63_Sub2(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class249 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt3898 = arg9;
		this.anInt3896 = arg10;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Lclient!of;")
	@Override
	public Class251 method8737() {
		return Static568.aClass251_6;
	}
}
