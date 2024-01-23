import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "Lclient!id;")
	private Class67_Sub1 aClass67_Sub1_1;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	private int anInt289 = -1;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
	private int anInt282 = 0;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	private int anInt286 = -32768;

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
	private int anInt295 = 0;

	@OriginalMember(owner = "client!bb", name = "J", descriptor = "Z")
	public boolean aBoolean22 = false;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	public int anInt281;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	public int anInt288;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	private int anInt284;

	@OriginalMember(owner = "client!bb", name = "K", descriptor = "I")
	public int anInt297;

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
	public int anInt293;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
	public int anInt292;

	@OriginalMember(owner = "client!bb", name = "I", descriptor = "Lclient!qm;")
	private Class141 aClass141_1;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt281 = arg2;
		this.anInt288 = arg3;
		this.anInt284 = arg0;
		this.anInt297 = arg1;
		this.anInt293 = arg6 + arg5;
		this.anInt292 = arg4;
		@Pc(43) int local43 = Static262.method3973(this.anInt284).anInt3816;
		if (local43 == -1) {
			this.aBoolean22 = true;
		} else {
			this.aBoolean22 = false;
			this.aClass141_1 = Static296.method1376(local43);
		}
		if (arg6 == this.anInt293) {
			Static11.method188(false, this.aClass141_1, this.anInt281, this.anInt288, this.anInt295);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Lclient!uc;")
	private Class12_Sub2 method260() {
		@Pc(14) Class126 local14 = Static262.method3973(this.anInt284);
		@Pc(27) Class12_Sub2 local27;
		if (this.aBoolean22) {
			local27 = local14.method3023(-1, -1, 0);
		} else {
			local27 = local14.method3023(this.anInt289, this.anInt295, this.anInt282);
		}
		return local27 == null ? null : local27;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "()I")
	@Override
	public int method3355() {
		return this.anInt286;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V")
	public void method263(@OriginalArg(0) int arg0) {
		if (this.aBoolean22) {
			return;
		}
		this.anInt282 += arg0;
		while (this.aClass141_1.anIntArray392[this.anInt295] < this.anInt282) {
			this.anInt282 -= this.aClass141_1.anIntArray392[this.anInt295];
			this.anInt295++;
			if (this.aClass141_1.anIntArray390.length <= this.anInt295) {
				this.aBoolean22 = true;
				break;
			}
		}
		if (!this.aBoolean22) {
			Static11.method188(false, this.aClass141_1, this.anInt281, this.anInt288, this.anInt295);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIIJILclient!id;)V")
	@Override
	public void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class67_Sub1 arg10) {
		@Pc(3) Class12_Sub2 local3 = this.method260();
		if (local3 != null) {
			local3.method3357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass67_Sub1_1);
			this.anInt286 = local3.method3355();
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}
}
