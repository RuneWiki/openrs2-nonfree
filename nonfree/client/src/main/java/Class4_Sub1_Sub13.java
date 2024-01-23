import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class4_Sub1_Sub13 extends Class4_Sub1 {

	@OriginalMember(owner = "client!kl", name = "T", descriptor = "I")
	private int anInt2915 = 0;

	@OriginalMember(owner = "client!kl", name = "S", descriptor = "I")
	private int anInt2914 = 0;

	@OriginalMember(owner = "client!kl", name = "X", descriptor = "I")
	private int anInt2919 = 2000;

	@OriginalMember(owner = "client!kl", name = "cb", descriptor = "I")
	private int anInt2923 = 4096;

	@OriginalMember(owner = "client!kl", name = "db", descriptor = "I")
	private int anInt2924 = 16;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "(B)V")
	@Override
	public void method4737() {
		Static303.method4682();
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2915 = arg0.method4666();
		} else if (arg1 == 1) {
			this.anInt2919 = arg0.method4653();
		} else if (arg1 == 2) {
			this.anInt2924 = arg0.method4666();
		} else if (arg1 == 3) {
			this.anInt2914 = arg0.method4653();
		} else if (arg1 == 4) {
			this.anInt2923 = arg0.method4653();
		}
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = this.aClass35_41.method730(arg0);
		if (this.aClass35_41.aBoolean51) {
			@Pc(16) int local16 = this.anInt2923 >> 1;
			@Pc(21) int[][] local21 = this.aClass35_41.method729();
			@Pc(28) Random local28 = new Random((long) this.anInt2915);
			for (@Pc(30) int local30 = 0; local30 < this.anInt2919; local30++) {
				@Pc(60) int local60 = this.anInt2923 > 0 ? this.anInt2914 + Static44.method716(local28, this.anInt2923) - local16 : this.anInt2914;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(73) int local73 = Static44.method716(local28, Static73.anInt1626);
				@Pc(78) int local78 = Static44.method716(local28, Static25.anInt379);
				@Pc(89) int local89 = local73 + (Static129.anIntArray222[local66] * this.anInt2924 >> 12);
				@Pc(100) int local100 = local78 + (Static130.anIntArray223[local66] * this.anInt2924 >> 12);
				@Pc(105) int local105 = local100 - local78;
				@Pc(110) int local110 = local89 - local73;
				if (local110 != 0 || local105 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local110 < 0) {
						local110 = -local110;
					}
					@Pc(145) boolean local145 = local105 > local110;
					@Pc(152) int local152;
					@Pc(150) int local150;
					if (local145) {
						local150 = local89;
						local152 = local73;
						local73 = local78;
						local89 = local100;
						local78 = local152;
						local100 = local150;
					}
					if (local73 > local89) {
						local152 = local73;
						local73 = local89;
						local150 = local78;
						local89 = local152;
						local78 = local100;
						local100 = local150;
					}
					local152 = local78;
					local150 = local89 - local73;
					@Pc(186) int local186 = -local150 / 2;
					@Pc(191) int local191 = local100 - local78;
					@Pc(201) int local201 = 1024 - (Static44.method716(local28, 4096) >> 2);
					if (local191 < 0) {
						local191 = -local191;
					}
					@Pc(213) int local213 = 2048 / local150;
					@Pc(224) int local224 = local100 <= local78 ? -1 : 1;
					for (@Pc(226) int local226 = local73; local226 < local89; local226++) {
						local186 += local191;
						@Pc(247) int local247 = local201 + (local226 - local73) * local213 + 1024;
						@Pc(251) int local251 = local152 & Static262.anInt5002;
						@Pc(255) int local255 = Static48.anInt901 & local226;
						if (local186 > 0) {
							local186 += -local150;
							local152 += local224;
						}
						if (local145) {
							local21[local251][local255] = local247;
						} else {
							local21[local255][local251] = local247;
						}
					}
				}
			}
		}
		return local7;
	}
}
