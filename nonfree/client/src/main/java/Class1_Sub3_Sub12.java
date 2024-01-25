import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 {

	@OriginalMember(owner = "client!em", name = "E", descriptor = "I")
	private int anInt2602 = 1;

	@OriginalMember(owner = "client!em", name = "F", descriptor = "[B")
	private byte[] aByteArray28 = new byte[512];

	@OriginalMember(owner = "client!em", name = "D", descriptor = "I")
	private int anInt2601 = 2048;

	@OriginalMember(owner = "client!em", name = "C", descriptor = "I")
	private int anInt2600 = 0;

	@OriginalMember(owner = "client!em", name = "L", descriptor = "[S")
	private short[] aShortArray35 = new short[512];

	@OriginalMember(owner = "client!em", name = "M", descriptor = "I")
	private int anInt2608 = 5;

	@OriginalMember(owner = "client!em", name = "I", descriptor = "I")
	private int anInt2605 = 5;

	@OriginalMember(owner = "client!em", name = "K", descriptor = "I")
	private int anInt2607 = 2;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!em", name = "h", descriptor = "(I)V")
	private void method2438() {
		@Pc(12) Random local12 = new Random((long) this.anInt2600);
		this.aShortArray35 = new short[512];
		if (this.anInt2601 > 0) {
			for (@Pc(22) int local22 = 0; local22 < 512; local22++) {
				this.aShortArray35[local22] = (short) Static499.method7152(this.anInt2601, local12);
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "g", descriptor = "(I)V")
	@Override
	public void method7912() {
		this.aByteArray28 = Static320.method5237(this.anInt2600);
		this.method2438();
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2608 = this.anInt2605 = arg0.method3043();
		} else if (arg1 == 1) {
			this.anInt2600 = arg0.method3043();
		} else if (arg1 == 2) {
			this.anInt2601 = arg0.method3056();
		} else if (arg1 == 3) {
			this.anInt2607 = arg0.method3043();
		} else if (arg1 == 4) {
			this.anInt2602 = arg0.method3043();
		} else if (arg1 == 5) {
			this.anInt2608 = arg0.method3043();
		} else if (arg1 == 6) {
			this.anInt2605 = arg0.method3043();
		}
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			@Pc(33) int local33 = Static305.anIntArray416[arg0] * this.anInt2605 + 2048;
			@Pc(37) int local37 = local33 >> 12;
			@Pc(41) int local41 = local37 + 1;
			for (@Pc(43) int local43 = 0; local43 < Static236.anInt4609; local43++) {
				Static180.anInt3882 = Integer.MAX_VALUE;
				Static212.anInt4406 = Integer.MAX_VALUE;
				Static243.anInt4683 = Integer.MAX_VALUE;
				Static301.anInt5831 = Integer.MAX_VALUE;
				@Pc(62) int local62 = this.anInt2608 * Static201.anIntArray324[local43] + 2048;
				@Pc(66) int local66 = local62 >> 12;
				@Pc(70) int local70 = local66 + 1;
				@Pc(159) int local159;
				for (@Pc(74) int local74 = local37 - 1; local74 <= local41; local74++) {
					@Pc(98) int local98 = this.aByteArray28[(local74 < this.anInt2605 ? local74 : local74 - this.anInt2605) & 0xFF] & 0xFF;
					for (@Pc(102) int local102 = local66 - 1; local102 <= local70; local102++) {
						@Pc(131) int local131 = (this.aByteArray28[local98 + (this.anInt2608 > local102 ? local102 : local102 - this.anInt2608) & 0xFF] & 0xFF) * 2;
						@Pc(136) int local136 = local62 - (local102 << 12);
						@Pc(140) int local140 = local131 + 1;
						@Pc(143) int local143 = local136 - this.aShortArray35[local131];
						@Pc(156) int local156 = local33 - this.aShortArray35[local140] - (local74 << 12);
						local159 = this.anInt2602;
						@Pc(194) int local194;
						if (local159 == 1) {
							local194 = local143 * local143 + local156 * local156 >> 12;
						} else if (local159 == 3) {
							local156 = local156 >= 0 ? local156 : -local156;
							local143 = local143 < 0 ? -local143 : local143;
							local194 = local156 < local143 ? local143 : local156;
						} else if (local159 == 4) {
							local143 = (int) (Math.sqrt((double) ((float) (local143 < 0 ? -local143 : local143) / 4096.0F)) * 4096.0D);
							local156 = (int) (Math.sqrt((double) ((float) (local156 >= 0 ? local156 : -local156) / 4096.0F)) * 4096.0D);
							local194 = local156 + local143;
							local194 = local194 * local194 >> 12;
						} else if (local159 == 5) {
							local143 *= local143;
							local156 *= local156;
							local194 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local156 + local143) / 1.6777216E7F))) * 4096.0D);
						} else if (local159 == 2) {
							local194 = (local156 < 0 ? -local156 : local156) + (local143 < 0 ? -local143 : local143);
						} else {
							local194 = (int) (Math.sqrt((double) ((float) (local156 * local156 + local143 * local143) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static301.anInt5831 > local194) {
							Static180.anInt3882 = Static212.anInt4406;
							Static212.anInt4406 = Static243.anInt4683;
							Static243.anInt4683 = Static301.anInt5831;
							Static301.anInt5831 = local194;
						} else if (local194 < Static243.anInt4683) {
							Static180.anInt3882 = Static212.anInt4406;
							Static212.anInt4406 = Static243.anInt4683;
							Static243.anInt4683 = local194;
						} else if (local194 < Static212.anInt4406) {
							Static180.anInt3882 = Static212.anInt4406;
							Static212.anInt4406 = local194;
						} else if (Static180.anInt3882 > local194) {
							Static180.anInt3882 = local194;
						}
					}
				}
				local159 = this.anInt2607;
				if (local159 == 0) {
					local19[local43] = Static301.anInt5831;
				} else if (local159 == 1) {
					local19[local43] = Static243.anInt4683;
				} else if (local159 == 3) {
					local19[local43] = Static212.anInt4406;
				} else if (local159 == 4) {
					local19[local43] = Static180.anInt3882;
				} else if (local159 == 2) {
					local19[local43] = Static243.anInt4683 - Static301.anInt5831;
				}
			}
		}
		return local19;
	}
}
