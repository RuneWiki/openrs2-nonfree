import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class331 {

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "Lclient!wv;")
	private Interface27 anInterface27_1;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "Lclient!il;")
	private final Class171 aClass171_5;

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
	private int anInt8687;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lclient!il;)V")
	public Class331(@OriginalArg(0) Class171 arg0) {
		this.aClass171_5 = arg0;
		this.anInt8687 = 1;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
	public void method7476(@OriginalArg(1) int arg0) {
		this.anInt8687 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!wv;)V")
	public void method7478(@OriginalArg(1) Interface27 arg0) {
		if (arg0.method4357() != this.aClass171_5) {
			throw new IllegalArgumentException();
		}
		this.anInterface27_1 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)Lclient!wv;")
	public Interface27 method7479() {
		return this.anInterface27_1;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)I")
	public int method7480() {
		return this.anInt8687;
	}

	@OriginalMember(owner = "client!sh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
