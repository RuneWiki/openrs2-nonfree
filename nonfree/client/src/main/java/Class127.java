import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public final class Class127 {

	@OriginalMember(owner = "client!j", name = "f", descriptor = "I")
	public final int anInt3340;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class127(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3340 = arg1;
	}

	@OriginalMember(owner = "client!j", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)I")
	public int method2745() {
		return this.anInt3340;
	}
}
