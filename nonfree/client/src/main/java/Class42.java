import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public abstract class Class42 {

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "[I")
	public static final int[] anIntArray724 = new int[4096];

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "Lclient!re;")
	protected final Class122_Sub2 aClass122_Sub2_16;

	static {
		for (@Pc(6) int local6 = 0; local6 < 4096; local6++) {
			anIntArray724[local6] = Static146.method2334(local6);
		}
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class42(@OriginalArg(0) Class122_Sub2 arg0) {
		this.aClass122_Sub2_16 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	public void method6422() {
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V")
	public abstract void method6424();

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZILclient!sw;)V")
	public abstract void method6425(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1);

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
	public void method6427() {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public void method6428() {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BZ)V")
	public abstract void method6429(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZI)V")
	public abstract void method6431(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZI)V")
	public abstract void method6432(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)Z")
	public abstract boolean method6433();

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "(I)V")
	public void method6434() {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
	public void method6435() {
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	public void method6436() {
	}
}
