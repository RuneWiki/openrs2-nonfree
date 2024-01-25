import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class11_Sub2_Sub5 extends Class11_Sub2 {

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
	private int anInt1028 = 5;

	@OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
	private int anInt1027 = 1;

	@OriginalMember(owner = "client!dg", name = "P", descriptor = "[S")
	private short[] aShortArray39 = new short[512];

	@OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
	private int anInt1032 = 2;

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
	private int anInt1020 = 0;

	@OriginalMember(owner = "client!dg", name = "I", descriptor = "[B")
	private byte[] aByteArray22 = new byte[512];

	@OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
	private int anInt1036 = 5;

	@OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
	private int anInt1035 = 2048;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(24) int local24 = Static155.anIntArray196[arg0] * this.anInt1028 + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static339.anInt6549; local34++) {
				Static53.anInt998 = Integer.MAX_VALUE;
				Static81.anInt1499 = Integer.MAX_VALUE;
				Static27.anInt491 = Integer.MAX_VALUE;
				Static173.anInt3435 = Integer.MAX_VALUE;
				@Pc(54) int local54 = this.anInt1036 * Static73.anIntArray91[local34] + 2048;
				@Pc(58) int local58 = local54 >> 12;
				@Pc(62) int local62 = local58 + 1;
				@Pc(147) int local147;
				for (@Pc(66) int local66 = local28 - 1; local66 <= local32; local66++) {
					@Pc(87) int local87 = this.aByteArray22[(this.anInt1028 <= local66 ? local66 - this.anInt1028 : local66) & 0xFF] & 0xFF;
					for (@Pc(91) int local91 = local58 - 1; local91 <= local62; local91++) {
						@Pc(119) int local119 = (this.aByteArray22[(local91 >= this.anInt1036 ? local91 - this.anInt1036 : local91) + local87 & 0xFF] & 0xFF) * 2;
						@Pc(123) int local123 = -(local91 << 12);
						@Pc(127) int local127 = local119 + 1;
						@Pc(133) int local133 = local123 + local54 - this.aShortArray39[local119];
						@Pc(144) int local144 = local24 - (local66 << 12) - this.aShortArray39[local127];
						local147 = this.anInt1027;
						@Pc(176) int local176;
						if (local147 == 1) {
							local176 = local144 * local144 + local133 * local133 >> 12;
						} else if (local147 == 3) {
							local144 = local144 < 0 ? -local144 : local144;
							local133 = local133 >= 0 ? local133 : -local133;
							local176 = local133 <= local144 ? local144 : local133;
						} else if (local147 == 4) {
							local133 = (int) (Math.sqrt((double) ((float) (local133 >= 0 ? local133 : -local133) / 4096.0F)) * 4096.0D);
							local144 = (int) (Math.sqrt((double) ((float) (local144 < 0 ? -local144 : local144) / 4096.0F)) * 4096.0D);
							local176 = local133 + local144;
							local176 = local176 * local176 >> 12;
						} else if (local147 == 5) {
							local133 *= local133;
							local144 *= local144;
							local176 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local144 + local133) / 1.6777216E7F))) * 4096.0D);
						} else if (local147 == 2) {
							local176 = (local133 < 0 ? -local133 : local133) + (local144 >= 0 ? local144 : -local144);
						} else {
							local176 = (int) (Math.sqrt((double) ((float) (local144 * local144 + local133 * local133) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static173.anInt3435 > local176) {
							Static53.anInt998 = Static81.anInt1499;
							Static81.anInt1499 = Static27.anInt491;
							Static27.anInt491 = Static173.anInt3435;
							Static173.anInt3435 = local176;
						} else if (Static27.anInt491 > local176) {
							Static53.anInt998 = Static81.anInt1499;
							Static81.anInt1499 = Static27.anInt491;
							Static27.anInt491 = local176;
						} else if (Static81.anInt1499 > local176) {
							Static53.anInt998 = Static81.anInt1499;
							Static81.anInt1499 = local176;
						} else if (Static53.anInt998 > local176) {
							Static53.anInt998 = local176;
						}
					}
				}
				local147 = this.anInt1032;
				if (local147 == 0) {
					local11[local34] = Static173.anInt3435;
				} else if (local147 == 1) {
					local11[local34] = Static27.anInt491;
				} else if (local147 == 3) {
					local11[local34] = Static81.anInt1499;
				} else if (local147 == 4) {
					local11[local34] = Static53.anInt998;
				} else if (local147 == 2) {
					local11[local34] = Static27.anInt491 - Static173.anInt3435;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	private void method820() {
		@Pc(17) Random local17 = new Random((long) this.anInt1020);
		this.aShortArray39 = new short[512];
		if (this.anInt1035 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray39[local29] = (short) Static331.method5444(this.anInt1035, local17);
			}
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1036 = this.anInt1028 = arg0.method5185();
		} else if (arg1 == 1) {
			this.anInt1020 = arg0.method5185();
		} else if (arg1 == 2) {
			this.anInt1035 = arg0.method5187();
		} else if (arg1 == 3) {
			this.anInt1032 = arg0.method5185();
		} else if (arg1 == 4) {
			this.anInt1027 = arg0.method5185();
		} else if (arg1 == 5) {
			this.anInt1036 = arg0.method5185();
		} else if (arg1 == 6) {
			this.anInt1028 = arg0.method5185();
		}
	}

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
		this.aByteArray22 = Static209.method3746(this.anInt1020);
		this.method820();
	}
}
