import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
	private int anInt6049 = 0;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!pe;Lclient!uea;)V")
	public Class14_Sub1(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class284_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8276() {
		@Pc(24) int local24 = super.aClass284_2.aClass100_12.method2801(Static507.anInt9382, super.aClass37_29.AA()) + super.aClass284_2.anInt9596;
		@Pc(38) int local38 = super.aClass284_2.aClass237_12.method6027(super.aClass37_29.a(), Static227.anInt4616) + super.aClass284_2.anInt9598;
		super.aClass37_29.method7075((float) (local24 + super.aClass37_29.AA() / 2), (float) (super.aClass37_29.a() / 2 + local38), 4096, this.anInt6049);
		this.anInt6049 += ((Class284_Sub1) super.aClass284_2).anInt9601;
	}
}
