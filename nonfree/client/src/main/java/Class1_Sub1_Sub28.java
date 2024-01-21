import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class1_Sub1_Sub28 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oe", name = "gb", descriptor = "I")
	private int anInt3288;

	@OriginalMember(owner = "client!oe", name = "qb", descriptor = "[[I")
	private int[][] anIntArrayArray30;

	@OriginalMember(owner = "client!oe", name = "ub", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!oe", name = "yb", descriptor = "I")
	private int anInt3300;

	@OriginalMember(owner = "client!oe", name = "Bb", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!oe", name = "Cb", descriptor = "I")
	private int anInt3302;

	@OriginalMember(owner = "client!oe", name = "ob", descriptor = "I")
	private int anInt3296 = 409;

	@OriginalMember(owner = "client!oe", name = "rb", descriptor = "I")
	private int anInt3298 = 1024;

	@OriginalMember(owner = "client!oe", name = "jb", descriptor = "I")
	private int anInt3291 = 81;

	@OriginalMember(owner = "client!oe", name = "pb", descriptor = "I")
	private int anInt3297 = 0;

	@OriginalMember(owner = "client!oe", name = "kb", descriptor = "I")
	private int anInt3292 = 4;

	@OriginalMember(owner = "client!oe", name = "Hb", descriptor = "I")
	private int anInt3305 = 204;

	@OriginalMember(owner = "client!oe", name = "Gb", descriptor = "I")
	private int anInt3304 = 1024;

	@OriginalMember(owner = "client!oe", name = "Jb", descriptor = "I")
	private int anInt3307 = 8;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
		this.method2529();
	}

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "(B)V")
	private void method2529() {
		@Pc(8) Random local8 = new Random((long) this.anInt3307);
		this.anInt3288 = 4096 / this.anInt3307;
		this.anInt3302 = 4096 / this.anInt3292;
		this.anIntArray375 = new int[this.anInt3307 + 1];
		this.anInt3300 = this.anInt3291 / 2;
		this.anIntArrayArray32 = new int[this.anInt3307][this.anInt3292];
		this.anIntArray375[0] = 0;
		@Pc(54) int local54 = this.anInt3302 / 2;
		@Pc(59) int local59 = this.anInt3288 / 2;
		this.anIntArrayArray30 = new int[this.anInt3307][this.anInt3292 + 1];
		for (@Pc(74) int local74 = 0; local74 < this.anInt3307; local74++) {
			@Pc(84) int local84;
			@Pc(96) int local96;
			if (local74 > 0) {
				local84 = this.anInt3288;
				local96 = (Static3.method61(local8, 4096) - 2048) * this.anInt3305 >> 12;
				@Pc(104) int local104 = local84 + (local96 * local59 >> 12);
				this.anIntArray375[local74] = local104 + this.anIntArray375[local74 - 1];
			}
			this.anIntArrayArray30[local74][0] = 0;
			for (local84 = 0; local84 < this.anInt3292; local84++) {
				if (local84 > 0) {
					local96 = this.anInt3302;
					@Pc(144) int local144 = (Static3.method61(local8, 4096) - 2048) * this.anInt3296 >> 12;
					local96 += local144 * local54 >> 12;
					this.anIntArrayArray30[local74][local84] = local96 + this.anIntArrayArray30[local74][local84 - 1];
				}
				this.anIntArrayArray32[local74][local84] = this.anInt3304 > 0 ? 4096 - Static3.method61(local8, this.anInt3304) : 4096;
			}
			this.anIntArrayArray30[local74][this.anInt3292] = 4096;
		}
		this.anIntArray375[this.anInt3307] = 4096;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt3292 = arg1.method1738();
		} else if (arg0 == 1) {
			this.anInt3307 = arg1.method1738();
		} else if (arg0 == 2) {
			this.anInt3296 = arg1.method1753();
		} else if (arg0 == 3) {
			this.anInt3305 = arg1.method1753();
		} else if (arg0 == 4) {
			this.anInt3298 = arg1.method1753();
		} else if (arg0 == 5) {
			this.anInt3297 = arg1.method1753();
		} else if (arg0 == 6) {
			this.anInt3291 = arg1.method1753();
		} else if (arg0 == 7) {
			this.anInt3304 = arg1.method1753();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(24) int local24 = 0;
			@Pc(31) int local31;
			for (local31 = Static22.anIntArray68[arg0] + this.anInt3297; local31 < 0; local31 += 4096) {
			}
			while (local31 > 4096) {
				local31 -= 4096;
			}
			while (local24 < this.anInt3307 && this.anIntArray375[local24] <= local31) {
				local24++;
			}
			@Pc(73) boolean local73 = (local24 & 0x1) == 0;
			@Pc(80) int local80 = this.anIntArray375[local24 - 1];
			@Pc(84) int local84 = local24 - 1;
			@Pc(89) int local89 = this.anIntArray375[local24];
			if (this.anInt3300 + local80 < local31 && local89 - this.anInt3300 > local31) {
				for (@Pc(112) int local112 = 0; local112 < Static176.anInt3921; local112++) {
					@Pc(116) int local116 = 0;
					@Pc(125) int local125 = local73 ? this.anInt3298 : -this.anInt3298;
					@Pc(136) int local136;
					for (local136 = Static171.anIntArray439[local112] + (local125 * this.anInt3302 >> 12); local136 < 0; local136 += 4096) {
					}
					while (local136 > 4096) {
						local136 -= 4096;
					}
					while (this.anInt3292 > local116 && local136 >= this.anIntArrayArray30[local84][local116]) {
						local116++;
					}
					@Pc(172) int local172 = local116 - 1;
					@Pc(179) int local179 = this.anIntArrayArray30[local84][local172];
					@Pc(186) int local186 = this.anIntArrayArray30[local84][local116];
					if (local136 > this.anInt3300 + local179 && local136 < local186 - this.anInt3300) {
						local13[local112] = this.anIntArrayArray32[local84][local172];
					} else {
						local13[local112] = 0;
					}
				}
			} else {
				Static217.method2360(local13, 0, Static176.anInt3921, 0);
			}
		}
		return local13;
	}
}
