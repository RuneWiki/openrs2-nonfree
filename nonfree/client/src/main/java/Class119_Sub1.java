import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!or", name = "t", descriptor = "I")
	public final int anInt3096;

	@OriginalMember(owner = "client!or", name = "z", descriptor = "I")
	public final int anInt3102;

	@OriginalMember(owner = "client!or", name = "s", descriptor = "I")
	public final int anInt3095;

	@OriginalMember(owner = "client!or", name = "v", descriptor = "I")
	public final int anInt3098;

	@OriginalMember(owner = "client!or", name = "x", descriptor = "I")
	public final int anInt3100;

	@OriginalMember(owner = "client!or", name = "u", descriptor = "I")
	public final int anInt3097;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!nha;Lclient!jn;IIIIIIIIIIIII)V")
	public Class119_Sub1(@OriginalArg(0) Class245 arg0, @OriginalArg(1) Class183 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt3096 = arg11;
		this.anInt3102 = arg9;
		this.anInt3095 = arg14;
		this.anInt3098 = arg12;
		this.anInt3100 = arg13;
		this.anInt3097 = arg10;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Lclient!vj;")
	@Override
	public Class365 method9019() {
		return Static392.aClass365_14;
	}
}
