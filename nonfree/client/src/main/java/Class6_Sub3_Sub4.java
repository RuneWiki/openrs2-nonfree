import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class6_Sub3_Sub4 extends Class6_Sub3 {

	@OriginalMember(owner = "client!dba", name = "F", descriptor = "I")
	private int anInt1327 = 4;

	@OriginalMember(owner = "client!dba", name = "B", descriptor = "I")
	private int anInt1324 = 4;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			@Pc(28) int local28 = Static447.anInt8568 / this.anInt1327;
			@Pc(33) int local33 = Static495.anInt8251 / this.anInt1324;
			@Pc(52) int[] local52;
			@Pc(42) int local42;
			if (local33 > 0) {
				local42 = arg0 % local33;
				local52 = this.method7824(0, local42 * Static495.anInt8251 / local33);
			} else {
				local52 = this.method7824(0, 0);
			}
			for (local42 = 0; local42 < Static447.anInt8568; local42++) {
				if (local28 <= 0) {
					local19[local42] = local52[0];
				} else {
					@Pc(81) int local81 = local42 % local28;
					local19[local42] = local52[Static447.anInt8568 * local81 / local28];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7822(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass103_41.method2141(arg0);
		if (super.aClass103_41.aBoolean172) {
			@Pc(28) int local28 = Static447.anInt8568 / this.anInt1327;
			@Pc(33) int local33 = Static495.anInt8251 / this.anInt1324;
			@Pc(44) int[][] local44;
			if (local33 <= 0) {
				local44 = this.method7823(0, 0);
			} else {
				@Pc(50) int local50 = arg0 % local33;
				local44 = this.method7823(0, Static495.anInt8251 * local50 / local33);
			}
			@Pc(64) int[] local64 = local44[0];
			@Pc(68) int[] local68 = local44[1];
			@Pc(72) int[] local72 = local44[2];
			@Pc(76) int[] local76 = local11[0];
			@Pc(80) int[] local80 = local11[1];
			@Pc(84) int[] local84 = local11[2];
			for (@Pc(86) int local86 = 0; local86 < Static447.anInt8568; local86++) {
				@Pc(100) int local100;
				if (local28 > 0) {
					@Pc(94) int local94 = local86 % local28;
					local100 = local94 * Static447.anInt8568 / local28;
				} else {
					local100 = 0;
				}
				local76[local86] = local64[local100];
				local80[local86] = local68[local100];
				local84[local86] = local72[local100];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1327 = arg1.method6041();
		} else if (arg0 == 1) {
			this.anInt1324 = arg1.method6041();
		}
	}
}
