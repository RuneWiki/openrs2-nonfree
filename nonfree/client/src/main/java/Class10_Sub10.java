import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public final class Class10_Sub10 extends Class10 {

	@OriginalMember(owner = "client!jba", name = "j", descriptor = "I")
	private final int anInt5224;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub10(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt5224 = arg0.method5272();
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static410.aClass72Array1[this.anInt5224].method2042();
	}
}
