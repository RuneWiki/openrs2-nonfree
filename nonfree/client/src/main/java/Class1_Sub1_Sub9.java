import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!co", name = "F", descriptor = "I")
	private int anInt1024 = 2000;

	@OriginalMember(owner = "client!co", name = "S", descriptor = "I")
	private int anInt1033 = 16;

	@OriginalMember(owner = "client!co", name = "P", descriptor = "I")
	private int anInt1032 = 0;

	@OriginalMember(owner = "client!co", name = "G", descriptor = "I")
	private int anInt1025 = 0;

	@OriginalMember(owner = "client!co", name = "U", descriptor = "I")
	private int anInt1034 = 4096;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
		Static129.method2272();
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1032 = arg0.method1853();
		} else if (arg1 == 1) {
			this.anInt1024 = arg0.method1879();
		} else if (arg1 == 2) {
			this.anInt1033 = arg0.method1853();
		} else if (arg1 == 3) {
			this.anInt1025 = arg0.method1879();
		} else if (arg1 == 4) {
			this.anInt1034 = arg0.method1879();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(26) int local26 = this.anInt1034 >> 1;
			@Pc(31) int[][] local31 = this.aClass190_41.method4649();
			@Pc(38) Random local38 = new Random((long) this.anInt1032);
			for (@Pc(40) int local40 = 0; local40 < this.anInt1024; local40++) {
				@Pc(69) int local69 = this.anInt1034 <= 0 ? this.anInt1025 : this.anInt1025 + Static118.method2140(local38, this.anInt1034) - local26;
				@Pc(74) int local74 = Static118.method2140(local38, Static6.anInt4960);
				@Pc(79) int local79 = Static118.method2140(local38, Static213.anInt5511);
				@Pc(85) int local85 = local69 >> 4 & 0xFF;
				@Pc(96) int local96 = local74 + (this.anInt1033 * Static192.anIntArray396[local85] >> 12);
				@Pc(108) int local108 = local79 + (Static58.anIntArray98[local85] * this.anInt1033 >> 12);
				@Pc(113) int local113 = local96 - local74;
				@Pc(118) int local118 = local108 - local79;
				if (local113 != 0 || local118 != 0) {
					if (local118 < 0) {
						local118 = -local118;
					}
					if (local113 < 0) {
						local113 = -local113;
					}
					@Pc(152) boolean local152 = local118 > local113;
					@Pc(159) int local159;
					@Pc(157) int local157;
					if (local152) {
						local157 = local96;
						local159 = local74;
						local96 = local108;
						local74 = local79;
						local108 = local157;
						local79 = local159;
					}
					if (local96 < local74) {
						local159 = local74;
						local74 = local96;
						local157 = local79;
						local79 = local108;
						local96 = local159;
						local108 = local157;
					}
					local159 = local79;
					local157 = local96 - local74;
					@Pc(199) int local199 = local108 - local79;
					@Pc(204) int local204 = -local157 / 2;
					@Pc(208) int local208 = 2048 / local157;
					if (local199 < 0) {
						local199 = -local199;
					}
					@Pc(227) int local227 = local79 >= local108 ? -1 : 1;
					@Pc(237) int local237 = 1024 - (Static118.method2140(local38, 4096) >> 2);
					for (@Pc(239) int local239 = local74; local239 < local96; local239++) {
						local204 += local199;
						@Pc(262) int local262 = local237 + local208 * (local239 - local74) + 1024;
						@Pc(266) int local266 = local159 & Static202.anInt3956;
						@Pc(270) int local270 = local239 & Static274.anInt5042;
						if (local152) {
							local31[local266][local270] = local262;
						} else {
							local31[local270][local266] = local262;
						}
						if (local204 > 0) {
							local204 += -local157;
							local159 += local227;
						}
					}
				}
			}
		}
		return local11;
	}
}
