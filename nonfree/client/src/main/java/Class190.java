import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public final class Class190 implements Interface3 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
	public final int anInt5735;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class190(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5735 = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
