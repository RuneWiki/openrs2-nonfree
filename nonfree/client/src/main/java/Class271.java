import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public final class Class271 {

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
	public final int anInt7861;

	@OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(II)V")
	public Class271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7861 = arg1;
	}

	@OriginalMember(owner = "client!qv", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
