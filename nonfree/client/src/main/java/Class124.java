import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public final class Class124 implements Interface6 {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)I")
	@Override
	public int method3966() {
		return 100;
	}

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V")
	@Override
	public void method3968() {
		Static205.method3374();
	}

	@OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)V")
	@Override
	public void method3969() {
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(IZ)V")
	@Override
	public void method3965(@OriginalArg(1) boolean arg0) {
		Static458.method6413(Static546.aString86, Static240.aColorArray1[Static187.anInt3680], Static379.aColorArray3[Static187.anInt3680], Static271.aColorArray2[Static187.anInt3680], Static473.anInt8332);
	}

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method3967() {
		return true;
	}
}
