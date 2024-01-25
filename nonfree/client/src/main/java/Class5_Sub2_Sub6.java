import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dfa")
public final class Class5_Sub2_Sub6 extends Class5_Sub2 {

	@OriginalMember(owner = "client!dfa", name = "E", descriptor = "I")
	private int anInt1496;

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub6() {
		this(4096);
	}

	@OriginalMember(owner = "client!dfa", name = "<init>", descriptor = "(I)V")
	public Class5_Sub2_Sub6(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt1496 = 4096;
		this.anInt1496 = arg0;
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(Lclient!ee;BI)V")
	@Override
	public void method8825(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1496 = (arg0.method8645() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!dfa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		@Pc(14) int[] local14 = super.aClass246_41.method5949(arg0);
		if (super.aClass246_41.aBoolean561) {
			Static655.method4110(local14, 0, Static314.anInt6320, this.anInt1496);
		}
		return local14;
	}
}
