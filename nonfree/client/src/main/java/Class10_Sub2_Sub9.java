import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class10_Sub2_Sub9 extends Class10_Sub2 {

	@OriginalMember(owner = "client!eg", name = "I", descriptor = "[I")
	private int[] anIntArray155;

	@OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
	private int anInt1889;

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
	private int anInt1892;

	@OriginalMember(owner = "client!eg", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!eg", name = "ib", descriptor = "I")
	private int anInt1908;

	@OriginalMember(owner = "client!eg", name = "kb", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
	private int anInt1888 = 81;

	@OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
	private int anInt1898 = 0;

	@OriginalMember(owner = "client!eg", name = "ab", descriptor = "I")
	private int anInt1902 = 1024;

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "I")
	private int anInt1897 = 204;

	@OriginalMember(owner = "client!eg", name = "gb", descriptor = "I")
	private int anInt1907 = 8;

	@OriginalMember(owner = "client!eg", name = "Y", descriptor = "I")
	private int anInt1900 = 4;

	@OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
	private int anInt1887 = 1024;

	@OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
	private int anInt1903 = 409;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(Z)V")
	@Override
	public void method6036() {
		this.method1688();
	}

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V")
	private void method1688() {
		@Pc(12) Random local12 = new Random((long) this.anInt1907);
		this.anInt1892 = 4096 / this.anInt1907;
		this.anInt1908 = 4096 / this.anInt1900;
		this.anInt1889 = this.anInt1888 / 2;
		@Pc(39) int local39 = this.anInt1908 / 2;
		@Pc(44) int local44 = this.anInt1892 / 2;
		this.anIntArrayArray17 = new int[this.anInt1907][this.anInt1900];
		this.anIntArray155 = new int[this.anInt1907 + 1];
		this.anIntArrayArray16 = new int[this.anInt1907][this.anInt1900 + 1];
		this.anIntArray155[0] = 0;
		for (@Pc(74) int local74 = 0; local74 < this.anInt1907; local74++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local74 > 0) {
				local84 = this.anInt1892;
				local96 = (Static434.method5743(local12, 4096) - 2048) * this.anInt1897 >> 12;
				@Pc(104) int local104 = local84 + (local44 * local96 >> 12);
				this.anIntArray155[local74] = this.anIntArray155[local74 - 1] + local104;
			}
			this.anIntArrayArray16[local74][0] = 0;
			for (local84 = 0; local84 < this.anInt1900; local84++) {
				if (local84 > 0) {
					local96 = this.anInt1908;
					@Pc(148) int local148 = (Static434.method5743(local12, 4096) - 2048) * this.anInt1903 >> 12;
					local96 += local39 * local148 >> 12;
					this.anIntArrayArray16[local74][local84] = local96 + this.anIntArrayArray16[local74][local84 - 1];
				}
				this.anIntArrayArray17[local74][local84] = this.anInt1887 <= 0 ? 4096 : 4096 - Static434.method5743(local12, this.anInt1887);
			}
			this.anIntArrayArray16[local74][this.anInt1900] = 4096;
		}
		this.anIntArray155[this.anInt1907] = 4096;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILclient!nn;)V")
	@Override
	public void method6044(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1900 = arg1.method2502();
		} else if (arg0 == 1) {
			this.anInt1907 = arg1.method2502();
		} else if (arg0 == 2) {
			this.anInt1903 = arg1.method2485();
		} else if (arg0 == 3) {
			this.anInt1897 = arg1.method2485();
		} else if (arg0 == 4) {
			this.anInt1902 = arg1.method2485();
		} else if (arg0 == 5) {
			this.anInt1898 = arg1.method2485();
		} else if (arg0 == 6) {
			this.anInt1888 = arg1.method2485();
		} else if (arg0 == 7) {
			this.anInt1887 = arg1.method2485();
		}
	}

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6035(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass241_41.method5238(arg0);
		if (super.aClass241_41.aBoolean440) {
			@Pc(22) int local22 = 0;
			@Pc(30) int local30;
			for (local30 = Static67.anIntArray106[arg0] + this.anInt1898; local30 < 0; local30 += 4096) {
			}
			while (local30 > 4096) {
				local30 -= 4096;
			}
			while (local22 < this.anInt1907 && local30 >= this.anIntArray155[local22]) {
				local22++;
			}
			@Pc(64) int local64 = local22 - 1;
			@Pc(72) boolean local72 = (local22 & 0x1) == 0;
			@Pc(77) int local77 = this.anIntArray155[local22];
			@Pc(84) int local84 = this.anIntArray155[local22 - 1];
			if (local30 > local84 + this.anInt1889 && local77 - this.anInt1889 > local30) {
				for (@Pc(104) int local104 = 0; local104 < Static121.anInt2458; local104++) {
					@Pc(108) int local108 = 0;
					@Pc(117) int local117 = local72 ? this.anInt1902 : -this.anInt1902;
					@Pc(129) int local129;
					for (local129 = Static182.anIntArray374[local104] + (local117 * this.anInt1908 >> 12); local129 < 0; local129 += 4096) {
					}
					while (local129 > 4096) {
						local129 -= 4096;
					}
					while (local108 < this.anInt1900 && this.anIntArrayArray16[local64][local108] <= local129) {
						local108++;
					}
					@Pc(165) int local165 = local108 - 1;
					@Pc(172) int local172 = this.anIntArrayArray16[local64][local165];
					@Pc(179) int local179 = this.anIntArrayArray16[local64][local108];
					if (local129 > this.anInt1889 + local172 && local179 - this.anInt1889 > local129) {
						local11[local104] = this.anIntArrayArray17[local64][local165];
					} else {
						local11[local104] = 0;
					}
				}
			} else {
				Static468.method4353(local11, 0, Static121.anInt2458, 0);
			}
		}
		return local11;
	}
}
