import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ue")
public final class Class24_Sub6 extends Class24 {

	@OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
	private int anInt3826 = 0;

	@OriginalMember(owner = "client!ue", name = "G", descriptor = "Z")
	public boolean aBoolean179 = false;

	@OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
	private int anInt3833 = 0;

	@OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
	private int anInt3828 = -32768;

	@OriginalMember(owner = "client!ue", name = "J", descriptor = "I")
	public final int anInt3838;

	@OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
	private final int anInt3840;

	@OriginalMember(owner = "client!ue", name = "F", descriptor = "I")
	public final int anInt3835;

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
	public final int anInt3825;

	@OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
	public final int anInt3842;

	@OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
	public final int anInt3824;

	@OriginalMember(owner = "client!ue", name = "y", descriptor = "Lclient!ki;")
	private Class2_Sub2_Sub16 aClass2_Sub2_Sub16_3;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIIIII)V")
	public Class24_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3838 = arg5 + arg6;
		this.anInt3840 = arg0;
		this.anInt3835 = arg3;
		this.anInt3825 = arg4;
		this.anInt3842 = arg1;
		this.anInt3824 = arg2;
		@Pc(39) int local39 = Static158.method2448(this.anInt3840).anInt1240;
		if (local39 == -1) {
			this.aBoolean179 = true;
		} else {
			this.aBoolean179 = false;
			this.aClass2_Sub2_Sub16_3 = Static213.method3229(local39);
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "()I")
	@Override
	public int method2978() {
		return this.anInt3828;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)V")
	public void method2907(@OriginalArg(0) int arg0) {
		if (this.aBoolean179) {
			return;
		}
		this.anInt3833 += arg0;
		while (this.anInt3833 > this.aClass2_Sub2_Sub16_3.anIntArray229[this.anInt3826]) {
			this.anInt3833 -= this.aClass2_Sub2_Sub16_3.anIntArray229[this.anInt3826];
			this.anInt3826++;
			if (this.aClass2_Sub2_Sub16_3.anIntArray232.length <= this.anInt3826) {
				this.aBoolean179 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class24_Sub3 local7 = this.method2908();
		if (local7 != null) {
			local7.method2974(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3828 = local7.method2978();
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z)Lclient!gj;")
	private Class24_Sub3 method2908() {
		@Pc(13) Class2_Sub2_Sub8 local13 = Static158.method2448(this.anInt3840);
		@Pc(21) Class24_Sub3 local21;
		if (this.aBoolean179) {
			local21 = local13.method955(-1);
		} else {
			local21 = local13.method955(this.anInt3826);
		}
		return local21 == null ? null : local21;
	}
}
