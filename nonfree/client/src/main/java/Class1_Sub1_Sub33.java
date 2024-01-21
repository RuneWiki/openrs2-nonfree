import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!si", name = "bb", descriptor = "I")
	private int anInt3692;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub33(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3692 = 4096;
		this.anInt3692 = arg0;
	}

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		this(4096);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			Static216.method2202(local16, 0, Static107.anInt2321, this.anInt3692);
		}
		return local16;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3692 = (arg0.method3010() << 12) / 255;
		}
	}
}
