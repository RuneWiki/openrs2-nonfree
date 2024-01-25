import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class6_Sub1_Sub2 extends Class6_Sub1 {

	@OriginalMember(owner = "client!bba", name = "G", descriptor = "I")
	private int anInt809;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(I)V")
	public Class6_Sub1_Sub2(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt809 = 4096;
		this.anInt809 = arg0;
	}

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub2() {
		this(4096);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			Static679.method1566(local9, 0, Static479.anInt8231, this.anInt809);
		}
		return local9;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt809 = (arg0.method8374() << 12) / 255;
		}
	}
}
