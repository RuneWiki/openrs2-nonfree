import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class2_Sub1_Sub2_Sub6 extends Class2_Sub1_Sub2 {

	@OriginalMember(owner = "client!q", name = "Lb", descriptor = "I")
	private final int anInt2269;

	@OriginalMember(owner = "client!q", name = "Rb", descriptor = "I")
	private final int anInt2272;

	@OriginalMember(owner = "client!q", name = "Sb", descriptor = "I")
	private final int anInt2273;

	@OriginalMember(owner = "client!q", name = "Fb", descriptor = "I")
	private final int anInt2266;

	@OriginalMember(owner = "client!q", name = "ob", descriptor = "I")
	private final int anInt2257;

	@OriginalMember(owner = "client!q", name = "Nb", descriptor = "I")
	private final int anInt2270;

	@OriginalMember(owner = "client!q", name = "wb", descriptor = "I")
	private final int anInt2262;

	@OriginalMember(owner = "client!q", name = "Ub", descriptor = "Lclient!aa;")
	private Class2_Sub1_Sub1 aClass2_Sub1_Sub1_3;

	@OriginalMember(owner = "client!q", name = "yb", descriptor = "I")
	private int anInt2264;

	@OriginalMember(owner = "client!q", name = "pb", descriptor = "I")
	private int anInt2258;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIIIIIIIZ)V")
	public Class2_Sub1_Sub2_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt2269 = arg2;
		this.anInt2272 = arg4;
		this.anInt2273 = arg3;
		this.anInt2266 = arg6;
		this.anInt2257 = arg5;
		this.anInt2270 = arg1;
		this.anInt2262 = arg0;
		if (arg7 != -1) {
			this.aClass2_Sub1_Sub1_3 = Static69.method1439(arg7);
			this.anInt2264 = Static64.anInt1889 - 1;
			this.anInt2258 = 0;
			if (arg8 && this.aClass2_Sub1_Sub1_3.anInt67 != -1) {
				this.anInt2258 = (int) (Math.random() * (double) this.aClass2_Sub1_Sub1_3.anIntArray7.length);
				this.anInt2264 -= (int) ((double) this.aClass2_Sub1_Sub1_3.anIntArray8[this.anInt2258] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "g", descriptor = "(I)Lclient!ga;")
	@Override
	protected Class2_Sub1_Sub2_Sub2 method2061() {
		if (this.aClass2_Sub1_Sub1_3 != null) {
			@Pc(14) int local14 = Static64.anInt1889 - this.anInt2264;
			if (local14 > 100 && this.aClass2_Sub1_Sub1_3.anInt67 > 0) {
				local14 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass2_Sub1_Sub1_3.anIntArray8[this.anInt2258] >= local14) {
							break label37;
						}
						local14 -= this.aClass2_Sub1_Sub1_3.anIntArray8[this.anInt2258];
						this.anInt2258++;
					} while (this.aClass2_Sub1_Sub1_3.anIntArray7.length > this.anInt2258);
					this.anInt2258 -= this.aClass2_Sub1_Sub1_3.anInt67;
				} while (this.anInt2258 >= 0 && this.anInt2258 < this.aClass2_Sub1_Sub1_3.anIntArray7.length);
				this.aClass2_Sub1_Sub1_3 = null;
			}
			this.anInt2264 = Static64.anInt1889 - local14;
		}
		@Pc(102) Class2_Sub1_Sub5 local102 = Static48.method916(this.anInt2262);
		if (local102.anIntArray61 != null) {
			local102 = local102.method422();
		}
		return local102 == null ? null : local102.method413(this.anInt2270, this.anInt2266, this.aClass2_Sub1_Sub1_3, this.anInt2257, this.anInt2272, this.anInt2269, this.anInt2273, this.anInt2258);
	}
}
