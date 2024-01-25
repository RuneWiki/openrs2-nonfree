import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class236 {

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
	private final int anInt7008;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(II)V")
	public Class236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7008 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)I")
	public int method5694() {
		return this.anInt7008;
	}
}
