import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public final class Class21 {

	@OriginalMember(owner = "client!au", name = "k", descriptor = "I")
	public final int anInt327;

	@OriginalMember(owner = "client!au", name = "e", descriptor = "Lclient!dn;")
	private final Class86 aClass86_1;

	@OriginalMember(owner = "client!au", name = "d", descriptor = "I")
	private final int anInt323;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "I")
	public final int anInt325;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(IILclient!dn;)V")
	public Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2) {
		this.anInt327 = arg0;
		this.aClass86_1 = arg2;
		this.anInt323 = arg1;
		this.anInt325 = this.aClass86_1.anInt1714 * this.anInt323;
		if (this.anInt327 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!au", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
