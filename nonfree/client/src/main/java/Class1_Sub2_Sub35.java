import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class1_Sub2_Sub35 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
	private int anInt5935 = 4;

	@OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
	private int anInt5948 = 4;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			@Pc(25) int local25 = Static251.anInt6509 / this.anInt5935;
			@Pc(30) int local30 = Static81.anInt1606 / this.anInt5948;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local30 > 0) {
				local39 = arg0 % local30;
				local49 = this.method5654(0, local39 * Static81.anInt1606 / local30);
			} else {
				local49 = this.method5654(0, 0);
			}
			for (local39 = 0; local39 < Static251.anInt6509; local39++) {
				if (local25 > 0) {
					@Pc(70) int local70 = local39 % local25;
					local16[local39] = local49[Static251.anInt6509 * local70 / local25];
				} else {
					local16[local39] = local49[0];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5935 = arg1.method3141();
		} else if (arg0 == 1) {
			this.anInt5948 = arg1.method3141();
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(26) int local26 = Static251.anInt6509 / this.anInt5935;
			@Pc(31) int local31 = Static81.anInt1606 / this.anInt5948;
			@Pc(42) int[][] local42;
			if (local31 <= 0) {
				local42 = this.method5659(0, 0);
			} else {
				@Pc(48) int local48 = arg0 % local31;
				local42 = this.method5659(local48 * Static81.anInt1606 / local31, 0);
			}
			@Pc(62) int[] local62 = local42[0];
			@Pc(66) int[] local66 = local42[1];
			@Pc(70) int[] local70 = local42[2];
			@Pc(74) int[] local74 = local17[0];
			@Pc(78) int[] local78 = local17[1];
			@Pc(82) int[] local82 = local17[2];
			for (@Pc(84) int local84 = 0; local84 < Static251.anInt6509; local84++) {
				@Pc(90) int local90;
				if (local26 <= 0) {
					local90 = 0;
				} else {
					@Pc(96) int local96 = local84 % local26;
					local90 = Static251.anInt6509 * local96 / local26;
				}
				local74[local84] = local62[local90];
				local78[local84] = local66[local90];
				local82[local84] = local70[local90];
			}
		}
		return local17;
	}
}
