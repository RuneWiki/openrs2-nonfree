import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!b", name = "o", descriptor = "I")
	public final int anInt652;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	public final int anInt656;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lclient!qk;Lclient!kr;IIIIIIIII)V")
	public Class21_Sub1(@OriginalArg(0) Class304 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt652 = arg9;
		this.anInt656 = arg10;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Lclient!wv;")
	@Override
	public Class409 method7832() {
		return Static223.aClass409_7;
	}
}
