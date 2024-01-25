import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public final class Class123 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
	public final int anInt3237;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
	public final int anInt3234;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public final int anInt3235;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
	public final int anInt3238;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(IIII)V")
	public Class123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3237 = arg0;
		this.anInt3234 = arg1;
		this.anInt3235 = arg3;
		this.anInt3238 = arg2;
	}

	@OriginalMember(owner = "client!fr", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
