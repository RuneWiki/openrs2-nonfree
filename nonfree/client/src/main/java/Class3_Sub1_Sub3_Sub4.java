import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class3_Sub1_Sub3_Sub4 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!pd", name = "wb", descriptor = "Z")
	public boolean aBoolean127 = false;

	@OriginalMember(owner = "client!pd", name = "nb", descriptor = "I")
	private int anInt2152 = 0;

	@OriginalMember(owner = "client!pd", name = "zb", descriptor = "I")
	private int anInt2157 = 0;

	@OriginalMember(owner = "client!pd", name = "ub", descriptor = "I")
	private final int anInt2155;

	@OriginalMember(owner = "client!pd", name = "kb", descriptor = "I")
	public final int anInt2149;

	@OriginalMember(owner = "client!pd", name = "Fb", descriptor = "I")
	public final int anInt2159;

	@OriginalMember(owner = "client!pd", name = "hb", descriptor = "I")
	public final int anInt2146;

	@OriginalMember(owner = "client!pd", name = "Ab", descriptor = "I")
	public final int anInt2158;

	@OriginalMember(owner = "client!pd", name = "Lb", descriptor = "I")
	public final int anInt2162;

	@OriginalMember(owner = "client!pd", name = "gb", descriptor = "Lclient!oe;")
	private Class3_Sub1_Sub11 aClass3_Sub1_Sub11_2;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub1_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2155 = arg0;
		this.anInt2149 = arg2;
		this.anInt2159 = arg3;
		this.anInt2146 = arg4;
		this.anInt2158 = arg1;
		this.anInt2162 = arg5 + arg6;
		@Pc(36) int local36 = Static105.method1827(this.anInt2155).anInt2528;
		if (local36 == -1) {
			this.aBoolean127 = true;
		} else {
			this.aBoolean127 = false;
			this.aClass3_Sub1_Sub11_2 = Static41.method705(local36);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	public void method1305(@OriginalArg(0) int arg0) {
		if (this.aBoolean127) {
			return;
		}
		this.anInt2157 += arg0;
		while (this.aClass3_Sub1_Sub11_2.anIntArray231[this.anInt2152] < this.anInt2157) {
			this.anInt2157 -= this.aClass3_Sub1_Sub11_2.anIntArray231[this.anInt2152];
			this.anInt2152++;
			if (this.anInt2152 >= this.aClass3_Sub1_Sub11_2.anIntArray232.length) {
				this.aBoolean127 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Z)Lclient!lb;")
	@Override
	protected Class3_Sub1_Sub3_Sub3 method1843() {
		@Pc(13) Class3_Sub1_Sub15 local13 = Static105.method1827(this.anInt2155);
		@Pc(22) Class3_Sub1_Sub3_Sub3 local22;
		if (this.aBoolean127) {
			local22 = local13.method1608(-1);
		} else {
			local22 = local13.method1608(this.anInt2152);
		}
		return local22 == null ? null : local22;
	}
}
