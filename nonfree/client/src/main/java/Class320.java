import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public final class Class320 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public final int anInt8440;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
	public Class320(@OriginalArg(0) int arg0) {
		this.anInt8440 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
