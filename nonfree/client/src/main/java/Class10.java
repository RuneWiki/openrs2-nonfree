import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public final class Class10 {

	@OriginalMember(owner = "client!aga", name = "u", descriptor = "Lclient!qda;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!aga", name = "B", descriptor = "Lclient!lm;")
	private final Class227 aClass227_1;

	@OriginalMember(owner = "client!aga", name = "l", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lclient!lm;)V")
	public Class10(@OriginalArg(0) Class227 arg0) {
		this.aClass227_1 = arg0;
		this.anInt197 = 1;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)Lclient!qda;")
	public Interface20 method217() {
		return this.anInterface20_1;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lclient!qda;I)V")
	public void method218(@OriginalArg(0) Interface20 arg0) {
		if (arg0.method8705() != this.aClass227_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface20_1 = arg0;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)I")
	public int method219() {
		return this.anInt197;
	}

	@OriginalMember(owner = "client!aga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)V")
	public void method223(@OriginalArg(0) int arg0) {
		this.anInt197 = arg0;
	}
}
