import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oo")
public final class Class6_Sub1_Sub26 extends Class6_Sub1 {

	@OriginalMember(owner = "client!oo", name = "E", descriptor = "I")
	private int anInt7627 = 1;

	@OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
	private int anInt7632 = 2048;

	@OriginalMember(owner = "client!oo", name = "M", descriptor = "[B")
	private byte[] aByteArray65 = new byte[512];

	@OriginalMember(owner = "client!oo", name = "Q", descriptor = "I")
	private int anInt7637 = 5;

	@OriginalMember(owner = "client!oo", name = "R", descriptor = "[S")
	private short[] aShortArray124 = new short[512];

	@OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
	private int anInt7634 = 0;

	@OriginalMember(owner = "client!oo", name = "U", descriptor = "I")
	private int anInt7639 = 5;

	@OriginalMember(owner = "client!oo", name = "P", descriptor = "I")
	private int anInt7636 = 2;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)V")
	private void method6446() {
		@Pc(12) Random local12 = new Random((long) this.anInt7634);
		this.aShortArray124 = new short[512];
		if (this.anInt7632 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray124[local24] = (short) Static123.method2611(this.anInt7632, local12);
			}
		}
	}

	@OriginalMember(owner = "client!oo", name = "d", descriptor = "(B)V")
	@Override
	public void method8732() {
		this.aByteArray65 = Static492.method7160(this.anInt7634);
		this.method6446();
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			@Pc(31) int local31 = this.anInt7639 * Static603.anIntArray549[arg0] + 2048;
			@Pc(35) int local35 = local31 >> 12;
			@Pc(39) int local39 = local35 + 1;
			for (@Pc(41) int local41 = 0; local41 < Static53.anInt1787; local41++) {
				Static374.anInt9753 = Integer.MAX_VALUE;
				Static444.anInt8039 = Integer.MAX_VALUE;
				Static215.anInt4645 = Integer.MAX_VALUE;
				Static303.anInt6144 = Integer.MAX_VALUE;
				@Pc(61) int local61 = this.anInt7637 * Static12.anIntArray15[local41] + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(151) int local151;
				for (@Pc(73) int local73 = local35 - 1; local73 <= local39; local73++) {
					@Pc(94) int local94 = this.aByteArray65[(this.anInt7639 <= local73 ? local73 - this.anInt7639 : local73) & 0xFF] & 0xFF;
					for (@Pc(98) int local98 = local65 - 1; local98 <= local69; local98++) {
						@Pc(123) int local123 = (this.aByteArray65[(local98 >= this.anInt7637 ? local98 - this.anInt7637 : local98) + local94 & 0xFF] & 0xFF) * 2;
						@Pc(127) int local127 = -(local98 << 12);
						@Pc(131) int local131 = local123 + 1;
						@Pc(136) int local136 = local127 + local61 - this.aShortArray124[local123];
						@Pc(148) int local148 = local31 - (local73 << 12) - this.aShortArray124[local131];
						local151 = this.anInt7627;
						@Pc(181) int local181;
						if (local151 == 1) {
							local181 = local136 * local136 + local148 * local148 >> 12;
						} else if (local151 == 3) {
							local148 = local148 < 0 ? -local148 : local148;
							local136 = local136 >= 0 ? local136 : -local136;
							local181 = local136 > local148 ? local136 : local148;
						} else if (local151 == 4) {
							local136 = (int) (Math.sqrt((double) ((float) (local136 < 0 ? -local136 : local136) / 4096.0F)) * 4096.0D);
							local148 = (int) (Math.sqrt((double) ((float) (local148 >= 0 ? local148 : -local148) / 4096.0F)) * 4096.0D);
							local181 = local136 + local148;
							local181 = local181 * local181 >> 12;
						} else if (local151 == 5) {
							local136 *= local136;
							local148 *= local148;
							local181 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local148 + local136) / 1.6777216E7F))) * 4096.0D);
						} else if (local151 == 2) {
							local181 = (local148 < 0 ? -local148 : local148) + (local136 < 0 ? -local136 : local136);
						} else {
							local181 = (int) (Math.sqrt((double) ((float) (local136 * local136 + local148 * local148) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static303.anInt6144 > local181) {
							Static374.anInt9753 = Static444.anInt8039;
							Static444.anInt8039 = Static215.anInt4645;
							Static215.anInt4645 = Static303.anInt6144;
							Static303.anInt6144 = local181;
						} else if (local181 < Static215.anInt4645) {
							Static374.anInt9753 = Static444.anInt8039;
							Static444.anInt8039 = Static215.anInt4645;
							Static215.anInt4645 = local181;
						} else if (local181 < Static444.anInt8039) {
							Static374.anInt9753 = Static444.anInt8039;
							Static444.anInt8039 = local181;
						} else if (Static374.anInt9753 > local181) {
							Static374.anInt9753 = local181;
						}
					}
				}
				local151 = this.anInt7636;
				if (local151 == 0) {
					local11[local41] = Static303.anInt6144;
				} else if (local151 == 1) {
					local11[local41] = Static215.anInt4645;
				} else if (local151 == 3) {
					local11[local41] = Static444.anInt8039;
				} else if (local151 == 4) {
					local11[local41] = Static374.anInt9753;
				} else if (local151 == 2) {
					local11[local41] = Static215.anInt4645 - Static303.anInt6144;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt7637 = this.anInt7639 = arg1.method8246();
		} else if (arg0 == 1) {
			this.anInt7634 = arg1.method8246();
		} else if (arg0 == 2) {
			this.anInt7632 = arg1.method8220();
		} else if (arg0 == 3) {
			this.anInt7636 = arg1.method8246();
		} else if (arg0 == 4) {
			this.anInt7627 = arg1.method8246();
		} else if (arg0 == 5) {
			this.anInt7637 = arg1.method8246();
		} else if (arg0 == 6) {
			this.anInt7639 = arg1.method8246();
		}
	}
}
