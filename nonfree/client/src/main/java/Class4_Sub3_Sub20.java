import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class4_Sub3_Sub20 extends Class4_Sub3 {

	@OriginalMember(owner = "client!k", name = "T", descriptor = "I")
	private int anInt2292;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
	public Class4_Sub3_Sub20() {
		this(4096);
	}

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(I)V")
	private Class4_Sub3_Sub20(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2292 = 4096;
		this.anInt2292 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			Static189.method189(local9, 0, Static134.anInt3188, this.anInt2292);
		}
		return local9;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2292 = (arg1.method1253() << 12) / 255;
		}
	}
}
