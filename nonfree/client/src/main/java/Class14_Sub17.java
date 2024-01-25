import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public final class Class14_Sub17 extends Class14 {

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(ILclient!dh;)V")
	public Class14_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class14_Sub17(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	@Override
	protected void method9031(@OriginalArg(1) int arg0) {
		super.anInt10835 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)Z")
	public boolean method5996() {
		if (super.aClass2_Sub13_31.method2603()) {
			return false;
		} else {
			return super.aClass2_Sub13_31.method2600() == Static195.aClass316_2;
		}
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)I")
	@Override
	public int method9033(@OriginalArg(1) int arg0) {
		if (super.aClass2_Sub13_31.method2603()) {
			return 3;
		} else if (super.aClass2_Sub13_31.method2600() == Static195.aClass316_2) {
			if (arg0 == 0) {
				if (super.aClass2_Sub13_31.aClass14_Sub23_1.method7808() == 1) {
					return 2;
				}
				if (super.aClass2_Sub13_31.aClass14_Sub4_1.method2491() == 1) {
					return 2;
				}
				if (super.aClass2_Sub13_31.aClass14_Sub25_1.method8177() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
	@Override
	public void method9035() {
		if (super.aClass2_Sub13_31.method2600() != Static195.aClass316_2) {
			super.anInt10835 = 1;
		} else if (super.aClass2_Sub13_31.method2603()) {
			super.anInt10835 = 0;
		}
		if (super.anInt10835 != 0 && super.anInt10835 != 1) {
			super.anInt10835 = this.method9029();
		}
	}

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)I")
	public int method5998() {
		return super.anInt10835;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)I")
	@Override
	protected int method9029() {
		return 1;
	}
}
