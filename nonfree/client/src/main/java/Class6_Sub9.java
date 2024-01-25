import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public abstract class Class6_Sub9 extends Class6 {

	@OriginalMember(owner = "client!lb", name = "s", descriptor = "Z")
	public boolean aBoolean149;

	@OriginalMember(owner = "client!lb", name = "q", descriptor = "Lclient!ac;")
	protected final Class5_Sub1 aClass5_Sub1_9;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class6_Sub9(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)Z")
	public abstract boolean method1696();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIZ)V")
	public abstract void method1697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)V")
	public abstract void method1699(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)Z")
	public abstract boolean method1700();

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)I")
	public int method1701() {
		return 0;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)Z")
	public final boolean method1702() {
		return this.aBoolean149;
	}

	@OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Z")
	public final boolean method1703() {
		return false;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!aaa;IBLclient!aaa;)V")
	public abstract void method1704(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1 arg2);

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "(I)I")
	public final int method1705() {
		return 1;
	}

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "(B)V")
	public abstract void method1706();
}
