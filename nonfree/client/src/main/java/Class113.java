import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public final class Class113 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public final int anInt3065;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class113(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3065 = arg1;
	}

	@OriginalMember(owner = "client!g", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)I")
	public int method2576() {
		return this.anInt3065;
	}
}
