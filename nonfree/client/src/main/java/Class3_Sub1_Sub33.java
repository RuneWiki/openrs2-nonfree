import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class3_Sub1_Sub33 extends Class3_Sub1 {

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "I")
	private int anInt5135 = 4;

	@OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
	private int anInt5142 = 4;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5541(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass206_41.method4681(arg0);
		if (super.aClass206_41.aBoolean409) {
			@Pc(20) int local20 = Static238.anInt4221 / this.anInt5142;
			@Pc(25) int local25 = Static220.anInt3914 / this.anInt5135;
			@Pc(41) int[][] local41;
			if (local25 > 0) {
				@Pc(31) int local31 = arg0 % local25;
				local41 = this.method5551(0, local31 * Static220.anInt3914 / local25);
			} else {
				local41 = this.method5551(0, 0);
			}
			@Pc(53) int[] local53 = local41[0];
			@Pc(57) int[] local57 = local41[1];
			@Pc(61) int[] local61 = local41[2];
			@Pc(65) int[] local65 = local11[0];
			@Pc(69) int[] local69 = local11[1];
			@Pc(73) int[] local73 = local11[2];
			for (@Pc(75) int local75 = 0; local75 < Static238.anInt4221; local75++) {
				@Pc(81) int local81;
				if (local20 <= 0) {
					local81 = 0;
				} else {
					@Pc(87) int local87 = local75 % local20;
					local81 = Static238.anInt4221 * local87 / local20;
				}
				local65[local75] = local53[local81];
				local69[local75] = local57[local81];
				local73[local75] = local61[local81];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5142 = arg0.method2739();
		} else if (arg1 == 1) {
			this.anInt5135 = arg0.method2739();
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(26) int local26 = Static238.anInt4221 / this.anInt5142;
			@Pc(31) int local31 = Static220.anInt3914 / this.anInt5135;
			@Pc(50) int[] local50;
			@Pc(40) int local40;
			if (local31 > 0) {
				local40 = arg0 % local31;
				local50 = this.method5547(Static220.anInt3914 * local40 / local31, 0);
			} else {
				local50 = this.method5547(0, 0);
			}
			for (local40 = 0; local40 < Static238.anInt4221; local40++) {
				if (local26 <= 0) {
					local11[local40] = local50[0];
				} else {
					@Pc(79) int local79 = local40 % local26;
					local11[local40] = local50[local79 * Static238.anInt4221 / local26];
				}
			}
		}
		return local11;
	}
}
