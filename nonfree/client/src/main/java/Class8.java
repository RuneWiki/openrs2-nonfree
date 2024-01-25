import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public final class Class8 {

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	public final int anInt138;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(II)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt138 = arg1;
	}

	@OriginalMember(owner = "client!ag", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
