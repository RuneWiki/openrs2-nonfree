import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class1_Sub2_Sub1_Sub7 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "Z")
	public boolean aBoolean153 = false;

	@OriginalMember(owner = "client!te", name = "U", descriptor = "I")
	private int anInt3645 = 0;

	@OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
	private int anInt3654 = 0;

	@OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
	public final int anInt3658;

	@OriginalMember(owner = "client!te", name = "V", descriptor = "I")
	public final int anInt3646;

	@OriginalMember(owner = "client!te", name = "jb", descriptor = "I")
	public final int anInt3655;

	@OriginalMember(owner = "client!te", name = "hb", descriptor = "I")
	public final int anInt3653;

	@OriginalMember(owner = "client!te", name = "X", descriptor = "I")
	private final int anInt3647;

	@OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
	public final int anInt3651;

	@OriginalMember(owner = "client!te", name = "W", descriptor = "Lclient!ub;")
	private Class1_Sub2_Sub18 aClass1_Sub2_Sub18_3;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub2_Sub1_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3658 = arg4;
		this.anInt3646 = arg2;
		this.anInt3655 = arg6 + arg5;
		this.anInt3653 = arg1;
		this.anInt3647 = arg0;
		this.anInt3651 = arg3;
		@Pc(37) int local37 = Static67.method1207(this.anInt3647).anInt1217;
		if (local37 == -1) {
			this.aBoolean153 = true;
		} else {
			this.aBoolean153 = false;
			this.aClass1_Sub2_Sub18_3 = Static73.method1277(local37);
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)Lclient!oh;")
	@Override
	protected Class1_Sub2_Sub1_Sub4 method2785() {
		@Pc(13) Class1_Sub2_Sub7 local13 = Static67.method1207(this.anInt3647);
		@Pc(22) Class1_Sub2_Sub1_Sub4 local22;
		if (this.aBoolean153) {
			local22 = local13.method912(-1);
		} else {
			local22 = local13.method912(this.anInt3654);
		}
		return local22 == null ? null : local22;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
	public void method2789(@OriginalArg(1) int arg0) {
		if (this.aBoolean153) {
			return;
		}
		this.anInt3645 += arg0;
		while (this.aClass1_Sub2_Sub18_3.anIntArray394[this.anInt3654] < this.anInt3645) {
			this.anInt3645 -= this.aClass1_Sub2_Sub18_3.anIntArray394[this.anInt3654];
			this.anInt3654++;
			if (this.anInt3654 >= this.aClass1_Sub2_Sub18_3.anIntArray396.length) {
				this.aBoolean153 = true;
				return;
			}
		}
	}
}
