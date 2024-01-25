import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public abstract class Class60 {

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "Lclient!sf;")
	protected final Class16_Sub1 aClass16_Sub1_23;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Lclient!sf;)V")
	public Class60(@OriginalArg(0) Class16_Sub1 arg0) {
		this.aClass16_Sub1_23 = arg0;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IIB)V")
	public abstract void method8291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(I)V")
	public void method8292() {
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZ)V")
	public abstract void method8293(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
	public void method8294() {
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!br;II)V")
	public abstract void method8295(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(I)Z")
	public abstract boolean method8296();

	@OriginalMember(owner = "client!mr", name = "c", descriptor = "(I)V")
	public void method8297() {
	}

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "(I)V")
	public void method8298() {
	}

	@OriginalMember(owner = "client!mr", name = "b", descriptor = "(B)V")
	public void method8299() {
	}

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "(I)V")
	public abstract void method8300();

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(ZZ)V")
	public abstract void method8302(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!mr", name = "f", descriptor = "(I)V")
	public void method8303() {
	}
}
