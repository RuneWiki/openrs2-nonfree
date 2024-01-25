import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class6_Sub2_Sub23 extends Class6_Sub2 {

	@OriginalMember(owner = "client!mp", name = "G", descriptor = "I")
	private int anInt4295;

	@OriginalMember(owner = "client!mp", name = "I", descriptor = "I")
	private int anInt4297;

	@OriginalMember(owner = "client!mp", name = "L", descriptor = "[I")
	private int[] anIntArray387;

	@OriginalMember(owner = "client!mp", name = "B", descriptor = "I")
	private int anInt4291 = -1;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub23() {
		super(0, false);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4291 = arg0.method3108();
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)V")
	@Override
	public void method5860(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		super.method5860(arg0, arg1);
		if (this.anInt4291 >= 0 && Static140.anInterface11_4 != null) {
			@Pc(32) int local32 = Static140.anInterface11_4.method2466(this.anInt4291).aBoolean405 ? 64 : 128;
			this.anIntArray387 = Static140.anInterface11_4.method2467(local32, false, this.anInt4291, 1.0F, local32);
			this.anInt4295 = local32;
			this.anInt4297 = local32;
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(40) int local40 = (this.anInt4297 == Static345.anInt5779 ? arg0 : arg0 * this.anInt4297 / Static345.anInt5779) * this.anInt4295;
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			@Pc(62) int local62;
			@Pc(71) int local71;
			if (this.anInt4295 == Static185.anInt4925) {
				for (local62 = 0; local62 < Static185.anInt4925; local62++) {
					local71 = this.anIntArray387[local40++];
					local52[local62] = (local71 & 0xFF) << 4;
					local48[local62] = local71 >> 4 & 0xFF0;
					local44[local62] = local71 >> 12 & 0xFF0;
				}
			} else {
				for (local62 = 0; local62 < Static185.anInt4925; local62++) {
					local71 = this.anInt4295 * local62 / Static185.anInt4925;
					@Pc(78) int local78 = this.anIntArray387[local71 + local40];
					local52[local62] = (local78 & 0xFF) << 4;
					local48[local62] = local78 >> 4 & 0xFF0;
					local44[local62] = local78 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "(I)I")
	@Override
	public int method5865() {
		return this.anInt4291;
	}

	@OriginalMember(owner = "client!mp", name = "e", descriptor = "(I)V")
	@Override
	public void method5864() {
		super.method5864();
		this.anIntArray387 = null;
	}
}
