import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class33_Sub3 extends Class33 {

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class33_Sub3(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
		Static316.method4779(super.anInt10093);
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(ILclient!cq;)V")
	public Class33_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
		Static316.method4779(super.anInt10093);
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)I")
	public int method1506() {
		return super.anInt10093;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	@Override
	public void method8441() {
		if (super.aClass2_Sub13_32.method1377().method3341() < 96) {
			super.anInt10093 = 0;
		}
		if (super.anInt10093 < 0 || super.anInt10093 > 2) {
			super.anInt10093 = this.method8445();
		}
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)Z")
	public boolean method1507() {
		return super.aClass2_Sub13_32.method1377().method3341() >= 96;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
	@Override
	protected int method8445() {
		return super.aClass2_Sub13_32.method1377().method3341() < 96 ? 0 : 2;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	@Override
	protected void method8442(@OriginalArg(0) int arg0) {
		super.anInt10093 = arg0;
		Static316.method4779(super.anInt10093);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(II)I")
	@Override
	public int method8443(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub13_32.method1377().method3341() < 96 ? 3 : 1;
	}
}
