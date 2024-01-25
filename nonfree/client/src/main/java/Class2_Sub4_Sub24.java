import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class2_Sub4_Sub24 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ll", name = "E", descriptor = "[[I")
	private int[][] anIntArrayArray61;

	@OriginalMember(owner = "client!ll", name = "K", descriptor = "I")
	private int anInt5765;

	@OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
	private int anInt5766;

	@OriginalMember(owner = "client!ll", name = "S", descriptor = "I")
	private int anInt5771;

	@OriginalMember(owner = "client!ll", name = "V", descriptor = "[I")
	private int[] anIntArray372;

	@OriginalMember(owner = "client!ll", name = "Z", descriptor = "[[I")
	private int[][] anIntArrayArray62;

	@OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
	private int anInt5760 = 81;

	@OriginalMember(owner = "client!ll", name = "O", descriptor = "I")
	private int anInt5768 = 4;

	@OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
	private int anInt5761 = 1024;

	@OriginalMember(owner = "client!ll", name = "N", descriptor = "I")
	private int anInt5767 = 0;

	@OriginalMember(owner = "client!ll", name = "W", descriptor = "I")
	private int anInt5774 = 409;

	@OriginalMember(owner = "client!ll", name = "X", descriptor = "I")
	private int anInt5775 = 8;

	@OriginalMember(owner = "client!ll", name = "T", descriptor = "I")
	private int anInt5772 = 1024;

	@OriginalMember(owner = "client!ll", name = "U", descriptor = "I")
	private int anInt5773 = 204;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
		this.method5016();
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt5767 + Static415.anIntArray482[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (local17 < this.anInt5775 && local24 >= this.anIntArray372[local17]) {
				local17++;
			}
			@Pc(58) int local58 = local17 - 1;
			@Pc(66) boolean local66 = (local17 & 0x1) == 0;
			@Pc(71) int local71 = this.anIntArray372[local17];
			@Pc(78) int local78 = this.anIntArray372[local17 - 1];
			if (this.anInt5766 + local78 < local24 && local24 < local71 - this.anInt5766) {
				for (@Pc(97) int local97 = 0; local97 < Static395.anInt6816; local97++) {
					@Pc(108) int local108 = local66 ? this.anInt5772 : -this.anInt5772;
					@Pc(110) int local110 = 0;
					@Pc(121) int local121;
					for (local121 = Static20.anIntArray40[local97] + (local108 * this.anInt5771 >> 12); local121 < 0; local121 += 4096) {
					}
					while (local121 > 4096) {
						local121 -= 4096;
					}
					while (this.anInt5768 > local110 && this.anIntArrayArray62[local58][local110] <= local121) {
						local110++;
					}
					@Pc(153) int local153 = local110 - 1;
					@Pc(160) int local160 = this.anIntArrayArray62[local58][local153];
					@Pc(167) int local167 = this.anIntArrayArray62[local58][local110];
					if (local121 > local160 + this.anInt5766 && local121 < local167 - this.anInt5766) {
						local11[local97] = this.anIntArrayArray61[local58][local153];
					} else {
						local11[local97] = 0;
					}
				}
			} else {
				Static650.method2272(local11, 0, Static395.anInt6816, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "(I)V")
	private void method5016() {
		@Pc(12) Random local12 = new Random((long) this.anInt5775);
		this.anInt5766 = this.anInt5760 / 2;
		this.anInt5765 = 4096 / this.anInt5775;
		this.anInt5771 = 4096 / this.anInt5768;
		@Pc(39) int local39 = this.anInt5771 / 2;
		this.anIntArrayArray62 = new int[this.anInt5775][this.anInt5768 + 1];
		this.anIntArrayArray61 = new int[this.anInt5775][this.anInt5768];
		this.anIntArray372 = new int[this.anInt5775 + 1];
		@Pc(67) int local67 = this.anInt5765 / 2;
		this.anIntArray372[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt5775; local74++) {
			@Pc(81) int local81;
			@Pc(93) int local93;
			if (local74 > 0) {
				local81 = this.anInt5765;
				local93 = (Static142.method2572(4096, local12) - 2048) * this.anInt5773 >> 12;
				@Pc(101) int local101 = local81 + (local93 * local67 >> 12);
				this.anIntArray372[local74] = local101 + this.anIntArray372[local74 - 1];
			}
			this.anIntArrayArray62[local74][0] = 0;
			for (local81 = 0; local81 < this.anInt5768; local81++) {
				if (local81 > 0) {
					local93 = this.anInt5771;
					@Pc(143) int local143 = (Static142.method2572(4096, local12) - 2048) * this.anInt5774 >> 12;
					local93 += local143 * local39 >> 12;
					this.anIntArrayArray62[local74][local81] = local93 + this.anIntArrayArray62[local74][local81 - 1];
				}
				this.anIntArrayArray61[local74][local81] = this.anInt5761 <= 0 ? 4096 : 4096 - Static142.method2572(this.anInt5761, local12);
			}
			this.anIntArrayArray62[local74][this.anInt5768] = 4096;
		}
		this.anIntArray372[this.anInt5775] = 4096;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5768 = arg0.method2859();
		} else if (arg1 == 1) {
			this.anInt5775 = arg0.method2859();
		} else if (arg1 == 2) {
			this.anInt5774 = arg0.method2825();
		} else if (arg1 == 3) {
			this.anInt5773 = arg0.method2825();
		} else if (arg1 == 4) {
			this.anInt5772 = arg0.method2825();
		} else if (arg1 == 5) {
			this.anInt5767 = arg0.method2825();
		} else if (arg1 == 6) {
			this.anInt5760 = arg0.method2825();
		} else if (arg1 == 7) {
			this.anInt5761 = arg0.method2825();
		}
	}
}
