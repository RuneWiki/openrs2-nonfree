import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class6_Sub39 extends Class6 {

	@OriginalMember(owner = "client!pm", name = "m", descriptor = "Z")
	public boolean aBoolean635;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "Z")
	public boolean aBoolean637;

	@OriginalMember(owner = "client!pm", name = "r", descriptor = "Z")
	public boolean aBoolean638;

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
	public final int anInt7973;

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "Lclient!dha;")
	public final Class62_Sub1 aClass62_Sub1_1;

	@OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
	public final int anInt7975;

	@OriginalMember(owner = "client!pm", name = "n", descriptor = "Z")
	public final boolean aBoolean636;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILclient!dha;IZ)V")
	public Class6_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) Class62_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt7973 = arg2;
		this.aClass62_Sub1_1 = arg1;
		this.anInt7975 = arg0;
		this.aBoolean636 = arg3;
	}
}
