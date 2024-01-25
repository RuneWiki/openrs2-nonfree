import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class3_Sub1_Sub25 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qm", name = "F", descriptor = "[I")
	private int[] anIntArray600;

	@OriginalMember(owner = "client!qm", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!qm", name = "S", descriptor = "I")
	private int anInt8304;

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
	private int anInt8311;

	@OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
	private int anInt8316;

	@OriginalMember(owner = "client!qm", name = "P", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!qm", name = "B", descriptor = "I")
	private int anInt8305 = 409;

	@OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
	private int anInt8306 = 0;

	@OriginalMember(owner = "client!qm", name = "U", descriptor = "I")
	private int anInt8314 = 8;

	@OriginalMember(owner = "client!qm", name = "W", descriptor = "I")
	private int anInt8308 = 1024;

	@OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
	private int anInt8310 = 4;

	@OriginalMember(owner = "client!qm", name = "O", descriptor = "I")
	private int anInt8317 = 204;

	@OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
	private int anInt8319 = 1024;

	@OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
	private int anInt8318 = 81;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(17) int local17 = 0;
			@Pc(24) int local24;
			for (local24 = this.anInt8306 + Static121.anIntArray145[arg0]; local24 < 0; local24 += 4096) {
			}
			while (local24 > 4096) {
				local24 -= 4096;
			}
			while (this.anInt8314 > local17 && this.anIntArray600[local17] <= local24) {
				local17++;
			}
			@Pc(69) int local69 = local17 - 1;
			@Pc(83) boolean local83 = (local17 & 0x1) == 0;
			@Pc(88) int local88 = this.anIntArray600[local17];
			@Pc(95) int local95 = this.anIntArray600[local17 - 1];
			if (this.anInt8311 + local95 < local24 && local88 - this.anInt8311 > local24) {
				for (@Pc(121) int local121 = 0; local121 < Static379.anInt5859; local121++) {
					@Pc(135) int local135 = local83 ? this.anInt8308 : -this.anInt8308;
					@Pc(137) int local137 = 0;
					@Pc(149) int local149;
					for (local149 = Static497.anIntArray579[local121] + (local135 * this.anInt8316 >> 12); local149 < 0; local149 += 4096) {
					}
					while (local149 > 4096) {
						local149 -= 4096;
					}
					while (this.anInt8310 > local137 && this.anIntArrayArray43[local69][local137] <= local149) {
						local137++;
					}
					@Pc(193) int local193 = local137 - 1;
					@Pc(200) int local200 = this.anIntArrayArray43[local69][local137];
					@Pc(207) int local207 = this.anIntArrayArray43[local69][local193];
					if (local149 > this.anInt8311 + local207 && local149 < local200 - this.anInt8311) {
						local11[local121] = this.anIntArrayArray44[local69][local193];
					} else {
						local11[local121] = 0;
					}
				}
			} else {
				Static732.method6314(local11, 0, Static379.anInt5859, 0);
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt8310 = arg1.method2048(255);
		} else if (arg0 == 1) {
			this.anInt8314 = arg1.method2048(255);
		} else if (arg0 == 2) {
			this.anInt8305 = arg1.method2028(-14795);
		} else if (arg0 == 3) {
			this.anInt8317 = arg1.method2028(-14795);
		} else if (arg0 == 4) {
			this.anInt8308 = arg1.method2028(-14795);
		} else if (arg0 == 5) {
			this.anInt8306 = arg1.method2028(-14795);
		} else if (arg0 == 6) {
			this.anInt8318 = arg1.method2028(-14795);
		} else if (arg0 == 7) {
			this.anInt8319 = arg1.method2028(-14795);
		}
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
	@Override
	public void method9578() {
		this.method7100();
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
	private void method7100() {
		@Pc(12) Random local12 = new Random((long) this.anInt8314);
		this.anInt8304 = 4096 / this.anInt8314;
		this.anInt8316 = 4096 / this.anInt8310;
		this.anInt8311 = this.anInt8318 / 2;
		@Pc(35) int local35 = this.anInt8316 / 2;
		this.anIntArrayArray43 = new int[this.anInt8314][this.anInt8310 + 1];
		this.anIntArray600 = new int[this.anInt8314 + 1];
		this.anIntArrayArray44 = new int[this.anInt8314][this.anInt8310];
		@Pc(63) int local63 = this.anInt8304 / 2;
		this.anIntArray600[0] = 0;
		for (@Pc(70) int local70 = 0; local70 < this.anInt8314; local70++) {
			@Pc(82) int local82;
			@Pc(94) int local94;
			if (local70 > 0) {
				local82 = this.anInt8304;
				local94 = (Static19.method614(local12, 4096) - 2048) * this.anInt8317 >> 12;
				@Pc(102) int local102 = local82 + (local63 * local94 >> 12);
				this.anIntArray600[local70] = this.anIntArray600[local70 - 1] + local102;
			}
			this.anIntArrayArray43[local70][0] = 0;
			for (local82 = 0; local82 < this.anInt8310; local82++) {
				if (local82 > 0) {
					local94 = this.anInt8316;
					@Pc(149) int local149 = (Static19.method614(local12, 4096) - 2048) * this.anInt8305 >> 12;
					local94 += local35 * local149 >> 12;
					this.anIntArrayArray43[local70][local82] = this.anIntArrayArray43[local70][local82 - 1] + local94;
				}
				this.anIntArrayArray44[local70][local82] = this.anInt8319 > 0 ? 4096 - Static19.method614(local12, this.anInt8319) : 4096;
			}
			this.anIntArrayArray43[local70][this.anInt8310] = 4096;
		}
		this.anIntArray600[this.anInt8314] = 4096;
	}
}
