import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public final class Class341 {

	@OriginalMember(owner = "client!uk", name = "e", descriptor = "Lclient!ow;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
	private int anInt9496 = 1;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "Lclient!qfa;")
	private final Class276 aClass276_5;

	@OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class341(@OriginalArg(0) Class276 arg0) {
		this.aClass276_5 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)I")
	public int method7998() {
		return this.anInt9496;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!ow;I)V")
	public void method7999(@OriginalArg(0) Interface17 arg0) {
		if (arg0.method5453() != this.aClass276_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface17_1 = arg0;
	}

	@OriginalMember(owner = "client!uk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)Lclient!ow;")
	public Interface17 method8001() {
		return this.anInterface17_1;
	}

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)V")
	public void method8002(@OriginalArg(0) int arg0) {
		this.anInt9496 = arg0;
	}
}
