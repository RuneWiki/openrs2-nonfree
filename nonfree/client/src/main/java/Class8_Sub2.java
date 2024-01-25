import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!baa", name = "q", descriptor = "I")
	public final int anInt4423;

	@OriginalMember(owner = "client!baa", name = "B", descriptor = "I")
	public final int anInt4432;

	@OriginalMember(owner = "client!baa", name = "t", descriptor = "I")
	public final int anInt4426;

	@OriginalMember(owner = "client!baa", name = "x", descriptor = "I")
	public final int anInt4430;

	@OriginalMember(owner = "client!baa", name = "w", descriptor = "I")
	public final int anInt4429;

	@OriginalMember(owner = "client!baa", name = "p", descriptor = "I")
	public final int anInt4422;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!jg;Lclient!jha;IIIIIIIIIIIII)V")
	public Class8_Sub2(@OriginalArg(0) Class174 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4423 = arg13;
		this.anInt4432 = arg11;
		this.anInt4426 = arg14;
		this.anInt4430 = arg12;
		this.anInt4429 = arg10;
		this.anInt4422 = arg9;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)Lclient!jw;")
	@Override
	public Class184 method7078() {
		return Static390.aClass184_9;
	}
}
