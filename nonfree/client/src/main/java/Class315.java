import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public final class Class315 {

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "I")
	public final int anInt8723;

	@OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class315(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt8723 = arg1;
	}

	@OriginalMember(owner = "client!tga", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
