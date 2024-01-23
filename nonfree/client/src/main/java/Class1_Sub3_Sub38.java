import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class1_Sub3_Sub38 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
	private int anInt4382 = 0;

	@OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
	private int anInt4387 = 2000;

	@OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
	private int anInt4386 = 0;

	@OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
	private int anInt4385 = 4096;

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
	private int anInt4383 = 16;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass79_41.method2341(arg0);
		if (super.aClass79_41.aBoolean125) {
			@Pc(20) int local20 = this.anInt4385 >> 1;
			@Pc(25) int[][] local25 = super.aClass79_41.method2343();
			@Pc(32) Random local32 = new Random((long) this.anInt4386);
			for (@Pc(34) int local34 = 0; local34 < this.anInt4387; local34++) {
				@Pc(54) int local54 = this.anInt4385 <= 0 ? this.anInt4382 : this.anInt4382 + Static131.method2214(this.anInt4385, local32) - local20;
				@Pc(60) int local60 = local54 >> 4 & 0xFF;
				@Pc(67) int local67 = Static131.method2214(Static76.anInt1531, local32);
				@Pc(74) int local74 = Static131.method2214(Static30.anInt572, local32);
				@Pc(85) int local85 = local74 + (Static149.anIntArray324[local60] * this.anInt4383 >> 12);
				@Pc(97) int local97 = local67 + (Static106.anIntArray203[local60] * this.anInt4383 >> 12);
				@Pc(102) int local102 = local97 - local67;
				@Pc(107) int local107 = local85 - local74;
				if (local102 != 0 || local107 != 0) {
					if (local107 < 0) {
						local107 = -local107;
					}
					if (local102 < 0) {
						local102 = -local102;
					}
					@Pc(131) boolean local131 = local107 > local102;
					@Pc(135) int local135;
					@Pc(141) int local141;
					if (local131) {
						local135 = local67;
						local67 = local74;
						local74 = local135;
						local141 = local97;
						local97 = local85;
						local85 = local141;
					}
					if (local67 > local97) {
						local135 = local67;
						local67 = local97;
						local97 = local135;
						local141 = local74;
						local74 = local85;
						local85 = local141;
					}
					local135 = local74;
					local141 = local97 - local67;
					@Pc(181) int local181 = 1024 - (Static131.method2214(4096, local32) >> 2);
					@Pc(186) int local186 = -local141 / 2;
					@Pc(190) int local190 = 2048 / local141;
					@Pc(201) int local201 = local85 > local74 ? 1 : -1;
					@Pc(206) int local206 = local85 - local74;
					if (local206 < 0) {
						local206 = -local206;
					}
					for (@Pc(216) int local216 = local67; local216 < local97; local216++) {
						@Pc(222) int local222 = Static121.anInt2385 & local216;
						@Pc(233) int local233 = local181 + (-local67 + local216) * local190 + 1024;
						local186 += local206;
						@Pc(241) int local241 = Static171.anInt3496 & local135;
						if (local186 > 0) {
							local186 += -local141;
							local135 += local201;
						}
						if (local131) {
							local25[local241][local222] = local233;
						} else {
							local25[local222][local241] = local233;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
	@Override
	public void method3474() {
		Static191.method3137();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt4386 = arg1.method2142();
		} else if (arg0 == 1) {
			this.anInt4387 = arg1.method2178();
		} else if (arg0 == 2) {
			this.anInt4383 = arg1.method2142();
		} else if (arg0 == 3) {
			this.anInt4382 = arg1.method2178();
		} else if (arg0 == 4) {
			this.anInt4385 = arg1.method2178();
		}
	}
}
