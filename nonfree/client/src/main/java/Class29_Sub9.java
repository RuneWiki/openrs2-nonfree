import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public final class Class29_Sub9 extends Class29 {

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(Lclient!fs;)V")
	public Class29_Sub9(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fka", name = "<init>", descriptor = "(ILclient!fs;)V")
	public Class29_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fka", name = "c", descriptor = "(I)Z")
	public boolean method2298() {
		if (super.aClass6_Sub22_31.method2360()) {
			return false;
		} else {
			return super.aClass6_Sub22_31.method2365() == Static615.aClass176_7;
		}
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(I)V")
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

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(II)I")
	@Override
	public int method8994(@OriginalArg(0) int arg0) {
		if (super.aClass6_Sub22_31.method2360()) {
			return 3;
		} else if (super.aClass6_Sub22_31.method2365() == Static615.aClass176_7) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!fka", name = "d", descriptor = "(II)V")
	@Override
	protected void method9000(@OriginalArg(0) int arg0) {
		super.anInt10604 = arg0;
	}

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(B)I")
	@Override
	protected int method8997() {
		return 1;
	}

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "(B)I")
	public int method2300() {
		return super.anInt10604;
	}
}
