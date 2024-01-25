import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class11_Sub4 extends Class11 {

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub4(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)Z")
	public boolean method1188() {
		if (super.aClass2_Sub30_32.method2983() == Static395.aClass150_8) {
			return !super.aClass2_Sub30_32.method2991();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub30_32.method2983() != Static395.aClass150_8) {
			return 3;
		} else if (super.aClass2_Sub30_32.method2991()) {
			return 3;
		} else if (arg0 == 0 || super.aClass2_Sub30_32.aClass11_Sub10_1.method2652() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	@Override
	public void method9616() {
		if (super.aClass2_Sub30_32.method2983() != Static395.aClass150_8) {
			super.anInt11012 = 1;
		} else if (super.aClass2_Sub30_32.method2991()) {
			super.anInt11012 = 0;
		}
		if (super.anInt11012 != 0 && super.anInt11012 != 1) {
			super.anInt11012 = this.method9617();
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		return 1;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)I")
	public int method1189() {
		return super.anInt11012;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		super.anInt11012 = arg0;
	}
}
