import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public final class Class215 {

	@OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
	public final int anInt7115;

	@OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
	private final int anInt7113;

	@OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(II)V")
	public Class215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7115 = arg1;
		this.anInt7113 = arg0;
	}

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)I")
	public int method6064() {
		return this.anInt7113;
	}

	@OriginalMember(owner = "client!mu", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
