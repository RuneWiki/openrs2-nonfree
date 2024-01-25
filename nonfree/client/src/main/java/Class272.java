import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public final class Class272 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public final int anInt7257;

	@OriginalMember(owner = "client!qg", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class272(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7257 = arg1;
	}

	@OriginalMember(owner = "client!qg", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
