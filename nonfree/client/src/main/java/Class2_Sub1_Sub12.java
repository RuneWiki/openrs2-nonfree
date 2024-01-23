import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class2_Sub1_Sub12 extends Class2_Sub1 {

	@OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
	private int anInt1888;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub12() {
		this(4096);
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub12(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1888 = 4096;
		this.anInt1888 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1888 = (arg0.method4261() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			Static301.method301(local9, 0, Static114.anInt1359, this.anInt1888);
		}
		return local9;
	}
}
