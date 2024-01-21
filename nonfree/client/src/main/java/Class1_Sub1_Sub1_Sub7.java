import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class1_Sub1_Sub1_Sub7 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!tc", name = "tb", descriptor = "I")
	private final int anInt2774;

	@OriginalMember(owner = "client!tc", name = "nb", descriptor = "I")
	private final int anInt2769;

	@OriginalMember(owner = "client!tc", name = "zb", descriptor = "I")
	private final int anInt2778;

	@OriginalMember(owner = "client!tc", name = "pb", descriptor = "I")
	private final int anInt2771;

	@OriginalMember(owner = "client!tc", name = "rb", descriptor = "I")
	private final int anInt2773;

	@OriginalMember(owner = "client!tc", name = "qb", descriptor = "I")
	private final int anInt2772;

	@OriginalMember(owner = "client!tc", name = "yb", descriptor = "I")
	private final int anInt2777;

	@OriginalMember(owner = "client!tc", name = "sb", descriptor = "Lclient!gd;")
	private Class1_Sub1_Sub6 aClass1_Sub1_Sub6_3;

	@OriginalMember(owner = "client!tc", name = "lb", descriptor = "I")
	private int anInt2767;

	@OriginalMember(owner = "client!tc", name = "ub", descriptor = "I")
	private int anInt2775;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIIIIIZLclient!ha;)V")
	public Class1_Sub1_Sub1_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class1_Sub1_Sub1 arg9) {
		this.anInt2774 = arg0;
		this.anInt2769 = arg6;
		this.anInt2778 = arg1;
		this.anInt2771 = arg2;
		this.anInt2773 = arg4;
		this.anInt2772 = arg3;
		this.anInt2777 = arg5;
		if (arg7 != -1) {
			this.aClass1_Sub1_Sub6_3 = Static40.method687(arg7);
			this.anInt2767 = 0;
			this.anInt2775 = Static73.anInt1947 - 1;
			if (this.aClass1_Sub1_Sub6_3.anInt1200 == 0 && arg9 != null && arg9 instanceof Class1_Sub1_Sub1_Sub7) {
				@Pc(51) Class1_Sub1_Sub1_Sub7 local51 = (Class1_Sub1_Sub1_Sub7) arg9;
				if (this.aClass1_Sub1_Sub6_3 == local51.aClass1_Sub1_Sub6_3) {
					this.anInt2775 = local51.anInt2775;
					this.anInt2767 = local51.anInt2767;
					return;
				}
			}
			if (arg8 && this.aClass1_Sub1_Sub6_3.anInt1201 != -1) {
				this.anInt2767 = (int) (Math.random() * (double) this.aClass1_Sub1_Sub6_3.anIntArray123.length);
				this.anInt2775 -= (int) ((double) this.aClass1_Sub1_Sub6_3.anIntArray120[this.anInt2767] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)Lclient!ka;")
	@Override
	public Class1_Sub1_Sub1_Sub2 method1842() {
		if (this.aClass1_Sub1_Sub6_3 != null) {
			@Pc(14) int local14 = Static73.anInt1947 - this.anInt2775;
			if (local14 > 100 && this.aClass1_Sub1_Sub6_3.anInt1201 > 0) {
				local14 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass1_Sub1_Sub6_3.anIntArray120[this.anInt2767] >= local14) {
							break label37;
						}
						local14 -= this.aClass1_Sub1_Sub6_3.anIntArray120[this.anInt2767];
						this.anInt2767++;
					} while (this.anInt2767 < this.aClass1_Sub1_Sub6_3.anIntArray123.length);
					this.anInt2767 -= this.aClass1_Sub1_Sub6_3.anInt1201;
				} while (this.anInt2767 >= 0 && this.anInt2767 < this.aClass1_Sub1_Sub6_3.anIntArray123.length);
				this.aClass1_Sub1_Sub6_3 = null;
			}
			this.anInt2775 = Static73.anInt1947 - local14;
		}
		@Pc(99) Class1_Sub1_Sub16 local99 = Static28.method2008(this.anInt2774);
		if (local99.anIntArray366 != null) {
			local99 = local99.method1958();
		}
		return local99 == null ? null : local99.method1963(this.anInt2777, this.anInt2771, this.aClass1_Sub1_Sub6_3, this.anInt2773, this.anInt2769, this.anInt2767, this.anInt2772, this.anInt2778);
	}
}
