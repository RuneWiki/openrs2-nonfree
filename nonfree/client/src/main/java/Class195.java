import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class195 {

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
	public final int anInt5391;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V")
	public Class195(@OriginalArg(0) int arg0) {
		this.anInt5391 = arg0;
	}

	@OriginalMember(owner = "client!pj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
