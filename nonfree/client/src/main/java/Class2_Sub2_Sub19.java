import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class2_Sub2_Sub19 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mi", name = "S", descriptor = "I")
	private int anInt2975;

	@OriginalMember(owner = "client!mi", name = "U", descriptor = "I")
	private int anInt2976;

	@OriginalMember(owner = "client!mi", name = "cb", descriptor = "I")
	private int anInt2984;

	@OriginalMember(owner = "client!mi", name = "db", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!mi", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!mi", name = "kb", descriptor = "[I")
	private int[] anIntArray490;

	@OriginalMember(owner = "client!mi", name = "V", descriptor = "I")
	private int anInt2977 = 1024;

	@OriginalMember(owner = "client!mi", name = "bb", descriptor = "I")
	private int anInt2983 = 409;

	@OriginalMember(owner = "client!mi", name = "Y", descriptor = "I")
	private int anInt2980 = 1024;

	@OriginalMember(owner = "client!mi", name = "jb", descriptor = "I")
	private int anInt2989 = 8;

	@OriginalMember(owner = "client!mi", name = "nb", descriptor = "I")
	private int anInt2991 = 81;

	@OriginalMember(owner = "client!mi", name = "ib", descriptor = "I")
	private int anInt2988 = 4;

	@OriginalMember(owner = "client!mi", name = "ob", descriptor = "I")
	private int anInt2992 = 0;

	@OriginalMember(owner = "client!mi", name = "ab", descriptor = "I")
	private int anInt2982 = 204;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)V")
	private void method2395() {
		@Pc(12) Random local12 = new Random((long) this.anInt2989);
		this.anIntArrayArray27 = new int[this.anInt2989][this.anInt2988];
		this.anIntArrayArray28 = new int[this.anInt2989][this.anInt2988 + 1];
		this.anIntArray490 = new int[this.anInt2989 + 1];
		this.anInt2984 = 4096 / this.anInt2989;
		this.anInt2976 = 4096 / this.anInt2988;
		@Pc(52) int local52 = this.anInt2984 / 2;
		this.anIntArray490[0] = 0;
		@Pc(62) int local62 = this.anInt2976 / 2;
		this.anInt2975 = this.anInt2991 / 2;
		for (@Pc(70) int local70 = 0; local70 < this.anInt2989; local70++) {
			@Pc(83) int local83;
			@Pc(95) int local95;
			if (local70 > 0) {
				local83 = this.anInt2984;
				local95 = (Static8.method184(local12, 4096) - 2048) * this.anInt2982 >> 12;
				@Pc(103) int local103 = local83 + (local95 * local52 >> 12);
				this.anIntArray490[local70] = this.anIntArray490[local70 - 1] + local103;
			}
			this.anIntArrayArray28[local70][0] = 0;
			for (local83 = 0; local83 < this.anInt2988; local83++) {
				if (local83 > 0) {
					local95 = this.anInt2976;
					@Pc(144) int local144 = (Static8.method184(local12, 4096) - 2048) * this.anInt2983 >> 12;
					local95 += local144 * local62 >> 12;
					this.anIntArrayArray28[local70][local83] = this.anIntArrayArray28[local70][local83 - 1] + local95;
				}
				this.anIntArrayArray27[local70][local83] = this.anInt2980 <= 0 ? 4096 : 4096 - Static8.method184(local12, this.anInt2980);
			}
			this.anIntArrayArray28[local70][this.anInt2988] = 4096;
		}
		this.anIntArray490[this.anInt2989] = 4096;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			@Pc(23) int local23 = 0;
			@Pc(30) int local30;
			for (local30 = this.anInt2992 + Static157.anIntArray604[arg0]; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (local23 < this.anInt2989 && this.anIntArray490[local23] <= local30) {
				local23++;
			}
			@Pc(69) boolean local69 = (local23 & 0x1) == 0;
			@Pc(73) int local73 = local23 - 1;
			@Pc(78) int local78 = this.anIntArray490[local23];
			@Pc(85) int local85 = this.anIntArray490[local23 - 1];
			if (local85 + this.anInt2975 < local30 && local78 - this.anInt2975 > local30) {
				for (@Pc(104) int local104 = 0; local104 < Static54.anInt953; local104++) {
					@Pc(108) int local108 = 0;
					@Pc(117) int local117 = local69 ? this.anInt2977 : -this.anInt2977;
					@Pc(128) int local128;
					for (local128 = Static179.anIntArray682[local104] + (this.anInt2976 * local117 >> 12); local128 < 0; local128 += 4096) {
					}
					while (local128 > 4096) {
						local128 -= 4096;
					}
					while (this.anInt2988 > local108 && local128 >= this.anIntArrayArray28[local73][local108]) {
						local108++;
					}
					@Pc(164) int local164 = local108 - 1;
					@Pc(171) int local171 = this.anIntArrayArray28[local73][local108];
					@Pc(178) int local178 = this.anIntArrayArray28[local73][local164];
					if (local128 > local178 + this.anInt2975 && local128 < local171 - this.anInt2975) {
						local17[local104] = this.anIntArrayArray27[local73][local164];
					} else {
						local17[local104] = 0;
					}
				}
			} else {
				Static231.method2215(local17, 0, Static54.anInt953, 0);
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V")
	@Override
	public void method3958() {
		this.method2395();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2988 = arg0.method2122();
		} else if (arg1 == 1) {
			this.anInt2989 = arg0.method2122();
		} else if (arg1 == 2) {
			this.anInt2983 = arg0.method2095();
		} else if (arg1 == 3) {
			this.anInt2982 = arg0.method2095();
		} else if (arg1 == 4) {
			this.anInt2977 = arg0.method2095();
		} else if (arg1 == 5) {
			this.anInt2992 = arg0.method2095();
		} else if (arg1 == 6) {
			this.anInt2991 = arg0.method2095();
		} else if (arg1 == 7) {
			this.anInt2980 = arg0.method2095();
		}
	}
}
