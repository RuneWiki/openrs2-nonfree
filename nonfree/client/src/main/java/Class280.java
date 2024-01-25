import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class280 implements Interface10 {

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
	public final int anInt7820;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(I)V")
	public Class280(@OriginalArg(0) int arg0) {
		this.anInt7820 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Lclient!vaa;")
	@Override
	public Class361 method8585() {
		return Static53.aClass361_5;
	}
}
