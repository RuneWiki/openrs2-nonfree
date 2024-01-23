import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public final class Class2_Sub1_Sub29 extends Class2_Sub1 {

	@OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
	private int anInt3896;

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub29(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3896 = 4096;
		this.anInt3896 = arg0;
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub29() {
		this(4096);
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			Static323.method3553(local20, 0, Static281.anInt5558, this.anInt3896);
		}
		return local20;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3896 = (arg0.method2146() << 12) / 255;
		}
	}
}
