import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class2_Sub2_Sub39 extends Class2_Sub2 {

	@OriginalMember(owner = "client!wa", name = "Q", descriptor = "I")
	private int anInt6832 = 16;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "I")
	private int anInt6835 = 0;

	@OriginalMember(owner = "client!wa", name = "V", descriptor = "I")
	private int anInt6837 = 4096;

	@OriginalMember(owner = "client!wa", name = "X", descriptor = "I")
	private int anInt6838 = 2000;

	@OriginalMember(owner = "client!wa", name = "P", descriptor = "I")
	private int anInt6831 = 0;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(25) int local25 = this.anInt6837 >> 1;
			@Pc(30) int[][] local30 = super.aClass137_41.method3808();
			@Pc(37) Random local37 = new Random((long) this.anInt6835);
			for (@Pc(39) int local39 = 0; local39 < this.anInt6838; local39++) {
				@Pc(59) int local59 = this.anInt6837 <= 0 ? this.anInt6831 : this.anInt6831 + Static188.method3700(local37, this.anInt6837) - local25;
				@Pc(65) int local65 = local59 >> 4 & 0xFF;
				@Pc(70) int local70 = Static188.method3700(local37, Static339.anInt6735);
				@Pc(75) int local75 = Static188.method3700(local37, Static84.anInt1830);
				@Pc(86) int local86 = (this.anInt6832 * Static296.anIntArray435[local65] >> 12) + local70;
				@Pc(97) int local97 = local75 + (Static160.anIntArray273[local65] * this.anInt6832 >> 12);
				@Pc(101) int local101 = local97 - local75;
				@Pc(105) int local105 = local86 - local70;
				if (local105 != 0 || local101 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local101 < 0) {
						local101 = -local101;
					}
					@Pc(133) boolean local133 = local105 < local101;
					@Pc(137) int local137;
					@Pc(139) int local139;
					if (local133) {
						local137 = local70;
						local139 = local86;
						local70 = local75;
						local86 = local97;
						local75 = local137;
						local97 = local139;
					}
					if (local70 > local86) {
						local137 = local70;
						local139 = local75;
						local70 = local86;
						local75 = local97;
						local86 = local137;
						local97 = local139;
					}
					local137 = local75;
					local139 = local86 - local70;
					@Pc(178) int local178 = local97 - local75;
					@Pc(183) int local183 = -local139 / 2;
					@Pc(187) int local187 = 2048 / local139;
					@Pc(197) int local197 = 1024 - (Static188.method3700(local37, 4096) >> 2);
					if (local178 < 0) {
						local178 = -local178;
					}
					@Pc(213) int local213 = local97 <= local75 ? -1 : 1;
					for (@Pc(215) int local215 = local70; local215 < local86; local215++) {
						@Pc(228) int local228 = local197 + (local215 - local70) * local187 + 1024;
						@Pc(232) int local232 = local215 & Static25.anInt1346;
						@Pc(236) int local236 = Static285.anInt5782 & local137;
						if (local133) {
							local30[local236][local232] = local228;
						} else {
							local30[local232][local236] = local228;
						}
						local183 += local178;
						if (local183 > 0) {
							local137 += local213;
							local183 += -local139;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	@Override
	public void method5877() {
		Static71.method1639();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt6835 = arg1.method4421();
		} else if (arg0 == 1) {
			this.anInt6838 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt6832 = arg1.method4421();
		} else if (arg0 == 3) {
			this.anInt6831 = arg1.method4464();
		} else if (arg0 == 4) {
			this.anInt6837 = arg1.method4464();
		}
	}
}
