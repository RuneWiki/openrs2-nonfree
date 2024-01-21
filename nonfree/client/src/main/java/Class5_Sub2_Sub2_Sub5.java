import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class5_Sub2_Sub2_Sub5 extends Class5_Sub2_Sub2 {

	@OriginalMember(owner = "client!me", name = "lb", descriptor = "Z")
	public boolean aBoolean77 = false;

	@OriginalMember(owner = "client!me", name = "cb", descriptor = "I")
	private int anInt2047 = 0;

	@OriginalMember(owner = "client!me", name = "jb", descriptor = "I")
	private int anInt2050 = 0;

	@OriginalMember(owner = "client!me", name = "nb", descriptor = "I")
	private final int anInt2053;

	@OriginalMember(owner = "client!me", name = "ub", descriptor = "I")
	public final int anInt2056;

	@OriginalMember(owner = "client!me", name = "pb", descriptor = "I")
	public final int anInt2055;

	@OriginalMember(owner = "client!me", name = "kb", descriptor = "I")
	public final int anInt2051;

	@OriginalMember(owner = "client!me", name = "db", descriptor = "I")
	public final int anInt2048;

	@OriginalMember(owner = "client!me", name = "bb", descriptor = "I")
	public final int anInt2046;

	@OriginalMember(owner = "client!me", name = "tb", descriptor = "Lclient!w;")
	private Class5_Sub2_Sub17 aClass5_Sub2_Sub17_2;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub2_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2053 = arg0;
		this.anInt2056 = arg1;
		this.anInt2055 = arg3;
		this.anInt2051 = arg4;
		this.anInt2048 = arg2;
		this.anInt2046 = arg5 + arg6;
		@Pc(36) int local36 = Static1.method2(this.anInt2053).anInt1213;
		if (local36 == -1) {
			this.aBoolean77 = true;
		} else {
			this.aBoolean77 = false;
			this.aClass5_Sub2_Sub17_2 = Static106.method1769(local36);
		}
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)Lclient!wb;")
	@Override
	public Class5_Sub2_Sub2_Sub6 method2178() {
		@Pc(11) Class5_Sub2_Sub7 local11 = Static1.method2(this.anInt2053);
		@Pc(23) Class5_Sub2_Sub2_Sub6 local23;
		if (this.aBoolean77) {
			local23 = local11.method850(-1);
		} else {
			local23 = local11.method850(this.anInt2047);
		}
		return local23 == null ? null : local23;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V")
	public void method1319(@OriginalArg(0) int arg0) {
		if (this.aBoolean77) {
			return;
		}
		this.anInt2050 += arg0;
		while (this.aClass5_Sub2_Sub17_2.anIntArray396[this.anInt2047] < this.anInt2050) {
			this.anInt2050 -= this.aClass5_Sub2_Sub17_2.anIntArray396[this.anInt2047];
			this.anInt2047++;
			if (this.anInt2047 >= this.aClass5_Sub2_Sub17_2.anIntArray391.length) {
				this.aBoolean77 = true;
				return;
			}
		}
	}
}
