import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	private int anInt678 = 4;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
	private int anInt677 = 4;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt677 = arg1.method7974();
		} else if (arg0 == 1) {
			this.anInt678 = arg1.method7974();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(25) int local25 = Static501.anInt8748 / this.anInt677;
			@Pc(30) int local30 = Static8.anInt5990 / this.anInt678;
			@Pc(49) int[][] local49;
			if (local30 > 0) {
				@Pc(39) int local39 = arg0 % local30;
				local49 = this.method7833(0, Static8.anInt5990 * local39 / local30);
			} else {
				local49 = this.method7833(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local16[0];
			@Pc(77) int[] local77 = local16[1];
			@Pc(81) int[] local81 = local16[2];
			for (@Pc(83) int local83 = 0; local83 < Static501.anInt8748; local83++) {
				@Pc(92) int local92;
				if (local25 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local83 % local25;
					local92 = Static501.anInt8748 * local98 / local25;
				}
				local73[local83] = local61[local92];
				local77[local83] = local65[local92];
				local81[local83] = local69[local92];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass152_41.method3216(arg0);
		if (super.aClass152_41.aBoolean282) {
			@Pc(25) int local25 = Static501.anInt8748 / this.anInt677;
			@Pc(30) int local30 = Static8.anInt5990 / this.anInt678;
			@Pc(38) int[] local38;
			@Pc(44) int local44;
			if (local30 <= 0) {
				local38 = this.method7836(0, 0);
			} else {
				local44 = arg0 % local30;
				local38 = this.method7836(local44 * Static8.anInt5990 / local30, 0);
			}
			for (local44 = 0; local44 < Static501.anInt8748; local44++) {
				if (local25 > 0) {
					@Pc(67) int local67 = local44 % local25;
					local11[local44] = local38[Static501.anInt8748 * local67 / local25];
				} else {
					local11[local44] = local38[0];
				}
			}
		}
		return local11;
	}
}
