import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class3_Sub2_Sub12 extends Class3_Sub2 {

	@OriginalMember(owner = "client!hd", name = "ab", descriptor = "I")
	private int anInt1496;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub12() {
		this(4096);
	}

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V")
	private Class3_Sub2_Sub12(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1496 = 4096;
		this.anInt1496 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			Static218.method2015(local9, 0, Static190.anInt3865, this.anInt1496);
		}
		return local9;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1496 = (arg0.method1278() << 12) / 255;
		}
	}
}
