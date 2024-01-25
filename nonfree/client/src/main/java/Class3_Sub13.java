import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public abstract class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!cca", name = "o", descriptor = "Z")
	public boolean aBoolean217;

	@OriginalMember(owner = "client!cca", name = "t", descriptor = "Lclient!aq;")
	protected final Class22_Sub1 aClass22_Sub1_15;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class3_Sub13(@OriginalArg(0) Class22_Sub1 arg0) {
		this.aClass22_Sub1_15 = arg0;
	}

	@OriginalMember(owner = "client!cca", name = "h", descriptor = "(I)V")
	public abstract void method3128();

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)V")
	public abstract void method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)I")
	public int method3131() {
		return 0;
	}

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)Z")
	public abstract boolean method3132();

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(ILclient!fu;ILclient!fu;)V")
	public abstract void method3133(@OriginalArg(1) Class125_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class125_Sub1 arg2);

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)V")
	public abstract void method3135(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!cca", name = "b", descriptor = "(B)Z")
	public final boolean method3136() {
		return false;
	}

	@OriginalMember(owner = "client!cca", name = "d", descriptor = "(I)Z")
	public abstract boolean method3138();

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)Z")
	public final boolean method3139() {
		return this.aBoolean217;
	}

	@OriginalMember(owner = "client!cca", name = "i", descriptor = "(I)I")
	public final int method3140() {
		return 1;
	}
}
