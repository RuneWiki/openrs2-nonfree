import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public abstract class Class74 {

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "Lclient!gt;")
	protected final Class87_Sub1 aClass87_Sub1_22;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!gt;)V")
	public Class74(@OriginalArg(0) Class87_Sub1 arg0) {
		this.aClass87_Sub1_22 = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)V")
	public void method8242() {
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(III)V")
	public abstract void method8243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)Z")
	public abstract boolean method8245();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Z)V")
	public void method8246() {
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)V")
	public void method8247() {
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)V")
	public abstract void method8249();

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!du;I)V")
	public abstract void method8250(@OriginalArg(1) Interface7 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZI)V")
	public abstract void method8251(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(BZ)V")
	public abstract void method8253(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(I)V")
	public void method8254() {
	}

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "(I)V")
	public void method8255() {
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)V")
	public void method8256() {
	}
}
