import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class6_Sub2_Sub3_Sub2 extends Class6_Sub2_Sub3 {

	@OriginalMember(owner = "client!h", name = "sb", descriptor = "Z")
	public boolean aBoolean56 = false;

	@OriginalMember(owner = "client!h", name = "ub", descriptor = "I")
	private int anInt1268 = 0;

	@OriginalMember(owner = "client!h", name = "Nb", descriptor = "I")
	private int anInt1276 = 0;

	@OriginalMember(owner = "client!h", name = "qb", descriptor = "I")
	public final int anInt1265;

	@OriginalMember(owner = "client!h", name = "nb", descriptor = "I")
	public final int anInt1264;

	@OriginalMember(owner = "client!h", name = "Hb", descriptor = "I")
	public final int anInt1273;

	@OriginalMember(owner = "client!h", name = "yb", descriptor = "I")
	private final int anInt1270;

	@OriginalMember(owner = "client!h", name = "zb", descriptor = "I")
	public final int anInt1271;

	@OriginalMember(owner = "client!h", name = "rb", descriptor = "I")
	public final int anInt1266;

	@OriginalMember(owner = "client!h", name = "wb", descriptor = "Lclient!tb;")
	private Class6_Sub2_Sub13 aClass6_Sub2_Sub13_1;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(IIIIIII)V")
	public Class6_Sub2_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1265 = arg3;
		this.anInt1264 = arg2;
		this.anInt1273 = arg4;
		this.anInt1270 = arg0;
		this.anInt1271 = arg6 + arg5;
		this.anInt1266 = arg1;
		@Pc(36) int local36 = Static98.method1873(this.anInt1270).anInt2066;
		if (local36 == -1) {
			this.aBoolean56 = true;
		} else {
			this.aBoolean56 = false;
			this.aClass6_Sub2_Sub13_1 = Static4.method1608(local36);
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V")
	public void method827(@OriginalArg(1) int arg0) {
		if (this.aBoolean56) {
			return;
		}
		this.anInt1276 += arg0;
		while (this.aClass6_Sub2_Sub13_1.anIntArray261[this.anInt1268] < this.anInt1276) {
			this.anInt1276 -= this.aClass6_Sub2_Sub13_1.anIntArray261[this.anInt1268];
			this.anInt1268++;
			if (this.aClass6_Sub2_Sub13_1.anIntArray264.length <= this.anInt1268) {
				this.aBoolean56 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "f", descriptor = "(I)Lclient!jb;")
	@Override
	public Class6_Sub2_Sub3_Sub3 method2063() {
		@Pc(15) Class6_Sub2_Sub8 local15 = Static98.method1873(this.anInt1270);
		@Pc(23) Class6_Sub2_Sub3_Sub3 local23;
		if (this.aBoolean56) {
			local23 = local15.method1404(-1);
		} else {
			local23 = local15.method1404(this.anInt1268);
		}
		return local23 == null ? null : local23;
	}
}
