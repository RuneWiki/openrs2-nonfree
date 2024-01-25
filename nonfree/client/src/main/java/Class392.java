import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class392 {

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "Lclient!nfa;")
	private Interface18 anInterface18_1;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
	private int anInt11157 = 1;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "Lclient!lj;")
	private final Class214 aClass214_5;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class392(@OriginalArg(0) Class214 arg0) {
		this.aClass214_5 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!nfa;Z)V")
	public void method9270(@OriginalArg(0) Interface18 arg0) {
		if (arg0.method9015() != this.aClass214_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface18_1 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(II)V")
	public void method9271(@OriginalArg(0) int arg0) {
		this.anInt11157 = arg0;
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "(I)I")
	public int method9273() {
		return this.anInt11157;
	}

	@OriginalMember(owner = "client!wq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)Lclient!nfa;")
	public Interface18 method9274() {
		return this.anInterface18_1;
	}
}
