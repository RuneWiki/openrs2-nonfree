import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public abstract class Class26 {

	@OriginalMember(owner = "client!au", name = "b", descriptor = "Lclient!lb;")
	protected final Class145_Sub1 aClass145_Sub1_21;

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!lb;)V")
	public Class26(@OriginalArg(0) Class145_Sub1 arg0) {
		this.aClass145_Sub1_21 = arg0;
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
	public void method7996() {
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ZI)V")
	public abstract void method7998(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
	public void method7999() {
	}

	@OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)V")
	public void method8000() {
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Z")
	public abstract boolean method8001();

	@OriginalMember(owner = "client!au", name = "d", descriptor = "(I)V")
	public void method8002() {
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!iba;BI)V")
	public abstract void method8004(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!au", name = "e", descriptor = "(Z)V")
	public void method8005() {
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IZ)V")
	public abstract void method8006(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(III)V")
	public abstract void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!au", name = "d", descriptor = "(Z)V")
	public void method8008() {
	}

	@OriginalMember(owner = "client!au", name = "c", descriptor = "(Z)V")
	public abstract void method8009();
}
