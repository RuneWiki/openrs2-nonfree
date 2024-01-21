import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
	private int anInt3789;

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		this(4096);
	}

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub30(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3789 = 4096;
		this.anInt3789 = arg0;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3789 = (arg0.method2771() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			Static214.method349(local14, 0, Static115.anInt2578, this.anInt3789);
		}
		return local14;
	}
}
