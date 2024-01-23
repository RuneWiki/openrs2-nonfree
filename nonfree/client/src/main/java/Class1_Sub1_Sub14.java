import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
	private int anInt1995 = 4;

	@OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
	private int anInt1996 = 4;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1995 = arg0.method3793();
		} else if (arg1 == 1) {
			this.anInt1996 = arg0.method3793();
		}
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(20) int local20 = Static157.anInt3431 / this.anInt1995;
			@Pc(25) int local25 = Static187.anInt4033 / this.anInt1996;
			@Pc(44) int[] local44;
			@Pc(34) int local34;
			if (local25 > 0) {
				local34 = arg0 % local25;
				local44 = this.method3733(local34 * Static187.anInt4033 / local25, 0);
			} else {
				local44 = this.method3733(0, 0);
			}
			for (local34 = 0; local34 < Static157.anInt3431; local34++) {
				if (local20 <= 0) {
					local11[local34] = local44[0];
				} else {
					@Pc(73) int local73 = local34 % local20;
					local11[local34] = local44[Static157.anInt3431 * local73 / local20];
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3735(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass75_41.method2410(arg0);
		if (super.aClass75_41.aBoolean134) {
			@Pc(28) int local28 = Static157.anInt3431 / this.anInt1995;
			@Pc(33) int local33 = Static187.anInt4033 / this.anInt1996;
			@Pc(49) int[][] local49;
			if (local33 > 0) {
				@Pc(39) int local39 = arg0 % local33;
				local49 = this.method3737(0, local39 * Static187.anInt4033 / local33);
			} else {
				local49 = this.method3737(0, 0);
			}
			@Pc(61) int[] local61 = local49[2];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[0];
			@Pc(73) int[] local73 = local19[0];
			@Pc(77) int[] local77 = local19[1];
			@Pc(81) int[] local81 = local19[2];
			for (@Pc(83) int local83 = 0; local83 < Static157.anInt3431; local83++) {
				@Pc(92) int local92;
				if (local28 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local83 % local28;
					local92 = Static157.anInt3431 * local98 / local28;
				}
				local73[local83] = local69[local92];
				local77[local83] = local65[local92];
				local81[local83] = local61[local92];
			}
		}
		return local19;
	}
}
