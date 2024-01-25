import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public abstract class Class2_Sub37 extends Class2 {

	@OriginalMember(owner = "client!rga", name = "r", descriptor = "Z")
	public boolean aBoolean528;

	@OriginalMember(owner = "client!rga", name = "q", descriptor = "Lclient!bi;")
	protected final Class13_Sub2 aClass13_Sub2_34;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class2_Sub37(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aClass13_Sub2_34 = arg0;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(B)I")
	public final int method6459() {
		return 1;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)Z")
	public final boolean method6460() {
		return this.aBoolean528;
	}

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)Z")
	public abstract boolean method6461();

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)Z")
	public abstract boolean method6462();

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(ILclient!bq;ILclient!bq;)V")
	public abstract void method6463(@OriginalArg(1) Class10_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class10_Sub2 arg2);

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(III)V")
	public abstract void method6464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rga", name = "b", descriptor = "(B)Z")
	public final boolean method6465() {
		return false;
	}

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "(I)V")
	public abstract void method6467();

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "(B)I")
	public int method6468() {
		return 0;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IB)V")
	public abstract void method6469(@OriginalArg(0) int arg0);
}
