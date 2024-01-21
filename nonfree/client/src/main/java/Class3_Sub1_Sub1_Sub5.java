import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public final class Class3_Sub1_Sub1_Sub5 extends Class3_Sub1_Sub1 {

	@OriginalMember(owner = "client!le", name = "Ab", descriptor = "I")
	private int anInt2118 = 0;

	@OriginalMember(owner = "client!le", name = "Jb", descriptor = "Z")
	public boolean aBoolean68 = false;

	@OriginalMember(owner = "client!le", name = "Wb", descriptor = "I")
	private int anInt2128 = 0;

	@OriginalMember(owner = "client!le", name = "Nb", descriptor = "I")
	public final int anInt2123;

	@OriginalMember(owner = "client!le", name = "Sb", descriptor = "I")
	private final int anInt2125;

	@OriginalMember(owner = "client!le", name = "ob", descriptor = "I")
	public final int anInt2109;

	@OriginalMember(owner = "client!le", name = "tb", descriptor = "I")
	public final int anInt2114;

	@OriginalMember(owner = "client!le", name = "Ib", descriptor = "I")
	public final int anInt2122;

	@OriginalMember(owner = "client!le", name = "sb", descriptor = "I")
	public final int anInt2113;

	@OriginalMember(owner = "client!le", name = "Fb", descriptor = "Lclient!nf;")
	private Class3_Sub1_Sub14 aClass3_Sub1_Sub14_2;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2123 = arg4;
		this.anInt2125 = arg0;
		this.anInt2109 = arg2;
		this.anInt2114 = arg1;
		this.anInt2122 = arg5 + arg6;
		this.anInt2113 = arg3;
		@Pc(36) int local36 = Static105.method2024(this.anInt2125).anInt1593;
		if (local36 == -1) {
			this.aBoolean68 = true;
		} else {
			this.aBoolean68 = false;
			this.aClass3_Sub1_Sub14_2 = Static109.method2054(local36);
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(II)V")
	public void method1377(@OriginalArg(1) int arg0) {
		if (this.aBoolean68) {
			return;
		}
		this.anInt2128 += arg0;
		while (this.anInt2128 > this.aClass3_Sub1_Sub14_2.anIntArray247[this.anInt2118]) {
			this.anInt2128 -= this.aClass3_Sub1_Sub14_2.anIntArray247[this.anInt2118];
			this.anInt2118++;
			if (this.anInt2118 >= this.aClass3_Sub1_Sub14_2.anIntArray243.length) {
				this.aBoolean68 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "j", descriptor = "(I)Lclient!ea;")
	@Override
	public Class3_Sub1_Sub1_Sub4 method2225() {
		@Pc(4) Class3_Sub1_Sub9 local4 = Static105.method2024(this.anInt2125);
		@Pc(22) Class3_Sub1_Sub1_Sub4 local22;
		if (this.aBoolean68) {
			local22 = local4.method1055(-1);
		} else {
			local22 = local4.method1055(this.anInt2118);
		}
		return local22 == null ? null : local22;
	}
}
