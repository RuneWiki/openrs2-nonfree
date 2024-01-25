import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!kha;Lclient!kha;Lclient!cm;)V")
	public Class39_Sub2(@OriginalArg(0) Class181 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class41_Sub2 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIZ)V")
	@Override
	protected void method8349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21 = this.method8348() * super.aClass41_5.anInt9779 / 10000;
		Static47.aClass33_3.aa(arg0, arg1 + 2, local21, super.aClass41_5.anInt9773 - 2, ((Class41_Sub2) super.aClass41_5).anInt1912, 0);
		Static47.aClass33_3.aa(arg0 + local21, arg1 - -2, super.aClass41_5.anInt9779 - local21, super.aClass41_5.anInt9773 + -2, 0, 0);
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(IIIZ)V")
	@Override
	protected void method8350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static47.aClass33_3.method6174(arg1 - 2, arg0, super.aClass41_5.anInt9779 + 4, super.aClass41_5.anInt9773 + 2, ((Class41_Sub2) super.aClass41_5).anInt1910, 0);
		Static47.aClass33_3.method6174(arg1 - 1, arg0 + 1, super.aClass41_5.anInt9779 + 2, super.aClass41_5.anInt9773, 0, 0);
	}
}
