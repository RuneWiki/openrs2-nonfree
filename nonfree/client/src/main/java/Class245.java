import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public final class Class245 {

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
	public final int anInt7645;

	@OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
	public final int anInt7647;

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
	public final int anInt7646;

	@OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
	public final int anInt7644;

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(IIII)V")
	public Class245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7645 = arg3;
		this.anInt7647 = arg2;
		this.anInt7646 = arg0;
		this.anInt7644 = arg1;
	}

	@OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
