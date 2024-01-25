import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class2_Sub2_Sub34 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ut", name = "P", descriptor = "I")
	private int anInt8931 = 3216;

	@OriginalMember(owner = "client!ut", name = "M", descriptor = "[I")
	private final int[] anIntArray646 = new int[3];

	@OriginalMember(owner = "client!ut", name = "Q", descriptor = "I")
	private int anInt8932 = 3216;

	@OriginalMember(owner = "client!ut", name = "O", descriptor = "I")
	private int anInt8930 = 4096;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub34() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(30) int local30 = this.anInt8930 * Static299.anInt5407 >> 12;
			@Pc(40) int[] local40 = this.method7951(arg0 - 1 & Static28.anInt6368, 0);
			@Pc(46) int[] local46 = this.method7951(arg0, 0);
			@Pc(56) int[] local56 = this.method7951(arg0 + 1 & Static28.anInt6368, 0);
			for (@Pc(58) int local58 = 0; local58 < Static153.anInt3070; local58++) {
				@Pc(72) int local72 = (local56[local58] - local40[local58]) * local30 >> 12;
				@Pc(93) int local93 = (local46[local58 - 1 & Static431.anInt7305] - local46[Static431.anInt7305 & local58 + 1]) * local30 >> 12;
				@Pc(97) int local97 = local93 >> 4;
				@Pc(101) int local101 = local72 >> 4;
				if (local97 < 0) {
					local97 = -local97;
				}
				if (local101 < 0) {
					local101 = -local101;
				}
				if (local97 > 255) {
					local97 = 255;
				}
				if (local101 > 255) {
					local101 = 255;
				}
				@Pc(138) int local138 = Class9_Sub3.aByteArray59[(local101 * (local101 + 1) >> 1) + local97] & 0xFF;
				@Pc(144) int local144 = local138 * local72 >> 8;
				@Pc(150) int local150 = local138 * local93 >> 8;
				@Pc(156) int local156 = local138 * 4096 >> 8;
				@Pc(165) int local165 = this.anIntArray646[0] * local150 >> 12;
				@Pc(174) int local174 = this.anIntArray646[1] * local144 >> 12;
				@Pc(183) int local183 = this.anIntArray646[2] * local156 >> 12;
				local19[local58] = local183 + local174 + local165;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8930 = arg0.method4294();
		} else if (arg1 == 1) {
			this.anInt8931 = arg0.method4294();
		} else if (arg1 == 2) {
			this.anInt8932 = arg0.method4294();
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
		this.method7461();
	}

	@OriginalMember(owner = "client!ut", name = "i", descriptor = "(I)V")
	private void method7461() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt8932 / 4096.0F));
		this.anIntArray646[0] = (int) (Math.sin((double) ((float) this.anInt8931 / 4096.0F)) * local11 * (double) 4096);
		this.anIntArray646[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt8931 / 4096.0F)));
		this.anIntArray646[2] = (int) (Math.sin((double) ((float) this.anInt8932 / 4096.0F)) * 4096.0D);
		@Pc(70) int local70 = this.anIntArray646[0] * this.anIntArray646[0] >> 12;
		@Pc(82) int local82 = this.anIntArray646[1] * this.anIntArray646[1] >> 12;
		@Pc(94) int local94 = this.anIntArray646[2] * this.anIntArray646[2] >> 12;
		@Pc(107) int local107 = (int) (Math.sqrt((double) (local94 + local82 + local70 >> 12)) * 4096.0D);
		if (local107 != 0) {
			this.anIntArray646[2] = (this.anIntArray646[2] << 12) / local107;
			this.anIntArray646[1] = (this.anIntArray646[1] << 12) / local107;
			this.anIntArray646[0] = (this.anIntArray646[0] << 12) / local107;
		}
	}
}
