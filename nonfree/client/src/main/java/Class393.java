import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public final class Class393 {

	@OriginalMember(owner = "client!ws", name = "i", descriptor = "Lclient!cm;")
	private Interface8 anInterface8_1;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "Lclient!sg;")
	private final Class329 aClass329_5;

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
	private int anInt10592;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!sg;)V")
	public Class393(@OriginalArg(0) Class329 arg0) {
		this.aClass329_5 = arg0;
		this.anInt10592 = 1;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)I")
	public int method8954() {
		return this.anInt10592;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IB)V")
	public void method8955(@OriginalArg(0) int arg0) {
		this.anInt10592 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!cm;Z)V")
	public void method8957(@OriginalArg(0) Interface8 arg0) {
		if (arg0.method7617() != this.aClass329_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface8_1 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)Lclient!cm;")
	public Interface8 method8958() {
		return this.anInterface8_1;
	}

	@OriginalMember(owner = "client!ws", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
