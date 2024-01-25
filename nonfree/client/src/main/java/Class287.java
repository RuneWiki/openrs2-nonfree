import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class287 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
	public int anInt8533;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
	public int anInt8534;

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
	public int anInt8535;

	@OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
	public int anInt8536;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
	public Class287() {
	}

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lclient!rb;)V")
	public Class287(@OriginalArg(0) Class287 arg0) {
		this.anInt8535 = arg0.anInt8535;
		this.anInt8534 = arg0.anInt8534;
		this.anInt8533 = arg0.anInt8533;
		this.anInt8536 = arg0.anInt8536;
	}
}
