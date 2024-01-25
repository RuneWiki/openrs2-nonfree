import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class14_Sub7_Sub23 extends Class14_Sub7 {

	@OriginalMember(owner = "client!laa", name = "Z", descriptor = "[B")
	public static final byte[] aByteArray67 = new byte[32896];

	@OriginalMember(owner = "client!laa", name = "M", descriptor = "I")
	private int anInt5710 = 12288;

	@OriginalMember(owner = "client!laa", name = "T", descriptor = "I")
	private int anInt5711 = 2048;

	@OriginalMember(owner = "client!laa", name = "Q", descriptor = "I")
	private int anInt5709 = 4096;

	@OriginalMember(owner = "client!laa", name = "R", descriptor = "I")
	private int anInt5714 = 2048;

	@OriginalMember(owner = "client!laa", name = "K", descriptor = "I")
	private int anInt5716 = 0;

	@OriginalMember(owner = "client!laa", name = "ab", descriptor = "I")
	private int anInt5718 = 0;

	@OriginalMember(owner = "client!laa", name = "N", descriptor = "I")
	private int anInt5722 = 8192;

	static {
		@Pc(121) int local121 = 0;
		for (@Pc(123) int local123 = 0; local123 < 256; local123++) {
			for (@Pc(126) int local126 = 0; local126 <= local123; local126++) {
				aByteArray67[local121++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local123 * local123 + local126 * local126 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt5714 = arg1.method7717(-1978450544);
		} else if (arg0 == 1) {
			this.anInt5716 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			this.anInt5718 = arg1.method7717(-1978450544);
		} else if (arg0 == 3) {
			this.anInt5711 = arg1.method7717(-1978450544);
		} else if (arg0 == 4) {
			this.anInt5710 = arg1.method7717(-1978450544);
		} else if (arg0 == 5) {
			this.anInt5709 = arg1.method7717(-1978450544);
		} else if (arg0 == 6) {
			this.anInt5722 = arg1.method7717(-1978450544);
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method9382(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1817(arg0);
		if (super.aClass83_41.aBoolean135) {
			@Pc(27) int local27 = Static655.anIntArray573[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static613.anInt10114; local29++) {
				@Pc(37) int local37 = Static588.anIntArray506[local29] - 2048;
				@Pc(42) int local42 = this.anInt5714 + local37;
				@Pc(54) int local54 = local42 < -2048 ? local42 + 4096 : local42;
				@Pc(66) int local66 = local54 <= 2048 ? local54 : local54 - 4096;
				@Pc(71) int local71 = local27 + this.anInt5716;
				@Pc(81) int local81 = local71 >= -2048 ? local71 : local71 + 4096;
				@Pc(91) int local91 = local81 <= 2048 ? local81 : local81 - 4096;
				@Pc(96) int local96 = local37 + this.anInt5718;
				@Pc(106) int local106 = local96 < -2048 ? local96 + 4096 : local96;
				@Pc(116) int local116 = local106 <= 2048 ? local106 : local106 - 4096;
				@Pc(121) int local121 = local27 + this.anInt5711;
				@Pc(131) int local131 = local121 < -2048 ? local121 + 4096 : local121;
				@Pc(143) int local143 = local131 > 2048 ? local131 - 4096 : local131;
				local11[local29] = this.method5148(local91, local66) || this.method5149(local116, local143) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!laa", name = "e", descriptor = "(I)V")
	@Override
	public void method9386() {
		Static678.method9367();
	}

	@OriginalMember(owner = "client!laa", name = "b", descriptor = "(III)Z")
	private boolean method5148(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = (arg0 - arg1) * this.anInt5710 >> 12;
		@Pc(29) int local29 = Static79.anIntArray75[local19 * 255 >> 12 & 0xFF];
		@Pc(36) int local36 = (local29 << 12) / this.anInt5710;
		@Pc(43) int local43 = (local36 << 12) / this.anInt5722;
		@Pc(50) int local50 = this.anInt5709 * local43 >> 12;
		return local50 > arg0 + arg1 && arg0 + arg1 > -local50;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIZ)Z")
	private boolean method5149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg1 + arg0) * this.anInt5710 >> 12;
		@Pc(30) int local30 = Static79.anIntArray75[local12 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt5710;
		@Pc(44) int local44 = (local37 << 12) / this.anInt5722;
		@Pc(51) int local51 = local44 * this.anInt5709 >> 12;
		return local51 > arg1 - arg0 && -local51 < arg1 - arg0;
	}
}
