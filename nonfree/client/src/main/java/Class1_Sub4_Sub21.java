import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class1_Sub4_Sub21 extends Class1_Sub4 {

	@OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
	private int anInt3792 = 4;

	@OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
	private int anInt3795 = 4;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method5691(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass50_41.method1086(arg0);
		if (super.aClass50_41.aBoolean131) {
			@Pc(25) int local25 = Static395.anInt6592 / this.anInt3792;
			@Pc(30) int local30 = Static186.anInt3223 / this.anInt3795;
			@Pc(49) int[][] local49;
			if (local30 > 0) {
				@Pc(39) int local39 = arg0 % local30;
				local49 = this.method5696(local39 * Static186.anInt3223 / local30, 0);
			} else {
				local49 = this.method5696(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local16[0];
			@Pc(77) int[] local77 = local16[1];
			@Pc(81) int[] local81 = local16[2];
			for (@Pc(83) int local83 = 0; local83 < Static395.anInt6592; local83++) {
				@Pc(89) int local89;
				if (local25 <= 0) {
					local89 = 0;
				} else {
					@Pc(95) int local95 = local83 % local25;
					local89 = local95 * Static395.anInt6592 / local25;
				}
				local73[local83] = local61[local89];
				local77[local83] = local65[local89];
				local81[local83] = local69[local89];
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5683(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass2_41.method10(arg0);
		if (super.aClass2_41.aBoolean5) {
			@Pc(25) int local25 = Static395.anInt6592 / this.anInt3792;
			@Pc(30) int local30 = Static186.anInt3223 / this.anInt3795;
			@Pc(38) int[] local38;
			@Pc(44) int local44;
			if (local30 <= 0) {
				local38 = this.method5695(0, 0);
			} else {
				local44 = arg0 % local30;
				local38 = this.method5695(local44 * Static186.anInt3223 / local30, 0);
			}
			for (local44 = 0; local44 < Static395.anInt6592; local44++) {
				if (local25 > 0) {
					@Pc(64) int local64 = local44 % local25;
					local16[local44] = local38[Static395.anInt6592 * local64 / local25];
				} else {
					local16[local44] = local38[0];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!ug;II)V")
	@Override
	public void method5690(@OriginalArg(0) Class1_Sub28 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3792 = arg0.method5337();
		} else if (arg1 == 1) {
			this.anInt3795 = arg0.method5337();
		}
	}
}
