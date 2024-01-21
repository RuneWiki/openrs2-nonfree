import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class1_Sub1_Sub5_Sub7 extends Class1_Sub1_Sub5 {

	@OriginalMember(owner = "client!tf", name = "bb", descriptor = "I")
	private int anInt4243 = 0;

	@OriginalMember(owner = "client!tf", name = "lb", descriptor = "I")
	private int anInt4249 = 0;

	@OriginalMember(owner = "client!tf", name = "db", descriptor = "Z")
	public boolean aBoolean188 = false;

	@OriginalMember(owner = "client!tf", name = "kb", descriptor = "I")
	public final int anInt4248;

	@OriginalMember(owner = "client!tf", name = "tb", descriptor = "I")
	public final int anInt4255;

	@OriginalMember(owner = "client!tf", name = "ub", descriptor = "I")
	public final int anInt4256;

	@OriginalMember(owner = "client!tf", name = "gb", descriptor = "I")
	public final int anInt4246;

	@OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
	private final int anInt4244;

	@OriginalMember(owner = "client!tf", name = "sb", descriptor = "I")
	public final int anInt4254;

	@OriginalMember(owner = "client!tf", name = "rb", descriptor = "Lclient!pf;")
	private Class1_Sub1_Sub12 aClass1_Sub1_Sub12_3;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub1_Sub5_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt4248 = arg2;
		this.anInt4255 = arg3;
		this.anInt4256 = arg4;
		this.anInt4246 = arg5 + arg6;
		this.anInt4244 = arg0;
		this.anInt4254 = arg1;
		@Pc(36) int local36 = Static155.method2902(this.anInt4244).anInt4678;
		if (local36 == -1) {
			this.aBoolean188 = true;
		} else {
			this.aBoolean188 = false;
			this.aClass1_Sub1_Sub12_3 = Static121.method2378(local36);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)V")
	public void method2899(@OriginalArg(0) int arg0) {
		if (this.aBoolean188) {
			return;
		}
		this.anInt4249 += arg0;
		while (this.aClass1_Sub1_Sub12_3.anIntArray309[this.anInt4243] < this.anInt4249) {
			this.anInt4249 -= this.aClass1_Sub1_Sub12_3.anIntArray309[this.anInt4243];
			this.anInt4243++;
			if (this.aClass1_Sub1_Sub12_3.anIntArray307.length <= this.anInt4243) {
				this.aBoolean188 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "(Z)Lclient!rg;")
	@Override
	public Class1_Sub1_Sub5_Sub4 method2896() {
		@Pc(8) Class1_Sub1_Sub18 local8 = Static155.method2902(this.anInt4244);
		@Pc(21) Class1_Sub1_Sub5_Sub4 local21;
		if (this.aBoolean188) {
			local21 = local8.method3152(-1);
		} else {
			local21 = local8.method3152(this.anInt4243);
		}
		return local21 == null ? null : local21;
	}
}
