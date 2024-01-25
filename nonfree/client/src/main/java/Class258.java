import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public final class Class258 {

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
	public final int anInt7175;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class258(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7175 = arg1;
	}

	@OriginalMember(owner = "client!wa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)I")
	public int method5675() {
		return this.anInt7175;
	}
}
