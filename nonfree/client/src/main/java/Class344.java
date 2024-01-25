import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public final class Class344 {

	@OriginalMember(owner = "client!us", name = "e", descriptor = "I")
	private final int anInt9759;

	@OriginalMember(owner = "client!us", name = "d", descriptor = "I")
	public final int anInt9758;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "(II)V")
	public Class344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9759 = arg0;
		this.anInt9758 = arg1;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(B)I")
	public int method8049() {
		return this.anInt9759;
	}

	@OriginalMember(owner = "client!us", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
