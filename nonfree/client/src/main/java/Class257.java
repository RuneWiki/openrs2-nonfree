import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public final class Class257 {

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
	public final int anInt7176;

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class257(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt7176 = arg1;
	}

	@OriginalMember(owner = "client!wa", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)I")
	public int method5880() {
		return this.anInt7176;
	}
}
