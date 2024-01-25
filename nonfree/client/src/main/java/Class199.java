import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public final class Class199 {

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
	public int anInt5306;

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "B")
	private byte aByte75;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
	public int anInt5307;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
	public int anInt5308;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
	public int anInt5309;

	@OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
	public int anInt5311;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class199() {
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!dt;)V")
	public Class199(@OriginalArg(0) Class3_Sub4 arg0) {
		this.aByte75 = arg0.method7960();
		this.anInt5309 = arg0.method7951();
		this.anInt5307 = arg0.method7895();
		this.anInt5308 = arg0.method7895();
		this.anInt5311 = arg0.method7895();
		this.anInt5306 = arg0.method7895();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)I")
	public int method4558() {
		return (this.aByte75 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)I")
	public int method4560() {
		return this.aByte75 & 0x7;
	}
}
