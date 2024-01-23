import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
	private int anInt5291 = 409;

	@OriginalMember(owner = "client!ua", name = "P", descriptor = "[I")
	private int[] anIntArray617 = new int[3];

	@OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
	private int anInt5292 = 4096;

	@OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
	private int anInt5296 = 4096;

	@OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
	private int anInt5295 = 4096;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLclient!jj;I)V")
	@Override
	public void method4446(@OriginalArg(1) Class1_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5291 = arg0.method3107();
		} else if (arg1 == 1) {
			this.anInt5292 = arg0.method3107();
		} else if (arg1 == 2) {
			this.anInt5296 = arg0.method3107();
		} else if (arg1 == 3) {
			this.anInt5295 = arg0.method3107();
		} else if (arg1 == 4) {
			@Pc(68) int local68 = arg0.method3109();
			this.anIntArray617[2] = local68 >> 12 & 0x0;
			this.anIntArray617[1] = local68 >> 4 & 0xFF0;
			this.anIntArray617[0] = (local68 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method4444(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = this.aClass153_41.method3955(arg0);
		if (this.aClass153_41.aBoolean396) {
			@Pc(28) int[][] local28 = this.method4457(0, arg0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local17[0];
			@Pc(48) int[] local48 = local17[2];
			@Pc(52) int[] local52 = local17[1];
			for (@Pc(54) int local54 = 0; local54 < Static131.anInt2513; local54++) {
				@Pc(65) int local65 = local32[local54];
				@Pc(73) int local73 = local65 - this.anIntArray617[0];
				if (local73 < 0) {
					local73 = -local73;
				}
				if (local73 <= this.anInt5291) {
					@Pc(111) int local111 = local36[local54];
					local73 = local111 - this.anIntArray617[1];
					if (local73 < 0) {
						local73 = -local73;
					}
					if (local73 <= this.anInt5291) {
						@Pc(156) int local156 = local40[local54];
						local73 = local156 - this.anIntArray617[2];
						if (local73 < 0) {
							local73 = -local73;
						}
						if (local73 <= this.anInt5291) {
							local44[local54] = this.anInt5295 * local65 >> 12;
							local52[local54] = this.anInt5296 * local111 >> 12;
							local48[local54] = local156 * this.anInt5292 >> 12;
						} else {
							local44[local54] = local65;
							local52[local54] = local111;
							local48[local54] = local156;
						}
					} else {
						local44[local54] = local65;
						local52[local54] = local111;
						local48[local54] = local40[local54];
					}
				} else {
					local44[local54] = local65;
					local52[local54] = local36[local54];
					local48[local54] = local40[local54];
				}
			}
		}
		return local17;
	}
}
