import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public abstract class Class22 {

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
	public final int anInt9186;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	protected final int anInt9188;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
	public final int anInt9185;

	static {
		new Class45("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(III)V")
	protected Class22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9186 = arg0;
		this.anInt9188 = arg2;
		this.anInt9185 = arg1;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
	public abstract void method7937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IBI)V")
	public abstract void method7938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(BII)V")
	public abstract void method7939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
