import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class1_Sub2_Sub26 extends Class1_Sub2 {

	@OriginalMember(owner = "client!or", name = "H", descriptor = "[S")
	private short[] aShortArray82 = new short[512];

	@OriginalMember(owner = "client!or", name = "N", descriptor = "I")
	private int anInt4910 = 2;

	@OriginalMember(owner = "client!or", name = "S", descriptor = "I")
	private int anInt4915 = 0;

	@OriginalMember(owner = "client!or", name = "P", descriptor = "I")
	private int anInt4912 = 1;

	@OriginalMember(owner = "client!or", name = "R", descriptor = "I")
	private int anInt4914 = 5;

	@OriginalMember(owner = "client!or", name = "U", descriptor = "I")
	private int anInt4916 = 2048;

	@OriginalMember(owner = "client!or", name = "W", descriptor = "I")
	private int anInt4917 = 5;

	@OriginalMember(owner = "client!or", name = "T", descriptor = "[B")
	private byte[] aByteArray59 = new byte[512];

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!or", name = "e", descriptor = "(I)V")
	private void method4012() {
		@Pc(12) Random local12 = new Random((long) this.anInt4915);
		this.aShortArray82 = new short[512];
		if (this.anInt4916 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray82[local27] = (short) Static19.method243(this.anInt4916, local12);
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass264_41.method5969(arg0);
		if (super.aClass264_41.aBoolean657) {
			@Pc(25) int local25 = Static285.anIntArray17[arg0] * this.anInt4914 + 2048;
			@Pc(29) int local29 = local25 >> 12;
			@Pc(33) int local33 = local29 + 1;
			for (@Pc(35) int local35 = 0; local35 < Static410.anInt7198; local35++) {
				Static198.anInt3574 = Integer.MAX_VALUE;
				Static36.anInt7704 = Integer.MAX_VALUE;
				Static68.anInt1237 = Integer.MAX_VALUE;
				Static315.anInt5463 = Integer.MAX_VALUE;
				@Pc(54) int local54 = this.anInt4917 * Static400.anIntArray525[local35] + 2048;
				@Pc(58) int local58 = local54 >> 12;
				@Pc(62) int local62 = local58 + 1;
				@Pc(148) int local148;
				for (@Pc(66) int local66 = local29 - 1; local66 <= local33; local66++) {
					@Pc(87) int local87 = this.aByteArray59[(local66 >= this.anInt4914 ? local66 - this.anInt4914 : local66) & 0xFF] & 0xFF;
					for (@Pc(91) int local91 = local58 - 1; local91 <= local62; local91++) {
						@Pc(119) int local119 = (this.aByteArray59[(local91 >= this.anInt4917 ? local91 - this.anInt4917 : local91) + local87 & 0xFF] & 0xFF) * 2;
						@Pc(123) int local123 = local119 + 1;
						@Pc(132) int local132 = local54 - this.aShortArray82[local119] - (local91 << 12);
						@Pc(145) int local145 = local25 - (local66 << 12) - this.aShortArray82[local123];
						local148 = this.anInt4912;
						@Pc(179) int local179;
						if (local148 == 1) {
							local179 = local132 * local132 + local145 * local145 >> 12;
						} else if (local148 == 3) {
							local145 = local145 >= 0 ? local145 : -local145;
							local132 = local132 >= 0 ? local132 : -local132;
							local179 = local145 < local132 ? local132 : local145;
						} else if (local148 == 4) {
							local132 = (int) (Math.sqrt((double) ((float) (local132 >= 0 ? local132 : -local132) / 4096.0F)) * 4096.0D);
							local145 = (int) (Math.sqrt((double) ((float) (local145 < 0 ? -local145 : local145) / 4096.0F)) * 4096.0D);
							local179 = local132 + local145;
							local179 = local179 * local179 >> 12;
						} else if (local148 == 5) {
							local132 *= local132;
							local145 *= local145;
							local179 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local132 + local145) / 1.6777216E7F))) * 4096.0D);
						} else if (local148 == 2) {
							local179 = (local145 < 0 ? -local145 : local145) + (local132 < 0 ? -local132 : local132);
						} else {
							local179 = (int) (Math.sqrt((double) ((float) (local132 * local132 + local145 * local145) / 1.6777216E7F)) * 4096.0D);
						}
						if (local179 < Static315.anInt5463) {
							Static198.anInt3574 = Static36.anInt7704;
							Static36.anInt7704 = Static68.anInt1237;
							Static68.anInt1237 = Static315.anInt5463;
							Static315.anInt5463 = local179;
						} else if (local179 < Static68.anInt1237) {
							Static198.anInt3574 = Static36.anInt7704;
							Static36.anInt7704 = Static68.anInt1237;
							Static68.anInt1237 = local179;
						} else if (local179 < Static36.anInt7704) {
							Static198.anInt3574 = Static36.anInt7704;
							Static36.anInt7704 = local179;
						} else if (Static198.anInt3574 > local179) {
							Static198.anInt3574 = local179;
						}
					}
				}
				local148 = this.anInt4910;
				if (local148 == 0) {
					local11[local35] = Static315.anInt5463;
				} else if (local148 == 1) {
					local11[local35] = Static68.anInt1237;
				} else if (local148 == 3) {
					local11[local35] = Static36.anInt7704;
				} else if (local148 == 4) {
					local11[local35] = Static198.anInt3574;
				} else if (local148 == 2) {
					local11[local35] = Static68.anInt1237 - Static315.anInt5463;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4917 = this.anInt4914 = arg0.method4548();
		} else if (arg1 == 1) {
			this.anInt4915 = arg0.method4548();
		} else if (arg1 == 2) {
			this.anInt4916 = arg0.method4498();
		} else if (arg1 == 3) {
			this.anInt4910 = arg0.method4548();
		} else if (arg1 == 4) {
			this.anInt4912 = arg0.method4548();
		} else if (arg1 == 5) {
			this.anInt4917 = arg0.method4548();
		} else if (arg1 == 6) {
			this.anInt4914 = arg0.method4548();
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
	@Override
	public void method5864() {
		this.aByteArray59 = Static50.method691(this.anInt4915);
		this.method4012();
	}
}
