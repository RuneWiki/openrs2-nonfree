import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public final class Class287 {

	@OriginalMember(owner = "client!pja", name = "u", descriptor = "Lclient!cfa;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!pja", name = "M", descriptor = "I")
	private int anInt7982 = 1;

	@OriginalMember(owner = "client!pja", name = "w", descriptor = "Lclient!uw;")
	private final Class370 aClass370_1;

	@OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(Lclient!uw;)V")
	public Class287(@OriginalArg(0) Class370 arg0) {
		this.aClass370_1 = arg0;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(Z)I")
	public int method7021() {
		return this.anInt7982;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILclient!cfa;)V")
	public void method7022(@OriginalArg(1) Interface8 arg0) {
		if (arg0.method8617() != this.aClass370_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface8_1 = arg0;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(B)Lclient!cfa;")
	public Interface8 method7024() {
		return this.anInterface8_1;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IB)V")
	public void method7025(@OriginalArg(0) int arg0) {
		this.anInt7982 = arg0;
	}

	@OriginalMember(owner = "client!pja", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
