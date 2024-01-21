import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class1_Sub1_Sub2_Sub5 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!la", name = "Jb", descriptor = "I")
	private int anInt1772 = 0;

	@OriginalMember(owner = "client!la", name = "Rb", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!la", name = "Qb", descriptor = "I")
	private int anInt1777 = 0;

	@OriginalMember(owner = "client!la", name = "bc", descriptor = "I")
	public final int anInt1785;

	@OriginalMember(owner = "client!la", name = "Lb", descriptor = "I")
	public final int anInt1773;

	@OriginalMember(owner = "client!la", name = "ac", descriptor = "I")
	public final int anInt1784;

	@OriginalMember(owner = "client!la", name = "Zb", descriptor = "I")
	public final int anInt1783;

	@OriginalMember(owner = "client!la", name = "Mb", descriptor = "I")
	private final int anInt1774;

	@OriginalMember(owner = "client!la", name = "Db", descriptor = "I")
	public final int anInt1768;

	@OriginalMember(owner = "client!la", name = "Gb", descriptor = "Lclient!h;")
	private Class1_Sub1_Sub8 aClass1_Sub1_Sub8_3;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub1_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1785 = arg3;
		this.anInt1773 = arg2;
		this.anInt1784 = arg5 + arg6;
		this.anInt1783 = arg4;
		this.anInt1774 = arg0;
		this.anInt1768 = arg1;
		@Pc(36) int local36 = Static48.method985(this.anInt1774).anInt1428;
		if (local36 == -1) {
			this.aBoolean88 = true;
		} else {
			this.aBoolean88 = false;
			this.aClass1_Sub1_Sub8_3 = Static18.method249(local36);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)V")
	public void method1095(@OriginalArg(0) int arg0) {
		if (this.aBoolean88) {
			return;
		}
		this.anInt1772 += arg0;
		while (this.aClass1_Sub1_Sub8_3.anIntArray143[this.anInt1777] < this.anInt1772) {
			this.anInt1772 -= this.aClass1_Sub1_Sub8_3.anIntArray143[this.anInt1777];
			this.anInt1777++;
			if (this.anInt1777 >= this.aClass1_Sub1_Sub8_3.anIntArray147.length) {
				this.aBoolean88 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)Lclient!qb;")
	@Override
	public Class1_Sub1_Sub2_Sub6 method1415() {
		@Pc(4) Class1_Sub1_Sub9 local4 = Static48.method985(this.anInt1774);
		@Pc(12) Class1_Sub1_Sub2_Sub6 local12;
		if (this.aBoolean88) {
			local12 = local4.method889(-1);
		} else {
			local12 = local4.method889(this.anInt1777);
		}
		return local12 == null ? null : local12;
	}
}
