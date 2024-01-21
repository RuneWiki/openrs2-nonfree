import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class2_Sub3_Sub27 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "I")
	private int anInt2998;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub27() {
		this(4096);
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
	private Class2_Sub3_Sub27(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2998 = 4096;
		this.anInt2998 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt2998 = (arg1.method2962() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(10) int[] local10 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			Static191.method1825(local10, 0, Static53.anInt1184, this.anInt2998);
		}
		return local10;
	}
}
