import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!tt", name = "K", descriptor = "[B")
	private byte[] aByteArray76 = new byte[512];

	@OriginalMember(owner = "client!tt", name = "R", descriptor = "I")
	private int anInt6479 = 5;

	@OriginalMember(owner = "client!tt", name = "S", descriptor = "I")
	private int anInt6480 = 0;

	@OriginalMember(owner = "client!tt", name = "Q", descriptor = "I")
	private int anInt6478 = 5;

	@OriginalMember(owner = "client!tt", name = "X", descriptor = "I")
	private int anInt6484 = 1;

	@OriginalMember(owner = "client!tt", name = "V", descriptor = "I")
	private int anInt6482 = 2;

	@OriginalMember(owner = "client!tt", name = "U", descriptor = "[S")
	private short[] aShortArray89 = new short[512];

	@OriginalMember(owner = "client!tt", name = "Y", descriptor = "I")
	private int anInt6485 = 2048;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
		this.aByteArray76 = Static143.method1881(this.anInt6480);
		this.method4995();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt6479 = this.anInt6478 = arg1.method4463();
		} else if (arg0 == 1) {
			this.anInt6480 = arg1.method4463();
		} else if (arg0 == 2) {
			this.anInt6485 = arg1.method4485();
		} else if (arg0 == 3) {
			this.anInt6482 = arg1.method4463();
		} else if (arg0 == 4) {
			this.anInt6484 = arg1.method4463();
		} else if (arg0 == 5) {
			this.anInt6479 = arg1.method4463();
		} else if (arg0 == 6) {
			this.anInt6478 = arg1.method4463();
		}
	}

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "(B)V")
	private void method4995() {
		@Pc(12) Random local12 = new Random((long) this.anInt6480);
		this.aShortArray89 = new short[512];
		if (this.anInt6485 > 0) {
			for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
				this.aShortArray89[local25] = (short) Static368.method4796(local12, this.anInt6485);
			}
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(29) int local29 = this.anInt6478 * Static221.anIntArray194[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static434.anInt4326; local39++) {
				Static192.anInt3073 = Integer.MAX_VALUE;
				Static8.anInt7335 = Integer.MAX_VALUE;
				Static119.anInt2054 = Integer.MAX_VALUE;
				Static22.anInt474 = Integer.MAX_VALUE;
				@Pc(59) int local59 = Static280.anIntArray238[local39] * this.anInt6479 + 2048;
				@Pc(63) int local63 = local59 >> 12;
				@Pc(67) int local67 = local63 + 1;
				@Pc(155) int local155;
				for (@Pc(71) int local71 = local33 - 1; local71 <= local37; local71++) {
					@Pc(92) int local92 = this.aByteArray76[(local71 >= this.anInt6478 ? local71 - this.anInt6478 : local71) & 0xFF] & 0xFF;
					for (@Pc(96) int local96 = local63 - 1; local96 <= local67; local96++) {
						@Pc(125) int local125 = (this.aByteArray76[(local96 >= this.anInt6479 ? local96 - this.anInt6479 : local96) + local92 & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local125 + 1;
						@Pc(139) int local139 = local59 - this.aShortArray89[local125] - (local96 << 12);
						@Pc(152) int local152 = local29 - (local71 << 12) - this.aShortArray89[local129];
						local155 = this.anInt6484;
						@Pc(191) int local191;
						if (local155 == 1) {
							local191 = local139 * local139 + local152 * local152 >> 12;
						} else if (local155 == 3) {
							local139 = local139 < 0 ? -local139 : local139;
							local152 = local152 < 0 ? -local152 : local152;
							local191 = local139 <= local152 ? local152 : local139;
						} else if (local155 == 4) {
							local139 = (int) (Math.sqrt((double) ((float) (local139 >= 0 ? local139 : -local139) / 4096.0F)) * 4096.0D);
							local152 = (int) (Math.sqrt((double) ((float) (local152 >= 0 ? local152 : -local152) / 4096.0F)) * 4096.0D);
							local191 = local152 + local139;
							local191 = local191 * local191 >> 12;
						} else if (local155 == 5) {
							local139 *= local139;
							local152 *= local152;
							local191 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local152 + local139) / 1.6777216E7F))) * 4096.0D);
						} else if (local155 == 2) {
							local191 = (local139 >= 0 ? local139 : -local139) + (local152 >= 0 ? local152 : -local152);
						} else {
							local191 = (int) (Math.sqrt((double) ((float) (local139 * local139 + local152 * local152) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static22.anInt474 > local191) {
							Static192.anInt3073 = Static8.anInt7335;
							Static8.anInt7335 = Static119.anInt2054;
							Static119.anInt2054 = Static22.anInt474;
							Static22.anInt474 = local191;
						} else if (Static119.anInt2054 > local191) {
							Static192.anInt3073 = Static8.anInt7335;
							Static8.anInt7335 = Static119.anInt2054;
							Static119.anInt2054 = local191;
						} else if (local191 < Static8.anInt7335) {
							Static192.anInt3073 = Static8.anInt7335;
							Static8.anInt7335 = local191;
						} else if (local191 < Static192.anInt3073) {
							Static192.anInt3073 = local191;
						}
					}
				}
				local155 = this.anInt6482;
				if (local155 == 0) {
					local11[local39] = Static22.anInt474;
				} else if (local155 == 1) {
					local11[local39] = Static119.anInt2054;
				} else if (local155 == 3) {
					local11[local39] = Static8.anInt7335;
				} else if (local155 == 4) {
					local11[local39] = Static192.anInt3073;
				} else if (local155 == 2) {
					local11[local39] = Static119.anInt2054 - Static22.anInt474;
				}
			}
		}
		return local11;
	}
}
