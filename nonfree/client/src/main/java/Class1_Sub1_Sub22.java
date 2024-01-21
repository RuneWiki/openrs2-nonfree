import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "kb", descriptor = "I")
	private int anInt2777;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub22(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2777 = 4096;
		this.anInt2777 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		this(4096);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt2777 = (arg1.method1738() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(25) int[] local25 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			Static217.method2360(local25, 0, Static176.anInt3921, this.anInt2777);
		}
		return local25;
	}
}
