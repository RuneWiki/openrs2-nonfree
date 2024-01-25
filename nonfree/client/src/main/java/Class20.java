import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public final class Class20 {

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
	public final int anInt414;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(II)V")
	public Class20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt414 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
