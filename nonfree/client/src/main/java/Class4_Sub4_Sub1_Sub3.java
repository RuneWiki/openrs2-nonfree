import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class4_Sub4_Sub1_Sub3 extends Class4_Sub4_Sub1 {

	@OriginalMember(owner = "client!ea", name = "jb", descriptor = "I")
	private final int anInt733;

	@OriginalMember(owner = "client!ea", name = "tb", descriptor = "I")
	private final int anInt741;

	@OriginalMember(owner = "client!ea", name = "ob", descriptor = "I")
	private final int anInt737;

	@OriginalMember(owner = "client!ea", name = "gb", descriptor = "I")
	private final int anInt731;

	@OriginalMember(owner = "client!ea", name = "rb", descriptor = "I")
	private final int anInt739;

	@OriginalMember(owner = "client!ea", name = "qb", descriptor = "I")
	private final int anInt738;

	@OriginalMember(owner = "client!ea", name = "hb", descriptor = "I")
	private final int anInt732;

	@OriginalMember(owner = "client!ea", name = "Y", descriptor = "Lclient!t;")
	private Class4_Sub4_Sub14 aClass4_Sub4_Sub14_2;

	@OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
	private int anInt728;

	@OriginalMember(owner = "client!ea", name = "mb", descriptor = "I")
	private int anInt736;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIIIIZLclient!le;)V")
	public Class4_Sub4_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class4_Sub4_Sub1 arg9) {
		this.anInt733 = arg5;
		this.anInt741 = arg2;
		this.anInt737 = arg3;
		this.anInt731 = arg4;
		this.anInt739 = arg0;
		this.anInt738 = arg1;
		this.anInt732 = arg6;
		if (arg7 != -1) {
			this.aClass4_Sub4_Sub14_2 = Static127.method2102(arg7);
			this.anInt728 = Static81.anInt1944 - 1;
			this.anInt736 = 0;
			if (this.aClass4_Sub4_Sub14_2.anInt2715 == 0 && arg9 != null && arg9 instanceof Class4_Sub4_Sub1_Sub3) {
				@Pc(54) Class4_Sub4_Sub1_Sub3 local54 = (Class4_Sub4_Sub1_Sub3) arg9;
				if (this.aClass4_Sub4_Sub14_2 == local54.aClass4_Sub4_Sub14_2) {
					this.anInt736 = local54.anInt736;
					this.anInt728 = local54.anInt728;
					return;
				}
			}
			if (arg8 && this.aClass4_Sub4_Sub14_2.anInt2710 != -1) {
				this.anInt736 = (int) ((double) this.aClass4_Sub4_Sub14_2.anIntArray295.length * Math.random());
				this.anInt728 -= (int) (Math.random() * (double) this.aClass4_Sub4_Sub14_2.anIntArray294[this.anInt736]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)Lclient!rb;")
	@Override
	public Class4_Sub4_Sub1_Sub6 method1976() {
		if (this.aClass4_Sub4_Sub14_2 != null) {
			@Pc(14) int local14 = Static81.anInt1944 - this.anInt728;
			if (local14 > 100 && this.aClass4_Sub4_Sub14_2.anInt2710 > 0) {
				local14 = 100;
			}
			label37: {
				do {
					do {
						if (local14 <= this.aClass4_Sub4_Sub14_2.anIntArray294[this.anInt736]) {
							break label37;
						}
						local14 -= this.aClass4_Sub4_Sub14_2.anIntArray294[this.anInt736];
						this.anInt736++;
					} while (this.anInt736 < this.aClass4_Sub4_Sub14_2.anIntArray295.length);
					this.anInt736 -= this.aClass4_Sub4_Sub14_2.anInt2710;
				} while (this.anInt736 >= 0 && this.anInt736 < this.aClass4_Sub4_Sub14_2.anIntArray295.length);
				this.aClass4_Sub4_Sub14_2 = null;
			}
			this.anInt728 = Static81.anInt1944 - local14;
		}
		@Pc(99) Class4_Sub4_Sub5 local99 = Static24.method477(this.anInt739);
		if (local99.anIntArray94 != null) {
			local99 = local99.method727();
		}
		return local99 == null ? null : local99.method722(this.aClass4_Sub4_Sub14_2, this.anInt731, this.anInt737, this.anInt741, this.anInt732, this.anInt733, this.anInt738, this.anInt736);
	}
}
