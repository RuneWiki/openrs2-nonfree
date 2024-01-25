import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public final class Class10_Sub19 extends Class10 {

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
	private final int anInt9214;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	private final int anInt9213;

	@OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
	private final int anInt9215;

	@OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
	private final int anInt9209;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
	private final int anInt9217;

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	private final int anInt9212;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub19(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt9214 = arg0.method5272();
		this.anInt9213 = arg0.method5272();
		this.anInt9215 = arg0.method5272();
		this.anInt9209 = arg0.method5272();
		this.anInt9217 = arg0.method5272();
		this.anInt9212 = arg0.method5272();
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static154.aClass234Array1[this.anInt9214].method5700(0);
		Static154.aClass234Array1[this.anInt9213].method5700(1);
		Static175.anInt10579 = 3;
		Static197.anInt3483 = 1;
		Static70.anInt1097 = this.anInt9212;
		Static287.anInt5195 = this.anInt9217;
		Static134.anInt2499 = 0;
		Static660.anInt10552 = this.anInt9215;
		Static405.anInt7242 = this.anInt9209;
		Static153.anInt2819 = 0;
		Static460.method6827();
		Static484.aBoolean631 = true;
	}
}
