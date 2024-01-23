import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cb", name = "Q", descriptor = "[B")
	private byte[] aByteArray18 = new byte[512];

	@OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
	private int anInt889 = 2;

	@OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
	private int anInt893 = 5;

	@OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
	private int anInt892 = 0;

	@OriginalMember(owner = "client!cb", name = "U", descriptor = "[S")
	private short[] aShortArray19 = new short[512];

	@OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
	private int anInt898 = 5;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
	private int anInt900 = 2048;

	@OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
	private int anInt903 = 1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			@Pc(33) int local33 = Static94.anIntArray321[arg0] * this.anInt893 + 2048;
			@Pc(37) int local37 = local33 >> 12;
			@Pc(41) int local41 = local37 + 1;
			for (@Pc(43) int local43 = 0; local43 < Static110.anInt2934; local43++) {
				Static33.anInt5176 = Integer.MAX_VALUE;
				Static111.anInt2939 = Integer.MAX_VALUE;
				Static234.anInt5114 = Integer.MAX_VALUE;
				Static44.anInt1341 = Integer.MAX_VALUE;
				@Pc(62) int local62 = Static175.anIntArray302[local43] * this.anInt898 + 2048;
				@Pc(66) int local66 = local62 >> 12;
				@Pc(70) int local70 = local66 + 1;
				@Pc(155) int local155;
				for (@Pc(74) int local74 = local37 - 1; local74 <= local41; local74++) {
					@Pc(99) int local99 = this.aByteArray18[(this.anInt893 > local74 ? local74 : local74 - this.anInt893) & 0xFF] & 0xFF;
					for (@Pc(103) int local103 = local66 - 1; local103 <= local70; local103++) {
						@Pc(128) int local128 = (this.aByteArray18[(local103 < this.anInt898 ? local103 : local103 - this.anInt898) + local99 & 0xFF] & 0xFF) * 2;
						@Pc(132) int local132 = local103 << 12;
						@Pc(136) int local136 = local128 + 1;
						@Pc(140) int local140 = local62 - local132 - this.aShortArray19[local128];
						@Pc(152) int local152 = local33 - this.aShortArray19[local136] - (local74 << 12);
						local155 = this.anInt903;
						@Pc(186) int local186;
						if (local155 == 1) {
							local186 = local140 * local140 + local152 * local152 >> 12;
						} else if (local155 == 3) {
							local140 = local140 >= 0 ? local140 : -local140;
							local152 = local152 < 0 ? -local152 : local152;
							local186 = local140 <= local152 ? local152 : local140;
						} else if (local155 == 4) {
							local140 = (int) (Math.sqrt((double) ((float) (local140 < 0 ? -local140 : local140) / 4096.0F)) * 4096.0D);
							local152 = (int) (Math.sqrt((double) ((float) (local152 < 0 ? -local152 : local152) / 4096.0F)) * 4096.0D);
							local186 = local140 + local152;
							local186 = local186 * local186 >> 12;
						} else if (local155 == 5) {
							local152 *= local152;
							local140 *= local140;
							local186 = (int) (Math.sqrt(Math.sqrt((double) ((float) (local152 + local140) / 1.6777216E7F))) * 4096.0D);
						} else if (local155 == 2) {
							local186 = (local140 >= 0 ? local140 : -local140) + (local152 >= 0 ? local152 : -local152);
						} else {
							local186 = (int) (Math.sqrt((double) ((float) (local140 * local140 + local152 * local152) / 1.6777216E7F)) * 4096.0D);
						}
						if (Static44.anInt1341 > local186) {
							Static33.anInt5176 = Static111.anInt2939;
							Static111.anInt2939 = Static234.anInt5114;
							Static234.anInt5114 = Static44.anInt1341;
							Static44.anInt1341 = local186;
						} else if (local186 < Static234.anInt5114) {
							Static33.anInt5176 = Static111.anInt2939;
							Static111.anInt2939 = Static234.anInt5114;
							Static234.anInt5114 = local186;
						} else if (local186 < Static111.anInt2939) {
							Static33.anInt5176 = Static111.anInt2939;
							Static111.anInt2939 = local186;
						} else if (local186 < Static33.anInt5176) {
							Static33.anInt5176 = local186;
						}
					}
				}
				local155 = this.anInt889;
				if (local155 == 0) {
					local19[local43] = Static44.anInt1341;
				} else if (local155 == 1) {
					local19[local43] = Static234.anInt5114;
				} else if (local155 == 3) {
					local19[local43] = Static111.anInt2939;
				} else if (local155 == 4) {
					local19[local43] = Static33.anInt5176;
				} else if (local155 == 2) {
					local19[local43] = Static234.anInt5114 - Static44.anInt1341;
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V")
	private void method578() {
		@Pc(8) Random local8 = new Random((long) this.anInt892);
		this.aShortArray19 = new short[512];
		if (this.anInt900 > 0) {
			for (@Pc(24) int local24 = 0; local24 < 512; local24++) {
				this.aShortArray19[local24] = (short) Static205.method3438(this.anInt900, local8);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
	@Override
	public void method4118() {
		this.aByteArray18 = Static153.method2742(this.anInt892);
		this.method578();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt898 = this.anInt893 = arg0.method1772();
		} else if (arg1 == 1) {
			this.anInt892 = arg0.method1772();
		} else if (arg1 == 2) {
			this.anInt900 = arg0.method1764();
		} else if (arg1 == 3) {
			this.anInt889 = arg0.method1772();
		} else if (arg1 == 4) {
			this.anInt903 = arg0.method1772();
		} else if (arg1 == 5) {
			this.anInt898 = arg0.method1772();
		} else if (arg1 == 6) {
			this.anInt893 = arg0.method1772();
		}
	}
}
