import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class4_Sub4_Sub3_Sub4 extends Class4_Sub4_Sub3 {

	@OriginalMember(owner = "client!lf", name = "bb", descriptor = "Z")
	public boolean aBoolean110 = false;

	@OriginalMember(owner = "client!lf", name = "hb", descriptor = "I")
	private int anInt1755 = 0;

	@OriginalMember(owner = "client!lf", name = "pb", descriptor = "I")
	private int anInt1759 = 0;

	@OriginalMember(owner = "client!lf", name = "nb", descriptor = "I")
	private final int anInt1758;

	@OriginalMember(owner = "client!lf", name = "qb", descriptor = "I")
	public final int anInt1760;

	@OriginalMember(owner = "client!lf", name = "sb", descriptor = "I")
	public final int anInt1762;

	@OriginalMember(owner = "client!lf", name = "ab", descriptor = "I")
	public final int anInt1750;

	@OriginalMember(owner = "client!lf", name = "Ab", descriptor = "I")
	public final int anInt1767;

	@OriginalMember(owner = "client!lf", name = "fb", descriptor = "I")
	public final int anInt1753;

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "Lclient!kc;")
	private Class4_Sub4_Sub9 aClass4_Sub4_Sub9_2;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class4_Sub4_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1758 = arg0;
		this.anInt1760 = arg3;
		this.anInt1762 = arg5 + arg6;
		this.anInt1750 = arg4;
		this.anInt1767 = arg2;
		this.anInt1753 = arg1;
		@Pc(36) int local36 = Static84.method1424(this.anInt1758).anInt2230;
		if (local36 == -1) {
			this.aBoolean110 = true;
		} else {
			this.aBoolean110 = false;
			this.aClass4_Sub4_Sub9_2 = Static118.method1796(local36);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
	public void method1155(@OriginalArg(0) int arg0) {
		if (this.aBoolean110) {
			return;
		}
		this.anInt1755 += arg0;
		while (this.aClass4_Sub4_Sub9_2.anIntArray200[this.anInt1759] < this.anInt1755) {
			this.anInt1755 -= this.aClass4_Sub4_Sub9_2.anIntArray200[this.anInt1759];
			this.anInt1759++;
			if (this.aClass4_Sub4_Sub9_2.anIntArray196.length <= this.anInt1759) {
				this.aBoolean110 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)Lclient!u;")
	@Override
	public Class4_Sub4_Sub3_Sub7 method1754() {
		@Pc(4) Class4_Sub4_Sub13 local4 = Static84.method1424(this.anInt1758);
		@Pc(17) Class4_Sub4_Sub3_Sub7 local17;
		if (this.aBoolean110) {
			local17 = local4.method1545(-1);
		} else {
			local17 = local4.method1545(this.anInt1759);
		}
		return local17 == null ? null : local17;
	}
}
