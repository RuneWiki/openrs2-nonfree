import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public final class Class109_Sub3 extends Class109 {

	@OriginalMember(owner = "client!uu", name = "s", descriptor = "I")
	public final int anInt9915;

	@OriginalMember(owner = "client!uu", name = "t", descriptor = "I")
	public final int anInt9916;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lclient!ee;Lclient!haa;IIIIIIIII)V")
	public Class109_Sub3(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9915 = arg10;
		this.anInt9916 = arg9;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)Lclient!hda;")
	@Override
	public Class129 method8540() {
		return Static98.aClass129_4;
	}
}
