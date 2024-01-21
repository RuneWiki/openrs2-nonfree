import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class4_Sub3_Sub39 extends Class4_Sub3 {

	@OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
	private int anInt4129;

	@OriginalMember(owner = "client!wg", name = "X", descriptor = "I")
	private int anInt4131;

	@OriginalMember(owner = "client!wg", name = "cb", descriptor = "I")
	private int anInt4134;

	@OriginalMember(owner = "client!wg", name = "fb", descriptor = "I")
	private int anInt4136;

	@OriginalMember(owner = "client!wg", name = "gb", descriptor = "[I")
	private int[] anIntArray441;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4134 = arg1.method1252();
		} else if (arg0 == 1) {
			this.anInt4131 = arg1.method1252();
		} else if (arg0 == 2) {
			this.anInt4129 = arg1.method1252();
		} else if (arg0 == 3) {
			this.anInt4136 = arg1.method1252();
		} else if (arg0 == 4) {
			@Pc(56) int local56 = arg1.method1225();
			this.anIntArray441[1] = local56 >> 4 & 0xFF0;
			this.anIntArray441[2] = local56 >> 12 & 0x0;
			this.anIntArray441[0] = (local56 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(15) int[][] local15 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(25) int[][] local25 = this.method3150(0, arg0);
			@Pc(29) int[] local29 = local25[1];
			@Pc(33) int[] local33 = local25[0];
			@Pc(37) int[] local37 = local25[2];
			@Pc(41) int[] local41 = local15[1];
			@Pc(45) int[] local45 = local15[0];
			@Pc(49) int[] local49 = local15[2];
			for (@Pc(51) int local51 = 0; local51 < Static134.anInt3188; local51++) {
				@Pc(57) int local57 = local33[local51];
				@Pc(65) int local65 = local57 - this.anIntArray441[0];
				if (local65 < 0) {
					local65 = -local65;
				}
				if (this.anInt4134 < local65) {
					local45[local51] = local57;
					local41[local51] = local29[local51];
					local49[local51] = local37[local51];
				} else {
					@Pc(99) int local99 = local29[local51];
					local65 = local99 - this.anIntArray441[1];
					if (local65 < 0) {
						local65 = -local65;
					}
					if (this.anInt4134 < local65) {
						local45[local51] = local57;
						local41[local51] = local99;
						local49[local51] = local37[local51];
					} else {
						@Pc(143) int local143 = local37[local51];
						local65 = local143 - this.anIntArray441[2];
						if (local65 < 0) {
							local65 = -local65;
						}
						if (this.anInt4134 < local65) {
							local45[local51] = local57;
							local41[local51] = local99;
							local49[local51] = local143;
						} else {
							local45[local51] = local57 * this.anInt4136 >> 12;
							local41[local51] = local99 * this.anInt4129 >> 12;
							local49[local51] = this.anInt4131 * local143 >> 12;
						}
					}
				}
			}
		}
		return local15;
	}
}
