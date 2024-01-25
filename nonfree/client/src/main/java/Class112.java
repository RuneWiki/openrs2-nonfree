import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class112 {

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public final int anInt3044;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class112(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3044 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)I")
	public int method2643() {
		return this.anInt3044;
	}

	@OriginalMember(owner = "client!ie", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
