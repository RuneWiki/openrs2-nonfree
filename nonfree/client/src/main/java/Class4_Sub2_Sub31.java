import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class4_Sub2_Sub31 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ua", name = "G", descriptor = "I")
	private int anInt9137 = 5;

	@OriginalMember(owner = "client!ua", name = "E", descriptor = "[S")
	private short[] aShortArray147 = new short[512];

	@OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
	private int anInt9139 = 0;

	@OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
	private int anInt9138 = 2;

	@OriginalMember(owner = "client!ua", name = "I", descriptor = "[B")
	private byte[] aByteArray95 = new byte[512];

	@OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
	private int anInt9141 = 2048;

	@OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
	private int anInt9143 = 5;

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
	private int anInt9140 = 1;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	@Override
	public void method8769() {
		this.aByteArray95 = Static366.method4836(this.anInt9139);
		this.method7816();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BILclient!es;)V")
	@Override
	public void method8767(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt9143 = this.anInt9137 = arg1.method8865();
		} else if (arg0 == 1) {
			this.anInt9139 = arg1.method8865();
		} else if (arg0 == 2) {
			this.anInt9141 = arg1.method8859();
		} else if (arg0 == 3) {
			this.anInt9138 = arg1.method8865();
		} else if (arg0 == 4) {
			this.anInt9140 = arg1.method8865();
		} else if (arg0 == 5) {
			this.anInt9143 = arg1.method8865();
		} else if (arg0 == 6) {
			this.anInt9137 = arg1.method8865();
		}
	}

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
	private void method7816() {
		@Pc(20) Random local20 = new Random((long) this.anInt9139);
		this.aShortArray147 = new short[512];
		if (this.anInt9141 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray147[local29] = (short) Static149.method2598(local20, this.anInt9141);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8765(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass271_41.method6067(arg0);
		if (super.aClass271_41.aBoolean534) {
			@Pc(25) int local25 = this.anInt9137 * Static429.anIntArray465[arg0] + 2048;
			@Pc(29) int local29 = local25 >> 12;
			@Pc(33) int local33 = local29 + 1;
			for (@Pc(35) int local35 = 0; local35 < Static269.anInt4330; local35++) {
				Static424.anInt6717 = Integer.MAX_VALUE;
				Static326.anInt5099 = Integer.MAX_VALUE;
				Static576.anInt8914 = Integer.MAX_VALUE;
				Static162.anInt2724 = Integer.MAX_VALUE;
				@Pc(54) int local54 = this.anInt9143 * Static312.anIntArray370[local35] + 2048;
				@Pc(58) int local58 = local54 >> 12;
				@Pc(62) int local62 = local58 + 1;
				@Pc(146) int local146;
				for (@Pc(66) int local66 = local29 - 1; local66 <= local33; local66++) {
					@Pc(90) int local90 = this.aByteArray95[(this.anInt9137 <= local66 ? local66 - this.anInt9137 : local66) & 0xFF] & 0xFF;
					for (@Pc(94) int local94 = local58 - 1; local94 <= local62; local94++) {
						@Pc(119) int local119 = (this.aByteArray95[(local94 < this.anInt9143 ? local94 : local94 - this.anInt9143) + local90 & 0xFF] & 0xFF) * 2;
						@Pc(124) int local124 = local119 + 1;
						@Pc(132) int local132 = local54 - this.aShortArray147[local119] - (local94 << 12);
						@Pc(143) int local143 = local25 - this.aShortArray147[local124] - (local66 << 12);
						local146 = this.anInt9140;
						@Pc(176) int local176;
						if (local146 == 1) {
							local176 = local132 * local132 + local143 * local143 >> 12;
						} else if (local146 == 3) {
							local132 = local132 < 0 ? -local132 : local132;
							local143 = local143 < 0 ? -local143 : local143;
							local176 = local143 < local132 ? local132 : local143;
						} else if (local146 == 4) {
							local132 = (int) (Math.sqrt((double) ((float) (local132 >= 0 ? local132 : -local132) / 4096.0F)) * 4096.0D);
							local143 = (int) (Math.sqrt((double) ((float) (local143 < 0 ? -local143 : local143) / 4096.0F)) * 4096.0D);
							local176 = local143 + local132;
							local176 = local176 * local176 >> 12;
						} else if (local146 == 5) {
							local132 *= local132;
							local143 *= local143;
							local176 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local143 + local132) / 1.6777216E7F))) * 4096.0D);
						} else if (local146 == 2) {
							local176 = (local132 >= 0 ? local132 : -local132) + (local143 >= 0 ? local143 : -local143);
						} else {
							local176 = (int) (Math.sqrt((double) ((float) (local132 * local132 + local143 * local143) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static162.anInt2724 > local176) {
							Static424.anInt6717 = Static326.anInt5099;
							Static326.anInt5099 = Static576.anInt8914;
							Static576.anInt8914 = Static162.anInt2724;
							Static162.anInt2724 = local176;
						} else if (Static576.anInt8914 > local176) {
							Static424.anInt6717 = Static326.anInt5099;
							Static326.anInt5099 = Static576.anInt8914;
							Static576.anInt8914 = local176;
						} else if (Static326.anInt5099 > local176) {
							Static424.anInt6717 = Static326.anInt5099;
							Static326.anInt5099 = local176;
						} else if (local176 < Static424.anInt6717) {
							Static424.anInt6717 = local176;
						}
					}
				}
				local146 = this.anInt9138;
				if (local146 == 0) {
					local11[local35] = Static162.anInt2724;
				} else if (local146 == 1) {
					local11[local35] = Static576.anInt8914;
				} else if (local146 == 3) {
					local11[local35] = Static326.anInt5099;
				} else if (local146 == 4) {
					local11[local35] = Static424.anInt6717;
				} else if (local146 == 2) {
					local11[local35] = Static576.anInt8914 - Static162.anInt2724;
				}
			}
		}
		return local11;
	}
}
