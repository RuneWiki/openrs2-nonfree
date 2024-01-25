import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class291 {

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
	public final int anInt8509;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(I)V")
	public Class291(@OriginalArg(0) int arg0) {
		this.anInt8509 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
