import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class2_Sub15_Sub32 extends Class2_Sub15 {

	@OriginalMember(owner = "client!tp", name = "J", descriptor = "[B")
	private byte[] aByteArray90 = new byte[512];

	@OriginalMember(owner = "client!tp", name = "G", descriptor = "I")
	private int anInt10107 = 1;

	@OriginalMember(owner = "client!tp", name = "M", descriptor = "I")
	private int anInt10110 = 2;

	@OriginalMember(owner = "client!tp", name = "H", descriptor = "[S")
	private short[] aShortArray150 = new short[512];

	@OriginalMember(owner = "client!tp", name = "N", descriptor = "I")
	private int anInt10111 = 5;

	@OriginalMember(owner = "client!tp", name = "P", descriptor = "I")
	private int anInt10113 = 5;

	@OriginalMember(owner = "client!tp", name = "I", descriptor = "I")
	private int anInt10108 = 0;

	@OriginalMember(owner = "client!tp", name = "O", descriptor = "I")
	private int anInt10112 = 2048;

	static {
		new Class340("", 76);
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V")
	@Override
	public void method9722() {
		this.aByteArray90 = Static545.method8350(this.anInt10108);
		this.method8795();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9724(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass338_41.method8470(arg0);
		if (super.aClass338_41.aBoolean712) {
			@Pc(25) int local25 = Static401.anIntArray357[arg0] * this.anInt10113 + 2048;
			@Pc(29) int local29 = local25 >> 12;
			@Pc(33) int local33 = local29 + 1;
			for (@Pc(35) int local35 = 0; local35 < Static329.anInt6017; local35++) {
				Static241.anInt4780 = Integer.MAX_VALUE;
				Static147.anInt2737 = Integer.MAX_VALUE;
				Static135.anInt2563 = Integer.MAX_VALUE;
				Static405.anInt7545 = Integer.MAX_VALUE;
				@Pc(54) int local54 = Static537.anIntArray480[local35] * this.anInt10111 + 2048;
				@Pc(58) int local58 = local54 >> 12;
				@Pc(62) int local62 = local58 + 1;
				@Pc(147) int local147;
				for (@Pc(66) int local66 = local29 - 1; local66 <= local33; local66++) {
					@Pc(90) int local90 = this.aByteArray90[(local66 < this.anInt10113 ? local66 : local66 - this.anInt10113) & 0xFF] & 0xFF;
					for (@Pc(94) int local94 = local58 - 1; local94 <= local62; local94++) {
						@Pc(119) int local119 = (this.aByteArray90[local90 + (local94 < this.anInt10111 ? local94 : local94 - this.anInt10111) & 0xFF] & 0xFF) * 2;
						@Pc(123) int local123 = -(local94 << 12);
						@Pc(127) int local127 = local119 + 1;
						@Pc(132) int local132 = local123 + local54 - this.aShortArray150[local119];
						@Pc(144) int local144 = local25 - (local66 << 12) - this.aShortArray150[local127];
						local147 = this.anInt10107;
						@Pc(182) int local182;
						if (local147 == 1) {
							local182 = local144 * local144 + local132 * local132 >> 12;
						} else if (local147 == 3) {
							local132 = local132 < 0 ? -local132 : local132;
							local144 = local144 >= 0 ? local144 : -local144;
							local182 = local144 >= local132 ? local144 : local132;
						} else if (local147 == 4) {
							local132 = (int) (Math.sqrt((double) ((float) (local132 >= 0 ? local132 : -local132) / 4096.0F)) * 4096.0D);
							local144 = (int) (Math.sqrt((double) ((float) (local144 >= 0 ? local144 : -local144) / 4096.0F)) * 4096.0D);
							local182 = local132 + local144;
							local182 = local182 * local182 >> 12;
						} else if (local147 == 5) {
							local144 *= local144;
							local132 *= local132;
							local182 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local144 + local132) / 1.6777216E7F))) * 4096.0D);
						} else if (local147 == 2) {
							local182 = (local144 >= 0 ? local144 : -local144) + (local132 >= 0 ? local132 : -local132);
						} else {
							local182 = (int) (Math.sqrt((double) ((float) (local144 * local144 + local132 * local132) / 1.6777216E7F)) * 4096.0D);
						}
						if (local182 < Static405.anInt7545) {
							Static241.anInt4780 = Static147.anInt2737;
							Static147.anInt2737 = Static135.anInt2563;
							Static135.anInt2563 = Static405.anInt7545;
							Static405.anInt7545 = local182;
						} else if (local182 < Static135.anInt2563) {
							Static241.anInt4780 = Static147.anInt2737;
							Static147.anInt2737 = Static135.anInt2563;
							Static135.anInt2563 = local182;
						} else if (local182 < Static147.anInt2737) {
							Static241.anInt4780 = Static147.anInt2737;
							Static147.anInt2737 = local182;
						} else if (local182 < Static241.anInt4780) {
							Static241.anInt4780 = local182;
						}
					}
				}
				local147 = this.anInt10110;
				if (local147 == 0) {
					local11[local35] = Static405.anInt7545;
				} else if (local147 == 1) {
					local11[local35] = Static135.anInt2563;
				} else if (local147 == 3) {
					local11[local35] = Static147.anInt2737;
				} else if (local147 == 4) {
					local11[local35] = Static241.anInt4780;
				} else if (local147 == 2) {
					local11[local35] = Static135.anInt2563 - Static405.anInt7545;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt10111 = this.anInt10113 = arg1.method5203();
		} else if (arg0 == 1) {
			this.anInt10108 = arg1.method5203();
		} else if (arg0 == 2) {
			this.anInt10112 = arg1.method5211();
		} else if (arg0 == 3) {
			this.anInt10110 = arg1.method5203();
		} else if (arg0 == 4) {
			this.anInt10107 = arg1.method5203();
		} else if (arg0 == 5) {
			this.anInt10111 = arg1.method5203();
		} else if (arg0 == 6) {
			this.anInt10113 = arg1.method5203();
		}
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(B)V")
	private void method8795() {
		@Pc(20) Random local20 = new Random((long) this.anInt10108);
		this.aShortArray150 = new short[512];
		if (this.anInt10112 > 0) {
			for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
				this.aShortArray150[local32] = (short) Static17.method7641(this.anInt10112, local20);
			}
		}
	}
}
