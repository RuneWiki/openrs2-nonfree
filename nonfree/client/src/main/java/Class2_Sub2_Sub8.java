import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class2_Sub2_Sub8 extends Class2_Sub2 {

	@OriginalMember(owner = "client!df", name = "gb", descriptor = "I")
	private int anInt848;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub8() {
		this(4096);
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(I)V")
	private Class2_Sub2_Sub8(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt848 = 4096;
		this.anInt848 = arg0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BILclient!va;)V")
	@Override
	public void method2580(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt848 = (arg1.method1461() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2575(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass76_38.method2290(arg0);
		if (super.aClass76_38.aBoolean142) {
			Static182.method1345(local9, 0, Static149.anInt3233, this.anInt848);
		}
		return local9;
	}
}
