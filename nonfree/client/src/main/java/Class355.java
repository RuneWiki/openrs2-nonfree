import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class355 {

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!uu;")
	private Interface26 anInterface26_1;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	private int anInt9811 = 1;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "Lclient!oi;")
	private final Class258 aClass258_5;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lclient!oi;)V")
	public Class355(@OriginalArg(0) Class258 arg0) {
		this.aClass258_5 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!uu;Z)V")
	public void method8434(@OriginalArg(0) Interface26 arg0) {
		if (arg0.method8919() != this.aClass258_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface26_1 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)V")
	public void method8435(@OriginalArg(1) int arg0) {
		this.anInt9811 = arg0;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I")
	public int method8437() {
		return this.anInt9811;
	}

	@OriginalMember(owner = "client!va", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)Lclient!uu;")
	public Interface26 method8441() {
		return this.anInterface26_1;
	}
}
