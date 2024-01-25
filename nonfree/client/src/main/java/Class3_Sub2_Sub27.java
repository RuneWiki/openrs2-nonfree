import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class3_Sub2_Sub27 extends Class3_Sub2 {

	@OriginalMember(owner = "client!o", name = "H", descriptor = "I")
	private int anInt6997 = 4;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "I")
	private int anInt6998 = 4;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub27() {
		super(1, false);
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6997 = arg0.method5633();
		} else if (arg1 == 1) {
			this.anInt6998 = arg0.method5633();
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8665(@OriginalArg(1) int arg0) {
		@Pc(19) int[][] local19 = super.aClass296_41.method7238(arg0);
		if (super.aClass296_41.aBoolean608) {
			@Pc(28) int local28 = Static201.anInt3738 / this.anInt6997;
			@Pc(33) int local33 = Static414.anInt7271 / this.anInt6998;
			@Pc(41) int[][] local41;
			if (local33 <= 0) {
				local41 = this.method8672(0, 0);
			} else {
				@Pc(47) int local47 = arg0 % local33;
				local41 = this.method8672(0, Static414.anInt7271 * local47 / local33);
			}
			@Pc(61) int[] local61 = local41[0];
			@Pc(65) int[] local65 = local41[1];
			@Pc(69) int[] local69 = local41[2];
			@Pc(73) int[] local73 = local19[0];
			@Pc(77) int[] local77 = local19[1];
			@Pc(81) int[] local81 = local19[2];
			for (@Pc(83) int local83 = 0; local83 < Static201.anInt3738; local83++) {
				@Pc(97) int local97;
				if (local28 > 0) {
					@Pc(91) int local91 = local83 % local28;
					local97 = local91 * Static201.anInt3738 / local28;
				} else {
					local97 = 0;
				}
				local73[local83] = local61[local97];
				local77[local83] = local65[local97];
				local81[local83] = local69[local97];
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(28) int local28 = Static201.anInt3738 / this.anInt6997;
			@Pc(33) int local33 = Static414.anInt7271 / this.anInt6998;
			@Pc(44) int[] local44;
			@Pc(50) int local50;
			if (local33 <= 0) {
				local44 = this.method8669(0, 0);
			} else {
				local50 = arg0 % local33;
				local44 = this.method8669(Static414.anInt7271 * local50 / local33, 0);
			}
			for (local50 = 0; local50 < Static201.anInt3738; local50++) {
				if (local28 <= 0) {
					local19[local50] = local44[0];
				} else {
					@Pc(81) int local81 = local50 % local28;
					local19[local50] = local44[Static201.anInt3738 * local81 / local28];
				}
			}
		}
		return local19;
	}
}
