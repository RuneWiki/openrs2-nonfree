import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ca", name = "X", descriptor = "I")
	private int anInt501 = 4096;

	@OriginalMember(owner = "client!ca", name = "cb", descriptor = "I")
	private int anInt505 = 4096;

	@OriginalMember(owner = "client!ca", name = "fb", descriptor = "I")
	private int anInt508 = 4096;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub3() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLclient!fd;I)V")
	@Override
	public void method4724(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt505 = arg0.method4653();
		} else if (arg1 == 1) {
			this.anInt501 = arg0.method4653();
		} else if (arg1 == 2) {
			this.anInt508 = arg0.method4653();
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4732(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = this.aClass116_41.method2709(arg0);
		if (this.aClass116_41.aBoolean230) {
			@Pc(28) int[][] local28 = this.method4723(0, arg0);
			@Pc(32) int[] local32 = local28[1];
			@Pc(36) int[] local36 = local28[0];
			@Pc(40) int[] local40 = local18[0];
			@Pc(44) int[] local44 = local18[1];
			@Pc(48) int[] local48 = local28[2];
			@Pc(52) int[] local52 = local18[2];
			for (@Pc(54) int local54 = 0; local54 < Static73.anInt1626; local54++) {
				@Pc(61) int local61 = local36[local54];
				@Pc(65) int local65 = local48[local54];
				@Pc(69) int local69 = local32[local54];
				if (local65 == local61 && local65 == local69) {
					local40[local54] = this.anInt505 * local61 >> 12;
					local44[local54] = local65 * this.anInt501 >> 12;
					local52[local54] = this.anInt508 * local69 >> 12;
				} else {
					local40[local54] = this.anInt505;
					local44[local54] = this.anInt501;
					local52[local54] = this.anInt508;
				}
			}
		}
		return local18;
	}
}
