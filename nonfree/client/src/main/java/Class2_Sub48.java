import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class Class2_Sub48 extends Class2 {

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Z")
	public boolean aBoolean681;

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "Lclient!oea;")
	protected final Class87_Sub2 aClass87_Sub2_38;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class2_Sub48(@OriginalArg(0) Class87_Sub2 arg0) {
		this.aClass87_Sub2_38 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Z")
	public final boolean method7773() {
		return false;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)V")
	public abstract void method7774(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)I")
	public final int method7775() {
		return 1;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BILclient!me;Lclient!me;)V")
	public abstract void method7776(@OriginalArg(1) int arg0, @OriginalArg(2) Class88_Sub2 arg1, @OriginalArg(3) Class88_Sub2 arg2);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BII)V")
	public abstract void method7777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Z")
	public final boolean method7778() {
		return this.aBoolean681;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)Z")
	public abstract boolean method7780();

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
	public abstract void method7781();

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)I")
	public int method7782() {
		return 0;
	}

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)Z")
	public abstract boolean method7783();
}
