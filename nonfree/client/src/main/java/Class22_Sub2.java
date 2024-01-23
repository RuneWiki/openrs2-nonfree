import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	public int anInt536;

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
	public int anInt543;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
	private int anInt538 = -32768;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIJILclient!ko;)V")
	@Override
	public void method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class45_Sub2 arg10) {
		@Pc(17) Class22_Sub4 local17 = Static271.method4006(this.anInt543).method3734(-1, null, 0, 0, this.anInt536, null);
		if (local17 != null) {
			local17.method4073(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt538 = local17.method4071();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "()I")
	@Override
	public int method4071() {
		return this.anInt538;
	}
}
