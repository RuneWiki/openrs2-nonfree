import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class2_Sub3_Sub20 extends Class2_Sub3 {

	@OriginalMember(owner = "client!pe", name = "ob", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!pe", name = "sb", descriptor = "I")
	private int anInt3005;

	@OriginalMember(owner = "client!pe", name = "ub", descriptor = "I")
	private int anInt3007;

	@OriginalMember(owner = "client!pe", name = "Bb", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!pe", name = "Cb", descriptor = "I")
	private int anInt3013;

	@OriginalMember(owner = "client!pe", name = "Eb", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!pe", name = "lb", descriptor = "I")
	private int anInt3000;

	@OriginalMember(owner = "client!pe", name = "nb", descriptor = "I")
	private int anInt3001;

	@OriginalMember(owner = "client!pe", name = "hb", descriptor = "I")
	private int anInt2997;

	@OriginalMember(owner = "client!pe", name = "gb", descriptor = "I")
	private int anInt2996;

	@OriginalMember(owner = "client!pe", name = "tb", descriptor = "I")
	private int anInt3006;

	@OriginalMember(owner = "client!pe", name = "rb", descriptor = "I")
	private int anInt3004;

	@OriginalMember(owner = "client!pe", name = "pb", descriptor = "I")
	private int anInt3002;

	@OriginalMember(owner = "client!pe", name = "Ab", descriptor = "I")
	private int anInt3012;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(22) int local22 = Static21.anIntArray50[arg0] + this.anInt3002;
			@Pc(24) int local24 = 0;
			while (local22 < 0) {
				local22 += 4096;
			}
			while (local22 > 4096) {
				local22 -= 4096;
			}
			while (this.anInt2997 > local24 && local22 >= this.anIntArray272[local24]) {
				local24++;
			}
			@Pc(62) float local62 = (float) this.anIntArray272[local24 - 1];
			@Pc(68) float local68 = (float) this.anIntArray272[local24];
			if ((float) local22 > (float) this.anInt3007 + local62 && (float) local22 < local68 - (float) this.anInt3007) {
				for (@Pc(95) int local95 = 0; local95 < Static54.anInt1423; local95++) {
					@Pc(99) int local99 = 0;
					@Pc(113) int local113 = local24 % 2 == 0 ? this.anInt2996 : -this.anInt2996;
					@Pc(124) int local124;
					for (local124 = (local113 * this.anInt3013 >> 12) + Static36.anIntArray74[local95]; local124 < 0; local124 += 4096) {
					}
					while (local124 > 4096) {
						local124 -= 4096;
					}
					while (local99 < this.anInt3012 && this.anIntArrayArray28[local24 - 1][local99] <= local124) {
						local99++;
					}
					@Pc(175) float local175 = (float) this.anIntArrayArray28[local24 - 1][local99 - 1];
					@Pc(185) float local185 = (float) this.anIntArrayArray28[local24 - 1][local99];
					if ((float) local124 > (float) this.anInt3007 + local175 && (float) -this.anInt3007 + local185 > (float) local124) {
						local11[local95] = this.anIntArrayArray27[local24 - 1][local99 - 1];
					} else {
						local11[local95] = 0;
					}
				}
			} else {
				Static184.method1643(local11, 0, Static54.anInt1423, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)V")
	@Override
	public void method2892() {
		this.method2069();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3012 = arg1.method1698();
		} else if (arg0 == 1) {
			this.anInt2997 = arg1.method1698();
		} else if (arg0 == 2) {
			this.anInt3000 = arg1.method1680();
		} else if (arg0 == 3) {
			this.anInt3001 = arg1.method1680();
		} else if (arg0 == 4) {
			this.anInt2996 = arg1.method1680();
		} else if (arg0 == 5) {
			this.anInt3002 = arg1.method1680();
		} else if (arg0 == 6) {
			this.anInt3004 = arg1.method1680();
		} else if (arg0 == 7) {
			this.anInt3006 = arg1.method1680();
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(Z)V")
	private void method2069() {
		@Pc(12) Random local12 = new Random((long) this.anInt2997);
		this.anInt3013 = 4096 / this.anInt3012;
		this.anInt3005 = 4096 / this.anInt2997;
		this.anIntArrayArray28 = new int[this.anInt2997][this.anInt3012 + 1];
		this.anIntArray272 = new int[this.anInt2997 + 1];
		@Pc(49) int local49 = this.anInt3005 / 2;
		this.anIntArrayArray27 = new int[this.anInt2997][this.anInt3012];
		@Pc(61) int local61 = this.anInt3013 / 2;
		this.anIntArray272[0] = 0;
		this.anInt3007 = this.anInt3004 / 2;
		for (@Pc(74) int local74 = 0; local74 < this.anInt2997; local74++) {
			@Pc(81) int local81;
			@Pc(93) int local93;
			if (local74 > 0) {
				local81 = this.anInt3005;
				local93 = (Static90.method1619(local12, 4096) - 2048) * this.anInt3001 >> 12;
				@Pc(101) int local101 = local81 + (local93 * local49 >> 12);
				this.anIntArray272[local74] = local101 + this.anIntArray272[local74 - 1];
			}
			this.anIntArrayArray28[local74][0] = 0;
			for (local81 = 0; local81 < this.anInt3012; local81++) {
				if (local81 > 0) {
					local93 = this.anInt3013;
					@Pc(144) int local144 = (Static90.method1619(local12, 4096) - 2048) * this.anInt3000 >> 12;
					local93 += local61 * local144 >> 12;
					this.anIntArrayArray28[local74][local81] = local93 + this.anIntArrayArray28[local74][local81 - 1];
				}
				this.anIntArrayArray27[local74][local81] = this.anInt3006 <= 0 ? 4096 : 4096 - Static90.method1619(local12, this.anInt3006);
			}
			this.anIntArrayArray28[local74][this.anInt3012] = 4096;
		}
		this.anIntArray272[this.anInt2997] = 4096;
	}
}
