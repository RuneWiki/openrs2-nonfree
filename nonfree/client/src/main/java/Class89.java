import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class89 {

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
	public final int anInt2589;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class89(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt2589 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)I")
	public int method2470() {
		return this.anInt2589;
	}

	@OriginalMember(owner = "client!ha", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
