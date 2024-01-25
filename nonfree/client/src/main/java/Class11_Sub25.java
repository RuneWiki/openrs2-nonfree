import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class11_Sub25 extends Class11 {

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub25(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
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

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		super.anInt11012 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub30_32.method2991()) {
			return 3;
		} else if (super.aClass2_Sub30_32.method2983() == Static395.aClass150_8) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)Z")
	public boolean method7990() {
		if (super.aClass2_Sub30_32.method2991()) {
			return false;
		} else {
			return super.aClass2_Sub30_32.method2983() == Static395.aClass150_8;
		}
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(I)I")
	public int method7993() {
		return super.anInt11012;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		return 1;
	}
}
