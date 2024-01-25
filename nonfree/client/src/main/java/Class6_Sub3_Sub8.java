import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class6_Sub3_Sub8 extends Class6_Sub3 {

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
	private int anInt2463 = 4096;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(33) int[] local33 = this.method7824(0, Static252.anInt4135 & arg0 - 1);
			@Pc(39) int[] local39 = this.method7824(0, arg0);
			@Pc(49) int[] local49 = this.method7824(0, arg0 + 1 & Static252.anInt4135);
			for (@Pc(51) int local51 = 0; local51 < Static447.anInt8568; local51++) {
				@Pc(65) int local65 = this.anInt2463 * (local49[local51] - local33[local51]);
				@Pc(85) int local85 = (local39[Static392.anInt6966 & local51 + 1] - local39[Static392.anInt6966 & local51 - 1]) * this.anInt2463;
				@Pc(89) int local89 = local85 >> 12;
				@Pc(93) int local93 = local65 >> 12;
				@Pc(99) int local99 = local89 * local89 >> 12;
				@Pc(105) int local105 = local93 * local93 >> 12;
				@Pc(119) int local119 = (int) (Math.sqrt((double) ((float) (local105 + local99 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local119 == 0 ? 0 : 16777216 / local119;
				local19[local51] = 4096 - local127;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2463 = arg1.method6006();
		}
	}
}
