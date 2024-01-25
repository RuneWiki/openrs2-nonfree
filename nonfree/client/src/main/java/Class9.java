import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class Class9 {

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!nh;")
	protected final Class7_Sub1 aClass7_Sub1_23;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!nh;)V")
	public Class9(@OriginalArg(0) Class7_Sub1 arg0) {
		this.aClass7_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public void method8020() {
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public abstract void method8021();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V")
	public abstract void method8022(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public void method8023() {
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V")
	public void method8025() {
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
	public void method8027() {
	}

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)Z")
	public abstract boolean method8028();

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!aj;II)V")
	public abstract void method8029(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V")
	public abstract void method8030(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
	public void method8031() {
	}

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)V")
	public void method8032() {
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
	public abstract void method8033(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
