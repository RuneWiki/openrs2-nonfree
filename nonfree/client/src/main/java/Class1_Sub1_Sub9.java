import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
	private int anInt1927;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub9(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1927 = 4096;
		this.anInt1927 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		this(4096);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1927 = (arg0.method2199() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(10) int[] local10 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			Static319.method1417(local10, 0, Static62.anInt1350, this.anInt1927);
		}
		return local10;
	}
}
