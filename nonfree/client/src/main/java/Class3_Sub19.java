import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "Z")
	public boolean aBoolean274;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "Lclient!gia;")
	protected final Class67_Sub2 aClass67_Sub2_13;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class3_Sub19(@OriginalArg(0) Class67_Sub2 arg0) {
		this.aClass67_Sub2_13 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)Z")
	public final boolean method2911() {
		return this.aBoolean274;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLclient!nw;Lclient!nw;I)V")
	public abstract void method2913(@OriginalArg(1) Class245_Sub2 arg0, @OriginalArg(2) Class245_Sub2 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBI)V")
	public abstract void method2914(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(B)I")
	public int method2915() {
		return 0;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public abstract void method2916();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public abstract void method2917(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "(B)I")
	public final int method2918() {
		return 1;
	}

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "(B)Z")
	public abstract boolean method2919();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)Z")
	public final boolean method2920() {
		return false;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)Z")
	public abstract boolean method2924();
}
