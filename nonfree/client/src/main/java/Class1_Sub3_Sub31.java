import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class1_Sub3_Sub31 extends Class1_Sub3 {

	@OriginalMember(owner = "client!tg", name = "L", descriptor = "I")
	private int anInt8067 = 0;

	@OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
	private int anInt8073 = 0;

	@OriginalMember(owner = "client!tg", name = "N", descriptor = "I")
	private int anInt8068 = 4096;

	@OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
	private int anInt8074 = 2000;

	@OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
	private int anInt8077 = 16;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass222_41.method5913(arg0);
		if (super.aClass222_41.aBoolean485) {
			@Pc(25) int local25 = this.anInt8068 >> 1;
			@Pc(30) int[][] local30 = super.aClass222_41.method5915();
			@Pc(37) Random local37 = new Random((long) this.anInt8067);
			for (@Pc(39) int local39 = 0; local39 < this.anInt8074; local39++) {
				@Pc(62) int local62 = this.anInt8068 <= 0 ? this.anInt8073 : this.anInt8073 + Static438.method6797(this.anInt8068, local37) - local25;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(73) int local73 = Static438.method6797(Static254.anInt4973, local37);
				@Pc(78) int local78 = Static438.method6797(Static426.anInt7423, local37);
				@Pc(89) int local89 = local73 + (this.anInt8077 * Static246.anIntArray361[local68] >> 12);
				@Pc(101) int local101 = local78 + (this.anInt8077 * Static494.anIntArray759[local68] >> 12);
				@Pc(105) int local105 = local101 - local78;
				@Pc(110) int local110 = local89 - local73;
				if (local110 != 0 || local105 != 0) {
					if (local110 < 0) {
						local110 = -local110;
					}
					if (local105 < 0) {
						local105 = -local105;
					}
					@Pc(137) boolean local137 = local105 > local110;
					@Pc(141) int local141;
					@Pc(143) int local143;
					if (local137) {
						local141 = local73;
						local143 = local89;
						local73 = local78;
						local78 = local141;
						local89 = local101;
						local101 = local143;
					}
					if (local73 > local89) {
						local141 = local73;
						local143 = local78;
						local73 = local89;
						local89 = local141;
						local78 = local101;
						local101 = local143;
					}
					local141 = local78;
					local143 = local89 - local73;
					@Pc(178) int local178 = local101 - local78;
					@Pc(183) int local183 = -local143 / 2;
					@Pc(187) int local187 = 2048 / local143;
					@Pc(196) int local196 = 1024 - (Static438.method6797(4096, local37) >> 2);
					if (local178 < 0) {
						local178 = -local178;
					}
					@Pc(212) int local212 = local78 < local101 ? 1 : -1;
					for (@Pc(214) int local214 = local73; local214 < local89; local214++) {
						@Pc(226) int local226 = (local214 - local73) * local187 + local196 + 1024;
						@Pc(230) int local230 = Static184.anInt3830 & local214;
						@Pc(234) int local234 = Static109.anInt2298 & local141;
						if (local137) {
							local30[local234][local230] = local226;
						} else {
							local30[local230][local234] = local226;
						}
						local183 += local178;
						if (local183 > 0) {
							local141 += local212;
							local183 -= local143;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IILclient!os;)V")
	@Override
	public void method8200(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt8067 = arg1.method4487();
		} else if (arg0 == 1) {
			this.anInt8074 = arg1.method4494();
		} else if (arg0 == 2) {
			this.anInt8077 = arg1.method4487();
		} else if (arg0 == 3) {
			this.anInt8073 = arg1.method4494();
		} else if (arg0 == 4) {
			this.anInt8068 = arg1.method4494();
		}
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
	@Override
	public void method8197() {
		Static371.method5980();
	}
}
