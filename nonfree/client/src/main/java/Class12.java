import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class Class12 {

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!cf;")
	protected final Class43_Sub1 aClass43_Sub1_21;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!cf;)V")
	public Class12(@OriginalArg(0) Class43_Sub1 arg0) {
		this.aClass43_Sub1_21 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZB)V")
	public abstract void method6836(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public void method6837() {
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(ZB)V")
	public abstract void method6838(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILclient!hw;)V")
	public abstract void method6840(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1);

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	public void method6841() {
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	public abstract void method6842();

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	public void method6844() {
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public abstract void method6845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)Z")
	public abstract boolean method6846();

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
	public void method6847() {
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
	public void method6851() {
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
	public void method6852() {
	}
}
