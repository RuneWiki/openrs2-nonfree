import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class2_Sub2_Sub16 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
	private int anInt2797;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub16() {
		this(4096);
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(I)V")
	private Class2_Sub2_Sub16(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2797 = 4096;
		this.anInt2797 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(BLclient!nh;I)V")
	@Override
	public void method3957(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2797 = (arg0.method2122() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass16_41.method300(arg0);
		if (super.aClass16_41.aBoolean12) {
			Static231.method2215(local9, 0, Static54.anInt953, this.anInt2797);
		}
		return local9;
	}
}
