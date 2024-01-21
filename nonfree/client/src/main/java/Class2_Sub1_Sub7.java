import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class2_Sub1_Sub7 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
	private int anInt1167 = 4096;

	@OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
	private int anInt1175 = 2000;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
	private int anInt1170 = 0;

	@OriginalMember(owner = "client!ef", name = "fb", descriptor = "I")
	private int anInt1177 = 0;

	@OriginalMember(owner = "client!ef", name = "gb", descriptor = "I")
	private int anInt1178 = 16;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
		Static50.method997();
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(25) int local25 = this.anInt1167 >> 1;
			@Pc(30) int[][] local30 = super.aClass52_41.method1597();
			@Pc(37) Random local37 = new Random((long) this.anInt1177);
			for (@Pc(39) int local39 = 0; local39 < this.anInt1175; local39++) {
				@Pc(62) int local62 = this.anInt1167 <= 0 ? this.anInt1170 : this.anInt1170 + Static4.method87(local37, this.anInt1167) - local25;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(73) int local73 = Static4.method87(local37, Static135.anInt2897);
				@Pc(78) int local78 = Static4.method87(local37, Static102.anInt2347);
				@Pc(90) int local90 = local73 + (this.anInt1178 * Static203.anIntArray399[local68] >> 12);
				@Pc(101) int local101 = (this.anInt1178 * Static36.anIntArray74[local68] >> 12) + local78;
				@Pc(106) int local106 = local90 - local73;
				@Pc(110) int local110 = local101 - local78;
				if (local106 != 0 || local110 != 0) {
					if (local106 < 0) {
						local106 = -local106;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(143) boolean local143 = local110 > local106;
					@Pc(153) int local153;
					@Pc(147) int local147;
					if (local143) {
						local147 = local90;
						local90 = local101;
						local101 = local147;
						local153 = local73;
						local73 = local78;
						local78 = local153;
					}
					if (local73 > local90) {
						local153 = local73;
						local147 = local78;
						local78 = local101;
						local101 = local147;
						local73 = local90;
						local90 = local153;
					}
					local153 = local78;
					local147 = local90 - local73;
					@Pc(187) int local187 = local101 - local78;
					if (local187 < 0) {
						local187 = -local187;
					}
					@Pc(197) int local197 = -local147 / 2;
					@Pc(207) int local207 = 1024 - (Static4.method87(local37, 4096) >> 2);
					@Pc(211) int local211 = 2048 / local147;
					@Pc(218) int local218 = local101 <= local78 ? -1 : 1;
					for (@Pc(220) int local220 = local73; local220 < local90; local220++) {
						@Pc(226) int local226 = local220 & Static201.anInt3995;
						@Pc(236) int local236 = (local220 - local73) * local211 + local207 + 1024;
						@Pc(240) int local240 = local153 & Static207.anInt4078;
						local197 += local187;
						if (local143) {
							local30[local240][local226] = local236;
						} else {
							local30[local226][local240] = local236;
						}
						if (local197 > 0) {
							local153 -= -local218;
							local197 += -local147;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1177 = arg0.method260();
		} else if (arg1 == 1) {
			this.anInt1175 = arg0.method269();
		} else if (arg1 == 2) {
			this.anInt1178 = arg0.method260();
		} else if (arg1 == 3) {
			this.anInt1170 = arg0.method269();
		} else if (arg1 == 4) {
			this.anInt1167 = arg0.method269();
		}
	}
}
