import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class3_Sub3_Sub1_Sub6 extends Class3_Sub3_Sub1 {

	@OriginalMember(owner = "client!nd", name = "rb", descriptor = "Z")
	public boolean aBoolean96 = false;

	@OriginalMember(owner = "client!nd", name = "Bb", descriptor = "I")
	private int anInt1871 = 0;

	@OriginalMember(owner = "client!nd", name = "Pb", descriptor = "I")
	private int anInt1875 = 0;

	@OriginalMember(owner = "client!nd", name = "wb", descriptor = "I")
	public final int anInt1868;

	@OriginalMember(owner = "client!nd", name = "tb", descriptor = "I")
	private final int anInt1866;

	@OriginalMember(owner = "client!nd", name = "xb", descriptor = "I")
	public final int anInt1869;

	@OriginalMember(owner = "client!nd", name = "vb", descriptor = "I")
	public final int anInt1867;

	@OriginalMember(owner = "client!nd", name = "pb", descriptor = "I")
	public final int anInt1865;

	@OriginalMember(owner = "client!nd", name = "zb", descriptor = "I")
	public final int anInt1870;

	@OriginalMember(owner = "client!nd", name = "Ib", descriptor = "Lclient!ua;")
	private Class3_Sub3_Sub14 aClass3_Sub3_Sub14_3;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub3_Sub1_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1868 = arg5 + arg6;
		this.anInt1866 = arg0;
		this.anInt1869 = arg3;
		this.anInt1867 = arg2;
		this.anInt1865 = arg4;
		this.anInt1870 = arg1;
		@Pc(36) int local36 = Static84.method1557(this.anInt1866).anInt2485;
		if (local36 == -1) {
			this.aBoolean96 = true;
		} else {
			this.aBoolean96 = false;
			this.aClass3_Sub3_Sub14_3 = Static16.method298(local36);
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)Lclient!de;")
	@Override
	protected Class3_Sub3_Sub1_Sub1 method1667() {
		@Pc(12) Class3_Sub3_Sub11 local12 = Static84.method1557(this.anInt1866);
		@Pc(25) Class3_Sub3_Sub1_Sub1 local25;
		if (this.aBoolean96) {
			local25 = local12.method1710(-1);
		} else {
			local25 = local12.method1710(this.anInt1875);
		}
		return local25 == null ? null : local25;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V")
	public void method1302(@OriginalArg(1) int arg0) {
		if (this.aBoolean96) {
			return;
		}
		this.anInt1871 += arg0;
		while (this.aClass3_Sub3_Sub14_3.anIntArray383[this.anInt1875] < this.anInt1871) {
			this.anInt1871 -= this.aClass3_Sub3_Sub14_3.anIntArray383[this.anInt1875];
			this.anInt1875++;
			if (this.aClass3_Sub3_Sub14_3.anIntArray382.length <= this.anInt1875) {
				this.aBoolean96 = true;
				return;
			}
		}
	}
}
