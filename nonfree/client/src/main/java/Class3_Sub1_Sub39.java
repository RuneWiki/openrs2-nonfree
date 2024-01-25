import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class3_Sub1_Sub39 extends Class3_Sub1 {

	@OriginalMember(owner = "client!wu", name = "D", descriptor = "I")
	private int anInt11250 = 4;

	@OriginalMember(owner = "client!wu", name = "H", descriptor = "I")
	private int anInt11251 = 4;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		@Pc(21) int[] local21 = super.aClass305_41.method6989(arg0);
		if (super.aClass305_41.aBoolean550) {
			@Pc(30) int local30 = Static379.anInt5859 / this.anInt11251;
			@Pc(35) int local35 = Static24.anInt740 / this.anInt11250;
			@Pc(46) int[] local46;
			@Pc(52) int local52;
			if (local35 <= 0) {
				local46 = this.method9577(0, 0);
			} else {
				local52 = arg0 % local35;
				local46 = this.method9577(0, local52 * Static24.anInt740 / local35);
			}
			for (local52 = 0; local52 < Static379.anInt5859; local52++) {
				if (local30 <= 0) {
					local21[local52] = local46[0];
				} else {
					@Pc(86) int local86 = local52 % local30;
					local21[local52] = local46[local86 * Static379.anInt5859 / local30];
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(18) int[][] local18 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(27) int local27 = Static379.anInt5859 / this.anInt11251;
			@Pc(32) int local32 = Static24.anInt740 / this.anInt11250;
			@Pc(51) int[][] local51;
			if (local32 > 0) {
				@Pc(41) int local41 = arg0 % local32;
				local51 = this.method9576(local41 * Static24.anInt740 / local32, 0);
			} else {
				local51 = this.method9576(0, 0);
			}
			@Pc(63) int[] local63 = local51[0];
			@Pc(67) int[] local67 = local51[1];
			@Pc(71) int[] local71 = local51[2];
			@Pc(75) int[] local75 = local18[0];
			@Pc(79) int[] local79 = local18[1];
			@Pc(83) int[] local83 = local18[2];
			for (@Pc(85) int local85 = 0; local85 < Static379.anInt5859; local85++) {
				@Pc(104) int local104;
				if (local27 > 0) {
					@Pc(98) int local98 = local85 % local27;
					local104 = Static379.anInt5859 * local98 / local27;
				} else {
					local104 = 0;
				}
				local75[local85] = local63[local104];
				local79[local85] = local67[local104];
				local83[local85] = local71[local104];
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt11251 = arg1.method2048(255);
		} else if (arg0 == 1) {
			this.anInt11250 = arg1.method2048(255);
		}
	}
}
