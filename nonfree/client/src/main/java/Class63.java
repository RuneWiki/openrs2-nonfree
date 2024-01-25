import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public abstract class Class63 {

	@OriginalMember(owner = "client!tt", name = "e", descriptor = "Lclient!pg;")
	protected final Class163_Sub2 aClass163_Sub2_43;

	static {
		new Class134("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class63(@OriginalArg(0) Class163_Sub2 arg0) {
		this.aClass163_Sub2_43 = arg0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZB)V")
	public abstract void method5722(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)Z")
	public abstract boolean method5723();

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)V")
	public abstract void method5724(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	public abstract void method5725();

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BII)V")
	public abstract void method5727(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!fg;I)V")
	public abstract void method5728(@OriginalArg(1) Class20 arg0, @OriginalArg(2) int arg1);
}
