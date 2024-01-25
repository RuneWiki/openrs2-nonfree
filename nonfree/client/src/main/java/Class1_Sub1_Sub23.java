import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mf")
public final class Class1_Sub1_Sub23 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
	private int anInt5842 = 0;

	@OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
	private int anInt5845 = 2048;

	@OriginalMember(owner = "client!mf", name = "F", descriptor = "[S")
	private short[] aShortArray43 = new short[512];

	@OriginalMember(owner = "client!mf", name = "J", descriptor = "I")
	private int anInt5848 = 2;

	@OriginalMember(owner = "client!mf", name = "E", descriptor = "[B")
	private byte[] aByteArray52 = new byte[512];

	@OriginalMember(owner = "client!mf", name = "L", descriptor = "I")
	private int anInt5850 = 5;

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "I")
	private int anInt5847 = 5;

	@OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
	private int anInt5851 = 1;

	@OriginalMember(owner = "client!mf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
	@Override
	public void method7831() {
		this.aByteArray52 = Static339.method5063(this.anInt5842);
		this.method4769();
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(24) int local24 = Static583.anIntArray614[arg0] * this.anInt5847 + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static501.anInt8748; local34++) {
				Static347.anInt6411 = Integer.MAX_VALUE;
				Static336.anInt6158 = Integer.MAX_VALUE;
				Static539.anInt9044 = Integer.MAX_VALUE;
				Static182.anInt3607 = Integer.MAX_VALUE;
				@Pc(53) int local53 = Static95.anIntArray77[local34] * this.anInt5850 + 2048;
				@Pc(57) int local57 = local53 >> 12;
				@Pc(61) int local61 = local57 + 1;
				@Pc(145) int local145;
				for (@Pc(65) int local65 = local28 - 1; local65 <= local32; local65++) {
					@Pc(85) int local85 = this.aByteArray52[(this.anInt5847 > local65 ? local65 : local65 - this.anInt5847) & 0xFF] & 0xFF;
					for (@Pc(89) int local89 = local57 - 1; local89 <= local61; local89++) {
						@Pc(117) int local117 = (this.aByteArray52[local85 + (local89 >= this.anInt5850 ? local89 - this.anInt5850 : local89) & 0xFF] & 0xFF) * 2;
						@Pc(121) int local121 = -(local89 << 12);
						@Pc(125) int local125 = local117 + 1;
						@Pc(130) int local130 = local121 + local53 - this.aShortArray43[local117];
						@Pc(142) int local142 = local24 - this.aShortArray43[local125] - (local65 << 12);
						local145 = this.anInt5851;
						@Pc(176) int local176;
						if (local145 == 1) {
							local176 = local142 * local142 + local130 * local130 >> 12;
						} else if (local145 == 3) {
							local142 = local142 < 0 ? -local142 : local142;
							local130 = local130 >= 0 ? local130 : -local130;
							local176 = local130 <= local142 ? local142 : local130;
						} else if (local145 == 4) {
							local130 = (int) (Math.sqrt((double) ((float) (local130 < 0 ? -local130 : local130) / 4096.0F)) * 4096.0D);
							local142 = (int) (Math.sqrt((double) ((float) (local142 < 0 ? -local142 : local142) / 4096.0F)) * 4096.0D);
							local176 = local130 + local142;
							local176 = local176 * local176 >> 12;
						} else if (local145 == 5) {
							local142 *= local142;
							local130 *= local130;
							local176 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local130 + local142) / 1.6777216E7F))) * 4096.0D);
						} else if (local145 == 2) {
							local176 = (local130 < 0 ? -local130 : local130) + (local142 < 0 ? -local142 : local142);
						} else {
							local176 = (int) (Math.sqrt((double) ((float) (local142 * local142 + local130 * local130) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static182.anInt3607 > local176) {
							Static347.anInt6411 = Static336.anInt6158;
							Static336.anInt6158 = Static539.anInt9044;
							Static539.anInt9044 = Static182.anInt3607;
							Static182.anInt3607 = local176;
						} else if (Static539.anInt9044 > local176) {
							Static347.anInt6411 = Static336.anInt6158;
							Static336.anInt6158 = Static539.anInt9044;
							Static539.anInt9044 = local176;
						} else if (Static336.anInt6158 > local176) {
							Static347.anInt6411 = Static336.anInt6158;
							Static336.anInt6158 = local176;
						} else if (Static347.anInt6411 > local176) {
							Static347.anInt6411 = local176;
						}
					}
				}
				local145 = this.anInt5848;
				if (local145 == 0) {
					local11[local34] = Static182.anInt3607;
				} else if (local145 == 1) {
					local11[local34] = Static539.anInt9044;
				} else if (local145 == 3) {
					local11[local34] = Static336.anInt6158;
				} else if (local145 == 4) {
					local11[local34] = Static347.anInt6411;
				} else if (local145 == 2) {
					local11[local34] = Static539.anInt9044 - Static182.anInt3607;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V")
	private void method4769() {
		@Pc(12) Random local12 = new Random((long) this.anInt5842);
		this.aShortArray43 = new short[512];
		if (this.anInt5845 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray43[local29] = (short) Static46.method765(this.anInt5845, local12);
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt5850 = this.anInt5847 = arg1.method7974();
		} else if (arg0 == 1) {
			this.anInt5842 = arg1.method7974();
		} else if (arg0 == 2) {
			this.anInt5845 = arg1.method7945();
		} else if (arg0 == 3) {
			this.anInt5848 = arg1.method7974();
		} else if (arg0 == 4) {
			this.anInt5851 = arg1.method7974();
		} else if (arg0 == 5) {
			this.anInt5850 = arg1.method7974();
		} else if (arg0 == 6) {
			this.anInt5847 = arg1.method7974();
		}
	}
}
