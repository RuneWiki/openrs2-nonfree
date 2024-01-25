import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
	private int anInt553 = 32768;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub4() {
		super(3, false);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6032(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass67_41.method1594(arg0);
		if (super.aClass67_41.aBoolean187) {
			@Pc(26) int[] local26 = this.method6037(arg0, 1);
			@Pc(32) int[] local32 = this.method6037(arg0, 2);
			for (@Pc(34) int local34 = 0; local34 < Static131.anInt2581; local34++) {
				@Pc(44) int local44 = local26[local34] >> 4 & 0xFF;
				@Pc(53) int local53 = local32[local34] * this.anInt553 >> 12;
				@Pc(61) int local61 = local53 * Static171.anIntArray220[local44] >> 12;
				@Pc(69) int local69 = Static132.anIntArray145[local44] * local53 >> 12;
				@Pc(77) int local77 = (local61 >> 12) + local34 & Static287.anInt5227;
				@Pc(85) int local85 = arg0 + (local69 >> 12) & Static36.anInt893;
				@Pc(91) int[] local91 = this.method6037(local85, 0);
				local11[local34] = local91[local77];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)V")
	@Override
	public void method6034() {
		Static10.method210();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBLclient!md;)V")
	@Override
	public void method6039(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt553 = arg1.method3711() << 4;
		} else if (arg0 == 1) {
			super.aBoolean665 = arg1.method3737() == 1;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6033(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass158_41.method3637(arg0);
		if (super.aClass158_41.aBoolean375) {
			@Pc(25) int[] local25 = this.method6037(arg0, 1);
			@Pc(31) int[] local31 = this.method6037(arg0, 2);
			@Pc(35) int[] local35 = local13[0];
			@Pc(39) int[] local39 = local13[1];
			@Pc(43) int[] local43 = local13[2];
			for (@Pc(45) int local45 = 0; local45 < Static131.anInt2581; local45++) {
				@Pc(57) int local57 = local25[local45] * 255 >> 12 & 0xFF;
				@Pc(66) int local66 = this.anInt553 * local31[local45] >> 12;
				@Pc(74) int local74 = local66 * Static171.anIntArray220[local57] >> 12;
				@Pc(82) int local82 = Static132.anIntArray145[local57] * local66 >> 12;
				@Pc(91) int local91 = local45 + (local74 >> 12) & Static287.anInt5227;
				@Pc(99) int local99 = Static36.anInt893 & (local82 >> 12) + arg0;
				@Pc(105) int[][] local105 = this.method6031(0, local99);
				local35[local45] = local105[0][local91];
				local39[local45] = local105[1][local91];
				local43[local45] = local105[2][local91];
			}
		}
		return local13;
	}
}
