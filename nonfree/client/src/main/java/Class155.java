import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class155 {

	@OriginalMember(owner = "client!jc", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString44;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	public final int anInt4200;

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class155(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString44 = arg0;
		this.anInt4200 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
