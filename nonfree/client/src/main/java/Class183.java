import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public final class Class183 {

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString51;

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "I")
	public final int anInt5280;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class183(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString51 = arg0;
		this.anInt5280 = arg1;
	}

	@OriginalMember(owner = "client!oq", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
