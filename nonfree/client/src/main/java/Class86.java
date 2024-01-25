import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class86 {

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public final int anInt2188;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class86(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2188 = arg1;
	}

	@OriginalMember(owner = "client!ee", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
