import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!se", name = "S", descriptor = "I")
	private int anInt5254 = 16;

	@OriginalMember(owner = "client!se", name = "T", descriptor = "I")
	private int anInt5255 = 0;

	@OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
	private int anInt5252 = 4096;

	@OriginalMember(owner = "client!se", name = "cb", descriptor = "I")
	private int anInt5263 = 2000;

	@OriginalMember(owner = "client!se", name = "W", descriptor = "I")
	private int anInt5258 = 0;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
		Static39.method882();
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(16) int local16 = this.anInt5252 >> 1;
			@Pc(21) int[][] local21 = this.aClass114_41.method3365();
			@Pc(28) Random local28 = new Random((long) this.anInt5258);
			for (@Pc(30) int local30 = 0; local30 < this.anInt5263; local30++) {
				@Pc(57) int local57 = this.anInt5252 <= 0 ? this.anInt5255 : this.anInt5255 + Static13.method291(this.anInt5252, local28) - local16;
				@Pc(62) int local62 = Static13.method291(Static75.anInt1848, local28);
				@Pc(67) int local67 = Static13.method291(Static6.anInt2264, local28);
				@Pc(73) int local73 = local57 >> 4 & 0xFF;
				@Pc(84) int local84 = (this.anInt5254 * Static179.anIntArray362[local73] >> 12) + local67;
				@Pc(89) int local89 = local84 - local67;
				@Pc(100) int local100 = (Static74.anIntArray191[local73] * this.anInt5254 >> 12) + local62;
				@Pc(105) int local105 = local100 - local62;
				if (local105 != 0 || local89 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local89 < 0) {
						local89 = -local89;
					}
					@Pc(133) boolean local133 = local89 > local105;
					@Pc(138) int local138;
					@Pc(140) int local140;
					if (local133) {
						local138 = local62;
						local140 = local100;
						local62 = local67;
						local100 = local84;
						local84 = local140;
						local67 = local138;
					}
					if (local100 < local62) {
						local140 = local67;
						local67 = local84;
						local84 = local140;
						local138 = local62;
						local62 = local100;
						local100 = local138;
					}
					local138 = local67;
					local140 = local100 - local62;
					@Pc(180) int local180 = -local140 / 2;
					@Pc(185) int local185 = local84 - local67;
					@Pc(189) int local189 = 2048 / local140;
					@Pc(199) int local199 = 1024 - (Static13.method291(4096, local28) >> 2);
					if (local185 < 0) {
						local185 = -local185;
					}
					@Pc(213) int local213 = local84 > local67 ? 1 : -1;
					for (@Pc(215) int local215 = local62; local215 < local100; local215++) {
						local180 += local185;
						@Pc(226) int local226 = local138 & Static178.anInt4007;
						@Pc(230) int local230 = local215 & Static145.anInt3482;
						if (local180 > 0) {
							local180 += -local140;
							local138 -= -local213;
						}
						@Pc(256) int local256 = (local215 - local62) * local189 + local199 + 1024;
						if (local133) {
							local21[local226][local230] = local256;
						} else {
							local21[local230][local226] = local256;
						}
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5258 = arg0.method2655();
		} else if (arg1 == 1) {
			this.anInt5263 = arg0.method2652();
		} else if (arg1 == 2) {
			this.anInt5254 = arg0.method2655();
		} else if (arg1 == 3) {
			this.anInt5255 = arg0.method2652();
		} else if (arg1 == 4) {
			this.anInt5252 = arg0.method2652();
		}
	}
}
