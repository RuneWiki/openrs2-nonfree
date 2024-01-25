import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public final class Class324 {

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
	public final int anInt9051;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(I)V")
	public Class324(@OriginalArg(0) int arg0) {
		this.anInt9051 = arg0;
	}

	@OriginalMember(owner = "client!ti", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
