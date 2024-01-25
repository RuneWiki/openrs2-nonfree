import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class1_Sub4_Sub5 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bj", name = "L", descriptor = "I")
	private int anInt522 = 4096;

	@OriginalMember(owner = "client!bj", name = "P", descriptor = "I")
	private int anInt525 = 3216;

	@OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
	private int anInt524 = 3216;

	@OriginalMember(owner = "client!bj", name = "Q", descriptor = "[I")
	private final int[] anIntArray31 = new int[3];

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(27) int local27 = Static80.anInt1499 * this.anInt522 >> 12;
			@Pc(39) int[] local39 = this.method5695(arg0 - 1 & Static452.anInt7487, 0);
			@Pc(45) int[] local45 = this.method5695(arg0, 0);
			@Pc(55) int[] local55 = this.method5695(arg0 + 1 & Static452.anInt7487, 0);
			for (@Pc(57) int local57 = 0; local57 < Static395.anInt6592; local57++) {
				@Pc(72) int local72 = (local55[local57] - local39[local57]) * local27 >> 12;
				@Pc(92) int local92 = local27 * (local45[Static247.anInt4469 & local57 - 1] - local45[Static247.anInt4469 & local57 + 1]) >> 12;
				@Pc(96) int local96 = local92 >> 4;
				@Pc(100) int local100 = local72 >> 4;
				if (local96 < 0) {
					local96 = -local96;
				}
				if (local100 < 0) {
					local100 = -local100;
				}
				if (local96 > 255) {
					local96 = 255;
				}
				if (local100 > 255) {
					local100 = 255;
				}
				@Pc(144) int local144 = Class57_Sub2.aByteArray62[(local100 * (local100 + 1) >> 1) + local96] & 0xFF;
				@Pc(150) int local150 = local144 * 4096 >> 8;
				@Pc(156) int local156 = local144 * local92 >> 8;
				@Pc(162) int local162 = local144 * local72 >> 8;
				@Pc(171) int local171 = local162 * this.anIntArray31[1] >> 12;
				@Pc(180) int local180 = this.anIntArray31[0] * local156 >> 12;
				@Pc(189) int local189 = this.anIntArray31[2] * local150 >> 12;
				local16[local57] = local171 + local180 + local189;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt522 = arg0.method5335();
		} else if (arg1 == 1) {
			this.anInt525 = arg0.method5335();
		} else if (arg1 == 2) {
			this.anInt524 = arg0.method5335();
		}
	}

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V")
	@Override
	public void method5686() {
		this.method425();
	}

	@OriginalMember(owner = "client!bj", name = "m", descriptor = "(I)V")
	private void method425() {
		@Pc(16) double local16 = Math.cos((double) ((float) this.anInt524 / 4096.0F));
		this.anIntArray31[0] = (int) (local16 * Math.sin((double) ((float) this.anInt525 / 4096.0F)) * 4096.0D);
		this.anIntArray31[1] = (int) (Math.cos((double) ((float) this.anInt525 / 4096.0F)) * 4096.0D * local16);
		this.anIntArray31[2] = (int) (Math.sin((double) ((float) this.anInt524 / 4096.0F)) * 4096.0D);
		@Pc(74) int local74 = this.anIntArray31[0] * this.anIntArray31[0] >> 12;
		@Pc(86) int local86 = this.anIntArray31[1] * this.anIntArray31[1] >> 12;
		@Pc(98) int local98 = this.anIntArray31[2] * this.anIntArray31[2] >> 12;
		@Pc(113) int local113 = (int) (Math.sqrt((double) (local74 + local86 + local98 >> 12)) * 4096.0D);
		if (local113 != 0) {
			this.anIntArray31[1] = (this.anIntArray31[1] << 12) / local113;
			this.anIntArray31[0] = (this.anIntArray31[0] << 12) / local113;
			this.anIntArray31[2] = (this.anIntArray31[2] << 12) / local113;
		}
	}
}
