import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class6_Sub2_Sub12 extends Class6_Sub2 {

	@OriginalMember(owner = "client!gk", name = "B", descriptor = "I")
	private int anInt2271;

	@OriginalMember(owner = "client!gk", name = "C", descriptor = "I")
	private int anInt2272;

	@OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
	private int anInt2275;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub12() {
		this(0);
	}

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(I)V")
	private Class6_Sub2_Sub12(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method2088(arg0);
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(II)V")
	private void method2088(@OriginalArg(0) int arg0) {
		this.anInt2272 = arg0 >> 12 & 0xFF0;
		this.anInt2271 = arg0 >> 4 & 0xFF0;
		this.anInt2275 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method2088(arg0.method3078());
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(19) int[] local19 = local11[0];
			@Pc(23) int[] local23 = local11[1];
			@Pc(27) int[] local27 = local11[2];
			for (@Pc(29) int local29 = 0; local29 < Static185.anInt4925; local29++) {
				local19[local29] = this.anInt2272;
				local23[local29] = this.anInt2271;
				local27[local29] = this.anInt2275;
			}
		}
		return local11;
	}
}
