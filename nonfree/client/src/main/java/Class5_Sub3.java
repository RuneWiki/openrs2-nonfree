import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	private int anInt2347 = 0;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
	private int anInt2356 = 0;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
	private int anInt2357 = -32768;

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "Z")
	public boolean aBoolean96 = false;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
	public int anInt2345;

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
	public int anInt2361;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
	public int anInt2352;

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
	public int anInt2358;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
	private int anInt2350;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
	public int anInt2354;

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!fc;")
	private Class40 aClass40_1;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(IIIIIII)V")
	public Class5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt2345 = arg3;
		this.anInt2361 = arg6 + arg5;
		this.anInt2352 = arg2;
		this.anInt2358 = arg4;
		this.anInt2350 = arg0;
		this.anInt2354 = arg1;
		@Pc(40) int local40 = Static103.method3801(this.anInt2350).anInt4605;
		if (local40 == -1) {
			this.aBoolean96 = true;
		} else {
			this.aBoolean96 = false;
			this.aClass40_1 = Static32.method546(local40);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class5_Sub2 local7 = this.method1807();
		if (local7 != null) {
			local7.method3679(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt2357 = local7.method3680();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()I")
	@Override
	public int method3680() {
		return this.anInt2357;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	public void method1806(@OriginalArg(0) int arg0) {
		if (this.aBoolean96) {
			return;
		}
		this.anInt2347 += arg0;
		while (this.anInt2347 > this.aClass40_1.anIntArray76[this.anInt2356]) {
			this.anInt2347 -= this.aClass40_1.anIntArray76[this.anInt2356];
			this.anInt2356++;
			if (this.anInt2356 >= this.aClass40_1.anIntArray75.length) {
				this.aBoolean96 = true;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)Lclient!ei;")
	private Class5_Sub2 method1807() {
		@Pc(13) Class122 local13 = Static103.method3801(this.anInt2350);
		@Pc(21) Class5_Sub2 local21;
		if (this.aBoolean96) {
			local21 = local13.method3608(-1);
		} else {
			local21 = local13.method3608(this.anInt2356);
		}
		return local21 == null ? null : local21;
	}
}
