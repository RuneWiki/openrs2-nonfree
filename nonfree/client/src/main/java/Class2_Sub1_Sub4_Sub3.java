import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class2_Sub1_Sub4_Sub3 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!ee", name = "vb", descriptor = "I")
	private final int anInt1067;

	@OriginalMember(owner = "client!ee", name = "rb", descriptor = "I")
	private final int anInt1064;

	@OriginalMember(owner = "client!ee", name = "yb", descriptor = "I")
	private final int anInt1069;

	@OriginalMember(owner = "client!ee", name = "ib", descriptor = "I")
	private final int anInt1057;

	@OriginalMember(owner = "client!ee", name = "Cb", descriptor = "I")
	private final int anInt1070;

	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "I")
	private final int anInt1062;

	@OriginalMember(owner = "client!ee", name = "mb", descriptor = "I")
	private final int anInt1061;

	@OriginalMember(owner = "client!ee", name = "zb", descriptor = "Lclient!mb;")
	private Class2_Sub1_Sub10 aClass2_Sub1_Sub10_3;

	@OriginalMember(owner = "client!ee", name = "tb", descriptor = "I")
	private int anInt1066;

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "I")
	private int anInt1060;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(IIIIIIIIZ)V")
	public Class2_Sub1_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt1067 = arg2;
		this.anInt1064 = arg6;
		this.anInt1069 = arg5;
		this.anInt1057 = arg1;
		this.anInt1070 = arg0;
		this.anInt1062 = arg4;
		this.anInt1061 = arg3;
		if (arg7 != -1) {
			this.aClass2_Sub1_Sub10_3 = Static54.method1158(arg7);
			this.anInt1066 = 0;
			this.anInt1060 = Static49.anInt2694 - 1;
			if (arg8 && this.aClass2_Sub1_Sub10_3.anInt2094 != -1) {
				this.anInt1066 = (int) (Math.random() * (double) this.aClass2_Sub1_Sub10_3.anIntArray292.length);
				this.anInt1060 -= (int) ((double) this.aClass2_Sub1_Sub10_3.anIntArray293[this.anInt1066] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(Z)Lclient!hb;")
	@Override
	protected Class2_Sub1_Sub4_Sub5 method1264() {
		if (this.aClass2_Sub1_Sub10_3 != null) {
			@Pc(9) int local9 = Static49.anInt2694 - this.anInt1060;
			if (local9 > 100 && this.aClass2_Sub1_Sub10_3.anInt2094 > 0) {
				local9 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass2_Sub1_Sub10_3.anIntArray293[this.anInt1066] >= local9) {
							break label37;
						}
						local9 -= this.aClass2_Sub1_Sub10_3.anIntArray293[this.anInt1066];
						this.anInt1066++;
					} while (this.anInt1066 < this.aClass2_Sub1_Sub10_3.anIntArray292.length);
					this.anInt1066 -= this.aClass2_Sub1_Sub10_3.anInt2094;
				} while (this.anInt1066 >= 0 && this.aClass2_Sub1_Sub10_3.anIntArray292.length > this.anInt1066);
				this.aClass2_Sub1_Sub10_3 = null;
			}
			this.anInt1060 = Static49.anInt2694 - local9;
		}
		@Pc(98) Class2_Sub1_Sub16 local98 = Static92.method1045(this.anInt1070);
		if (local98.anIntArray388 != null) {
			local98 = local98.method1711();
		}
		return local98 == null ? null : local98.method1709(this.anInt1057, this.anInt1064, this.anInt1067, this.anInt1069, this.anInt1062, this.aClass2_Sub1_Sub10_3, this.anInt1061, this.anInt1066);
	}
}
