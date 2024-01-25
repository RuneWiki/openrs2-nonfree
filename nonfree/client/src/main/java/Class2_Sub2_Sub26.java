import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class2_Sub2_Sub26 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "[S")
	private short[] aShortArray100 = new short[512];

	@OriginalMember(owner = "client!pc", name = "M", descriptor = "[B")
	private byte[] aByteArray70 = new byte[512];

	@OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
	private int anInt6946 = 0;

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
	private int anInt6951 = 2;

	@OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
	private int anInt6952 = 2048;

	@OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
	private int anInt6949 = 5;

	@OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
	private int anInt6948 = 1;

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
	private int anInt6954 = 5;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V")
	private void method5821() {
		@Pc(12) Random local12 = new Random((long) this.anInt6946);
		this.aShortArray100 = new short[512];
		if (this.anInt6952 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray100[local24] = (short) Static233.method3629(local12, this.anInt6952);
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
		this.aByteArray70 = Static298.method4514(this.anInt6946);
		this.method5821();
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(24) int local24 = Static211.anIntArray576[arg0] * this.anInt6949 + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static153.anInt3070; local34++) {
				Static297.anInt5344 = Integer.MAX_VALUE;
				Static148.anInt3059 = Integer.MAX_VALUE;
				Static217.anInt4150 = Integer.MAX_VALUE;
				Static79.anInt1725 = Integer.MAX_VALUE;
				@Pc(53) int local53 = Static260.anIntArray327[local34] * this.anInt6954 + 2048;
				@Pc(57) int local57 = local53 >> 12;
				@Pc(61) int local61 = local57 + 1;
				@Pc(150) int local150;
				for (@Pc(65) int local65 = local28 - 1; local65 <= local32; local65++) {
					@Pc(90) int local90 = this.aByteArray70[(local65 < this.anInt6949 ? local65 : local65 - this.anInt6949) & 0xFF] & 0xFF;
					for (@Pc(94) int local94 = local57 - 1; local94 <= local61; local94++) {
						@Pc(124) int local124 = (this.aByteArray70[local90 + (local94 >= this.anInt6954 ? local94 - this.anInt6954 : local94) & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local53 - (local94 << 12);
						@Pc(133) int local133 = local124 + 1;
						@Pc(136) int local136 = local129 - this.aShortArray100[local124];
						@Pc(147) int local147 = local24 - this.aShortArray100[local133] - (local65 << 12);
						local150 = this.anInt6948;
						@Pc(182) int local182;
						if (local150 == 1) {
							local182 = local136 * local136 + local147 * local147 >> 12;
						} else if (local150 == 3) {
							local147 = local147 >= 0 ? local147 : -local147;
							local136 = local136 >= 0 ? local136 : -local136;
							local182 = local147 >= local136 ? local147 : local136;
						} else if (local150 == 4) {
							local136 = (int) (Math.sqrt((double) ((float) (local136 >= 0 ? local136 : -local136) / 4096.0F)) * 4096.0D);
							local147 = (int) (Math.sqrt((double) ((float) (local147 < 0 ? -local147 : local147) / 4096.0F)) * 4096.0D);
							local182 = local136 + local147;
							local182 = local182 * local182 >> 12;
						} else if (local150 == 5) {
							local147 *= local147;
							local136 *= local136;
							local182 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local147 + local136) / 1.6777216E7F))) * 4096.0D);
						} else if (local150 == 2) {
							local182 = (local136 < 0 ? -local136 : local136) + (local147 >= 0 ? local147 : -local147);
						} else {
							local182 = (int) (Math.sqrt((double) ((float) (local136 * local136 + local147 * local147) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static79.anInt1725 > local182) {
							Static297.anInt5344 = Static148.anInt3059;
							Static148.anInt3059 = Static217.anInt4150;
							Static217.anInt4150 = Static79.anInt1725;
							Static79.anInt1725 = local182;
						} else if (local182 < Static217.anInt4150) {
							Static297.anInt5344 = Static148.anInt3059;
							Static148.anInt3059 = Static217.anInt4150;
							Static217.anInt4150 = local182;
						} else if (local182 < Static148.anInt3059) {
							Static297.anInt5344 = Static148.anInt3059;
							Static148.anInt3059 = local182;
						} else if (local182 < Static297.anInt5344) {
							Static297.anInt5344 = local182;
						}
					}
				}
				local150 = this.anInt6951;
				if (local150 == 0) {
					local11[local34] = Static79.anInt1725;
				} else if (local150 == 1) {
					local11[local34] = Static217.anInt4150;
				} else if (local150 == 3) {
					local11[local34] = Static148.anInt3059;
				} else if (local150 == 4) {
					local11[local34] = Static297.anInt5344;
				} else if (local150 == 2) {
					local11[local34] = Static217.anInt4150 - Static79.anInt1725;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6954 = this.anInt6949 = arg0.method4325();
		} else if (arg1 == 1) {
			this.anInt6946 = arg0.method4325();
		} else if (arg1 == 2) {
			this.anInt6952 = arg0.method4294();
		} else if (arg1 == 3) {
			this.anInt6951 = arg0.method4325();
		} else if (arg1 == 4) {
			this.anInt6948 = arg0.method4325();
		} else if (arg1 == 5) {
			this.anInt6954 = arg0.method4325();
		} else if (arg1 == 6) {
			this.anInt6949 = arg0.method4325();
		}
	}
}
