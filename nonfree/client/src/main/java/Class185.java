import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class185 {

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
	public final int anInt5611;

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class185(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5611 = arg1;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)I")
	public int method4847() {
		return this.anInt5611;
	}

	@OriginalMember(owner = "client!lt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
