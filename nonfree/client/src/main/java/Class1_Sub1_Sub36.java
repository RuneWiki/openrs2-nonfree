import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class1_Sub1_Sub36 extends Class1_Sub1 {

	@OriginalMember(owner = "client!v", name = "K", descriptor = "I")
	private int anInt6275;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub36() {
		this(4096);
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
	public Class1_Sub1_Sub36(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt6275 = 4096;
		this.anInt6275 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6007(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass98_41.method2856(arg0);
		if (super.aClass98_41.aBoolean210) {
			Static374.method2829(local9, 0, Static85.anInt1910, this.anInt6275);
		}
		return local9;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt6275 = (arg1.method2132() << 12) / 255;
		}
	}
}
