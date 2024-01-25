import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class6_Sub2_Sub5 extends Class6_Sub2 {

	@OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
	private int anInt904;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(I)V")
	public Class6_Sub2_Sub5(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt904 = 4096;
		this.anInt904 = arg0;
	}

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub5() {
		this(4096);
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass100_41.method2225(arg0);
		if (super.aClass100_41.aBoolean185) {
			Static459.method5349(local17, 0, Static185.anInt4925, this.anInt904);
		}
		return local17;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!ha;I)V")
	@Override
	public void method5861(@OriginalArg(1) Class6_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt904 = (arg0.method3111() << 12) / 255;
		}
	}
}
