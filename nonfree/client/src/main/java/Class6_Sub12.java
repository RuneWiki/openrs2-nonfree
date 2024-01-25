import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public abstract class Class6_Sub12 extends Class6 {

	@OriginalMember(owner = "client!dba", name = "r", descriptor = "Z")
	public boolean aBoolean709;

	@OriginalMember(owner = "client!dba", name = "n", descriptor = "Lclient!ml;")
	protected final Class75_Sub3 aClass75_Sub3_38;

	@OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class6_Sub12(@OriginalArg(0) Class75_Sub3 arg0) {
		this.aClass75_Sub3_38 = arg0;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(B)I")
	public int method8262() {
		return 0;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)V")
	public abstract void method8263(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Z)Z")
	public abstract boolean method8264();

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)Z")
	public final boolean method8265() {
		return false;
	}

	@OriginalMember(owner = "client!dba", name = "b", descriptor = "(Z)V")
	public abstract void method8266();

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "(I)I")
	public final int method8268() {
		return 1;
	}

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "(I)Z")
	public final boolean method8270() {
		return this.aBoolean709;
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(Lclient!bp;ILclient!bp;I)V")
	public abstract void method8271(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class44_Sub1 arg2);

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(II)V")
	public abstract void method8273(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "(I)Z")
	public abstract boolean method8275();
}
