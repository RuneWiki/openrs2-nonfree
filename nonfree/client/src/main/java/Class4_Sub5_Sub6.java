import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public abstract class Class4_Sub5_Sub6 extends Class4_Sub5 {

	@OriginalMember(owner = "client!pm", name = "v", descriptor = "Lclient!we;")
	public final Interface27 anInterface27_3;

	@OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
	public final int anInt8241;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!we;I)V")
	protected Class4_Sub5_Sub6(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
		this.anInterface27_3 = arg0;
		this.anInt8241 = arg1;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Z")
	public abstract boolean method7153();

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method7154();
}
