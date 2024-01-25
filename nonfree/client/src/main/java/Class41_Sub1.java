import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class41_Sub1 extends Class41 {

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
	private int anInt4231 = 0;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lclient!oh;Lclient!sv;)V")
	public Class41_Sub1(@OriginalArg(0) Class237 arg0, @OriginalArg(1) Class196_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8622() {
		@Pc(17) int local17 = super.aClass196_2.aClass173_11.method4706(Static328.anInt9768, super.aClass21_6.method5779()) + super.aClass196_2.anInt9127;
		@Pc(32) int local32 = super.aClass196_2.aClass60_10.method2078(Static594.anInt10159, super.aClass21_6.method5785()) + super.aClass196_2.anInt9129;
		super.aClass21_6.method5793((float) (local17 + super.aClass21_6.method5779() / 2), (float) (local32 + super.aClass21_6.method5785() / 2), 4096, this.anInt4231);
		this.anInt4231 += ((Class196_Sub1) super.aClass196_2).anInt9136;
	}
}
