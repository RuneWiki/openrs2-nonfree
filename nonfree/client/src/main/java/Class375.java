import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class375 {

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
	public final int anInt10144;

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString110;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class375(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt10144 = arg1;
		this.aString110 = arg0;
	}

	@OriginalMember(owner = "client!wj", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
