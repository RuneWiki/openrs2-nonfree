import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public final class Class47 {

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "I")
	public final int anInt1394;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class47(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt1394 = arg1;
	}

	@OriginalMember(owner = "client!cda", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(I)I")
	public int method1168() {
		return this.anInt1394;
	}
}
