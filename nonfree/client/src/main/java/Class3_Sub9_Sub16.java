import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class3_Sub9_Sub16 extends Class3_Sub9 {

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
	private int anInt3447;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(I)V")
	public Class3_Sub9_Sub16(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt3447 = 4096;
		this.anInt3447 = arg0;
	}

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class3_Sub9_Sub16() {
		this(4096);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9165(@OriginalArg(1) int arg0) {
		@Pc(9) int[] local9 = super.aClass113_41.method3239(arg0);
		if (super.aClass113_41.aBoolean275) {
			Static684.method5330(local9, 0, Static62.anInt1251, this.anInt3447);
		}
		return local9;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lclient!jp;IB)V")
	@Override
	public void method9166(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3447 = (arg0.method8632() << 12) / 255;
		}
	}
}
