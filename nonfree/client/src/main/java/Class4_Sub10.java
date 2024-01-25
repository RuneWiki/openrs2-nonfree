import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public abstract class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "Z")
	public boolean aBoolean220;

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "Lclient!fd;")
	protected final Class19_Sub2 aClass19_Sub2_16;

	static {
		new Class83("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class4_Sub10(@OriginalArg(0) Class19_Sub2 arg0) {
		this.aClass19_Sub2_16 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
	public abstract void method1996(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Z")
	public final boolean method1998() {
		return false;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)I")
	public int method1999() {
		return 0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBLclient!af;Lclient!af;)V")
	public abstract void method2000(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1, @OriginalArg(3) Class6_Sub1 arg2);

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(Z)I")
	public final int method2001() {
		return 1;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Z")
	public final boolean method2003() {
		return this.aBoolean220;
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)Z")
	public abstract boolean method2004();

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(B)Z")
	public abstract boolean method2005();

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(B)V")
	public abstract void method2006();

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(III)V")
	public abstract void method2007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
