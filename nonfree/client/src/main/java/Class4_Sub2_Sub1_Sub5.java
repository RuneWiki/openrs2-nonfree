import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class4_Sub2_Sub1_Sub5 extends Class4_Sub2_Sub1 {

	@OriginalMember(owner = "client!ue", name = "bc", descriptor = "Z")
	public boolean aBoolean148 = false;

	@OriginalMember(owner = "client!ue", name = "Xb", descriptor = "I")
	private int anInt2990 = 0;

	@OriginalMember(owner = "client!ue", name = "rc", descriptor = "I")
	private int anInt3004 = 0;

	@OriginalMember(owner = "client!ue", name = "Zb", descriptor = "I")
	public final int anInt2992;

	@OriginalMember(owner = "client!ue", name = "pc", descriptor = "I")
	public final int anInt3002;

	@OriginalMember(owner = "client!ue", name = "tc", descriptor = "I")
	public final int anInt3005;

	@OriginalMember(owner = "client!ue", name = "fc", descriptor = "I")
	private final int anInt2996;

	@OriginalMember(owner = "client!ue", name = "mc", descriptor = "I")
	public final int anInt3000;

	@OriginalMember(owner = "client!ue", name = "Wb", descriptor = "I")
	public final int anInt2989;

	@OriginalMember(owner = "client!ue", name = "wc", descriptor = "Lclient!bd;")
	private Class4_Sub2_Sub2 aClass4_Sub2_Sub2_3;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIIIII)V")
	public Class4_Sub2_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2992 = arg6 + arg5;
		this.anInt3002 = arg1;
		this.anInt3005 = arg3;
		this.anInt2996 = arg0;
		this.anInt3000 = arg4;
		this.anInt2989 = arg2;
		@Pc(37) int local37 = Static35.method590(this.anInt2996).anInt2545;
		if (local37 == -1) {
			this.aBoolean148 = true;
		} else {
			this.aBoolean148 = false;
			this.aClass4_Sub2_Sub2_3 = Static116.method2017(local37);
		}
	}

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "(B)Lclient!vb;")
	@Override
	public Class4_Sub2_Sub1_Sub6 method2172() {
		@Pc(14) Class4_Sub2_Sub13 local14 = Static35.method590(this.anInt2996);
		@Pc(22) Class4_Sub2_Sub1_Sub6 local22;
		if (this.aBoolean148) {
			local22 = local14.method1843(-1);
		} else {
			local22 = local14.method1843(this.anInt2990);
		}
		return local22 == null ? null : local22;
	}

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "(II)V")
	public void method2077(@OriginalArg(0) int arg0) {
		if (this.aBoolean148) {
			return;
		}
		this.anInt3004 += arg0;
		while (this.anInt3004 > this.aClass4_Sub2_Sub2_3.anIntArray35[this.anInt2990]) {
			this.anInt3004 -= this.aClass4_Sub2_Sub2_3.anIntArray35[this.anInt2990];
			this.anInt2990++;
			if (this.aClass4_Sub2_Sub2_3.anIntArray33.length <= this.anInt2990) {
				this.aBoolean148 = true;
				break;
			}
		}
	}
}
