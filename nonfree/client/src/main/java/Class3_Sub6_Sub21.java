import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public final class Class3_Sub6_Sub21 extends Class3_Sub6 {

	@OriginalMember(owner = "client!mr", name = "N", descriptor = "I")
	private int anInt6169 = 4;

	@OriginalMember(owner = "client!mr", name = "T", descriptor = "I")
	private int anInt6174 = 4;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6174 = arg0.method6814();
		} else if (arg1 == 1) {
			this.anInt6169 = arg0.method6814();
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(20) int local20 = Static481.anInt8358 / this.anInt6174;
			@Pc(25) int local25 = Static465.anInt8091 / this.anInt6169;
			@Pc(36) int[][] local36;
			if (local25 <= 0) {
				local36 = this.method8005(0, 0);
			} else {
				@Pc(42) int local42 = arg0 % local25;
				local36 = this.method8005(0, local42 * Static465.anInt8091 / local25);
			}
			@Pc(56) int[] local56 = local36[0];
			@Pc(60) int[] local60 = local36[1];
			@Pc(64) int[] local64 = local36[2];
			@Pc(68) int[] local68 = local11[0];
			@Pc(72) int[] local72 = local11[1];
			@Pc(76) int[] local76 = local11[2];
			for (@Pc(78) int local78 = 0; local78 < Static481.anInt8358; local78++) {
				@Pc(92) int local92;
				if (local20 > 0) {
					@Pc(86) int local86 = local78 % local20;
					local92 = local86 * Static481.anInt8358 / local20;
				} else {
					local92 = 0;
				}
				local68[local78] = local56[local92];
				local72[local78] = local60[local92];
				local76[local78] = local64[local92];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(20) int local20 = Static481.anInt8358 / this.anInt6174;
			@Pc(25) int local25 = Static465.anInt8091 / this.anInt6169;
			@Pc(41) int[] local41;
			@Pc(31) int local31;
			if (local25 > 0) {
				local31 = arg0 % local25;
				local41 = this.method8001(0, local31 * Static465.anInt8091 / local25);
			} else {
				local41 = this.method8001(0, 0);
			}
			for (local31 = 0; local31 < Static481.anInt8358; local31++) {
				if (local20 <= 0) {
					local11[local31] = local41[0];
				} else {
					@Pc(67) int local67 = local31 % local20;
					local11[local31] = local41[Static481.anInt8358 * local67 / local20];
				}
			}
		}
		return local11;
	}
}
