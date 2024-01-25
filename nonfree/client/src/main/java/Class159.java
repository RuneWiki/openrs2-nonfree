import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class159 {

	@OriginalMember(owner = "client!pm", name = "i", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray60;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class159(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray60 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public String method4311(@OriginalArg(1) int arg0) {
		return this.aStringArray60[arg0];
	}

	@OriginalMember(owner = "client!pm", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
