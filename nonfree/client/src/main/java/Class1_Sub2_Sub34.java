import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public final class Class1_Sub2_Sub34 extends Class1_Sub2 {

	@OriginalMember(owner = "client!t", name = "W", descriptor = "I")
	private int anInt4106;

	@OriginalMember(owner = "client!t", name = "ab", descriptor = "I")
	private int anInt4109;

	@OriginalMember(owner = "client!t", name = "U", descriptor = "I")
	private int anInt4105;

	@OriginalMember(owner = "client!t", name = "lb", descriptor = "I")
	private int anInt4114;

	@OriginalMember(owner = "client!t", name = "gb", descriptor = "I")
	private int anInt4112;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(28) int local28 = this.anInt4112 >> 1;
			@Pc(33) int[][] local33 = super.aClass85_41.method3436();
			@Pc(40) Random local40 = new Random((long) this.anInt4106);
			for (@Pc(42) int local42 = 0; local42 < this.anInt4114; local42++) {
				@Pc(62) int local62 = this.anInt4112 > 0 ? this.anInt4109 + Static152.method1616(this.anInt4112, local40) - local28 : this.anInt4109;
				@Pc(68) int local68 = local62 >> 4 & 0xFF;
				@Pc(73) int local73 = Static152.method1616(Static22.anInt596, local40);
				@Pc(78) int local78 = Static152.method1616(Static181.anInt4508, local40);
				@Pc(89) int local89 = (this.anInt4105 * Static185.anIntArray441[local68] >> 12) + local73;
				@Pc(94) int local94 = local89 - local73;
				@Pc(105) int local105 = (Static147.anIntArray366[local68] * this.anInt4105 >> 12) + local78;
				@Pc(109) int local109 = local105 - local78;
				if (local94 != 0 || local109 != 0) {
					if (local109 < 0) {
						local109 = -local109;
					}
					if (local94 < 0) {
						local94 = -local94;
					}
					@Pc(137) boolean local137 = local94 < local109;
					@Pc(141) int local141;
					@Pc(143) int local143;
					if (local137) {
						local141 = local73;
						local143 = local89;
						local89 = local105;
						local73 = local78;
						local105 = local143;
						local78 = local141;
					}
					if (local89 < local73) {
						local141 = local73;
						local73 = local89;
						local143 = local78;
						local78 = local105;
						local89 = local141;
						local105 = local143;
					}
					local141 = local78;
					local143 = local89 - local73;
					@Pc(181) int local181 = local105 - local78;
					if (local181 < 0) {
						local181 = -local181;
					}
					@Pc(190) int local190 = 2048 / local143;
					@Pc(200) int local200 = 1024 - (Static152.method1616(4096, local40) >> 2);
					@Pc(205) int local205 = -local143 / 2;
					@Pc(216) int local216 = local105 <= local78 ? -1 : 1;
					for (@Pc(218) int local218 = local73; local218 < local89; local218++) {
						local205 += local181;
						@Pc(234) int local234 = local190 * (local218 - local73) + local200 + 1024;
						@Pc(238) int local238 = local141 & Static14.anInt436;
						@Pc(242) int local242 = Static28.anInt833 & local218;
						if (local137) {
							local33[local238][local242] = local234;
						} else {
							local33[local242][local238] = local234;
						}
						if (local205 > 0) {
							local141 += local216;
							local205 -= local143;
						}
					}
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
		Static127.method2534();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt4106 = arg1.method1234();
		} else if (arg0 == 1) {
			this.anInt4114 = arg1.method1280();
		} else if (arg0 == 2) {
			this.anInt4105 = arg1.method1234();
		} else if (arg0 == 3) {
			this.anInt4109 = arg1.method1280();
		} else if (arg0 == 4) {
			this.anInt4112 = arg1.method1280();
		}
	}
}
