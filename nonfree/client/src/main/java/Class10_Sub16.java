import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class10_Sub16 extends Class10 {

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
	private final int anInt7423;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	private final int anInt7426;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
	private final int anInt7429;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
	private final int anInt7424;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
	private final int anInt7427;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub16(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.anInt7423 = arg0.method5272();
		this.anInt7426 = arg0.method5272();
		this.anInt7429 = arg0.method5272();
		this.anInt7424 = arg0.method5272();
		this.anInt7427 = arg0.method5272();
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		Static536.method7528(this.anInt7426, this.anInt7423, 100, false, 100, this.anInt7429);
		Static188.method2869(this.anInt7427, this.anInt7424);
		Static484.aBoolean631 = true;
	}
}
