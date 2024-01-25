import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class4_Sub4_Sub7 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
	private int anInt1915 = 0;

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "I")
	private int anInt1916 = 2000;

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
	private int anInt1914 = 0;

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
	private int anInt1924 = 16;

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
	private int anInt1925 = 4096;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IBLclient!tq;)V")
	@Override
	public void method5387(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt1914 = arg1.method2380();
		} else if (arg0 == 1) {
			this.anInt1916 = arg1.method2404();
		} else if (arg0 == 2) {
			this.anInt1924 = arg1.method2380();
		} else if (arg0 == 3) {
			this.anInt1915 = arg1.method2404();
		} else if (arg0 == 4) {
			this.anInt1925 = arg1.method2404();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass207_41.method5470(arg0);
		if (super.aClass207_41.aBoolean572) {
			@Pc(26) int local26 = this.anInt1925 >> 1;
			@Pc(31) int[][] local31 = super.aClass207_41.method5468();
			@Pc(38) Random local38 = new Random((long) this.anInt1914);
			for (@Pc(40) int local40 = 0; local40 < this.anInt1916; local40++) {
				@Pc(65) int local65 = this.anInt1925 <= 0 ? this.anInt1915 : this.anInt1915 + Static130.method2621(local38, this.anInt1925) - local26;
				@Pc(71) int local71 = local65 >> 4 & 0xFF;
				@Pc(78) int local78 = Static130.method2621(local38, Static124.anInt3576);
				@Pc(83) int local83 = Static130.method2621(local38, Static331.anInt6571);
				@Pc(94) int local94 = (Static238.anIntArray411[local71] * this.anInt1924 >> 12) + local78;
				@Pc(105) int local105 = local83 + (Static258.anIntArray442[local71] * this.anInt1924 >> 12);
				@Pc(109) int local109 = local105 - local83;
				@Pc(114) int local114 = local94 - local78;
				if (local114 != 0 || local109 != 0) {
					if (local114 < 0) {
						local114 = -local114;
					}
					if (local109 < 0) {
						local109 = -local109;
					}
					@Pc(138) boolean local138 = local114 < local109;
					@Pc(142) int local142;
					@Pc(144) int local144;
					if (local138) {
						local142 = local78;
						local144 = local94;
						local78 = local83;
						local83 = local142;
						local94 = local105;
						local105 = local144;
					}
					if (local78 > local94) {
						local142 = local78;
						local144 = local83;
						local78 = local94;
						local94 = local142;
						local83 = local105;
						local105 = local144;
					}
					local142 = local83;
					local144 = local94 - local78;
					@Pc(179) int local179 = local105 - local83;
					@Pc(184) int local184 = -local144 / 2;
					@Pc(188) int local188 = 2048 / local144;
					@Pc(198) int local198 = 1024 - (Static130.method2621(local38, 4096) >> 2);
					@Pc(209) int local209 = local83 < local105 ? 1 : -1;
					if (local179 < 0) {
						local179 = -local179;
					}
					for (@Pc(216) int local216 = local78; local216 < local94; local216++) {
						@Pc(229) int local229 = local188 * (local216 - local78) + local198 + 1024;
						@Pc(233) int local233 = Static350.anInt6802 & local216;
						@Pc(237) int local237 = local142 & Static59.anInt1278;
						if (local138) {
							local31[local237][local233] = local229;
						} else {
							local31[local233][local237] = local229;
						}
						local184 += local179;
						if (local184 > 0) {
							local184 += -local144;
							local142 -= -local209;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(Z)V")
	@Override
	public void method5392() {
		Static317.method5269();
	}
}
