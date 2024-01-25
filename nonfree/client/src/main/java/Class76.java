import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class Class76 {

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "Lclient!qg;")
	protected final Class121_Sub2 aClass121_Sub2_39;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class76(@OriginalArg(0) Class121_Sub2 arg0) {
		this.aClass121_Sub2_39 = arg0;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIB)V")
	public abstract void method5604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)Z")
	public abstract boolean method5606();

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZZ)V")
	public abstract void method5608(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!go;B)V")
	public abstract void method5609(@OriginalArg(0) int arg0, @OriginalArg(1) Class21 arg1);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZI)V")
	public abstract void method5611(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)V")
	public abstract void method5613();
}
