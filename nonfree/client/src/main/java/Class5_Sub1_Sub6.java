import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class5_Sub1_Sub6 extends Class5_Sub1 {

	@OriginalMember(owner = "client!f", name = "I", descriptor = "I")
	private int anInt2704;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub6() {
		this(4096);
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(I)V")
	public Class5_Sub1_Sub6(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt2704 = 4096;
		this.anInt2704 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt2704 = (arg1.method4220() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(9) int[] local9 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			Static553.method2532(local9, 0, Static147.anInt3075, this.anInt2704);
		}
		return local9;
	}
}
