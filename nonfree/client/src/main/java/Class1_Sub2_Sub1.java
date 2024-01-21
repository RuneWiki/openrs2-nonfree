import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!af", name = "U", descriptor = "I")
	private int anInt269;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub1() {
		this(4096);
	}

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
	private Class1_Sub2_Sub1(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt269 = 4096;
		this.anInt269 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			Static188.method2301(local7, 0, Static22.anInt596, this.anInt269);
		}
		return local7;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt269 = (arg1.method1234() << 12) / 255;
		}
	}
}
