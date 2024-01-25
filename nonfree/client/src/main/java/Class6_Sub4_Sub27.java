import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class6_Sub4_Sub27 extends Class6_Sub4 {

	@OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
	private int anInt6998 = 5;

	@OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
	private int anInt7001 = 5;

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "[S")
	private short[] aShortArray110 = new short[512];

	@OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
	private int anInt7005 = 2048;

	@OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
	private int anInt7003 = 2;

	@OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
	private int anInt7000 = 1;

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
	private int anInt7004 = 0;

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "[B")
	private byte[] aByteArray89 = new byte[512];

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt6998 = this.anInt7001 = arg1.method6069();
		} else if (arg0 == 1) {
			this.anInt7004 = arg1.method6069();
		} else if (arg0 == 2) {
			this.anInt7005 = arg1.method6003();
		} else if (arg0 == 3) {
			this.anInt7003 = arg1.method6069();
		} else if (arg0 == 4) {
			this.anInt7000 = arg1.method6069();
		} else if (arg0 == 5) {
			this.anInt6998 = arg1.method6069();
		} else if (arg0 == 6) {
			this.anInt7001 = arg1.method6069();
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
		this.aByteArray89 = Static285.method4648(this.anInt7004);
		this.method5851();
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(24) int local24 = this.anInt7001 * Static501.anIntArray637[arg0] + 2048;
			@Pc(28) int local28 = local24 >> 12;
			@Pc(32) int local32 = local28 + 1;
			for (@Pc(34) int local34 = 0; local34 < Static408.anInt7209; local34++) {
				Static304.anInt5590 = Integer.MAX_VALUE;
				Static427.anInt7434 = Integer.MAX_VALUE;
				Static11.anInt320 = Integer.MAX_VALUE;
				Static532.anInt8835 = Integer.MAX_VALUE;
				@Pc(54) int local54 = Static398.anIntArray514[local34] * this.anInt6998 + 2048;
				@Pc(58) int local58 = local54 >> 12;
				@Pc(62) int local62 = local58 + 1;
				@Pc(149) int local149;
				for (@Pc(66) int local66 = local28 - 1; local66 <= local32; local66++) {
					@Pc(90) int local90 = this.aByteArray89[(this.anInt7001 > local66 ? local66 : local66 - this.anInt7001) & 0xFF] & 0xFF;
					for (@Pc(94) int local94 = local58 - 1; local94 <= local62; local94++) {
						@Pc(119) int local119 = (this.aByteArray89[(local94 >= this.anInt6998 ? local94 - this.anInt6998 : local94) + local90 & 0xFF] & 0xFF) * 2;
						@Pc(124) int local124 = -(local94 << 12);
						@Pc(128) int local128 = local119 + 1;
						@Pc(133) int local133 = local54 + local124 - this.aShortArray110[local119];
						@Pc(146) int local146 = local24 - (local66 << 12) - this.aShortArray110[local128];
						local149 = this.anInt7000;
						@Pc(182) int local182;
						if (local149 == 1) {
							local182 = local146 * local146 + local133 * local133 >> 12;
						} else if (local149 == 3) {
							local146 = local146 < 0 ? -local146 : local146;
							local133 = local133 < 0 ? -local133 : local133;
							local182 = local133 > local146 ? local133 : local146;
						} else if (local149 == 4) {
							local133 = (int) (Math.sqrt((double) ((float) (local133 >= 0 ? local133 : -local133) / 4096.0F)) * 4096.0D);
							local146 = (int) (Math.sqrt((double) ((float) (local146 < 0 ? -local146 : local146) / 4096.0F)) * 4096.0D);
							local182 = local146 + local133;
							local182 = local182 * local182 >> 12;
						} else if (local149 == 5) {
							local133 *= local133;
							local146 *= local146;
							local182 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local133 + local146) / 1.6777216E7F))) * 4096.0D);
						} else if (local149 == 2) {
							local182 = (local146 >= 0 ? local146 : -local146) + (local133 < 0 ? -local133 : local133);
						} else {
							local182 = (int) (Math.sqrt((double) ((float) (local133 * local133 + local146 * local146) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static532.anInt8835 > local182) {
							Static304.anInt5590 = Static427.anInt7434;
							Static427.anInt7434 = Static11.anInt320;
							Static11.anInt320 = Static532.anInt8835;
							Static532.anInt8835 = local182;
						} else if (Static11.anInt320 > local182) {
							Static304.anInt5590 = Static427.anInt7434;
							Static427.anInt7434 = Static11.anInt320;
							Static11.anInt320 = local182;
						} else if (local182 < Static427.anInt7434) {
							Static304.anInt5590 = Static427.anInt7434;
							Static427.anInt7434 = local182;
						} else if (Static304.anInt5590 > local182) {
							Static304.anInt5590 = local182;
						}
					}
				}
				local149 = this.anInt7003;
				if (local149 == 0) {
					local11[local34] = Static532.anInt8835;
				} else if (local149 == 1) {
					local11[local34] = Static11.anInt320;
				} else if (local149 == 3) {
					local11[local34] = Static427.anInt7434;
				} else if (local149 == 4) {
					local11[local34] = Static304.anInt5590;
				} else if (local149 == 2) {
					local11[local34] = Static11.anInt320 - Static532.anInt8835;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
	private void method5851() {
		@Pc(12) Random local12 = new Random((long) this.anInt7004);
		this.aShortArray110 = new short[512];
		if (this.anInt7005 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray110[local28] = (short) Static411.method7689(this.anInt7005, local12);
			}
		}
	}
}
