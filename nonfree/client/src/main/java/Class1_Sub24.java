import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class Class1_Sub24 extends Class1 {

	@OriginalMember(owner = "client!lga", name = "p", descriptor = "Z")
	public boolean aBoolean597;

	@OriginalMember(owner = "client!lga", name = "i", descriptor = "Lclient!ag;")
	protected final Class12_Sub1 aClass12_Sub1_34;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class1_Sub24(@OriginalArg(0) Class12_Sub1 arg0) {
		this.aClass12_Sub1_34 = arg0;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(B)V")
	public abstract void method6882();

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!dga;IILclient!dga;)V")
	public abstract void method6883(@OriginalArg(0) Class52_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class52_Sub1 arg2);

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)V")
	public abstract void method6884(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)Z")
	public abstract boolean method6885();

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I")
	public final int method6886() {
		return 1;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)Z")
	public abstract boolean method6887();

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(I)Z")
	public final boolean method6888() {
		return this.aBoolean597;
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(B)Z")
	public final boolean method6889() {
		return false;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(III)V")
	public abstract void method6890(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "(I)I")
	public int method6892() {
		return 0;
	}
}
