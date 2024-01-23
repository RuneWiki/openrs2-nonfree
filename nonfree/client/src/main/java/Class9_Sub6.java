import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class9_Sub6 extends Class9 {

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
	private int anInt3499 = 0;

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
	private int anInt3497 = -32768;

	@OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
	private int anInt3503 = 0;

	@OriginalMember(owner = "client!qb", name = "R", descriptor = "Z")
	public boolean aBoolean194 = false;

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
	public int anInt3508;

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "I")
	private int anInt3514;

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
	public int anInt3502;

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "I")
	public int anInt3498;

	@OriginalMember(owner = "client!qb", name = "U", descriptor = "I")
	public int anInt3513;

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
	public int anInt3501;

	@OriginalMember(owner = "client!qb", name = "T", descriptor = "Lclient!pj;")
	private Class1_Sub1_Sub21 aClass1_Sub1_Sub21_2;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class9_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3508 = arg1;
		this.anInt3514 = arg0;
		this.anInt3502 = arg4;
		this.anInt3498 = arg6 + arg5;
		this.anInt3513 = arg3;
		this.anInt3501 = arg2;
		@Pc(39) int local39 = Static191.method2988(this.anInt3514).anInt456;
		if (local39 == -1) {
			this.aBoolean194 = true;
		} else {
			this.aBoolean194 = false;
			this.aClass1_Sub1_Sub21_2 = Static74.method1343(local39);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IB)V")
	public void method2650(@OriginalArg(0) int arg0) {
		if (this.aBoolean194) {
			return;
		}
		this.anInt3499 += arg0;
		while (this.aClass1_Sub1_Sub21_2.anIntArray450[this.anInt3503] < this.anInt3499) {
			this.anInt3499 -= this.aClass1_Sub1_Sub21_2.anIntArray450[this.anInt3503];
			this.anInt3503++;
			if (this.anInt3503 >= this.aClass1_Sub1_Sub21_2.anIntArray449.length) {
				this.aBoolean194 = true;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()I")
	@Override
	public int method2902() {
		return this.anInt3497;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)Lclient!cf;")
	private Class9_Sub2 method2652() {
		@Pc(8) Class1_Sub1_Sub4 local8 = Static191.method2988(this.anInt3514);
		@Pc(16) Class9_Sub2 local16;
		if (this.aBoolean194) {
			local16 = local8.method326(-1);
		} else {
			local16 = local8.method326(this.anInt3503);
		}
		return local16 == null ? null : local16;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class9_Sub2 local7 = this.method2652();
		if (local7 != null) {
			local7.method2903(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3497 = local7.method2902();
		}
	}
}
