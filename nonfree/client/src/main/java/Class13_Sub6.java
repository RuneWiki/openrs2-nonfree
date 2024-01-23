import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class13_Sub6 extends Class13 {

	@OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
	public int anInt4615;

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
	public int anInt4616;

	@OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
	private int anInt4621 = -32768;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIIIIJILclient!il;)V")
	@Override
	public void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class21_Sub1 arg10) {
		@Pc(17) Class13_Sub1 local17 = Static187.method3128(this.anInt4615).method924(null, 0, -1, null, this.anInt4616, 0);
		if (local17 != null) {
			local17.method4262(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt4621 = local17.method4266();
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "()I")
	@Override
	public int method4266() {
		return this.anInt4621;
	}
}
