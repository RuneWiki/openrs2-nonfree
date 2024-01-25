import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class2_Sub3_Sub25 extends Class2_Sub3 {

	@OriginalMember(owner = "client!om", name = "G", descriptor = "I")
	private int anInt5063 = 2;

	@OriginalMember(owner = "client!om", name = "N", descriptor = "I")
	private int anInt5070 = 0;

	@OriginalMember(owner = "client!om", name = "O", descriptor = "I")
	private int anInt5071 = 2048;

	@OriginalMember(owner = "client!om", name = "T", descriptor = "[B")
	private byte[] aByteArray70 = new byte[512];

	@OriginalMember(owner = "client!om", name = "V", descriptor = "I")
	private int anInt5076 = 5;

	@OriginalMember(owner = "client!om", name = "S", descriptor = "[S")
	private short[] aShortArray93 = new short[512];

	@OriginalMember(owner = "client!om", name = "W", descriptor = "I")
	private int anInt5077 = 5;

	@OriginalMember(owner = "client!om", name = "Z", descriptor = "I")
	private int anInt5079 = 1;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!om", name = "e", descriptor = "(I)V")
	@Override
	public void method5708() {
		this.aByteArray70 = Static6.method86(this.anInt5070);
		this.method4316();
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(31) int local31 = Static76.anIntArray121[arg0] * this.anInt5076 + 2048;
			@Pc(35) int local35 = local31 >> 12;
			@Pc(39) int local39 = local35 + 1;
			for (@Pc(41) int local41 = 0; local41 < Static263.anInt5504; local41++) {
				Static147.anInt3180 = Integer.MAX_VALUE;
				Static197.anInt4302 = Integer.MAX_VALUE;
				Static225.anInt4917 = Integer.MAX_VALUE;
				Static25.anInt399 = Integer.MAX_VALUE;
				@Pc(61) int local61 = this.anInt5077 * Static269.anIntArray507[local41] + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(151) int local151;
				for (@Pc(73) int local73 = local35 - 1; local73 <= local39; local73++) {
					@Pc(94) int local94 = this.aByteArray70[(local73 >= this.anInt5076 ? local73 - this.anInt5076 : local73) & 0xFF] & 0xFF;
					for (@Pc(98) int local98 = local65 - 1; local98 <= local69; local98++) {
						@Pc(123) int local123 = (this.aByteArray70[local94 + (local98 < this.anInt5077 ? local98 : local98 - this.anInt5077) & 0xFF] & 0xFF) * 2;
						@Pc(127) int local127 = -(local98 << 12);
						@Pc(131) int local131 = local123 + 1;
						@Pc(136) int local136 = local127 + local61 - this.aShortArray93[local123];
						@Pc(148) int local148 = local31 - (local73 << 12) - this.aShortArray93[local131];
						local151 = this.anInt5079;
						@Pc(181) int local181;
						if (local151 == 1) {
							local181 = local136 * local136 + local148 * local148 >> 12;
						} else if (local151 == 3) {
							local136 = local136 >= 0 ? local136 : -local136;
							local148 = local148 < 0 ? -local148 : local148;
							local181 = local148 >= local136 ? local148 : local136;
						} else if (local151 == 4) {
							local136 = (int) (Math.sqrt((double) ((float) (local136 >= 0 ? local136 : -local136) / 4096.0F)) * 4096.0D);
							local148 = (int) (Math.sqrt((double) ((float) (local148 < 0 ? -local148 : local148) / 4096.0F)) * 4096.0D);
							local181 = local136 + local148;
							local181 = local181 * local181 >> 12;
						} else if (local151 == 5) {
							local148 *= local148;
							local136 *= local136;
							local181 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local136 + local148) / 1.6777216E7F))) * 4096.0D);
						} else if (local151 == 2) {
							local181 = (local136 >= 0 ? local136 : -local136) + (local148 < 0 ? -local148 : local148);
						} else {
							local181 = (int) (Math.sqrt((double) ((float) (local148 * local148 + local136 * local136) / 1.6777216E7F)) * 4096.0D);
						}
						if (local181 < Static25.anInt399) {
							Static147.anInt3180 = Static197.anInt4302;
							Static197.anInt4302 = Static225.anInt4917;
							Static225.anInt4917 = Static25.anInt399;
							Static25.anInt399 = local181;
						} else if (local181 < Static225.anInt4917) {
							Static147.anInt3180 = Static197.anInt4302;
							Static197.anInt4302 = Static225.anInt4917;
							Static225.anInt4917 = local181;
						} else if (local181 < Static197.anInt4302) {
							Static147.anInt3180 = Static197.anInt4302;
							Static197.anInt4302 = local181;
						} else if (Static147.anInt3180 > local181) {
							Static147.anInt3180 = local181;
						}
					}
				}
				local151 = this.anInt5063;
				if (local151 == 0) {
					local11[local41] = Static25.anInt399;
				} else if (local151 == 1) {
					local11[local41] = Static225.anInt4917;
				} else if (local151 == 3) {
					local11[local41] = Static197.anInt4302;
				} else if (local151 == 4) {
					local11[local41] = Static147.anInt3180;
				} else if (local151 == 2) {
					local11[local41] = Static225.anInt4917 - Static25.anInt399;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!om", name = "h", descriptor = "(I)V")
	private void method4316() {
		@Pc(19) Random local19 = new Random((long) this.anInt5070);
		this.aShortArray93 = new short[512];
		if (this.anInt5071 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray93[local28] = (short) Static172.method3391(this.anInt5071, local19);
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt5077 = this.anInt5076 = arg1.method3124();
		} else if (arg0 == 1) {
			this.anInt5070 = arg1.method3124();
		} else if (arg0 == 2) {
			this.anInt5071 = arg1.method3104();
		} else if (arg0 == 3) {
			this.anInt5063 = arg1.method3124();
		} else if (arg0 == 4) {
			this.anInt5079 = arg1.method3124();
		} else if (arg0 == 5) {
			this.anInt5077 = arg1.method3124();
		} else if (arg0 == 6) {
			this.anInt5076 = arg1.method3124();
		}
	}
}
