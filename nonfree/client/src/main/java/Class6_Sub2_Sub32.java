import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class6_Sub2_Sub32 extends Class6_Sub2 {

	@OriginalMember(owner = "client!rb", name = "B", descriptor = "[B")
	public static final byte[] aByteArray74;

	@OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
	private int anInt5719 = 4096;

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
	private int anInt5718 = 4096;

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "I")
	private int anInt5717 = 4096;

	static {
		@Pc(1) int local1 = 0;
		aByteArray74 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray74[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local9 * local9 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5718 = arg0.method3108();
		} else if (arg1 == 1) {
			this.anInt5719 = arg0.method3108();
		} else if (arg1 == 2) {
			this.anInt5717 = arg0.method3108();
		}
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5868(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass130_41.method2911(arg0);
		if (super.aClass130_41.aBoolean230) {
			@Pc(28) int[][] local28 = this.method5867(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local18[0];
			@Pc(48) int[] local48 = local18[1];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static185.anInt4925; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local40[local54];
				@Pc(68) int local68 = local36[local54];
				if (local60 == local64 && local68 == local64) {
					local44[local54] = local60 * this.anInt5718 >> 12;
					local48[local54] = local64 * this.anInt5719 >> 12;
					local52[local54] = this.anInt5717 * local68 >> 12;
				} else {
					local44[local54] = this.anInt5718;
					local48[local54] = this.anInt5719;
					local52[local54] = this.anInt5717;
				}
			}
		}
		return local18;
	}
}
