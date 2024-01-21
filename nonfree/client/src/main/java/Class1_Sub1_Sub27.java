import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!qi", name = "Y", descriptor = "I")
	private int anInt3251 = 4;

	@OriginalMember(owner = "client!qi", name = "bb", descriptor = "I")
	private int anInt3254 = 4;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3251 = arg0.method3010();
		} else if (arg1 == 1) {
			this.anInt3254 = arg0.method3010();
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(29) int local29 = Static107.anInt2321 / this.anInt3251;
			@Pc(34) int local34 = Static123.anInt2607 / this.anInt3254;
			@Pc(42) int[] local42;
			@Pc(48) int local48;
			if (local34 <= 0) {
				local42 = this.method3393(0, 0);
			} else {
				local48 = arg0 % local34;
				local42 = this.method3393(local48 * Static123.anInt2607 / local34, 0);
			}
			for (local48 = 0; local48 < Static107.anInt2321; local48++) {
				if (local29 <= 0) {
					local20[local48] = local42[0];
				} else {
					@Pc(79) int local79 = local48 % local29;
					local20[local48] = local42[local79 * Static107.anInt2321 / local29];
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(25) int local25 = Static107.anInt2321 / this.anInt3251;
			@Pc(30) int local30 = Static123.anInt2607 / this.anInt3254;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method3397(0, local36 * Static123.anInt2607 / local30);
			} else {
				local46 = this.method3397(0, 0);
			}
			@Pc(58) int[] local58 = local46[0];
			@Pc(62) int[] local62 = local46[1];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local7[0];
			@Pc(74) int[] local74 = local7[2];
			@Pc(78) int[] local78 = local7[1];
			for (@Pc(80) int local80 = 0; local80 < Static107.anInt2321; local80++) {
				@Pc(97) int local97;
				if (local25 > 0) {
					@Pc(91) int local91 = local80 % local25;
					local97 = local91 * Static107.anInt2321 / local25;
				} else {
					local97 = 0;
				}
				local70[local80] = local58[local97];
				local78[local80] = local62[local97];
				local74[local80] = local66[local97];
			}
		}
		return local7;
	}
}
