import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!eg", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
	private int anInt1299;

	@OriginalMember(owner = "client!eg", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "[I")
	private int[] anIntArray106;

	@OriginalMember(owner = "client!eg", name = "W", descriptor = "I")
	private int anInt1304;

	@OriginalMember(owner = "client!eg", name = "bb", descriptor = "I")
	private int anInt1309;

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
	private int anInt1296 = 0;

	@OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
	private int anInt1297 = 204;

	@OriginalMember(owner = "client!eg", name = "S", descriptor = "I")
	private int anInt1301 = 1024;

	@OriginalMember(owner = "client!eg", name = "G", descriptor = "I")
	private int anInt1293 = 409;

	@OriginalMember(owner = "client!eg", name = "U", descriptor = "I")
	private int anInt1303 = 8;

	@OriginalMember(owner = "client!eg", name = "T", descriptor = "I")
	private int anInt1302 = 4;

	@OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
	private int anInt1292 = 81;

	@OriginalMember(owner = "client!eg", name = "X", descriptor = "I")
	private int anInt1305 = 1024;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1302 = arg0.method1853();
		} else if (arg1 == 1) {
			this.anInt1303 = arg0.method1853();
		} else if (arg1 == 2) {
			this.anInt1293 = arg0.method1879();
		} else if (arg1 == 3) {
			this.anInt1297 = arg0.method1879();
		} else if (arg1 == 4) {
			this.anInt1301 = arg0.method1879();
		} else if (arg1 == 5) {
			this.anInt1296 = arg0.method1879();
		} else if (arg1 == 6) {
			this.anInt1292 = arg0.method1879();
		} else if (arg1 == 7) {
			this.anInt1305 = arg0.method1879();
		}
	}

	@OriginalMember(owner = "client!eg", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
		this.method1105();
	}

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V")
	private void method1105() {
		@Pc(8) Random local8 = new Random((long) this.anInt1303);
		this.anIntArrayArray10 = new int[this.anInt1303][this.anInt1302];
		this.anInt1304 = 4096 / this.anInt1303;
		this.anIntArrayArray9 = new int[this.anInt1303][this.anInt1302 + 1];
		this.anInt1299 = 4096 / this.anInt1302;
		@Pc(41) int local41 = this.anInt1299 / 2;
		this.anIntArray106 = new int[this.anInt1303 + 1];
		this.anInt1309 = this.anInt1292 / 2;
		@Pc(59) int local59 = this.anInt1304 / 2;
		this.anIntArray106[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt1303; local70++) {
			@Pc(91) int local91;
			@Pc(103) int local103;
			if (local70 > 0) {
				local91 = this.anInt1304;
				local103 = (Static118.method2140(local8, 4096) - 2048) * this.anInt1297 >> 12;
				@Pc(111) int local111 = local91 + (local103 * local59 >> 12);
				this.anIntArray106[local70] = local111 + this.anIntArray106[local70 - 1];
			}
			this.anIntArrayArray9[local70][0] = 0;
			for (local91 = 0; local91 < this.anInt1302; local91++) {
				if (local91 > 0) {
					local103 = this.anInt1299;
					@Pc(160) int local160 = (Static118.method2140(local8, 4096) - 2048) * this.anInt1293 >> 12;
					local103 += local41 * local160 >> 12;
					this.anIntArrayArray9[local70][local91] = local103 + this.anIntArrayArray9[local70][local91 - 1];
				}
				this.anIntArrayArray10[local70][local91] = this.anInt1305 <= 0 ? 4096 : 4096 - Static118.method2140(local8, this.anInt1305);
			}
			this.anIntArrayArray9[local70][this.anInt1302] = 4096;
		}
		this.anIntArray106[this.anInt1303] = 4096;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(24) int local24 = 0;
			@Pc(31) int local31;
			for (local31 = this.anInt1296 + Static10.anIntArray604[arg0]; local31 < 0; local31 += 4096) {
			}
			while (local31 > 4096) {
				local31 -= 4096;
			}
			while (local24 < this.anInt1303 && this.anIntArray106[local24] <= local31) {
				local24++;
			}
			@Pc(73) boolean local73 = (local24 & 0x1) == 0;
			@Pc(77) int local77 = local24 - 1;
			@Pc(82) int local82 = this.anIntArray106[local24];
			@Pc(89) int local89 = this.anIntArray106[local24 - 1];
			if (this.anInt1309 + local89 < local31 && local82 - this.anInt1309 > local31) {
				for (@Pc(108) int local108 = 0; local108 < Static6.anInt4960; local108++) {
					@Pc(113) int local113 = 0;
					@Pc(122) int local122 = local73 ? this.anInt1301 : -this.anInt1301;
					@Pc(133) int local133;
					for (local133 = Static298.anIntArray589[local108] + (local122 * this.anInt1299 >> 12); local133 < 0; local133 += 4096) {
					}
					while (local133 > 4096) {
						local133 -= 4096;
					}
					while (local113 < this.anInt1302 && this.anIntArrayArray9[local77][local113] <= local133) {
						local113++;
					}
					@Pc(179) int local179 = this.anIntArrayArray9[local77][local113];
					@Pc(183) int local183 = local113 - 1;
					@Pc(190) int local190 = this.anIntArrayArray9[local77][local183];
					if (this.anInt1309 + local190 < local133 && local133 < local179 - this.anInt1309) {
						local17[local108] = this.anIntArrayArray10[local77][local183];
					} else {
						local17[local108] = 0;
					}
				}
			} else {
				Static317.method1052(local17, 0, Static6.anInt4960, 0);
			}
		}
		return local17;
	}
}
