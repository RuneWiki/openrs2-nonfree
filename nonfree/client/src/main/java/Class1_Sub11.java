import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!co", name = "m", descriptor = "Z")
	public boolean aBoolean455;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "Lclient!uq;")
	protected final Class122_Sub3 aClass122_Sub3_27;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class1_Sub11(@OriginalArg(0) Class122_Sub3 arg0) {
		this.aClass122_Sub3_27 = arg0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	public abstract void method5293();

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
	public abstract void method5295(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!co", name = "b", descriptor = "(I)Z")
	public final boolean method5296() {
		return this.aBoolean455;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(B)I")
	public final int method5297() {
		return 1;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
	public abstract void method5298(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(I)I")
	public int method5299() {
		return 0;
	}

	@OriginalMember(owner = "client!co", name = "g", descriptor = "(I)Z")
	public abstract boolean method5300();

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(ILclient!ku;Lclient!ku;I)V")
	public abstract void method5301(@OriginalArg(1) Class73_Sub1 arg0, @OriginalArg(2) Class73_Sub1 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5302();

	@OriginalMember(owner = "client!co", name = "h", descriptor = "(I)Z")
	public final boolean method5303() {
		return false;
	}
}
