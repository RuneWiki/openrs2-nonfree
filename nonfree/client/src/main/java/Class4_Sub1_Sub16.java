import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class4_Sub1_Sub16 extends Class4_Sub1 {

	@OriginalMember(owner = "client!kba", name = "E", descriptor = "I")
	private int anInt5005 = 4;

	@OriginalMember(owner = "client!kba", name = "I", descriptor = "I")
	private int anInt5008 = 4;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub16() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass84_41.method2457(arg0);
		if (super.aClass84_41.aBoolean194) {
			@Pc(25) int local25 = Static376.anInt7260 / this.anInt5008;
			@Pc(30) int local30 = Static477.anInt8774 / this.anInt5005;
			@Pc(43) int[][] local43;
			if (local30 <= 0) {
				local43 = this.method8385(0, 0);
			} else {
				@Pc(49) int local49 = arg0 % local30;
				local43 = this.method8385(local49 * Static477.anInt8774 / local30, 0);
			}
			@Pc(65) int[] local65 = local43[0];
			@Pc(69) int[] local69 = local43[1];
			@Pc(73) int[] local73 = local43[2];
			@Pc(77) int[] local77 = local11[0];
			@Pc(81) int[] local81 = local11[1];
			@Pc(85) int[] local85 = local11[2];
			for (@Pc(87) int local87 = 0; local87 < Static376.anInt7260; local87++) {
				@Pc(101) int local101;
				if (local25 > 0) {
					@Pc(95) int local95 = local87 % local25;
					local101 = Static376.anInt7260 * local95 / local25;
				} else {
					local101 = 0;
				}
				local77[local87] = local65[local101];
				local81[local87] = local69[local101];
				local85[local87] = local73[local101];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(28) int local28 = Static376.anInt7260 / this.anInt5008;
			@Pc(33) int local33 = Static477.anInt8774 / this.anInt5005;
			@Pc(41) int[] local41;
			@Pc(47) int local47;
			if (local33 <= 0) {
				local41 = this.method8392(0, 0);
			} else {
				local47 = arg0 % local33;
				local41 = this.method8392(Static477.anInt8774 * local47 / local33, 0);
			}
			for (local47 = 0; local47 < Static376.anInt7260; local47++) {
				if (local28 <= 0) {
					local19[local47] = local41[0];
				} else {
					@Pc(75) int local75 = local47 % local28;
					local19[local47] = local41[Static376.anInt7260 * local75 / local28];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt5008 = arg1.method4905();
		} else if (arg0 == 1) {
			this.anInt5005 = arg1.method4905();
		}
	}
}
