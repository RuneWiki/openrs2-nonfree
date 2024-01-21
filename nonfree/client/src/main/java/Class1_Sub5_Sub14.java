import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class1_Sub5_Sub14 extends Class1_Sub5 {

	@OriginalMember(owner = "client!kc", name = "V", descriptor = "I")
	private int anInt1978;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
	private Class1_Sub5_Sub14(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1978 = 4096;
		this.anInt1978 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub14() {
		this(4096);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ka;IZ)V")
	@Override
	public void method3148(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1978 = (arg0.method336() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3143(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass2_41.method19(arg0);
		if (super.aClass2_41.aBoolean2) {
			Static190.method1385(local9, 0, Static177.anInt4018, this.anInt1978);
		}
		return local9;
	}
}
