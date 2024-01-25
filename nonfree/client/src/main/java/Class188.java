import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class188 {

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "I")
	public final int anInt4725;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(I)V")
	public Class188(@OriginalArg(0) int arg0) {
		this.anInt4725 = arg0;
	}

	@OriginalMember(owner = "client!kea", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
