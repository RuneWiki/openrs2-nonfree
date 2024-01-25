import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public abstract class Class5_Sub34 extends Class5 {

	@OriginalMember(owner = "client!vw", name = "l", descriptor = "Z")
	public boolean aBoolean448;

	@OriginalMember(owner = "client!vw", name = "u", descriptor = "Lclient!ffa;")
	protected final Class57_Sub2 aClass57_Sub2_22;

	@OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lclient!ffa;)V")
	public Class5_Sub34(@OriginalArg(0) Class57_Sub2 arg0) {
		this.aClass57_Sub2_22 = arg0;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILclient!bca;ILclient!bca;)V")
	public abstract void method5096(@OriginalArg(1) Class32_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class32_Sub1 arg2);

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "(I)Z")
	public final boolean method5097() {
		return false;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)Z")
	public abstract boolean method5098();

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(B)I")
	public int method5099() {
		return 0;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIB)V")
	public abstract void method5100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "(B)V")
	public abstract void method5101();

	@OriginalMember(owner = "client!vw", name = "c", descriptor = "(I)Z")
	public final boolean method5102() {
		return this.aBoolean448;
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)V")
	public abstract void method5103(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)Z")
	public abstract boolean method5104();

	@OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)I")
	public final int method5106() {
		return 1;
	}
}
