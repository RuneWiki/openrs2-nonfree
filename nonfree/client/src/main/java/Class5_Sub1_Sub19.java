import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class5_Sub1_Sub19 extends Class5_Sub1 {

	@OriginalMember(owner = "client!jf", name = "S", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
	private int anInt1936;

	@OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
	private int anInt1942;

	@OriginalMember(owner = "client!jf", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!jf", name = "gb", descriptor = "I")
	private int anInt1945;

	@OriginalMember(owner = "client!jf", name = "hb", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
	private int anInt1930 = 1024;

	@OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
	private int anInt1937 = 409;

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
	private int anInt1935 = 81;

	@OriginalMember(owner = "client!jf", name = "ib", descriptor = "I")
	private int anInt1946 = 204;

	@OriginalMember(owner = "client!jf", name = "db", descriptor = "I")
	private int anInt1944 = 0;

	@OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
	private int anInt1940 = 4;

	@OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
	private int anInt1943 = 8;

	@OriginalMember(owner = "client!jf", name = "lb", descriptor = "I")
	private int anInt1948 = 1024;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass101_41.method2886(arg0);
		if (super.aClass101_41.aBoolean174) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static147.anIntArray321[arg0] + this.anInt1944; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt1943 > local22 && this.anIntArray189[local22] <= local29) {
				local22++;
			}
			@Pc(66) int local66 = local22 - 1;
			@Pc(71) int local71 = this.anIntArray189[local22];
			@Pc(79) boolean local79 = (local22 & 0x1) == 0;
			@Pc(86) int local86 = this.anIntArray189[local22 - 1];
			if (local29 > this.anInt1945 + local86 && local29 < local71 - this.anInt1945) {
				for (@Pc(105) int local105 = 0; local105 < Static174.anInt3489; local105++) {
					@Pc(109) int local109 = 0;
					@Pc(118) int local118 = local79 ? this.anInt1948 : -this.anInt1948;
					@Pc(130) int local130;
					for (local130 = Static117.anIntArray274[local105] + (this.anInt1942 * local118 >> 12); local130 < 0; local130 += 4096) {
					}
					while (local130 > 4096) {
						local130 -= 4096;
					}
					while (local109 < this.anInt1940 && local130 >= this.anIntArrayArray17[local66][local109]) {
						local109++;
					}
					@Pc(169) int local169 = this.anIntArrayArray17[local66][local109];
					@Pc(173) int local173 = local109 - 1;
					@Pc(180) int local180 = this.anIntArrayArray17[local66][local173];
					if (local130 > this.anInt1945 + local180 && local169 - this.anInt1945 > local130) {
						local12[local105] = this.anIntArrayArray16[local66][local173];
					} else {
						local12[local105] = 0;
					}
				}
			} else {
				Static220.method48(local12, 0, Static174.anInt3489, 0);
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
	@Override
	public void method3200() {
		this.method1502();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1940 = arg0.method3062();
		} else if (arg1 == 1) {
			this.anInt1943 = arg0.method3062();
		} else if (arg1 == 2) {
			this.anInt1937 = arg0.method3077();
		} else if (arg1 == 3) {
			this.anInt1946 = arg0.method3077();
		} else if (arg1 == 4) {
			this.anInt1948 = arg0.method3077();
		} else if (arg1 == 5) {
			this.anInt1944 = arg0.method3077();
		} else if (arg1 == 6) {
			this.anInt1935 = arg0.method3077();
		} else if (arg1 == 7) {
			this.anInt1930 = arg0.method3077();
		}
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(B)V")
	private void method1502() {
		@Pc(8) Random local8 = new Random((long) this.anInt1943);
		this.anInt1945 = this.anInt1935 / 2;
		this.anInt1942 = 4096 / this.anInt1940;
		this.anIntArray189 = new int[this.anInt1943 + 1];
		this.anIntArray189[0] = 0;
		this.anIntArrayArray17 = new int[this.anInt1943][this.anInt1940 + 1];
		this.anInt1936 = 4096 / this.anInt1943;
		@Pc(56) int local56 = this.anInt1936 / 2;
		@Pc(61) int local61 = this.anInt1942 / 2;
		this.anIntArrayArray16 = new int[this.anInt1943][this.anInt1940];
		for (@Pc(74) int local74 = 0; local74 < this.anInt1943; local74++) {
			@Pc(81) int local81;
			@Pc(93) int local93;
			if (local74 > 0) {
				local81 = this.anInt1936;
				local93 = (Static85.method1454(local8, 4096) - 2048) * this.anInt1946 >> 12;
				@Pc(101) int local101 = local81 + (local56 * local93 >> 12);
				this.anIntArray189[local74] = local101 + this.anIntArray189[local74 - 1];
			}
			this.anIntArrayArray17[local74][0] = 0;
			for (local81 = 0; local81 < this.anInt1940; local81++) {
				if (local81 > 0) {
					local93 = this.anInt1942;
					@Pc(143) int local143 = (Static85.method1454(local8, 4096) - 2048) * this.anInt1937 >> 12;
					local93 += local61 * local143 >> 12;
					this.anIntArrayArray17[local74][local81] = this.anIntArrayArray17[local74][local81 - 1] + local93;
				}
				this.anIntArrayArray16[local74][local81] = this.anInt1930 <= 0 ? 4096 : 4096 - Static85.method1454(local8, this.anInt1930);
			}
			this.anIntArrayArray17[local74][this.anInt1940] = 4096;
		}
		this.anIntArray189[this.anInt1943] = 4096;
	}
}
