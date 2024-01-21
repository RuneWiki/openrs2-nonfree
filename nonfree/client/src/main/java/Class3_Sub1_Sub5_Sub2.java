import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class3_Sub1_Sub5_Sub2 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!ka", name = "ab", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!ka", name = "ob", descriptor = "I")
	private int anInt1878 = 0;

	@OriginalMember(owner = "client!ka", name = "rb", descriptor = "I")
	private int anInt1880 = 0;

	@OriginalMember(owner = "client!ka", name = "Z", descriptor = "I")
	private final int anInt1870;

	@OriginalMember(owner = "client!ka", name = "qb", descriptor = "I")
	public final int anInt1879;

	@OriginalMember(owner = "client!ka", name = "cb", descriptor = "I")
	public final int anInt1871;

	@OriginalMember(owner = "client!ka", name = "kb", descriptor = "I")
	public final int anInt1876;

	@OriginalMember(owner = "client!ka", name = "sb", descriptor = "I")
	public final int anInt1881;

	@OriginalMember(owner = "client!ka", name = "mb", descriptor = "I")
	public final int anInt1877;

	@OriginalMember(owner = "client!ka", name = "gb", descriptor = "Lclient!ri;")
	private Class3_Sub1_Sub15 aClass3_Sub1_Sub15_2;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub1_Sub5_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1870 = arg0;
		this.anInt1879 = arg4;
		this.anInt1871 = arg1;
		this.anInt1876 = arg2;
		this.anInt1881 = arg3;
		this.anInt1877 = arg5 + arg6;
		@Pc(36) int local36 = Static194.method3135(this.anInt1870).anInt2463;
		if (local36 == -1) {
			this.aBoolean71 = true;
		} else {
			this.aBoolean71 = false;
			this.aClass3_Sub1_Sub15_2 = Static148.method2368(local36);
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public void method1308(@OriginalArg(0) int arg0) {
		if (this.aBoolean71) {
			return;
		}
		this.anInt1878 += arg0;
		while (this.anInt1878 > this.aClass3_Sub1_Sub15_2.anIntArray440[this.anInt1880]) {
			this.anInt1878 -= this.aClass3_Sub1_Sub15_2.anIntArray440[this.anInt1880];
			this.anInt1880++;
			if (this.aClass3_Sub1_Sub15_2.anIntArray439.length <= this.anInt1880) {
				this.aBoolean71 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)Lclient!vf;")
	@Override
	protected Class3_Sub1_Sub5_Sub3 method3056() {
		@Pc(9) Class3_Sub1_Sub12 local9 = Static194.method3135(this.anInt1870);
		@Pc(21) Class3_Sub1_Sub5_Sub3 local21;
		if (this.aBoolean71) {
			local21 = local9.method1708(-1);
		} else {
			local21 = local9.method1708(this.anInt1880);
		}
		return local21 == null ? null : local21;
	}
}
