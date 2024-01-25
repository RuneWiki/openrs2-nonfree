import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public final class Class347 {

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "Lclient!kea;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
	private int anInt10067 = 1;

	@OriginalMember(owner = "client!uh", name = "L", descriptor = "Lclient!ud;")
	private final Class342 aClass342_5;

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lclient!ud;)V")
	public Class347(@OriginalArg(0) Class342 arg0) {
		this.aClass342_5 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)I")
	public int method8647() {
		return this.anInt10067;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
	public void method8648(@OriginalArg(1) int arg0) {
		this.anInt10067 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!kea;I)V")
	public void method8653(@OriginalArg(0) Interface11 arg0) {
		if (arg0.method9043() != this.aClass342_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface11_1 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Lclient!kea;")
	public Interface11 method8654() {
		return this.anInterface11_1;
	}
}
