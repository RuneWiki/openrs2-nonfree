import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class10_Sub12 extends Class10 {

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	private final int anInt7028;

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
	private final int anInt7027;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub12(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt7028 = arg0.method5272();
		this.anInt7027 = arg0.method5275();
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		@Pc(13) Class72 local13 = Static410.aClass72Array1[this.anInt7028];
		Static266.method4100(local13.anInt2295, Static562.anIntArray516[local13.anInt2297], local13.anInt2298, local13.anInt2294, local13.anInt2299, local13.anInt2297, this.anInt7027);
	}
}
