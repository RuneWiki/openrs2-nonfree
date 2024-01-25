import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public abstract class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!fh", name = "x", descriptor = "Z")
	public boolean aBoolean136;

	@OriginalMember(owner = "client!fh", name = "p", descriptor = "Lclient!ht;")
	protected final Class109_Sub1 aClass109_Sub1_18;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(Lclient!ht;)V")
	public Class1_Sub10(@OriginalArg(0) Class109_Sub1 arg0) {
		this.aClass109_Sub1_18 = arg0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
	public final int method2205() {
		return 1;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)V")
	public abstract void method2207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
	public abstract void method2208(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fh", name = "e", descriptor = "(I)Z")
	public final boolean method2209() {
		return this.aBoolean136;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)Z")
	public final boolean method2210() {
		return false;
	}

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)Z")
	public abstract boolean method2211();

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "(I)I")
	public int method2212() {
		return 0;
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)Z")
	public abstract boolean method2213();

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBLclient!qv;Lclient!qv;)V")
	public abstract void method2214(@OriginalArg(0) int arg0, @OriginalArg(2) Class13_Sub1 arg1, @OriginalArg(3) Class13_Sub1 arg2);

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(Z)V")
	public abstract void method2215();
}
