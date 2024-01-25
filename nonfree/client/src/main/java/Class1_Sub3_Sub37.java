import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class1_Sub3_Sub37 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
	private int anInt9003;

	static {
		new Class266("", 73);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub37() {
		this(4096);
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(I)V")
	public Class1_Sub3_Sub37(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt9003 = 4096;
		this.anInt9003 = arg0;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!gw;II)V")
	@Override
	public void method7901(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9003 = (arg0.method3043() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method7906(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass227_41.method5672(arg0);
		if (super.aClass227_41.aBoolean433) {
			Static555.method5097(local14, 0, Static236.anInt4609, this.anInt9003);
		}
		return local14;
	}
}
