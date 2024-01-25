import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public final class Class137 implements Interface10 {

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
	public final int anInt3804;

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class137(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3804 = arg1;
	}

	@OriginalMember(owner = "client!ht", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
