import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class138 {

	@OriginalMember(owner = "client!hh", name = "n", descriptor = "Lclient!sl;")
	private Interface21 anInterface21_1;

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
	private int anInt3563 = 1;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Lclient!vj;")
	private final Class344 aClass344_1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class138(@OriginalArg(0) Class344 arg0) {
		this.aClass344_1 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)I")
	public int method2931() {
		return this.anInt3563;
	}

	@OriginalMember(owner = "client!hh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(I)Lclient!sl;")
	public Interface21 method2934() {
		return this.anInterface21_1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
	public void method2935(@OriginalArg(0) int arg0) {
		this.anInt3563 = arg0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!sl;I)V")
	public void method2938(@OriginalArg(0) Interface21 arg0) {
		if (arg0.method7689() != this.aClass344_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface21_1 = arg0;
	}
}
