import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class3_Sub2_Sub33 extends Class3_Sub2 {

	@OriginalMember(owner = "client!po", name = "K", descriptor = "[B")
	public static byte[] aByteArray54;

	@OriginalMember(owner = "client!po", name = "M", descriptor = "I")
	private int anInt4290 = 4096;

	static {
		@Pc(1) int local1 = 0;
		aByteArray54 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(11) int local11 = 0; local11 <= local6; local11++) {
				aByteArray54[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local11 * local11 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub33() {
		super(1, true);
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(12) int[] local12 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(31) int[] local31 = this.method4954(arg0 - 1 & Static148.anInt2810, 0);
			@Pc(37) int[] local37 = this.method4954(arg0, 0);
			@Pc(47) int[] local47 = this.method4954(Static148.anInt2810 & arg0 + 1, 0);
			for (@Pc(49) int local49 = 0; local49 < Static22.anInt421; local49++) {
				@Pc(71) int local71 = (local37[Static84.anInt1566 & local49 + 1] - local37[Static84.anInt1566 & local49 - 1]) * this.anInt4290;
				@Pc(75) int local75 = local71 >> 12;
				@Pc(81) int local81 = local75 * local75 >> 12;
				@Pc(93) int local93 = this.anInt4290 * (local47[local49] - local31[local49]);
				@Pc(97) int local97 = local93 >> 12;
				@Pc(103) int local103 = local97 * local97 >> 12;
				@Pc(118) int local118 = (int) (Math.sqrt((double) ((float) (local81 + local103 + 4096) / 4096.0F)) * 4096.0D);
				@Pc(127) int local127 = local118 == 0 ? 0 : 16777216 / local118;
				local12[local49] = 4096 - local127;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt4290 = arg1.method3948();
		}
	}
}
