import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class252 {

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "Lclient!hm;")
	private Interface11 anInterface11_1;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
	private int anInt7192 = 1;

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "Lclient!cca;")
	private final Class44 aClass44_5;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!cca;)V")
	public Class252(@OriginalArg(0) Class44 arg0) {
		this.aClass44_5 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLclient!hm;)V")
	public void method6349(@OriginalArg(1) Interface11 arg0) {
		if (arg0.method8096() != this.aClass44_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface11_1 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)Lclient!hm;")
	public Interface11 method6350() {
		return this.anInterface11_1;
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)I")
	public int method6351() {
		return this.anInt7192;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BI)V")
	public void method6352(@OriginalArg(1) int arg0) {
		this.anInt7192 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
