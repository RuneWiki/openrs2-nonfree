import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class Class5_Sub39 extends Class5 {

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "Z")
	public boolean aBoolean426;

	@OriginalMember(owner = "client!tf", name = "s", descriptor = "Lclient!tt;")
	protected final Class200_Sub2 aClass200_Sub2_37;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class5_Sub39(@OriginalArg(0) Class200_Sub2 arg0) {
		this.aClass200_Sub2_37 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLclient!cd;Lclient!cd;I)V")
	public abstract void method5180(@OriginalArg(1) Class31_Sub1 arg0, @OriginalArg(2) Class31_Sub1 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
	public final int method5181() {
		return 1;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)Z")
	public final boolean method5182() {
		return this.aBoolean426;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)I")
	public int method5183() {
		return 0;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V")
	public abstract void method5184(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)Z")
	public abstract boolean method5185();

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)Z")
	public abstract boolean method5186();

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)Z")
	public final boolean method5189() {
		return false;
	}

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "(I)V")
	public abstract void method5190();

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
	public abstract void method5191(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
