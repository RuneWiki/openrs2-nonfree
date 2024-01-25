import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class2_Sub6_Sub39 extends Class2_Sub6 {

	@OriginalMember(owner = "client!wl", name = "M", descriptor = "I")
	private int anInt10176 = 4096;

	@OriginalMember(owner = "client!wl", name = "J", descriptor = "I")
	private int anInt10174 = 3216;

	@OriginalMember(owner = "client!wl", name = "R", descriptor = "I")
	private int anInt10181 = 3216;

	@OriginalMember(owner = "client!wl", name = "I", descriptor = "[I")
	private final int[] anIntArray690 = new int[3];

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub39() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(29) int local29 = Static385.anInt6041 * this.anInt10176 >> 12;
			@Pc(39) int[] local39 = this.method8461(0, arg0 - 1 & Static53.anInt1098);
			@Pc(45) int[] local45 = this.method8461(0, arg0);
			@Pc(55) int[] local55 = this.method8461(0, Static53.anInt1098 & arg0 + 1);
			for (@Pc(57) int local57 = 0; local57 < Static51.anInt1085; local57++) {
				@Pc(72) int local72 = local29 * (local55[local57] - local39[local57]) >> 12;
				@Pc(93) int local93 = (local45[local57 - 1 & Static332.anInt5256] - local45[local57 + 1 & Static332.anInt5256]) * local29 >> 12;
				@Pc(97) int local97 = local93 >> 4;
				if (local97 < 0) {
					local97 = -local97;
				}
				@Pc(106) int local106 = local72 >> 4;
				if (local97 > 255) {
					local97 = 255;
				}
				if (local106 < 0) {
					local106 = -local106;
				}
				if (local106 > 255) {
					local106 = 255;
				}
				@Pc(140) int local140 = Class13_Sub8.aByteArray72[(local106 * (local106 + 1) >> 1) + local97] & 0xFF;
				@Pc(146) int local146 = local93 * local140 >> 8;
				@Pc(152) int local152 = local140 * 4096 >> 8;
				@Pc(158) int local158 = local140 * local72 >> 8;
				@Pc(167) int local167 = local146 * this.anIntArray690[0] >> 12;
				@Pc(176) int local176 = this.anIntArray690[2] * local152 >> 12;
				@Pc(185) int local185 = this.anIntArray690[1] * local158 >> 12;
				local11[local57] = local167 + local185 + local176;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt10176 = arg1.method8546();
		} else if (arg0 == 1) {
			this.anInt10181 = arg1.method8546();
		} else if (arg0 == 2) {
			this.anInt10174 = arg1.method8546();
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
		this.method8477();
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(Z)V")
	private void method8477() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt10174 / 4096.0F));
		this.anIntArray690[0] = (int) (Math.sin((double) ((float) this.anInt10181 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray690[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt10181 / 4096.0F)));
		this.anIntArray690[2] = (int) (Math.sin((double) ((float) this.anInt10174 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray690[0] * this.anIntArray690[0] >> 12;
		@Pc(85) int local85 = this.anIntArray690[1] * this.anIntArray690[1] >> 12;
		@Pc(97) int local97 = this.anIntArray690[2] * this.anIntArray690[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local85 + local69 + local97 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray690[2] = (this.anIntArray690[2] << 12) / local111;
			this.anIntArray690[0] = (this.anIntArray690[0] << 12) / local111;
			this.anIntArray690[1] = (this.anIntArray690[1] << 12) / local111;
		}
	}
}
