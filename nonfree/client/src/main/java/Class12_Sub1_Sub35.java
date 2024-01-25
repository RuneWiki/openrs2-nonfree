import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class12_Sub1_Sub35 extends Class12_Sub1 {

	@OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
	private int anInt8996 = 4;

	@OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
	private int anInt8997 = 4;

	static {
		new Class88(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!daa;II)V")
	@Override
	public void method7794(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8996 = arg0.method5216();
		} else if (arg1 == 1) {
			this.anInt8997 = arg0.method5216();
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method7793(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass53_41.method1462(arg0);
		if (super.aClass53_41.aBoolean108) {
			@Pc(25) int local25 = Static357.anInt6670 / this.anInt8996;
			@Pc(30) int local30 = Static138.anInt3102 / this.anInt8997;
			@Pc(41) int[][] local41;
			if (local30 <= 0) {
				local41 = this.method7790(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local30;
				local41 = this.method7790(0, Static138.anInt3102 * local47 / local30);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static357.anInt6670; local83++) {
				@Pc(100) int local100;
				if (local25 > 0) {
					@Pc(94) int local94 = local83 % local25;
					local100 = local94 * Static357.anInt6670 / local25;
				} else {
					local100 = 0;
				}
				local73[local83] = local61[local100];
				local77[local83] = local65[local100];
				local81[local83] = local69[local100];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7798(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass174_41.method4392(arg0);
		if (super.aClass174_41.aBoolean403) {
			@Pc(27) int local27 = Static357.anInt6670 / this.anInt8996;
			@Pc(32) int local32 = Static138.anInt3102 / this.anInt8997;
			@Pc(40) int[] local40;
			@Pc(46) int local46;
			if (local32 <= 0) {
				local40 = this.method7795(0, 0);
			} else {
				local46 = arg0 % local32;
				local40 = this.method7795(0, local46 * Static138.anInt3102 / local32);
			}
			for (local46 = 0; local46 < Static357.anInt6670; local46++) {
				if (local27 <= 0) {
					local11[local46] = local40[0];
				} else {
					@Pc(77) int local77 = local46 % local27;
					local11[local46] = local40[Static357.anInt6670 * local77 / local27];
				}
			}
		}
		return local11;
	}
}
