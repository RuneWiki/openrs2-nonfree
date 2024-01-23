import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class1_Sub3_Sub14 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fh", name = "Y", descriptor = "I")
	private int anInt1257 = 3216;

	@OriginalMember(owner = "client!fh", name = "ab", descriptor = "I")
	private int anInt1259 = 3216;

	@OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
	private int anInt1252 = 4096;

	@OriginalMember(owner = "client!fh", name = "nb", descriptor = "[I")
	private int[] anIntArray103 = new int[3];

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub14() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(29) int local29 = Static72.anInt1346 * this.anInt1252 >> 12;
			@Pc(39) int[] local39 = this.method3468(arg0 - 1 & Static171.anInt3496, 0);
			@Pc(45) int[] local45 = this.method3468(arg0, 0);
			@Pc(55) int[] local55 = this.method3468(arg0 + 1 & Static171.anInt3496, 0);
			for (@Pc(57) int local57 = 0; local57 < Static76.anInt1531; local57++) {
				@Pc(80) int local80 = local29 * (local45[local57 - 1 & Static121.anInt2385] - local45[Static121.anInt2385 & local57 + 1]) >> 12;
				@Pc(93) int local93 = local29 * (local55[local57] - local39[local57]) >> 12;
				@Pc(97) int local97 = local80 >> 4;
				if (local97 < 0) {
					local97 = -local97;
				}
				if (local97 > 255) {
					local97 = 255;
				}
				@Pc(111) int local111 = local93 >> 4;
				if (local111 < 0) {
					local111 = -local111;
				}
				if (local111 > 255) {
					local111 = 255;
				}
				@Pc(138) int local138 = Class1_Sub3_Sub32.aByteArray48[local97 + ((local111 + 1) * local111 >> 1)] & 0xFF;
				@Pc(144) int local144 = local93 * local138 >> 8;
				@Pc(153) int local153 = local144 * this.anIntArray103[1] >> 12;
				@Pc(159) int local159 = local80 * local138 >> 8;
				@Pc(165) int local165 = local138 * 4096 >> 8;
				@Pc(174) int local174 = this.anIntArray103[2] * local165 >> 12;
				@Pc(183) int local183 = local159 * this.anIntArray103[0] >> 12;
				local9[local57] = local183 + local153 + local174;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)V")
	private void method968() {
		@Pc(11) double local11 = Math.cos((double) ((float) this.anInt1259 / 4096.0F));
		this.anIntArray103[0] = (int) (Math.sin((double) ((float) this.anInt1257 / 4096.0F)) * local11 * 4096.0D);
		this.anIntArray103[1] = (int) (local11 * 4096.0D * Math.cos((double) ((float) this.anInt1257 / 4096.0F)));
		this.anIntArray103[2] = (int) (Math.sin((double) ((float) this.anInt1259 / 4096.0F)) * 4096.0D);
		@Pc(69) int local69 = this.anIntArray103[0] * this.anIntArray103[0] >> 12;
		@Pc(81) int local81 = this.anIntArray103[2] * this.anIntArray103[2] >> 12;
		@Pc(93) int local93 = this.anIntArray103[1] * this.anIntArray103[1] >> 12;
		@Pc(106) int local106 = (int) (Math.sqrt((double) (local69 + local93 + local81 >> 12)) * 4096.0D);
		if (local106 != 0) {
			this.anIntArray103[2] = (this.anIntArray103[2] << 12) / local106;
			this.anIntArray103[1] = (this.anIntArray103[1] << 12) / local106;
			this.anIntArray103[0] = (this.anIntArray103[0] << 12) / local106;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt1252 = arg1.method2178();
		} else if (arg0 == 1) {
			this.anInt1257 = arg1.method2178();
		} else if (arg0 == 2) {
			this.anInt1259 = arg1.method2178();
		}
	}

	@OriginalMember(owner = "client!fh", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
		this.method968();
	}
}
