import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class57 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "I")
	public final int anInt1623;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "I")
	public final int anInt1627;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	public final int anInt1626;

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	public final int anInt1628;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIII)V")
	public Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1623 = arg1;
		this.anInt1627 = arg0;
		this.anInt1626 = arg3;
		this.anInt1628 = arg2;
	}

	@OriginalMember(owner = "client!db", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
