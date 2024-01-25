import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class5_Sub2_Sub10 extends Class5_Sub2 {

	@OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
	private int anInt2138;

	@OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
	private int anInt2140;

	@OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
	private int anInt2146;

	@OriginalMember(owner = "client!eb", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!eb", name = "W", descriptor = "[I")
	private int[] anIntArray131;

	@OriginalMember(owner = "client!eb", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
	private int anInt2144 = 204;

	@OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
	private int anInt2143 = 8;

	@OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
	private int anInt2142 = 1024;

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
	private int anInt2148 = 0;

	@OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
	private int anInt2137 = 4;

	@OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
	private int anInt2147 = 81;

	@OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
	private int anInt2149 = 409;

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
	private int anInt2141 = 1024;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2137 = arg0.method5966();
		} else if (arg1 == 1) {
			this.anInt2143 = arg0.method5966();
		} else if (arg1 == 2) {
			this.anInt2149 = arg0.method5968();
		} else if (arg1 == 3) {
			this.anInt2144 = arg0.method5968();
		} else if (arg1 == 4) {
			this.anInt2141 = arg0.method5968();
		} else if (arg1 == 5) {
			this.anInt2148 = arg0.method5968();
		} else if (arg1 == 6) {
			this.anInt2147 = arg0.method5968();
		} else if (arg1 == 7) {
			this.anInt2142 = arg0.method5968();
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9034(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass379_41.method9012(arg0);
		if (super.aClass379_41.aBoolean761) {
			@Pc(25) int local25 = 0;
			@Pc(32) int local32;
			for (local32 = Static493.anIntArray476[arg0] + this.anInt2148; local32 < 0; local32 += 4096) {
			}
			while (local32 > 4096) {
				local32 -= 4096;
			}
			while (local25 < this.anInt2143 && local32 >= this.anIntArray131[local25]) {
				local25++;
			}
			@Pc(71) int local71 = local25 - 1;
			@Pc(82) boolean local82 = (local25 & 0x1) == 0;
			@Pc(87) int local87 = this.anIntArray131[local25];
			@Pc(94) int local94 = this.anIntArray131[local25 - 1];
			if (local94 + this.anInt2146 < local32 && local32 < local87 - this.anInt2146) {
				for (@Pc(113) int local113 = 0; local113 < Static597.anInt10025; local113++) {
					@Pc(124) int local124 = local82 ? this.anInt2141 : -this.anInt2141;
					@Pc(126) int local126 = 0;
					@Pc(138) int local138;
					for (local138 = Static352.anIntArray331[local113] + (this.anInt2140 * local124 >> 12); local138 < 0; local138 += 4096) {
					}
					while (local138 > 4096) {
						local138 -= 4096;
					}
					while (this.anInt2137 > local126 && local138 >= this.anIntArrayArray11[local71][local126]) {
						local126++;
					}
					@Pc(178) int local178 = local126 - 1;
					@Pc(185) int local185 = this.anIntArrayArray11[local71][local178];
					@Pc(192) int local192 = this.anIntArrayArray11[local71][local126];
					if (this.anInt2146 + local185 < local138 && local138 < local192 - this.anInt2146) {
						local11[local113] = this.anIntArrayArray10[local71][local178];
					} else {
						local11[local113] = 0;
					}
				}
			} else {
				Static652.method4544(local11, 0, Static597.anInt10025, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
	@Override
	public void method9044() {
		this.method1765();
	}

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V")
	private void method1765() {
		@Pc(20) Random local20 = new Random((long) this.anInt2143);
		this.anInt2140 = 4096 / this.anInt2137;
		this.anInt2146 = this.anInt2147 / 2;
		this.anInt2138 = 4096 / this.anInt2143;
		@Pc(43) int local43 = this.anInt2140 / 2;
		this.anIntArrayArray10 = new int[this.anInt2143][this.anInt2137];
		this.anIntArray131 = new int[this.anInt2143 + 1];
		@Pc(62) int local62 = this.anInt2138 / 2;
		this.anIntArrayArray11 = new int[this.anInt2143][this.anInt2137 + 1];
		this.anIntArray131[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt2143; local78++) {
			@Pc(88) int local88;
			@Pc(100) int local100;
			if (local78 > 0) {
				local88 = this.anInt2138;
				local100 = (Static130.method1947(4096, local20) - 2048) * this.anInt2144 >> 12;
				@Pc(108) int local108 = local88 + (local62 * local100 >> 12);
				this.anIntArray131[local78] = this.anIntArray131[local78 - 1] + local108;
			}
			this.anIntArrayArray11[local78][0] = 0;
			for (local88 = 0; local88 < this.anInt2137; local88++) {
				if (local88 > 0) {
					local100 = this.anInt2140;
					@Pc(151) int local151 = (Static130.method1947(4096, local20) - 2048) * this.anInt2149 >> 12;
					local100 += local43 * local151 >> 12;
					this.anIntArrayArray11[local78][local88] = local100 + this.anIntArrayArray11[local78][local88 - 1];
				}
				this.anIntArrayArray10[local78][local88] = this.anInt2142 > 0 ? 4096 - Static130.method1947(this.anInt2142, local20) : 4096;
			}
			this.anIntArrayArray11[local78][this.anInt2137] = 4096;
		}
		this.anIntArray131[this.anInt2143] = 4096;
	}
}
