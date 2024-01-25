import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public final class Class100 {

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Lclient!hq;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Lclient!jq;")
	private final Class174 aClass174_1;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	private int anInt3063;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!jq;)V")
	public Class100(@OriginalArg(0) Class174 arg0) {
		this.aClass174_1 = arg0;
		this.anInt3063 = 1;
	}

	@OriginalMember(owner = "client!fc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!hq;B)V")
	public void method2825(@OriginalArg(0) Interface14 arg0) {
		if (arg0.method8680() != this.aClass174_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface14_1 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I")
	public int method2827() {
		return this.anInt3063;
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)Lclient!hq;")
	public Interface14 method2828() {
		return this.anInterface14_1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	public void method2829(@OriginalArg(1) int arg0) {
		this.anInt3063 = arg0;
	}
}
