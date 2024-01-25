import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class73 {

	@OriginalMember(owner = "client!df", name = "p", descriptor = "Lclient!al;")
	private final Class19 aClass19_12;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "I")
	private final int anInt1767;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "I")
	public final int anInt1766;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public final int anInt1768;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IILclient!al;)V")
	public Class73(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class19 arg2) {
		this.aClass19_12 = arg2;
		this.anInt1767 = arg1;
		this.anInt1766 = arg0;
		this.anInt1768 = this.aClass19_12.anInt242 * this.anInt1767;
		if (this.anInt1766 >= 16) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!df", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
