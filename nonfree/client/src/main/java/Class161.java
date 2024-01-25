import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public final class Class161 implements Interface3 {

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
	public final int anInt5018;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class161(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5018 = arg1;
	}

	@OriginalMember(owner = "client!jo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
