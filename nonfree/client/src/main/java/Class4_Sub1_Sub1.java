import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "I")
	private int anInt71 = 4096;

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "I")
	private int anInt75 = 4096;

	@OriginalMember(owner = "client!ad", name = "U", descriptor = "I")
	private int anInt78 = 4096;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub1() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILclient!pi;)V")
	@Override
	public void method4545(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub24 arg1) {
		if (arg0 == 0) {
			this.anInt75 = arg1.method3085();
		} else if (arg0 == 1) {
			this.anInt78 = arg1.method3085();
		} else if (arg0 == 2) {
			this.anInt71 = arg1.method3085();
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4542(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass113_41.method2911(arg0);
		if (this.aClass113_41.aBoolean232) {
			@Pc(28) int[][] local28 = this.method4549(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local17[0];
			@Pc(48) int[] local48 = local17[2];
			@Pc(52) int[] local52 = local17[1];
			for (@Pc(54) int local54 = 0; local54 < Static68.anInt1753; local54++) {
				@Pc(65) int local65 = local40[local54];
				@Pc(69) int local69 = local32[local54];
				@Pc(73) int local73 = local36[local54];
				if (local69 == local65 && local73 == local65) {
					local44[local54] = local69 * this.anInt75 >> 12;
					local52[local54] = this.anInt78 * local65 >> 12;
					local48[local54] = local73 * this.anInt71 >> 12;
				} else {
					local44[local54] = this.anInt75;
					local52[local54] = this.anInt78;
					local48[local54] = this.anInt71;
				}
			}
		}
		return local17;
	}
}
