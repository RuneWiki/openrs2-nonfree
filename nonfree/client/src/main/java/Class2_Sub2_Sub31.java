import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sv")
public final class Class2_Sub2_Sub31 extends Class2_Sub2 {

	@OriginalMember(owner = "client!sv", name = "I", descriptor = "I")
	private int anInt8361 = 2000;

	@OriginalMember(owner = "client!sv", name = "L", descriptor = "I")
	private int anInt8364 = 0;

	@OriginalMember(owner = "client!sv", name = "K", descriptor = "I")
	private int anInt8363 = 0;

	@OriginalMember(owner = "client!sv", name = "O", descriptor = "I")
	private int anInt8367 = 16;

	@OriginalMember(owner = "client!sv", name = "J", descriptor = "I")
	private int anInt8362 = 4096;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sv", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
		Static315.method7021();
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8364 = arg0.method4325();
		} else if (arg1 == 1) {
			this.anInt8361 = arg0.method4294();
		} else if (arg1 == 2) {
			this.anInt8367 = arg0.method4325();
		} else if (arg1 == 3) {
			this.anInt8363 = arg0.method4294();
		} else if (arg1 == 4) {
			this.anInt8362 = arg0.method4294();
		}
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(20) int local20 = this.anInt8362 >> 1;
			@Pc(25) int[][] local25 = super.aClass238_41.method5573();
			@Pc(32) Random local32 = new Random((long) this.anInt8364);
			for (@Pc(34) int local34 = 0; local34 < this.anInt8361; local34++) {
				@Pc(54) int local54 = this.anInt8362 <= 0 ? this.anInt8363 : this.anInt8363 + Static233.method3629(local32, this.anInt8362) - local20;
				@Pc(60) int local60 = local54 >> 4 & 0xFF;
				@Pc(65) int local65 = Static233.method3629(local32, Static153.anInt3070);
				@Pc(70) int local70 = Static233.method3629(local32, Static377.anInt6692);
				@Pc(82) int local82 = local65 + (Static388.anIntArray472[local60] * this.anInt8367 >> 12);
				@Pc(93) int local93 = local70 + (this.anInt8367 * Static561.anIntArray667[local60] >> 12);
				@Pc(98) int local98 = local93 - local70;
				@Pc(102) int local102 = local82 - local65;
				if (local102 != 0 || local98 != 0) {
					if (local98 < 0) {
						local98 = -local98;
					}
					if (local102 < 0) {
						local102 = -local102;
					}
					@Pc(126) boolean local126 = local98 > local102;
					@Pc(130) int local130;
					@Pc(132) int local132;
					if (local126) {
						local130 = local65;
						local132 = local82;
						local65 = local70;
						local70 = local130;
						local82 = local93;
						local93 = local132;
					}
					if (local65 > local82) {
						local130 = local65;
						local132 = local70;
						local65 = local82;
						local82 = local130;
						local70 = local93;
						local93 = local132;
					}
					local130 = local70;
					local132 = local82 - local65;
					@Pc(167) int local167 = local93 - local70;
					@Pc(172) int local172 = -local132 / 2;
					@Pc(176) int local176 = 2048 / local132;
					@Pc(185) int local185 = 1024 - (Static233.method3629(local32, 4096) >> 2);
					@Pc(192) int local192 = local70 < local93 ? 1 : -1;
					if (local167 < 0) {
						local167 = -local167;
					}
					for (@Pc(199) int local199 = local65; local199 < local82; local199++) {
						@Pc(213) int local213 = local185 + (-local65 + local199) * local176 + 1024;
						@Pc(217) int local217 = local199 & Static431.anInt7305;
						@Pc(221) int local221 = Static28.anInt6368 & local130;
						if (local126) {
							local25[local221][local217] = local213;
						} else {
							local25[local217][local221] = local213;
						}
						local172 += local167;
						if (local172 > 0) {
							local172 -= local132;
							local130 += local192;
						}
					}
				}
			}
		}
		return local11;
	}
}
