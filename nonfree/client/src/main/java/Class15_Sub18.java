import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class15_Sub18 extends Class15 {

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	private final int anInt8233;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
	private final int anInt8230;

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
	private final int anInt8235;

	@OriginalMember(owner = "client!qh", name = "o", descriptor = "I")
	private final int anInt8234;

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
	private final int anInt8236;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub18(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt8233 = arg0.method8575();
		this.anInt8230 = arg0.method8575();
		this.anInt8235 = arg0.method8575();
		this.anInt8234 = arg0.method8575();
		this.anInt8236 = arg0.method8575();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static416.method6073(this.anInt8235, 100, 100, false, this.anInt8233, this.anInt8230);
		Static151.method7128(this.anInt8236, this.anInt8234);
		Static337.aBoolean444 = true;
	}
}
