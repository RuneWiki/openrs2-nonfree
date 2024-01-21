import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class1_Sub1_Sub8_Sub6 extends Class1_Sub1_Sub8 {

	@OriginalMember(owner = "client!w", name = "sb", descriptor = "I")
	private final int anInt2724;

	@OriginalMember(owner = "client!w", name = "pb", descriptor = "I")
	private final int anInt2722;

	@OriginalMember(owner = "client!w", name = "ob", descriptor = "I")
	private final int anInt2721;

	@OriginalMember(owner = "client!w", name = "nb", descriptor = "I")
	private final int anInt2720;

	@OriginalMember(owner = "client!w", name = "xb", descriptor = "I")
	private final int anInt2729;

	@OriginalMember(owner = "client!w", name = "wb", descriptor = "I")
	private final int anInt2728;

	@OriginalMember(owner = "client!w", name = "Ab", descriptor = "I")
	private final int anInt2731;

	@OriginalMember(owner = "client!w", name = "rb", descriptor = "Lclient!s;")
	private Class1_Sub1_Sub14 aClass1_Sub1_Sub14_3;

	@OriginalMember(owner = "client!w", name = "vb", descriptor = "I")
	private int anInt2727;

	@OriginalMember(owner = "client!w", name = "qb", descriptor = "I")
	private int anInt2723;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIIIIIZ)V")
	public Class1_Sub1_Sub8_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt2724 = arg5;
		this.anInt2722 = arg6;
		this.anInt2721 = arg0;
		this.anInt2720 = arg1;
		this.anInt2729 = arg3;
		this.anInt2728 = arg2;
		this.anInt2731 = arg4;
		if (arg7 != -1) {
			this.aClass1_Sub1_Sub14_3 = Static30.method574(arg7);
			this.anInt2727 = Static27.anInt768 - 1;
			this.anInt2723 = 0;
			if (arg8 && this.aClass1_Sub1_Sub14_3.anInt2313 != -1) {
				this.anInt2723 = (int) ((double) this.aClass1_Sub1_Sub14_3.anIntArray355.length * Math.random());
				this.anInt2727 -= (int) (Math.random() * (double) this.aClass1_Sub1_Sub14_3.anIntArray357[this.anInt2723]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Z)Lclient!pc;")
	@Override
	protected Class1_Sub1_Sub8_Sub3 method1835() {
		if (this.aClass1_Sub1_Sub14_3 != null) {
			@Pc(14) int local14 = Static27.anInt768 - this.anInt2727;
			if (local14 > 100 && this.aClass1_Sub1_Sub14_3.anInt2313 > 0) {
				local14 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass1_Sub1_Sub14_3.anIntArray357[this.anInt2723] >= local14) {
							break label37;
						}
						local14 -= this.aClass1_Sub1_Sub14_3.anIntArray357[this.anInt2723];
						this.anInt2723++;
					} while (this.anInt2723 < this.aClass1_Sub1_Sub14_3.anIntArray355.length);
					this.anInt2723 -= this.aClass1_Sub1_Sub14_3.anInt2313;
				} while (this.anInt2723 >= 0 && this.anInt2723 < this.aClass1_Sub1_Sub14_3.anIntArray355.length);
				this.aClass1_Sub1_Sub14_3 = null;
			}
			this.anInt2727 = Static27.anInt768 - local14;
		}
		@Pc(104) Class1_Sub1_Sub9 local104 = Static42.method1755(this.anInt2721);
		if (local104.anIntArray190 != null) {
			local104 = local104.method879();
		}
		return local104 == null ? null : local104.method882(this.anInt2720, this.aClass1_Sub1_Sub14_3, this.anInt2728, this.anInt2722, this.anInt2723, this.anInt2724, this.anInt2729, this.anInt2731);
	}
}
