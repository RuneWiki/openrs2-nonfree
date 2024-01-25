import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class118 {

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "Lclient!rea;")
	private Interface20 anInterface20_1;

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "Lclient!rba;")
	private final Class277 aClass277_1;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
	private int anInt3033;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class118(@OriginalArg(0) Class277 arg0) {
		this.aClass277_1 = arg0;
		this.anInt3033 = 1;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)Lclient!rea;")
	public Interface20 method2559() {
		return this.anInterface20_1;
	}

	@OriginalMember(owner = "client!gg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)I")
	public int method2562() {
		return this.anInt3033;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
	public void method2563(@OriginalArg(0) int arg0) {
		this.anInt3033 = arg0;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!rea;)V")
	public void method2566(@OriginalArg(1) Interface20 arg0) {
		if (arg0.method7281() != this.aClass277_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface20_1 = arg0;
	}
}
