import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
	private int anInt1355 = 16;

	@OriginalMember(owner = "client!ek", name = "Y", descriptor = "I")
	private int anInt1357 = 0;

	@OriginalMember(owner = "client!ek", name = "cb", descriptor = "I")
	private int anInt1361 = 0;

	@OriginalMember(owner = "client!ek", name = "eb", descriptor = "I")
	private int anInt1362 = 4096;

	@OriginalMember(owner = "client!ek", name = "gb", descriptor = "I")
	private int anInt1364 = 2000;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(16) int local16 = this.anInt1362 >> 1;
			@Pc(21) int[][] local21 = super.aClass37_41.method1165();
			@Pc(28) Random local28 = new Random((long) this.anInt1361);
			for (@Pc(30) int local30 = 0; local30 < this.anInt1364; local30++) {
				@Pc(49) int local49 = this.anInt1362 <= 0 ? this.anInt1357 : this.anInt1357 + Static206.method3285(local28, this.anInt1362) - local16;
				@Pc(55) int local55 = local49 >> 4 & 0xFF;
				@Pc(60) int local60 = Static206.method3285(local28, Static11.anInt294);
				@Pc(65) int local65 = Static206.method3285(local28, Static116.anInt2571);
				@Pc(76) int local76 = (Static167.anIntArray320[local55] * this.anInt1355 >> 12) + local60;
				@Pc(87) int local87 = (Static10.anIntArray33[local55] * this.anInt1355 >> 12) + local65;
				@Pc(91) int local91 = local87 - local65;
				@Pc(96) int local96 = local76 - local60;
				if (local96 != 0 || local91 != 0) {
					if (local96 < 0) {
						local96 = -local96;
					}
					if (local91 < 0) {
						local91 = -local91;
					}
					@Pc(126) boolean local126 = local96 < local91;
					@Pc(132) int local132;
					@Pc(130) int local130;
					if (local126) {
						local130 = local76;
						local132 = local60;
						local76 = local87;
						local60 = local65;
						local65 = local132;
						local87 = local130;
					}
					if (local76 < local60) {
						local132 = local60;
						local130 = local65;
						local60 = local76;
						local65 = local87;
						local87 = local130;
						local76 = local132;
					}
					local132 = local65;
					local130 = local76 - local60;
					@Pc(170) int local170 = 2048 / local130;
					@Pc(175) int local175 = -local130 / 2;
					@Pc(180) int local180 = local87 - local65;
					@Pc(187) int local187 = local65 < local87 ? 1 : -1;
					if (local180 < 0) {
						local180 = -local180;
					}
					@Pc(202) int local202 = 1024 - (Static206.method3285(local28, 4096) >> 2);
					for (@Pc(204) int local204 = local60; local204 < local76; local204++) {
						local175 += local180;
						@Pc(220) int local220 = local170 * (local204 - local60) + local202 + 1024;
						@Pc(224) int local224 = local204 & Static147.anInt3169;
						@Pc(228) int local228 = local132 & Static30.anInt589;
						if (local175 > 0) {
							local132 += local187;
							local175 += -local130;
						}
						if (local126) {
							local21[local228][local224] = local220;
						} else {
							local21[local224][local228] = local220;
						}
					}
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
		Static96.method1624();
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1361 = arg0.method2945();
		} else if (arg1 == 1) {
			this.anInt1364 = arg0.method2964();
		} else if (arg1 == 2) {
			this.anInt1355 = arg0.method2945();
		} else if (arg1 == 3) {
			this.anInt1357 = arg0.method2964();
		} else if (arg1 == 4) {
			this.anInt1362 = arg0.method2964();
		}
	}
}
