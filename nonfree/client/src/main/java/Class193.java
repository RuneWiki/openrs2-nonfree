import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public final class Class193 {

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
	public final int anInt5381;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class193(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5381 = arg1;
	}

	@OriginalMember(owner = "client!ph", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
