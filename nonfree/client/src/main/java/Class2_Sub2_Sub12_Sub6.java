import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class2_Sub2_Sub12_Sub6 extends Class2_Sub2_Sub12 {

	@OriginalMember(owner = "client!u", name = "gb", descriptor = "I")
	private int anInt2224 = 0;

	@OriginalMember(owner = "client!u", name = "ib", descriptor = "Z")
	public boolean aBoolean169 = false;

	@OriginalMember(owner = "client!u", name = "Ab", descriptor = "I")
	private int anInt2236 = 0;

	@OriginalMember(owner = "client!u", name = "fb", descriptor = "I")
	public final int anInt2223;

	@OriginalMember(owner = "client!u", name = "yb", descriptor = "I")
	public final int anInt2235;

	@OriginalMember(owner = "client!u", name = "ub", descriptor = "I")
	public final int anInt2231;

	@OriginalMember(owner = "client!u", name = "vb", descriptor = "I")
	public final int anInt2232;

	@OriginalMember(owner = "client!u", name = "wb", descriptor = "I")
	private final int anInt2233;

	@OriginalMember(owner = "client!u", name = "qb", descriptor = "I")
	public final int anInt2230;

	@OriginalMember(owner = "client!u", name = "rb", descriptor = "Lclient!f;")
	private Class2_Sub2_Sub6 aClass2_Sub2_Sub6_3;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub2_Sub12_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2223 = arg4;
		this.anInt2235 = arg1;
		this.anInt2231 = arg5 + arg6;
		this.anInt2232 = arg2;
		this.anInt2233 = arg0;
		this.anInt2230 = arg3;
		@Pc(36) int local36 = Static5.method116(this.anInt2233).anInt640;
		if (local36 == -1) {
			this.aBoolean169 = true;
		} else {
			this.aBoolean169 = false;
			this.aClass2_Sub2_Sub6_3 = Static62.method1042(local36);
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(B)Lclient!ne;")
	@Override
	protected Class2_Sub2_Sub12_Sub4 method1533() {
		@Pc(4) Class2_Sub2_Sub5 local4 = Static5.method116(this.anInt2233);
		@Pc(12) Class2_Sub2_Sub12_Sub4 local12;
		if (this.aBoolean169) {
			local12 = local4.method501(-1);
		} else {
			local12 = local4.method501(this.anInt2236);
		}
		return local12 == null ? null : local12;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)V")
	public void method1519(@OriginalArg(0) int arg0) {
		if (this.aBoolean169) {
			return;
		}
		this.anInt2224 += arg0;
		while (this.anInt2224 > this.aClass2_Sub2_Sub6_3.anIntArray128[this.anInt2236]) {
			this.anInt2224 -= this.aClass2_Sub2_Sub6_3.anIntArray128[this.anInt2236];
			this.anInt2236++;
			if (this.anInt2236 >= this.aClass2_Sub2_Sub6_3.anIntArray124.length) {
				this.aBoolean169 = true;
				return;
			}
		}
	}
}
