import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public abstract class Class92 {

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "Lclient!sv;")
	protected final Class121_Sub2 aClass121_Sub2_20;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!sv;)V")
	public Class92(@OriginalArg(0) Class121_Sub2 arg0) {
		this.aClass121_Sub2_20 = arg0;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(B)V")
	public void method7746() {
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(B)V")
	public void method7747() {
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
	public abstract void method7748();

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(ZI)V")
	public abstract void method7749(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	public void method7750() {
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(III)V")
	public abstract void method7751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
	public void method7752() {
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILclient!aw;)V")
	public abstract void method7754(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1);

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V")
	public void method7755() {
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(ZI)V")
	public abstract void method7756(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(B)V")
	public void method7757() {
	}

	@OriginalMember(owner = "client!qr", name = "d", descriptor = "(B)Z")
	public abstract boolean method7758();
}
