import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public final class Class309 {

	@OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
	public final int anInt8976;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(II)V")
	public Class309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8976 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
