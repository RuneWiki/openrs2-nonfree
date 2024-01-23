import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!om")
public final class Class36_Sub5 extends Class36 {

	@OriginalMember(owner = "client!om", name = "q", descriptor = "Lclient!rb;")
	private Class105_Sub1 aClass105_Sub1_3;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "I")
	private int anInt3831 = 0;

	@OriginalMember(owner = "client!om", name = "u", descriptor = "I")
	private int anInt3833 = 0;

	@OriginalMember(owner = "client!om", name = "t", descriptor = "I")
	private int anInt3832 = -1;

	@OriginalMember(owner = "client!om", name = "o", descriptor = "Z")
	public boolean aBoolean310 = false;

	@OriginalMember(owner = "client!om", name = "J", descriptor = "I")
	private int anInt3847 = -32768;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "I")
	public int anInt3835;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "I")
	public int anInt3834;

	@OriginalMember(owner = "client!om", name = "z", descriptor = "I")
	private int anInt3837;

	@OriginalMember(owner = "client!om", name = "L", descriptor = "I")
	public int anInt3848;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "I")
	public int anInt3836;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "I")
	public int anInt3846;

	@OriginalMember(owner = "client!om", name = "r", descriptor = "Lclient!hn;")
	private Class76 aClass76_2;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIIII)V")
	public Class36_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3835 = arg6 + arg5;
		this.anInt3834 = arg3;
		this.anInt3837 = arg0;
		this.anInt3848 = arg2;
		this.anInt3836 = arg4;
		this.anInt3846 = arg1;
		@Pc(43) int local43 = Static81.method1346(this.anInt3837).anInt4680;
		if (local43 == -1) {
			this.aBoolean310 = true;
		} else {
			this.aBoolean310 = false;
			this.aClass76_2 = Static115.method1855(local43);
		}
		if (this.anInt3835 == arg6) {
			Static184.method2846(false, this.anInt3831, this.anInt3848, this.aClass76_2, this.anInt3834);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIIIIIIJILclient!rb;)V")
	@Override
	public void method4173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class105_Sub1 arg10) {
		@Pc(7) Class36_Sub2 local7 = this.method2991();
		if (local7 != null) {
			local7.method4173(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass105_Sub1_3);
			this.anInt3847 = local7.method4175();
		}
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "()I")
	@Override
	public int method4175() {
		return this.anInt3847;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)Lclient!ie;")
	private Class36_Sub2 method2991() {
		@Pc(8) Class144 local8 = Static81.method1346(this.anInt3837);
		@Pc(18) Class36_Sub2 local18;
		if (this.aBoolean310) {
			local18 = local8.method3527(-1, 0, -1);
		} else {
			local18 = local8.method3527(this.anInt3831, this.anInt3833, this.anInt3832);
		}
		return local18 == null ? null : local18;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)V")
	public void method2993(@OriginalArg(1) int arg0) {
		if (this.aBoolean310) {
			return;
		}
		this.anInt3833 += arg0;
		while (this.aClass76_2.anIntArray158[this.anInt3831] < this.anInt3833) {
			this.anInt3833 -= this.aClass76_2.anIntArray158[this.anInt3831];
			this.anInt3831++;
			if (this.aClass76_2.anIntArray159.length <= this.anInt3831) {
				this.aBoolean310 = true;
				break;
			}
		}
		if (!this.aBoolean310) {
			Static184.method2846(false, this.anInt3831, this.anInt3848, this.aClass76_2, this.anInt3834);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}
}
