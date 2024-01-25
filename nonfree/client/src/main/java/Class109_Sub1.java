import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class Class109_Sub1 extends Class109 {

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
	public final int anInt4626;

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
	public final int anInt4634;

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
	public final int anInt4628;

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
	public final int anInt4635;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
	public final int anInt4633;

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
	public final int anInt4632;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!ee;Lclient!haa;IIIIIIIIIIIII)V")
	public Class109_Sub1(@OriginalArg(0) Class79 arg0, @OriginalArg(1) Class127 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4626 = arg13;
		this.anInt4634 = arg14;
		this.anInt4628 = arg10;
		this.anInt4635 = arg11;
		this.anInt4633 = arg9;
		this.anInt4632 = arg12;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)Lclient!hda;")
	@Override
	public Class129 method8540() {
		return Static540.aClass129_9;
	}
}
