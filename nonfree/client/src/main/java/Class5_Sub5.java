import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!od", name = "r", descriptor = "I")
	private int anInt3300 = 0;

	@OriginalMember(owner = "client!od", name = "K", descriptor = "Z")
	public boolean aBoolean145 = false;

	@OriginalMember(owner = "client!od", name = "M", descriptor = "I")
	private int anInt3315 = 0;

	@OriginalMember(owner = "client!od", name = "J", descriptor = "I")
	private int anInt3313 = -32768;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "I")
	public int anInt3305;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "I")
	public int anInt3304;

	@OriginalMember(owner = "client!od", name = "B", descriptor = "I")
	public int anInt3308;

	@OriginalMember(owner = "client!od", name = "L", descriptor = "I")
	public int anInt3314;

	@OriginalMember(owner = "client!od", name = "P", descriptor = "I")
	private int anInt3317;

	@OriginalMember(owner = "client!od", name = "N", descriptor = "I")
	public int anInt3316;

	@OriginalMember(owner = "client!od", name = "E", descriptor = "Lclient!c;")
	private Class2_Sub3_Sub3 aClass2_Sub3_Sub3_3;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3305 = arg5 + arg6;
		this.anInt3304 = arg4;
		this.anInt3308 = arg1;
		this.anInt3314 = arg3;
		this.anInt3317 = arg0;
		this.anInt3316 = arg2;
		@Pc(39) int local39 = Static19.method266(this.anInt3317).anInt4361;
		if (local39 == -1) {
			this.aBoolean145 = true;
		} else {
			this.aBoolean145 = false;
			this.aClass2_Sub3_Sub3_3 = Static187.method3447(local39);
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	public void method2586(@OriginalArg(1) int arg0) {
		if (this.aBoolean145) {
			return;
		}
		this.anInt3315 += arg0;
		while (this.aClass2_Sub3_Sub3_3.anIntArray77[this.anInt3300] < this.anInt3315) {
			this.anInt3315 -= this.aClass2_Sub3_Sub3_3.anIntArray77[this.anInt3300];
			this.anInt3300++;
			if (this.aClass2_Sub3_Sub3_3.anIntArray76.length <= this.anInt3300) {
				this.aBoolean145 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class5_Sub3 local7 = this.method2590();
		if (local7 != null) {
			local7.method3779(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3313 = local7.method3773();
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Lclient!qc;")
	private Class5_Sub3 method2590() {
		@Pc(13) Class2_Sub3_Sub27 local13 = Static19.method266(this.anInt3317);
		@Pc(22) Class5_Sub3 local22;
		if (this.aBoolean145) {
			local22 = local13.method3452(-1);
		} else {
			local22 = local13.method3452(this.anInt3300);
		}
		return local22 == null ? null : local22;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()I")
	@Override
	public int method3773() {
		return this.anInt3313;
	}
}
