import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fg", name = "Z", descriptor = "I")
	private int anInt1289;

	@OriginalMember(owner = "client!fg", name = "fb", descriptor = "I")
	private int anInt1292;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3130(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass22_39.method849(arg0);
		if (super.aClass22_39.aBoolean53) {
			@Pc(25) int local25 = Static104.anInt2685 / this.anInt1289;
			@Pc(30) int local30 = Static129.anInt3285 / this.anInt1292;
			@Pc(49) int[] local49;
			@Pc(39) int local39;
			if (local25 > 0) {
				local39 = arg0 % local25;
				local49 = this.method3120(0, Static104.anInt2685 * local39 / local25);
			} else {
				local49 = this.method3120(0, 0);
			}
			for (local39 = 0; local39 < Static129.anInt3285; local39++) {
				if (local30 <= 0) {
					local16[local39] = local49[0];
				} else {
					@Pc(75) int local75 = local39 % local30;
					local16[local39] = local49[local75 * Static129.anInt3285 / local30];
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1292 = arg1.method1545();
		} else if (arg0 == 1) {
			this.anInt1289 = arg1.method1545();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(28) int local28 = Static129.anInt3285 / this.anInt1292;
			@Pc(33) int local33 = Static104.anInt2685 / this.anInt1289;
			@Pc(41) int[][] local41;
			if (local33 <= 0) {
				local41 = this.method3124(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local33;
				local41 = this.method3124(0, Static104.anInt2685 * local47 / local33);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local7[0];
			@Pc(73) int[] local73 = local41[2];
			@Pc(77) int[] local77 = local7[2];
			@Pc(81) int[] local81 = local7[1];
			for (@Pc(83) int local83 = 0; local83 < Static129.anInt3285; local83++) {
				@Pc(100) int local100;
				if (local28 > 0) {
					@Pc(94) int local94 = local83 % local28;
					local100 = local94 * Static129.anInt3285 / local28;
				} else {
					local100 = 0;
				}
				local69[local83] = local61[local100];
				local81[local83] = local65[local100];
				local77[local83] = local73[local100];
			}
		}
		return local7;
	}
}
