import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!hq", name = "o", descriptor = "Z")
	public boolean aBoolean7;

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "Lclient!os;")
	protected final Class39_Sub3 aClass39_Sub3_2;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class2_Sub1(@OriginalArg(0) Class39_Sub3 arg0) {
		this.aClass39_Sub3_2 = arg0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)Z")
	public abstract boolean method245();

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)I")
	public int method246() {
		return 0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!ot;Lclient!ot;I)V")
	public abstract void method247(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub2 arg1, @OriginalArg(2) Class19_Sub2 arg2);

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)I")
	public final int method249() {
		return 1;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)V")
	public abstract void method250(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)Z")
	public final boolean method251() {
		return this.aBoolean7;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
	public abstract void method252(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)Z")
	public final boolean method255() {
		return false;
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(B)V")
	public abstract void method256();

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "(I)Z")
	public abstract boolean method258();
}
