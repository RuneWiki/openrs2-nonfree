import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public final class Class268 implements Interface5 {

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
	public final int anInt7415;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class268(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7415 = arg1;
	}

	@OriginalMember(owner = "client!wt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
