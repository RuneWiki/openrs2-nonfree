import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!nw", name = "q", descriptor = "I")
	private int anInt6629 = 0;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!pj;Lclient!mu;)V")
	public Class111_Sub1(@OriginalArg(0) Class248 arg0, @OriginalArg(1) Class210_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6771() {
		@Pc(24) int local24 = super.aClass210_2.aClass114_9.method2576(super.aClass71_40.AA(), Static168.anInt3084) + super.aClass210_2.anInt6225;
		@Pc(39) int local39 = super.aClass210_2.aClass72_8.method1433(Static112.anInt1892, super.aClass71_40.a()) + super.aClass210_2.anInt6227;
		super.aClass71_40.method7768((float) (local24 + super.aClass71_40.AA() / 2), (float) (super.aClass71_40.a() / 2 + local39), 4096, this.anInt6629);
		this.anInt6629 += ((Class210_Sub1) super.aClass210_2).anInt6229;
	}
}
