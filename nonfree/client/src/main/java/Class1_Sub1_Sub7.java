import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
	private int anInt1011 = 4096;

	@OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
	private int anInt1014 = 4096;

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
	private int anInt1016 = 4096;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(28) int[][] local28 = this.method6006(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static85.anInt1910; local54++) {
				@Pc(60) int local60 = local32[local54];
				@Pc(64) int local64 = local40[local54];
				@Pc(68) int local68 = local36[local54];
				if (local64 == local60 && local64 == local68) {
					local44[local54] = local60 * this.anInt1014 >> 12;
					local48[local54] = this.anInt1011 * local64 >> 12;
					local52[local54] = local68 * this.anInt1016 >> 12;
				} else {
					local44[local54] = this.anInt1014;
					local48[local54] = this.anInt1011;
					local52[local54] = this.anInt1016;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt1014 = arg1.method2161();
		} else if (arg0 == 1) {
			this.anInt1011 = arg1.method2161();
		} else if (arg0 == 2) {
			this.anInt1016 = arg1.method2161();
		}
	}
}
