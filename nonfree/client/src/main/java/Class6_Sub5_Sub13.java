import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class6_Sub5_Sub13 extends Class6_Sub5 {

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
	private int anInt2735;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub13() {
		this(4096);
	}

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(I)V")
	public Class6_Sub5_Sub13(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2735 = 4096;
		this.anInt2735 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt2735 = (arg1.method6433() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6537(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass61_41.method1611(arg0);
		if (super.aClass61_41.aBoolean142) {
			Static459.method6344(local9, 0, Static240.anInt4386, this.anInt2735);
		}
		return local9;
	}
}
