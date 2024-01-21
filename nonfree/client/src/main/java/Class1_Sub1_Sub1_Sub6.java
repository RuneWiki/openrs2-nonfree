import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!oc", name = "tb", descriptor = "Z")
	public boolean aBoolean124 = false;

	@OriginalMember(owner = "client!oc", name = "yb", descriptor = "I")
	private int anInt2269 = 0;

	@OriginalMember(owner = "client!oc", name = "pb", descriptor = "I")
	private int anInt2263 = 0;

	@OriginalMember(owner = "client!oc", name = "wb", descriptor = "I")
	public final int anInt2268;

	@OriginalMember(owner = "client!oc", name = "ub", descriptor = "I")
	private final int anInt2266;

	@OriginalMember(owner = "client!oc", name = "Db", descriptor = "I")
	public final int anInt2274;

	@OriginalMember(owner = "client!oc", name = "lb", descriptor = "I")
	public final int anInt2259;

	@OriginalMember(owner = "client!oc", name = "vb", descriptor = "I")
	public final int anInt2267;

	@OriginalMember(owner = "client!oc", name = "Lb", descriptor = "I")
	public final int anInt2275;

	@OriginalMember(owner = "client!oc", name = "Kb", descriptor = "Lclient!gd;")
	private Class1_Sub1_Sub6 aClass1_Sub1_Sub6_2;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2268 = arg4;
		this.anInt2266 = arg0;
		this.anInt2274 = arg2;
		this.anInt2259 = arg1;
		this.anInt2267 = arg3;
		this.anInt2275 = arg5 + arg6;
		@Pc(36) int local36 = Static11.method279(this.anInt2266).anInt2581;
		if (local36 == -1) {
			this.aBoolean124 = true;
		} else {
			this.aBoolean124 = false;
			this.aClass1_Sub1_Sub6_2 = Static40.method687(local36);
		}
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)Lclient!ka;")
	@Override
	public Class1_Sub1_Sub1_Sub2 method1842() {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static11.method279(this.anInt2266);
		@Pc(17) Class1_Sub1_Sub1_Sub2 local17;
		if (this.aBoolean124) {
			local17 = local8.method1707(-1);
		} else {
			local17 = local8.method1707(this.anInt2263);
		}
		return local17 == null ? null : local17;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)V")
	public void method1487(@OriginalArg(0) int arg0) {
		if (this.aBoolean124) {
			return;
		}
		this.anInt2269 += arg0;
		while (this.aClass1_Sub1_Sub6_2.anIntArray120[this.anInt2263] < this.anInt2269) {
			this.anInt2269 -= this.aClass1_Sub1_Sub6_2.anIntArray120[this.anInt2263];
			this.anInt2263++;
			if (this.anInt2263 >= this.aClass1_Sub1_Sub6_2.anIntArray123.length) {
				this.aBoolean124 = true;
				return;
			}
		}
	}
}
