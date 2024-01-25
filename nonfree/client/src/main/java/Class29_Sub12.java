import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public final class Class29_Sub12 extends Class29 {

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!fs;)V")
	public Class29_Sub12(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(ILclient!fs;)V")
	public Class29_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)Z")
	public boolean method4078() {
		if (super.aClass6_Sub22_31.method2365() == Static615.aClass176_7) {
			return !super.aClass6_Sub22_31.method2360();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
	@Override
	public int method8994(@OriginalArg(0) int arg0) {
		if (super.aClass6_Sub22_31.method2365() != Static615.aClass176_7) {
			return 3;
		} else if (super.aClass6_Sub22_31.method2360()) {
			return 3;
		} else if (arg0 == 0 || super.aClass6_Sub22_31.aClass29_Sub27_1.method8554() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)I")
	@Override
	protected int method8997() {
		return 1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	@Override
	public void method8995() {
		if (super.aClass6_Sub22_31.method2365() != Static615.aClass176_7) {
			super.anInt10604 = 1;
		} else if (super.aClass6_Sub22_31.method2360()) {
			super.anInt10604 = 0;
		}
		if (super.anInt10604 != 0 && super.anInt10604 != 1) {
			super.anInt10604 = this.method8997();
		}
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(II)V")
	@Override
	protected void method9000(@OriginalArg(0) int arg0) {
		super.anInt10604 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)I")
	public int method4082() {
		return super.anInt10604;
	}
}
