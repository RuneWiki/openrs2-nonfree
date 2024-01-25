import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public final class Class150 {

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
	public final int anInt3649;

	@OriginalMember(owner = "client!hda", name = "g", descriptor = "Ljava/lang/String;")
	public final String aString43;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
	public Class150(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		this.anInt3649 = arg2;
		this.aString43 = arg0;
	}

	@OriginalMember(owner = "client!hda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
