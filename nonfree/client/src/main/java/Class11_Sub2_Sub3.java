import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class11_Sub2_Sub3 extends Class11_Sub2 {

	@OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub3() {
		this(4096);
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(I)V")
	public Class11_Sub2_Sub3(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt675 = 4096;
		this.anInt675 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt675 = (arg0.method5185() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			Static363.method1670(local15, 0, Static339.anInt6549, this.anInt675);
		}
		return local15;
	}
}
