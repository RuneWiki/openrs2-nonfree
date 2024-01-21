import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class2_Sub1_Sub4_Sub1 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "Z")
	public boolean aBoolean50 = false;

	@OriginalMember(owner = "client!dc", name = "zb", descriptor = "I")
	private int anInt768 = 0;

	@OriginalMember(owner = "client!dc", name = "Gb", descriptor = "I")
	private int anInt771 = 0;

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
	public final int anInt756;

	@OriginalMember(owner = "client!dc", name = "pb", descriptor = "I")
	private final int anInt763;

	@OriginalMember(owner = "client!dc", name = "ub", descriptor = "I")
	public final int anInt765;

	@OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
	public final int anInt758;

	@OriginalMember(owner = "client!dc", name = "rb", descriptor = "I")
	public final int anInt764;

	@OriginalMember(owner = "client!dc", name = "wb", descriptor = "I")
	public final int anInt766;

	@OriginalMember(owner = "client!dc", name = "nb", descriptor = "Lclient!mb;")
	private Class2_Sub1_Sub10 aClass2_Sub1_Sub10_1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub1_Sub4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt756 = arg3;
		this.anInt763 = arg0;
		this.anInt765 = arg2;
		this.anInt758 = arg6 + arg5;
		this.anInt764 = arg1;
		this.anInt766 = arg4;
		@Pc(37) int local37 = Static75.method1409(this.anInt763).anInt2572;
		if (local37 == -1) {
			this.aBoolean50 = true;
		} else {
			this.aBoolean50 = false;
			this.aClass2_Sub1_Sub10_1 = Static54.method1158(local37);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V")
	public void method511(@OriginalArg(1) int arg0) {
		if (this.aBoolean50) {
			return;
		}
		this.anInt771 += arg0;
		while (this.anInt771 > this.aClass2_Sub1_Sub10_1.anIntArray293[this.anInt768]) {
			this.anInt771 -= this.aClass2_Sub1_Sub10_1.anIntArray293[this.anInt768];
			this.anInt768++;
			if (this.anInt768 >= this.aClass2_Sub1_Sub10_1.anIntArray292.length) {
				this.aBoolean50 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(Z)Lclient!hb;")
	@Override
	protected Class2_Sub1_Sub4_Sub5 method1264() {
		@Pc(10) Class2_Sub1_Sub14 local10 = Static75.method1409(this.anInt763);
		@Pc(23) Class2_Sub1_Sub4_Sub5 local23;
		if (this.aBoolean50) {
			local23 = local10.method1600(-1);
		} else {
			local23 = local10.method1600(this.anInt768);
		}
		return local23 == null ? null : local23;
	}
}
