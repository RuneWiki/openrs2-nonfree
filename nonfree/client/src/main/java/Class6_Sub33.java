import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class Class6_Sub33 extends Class6 {

	@OriginalMember(owner = "client!oi", name = "r", descriptor = "Z")
	public boolean aBoolean522;

	@OriginalMember(owner = "client!oi", name = "m", descriptor = "Lclient!en;")
	protected final Class90_Sub1 aClass90_Sub1_36;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class6_Sub33(@OriginalArg(0) Class90_Sub1 arg0) {
		this.aClass90_Sub1_36 = arg0;
	}

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(Z)Z")
	public abstract boolean method6426();

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)I")
	public final int method6429() {
		return 1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZII)V")
	public abstract void method6430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)V")
	public abstract void method6431(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	public abstract void method6432();

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)Z")
	public abstract boolean method6433();

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(Z)I")
	public int method6434() {
		return 0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!waa;BLclient!waa;I)V")
	public abstract void method6435(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)Z")
	public final boolean method6438() {
		return false;
	}

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)Z")
	public final boolean method6440() {
		return this.aBoolean522;
	}
}
