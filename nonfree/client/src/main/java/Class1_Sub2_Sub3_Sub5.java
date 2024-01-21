import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class1_Sub2_Sub3_Sub5 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!qa", name = "yb", descriptor = "I")
	private final int anInt2296;

	@OriginalMember(owner = "client!qa", name = "bb", descriptor = "I")
	private final int anInt2287;

	@OriginalMember(owner = "client!qa", name = "xb", descriptor = "I")
	private final int anInt2295;

	@OriginalMember(owner = "client!qa", name = "Gb", descriptor = "I")
	private final int anInt2302;

	@OriginalMember(owner = "client!qa", name = "wb", descriptor = "I")
	private final int anInt2294;

	@OriginalMember(owner = "client!qa", name = "Ab", descriptor = "I")
	private final int anInt2298;

	@OriginalMember(owner = "client!qa", name = "Cb", descriptor = "I")
	private final int anInt2299;

	@OriginalMember(owner = "client!qa", name = "pb", descriptor = "Lclient!qe;")
	private Class1_Sub2_Sub17 aClass1_Sub2_Sub17_2;

	@OriginalMember(owner = "client!qa", name = "Eb", descriptor = "I")
	private int anInt2301;

	@OriginalMember(owner = "client!qa", name = "rb", descriptor = "I")
	private int anInt2292;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(IIIIIIIIZLclient!qb;)V")
	public Class1_Sub2_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class1_Sub2_Sub3 arg9) {
		this.anInt2296 = arg2;
		this.anInt2287 = arg4;
		this.anInt2295 = arg6;
		this.anInt2302 = arg0;
		this.anInt2294 = arg3;
		this.anInt2298 = arg1;
		this.anInt2299 = arg5;
		if (arg7 != -1) {
			this.aClass1_Sub2_Sub17_2 = Static34.method755(arg7);
			this.anInt2301 = Static60.anInt1366 - 1;
			this.anInt2292 = 0;
			if (this.aClass1_Sub2_Sub17_2.anInt2338 == 0 && arg9 != null && arg9 instanceof Class1_Sub2_Sub3_Sub5) {
				@Pc(53) Class1_Sub2_Sub3_Sub5 local53 = (Class1_Sub2_Sub3_Sub5) arg9;
				if (local53.aClass1_Sub2_Sub17_2 == this.aClass1_Sub2_Sub17_2) {
					this.anInt2301 = local53.anInt2301;
					this.anInt2292 = local53.anInt2292;
					return;
				}
			}
			if (arg8 && this.aClass1_Sub2_Sub17_2.anInt2348 != -1) {
				this.anInt2292 = (int) (Math.random() * (double) this.aClass1_Sub2_Sub17_2.anIntArray410.length);
				this.anInt2301 -= (int) ((double) this.aClass1_Sub2_Sub17_2.anIntArray406[this.anInt2292] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)Lclient!da;")
	@Override
	public Class1_Sub2_Sub3_Sub2 method1969() {
		if (this.aClass1_Sub2_Sub17_2 != null) {
			@Pc(14) int local14 = Static60.anInt1366 - this.anInt2301;
			if (local14 > 100 && this.aClass1_Sub2_Sub17_2.anInt2348 > 0) {
				local14 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass1_Sub2_Sub17_2.anIntArray406[this.anInt2292] >= local14) {
							break label37;
						}
						local14 -= this.aClass1_Sub2_Sub17_2.anIntArray406[this.anInt2292];
						this.anInt2292++;
					} while (this.aClass1_Sub2_Sub17_2.anIntArray410.length > this.anInt2292);
					this.anInt2292 -= this.aClass1_Sub2_Sub17_2.anInt2348;
				} while (this.anInt2292 >= 0 && this.anInt2292 < this.aClass1_Sub2_Sub17_2.anIntArray410.length);
				this.aClass1_Sub2_Sub17_2 = null;
			}
			this.anInt2301 = Static60.anInt1366 - local14;
		}
		@Pc(102) Class1_Sub2_Sub6 local102 = Static78.method1315(this.anInt2302);
		if (local102.anIntArray171 != null) {
			local102 = local102.method707();
		}
		return local102 == null ? null : local102.method703(this.anInt2295, this.aClass1_Sub2_Sub17_2, this.anInt2296, this.anInt2287, this.anInt2292, this.anInt2294, this.anInt2299, this.anInt2298);
	}
}
