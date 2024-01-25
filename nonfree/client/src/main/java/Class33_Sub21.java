import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public final class Class33_Sub21 extends Class33 {

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(ILclient!cq;)V")
	public Class33_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class33_Sub21(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
	@Override
	public void method8441() {
		if (this.method6747()) {
			if (super.aClass2_Sub13_32.aClass33_Sub24_1.method7330() && !Static250.method6951(super.aClass2_Sub13_32.aClass33_Sub24_1.method7329())) {
				super.anInt10093 = 1;
			}
			if (super.aClass2_Sub13_32.aClass33_Sub7_1.method3189() == 1) {
				super.anInt10093 = 1;
			}
		}
		if (super.anInt10093 == 3) {
			super.anInt10093 = 2;
		}
		if (super.anInt10093 < 0 || super.anInt10093 > 3) {
			super.anInt10093 = this.method8445();
		}
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)V")
	@Override
	protected void method8442(@OriginalArg(0) int arg0) {
		super.anInt10093 = arg0;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)I")
	@Override
	protected int method8445() {
		return 0;
	}

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "(I)Z")
	public boolean method6747() {
		return Static157.method2947(super.anInt10093);
	}

	@OriginalMember(owner = "client!qp", name = "e", descriptor = "(I)Z")
	public boolean method6748() {
		return true;
	}

	@OriginalMember(owner = "client!qp", name = "b", descriptor = "(II)I")
	@Override
	public int method8443(@OriginalArg(0) int arg0) {
		if (Static157.method2947(arg0)) {
			if (super.aClass2_Sub13_32.aClass33_Sub24_1.method7330() && !Static250.method6951(super.aClass2_Sub13_32.aClass33_Sub24_1.method7329())) {
				return 3;
			}
			if (super.aClass2_Sub13_32.aClass33_Sub7_1.method3189() == 1) {
				return 3;
			}
		}
		if (arg0 == 3) {
			return 3;
		} else if (Static157.method2947(arg0)) {
			return 2;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "(I)I")
	public int method6750() {
		return super.anInt10093;
	}
}
