import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public abstract class Class11 {

	@OriginalMember(owner = "client!hp", name = "d", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_141 = new Class79("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIBLclient!wm;)Z")
	public abstract boolean method6069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class19 arg2);

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "(I)V")
	public abstract void method6070();

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lclient!wm;B)V")
	public abstract void method6071(@OriginalArg(0) Class19 arg0);

	@OriginalMember(owner = "client!hp", name = "b", descriptor = "(Lclient!wm;B)Lclient!nf;")
	public abstract Class12_Sub4 method6074(@OriginalArg(0) Class19 arg0);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIILclient!wm;ZLclient!hp;Z)V")
	public abstract void method6076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class19 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class11 arg5);

	@OriginalMember(owner = "client!hp", name = "g", descriptor = "(I)Z")
	public abstract boolean method6077();
}
