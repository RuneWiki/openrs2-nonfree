import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class2_Sub1_Sub4_Sub6 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!vd", name = "Lb", descriptor = "I")
	private final int anInt2934;

	@OriginalMember(owner = "client!vd", name = "xb", descriptor = "I")
	private final int anInt2927;

	@OriginalMember(owner = "client!vd", name = "ob", descriptor = "I")
	private final int anInt2921;

	@OriginalMember(owner = "client!vd", name = "Fb", descriptor = "I")
	private final int anInt2930;

	@OriginalMember(owner = "client!vd", name = "Db", descriptor = "I")
	private final int anInt2929;

	@OriginalMember(owner = "client!vd", name = "Ob", descriptor = "I")
	private final int anInt2935;

	@OriginalMember(owner = "client!vd", name = "sb", descriptor = "I")
	private final int anInt2924;

	@OriginalMember(owner = "client!vd", name = "yb", descriptor = "Lclient!s;")
	private Class2_Sub1_Sub14 aClass2_Sub1_Sub14_3;

	@OriginalMember(owner = "client!vd", name = "Sb", descriptor = "I")
	private int anInt2937;

	@OriginalMember(owner = "client!vd", name = "Ib", descriptor = "I")
	private int anInt2932;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(IIIIIIIIZLclient!db;)V")
	public Class2_Sub1_Sub4_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) Class2_Sub1_Sub4 arg9) {
		this.anInt2934 = arg4;
		this.anInt2927 = arg5;
		this.anInt2921 = arg6;
		this.anInt2930 = arg1;
		this.anInt2929 = arg3;
		this.anInt2935 = arg0;
		this.anInt2924 = arg2;
		if (arg7 != -1) {
			this.aClass2_Sub1_Sub14_3 = Static56.method1045(arg7);
			this.anInt2937 = Static113.anInt2952 - 1;
			this.anInt2932 = 0;
			if (this.aClass2_Sub1_Sub14_3.anInt2406 == 0 && arg9 != null && arg9 instanceof Class2_Sub1_Sub4_Sub6) {
				@Pc(50) Class2_Sub1_Sub4_Sub6 local50 = (Class2_Sub1_Sub4_Sub6) arg9;
				if (local50.aClass2_Sub1_Sub14_3 == this.aClass2_Sub1_Sub14_3) {
					this.anInt2932 = local50.anInt2932;
					this.anInt2937 = local50.anInt2937;
					return;
				}
			}
			if (arg8 && this.aClass2_Sub1_Sub14_3.anInt2386 != -1) {
				this.anInt2932 = (int) (Math.random() * (double) this.aClass2_Sub1_Sub14_3.anIntArray287.length);
				this.anInt2937 -= (int) ((double) this.aClass2_Sub1_Sub14_3.anIntArray288[this.anInt2932] * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)Lclient!fd;")
	@Override
	public Class2_Sub1_Sub4_Sub1 method2031() {
		if (this.aClass2_Sub1_Sub14_3 != null) {
			@Pc(13) int local13 = Static113.anInt2952 - this.anInt2937;
			if (local13 > 100 && this.aClass2_Sub1_Sub14_3.anInt2386 > 0) {
				local13 = 100;
			}
			label37: {
				do {
					do {
						if (this.aClass2_Sub1_Sub14_3.anIntArray288[this.anInt2932] >= local13) {
							break label37;
						}
						local13 -= this.aClass2_Sub1_Sub14_3.anIntArray288[this.anInt2932];
						this.anInt2932++;
					} while (this.aClass2_Sub1_Sub14_3.anIntArray287.length > this.anInt2932);
					this.anInt2932 -= this.aClass2_Sub1_Sub14_3.anInt2386;
				} while (this.anInt2932 >= 0 && this.aClass2_Sub1_Sub14_3.anIntArray287.length > this.anInt2932);
				this.aClass2_Sub1_Sub14_3 = null;
			}
			this.anInt2937 = Static113.anInt2952 - local13;
		}
		@Pc(96) Class2_Sub1_Sub13 local96 = Static2.method2072(this.anInt2935);
		if (local96.anIntArray275 != null) {
			local96 = local96.method1630();
		}
		return local96 == null ? null : local96.method1635(this.anInt2927, this.anInt2934, this.aClass2_Sub1_Sub14_3, this.anInt2932, this.anInt2929, this.anInt2924, this.anInt2921, this.anInt2930);
	}
}
