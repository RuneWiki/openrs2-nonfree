import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class2_Sub2_Sub3_Sub2 extends Class2_Sub2_Sub3 {

	@OriginalMember(owner = "client!ci", name = "ab", descriptor = "I")
	private int anInt614 = 0;

	@OriginalMember(owner = "client!ci", name = "rb", descriptor = "Z")
	public boolean aBoolean22 = false;

	@OriginalMember(owner = "client!ci", name = "vb", descriptor = "I")
	private int anInt628 = 0;

	@OriginalMember(owner = "client!ci", name = "mb", descriptor = "I")
	public final int anInt622;

	@OriginalMember(owner = "client!ci", name = "pb", descriptor = "I")
	public final int anInt624;

	@OriginalMember(owner = "client!ci", name = "sb", descriptor = "I")
	public final int anInt625;

	@OriginalMember(owner = "client!ci", name = "gb", descriptor = "I")
	public final int anInt619;

	@OriginalMember(owner = "client!ci", name = "wb", descriptor = "I")
	public final int anInt629;

	@OriginalMember(owner = "client!ci", name = "ob", descriptor = "I")
	private final int anInt623;

	@OriginalMember(owner = "client!ci", name = "lb", descriptor = "Lclient!bi;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_2;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(IIIIIII)V")
	public Class2_Sub2_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt622 = arg1;
		this.anInt624 = arg2;
		this.anInt625 = arg3;
		this.anInt619 = arg5 + arg6;
		this.anInt629 = arg4;
		this.anInt623 = arg0;
		@Pc(36) int local36 = Static170.method2831(this.anInt623).anInt2089;
		if (local36 == -1) {
			this.aBoolean22 = true;
		} else {
			this.aBoolean22 = false;
			this.aClass2_Sub2_Sub4_2 = Static29.method543(local36);
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)Lclient!ue;")
	@Override
	protected Class2_Sub2_Sub3_Sub4 method2725() {
		@Pc(16) Class2_Sub2_Sub11 local16 = Static170.method2831(this.anInt623);
		@Pc(25) Class2_Sub2_Sub3_Sub4 local25;
		if (this.aBoolean22) {
			local25 = local16.method1698(-1);
		} else {
			local25 = local16.method1698(this.anInt628);
		}
		return local25 == null ? null : local25;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IB)V")
	public void method505(@OriginalArg(0) int arg0) {
		if (this.aBoolean22) {
			return;
		}
		this.anInt614 += arg0;
		while (this.aClass2_Sub2_Sub4_2.anIntArray36[this.anInt628] < this.anInt614) {
			this.anInt614 -= this.aClass2_Sub2_Sub4_2.anIntArray36[this.anInt628];
			this.anInt628++;
			if (this.aClass2_Sub2_Sub4_2.anIntArray35.length <= this.anInt628) {
				this.aBoolean22 = true;
				return;
			}
		}
	}
}
