import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class3_Sub1_Sub5_Sub6 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!ke", name = "pb", descriptor = "I")
	private final int anInt1882;

	@OriginalMember(owner = "client!ke", name = "Eb", descriptor = "I")
	private final int anInt1892;

	@OriginalMember(owner = "client!ke", name = "Bb", descriptor = "I")
	private final int anInt1891;

	@OriginalMember(owner = "client!ke", name = "vb", descriptor = "I")
	private final int anInt1886;

	@OriginalMember(owner = "client!ke", name = "Ab", descriptor = "I")
	private final int anInt1890;

	@OriginalMember(owner = "client!ke", name = "sb", descriptor = "I")
	private final int anInt1884;

	@OriginalMember(owner = "client!ke", name = "wb", descriptor = "I")
	private final int anInt1887;

	@OriginalMember(owner = "client!ke", name = "rb", descriptor = "Lclient!uc;")
	private Class3_Sub1_Sub17 aClass3_Sub1_Sub17_3;

	@OriginalMember(owner = "client!ke", name = "qb", descriptor = "I")
	private int anInt1883;

	@OriginalMember(owner = "client!ke", name = "zb", descriptor = "I")
	private int anInt1889;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIIZLclient!hd;)V")
	public Class3_Sub1_Sub5_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class3_Sub1_Sub5 arg9) {
		this.anInt1882 = arg4;
		this.anInt1892 = arg5;
		this.anInt1891 = arg6;
		this.anInt1886 = arg0;
		this.anInt1890 = arg2;
		this.anInt1884 = arg1;
		this.anInt1887 = arg3;
		if (arg7 != -1) {
			this.aClass3_Sub1_Sub17_3 = Static111.method2009(arg7);
			this.anInt1883 = Static4.anInt136 - 1;
			this.anInt1889 = 0;
			if (this.aClass3_Sub1_Sub17_3.anInt3102 == 0 && arg9 != null && arg9 instanceof Class3_Sub1_Sub5_Sub6) {
				@Pc(54) Class3_Sub1_Sub5_Sub6 local54 = (Class3_Sub1_Sub5_Sub6) arg9;
				if (local54.aClass3_Sub1_Sub17_3 == this.aClass3_Sub1_Sub17_3) {
					this.anInt1883 = local54.anInt1883;
					this.anInt1889 = local54.anInt1889;
					return;
				}
			}
			if (arg8 && this.aClass3_Sub1_Sub17_3.anInt3109 != -1) {
				this.anInt1889 = (int) ((double) this.aClass3_Sub1_Sub17_3.anIntArray377.length * Math.random());
				this.anInt1883 -= (int) (Math.random() * (double) this.aClass3_Sub1_Sub17_3.anIntArray374[this.anInt1889]);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(Z)Lclient!oa;")
	@Override
	public Class3_Sub1_Sub5_Sub7 method1874() {
		if (this.aClass3_Sub1_Sub17_3 != null) {
			@Pc(9) int local9 = Static4.anInt136 - this.anInt1883;
			if (local9 > 100 && this.aClass3_Sub1_Sub17_3.anInt3109 > 0) {
				local9 = 100;
			}
			label37: {
				do {
					do {
						if (local9 <= this.aClass3_Sub1_Sub17_3.anIntArray374[this.anInt1889]) {
							break label37;
						}
						local9 -= this.aClass3_Sub1_Sub17_3.anIntArray374[this.anInt1889];
						this.anInt1889++;
					} while (this.anInt1889 < this.aClass3_Sub1_Sub17_3.anIntArray377.length);
					this.anInt1889 -= this.aClass3_Sub1_Sub17_3.anInt3109;
				} while (this.anInt1889 >= 0 && this.aClass3_Sub1_Sub17_3.anIntArray377.length > this.anInt1889);
				this.aClass3_Sub1_Sub17_3 = null;
			}
			this.anInt1883 = Static4.anInt136 - local9;
		}
		@Pc(107) Class3_Sub1_Sub1 local107 = Static4.method68(this.anInt1886);
		if (local107.anIntArray9 != null) {
			local107 = local107.method48();
		}
		return local107 == null ? null : local107.method57(this.aClass3_Sub1_Sub17_3, this.anInt1891, this.anInt1889, this.anInt1882, this.anInt1887, this.anInt1892, this.anInt1884, this.anInt1890);
	}
}
