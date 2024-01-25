import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class6_Sub1_Sub37 extends Class6_Sub1 {

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
	private int anInt9980 = 3216;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "[I")
	private final int[] anIntArray539 = new int[3];

	@OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
	private int anInt9986 = 4096;

	@OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
	private int anInt9985 = 3216;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)V")
	private void method8139() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt9985 / 4096.0F));
		this.anIntArray539[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt9980 / 4096.0F)));
		this.anIntArray539[1] = (int) (Math.cos((double) ((float) this.anInt9980 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray539[2] = (int) (Math.sin((double) ((float) this.anInt9985 / 4096.0F)) * 4096.0D);
		@Pc(73) int local73 = this.anIntArray539[0] * this.anIntArray539[0] >> 12;
		@Pc(85) int local85 = this.anIntArray539[1] * this.anIntArray539[1] >> 12;
		@Pc(97) int local97 = this.anIntArray539[2] * this.anIntArray539[2] >> 12;
		@Pc(111) int local111 = (int) (Math.sqrt((double) (local73 + local85 + local97 >> 12)) * 4096.0D);
		if (local111 != 0) {
			this.anIntArray539[1] = (this.anIntArray539[1] << 12) / local111;
			this.anIntArray539[2] = (this.anIntArray539[2] << 12) / local111;
			this.anIntArray539[0] = (this.anIntArray539[0] << 12) / local111;
		}
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
		this.method8139();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(27) int local27 = this.anInt9986 * Static339.anInt6745 >> 12;
			@Pc(37) int[] local37 = this.method8731(arg0 - 1 & Static117.anInt3013, 0);
			@Pc(43) int[] local43 = this.method8731(arg0, 0);
			@Pc(55) int[] local55 = this.method8731(Static117.anInt3013 & arg0 + 1, 0);
			for (@Pc(57) int local57 = 0; local57 < Static53.anInt1787; local57++) {
				@Pc(71) int local71 = local27 * (local55[local57] - local37[local57]) >> 12;
				@Pc(91) int local91 = local27 * (local43[local57 - 1 & Static564.anInt9697] - local43[Static564.anInt9697 & local57 + 1]) >> 12;
				@Pc(95) int local95 = local91 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				@Pc(104) int local104 = local71 >> 4;
				if (local104 < 0) {
					local104 = -local104;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				if (local104 > 255) {
					local104 = 255;
				}
				@Pc(140) int local140 = Class209.aByteArray58[(local104 * (local104 + 1) >> 1) + local95] & 0xFF;
				@Pc(146) int local146 = local140 * local71 >> 8;
				@Pc(152) int local152 = local140 * local91 >> 8;
				@Pc(158) int local158 = local140 * 4096 >> 8;
				@Pc(167) int local167 = local146 * this.anIntArray539[1] >> 12;
				@Pc(176) int local176 = this.anIntArray539[2] * local158 >> 12;
				@Pc(185) int local185 = local152 * this.anIntArray539[0] >> 12;
				local11[local57] = local185 + local167 + local176;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt9986 = arg1.method8220();
		} else if (arg0 == 1) {
			this.anInt9980 = arg1.method8220();
		} else if (arg0 == 2) {
			this.anInt9985 = arg1.method8220();
		}
	}
}
