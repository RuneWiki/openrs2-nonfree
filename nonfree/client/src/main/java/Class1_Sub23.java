import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public abstract class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!qh", name = "r", descriptor = "Z")
	public boolean aBoolean335;

	@OriginalMember(owner = "client!qh", name = "q", descriptor = "Lclient!ih;")
	protected final Class117_Sub1 aClass117_Sub1_19;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class1_Sub23(@OriginalArg(0) Class117_Sub1 arg0) {
		this.aClass117_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
	public abstract void method2720(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)Z")
	public abstract boolean method2722();

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)Z")
	public abstract boolean method2724();

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)V")
	public abstract void method2725(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)Z")
	public final boolean method2726() {
		return false;
	}

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "(I)I")
	public final int method2727() {
		return 1;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)I")
	public int method2728() {
		return 0;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
	public abstract void method2729();

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "(I)Z")
	public final boolean method2730() {
		return this.aBoolean335;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!gu;ILclient!gu;I)V")
	public abstract void method2731(@OriginalArg(0) Class23_Sub3 arg0, @OriginalArg(2) Class23_Sub3 arg1, @OriginalArg(3) int arg2);
}
