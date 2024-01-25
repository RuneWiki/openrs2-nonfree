import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!o", name = "F", descriptor = "I")
	private int anInt6518 = 5;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "I")
	private int anInt6524 = 1;

	@OriginalMember(owner = "client!o", name = "J", descriptor = "[S")
	private short[] aShortArray77 = new short[512];

	@OriginalMember(owner = "client!o", name = "E", descriptor = "I")
	private int anInt6517 = 0;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "I")
	private int anInt6516 = 2;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "[B")
	private byte[] aByteArray71 = new byte[512];

	@OriginalMember(owner = "client!o", name = "P", descriptor = "I")
	private int anInt6525 = 5;

	@OriginalMember(owner = "client!o", name = "M", descriptor = "I")
	private int anInt6523 = 2048;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(31) int local31 = Static337.anIntArray406[arg0] * this.anInt6525 + 2048;
			@Pc(35) int local35 = local31 >> 12;
			@Pc(39) int local39 = local35 + 1;
			for (@Pc(41) int local41 = 0; local41 < Static87.anInt1964; local41++) {
				Static358.anInt6249 = Integer.MAX_VALUE;
				Static570.anInt9313 = Integer.MAX_VALUE;
				Static60.anInt1502 = Integer.MAX_VALUE;
				Static575.anInt5384 = Integer.MAX_VALUE;
				@Pc(61) int local61 = this.anInt6518 * Static436.anIntArray506[local41] + 2048;
				@Pc(65) int local65 = local61 >> 12;
				@Pc(69) int local69 = local65 + 1;
				@Pc(156) int local156;
				for (@Pc(73) int local73 = local35 - 1; local73 <= local39; local73++) {
					@Pc(98) int local98 = this.aByteArray71[(this.anInt6525 > local73 ? local73 : local73 - this.anInt6525) & 0xFF] & 0xFF;
					for (@Pc(102) int local102 = local65 - 1; local102 <= local69; local102++) {
						@Pc(128) int local128 = (this.aByteArray71[local98 + (this.anInt6518 > local102 ? local102 : local102 - this.anInt6518) & 0xFF] & 0xFF) * 2;
						@Pc(133) int local133 = local61 - (local102 << 12);
						@Pc(137) int local137 = local128 + 1;
						@Pc(140) int local140 = local133 - this.aShortArray77[local128];
						@Pc(153) int local153 = local31 - (local73 << 12) - this.aShortArray77[local137];
						local156 = this.anInt6524;
						@Pc(191) int local191;
						if (local156 == 1) {
							local191 = local153 * local153 + local140 * local140 >> 12;
						} else if (local156 == 3) {
							local140 = local140 >= 0 ? local140 : -local140;
							local153 = local153 >= 0 ? local153 : -local153;
							local191 = local153 < local140 ? local140 : local153;
						} else if (local156 == 4) {
							local140 = (int) (Math.sqrt((double) ((float) (local140 < 0 ? -local140 : local140) / 4096.0F)) * 4096.0D);
							local153 = (int) (Math.sqrt((double) ((float) (local153 >= 0 ? local153 : -local153) / 4096.0F)) * 4096.0D);
							local191 = local153 + local140;
							local191 = local191 * local191 >> 12;
						} else if (local156 == 5) {
							local153 *= local153;
							local140 *= local140;
							local191 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local153 + local140) / 1.6777216E7F))) * 4096.0D);
						} else if (local156 == 2) {
							local191 = (local153 < 0 ? -local153 : local153) + (local140 < 0 ? -local140 : local140);
						} else {
							local191 = (int) (Math.sqrt((double) ((float) (local153 * local153 + local140 * local140) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static575.anInt5384 > local191) {
							Static358.anInt6249 = Static570.anInt9313;
							Static570.anInt9313 = Static60.anInt1502;
							Static60.anInt1502 = Static575.anInt5384;
							Static575.anInt5384 = local191;
						} else if (local191 < Static60.anInt1502) {
							Static358.anInt6249 = Static570.anInt9313;
							Static570.anInt9313 = Static60.anInt1502;
							Static60.anInt1502 = local191;
						} else if (Static570.anInt9313 > local191) {
							Static358.anInt6249 = Static570.anInt9313;
							Static570.anInt9313 = local191;
						} else if (local191 < Static358.anInt6249) {
							Static358.anInt6249 = local191;
						}
					}
				}
				local156 = this.anInt6516;
				if (local156 == 0) {
					local17[local41] = Static575.anInt5384;
				} else if (local156 == 1) {
					local17[local41] = Static60.anInt1502;
				} else if (local156 == 3) {
					local17[local41] = Static570.anInt9313;
				} else if (local156 == 4) {
					local17[local41] = Static358.anInt6249;
				} else if (local156 == 2) {
					local17[local41] = Static60.anInt1502 - Static575.anInt5384;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt6518 = this.anInt6525 = arg1.method4393();
		} else if (arg0 == 1) {
			this.anInt6517 = arg1.method4393();
		} else if (arg0 == 2) {
			this.anInt6523 = arg1.method4426();
		} else if (arg0 == 3) {
			this.anInt6516 = arg1.method4393();
		} else if (arg0 == 4) {
			this.anInt6524 = arg1.method4393();
		} else if (arg0 == 5) {
			this.anInt6518 = arg1.method4393();
		} else if (arg0 == 6) {
			this.anInt6525 = arg1.method4393();
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)V")
	private void method5387() {
		@Pc(16) Random local16 = new Random((long) this.anInt6517);
		this.aShortArray77 = new short[512];
		if (this.anInt6523 > 0) {
			for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
				this.aShortArray77[local28] = (short) Static521.method7113(this.anInt6523, local16);
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
	@Override
	public void method7885() {
		this.aByteArray71 = Static237.method3851(this.anInt6517);
		this.method5387();
	}
}
