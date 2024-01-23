import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class1_Sub3_Sub12 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
	private int anInt1818;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub12() {
		this(4096);
	}

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub12(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1818 = 4096;
		this.anInt1818 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1818 = (arg0.method1772() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			Static274.method2689(local14, 0, Static110.anInt2934, this.anInt1818);
		}
		return local14;
	}
}
