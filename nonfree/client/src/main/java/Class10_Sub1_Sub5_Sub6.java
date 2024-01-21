import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class10_Sub1_Sub5_Sub6 extends Class10_Sub1_Sub5 {

	@OriginalMember(owner = "client!wc", name = "Cb", descriptor = "I")
	private final int anInt2696;

	@OriginalMember(owner = "client!wc", name = "fb", descriptor = "I")
	private final int anInt2679;

	@OriginalMember(owner = "client!wc", name = "nb", descriptor = "I")
	private final int anInt2686;

	@OriginalMember(owner = "client!wc", name = "Bb", descriptor = "I")
	private final int anInt2695;

	@OriginalMember(owner = "client!wc", name = "Fb", descriptor = "I")
	private final int anInt2697;

	@OriginalMember(owner = "client!wc", name = "tb", descriptor = "I")
	private final int anInt2688;

	@OriginalMember(owner = "client!wc", name = "rb", descriptor = "I")
	private final int anInt2687;

	@OriginalMember(owner = "client!wc", name = "qb", descriptor = "Lclient!ge;")
	private Class10_Sub1_Sub6 aClass10_Sub1_Sub6_3;

	@OriginalMember(owner = "client!wc", name = "hb", descriptor = "I")
	private int anInt2680;

	@OriginalMember(owner = "client!wc", name = "jb", descriptor = "I")
	private int anInt2682;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIIIIIZ)V")
	public Class10_Sub1_Sub5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt2696 = arg6;
		this.anInt2679 = arg3;
		this.anInt2686 = arg0;
		this.anInt2695 = arg4;
		this.anInt2697 = arg1;
		this.anInt2688 = arg2;
		this.anInt2687 = arg5;
		if (arg7 != -1) {
			this.aClass10_Sub1_Sub6_3 = Static5.method33(arg7);
			this.anInt2680 = Static95.anInt2442 - 1;
			this.anInt2682 = 0;
			if (arg8 && this.aClass10_Sub1_Sub6_3.anInt976 != -1) {
				this.anInt2682 = (int) ((double) this.aClass10_Sub1_Sub6_3.anIntArray106.length * Math.random());
				this.anInt2680 -= (int) (Math.random() * (double) this.aClass10_Sub1_Sub6_3.anIntArray109[this.anInt2682]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Lclient!rb;")
	@Override
	protected Class10_Sub1_Sub5_Sub4 method1663() {
		if (this.aClass10_Sub1_Sub6_3 != null) {
			@Pc(10) int local10 = Static95.anInt2442 - this.anInt2680;
			if (local10 > 100 && this.aClass10_Sub1_Sub6_3.anInt976 > 0) {
				local10 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass10_Sub1_Sub6_3.anIntArray109[this.anInt2682] >= local10) {
							break label37;
						}
						local10 -= this.aClass10_Sub1_Sub6_3.anIntArray109[this.anInt2682];
						this.anInt2682++;
					} while (this.anInt2682 < this.aClass10_Sub1_Sub6_3.anIntArray106.length);
					this.anInt2682 -= this.aClass10_Sub1_Sub6_3.anInt976;
				} while (this.anInt2682 >= 0 && this.anInt2682 < this.aClass10_Sub1_Sub6_3.anIntArray106.length);
				this.aClass10_Sub1_Sub6_3 = null;
			}
			this.anInt2680 = Static95.anInt2442 - local10;
		}
		@Pc(106) Class10_Sub1_Sub10 local106 = Static18.method405(this.anInt2686);
		if (local106.anIntArray146 != null) {
			local106 = local106.method765();
		}
		return local106 == null ? null : local106.method770(this.anInt2679, this.anInt2687, this.anInt2688, this.aClass10_Sub1_Sub6_3, this.anInt2697, this.anInt2682, this.anInt2696, this.anInt2695);
	}
}
