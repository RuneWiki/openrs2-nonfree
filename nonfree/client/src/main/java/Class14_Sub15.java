import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class14_Sub15 extends Class14 {

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(ILclient!dh;)V")
	public Class14_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class14_Sub15(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(II)I")
	@Override
	public int method9033(@OriginalArg(1) int arg0) {
		if (super.aClass2_Sub13_31.method2603()) {
			return 3;
		} else if (super.aClass2_Sub13_31.aClass14_Sub4_1.method2491() == 0) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(Z)V")
	@Override
	public void method9035() {
		if (super.aClass2_Sub13_31.method2603()) {
			super.anInt10835 = 0;
		}
		if (super.aClass2_Sub13_31.aClass14_Sub4_1.method2491() == 0) {
			super.anInt10835 = 0;
		}
		if (super.anInt10835 < 0 || super.anInt10835 > 2) {
			super.anInt10835 = this.method9029();
		}
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)V")
	@Override
	protected void method9031(@OriginalArg(1) int arg0) {
		super.anInt10835 = arg0;
	}

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "(I)Z")
	public boolean method5863() {
		if (super.aClass2_Sub13_31.method2603()) {
			return false;
		} else {
			return super.aClass2_Sub13_31.aClass14_Sub4_1.method2491() != 0;
		}
	}

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "(I)I")
	public int method5864() {
		return super.anInt10835;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)I")
	@Override
	protected int method9029() {
		return 2;
	}
}
