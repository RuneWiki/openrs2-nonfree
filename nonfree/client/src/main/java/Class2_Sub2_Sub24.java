import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class2_Sub2_Sub24 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
	private int anInt5329;

	@OriginalMember(owner = "client!pc", name = "N", descriptor = "[I")
	private int[] anIntArray432;

	@OriginalMember(owner = "client!pc", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
	private int anInt5336;

	@OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
	private int anInt5337;

	@OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
	private int anInt5325 = 1024;

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
	private int anInt5324 = 409;

	@OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
	private int anInt5327 = 1024;

	@OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
	private int anInt5332 = 81;

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
	private int anInt5330 = 8;

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
	private int anInt5333 = 204;

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
	private int anInt5338 = 4;

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
	private int anInt5340 = 0;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!si;II)V")
	@Override
	public void method5838(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5338 = arg0.method5495();
		} else if (arg1 == 1) {
			this.anInt5330 = arg0.method5495();
		} else if (arg1 == 2) {
			this.anInt5324 = arg0.method5500();
		} else if (arg1 == 3) {
			this.anInt5333 = arg0.method5500();
		} else if (arg1 == 4) {
			this.anInt5325 = arg0.method5500();
		} else if (arg1 == 5) {
			this.anInt5340 = arg0.method5500();
		} else if (arg1 == 6) {
			this.anInt5332 = arg0.method5500();
		} else if (arg1 == 7) {
			this.anInt5327 = arg0.method5500();
		}
	}

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)[I")
	@Override
	public int[] method5849(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass82_41.method2034(arg0);
		if (super.aClass82_41.aBoolean199) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt5340 + Static318.anIntArray565[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (local23 < this.anInt5330 && local30 >= this.anIntArray432[local23]) {
				local23++;
			}
			@Pc(64) int local64 = local23 - 1;
			@Pc(72) boolean local72 = (local23 & 0x1) == 0;
			@Pc(77) int local77 = this.anIntArray432[local23];
			@Pc(84) int local84 = this.anIntArray432[local23 - 1];
			if (local30 > this.anInt5337 + local84 && local77 - this.anInt5337 > local30) {
				for (@Pc(110) int local110 = 0; local110 < Static429.anInt6518; local110++) {
					@Pc(114) int local114 = 0;
					@Pc(123) int local123 = local72 ? this.anInt5325 : -this.anInt5325;
					@Pc(134) int local134;
					for (local134 = (this.anInt5329 * local123 >> 12) + Static365.anIntArray535[local110]; local134 < 0; local134 += 4096) {
					}
					while (local134 > 4096) {
						local134 -= 4096;
					}
					while (this.anInt5338 > local114 && local134 >= this.anIntArrayArray52[local64][local114]) {
						local114++;
					}
					@Pc(164) int local164 = local114 - 1;
					@Pc(171) int local171 = this.anIntArrayArray52[local64][local114];
					@Pc(178) int local178 = this.anIntArrayArray52[local64][local164];
					if (local134 > this.anInt5337 + local178 && local134 < local171 - this.anInt5337) {
						local11[local110] = this.anIntArrayArray53[local64][local164];
					} else {
						local11[local110] = 0;
					}
				}
			} else {
				Static457.method686(local11, 0, Static429.anInt6518, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
	@Override
	public void method5845() {
		this.method4277();
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	private void method4277() {
		@Pc(12) Random local12 = new Random((long) this.anInt5330);
		this.anInt5329 = 4096 / this.anInt5338;
		this.anInt5336 = 4096 / this.anInt5330;
		this.anInt5337 = this.anInt5332 / 2;
		@Pc(35) int local35 = this.anInt5329 / 2;
		this.anIntArrayArray52 = new int[this.anInt5330][this.anInt5338 + 1];
		@Pc(49) int local49 = this.anInt5336 / 2;
		this.anIntArray432 = new int[this.anInt5330 + 1];
		this.anIntArrayArray53 = new int[this.anInt5330][this.anInt5338];
		this.anIntArray432[0] = 0;
		for (@Pc(76) int local76 = 0; local76 < this.anInt5330; local76++) {
			@Pc(83) int local83;
			@Pc(97) int local97;
			if (local76 > 0) {
				local83 = this.anInt5336;
				local97 = (Static149.method2451(4096, local12) - 2048) * this.anInt5333 >> 12;
				@Pc(105) int local105 = local83 + (local49 * local97 >> 12);
				this.anIntArray432[local76] = local105 + this.anIntArray432[local76 - 1];
			}
			this.anIntArrayArray52[local76][0] = 0;
			for (local83 = 0; local83 < this.anInt5338; local83++) {
				if (local83 > 0) {
					local97 = this.anInt5329;
					@Pc(148) int local148 = (Static149.method2451(4096, local12) - 2048) * this.anInt5324 >> 12;
					local97 += local35 * local148 >> 12;
					this.anIntArrayArray52[local76][local83] = this.anIntArrayArray52[local76][local83 - 1] + local97;
				}
				this.anIntArrayArray53[local76][local83] = this.anInt5327 <= 0 ? 4096 : 4096 - Static149.method2451(this.anInt5327, local12);
			}
			this.anIntArrayArray52[local76][this.anInt5338] = 4096;
		}
		this.anIntArray432[this.anInt5330] = 4096;
	}
}
