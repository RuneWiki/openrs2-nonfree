import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class2_Sub4_Sub11 extends Class2_Sub4 {

	@OriginalMember(owner = "client!hu", name = "E", descriptor = "[I")
	private final int[] anIntArray259 = new int[3];

	@OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
	private int anInt3089 = 4096;

	@OriginalMember(owner = "client!hu", name = "C", descriptor = "I")
	private int anInt3087 = 3216;

	@OriginalMember(owner = "client!hu", name = "N", descriptor = "I")
	private int anInt3093 = 3216;

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub11() {
		super(1, true);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!gk;B)V")
	@Override
	public void method7566(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt3089 = arg1.method4518();
		} else if (arg0 == 1) {
			this.anInt3093 = arg1.method4518();
		} else if (arg0 == 2) {
			this.anInt3087 = arg1.method4518();
		}
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method5621(arg0);
		if (super.aClass271_41.aBoolean543) {
			@Pc(27) int local27 = Static197.anInt2872 * this.anInt3089 >> 12;
			@Pc(37) int[] local37 = this.method7568(arg0 - 1 & Static407.anInt6676, 0);
			@Pc(43) int[] local43 = this.method7568(arg0, 0);
			@Pc(53) int[] local53 = this.method7568(Static407.anInt6676 & arg0 + 1, 0);
			for (@Pc(55) int local55 = 0; local55 < Static143.anInt7434; local55++) {
				@Pc(70) int local70 = local27 * (local53[local55] - local37[local55]) >> 12;
				@Pc(91) int local91 = local27 * (local43[local55 - 1 & Static464.anInt7427] - local43[local55 + 1 & Static464.anInt7427]) >> 12;
				@Pc(95) int local95 = local91 >> 4;
				@Pc(99) int local99 = local70 >> 4;
				if (local95 < 0) {
					local95 = -local95;
				}
				if (local95 > 255) {
					local95 = 255;
				}
				if (local99 < 0) {
					local99 = -local99;
				}
				if (local99 > 255) {
					local99 = 255;
				}
				@Pc(138) int local138 = Class72.aByteArray30[((local99 + 1) * local99 >> 1) + local95] & 0xFF;
				@Pc(144) int local144 = local138 * local91 >> 8;
				@Pc(150) int local150 = local70 * local138 >> 8;
				@Pc(156) int local156 = local138 * 4096 >> 8;
				@Pc(165) int local165 = this.anIntArray259[0] * local144 >> 12;
				@Pc(174) int local174 = this.anIntArray259[2] * local156 >> 12;
				@Pc(183) int local183 = this.anIntArray259[1] * local150 >> 12;
				local11[local55] = local174 + local183 + local165;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)V")
	@Override
	public void method7562() {
		this.method2612();
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(B)V")
	private void method2612() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt3087 / 4096.0F));
		this.anIntArray259[0] = (int) (local11 * 4096.0D * Math.sin((double) ((float) this.anInt3093 / 4096.0F)));
		this.anIntArray259[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt3093 / 4096.0F)));
		this.anIntArray259[2] = (int) (Math.sin((double) ((float) this.anInt3087 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray259[0] * this.anIntArray259[0] >> 12;
		@Pc(85) int local85 = this.anIntArray259[1] * this.anIntArray259[1] >> 12;
		@Pc(97) int local97 = this.anIntArray259[2] * this.anIntArray259[2] >> 12;
		@Pc(110) int local110 = (int) (Math.sqrt((double) (local69 + local85 + local97 >> 12)) * 4096.0D);
		if (local110 != 0) {
			this.anIntArray259[2] = (this.anIntArray259[2] << 12) / local110;
			this.anIntArray259[0] = (this.anIntArray259[0] << 12) / local110;
			this.anIntArray259[1] = (this.anIntArray259[1] << 12) / local110;
		}
	}
}
