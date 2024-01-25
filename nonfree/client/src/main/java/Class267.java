import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class267 {

	@OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
	public final int anInt7532;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class267(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7532 = arg1;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)I")
	public int method6153() {
		return this.anInt7532;
	}

	@OriginalMember(owner = "client!wh", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
