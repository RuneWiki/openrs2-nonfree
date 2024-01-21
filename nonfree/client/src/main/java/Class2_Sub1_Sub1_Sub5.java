import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class2_Sub1_Sub1_Sub5 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!oa", name = "Cb", descriptor = "I")
	private int anInt2167 = 0;

	@OriginalMember(owner = "client!oa", name = "tb", descriptor = "I")
	private int anInt2161 = 0;

	@OriginalMember(owner = "client!oa", name = "Gb", descriptor = "Z")
	public boolean aBoolean113 = false;

	@OriginalMember(owner = "client!oa", name = "Kb", descriptor = "I")
	public final int anInt2172;

	@OriginalMember(owner = "client!oa", name = "Qb", descriptor = "I")
	public final int anInt2177;

	@OriginalMember(owner = "client!oa", name = "zb", descriptor = "I")
	public final int anInt2164;

	@OriginalMember(owner = "client!oa", name = "Ib", descriptor = "I")
	private final int anInt2171;

	@OriginalMember(owner = "client!oa", name = "Hb", descriptor = "I")
	public final int anInt2170;

	@OriginalMember(owner = "client!oa", name = "Mb", descriptor = "I")
	public final int anInt2174;

	@OriginalMember(owner = "client!oa", name = "Ob", descriptor = "Lclient!gd;")
	private Class2_Sub1_Sub6 aClass2_Sub1_Sub6_3;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2172 = arg2;
		this.anInt2177 = arg5 + arg6;
		this.anInt2164 = arg3;
		this.anInt2171 = arg0;
		this.anInt2170 = arg4;
		this.anInt2174 = arg1;
		@Pc(36) int local36 = Static20.method402(this.anInt2171).anInt2681;
		if (local36 == -1) {
			this.aBoolean113 = true;
		} else {
			this.aBoolean113 = false;
			this.aClass2_Sub1_Sub6_3 = Static71.method1291(local36);
		}
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(B)Lclient!r;")
	@Override
	public Class2_Sub1_Sub1_Sub6 method1512() {
		@Pc(8) Class2_Sub1_Sub15 local8 = Static20.method402(this.anInt2171);
		@Pc(16) Class2_Sub1_Sub1_Sub6 local16;
		if (this.aBoolean113) {
			local16 = local8.method1654(-1);
		} else {
			local16 = local8.method1654(this.anInt2167);
		}
		return local16 == null ? null : local16;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)V")
	public void method1290(@OriginalArg(0) int arg0) {
		if (this.aBoolean113) {
			return;
		}
		this.anInt2161 += arg0;
		while (this.aClass2_Sub1_Sub6_3.anIntArray157[this.anInt2167] < this.anInt2161) {
			this.anInt2161 -= this.aClass2_Sub1_Sub6_3.anIntArray157[this.anInt2167];
			this.anInt2167++;
			if (this.anInt2167 >= this.aClass2_Sub1_Sub6_3.anIntArray155.length) {
				this.aBoolean113 = true;
				return;
			}
		}
	}
}
