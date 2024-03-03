import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public abstract class Class14 {

	@OriginalMember(owner = "client!on", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray34 = new String[100];

	@OriginalMember(owner = "client!on", name = "e", descriptor = "Lclient!jm;")
	public static final Class116 aClass116_5 = new Class116(64);

	@OriginalMember(owner = "client!on", name = "g", descriptor = "Lclient!qg;")
	public static final Class2_Sub4_Sub2 aClass2_Sub4_Sub2_4 = new Class2_Sub4_Sub2(5000);

	@OriginalMember(owner = "client!on", name = "h", descriptor = "[I")
	public static final int[] anIntArray257 = new int[4096];

	static {
		new Class79("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V")
	public abstract void method3923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!on;)V")
	public abstract void method3925(@OriginalArg(0) Class14 arg0);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public abstract void method3926(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
	public abstract void method3927(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
	public abstract void method3930(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIII)V")
	public abstract void method3931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V")
	public abstract void method3932(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
	public abstract void method3933();

	@OriginalMember(owner = "client!on", name = "e", descriptor = "(I)V")
	public abstract void method3934(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(III[I)V")
	public abstract void method3935(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([I)V")
	public abstract void method3936(@OriginalArg(0) int[] arg0);

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(III)V")
	public abstract void method3937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
