import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class3_Sub3_Sub18 extends Class3_Sub3 {

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
	private int anInt3182 = 4;

	@OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
	private int anInt3188 = 4;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub18() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			@Pc(26) int local26 = Static131.anInt2755 / this.anInt3182;
			@Pc(31) int local31 = Static182.anInt3888 / this.anInt3188;
			@Pc(47) int[] local47;
			@Pc(37) int local37;
			if (local31 > 0) {
				local37 = arg0 % local31;
				local47 = this.method5733(local37 * Static182.anInt3888 / local31, 0);
			} else {
				local47 = this.method5733(0, 0);
			}
			for (local37 = 0; local37 < Static131.anInt2755; local37++) {
				if (local26 > 0) {
					@Pc(68) int local68 = local37 % local26;
					local17[local37] = local47[Static131.anInt2755 * local68 / local26];
				} else {
					local17[local37] = local47[0];
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method5734(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2091(arg0);
		if (super.aClass84_41.aBoolean144) {
			@Pc(25) int local25 = Static131.anInt2755 / this.anInt3182;
			@Pc(30) int local30 = Static182.anInt3888 / this.anInt3188;
			@Pc(49) int[][] local49;
			if (local30 > 0) {
				@Pc(39) int local39 = arg0 % local30;
				local49 = this.method5729(0, Static182.anInt3888 * local39 / local30);
			} else {
				local49 = this.method5729(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static131.anInt2755; local83++) {
				@Pc(92) int local92;
				if (local25 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local83 % local25;
					local92 = local98 * Static131.anInt2755 / local25;
				}
				local73[local83] = local61[local92];
				local77[local83] = local65[local92];
				local81[local83] = local69[local92];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3182 = arg0.method3643();
		} else if (arg1 == 1) {
			this.anInt3188 = arg0.method3643();
		}
	}
}
