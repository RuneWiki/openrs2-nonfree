import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public final class Class2_Sub3_Sub5_Sub4 extends Class2_Sub3_Sub5 {

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
	private int anInt2934 = 0;

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "Z")
	public boolean aBoolean122 = false;

	@OriginalMember(owner = "client!pc", name = "db", descriptor = "I")
	private int anInt2942 = 0;

	@OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
	public final int anInt2937;

	@OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
	public final int anInt2935;

	@OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
	public final int anInt2941;

	@OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
	public final int anInt2940;

	@OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
	public final int anInt2929;

	@OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
	private final int anInt2933;

	@OriginalMember(owner = "client!pc", name = "cb", descriptor = "Lclient!ic;")
	private Class2_Sub3_Sub8 aClass2_Sub3_Sub8_1;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub3_Sub5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2937 = arg5 + arg6;
		this.anInt2935 = arg2;
		this.anInt2941 = arg4;
		this.anInt2940 = arg3;
		this.anInt2929 = arg1;
		this.anInt2933 = arg0;
		@Pc(36) int local36 = Static122.method1901(this.anInt2933).anInt3259;
		if (local36 == -1) {
			this.aBoolean122 = true;
		} else {
			this.aBoolean122 = false;
			this.aClass2_Sub3_Sub8_1 = Static129.method2790(local36);
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)V")
	public void method1963(@OriginalArg(0) int arg0) {
		if (this.aBoolean122) {
			return;
		}
		this.anInt2942 += arg0;
		while (this.anInt2942 > this.aClass2_Sub3_Sub8_1.anIntArray113[this.anInt2934]) {
			this.anInt2942 -= this.aClass2_Sub3_Sub8_1.anIntArray113[this.anInt2934];
			this.anInt2934++;
			if (this.aClass2_Sub3_Sub8_1.anIntArray109.length <= this.anInt2934) {
				this.aBoolean122 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)Lclient!sa;")
	@Override
	protected Class2_Sub3_Sub5_Sub7 method2298() {
		@Pc(8) Class2_Sub3_Sub15 local8 = Static122.method1901(this.anInt2933);
		@Pc(24) Class2_Sub3_Sub5_Sub7 local24;
		if (this.aBoolean122) {
			local24 = local8.method2157(-1);
		} else {
			local24 = local8.method2157(this.anInt2934);
		}
		return local24 == null ? null : local24;
	}
}
