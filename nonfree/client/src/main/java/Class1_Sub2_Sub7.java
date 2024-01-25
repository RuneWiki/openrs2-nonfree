import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!f", name = "M", descriptor = "I")
	private int anInt1652 = 4;

	@OriginalMember(owner = "client!f", name = "O", descriptor = "I")
	private int anInt1654 = 4;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(20) int local20 = Static218.anInt3990 / this.anInt1652;
			@Pc(25) int local25 = Static54.anInt778 / this.anInt1654;
			@Pc(36) int[] local36;
			@Pc(42) int local42;
			if (local25 <= 0) {
				local36 = this.method5964(0, 0);
			} else {
				local42 = arg0 % local25;
				local36 = this.method5964(local42 * Static54.anInt778 / local25, 0);
			}
			for (local42 = 0; local42 < Static218.anInt3990; local42++) {
				if (local20 <= 0) {
					local11[local42] = local36[0];
				} else {
					@Pc(73) int local73 = local42 % local20;
					local11[local42] = local36[local73 * Static218.anInt3990 / local20];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1652 = arg0.method2915();
		} else if (arg1 == 1) {
			this.anInt1654 = arg0.method2915();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(25) int local25 = Static218.anInt3990 / this.anInt1652;
			@Pc(30) int local30 = Static54.anInt778 / this.anInt1654;
			@Pc(46) int[][] local46;
			if (local30 > 0) {
				@Pc(36) int local36 = arg0 % local30;
				local46 = this.method5968(0, local36 * Static54.anInt778 / local30);
			} else {
				local46 = this.method5968(0, 0);
			}
			@Pc(58) int[] local58 = local46[0];
			@Pc(62) int[] local62 = local46[1];
			@Pc(66) int[] local66 = local46[2];
			@Pc(70) int[] local70 = local11[0];
			@Pc(74) int[] local74 = local11[1];
			@Pc(78) int[] local78 = local11[2];
			for (@Pc(80) int local80 = 0; local80 < Static218.anInt3990; local80++) {
				@Pc(97) int local97;
				if (local25 > 0) {
					@Pc(91) int local91 = local80 % local25;
					local97 = Static218.anInt3990 * local91 / local25;
				} else {
					local97 = 0;
				}
				local70[local80] = local58[local97];
				local74[local80] = local62[local97];
				local78[local80] = local66[local97];
			}
		}
		return local11;
	}
}
