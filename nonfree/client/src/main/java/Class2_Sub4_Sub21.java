import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class2_Sub4_Sub21 extends Class2_Sub4 {

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "I")
	private int anInt2716;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub21() {
		this(4096);
	}

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I)V")
	private Class2_Sub4_Sub21(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2716 = 4096;
		this.anInt2716 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBLclient!kd;)V")
	@Override
	public void method3120(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt2716 = (arg1.method1534() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass78_41.method2318(arg0);
		if (super.aClass78_41.aBoolean144) {
			Static220.method1004(local7, 0, Static118.anInt2608, this.anInt2716);
		}
		return local7;
	}
}
