import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class3_Sub1_Sub4_Sub3 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
	private int anInt1270 = 0;

	@OriginalMember(owner = "client!gb", name = "tb", descriptor = "Z")
	public boolean aBoolean86 = false;

	@OriginalMember(owner = "client!gb", name = "qb", descriptor = "I")
	private int anInt1282 = 0;

	@OriginalMember(owner = "client!gb", name = "vb", descriptor = "I")
	public final int anInt1284;

	@OriginalMember(owner = "client!gb", name = "ib", descriptor = "I")
	public final int anInt1275;

	@OriginalMember(owner = "client!gb", name = "fb", descriptor = "I")
	public final int anInt1273;

	@OriginalMember(owner = "client!gb", name = "nb", descriptor = "I")
	public final int anInt1280;

	@OriginalMember(owner = "client!gb", name = "jb", descriptor = "I")
	public final int anInt1276;

	@OriginalMember(owner = "client!gb", name = "gb", descriptor = "I")
	private final int anInt1274;

	@OriginalMember(owner = "client!gb", name = "ob", descriptor = "Lclient!gg;")
	private Class3_Sub1_Sub8 aClass3_Sub1_Sub8_2;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub1_Sub4_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1284 = arg2;
		this.anInt1275 = arg4;
		this.anInt1273 = arg6 + arg5;
		this.anInt1280 = arg3;
		this.anInt1276 = arg1;
		this.anInt1274 = arg0;
		@Pc(37) int local37 = Static12.method196(this.anInt1274).anInt2378;
		if (local37 == -1) {
			this.aBoolean86 = true;
		} else {
			this.aBoolean86 = false;
			this.aClass3_Sub1_Sub8_2 = Static98.method1697(local37);
		}
	}

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)Lclient!o;")
	@Override
	protected Class3_Sub1_Sub4_Sub5 method2261() {
		@Pc(14) Class3_Sub1_Sub13 local14 = Static12.method196(this.anInt1274);
		@Pc(23) Class3_Sub1_Sub4_Sub5 local23;
		if (this.aBoolean86) {
			local23 = local14.method1831(-1);
		} else {
			local23 = local14.method1831(this.anInt1270);
		}
		return local23 == null ? null : local23;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)V")
	public void method965(@OriginalArg(0) int arg0) {
		if (this.aBoolean86) {
			return;
		}
		this.anInt1282 += arg0;
		while (this.aClass3_Sub1_Sub8_2.anIntArray136[this.anInt1270] < this.anInt1282) {
			this.anInt1282 -= this.aClass3_Sub1_Sub8_2.anIntArray136[this.anInt1270];
			this.anInt1270++;
			if (this.anInt1270 >= this.aClass3_Sub1_Sub8_2.anIntArray138.length) {
				this.aBoolean86 = true;
				return;
			}
		}
	}
}
