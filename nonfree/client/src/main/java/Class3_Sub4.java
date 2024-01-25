import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public abstract class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "Z")
	public boolean aBoolean317;

	@OriginalMember(owner = "client!aq", name = "r", descriptor = "Lclient!ad;")
	protected final Class5_Sub1 aClass5_Sub1_15;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class3_Sub4(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_15 = arg0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
	public abstract void method3537();

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZI)V")
	public abstract void method3538(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(Z)Z")
	public abstract boolean method3539();

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)Z")
	public abstract boolean method3540();

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "(I)Z")
	public final boolean method3542() {
		return this.aBoolean317;
	}

	@OriginalMember(owner = "client!aq", name = "g", descriptor = "(I)I")
	public final int method3544() {
		return 1;
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)I")
	public int method3546() {
		return 0;
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZILclient!cs;Lclient!cs;)V")
	public abstract void method3547(@OriginalArg(1) int arg0, @OriginalArg(2) Class11_Sub1 arg1, @OriginalArg(3) Class11_Sub1 arg2);

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(BII)V")
	public abstract void method3548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "(Z)Z")
	public final boolean method3549() {
		return false;
	}
}
