import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class1_Sub1_Sub39 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vh", name = "M", descriptor = "I")
	private int anInt5369 = 4096;

	@OriginalMember(owner = "client!vh", name = "S", descriptor = "I")
	private int anInt5374 = 0;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(28) int[][] local28 = this.method4456(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local11[0];
			@Pc(44) int[] local44 = local28[2];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static6.anInt4960; local54++) {
				@Pc(65) int local65 = local36[local54];
				@Pc(69) int local69 = local32[local54];
				@Pc(73) int local73 = local44[local54];
				if (this.anInt5374 > local69) {
					local40[local54] = this.anInt5374;
				} else if (local69 <= this.anInt5369) {
					local40[local54] = local69;
				} else {
					local40[local54] = this.anInt5369;
				}
				if (this.anInt5374 > local65) {
					local48[local54] = this.anInt5374;
				} else if (local65 > this.anInt5369) {
					local48[local54] = this.anInt5369;
				} else {
					local48[local54] = local65;
				}
				if (this.anInt5374 > local73) {
					local52[local54] = this.anInt5374;
				} else if (this.anInt5369 >= local73) {
					local52[local54] = local73;
				} else {
					local52[local54] = this.anInt5369;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5374 = arg0.method1879();
		} else if (arg1 == 1) {
			this.anInt5369 = arg0.method1879();
		} else if (arg1 == 2) {
			this.aBoolean505 = arg0.method1853() == 1;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(28) int[] local28 = this.method4464(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static6.anInt4960; local30++) {
				@Pc(41) int local41 = local28[local30];
				if (local41 < this.anInt5374) {
					local17[local30] = this.anInt5374;
				} else if (this.anInt5369 < local41) {
					local17[local30] = this.anInt5369;
				} else {
					local17[local30] = local41;
				}
			}
		}
		return local17;
	}
}
