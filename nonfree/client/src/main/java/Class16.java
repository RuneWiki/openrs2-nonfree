import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class Class16 {

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!ac;")
	protected final Class5_Sub1 aClass5_Sub1_42;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class16(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_42 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)Z")
	public abstract boolean method8759();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZZ)V")
	public abstract void method8760(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)V")
	public abstract void method8761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!cu;ZI)V")
	public abstract void method8762(@OriginalArg(0) Class2 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
	public abstract void method8763(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public abstract void method8765();
}
