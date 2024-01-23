import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class4_Sub1_Sub35 extends Class4_Sub1 {

	@OriginalMember(owner = "client!sk", name = "I", descriptor = "[I")
	private int[] anIntArray390 = new int[3];

	@OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
	private int anInt4970 = 3216;

	@OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
	private int anInt4977 = 4096;

	@OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
	private int anInt4971 = 3216;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub35() {
		super(1, true);
	}

	@OriginalMember(owner = "client!sk", name = "g", descriptor = "(I)V")
	private void method3927() {
		@Pc(7) double local7 = Math.cos((double) ((float) this.anInt4971 / 4096.0F));
		this.anIntArray390[0] = (int) (Math.sin((double) ((float) this.anInt4970 / 4096.0F)) * local7 * 4096.0D);
		this.anIntArray390[1] = (int) (local7 * 4096.0D * Math.cos((double) ((float) this.anInt4970 / 4096.0F)));
		this.anIntArray390[2] = (int) (Math.sin((double) ((float) this.anInt4971 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray390[1] * this.anIntArray390[1] >> 12;
		@Pc(81) int local81 = this.anIntArray390[0] * this.anIntArray390[0] >> 12;
		@Pc(93) int local93 = this.anIntArray390[2] * this.anIntArray390[2] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local69 + local81 + local93 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray390[0] = (this.anIntArray390[0] << 12) / local106;
			this.anIntArray390[2] = (this.anIntArray390[2] << 12) / local106;
			this.anIntArray390[1] = (this.anIntArray390[1] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass43_41.method1180(arg0);
		if (this.aClass43_41.aBoolean82) {
			@Pc(29) int local29 = Static21.anInt451 * this.anInt4977 >> 12;
			@Pc(39) int[] local39 = this.method4538(0, arg0 - 1 & Static19.anInt437);
			@Pc(45) int[] local45 = this.method4538(0, arg0);
			@Pc(55) int[] local55 = this.method4538(0, arg0 + 1 & Static19.anInt437);
			for (@Pc(57) int local57 = 0; local57 < Static68.anInt1753; local57++) {
				@Pc(80) int local80 = (local45[local57 - 1 & Static295.anInt5711] - local45[local57 + 1 & Static295.anInt5711]) * local29 >> 12;
				@Pc(93) int local93 = (local55[local57] - local39[local57]) * local29 >> 12;
				@Pc(97) int local97 = local80 >> 4;
				if (local97 < 0) {
					local97 = -local97;
				}
				if (local97 > 255) {
					local97 = 255;
				}
				@Pc(112) int local112 = local93 >> 4;
				if (local112 < 0) {
					local112 = -local112;
				}
				if (local112 > 255) {
					local112 = 255;
				}
				@Pc(139) int local139 = OutputStream_Sub1.aByteArray25[local97 + (local112 * (local112 + 1) >> 1)] & 0xFF;
				@Pc(145) int local145 = local139 * 4096 >> 8;
				@Pc(154) int local154 = local145 * this.anIntArray390[2] >> 12;
				@Pc(160) int local160 = local93 * local139 >> 8;
				@Pc(166) int local166 = local80 * local139 >> 8;
				@Pc(175) int local175 = this.anIntArray390[1] * local160 >> 12;
				@Pc(184) int local184 = this.anIntArray390[0] * local166 >> 12;
				local17[local57] = local184 + local175 + local154;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
	@Override
	public void method4537() {
		this.method3927();
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt4977 = arg1.method3085();
		} else if (arg0 == 1) {
			this.anInt4970 = arg1.method3085();
		} else if (arg0 == 2) {
			this.anInt4971 = arg1.method3085();
		}
	}
}
