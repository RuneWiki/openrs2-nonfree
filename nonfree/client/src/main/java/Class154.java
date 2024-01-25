import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public final class Class154 {

	@OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
	private final int anInt3202;

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
	public final int anInt3201;

	@OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(II)V")
	public Class154(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3202 = arg0;
		this.anInt3201 = arg1;
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)I")
	public int method2683() {
		return this.anInt3202;
	}

	@OriginalMember(owner = "client!iba", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
