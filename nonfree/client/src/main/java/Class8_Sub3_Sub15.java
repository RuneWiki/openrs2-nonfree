import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class8_Sub3_Sub15 extends Class8_Sub3 {

	@OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
	private int anInt1893 = 16;

	@OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
	private int anInt1894 = 0;

	@OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
	private int anInt1900 = 4096;

	@OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
	private int anInt1901 = 2000;

	@OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
	private int anInt1903 = 0;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IILclient!aj;)V")
	@Override
	public void method4223(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt1894 = arg1.method2334();
		} else if (arg0 == 1) {
			this.anInt1901 = arg1.method2375();
		} else if (arg0 == 2) {
			this.anInt1893 = arg1.method2334();
		} else if (arg0 == 3) {
			this.anInt1903 = arg1.method2375();
		} else if (arg0 == 4) {
			this.anInt1900 = arg1.method2375();
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		@Pc(20) int[] local20 = this.aClass59_41.method1366(arg0);
		if (this.aClass59_41.aBoolean131) {
			@Pc(30) int local30 = this.anInt1900 >> 1;
			@Pc(35) int[][] local35 = this.aClass59_41.method1363();
			@Pc(42) Random local42 = new Random((long) this.anInt1894);
			for (@Pc(44) int local44 = 0; local44 < this.anInt1901; local44++) {
				@Pc(66) int local66 = this.anInt1900 > 0 ? this.anInt1903 + Static293.method4280(this.anInt1900, local42) - local30 : this.anInt1903;
				@Pc(71) int local71 = Static293.method4280(Static239.anInt4789, local42);
				@Pc(76) int local76 = Static293.method4280(Static86.anInt1852, local42);
				@Pc(82) int local82 = local66 >> 4 & 0xFF;
				@Pc(93) int local93 = local71 + (Static15.anIntArray18[local82] * this.anInt1893 >> 12);
				@Pc(104) int local104 = local76 + (this.anInt1893 * Static19.anIntArray36[local82] >> 12);
				@Pc(109) int local109 = local104 - local76;
				@Pc(113) int local113 = local93 - local71;
				if (local113 != 0 || local109 != 0) {
					if (local113 < 0) {
						local113 = -local113;
					}
					if (local109 < 0) {
						local109 = -local109;
					}
					@Pc(147) boolean local147 = local113 < local109;
					@Pc(151) int local151;
					@Pc(157) int local157;
					if (local147) {
						local151 = local71;
						local71 = local76;
						local76 = local151;
						local157 = local93;
						local93 = local104;
						local104 = local157;
					}
					if (local71 > local93) {
						local151 = local71;
						local157 = local76;
						local71 = local93;
						local93 = local151;
						local76 = local104;
						local104 = local157;
					}
					@Pc(182) int local182 = local104 - local76;
					if (local182 < 0) {
						local182 = -local182;
					}
					local157 = local93 - local71;
					local151 = local76;
					@Pc(201) int local201 = 2048 / local157;
					@Pc(206) int local206 = -local157 / 2;
					@Pc(217) int local217 = local76 < local104 ? 1 : -1;
					@Pc(227) int local227 = 1024 - (Static293.method4280(4096, local42) >> 2);
					for (@Pc(229) int local229 = local71; local229 < local93; local229++) {
						local206 += local182;
						@Pc(251) int local251 = local227 + local201 * (local229 + -local71) + 1024;
						@Pc(255) int local255 = local151 & Static51.anInt1120;
						if (local206 > 0) {
							local151 += local217;
							local206 += -local157;
						}
						@Pc(271) int local271 = Static214.anInt4402 & local229;
						if (local147) {
							local35[local255][local271] = local251;
						} else {
							local35[local271][local255] = local251;
						}
					}
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
	@Override
	public void method4220() {
		Static111.method1828();
	}
}
