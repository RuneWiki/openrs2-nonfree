import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class170 implements Interface14 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method5121() {
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	@Override
	public void method5118() {
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5120(@OriginalArg(0) boolean arg0) {
		Static80.method1297(Static177.aColorArray2[Static86.anInt7215], Static309.anInt5563, Static351.aString76, Static361.aColorArray3[Static86.anInt7215], Static92.aColorArray4[Static86.anInt7215]);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V")
	@Override
	public void method5119() {
		Static83.method1321();
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)I")
	@Override
	public int method5122() {
		return 100;
	}
}
