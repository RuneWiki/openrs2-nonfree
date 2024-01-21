import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class3_Sub5_Sub31 extends Class3_Sub5 {

	@OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
	private int anInt3805;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(I)V")
	private Class3_Sub5_Sub31(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3805 = 4096;
		this.anInt3805 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class3_Sub5_Sub31() {
		this(4096);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt3805 = (arg1.method2107() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3173(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass39_41.method1114(arg0);
		if (super.aClass39_41.aBoolean66) {
			Static200.method1180(local17, 0, Static104.anInt2195, this.anInt3805);
		}
		return local17;
	}
}
