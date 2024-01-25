import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class33_Sub12 extends Class33 {

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class33_Sub12(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(ILclient!cq;)V")
	public Class33_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	@Override
	public void method8441() {
		if (super.aClass2_Sub13_32.method1375()) {
			super.anInt10093 = 2;
		} else if (!super.aClass2_Sub13_32.aClass33_Sub24_1.method7330() || !Static331.method4927(super.aClass2_Sub13_32.aClass33_Sub24_1.method7329())) {
			super.anInt10093 = 0;
		} else if (super.anInt10093 == 0) {
			super.anInt10093 = 1;
		}
		if (super.anInt10093 < 0 || super.anInt10093 > 2) {
			super.anInt10093 = this.method8445();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V")
	@Override
	protected void method8442(@OriginalArg(0) int arg0) {
		super.anInt10093 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)I")
	@Override
	protected int method8445() {
		if (super.aClass2_Sub13_32.method1375()) {
			return 2;
		} else if (super.aClass2_Sub13_32.aClass33_Sub24_1.method7330() && Static331.method4927(super.aClass2_Sub13_32.aClass33_Sub24_1.method7329())) {
			return 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)I")
	public int method4517() {
		return super.anInt10093;
	}

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)Z")
	public boolean method4518() {
		@Pc(9) int local9 = super.aClass2_Sub13_32.aClass33_Sub24_1.method7329();
		if (super.aClass2_Sub13_32.method1375()) {
			return false;
		} else {
			return !super.aClass2_Sub13_32.aClass33_Sub24_1.method7330() || !Static409.method6288(local9);
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)I")
	@Override
	public int method8443(@OriginalArg(0) int arg0) {
		@Pc(14) int local14 = super.aClass2_Sub13_32.aClass33_Sub24_1.method7329();
		if (super.aClass2_Sub13_32.method1375()) {
			return 3;
		} else if (super.aClass2_Sub13_32.aClass33_Sub24_1.method7330() && Static331.method4927(local14) && arg0 == 0) {
			return 3;
		} else if (super.aClass2_Sub13_32.aClass33_Sub24_1.method7330() && Static409.method6288(local14)) {
			return 3;
		} else {
			return 1;
		}
	}
}
