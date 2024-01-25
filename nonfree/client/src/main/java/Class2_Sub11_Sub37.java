import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class2_Sub11_Sub37 extends Class2_Sub11 {

	@OriginalMember(owner = "client!vp", name = "P", descriptor = "[S")
	private short[] aShortArray146 = new short[512];

	@OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
	private int anInt10606 = 0;

	@OriginalMember(owner = "client!vp", name = "I", descriptor = "[B")
	private byte[] aByteArray119 = new byte[512];

	@OriginalMember(owner = "client!vp", name = "F", descriptor = "I")
	private int anInt10609 = 1;

	@OriginalMember(owner = "client!vp", name = "L", descriptor = "I")
	private int anInt10607 = 5;

	@OriginalMember(owner = "client!vp", name = "G", descriptor = "I")
	private int anInt10612 = 2048;

	@OriginalMember(owner = "client!vp", name = "R", descriptor = "I")
	private int anInt10601 = 2;

	@OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
	private int anInt10602 = 5;

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			@Pc(30) int local30 = this.anInt10602 * Static137.anIntArray170[arg0] + 2048;
			@Pc(34) int local34 = local30 >> 12;
			@Pc(38) int local38 = local34 + 1;
			for (@Pc(40) int local40 = 0; local40 < Static301.anInt10214; local40++) {
				Static64.anInt1116 = Integer.MAX_VALUE;
				Static156.anInt2604 = Integer.MAX_VALUE;
				Static378.anInt6053 = Integer.MAX_VALUE;
				Static405.anInt6681 = Integer.MAX_VALUE;
				@Pc(59) int local59 = this.anInt10607 * Static523.anIntArray461[local40] + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(163) int local163;
				for (@Pc(71) int local71 = local34 - 1; local71 <= local38; local71++) {
					@Pc(99) int local99 = this.aByteArray119[(this.anInt10602 <= local71 ? local71 - this.anInt10602 : local71) & 0xFF] & 0xFF;
					for (@Pc(103) int local103 = local63 - 1; local103 <= local67; local103++) {
						@Pc(135) int local135 = (this.aByteArray119[local99 + (local103 >= this.anInt10607 ? local103 - this.anInt10607 : local103) & 0xFF] & 0xFF) * 2;
						@Pc(141) int local141 = local59 - (local103 << 12);
						@Pc(145) int local145 = local135 + 1;
						@Pc(149) int local149 = local141 - this.aShortArray146[local135];
						@Pc(160) int local160 = local30 - (local71 << 12) - this.aShortArray146[local145];
						local163 = this.anInt10609;
						@Pc(204) int local204;
						if (local163 == 1) {
							local204 = local160 * local160 + local149 * local149 >> 12;
						} else if (local163 == 3) {
							local160 = local160 < 0 ? -local160 : local160;
							local149 = local149 < 0 ? -local149 : local149;
							local204 = local160 < local149 ? local149 : local160;
						} else if (local163 == 4) {
							local149 = (int) (Math.sqrt((double) ((float) (local149 >= 0 ? local149 : -local149) / 4096.0F)) * 4096.0D);
							local160 = (int) (Math.sqrt((double) ((float) (local160 >= 0 ? local160 : -local160) / 4096.0F)) * 4096.0D);
							local204 = local160 + local149;
							local204 = local204 * local204 >> 12;
						} else if (local163 == 5) {
							local149 *= local149;
							local160 *= local160;
							local204 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local160 + local149) / 1.6777216E7F))) * 4096.0D);
						} else if (local163 == 2) {
							local204 = (local149 < 0 ? -local149 : local149) + (local160 < 0 ? -local160 : local160);
						} else {
							local204 = (int) (Math.sqrt((double) ((float) (local149 * local149 + local160 * local160) / 1.6777216E7F)) * 4096.0D);
						}
						if (local204 < Static405.anInt6681) {
							Static64.anInt1116 = Static156.anInt2604;
							Static156.anInt2604 = Static378.anInt6053;
							Static378.anInt6053 = Static405.anInt6681;
							Static405.anInt6681 = local204;
						} else if (Static378.anInt6053 > local204) {
							Static64.anInt1116 = Static156.anInt2604;
							Static156.anInt2604 = Static378.anInt6053;
							Static378.anInt6053 = local204;
						} else if (Static156.anInt2604 > local204) {
							Static64.anInt1116 = Static156.anInt2604;
							Static156.anInt2604 = local204;
						} else if (local204 < Static64.anInt1116) {
							Static64.anInt1116 = local204;
						}
					}
				}
				local163 = this.anInt10601;
				if (local163 == 0) {
					local11[local40] = Static405.anInt6681;
				} else if (local163 == 1) {
					local11[local40] = Static378.anInt6053;
				} else if (local163 == 3) {
					local11[local40] = Static156.anInt2604;
				} else if (local163 == 4) {
					local11[local40] = Static64.anInt1116;
				} else if (local163 == 2) {
					local11[local40] = Static378.anInt6053 - Static405.anInt6681;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
	@Override
	public void method9530() {
		this.aByteArray119 = Static245.method3449(this.anInt10606);
		this.method9302();
	}

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(B)V")
	private void method9302() {
		@Pc(20) Random local20 = new Random((long) this.anInt10606);
		this.aShortArray146 = new short[512];
		if (this.anInt10612 > 0) {
			for (@Pc(29) int local29 = 0; local29 < 512; local29++) {
				this.aShortArray146[local29] = (short) Static289.method4068(this.anInt10612, local20);
			}
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt10607 = this.anInt10602 = arg1.method8581(-17416);
		} else if (arg0 == 1) {
			this.anInt10606 = arg1.method8581(-17416);
		} else if (arg0 == 2) {
			this.anInt10612 = arg1.method8575();
		} else if (arg0 == 3) {
			this.anInt10601 = arg1.method8581(-17416);
		} else if (arg0 == 4) {
			this.anInt10609 = arg1.method8581(-17416);
		} else if (arg0 == 5) {
			this.anInt10607 = arg1.method8581(-17416);
		} else if (arg0 == 6) {
			this.anInt10602 = arg1.method8581(-17416);
		}
	}
}
