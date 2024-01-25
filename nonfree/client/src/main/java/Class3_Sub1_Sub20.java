import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class3_Sub1_Sub20 extends Class3_Sub1 {

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
	private int anInt7194 = 4096;

	@OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
	private int anInt7191 = 4096;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
	private int anInt7196 = 4096;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(28) int[][] local28 = this.method9576(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static379.anInt5859; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local40[local54];
				@Pc(68) int local68 = local36[local54];
				if (local60 == local64 && local64 == local68) {
					local44[local54] = this.anInt7196 * local60 >> 12;
					local48[local54] = this.anInt7191 * local64 >> 12;
					local52[local54] = this.anInt7194 * local68 >> 12;
				} else {
					local44[local54] = this.anInt7196;
					local48[local54] = this.anInt7191;
					local52[local54] = this.anInt7194;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt7196 = arg1.method2028(-14795);
		} else if (arg0 == 1) {
			this.anInt7191 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			this.anInt7194 = arg1.method2028(-14795);
		}
	}
}
