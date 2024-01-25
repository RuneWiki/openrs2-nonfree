import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public final class Class368 {

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "I")
	public final int anInt10300;

	@OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class368(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt10300 = arg1;
	}

	@OriginalMember(owner = "client!vha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)I")
	public int method8531() {
		return this.anInt10300;
	}
}
