import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public abstract class Class6_Sub11 extends Class6 {

	@OriginalMember(owner = "client!efa", name = "l", descriptor = "Z")
	public boolean aBoolean74;

	@OriginalMember(owner = "client!efa", name = "m", descriptor = "Lclient!pq;")
	protected final Class132_Sub3 aClass132_Sub3_8;

	@OriginalMember(owner = "client!efa", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class6_Sub11(@OriginalArg(0) Class132_Sub3 arg0) {
		this.aClass132_Sub3_8 = arg0;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Z)I")
	public int method1288() {
		return 0;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(BI)V")
	public abstract void method1289(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
	public abstract void method1290();

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)Z")
	public abstract boolean method1291();

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(ZII)V")
	public abstract void method1294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!efa", name = "c", descriptor = "(I)Z")
	public final boolean method1295() {
		return false;
	}

	@OriginalMember(owner = "client!efa", name = "g", descriptor = "(I)Z")
	public final boolean method1296() {
		return this.aBoolean74;
	}

	@OriginalMember(owner = "client!efa", name = "h", descriptor = "(I)Z")
	public abstract boolean method1297();

	@OriginalMember(owner = "client!efa", name = "b", descriptor = "(Z)I")
	public final int method1298() {
		return 1;
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(Lclient!rq;Lclient!rq;BI)V")
	public abstract void method1299(@OriginalArg(0) Class53_Sub2 arg0, @OriginalArg(1) Class53_Sub2 arg1, @OriginalArg(3) int arg2);
}
