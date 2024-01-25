import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class295 {

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
	public final int anInt7929;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(I)V")
	public Class295(@OriginalArg(0) int arg0) {
		this.anInt7929 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
