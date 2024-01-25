import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public final class Class2_Sub6_Sub13 extends Class2_Sub6 {

	@OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
	private int anInt3321 = 1;

	@OriginalMember(owner = "client!gt", name = "H", descriptor = "[B")
	private byte[] aByteArray42 = new byte[512];

	@OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
	private int anInt3325 = 5;

	@OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
	private int anInt3324 = 0;

	@OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
	private int anInt3323 = 2;

	@OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
	private int anInt3327 = 2048;

	@OriginalMember(owner = "client!gt", name = "U", descriptor = "I")
	private int anInt3330 = 5;

	@OriginalMember(owner = "client!gt", name = "S", descriptor = "[S")
	private short[] aShortArray42 = new short[512];

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
		this.aByteArray42 = Static198.method6948(this.anInt3324);
		this.method2799();
	}

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "(I)V")
	private void method2799() {
		@Pc(12) Random local12 = new Random((long) this.anInt3324);
		this.aShortArray42 = new short[512];
		if (this.anInt3327 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray42[local24] = (short) Static239.method3351(this.anInt3327, local12);
			}
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt3325 = this.anInt3330 = arg1.method8547();
		} else if (arg0 == 1) {
			this.anInt3324 = arg1.method8547();
		} else if (arg0 == 2) {
			this.anInt3327 = arg1.method8546();
		} else if (arg0 == 3) {
			this.anInt3323 = arg1.method8547();
		} else if (arg0 == 4) {
			this.anInt3321 = arg1.method8547();
		} else if (arg0 == 5) {
			this.anInt3325 = arg1.method8547();
		} else if (arg0 == 6) {
			this.anInt3330 = arg1.method8547();
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(30) int local30 = Static564.anIntArray630[arg0] * this.anInt3330 + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static51.anInt1085; local40++) {
				Static639.anInt10303 = Integer.MAX_VALUE;
				Static160.anInt2878 = Integer.MAX_VALUE;
				Static528.anInt8673 = Integer.MAX_VALUE;
				Static415.anInt6471 = Integer.MAX_VALUE;
				@Pc(60) int local60 = Static586.anIntArray653[local40] * this.anInt3325 + 2048;
				@Pc(64) int local64 = local60 >> 12;
				@Pc(68) int local68 = local64 + 1;
				@Pc(152) int local152;
				for (@Pc(72) int local72 = local34 - 1; local72 <= local38; local72++) {
					@Pc(93) int local93 = this.aByteArray42[(this.anInt3330 > local72 ? local72 : local72 - this.anInt3330) & 0xFF] & 0xFF;
					for (@Pc(97) int local97 = local64 - 1; local97 <= local68; local97++) {
						@Pc(122) int local122 = (this.aByteArray42[(this.anInt3325 <= local97 ? local97 - this.anInt3325 : local97) + local93 & 0xFF] & 0xFF) * 2;
						@Pc(127) int local127 = local122 + 1;
						@Pc(136) int local136 = local60 - this.aShortArray42[local122] - (local97 << 12);
						@Pc(149) int local149 = local30 - this.aShortArray42[local127] - (local72 << 12);
						local152 = this.anInt3321;
						@Pc(185) int local185;
						if (local152 == 1) {
							local185 = local149 * local149 + local136 * local136 >> 12;
						} else if (local152 == 3) {
							local136 = local136 >= 0 ? local136 : -local136;
							local149 = local149 >= 0 ? local149 : -local149;
							local185 = local149 >= local136 ? local149 : local136;
						} else if (local152 == 4) {
							local136 = (int) (Math.sqrt((double) ((float) (local136 >= 0 ? local136 : -local136) / 4096.0F)) * 4096.0D);
							local149 = (int) (Math.sqrt((double) ((float) (local149 < 0 ? -local149 : local149) / 4096.0F)) * 4096.0D);
							local185 = local149 + local136;
							local185 = local185 * local185 >> 12;
						} else if (local152 == 5) {
							local136 *= local136;
							local149 *= local149;
							local185 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local149 + local136) / 1.6777216E7F))) * 4096.0D);
						} else if (local152 == 2) {
							local185 = (local149 < 0 ? -local149 : local149) + (local136 < 0 ? -local136 : local136);
						} else {
							local185 = (int) (Math.sqrt((double) ((float) (local136 * local136 + local149 * local149) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static415.anInt6471 > local185) {
							Static639.anInt10303 = Static160.anInt2878;
							Static160.anInt2878 = Static528.anInt8673;
							Static528.anInt8673 = Static415.anInt6471;
							Static415.anInt6471 = local185;
						} else if (local185 < Static528.anInt8673) {
							Static639.anInt10303 = Static160.anInt2878;
							Static160.anInt2878 = Static528.anInt8673;
							Static528.anInt8673 = local185;
						} else if (Static160.anInt2878 > local185) {
							Static639.anInt10303 = Static160.anInt2878;
							Static160.anInt2878 = local185;
						} else if (Static639.anInt10303 > local185) {
							Static639.anInt10303 = local185;
						}
					}
				}
				local152 = this.anInt3323;
				if (local152 == 0) {
					local11[local40] = Static415.anInt6471;
				} else if (local152 == 1) {
					local11[local40] = Static528.anInt8673;
				} else if (local152 == 3) {
					local11[local40] = Static160.anInt2878;
				} else if (local152 == 4) {
					local11[local40] = Static639.anInt10303;
				} else if (local152 == 2) {
					local11[local40] = Static528.anInt8673 - Static415.anInt6471;
				}
			}
		}
		return local11;
	}
}
