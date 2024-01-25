import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public final class Class151 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	public final int anInt4213;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class151(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt4213 = arg1;
	}

	@OriginalMember(owner = "client!lb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
