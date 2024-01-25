import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public final class Class10_Sub18 extends Class10 {

	@OriginalMember(owner = "client!rca", name = "e", descriptor = "Ljava/lang/String;")
	private final String aString120;

	@OriginalMember(owner = "client!rca", name = "m", descriptor = "I")
	private final int anInt9111;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class10_Sub18(@OriginalArg(0) Class3_Sub28 arg0) {
		super(arg0);
		this.aString120 = arg0.method5295();
		this.anInt9111 = arg0.method5272();
	}

	@OriginalMember(owner = "client!rca", name = "b", descriptor = "(B)V")
	@Override
	public void method9146() {
		if (Static587.anInt9587 != -1) {
			Static185.method2819(Static587.anInt9587, this.aString120, this.anInt9111);
		}
	}
}
