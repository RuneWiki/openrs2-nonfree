import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class2_Sub1_Sub5 extends Class2_Sub1 {

	@OriginalMember(owner = "client!da", name = "xb", descriptor = "I")
	private int anInt853;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub5() {
		this(4096);
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub5(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt853 = 4096;
		this.anInt853 = arg0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			Static222.method2223(local14, 0, Static135.anInt2897, this.anInt853);
		}
		return local14;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt853 = (arg0.method260() << 12) / 255;
		}
	}
}
