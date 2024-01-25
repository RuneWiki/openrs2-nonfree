import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public final class Class299 {

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "I")
	public final int anInt8259;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class299(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8259 = arg1;
	}

	@OriginalMember(owner = "client!rda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)I")
	public int method7239() {
		return this.anInt8259;
	}
}
