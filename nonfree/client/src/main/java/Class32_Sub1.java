import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!bha", name = "r", descriptor = "I")
	private int anInt1297 = 0;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lclient!la;Lclient!pia;)V")
	public Class32_Sub1(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class25_Sub1 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8397() {
		@Pc(25) int local25 = super.aClass25_2.aClass83_9.method2416(Static612.anInt9912, super.aClass24_2.method8576()) + super.aClass25_2.anInt7824;
		@Pc(40) int local40 = super.aClass25_2.aClass50_10.method1701(super.aClass24_2.method8573(), Static90.anInt2181) + super.aClass25_2.anInt7821;
		super.aClass24_2.method8568((float) (super.aClass24_2.method8576() / 2 + local25), (float) (local40 + super.aClass24_2.method8573() / 2), 4096, this.anInt1297);
		this.anInt1297 += ((Class25_Sub1) super.aClass25_2).anInt7827;
	}
}
