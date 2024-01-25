import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jg", name = "J", descriptor = "I")
	private int anInt4649;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub15() {
		this(4096);
	}

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2_Sub15(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt4649 = 4096;
		this.anInt4649 = arg0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4649 = (arg0.method4325() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			Static598.method1134(local17, 0, Static153.anInt3070, this.anInt4649);
		}
		return local17;
	}
}
