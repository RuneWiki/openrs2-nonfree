import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cfa")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!cfa", name = "L", descriptor = "[S")
	private short[] aShortArray20 = new short[512];

	@OriginalMember(owner = "client!cfa", name = "I", descriptor = "I")
	private int anInt1604 = 1;

	@OriginalMember(owner = "client!cfa", name = "O", descriptor = "I")
	private int anInt1608 = 2048;

	@OriginalMember(owner = "client!cfa", name = "S", descriptor = "[B")
	private byte[] aByteArray17 = new byte[512];

	@OriginalMember(owner = "client!cfa", name = "J", descriptor = "I")
	private int anInt1605 = 5;

	@OriginalMember(owner = "client!cfa", name = "K", descriptor = "I")
	private int anInt1606 = 5;

	@OriginalMember(owner = "client!cfa", name = "M", descriptor = "I")
	private int anInt1607 = 0;

	@OriginalMember(owner = "client!cfa", name = "V", descriptor = "I")
	private int anInt1614 = 2;

	@OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(31) int local31 = Static324.anIntArray440[arg0] * this.anInt1606 + 2048;
			@Pc(35) int local35 = local31 >> 12;
			@Pc(39) int local39 = local35 + 1;
			for (@Pc(41) int local41 = 0; local41 < Static131.anInt2935; local41++) {
				Static303.anInt6067 = Integer.MAX_VALUE;
				Static163.anInt3510 = Integer.MAX_VALUE;
				Static164.anInt3514 = Integer.MAX_VALUE;
				Static293.anInt6015 = Integer.MAX_VALUE;
				@Pc(61) int local61 = this.anInt1605 * Static361.anIntArray460[local41] + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(161) int local161;
				for (@Pc(73) int local73 = local35 - 1; local73 <= local39; local73++) {
					@Pc(98) int local98 = this.aByteArray17[(this.anInt1606 > local73 ? local73 : local73 - this.anInt1606) & 0xFF] & 0xFF;
					for (@Pc(102) int local102 = local65 - 1; local102 <= local69; local102++) {
						@Pc(131) int local131 = (this.aByteArray17[local98 + (this.anInt1605 <= local102 ? local102 - this.anInt1605 : local102) & 0xFF] & 0xFF) * 2;
						@Pc(135) int local135 = local131 + 1;
						@Pc(145) int local145 = local61 - this.aShortArray20[local131] - (local102 << 12);
						@Pc(158) int local158 = local31 - (local73 << 12) - this.aShortArray20[local135];
						local161 = this.anInt1604;
						@Pc(192) int local192;
						if (local161 == 1) {
							local192 = local158 * local158 + local145 * local145 >> 12;
						} else if (local161 == 3) {
							local158 = local158 >= 0 ? local158 : -local158;
							local145 = local145 >= 0 ? local145 : -local145;
							local192 = local145 > local158 ? local145 : local158;
						} else if (local161 == 4) {
							local145 = (int) (Math.sqrt((double) ((float) (local145 < 0 ? -local145 : local145) / 4096.0F)) * 4096.0D);
							local158 = (int) (Math.sqrt((double) ((float) (local158 < 0 ? -local158 : local158) / 4096.0F)) * 4096.0D);
							local192 = local158 + local145;
							local192 = local192 * local192 >> 12;
						} else if (local161 == 5) {
							local158 *= local158;
							local145 *= local145;
							local192 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local145 + local158) / 1.6777216E7F))) * 4096.0D);
						} else if (local161 == 2) {
							local192 = (local158 < 0 ? -local158 : local158) + (local145 >= 0 ? local145 : -local145);
						} else {
							local192 = (int) (Math.sqrt((double) ((float) (local145 * local145 + local158 * local158) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static293.anInt6015 > local192) {
							Static303.anInt6067 = Static163.anInt3510;
							Static163.anInt3510 = Static164.anInt3514;
							Static164.anInt3514 = Static293.anInt6015;
							Static293.anInt6015 = local192;
						} else if (Static164.anInt3514 > local192) {
							Static303.anInt6067 = Static163.anInt3510;
							Static163.anInt3510 = Static164.anInt3514;
							Static164.anInt3514 = local192;
						} else if (local192 < Static163.anInt3510) {
							Static303.anInt6067 = Static163.anInt3510;
							Static163.anInt3510 = local192;
						} else if (local192 < Static303.anInt6067) {
							Static303.anInt6067 = local192;
						}
					}
				}
				local161 = this.anInt1614;
				if (local161 == 0) {
					local11[local41] = Static293.anInt6015;
				} else if (local161 == 1) {
					local11[local41] = Static164.anInt3514;
				} else if (local161 == 3) {
					local11[local41] = Static163.anInt3510;
				} else if (local161 == 4) {
					local11[local41] = Static303.anInt6067;
				} else if (local161 == 2) {
					local11[local41] = Static164.anInt3514 - Static293.anInt6015;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)V")
	private void method1582() {
		@Pc(16) Random local16 = new Random((long) this.anInt1607);
		this.aShortArray20 = new short[512];
		if (this.anInt1608 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray20[local25] = (short) Static137.method2798(local16, this.anInt1608);
			}
		}
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(B)V")
	@Override
	public void method8365() {
		this.aByteArray17 = Static454.method7046(this.anInt1607);
		this.method1582();
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt1605 = this.anInt1606 = arg1.method6538();
		} else if (arg0 == 1) {
			this.anInt1607 = arg1.method6538();
		} else if (arg0 == 2) {
			this.anInt1608 = arg1.method6535();
		} else if (arg0 == 3) {
			this.anInt1614 = arg1.method6538();
		} else if (arg0 == 4) {
			this.anInt1604 = arg1.method6538();
		} else if (arg0 == 5) {
			this.anInt1605 = arg1.method6538();
		} else if (arg0 == 6) {
			this.anInt1606 = arg1.method6538();
		}
	}
}
