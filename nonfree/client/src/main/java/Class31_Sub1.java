import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!cs", name = "r", descriptor = "I")
	public final int anInt7731;

	@OriginalMember(owner = "client!cs", name = "p", descriptor = "I")
	public final int anInt7740;

	@OriginalMember(owner = "client!cs", name = "s", descriptor = "I")
	public final int anInt7737;

	@OriginalMember(owner = "client!cs", name = "o", descriptor = "I")
	public final int anInt7734;

	@OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
	public final int anInt7732;

	@OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
	public final int anInt7741;

	@OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lclient!lk;Lclient!vea;IIIIIIIIIIIII)V")
	public Class31_Sub1(@OriginalArg(0) Class219 arg0, @OriginalArg(1) Class368 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt7731 = arg13;
		this.anInt7740 = arg9;
		this.anInt7737 = arg10;
		this.anInt7734 = arg11;
		this.anInt7732 = arg12;
		this.anInt7741 = arg14;
	}

	@OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Lclient!vaa;")
	@Override
	public Class361 method8585() {
		return Static335.aClass361_14;
	}
}
