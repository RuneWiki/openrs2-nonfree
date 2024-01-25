import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!be")
public final class Class6_Sub4_Sub3 extends Class6_Sub4 {

	@OriginalMember(owner = "client!be", name = "F", descriptor = "I")
	private int anInt911 = 4;

	@OriginalMember(owner = "client!be", name = "G", descriptor = "I")
	private int anInt912 = 4;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(28) int local28 = Static408.anInt7209 / this.anInt911;
			@Pc(33) int local33 = Static88.anInt1743 / this.anInt912;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local33 > 0) {
				local39 = arg0 % local33;
				local49 = this.method7748(0, Static88.anInt1743 * local39 / local33);
			} else {
				local49 = this.method7748(0, 0);
			}
			for (local39 = 0; local39 < Static408.anInt7209; local39++) {
				if (local28 <= 0) {
					local19[local39] = local49[0];
				} else {
					@Pc(75) int local75 = local39 % local28;
					local19[local39] = local49[Static408.anInt7209 * local75 / local28];
				}
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt911 = arg1.method6069();
		} else if (arg0 == 1) {
			this.anInt912 = arg1.method6069();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7757(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass27_41.method911(arg0);
		if (super.aClass27_41.aBoolean54) {
			@Pc(28) int local28 = Static408.anInt7209 / this.anInt911;
			@Pc(33) int local33 = Static88.anInt1743 / this.anInt912;
			@Pc(49) int[][] local49;
			if (local33 > 0) {
				@Pc(39) int local39 = arg0 % local33;
				local49 = this.method7747(local39 * Static88.anInt1743 / local33, 0);
			} else {
				local49 = this.method7747(0, 0);
			}
			@Pc(61) int[] local61 = local49[0];
			@Pc(65) int[] local65 = local49[1];
			@Pc(69) int[] local69 = local49[2];
			@Pc(73) int[] local73 = local11[0];
			@Pc(77) int[] local77 = local11[1];
			@Pc(81) int[] local81 = local11[2];
			for (@Pc(83) int local83 = 0; local83 < Static408.anInt7209; local83++) {
				@Pc(92) int local92;
				if (local28 <= 0) {
					local92 = 0;
				} else {
					@Pc(98) int local98 = local83 % local28;
					local92 = Static408.anInt7209 * local98 / local28;
				}
				local73[local83] = local61[local92];
				local77[local83] = local65[local92];
				local81[local83] = local69[local92];
			}
		}
		return local11;
	}
}
