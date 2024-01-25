import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
	private final int anInt4800;

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
	private final int anInt4807;

	@OriginalMember(owner = "client!nr", name = "o", descriptor = "I")
	private final int anInt4803;

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
	private final int anInt4805;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(IIIIIII)V")
	public Class43_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4800 = arg1;
		this.anInt4807 = arg3;
		this.anInt4803 = arg2;
		this.anInt4805 = arg0;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt4805 * arg0 >> 12;
		@Pc(21) int local21 = this.anInt4803 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt4800 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt4807 >> 12;
		Static444.method5716(local35, local14, local28, local21, super.anInt7284);
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(III)V")
	@Override
	public void method5624(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt4805 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt4803 >> 12;
		@Pc(28) int local28 = this.anInt4800 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt4807 * arg1 >> 12;
		Static454.method5852(super.anInt7285, local35, super.anInt7283, local28, local21, local14);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)V")
	@Override
	public void method5621(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4805 * arg1 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt4803 >> 12;
		@Pc(32) int local32 = this.anInt4800 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt4807 >> 12;
		Static391.method5273(local32, local10, super.anInt7285, local25, super.anInt7283, super.anInt7284, local39);
	}
}
