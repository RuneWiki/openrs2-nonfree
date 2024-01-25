import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class340 implements Interface12 {

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
	public final int anInt9704;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class340(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt9704 = arg1;
	}

	@OriginalMember(owner = "client!ss", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
