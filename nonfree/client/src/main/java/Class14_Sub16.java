import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public abstract class Class14_Sub16 extends Class14 {

	@OriginalMember(owner = "client!qca", name = "l", descriptor = "Z")
	public boolean aBoolean184;

	@OriginalMember(owner = "client!qca", name = "s", descriptor = "Lclient!qfa;")
	protected final Class137_Sub3 aClass137_Sub3_9;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class14_Sub16(@OriginalArg(0) Class137_Sub3 arg0) {
		this.aClass137_Sub3_9 = arg0;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)V")
	public abstract void method1881(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZILclient!km;Lclient!km;)V")
	public abstract void method1882(@OriginalArg(1) int arg0, @OriginalArg(2) Class66_Sub1 arg1, @OriginalArg(3) Class66_Sub1 arg2);

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)Z")
	public abstract boolean method1884();

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)I")
	public int method1885() {
		return 0;
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(II)V")
	public abstract void method1886(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "(I)V")
	public abstract void method1887();

	@OriginalMember(owner = "client!qca", name = "d", descriptor = "(I)Z")
	public final boolean method1888() {
		return this.aBoolean184;
	}

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "(I)I")
	public final int method1889() {
		return 1;
	}

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "(B)Z")
	public abstract boolean method1890();

	@OriginalMember(owner = "client!qca", name = "g", descriptor = "(I)Z")
	public final boolean method1891() {
		return false;
	}
}
