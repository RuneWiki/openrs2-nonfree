import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hja")
public final class Class3_Sub9_Sub18 extends Class3_Sub9 {

	@OriginalMember(owner = "client!hja", name = "K", descriptor = "I")
	private int anInt4231 = 0;

	@OriginalMember(owner = "client!hja", name = "F", descriptor = "I")
	private int anInt4226 = 5;

	@OriginalMember(owner = "client!hja", name = "I", descriptor = "I")
	private int anInt4229 = 5;

	@OriginalMember(owner = "client!hja", name = "D", descriptor = "[S")
	private short[] aShortArray64 = new short[512];

	@OriginalMember(owner = "client!hja", name = "L", descriptor = "I")
	private int anInt4232 = 2;

	@OriginalMember(owner = "client!hja", name = "O", descriptor = "I")
	private int anInt4233 = 2048;

	@OriginalMember(owner = "client!hja", name = "E", descriptor = "I")
	private int anInt4225 = 1;

	@OriginalMember(owner = "client!hja", name = "M", descriptor = "[B")
	private byte[] aByteArray40 = new byte[512];

	@OriginalMember(owner = "client!hja", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hja", name = "e", descriptor = "(B)V")
	private void method3855() {
		@Pc(18) Random local18 = new Random((long) this.anInt4231);
		this.aShortArray64 = new short[512];
		if (this.anInt4233 > 0) {
			for (@Pc(27) int local27 = 0; local27 < 512; local27++) {
				this.aShortArray64[local27] = (short) Static371.method5392(local18, this.anInt4233);
			}
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(Z)V")
	@Override
	public void method9163() {
		this.aByteArray40 = Static324.method4964(this.anInt4231);
		this.method3855();
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4229 = this.anInt4226 = arg0.method8632();
		} else if (arg1 == 1) {
			this.anInt4231 = arg0.method8632();
		} else if (arg1 == 2) {
			this.anInt4233 = arg0.method8593();
		} else if (arg1 == 3) {
			this.anInt4232 = arg0.method8632();
		} else if (arg1 == 4) {
			this.anInt4225 = arg0.method8632();
		} else if (arg1 == 5) {
			this.anInt4229 = arg0.method8632();
		} else if (arg1 == 6) {
			this.anInt4226 = arg0.method8632();
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			@Pc(29) int local29 = this.anInt4226 * Static147.anIntArray259[arg0] + 2048;
			@Pc(33) int local33 = local29 >> 12;
			@Pc(37) int local37 = local33 + 1;
			for (@Pc(39) int local39 = 0; local39 < Static62.anInt1251; local39++) {
				Static207.anInt4005 = Integer.MAX_VALUE;
				Static66.anInt1295 = Integer.MAX_VALUE;
				Static390.anInt10740 = Integer.MAX_VALUE;
				Static130.anInt2660 = Integer.MAX_VALUE;
				@Pc(58) int local58 = Static239.anIntArray394[local39] * this.anInt4229 + 2048;
				@Pc(62) int local62 = local58 >> 12;
				@Pc(66) int local66 = local62 + 1;
				@Pc(152) int local152;
				for (@Pc(70) int local70 = local33 - 1; local70 <= local37; local70++) {
					@Pc(91) int local91 = this.aByteArray40[(this.anInt4226 <= local70 ? local70 - this.anInt4226 : local70) & 0xFF] & 0xFF;
					for (@Pc(95) int local95 = local62 - 1; local95 <= local66; local95++) {
						@Pc(123) int local123 = (this.aByteArray40[(local95 >= this.anInt4229 ? local95 - this.anInt4229 : local95) + local91 & 0xFF] & 0xFF) * 2;
						@Pc(129) int local129 = local58 - (local95 << 12);
						@Pc(133) int local133 = local123 + 1;
						@Pc(137) int local137 = local129 - this.aShortArray64[local123];
						@Pc(149) int local149 = local29 - this.aShortArray64[local133] - (local70 << 12);
						local152 = this.anInt4225;
						@Pc(189) int local189;
						if (local152 == 1) {
							local189 = local149 * local149 + local137 * local137 >> 12;
						} else if (local152 == 3) {
							local149 = local149 >= 0 ? local149 : -local149;
							local137 = local137 >= 0 ? local137 : -local137;
							local189 = local149 >= local137 ? local149 : local137;
						} else if (local152 == 4) {
							local137 = (int) (Math.sqrt((double) ((float) (local137 >= 0 ? local137 : -local137) / 4096.0F)) * 4096.0D);
							local149 = (int) (Math.sqrt((double) ((float) (local149 >= 0 ? local149 : -local149) / 4096.0F)) * 4096.0D);
							local189 = local149 + local137;
							local189 = local189 * local189 >> 12;
						} else if (local152 == 5) {
							local149 *= local149;
							local137 *= local137;
							local189 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local137 + local149) / 1.6777216E7F))) * 4096.0D);
						} else if (local152 == 2) {
							local189 = (local149 >= 0 ? local149 : -local149) + (local137 < 0 ? -local137 : local137);
						} else {
							local189 = (int) (Math.sqrt((double) ((float) (local137 * local137 + local149 * local149) / 1.6777216E7F)) * 4096.0D);
						}
						if (local189 < Static130.anInt2660) {
							Static207.anInt4005 = Static66.anInt1295;
							Static66.anInt1295 = Static390.anInt10740;
							Static390.anInt10740 = Static130.anInt2660;
							Static130.anInt2660 = local189;
						} else if (local189 < Static390.anInt10740) {
							Static207.anInt4005 = Static66.anInt1295;
							Static66.anInt1295 = Static390.anInt10740;
							Static390.anInt10740 = local189;
						} else if (local189 < Static66.anInt1295) {
							Static207.anInt4005 = Static66.anInt1295;
							Static66.anInt1295 = local189;
						} else if (Static207.anInt4005 > local189) {
							Static207.anInt4005 = local189;
						}
					}
				}
				local152 = this.anInt4232;
				if (local152 == 0) {
					local11[local39] = Static130.anInt2660;
				} else if (local152 == 1) {
					local11[local39] = Static390.anInt10740;
				} else if (local152 == 3) {
					local11[local39] = Static66.anInt1295;
				} else if (local152 == 4) {
					local11[local39] = Static207.anInt4005;
				} else if (local152 == 2) {
					local11[local39] = Static390.anInt10740 - Static130.anInt2660;
				}
			}
		}
		return local11;
	}
}
