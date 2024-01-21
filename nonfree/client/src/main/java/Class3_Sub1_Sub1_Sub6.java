import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class3_Sub1_Sub1_Sub6 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!wc", name = "Ib", descriptor = "I")
	private final int anInt2830;

	@OriginalMember(owner = "client!wc", name = "Fb", descriptor = "I")
	private final int anInt2828;

	@OriginalMember(owner = "client!wc", name = "tb", descriptor = "I")
	private final int anInt2820;

	@OriginalMember(owner = "client!wc", name = "wb", descriptor = "I")
	private final int anInt2822;

	@OriginalMember(owner = "client!wc", name = "Bb", descriptor = "I")
	private final int anInt2826;

	@OriginalMember(owner = "client!wc", name = "zb", descriptor = "I")
	private final int anInt2824;

	@OriginalMember(owner = "client!wc", name = "Sb", descriptor = "I")
	private final int anInt2838;

	@OriginalMember(owner = "client!wc", name = "xb", descriptor = "Lclient!m;")
	private Class3_Sub1_Sub6 aClass3_Sub1_Sub6_3;

	@OriginalMember(owner = "client!wc", name = "Jb", descriptor = "I")
	private int anInt2831;

	@OriginalMember(owner = "client!wc", name = "Pb", descriptor = "I")
	private int anInt2835;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIIIIIZ)V")
	public Class3_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt2830 = arg4;
		this.anInt2828 = arg0;
		this.anInt2820 = arg3;
		this.anInt2822 = arg2;
		this.anInt2826 = arg6;
		this.anInt2824 = arg5;
		this.anInt2838 = arg1;
		if (arg7 != -1) {
			this.aClass3_Sub1_Sub6_3 = Static67.method1107(arg7);
			this.anInt2831 = Static60.anInt1489 - 1;
			this.anInt2835 = 0;
			if (arg8 && this.aClass3_Sub1_Sub6_3.anInt1593 != -1) {
				this.anInt2835 = (int) ((double) this.aClass3_Sub1_Sub6_3.anIntArray220.length * Math.random());
				this.anInt2831 -= (int) ((double) this.aClass3_Sub1_Sub6_3.anIntArray224[this.anInt2835] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)Lclient!hc;")
	@Override
	public Class3_Sub1_Sub1_Sub4 method1920() {
		if (this.aClass3_Sub1_Sub6_3 != null) {
			@Pc(14) int local14 = Static60.anInt1489 - this.anInt2831;
			if (local14 > 100 && this.aClass3_Sub1_Sub6_3.anInt1593 > 0) {
				local14 = 100;
			}
			label37: {
				do {
					do {
						if (local14 <= this.aClass3_Sub1_Sub6_3.anIntArray224[this.anInt2835]) {
							break label37;
						}
						local14 -= this.aClass3_Sub1_Sub6_3.anIntArray224[this.anInt2835];
						this.anInt2835++;
					} while (this.anInt2835 < this.aClass3_Sub1_Sub6_3.anIntArray220.length);
					this.anInt2835 -= this.aClass3_Sub1_Sub6_3.anInt1593;
				} while (this.anInt2835 >= 0 && this.aClass3_Sub1_Sub6_3.anIntArray220.length > this.anInt2835);
				this.aClass3_Sub1_Sub6_3 = null;
			}
			this.anInt2831 = Static60.anInt1489 - local14;
		}
		@Pc(99) Class3_Sub1_Sub5 local99 = Static38.method1911(this.anInt2828);
		if (local99.anIntArray215 != null) {
			local99 = local99.method1030();
		}
		return local99 == null ? null : local99.method1027(this.anInt2822, this.anInt2830, this.aClass3_Sub1_Sub6_3, this.anInt2824, this.anInt2820, this.anInt2835, this.anInt2838, this.anInt2826);
	}
}
