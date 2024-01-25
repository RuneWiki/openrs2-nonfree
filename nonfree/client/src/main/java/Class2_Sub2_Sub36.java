import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class2_Sub2_Sub36 extends Class2_Sub2 {

	@OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
	private int anInt6495;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2_Sub36(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt6495 = 4096;
		this.anInt6495 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub36() {
		this(4096);
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			Static359.method685(local9, 0, Static339.anInt6735, this.anInt6495);
		}
		return local9;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt6495 = (arg1.method4421() << 12) / 255;
		}
	}
}
