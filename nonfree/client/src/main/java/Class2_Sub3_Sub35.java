import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class2_Sub3_Sub35 extends Class2_Sub3 {

	@OriginalMember(owner = "client!us", name = "O", descriptor = "I")
	private int anInt6525 = 4;

	@OriginalMember(owner = "client!us", name = "U", descriptor = "I")
	private int anInt6529 = 4;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub35() {
		super(1, false);
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method5702(@OriginalArg(1) int arg0) {
		@Pc(23) int[][] local23 = super.aClass90_41.method2391(arg0);
		if (super.aClass90_41.aBoolean257) {
			@Pc(32) int local32 = Static263.anInt5504 / this.anInt6525;
			@Pc(37) int local37 = Static363.anInt6995 / this.anInt6529;
			@Pc(45) int[][] local45;
			if (local37 <= 0) {
				local45 = this.method5707(0, 0);
			} else {
				@Pc(51) int local51 = arg0 % local37;
				local45 = this.method5707(Static363.anInt6995 * local51 / local37, 0);
			}
			@Pc(65) int[] local65 = local45[0];
			@Pc(69) int[] local69 = local45[1];
			@Pc(73) int[] local73 = local45[2];
			@Pc(77) int[] local77 = local23[0];
			@Pc(81) int[] local81 = local23[1];
			@Pc(85) int[] local85 = local23[2];
			for (@Pc(87) int local87 = 0; local87 < Static263.anInt5504; local87++) {
				@Pc(93) int local93;
				if (local32 <= 0) {
					local93 = 0;
				} else {
					@Pc(99) int local99 = local87 % local32;
					local93 = Static263.anInt5504 * local99 / local32;
				}
				local77[local87] = local65[local93];
				local81[local87] = local69[local93];
				local85[local87] = local73[local93];
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IILclient!ef;)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt6525 = arg1.method3124();
		} else if (arg0 == 1) {
			this.anInt6529 = arg1.method3124();
		}
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass137_41.method3984(arg0);
		if (super.aClass137_41.aBoolean400) {
			@Pc(32) int local32 = Static263.anInt5504 / this.anInt6525;
			@Pc(37) int local37 = Static363.anInt6995 / this.anInt6529;
			@Pc(53) int[] local53;
			@Pc(43) int local43;
			if (local37 > 0) {
				local43 = arg0 % local37;
				local53 = this.method5700(0, Static363.anInt6995 * local43 / local37);
			} else {
				local53 = this.method5700(0, 0);
			}
			for (local43 = 0; local43 < Static263.anInt5504; local43++) {
				if (local32 > 0) {
					@Pc(74) int local74 = local43 % local32;
					local13[local43] = local53[local74 * Static263.anInt5504 / local32];
				} else {
					local13[local43] = local53[0];
				}
			}
		}
		return local13;
	}
}
