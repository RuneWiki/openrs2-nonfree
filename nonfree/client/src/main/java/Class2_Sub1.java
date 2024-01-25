import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public abstract class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aaa", name = "q", descriptor = "Z")
	public boolean aBoolean371;

	@OriginalMember(owner = "client!aaa", name = "s", descriptor = "Lclient!uja;")
	protected final Class145_Sub3 aClass145_Sub3_20;

	@OriginalMember(owner = "client!aaa", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class2_Sub1(@OriginalArg(0) Class145_Sub3 arg0) {
		this.aClass145_Sub3_20 = arg0;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(II)V")
	public abstract void method3759(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(Z)Z")
	public final boolean method3760() {
		return false;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(ILclient!ng;ZLclient!ng;)V")
	public abstract void method3761(@OriginalArg(0) int arg0, @OriginalArg(1) Class64_Sub4 arg1, @OriginalArg(3) Class64_Sub4 arg2);

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(B)I")
	public int method3762() {
		return 0;
	}

	@OriginalMember(owner = "client!aaa", name = "b", descriptor = "(I)I")
	public final int method3763() {
		return 1;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)Z")
	public abstract boolean method3764();

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "(I)V")
	public abstract void method3765();

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)Z")
	public abstract boolean method3766();

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)Z")
	public final boolean method3767() {
		return this.aBoolean371;
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)V")
	public abstract void method3768(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
