import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public abstract class Class119 {

	@OriginalMember(owner = "client!ph", name = "f", descriptor = "[I")
	public static final int[] anIntArray460 = new int[4096];

	static {
		for (@Pc(8) int local8 = 0; local8 < 4096; local8++) {
			anIntArray460[local8] = Static126.method2606(local8);
		}
	}

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
	protected Class119() {
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)Lclient!lr;")
	public abstract Class135 method3138();

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)[B")
	public abstract byte[] method3140(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
	public abstract int method3142(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)V")
	public abstract void method3143(@OriginalArg(0) int arg0);
}
