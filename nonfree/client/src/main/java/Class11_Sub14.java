import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public final class Class11_Sub14 extends Class11 {

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub14(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub14(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gga", name = "d", descriptor = "(I)I")
	public int method2893() {
		return super.anInt11012;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub30_32.method2991() ? 3 : 1;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)Z")
	public boolean method2895() {
		return !super.aClass2_Sub30_32.method2991();
	}

	@OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		if (super.aClass2_Sub30_32.method2991()) {
			return 2;
		} else if (super.aClass2_Sub30_32.aClass11_Sub20_2.method4858() && Static136.method1985(super.aClass2_Sub30_32.aClass11_Sub20_2.method4863())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		super.anInt11012 = arg0;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)V")
	@Override
	public void method9616() {
		if (super.aClass2_Sub30_32.method2991()) {
			super.anInt11012 = 2;
		}
		if (super.anInt11012 < 0 || super.anInt11012 > 2) {
			super.anInt11012 = this.method9617();
		}
	}
}
