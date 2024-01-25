import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public final class Class119 {

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "Lclient!mo;")
	private Interface17 anInterface17_1;

	@OriginalMember(owner = "client!gh", name = "l", descriptor = "Lclient!mk;")
	private final Class206 aClass206_1;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
	private int anInt4054;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Lclient!mk;)V")
	public Class119(@OriginalArg(0) Class206 arg0) {
		this.aClass206_1 = arg0;
		this.anInt4054 = 1;
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)I")
	public int method3447() {
		return this.anInt4054;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)V")
	public void method3448(@OriginalArg(0) int arg0) {
		this.anInt4054 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLclient!mo;)V")
	public void method3449(@OriginalArg(1) Interface17 arg0) {
		if (arg0.method6325() != this.aClass206_1) {
			throw new IllegalArgumentException();
		}
		this.anInterface17_1 = arg0;
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)Lclient!mo;")
	public Interface17 method3451() {
		return this.anInterface17_1;
	}

	@OriginalMember(owner = "client!gh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
