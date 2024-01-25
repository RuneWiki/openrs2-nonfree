import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!es", name = "K", descriptor = "I")
	private int anInt1943;

	@OriginalMember(owner = "client!es", name = "O", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!es", name = "P", descriptor = "I")
	private int anInt1947;

	@OriginalMember(owner = "client!es", name = "W", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!es", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!es", name = "fb", descriptor = "I")
	private int anInt1958;

	@OriginalMember(owner = "client!es", name = "U", descriptor = "I")
	private int anInt1951 = 1024;

	@OriginalMember(owner = "client!es", name = "Q", descriptor = "I")
	private int anInt1948 = 4;

	@OriginalMember(owner = "client!es", name = "N", descriptor = "I")
	private int anInt1946 = 8;

	@OriginalMember(owner = "client!es", name = "S", descriptor = "I")
	private int anInt1950 = 1024;

	@OriginalMember(owner = "client!es", name = "R", descriptor = "I")
	private int anInt1949 = 204;

	@OriginalMember(owner = "client!es", name = "Z", descriptor = "I")
	private int anInt1954 = 409;

	@OriginalMember(owner = "client!es", name = "L", descriptor = "I")
	private int anInt1944 = 0;

	@OriginalMember(owner = "client!es", name = "eb", descriptor = "I")
	private int anInt1957 = 81;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
	@Override
	public void method6067() {
		this.method1547();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass156_41.method3899(arg0);
		if (super.aClass156_41.aBoolean318) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = this.anInt1944 + Static229.anIntArray382[arg0]; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (local22 < this.anInt1946 && this.anIntArray153[local22] <= local29) {
				local22++;
			}
			@Pc(57) int local57 = local22 - 1;
			@Pc(68) boolean local68 = (local22 & 0x1) == 0;
			@Pc(73) int local73 = this.anIntArray153[local22];
			@Pc(80) int local80 = this.anIntArray153[local22 - 1];
			if (this.anInt1958 + local80 < local29 && local73 - this.anInt1958 > local29) {
				for (@Pc(98) int local98 = 0; local98 < Static391.anInt7118; local98++) {
					@Pc(109) int local109 = local68 ? this.anInt1951 : -this.anInt1951;
					@Pc(111) int local111 = 0;
					@Pc(123) int local123;
					for (local123 = Static167.anIntArray267[local98] + (local109 * this.anInt1943 >> 12); local123 < 0; local123 += 4096) {
					}
					while (local123 > 4096) {
						local123 -= 4096;
					}
					while (this.anInt1948 > local111 && local123 >= this.anIntArrayArray8[local57][local111]) {
						local111++;
					}
					@Pc(161) int local161 = local111 - 1;
					@Pc(168) int local168 = this.anIntArrayArray8[local57][local111];
					@Pc(175) int local175 = this.anIntArrayArray8[local57][local161];
					if (local175 + this.anInt1958 < local123 && local123 < local168 - this.anInt1958) {
						local16[local98] = this.anIntArrayArray9[local57][local161];
					} else {
						local16[local98] = 0;
					}
				}
			} else {
				Static394.method2439(local16, 0, Static391.anInt7118, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IILclient!vt;)V")
	@Override
	public void method6064(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt1948 = arg1.method5732();
		} else if (arg0 == 1) {
			this.anInt1946 = arg1.method5732();
		} else if (arg0 == 2) {
			this.anInt1954 = arg1.method5753();
		} else if (arg0 == 3) {
			this.anInt1949 = arg1.method5753();
		} else if (arg0 == 4) {
			this.anInt1951 = arg1.method5753();
		} else if (arg0 == 5) {
			this.anInt1944 = arg1.method5753();
		} else if (arg0 == 6) {
			this.anInt1957 = arg1.method5753();
		} else if (arg0 == 7) {
			this.anInt1950 = arg1.method5753();
		}
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V")
	private void method1547() {
		@Pc(12) Random local12 = new Random((long) this.anInt1946);
		this.anInt1947 = 4096 / this.anInt1946;
		this.anInt1958 = this.anInt1957 / 2;
		this.anInt1943 = 4096 / this.anInt1948;
		@Pc(35) int local35 = this.anInt1943 / 2;
		@Pc(40) int local40 = this.anInt1947 / 2;
		this.anIntArrayArray8 = new int[this.anInt1946][this.anInt1948 + 1];
		this.anIntArray153 = new int[this.anInt1946 + 1];
		this.anIntArrayArray9 = new int[this.anInt1946][this.anInt1948];
		this.anIntArray153[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt1946; local70++) {
			@Pc(77) int local77;
			@Pc(91) int local91;
			if (local70 > 0) {
				local77 = this.anInt1947;
				local91 = (Static371.method5907(4096, local12) - 2048) * this.anInt1949 >> 12;
				@Pc(99) int local99 = local77 + (local40 * local91 >> 12);
				this.anIntArray153[local70] = this.anIntArray153[local70 - 1] + local99;
			}
			this.anIntArrayArray8[local70][0] = 0;
			for (local77 = 0; local77 < this.anInt1948; local77++) {
				if (local77 > 0) {
					local91 = this.anInt1943;
					@Pc(142) int local142 = (Static371.method5907(4096, local12) - 2048) * this.anInt1954 >> 12;
					local91 += local35 * local142 >> 12;
					this.anIntArrayArray8[local70][local77] = local91 + this.anIntArrayArray8[local70][local77 - 1];
				}
				this.anIntArrayArray9[local70][local77] = this.anInt1950 <= 0 ? 4096 : 4096 - Static371.method5907(this.anInt1950, local12);
			}
			this.anIntArrayArray8[local70][this.anInt1948] = 4096;
		}
		this.anIntArray153[this.anInt1946] = 4096;
	}
}
