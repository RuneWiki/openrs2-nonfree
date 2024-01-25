import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public final class Class33_Sub18 extends Class33 {

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class33_Sub18(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(ILclient!cq;)V")
	public Class33_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!or", name = "d", descriptor = "(I)Z")
	public boolean method6342() {
		if (super.aClass2_Sub13_32.method1375()) {
			return false;
		} else {
			return super.aClass2_Sub13_32.method1372() == Static239.aClass63_14;
		}
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(II)I")
	@Override
	public int method8443(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub13_32.method1375()) {
			return 3;
		} else if (super.aClass2_Sub13_32.method1372() == Static239.aClass63_14) {
			if (arg0 == 0) {
				if (super.aClass2_Sub13_32.aClass33_Sub13_1.method4689() == 1) {
					return 2;
				}
				if (super.aClass2_Sub13_32.aClass33_Sub4_1.method1808() == 1) {
					return 2;
				}
				if (super.aClass2_Sub13_32.aClass33_Sub20_1.method6515() > 0) {
					return 2;
				}
			}
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)I")
	@Override
	protected int method8445() {
		return 1;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(II)V")
	@Override
	protected void method8442(@OriginalArg(0) int arg0) {
		super.anInt10093 = arg0;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	@Override
	public void method8441() {
		if (super.aClass2_Sub13_32.method1372() != Static239.aClass63_14) {
			super.anInt10093 = 1;
		} else if (super.aClass2_Sub13_32.method1375()) {
			super.anInt10093 = 0;
		}
		if (super.anInt10093 != 0 && super.anInt10093 != 1) {
			super.anInt10093 = this.method8445();
		}
	}

	@OriginalMember(owner = "client!or", name = "e", descriptor = "(I)I")
	public int method6344() {
		return super.anInt10093;
	}
}
