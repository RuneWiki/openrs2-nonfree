import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
	private int anInt461 = -32768;

	@OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
	private int anInt470 = 0;

	@OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
	private int anInt472 = 0;

	@OriginalMember(owner = "client!bf", name = "M", descriptor = "Z")
	public boolean aBoolean21 = false;

	@OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
	public int anInt463;

	@OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
	public int anInt467;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
	public int anInt465;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "Lclient!k;")
	private Class2_Sub2_Sub9 aClass2_Sub2_Sub9_1;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt463 = arg3;
		this.anInt468 = arg2;
		this.anInt467 = arg4;
		this.anInt462 = arg6 + arg5;
		this.anInt471 = arg0;
		this.anInt465 = arg1;
		@Pc(39) int local39 = Static56.method1110(this.anInt471).anInt727;
		if (local39 == -1) {
			this.aBoolean21 = true;
		} else {
			this.aBoolean21 = false;
			this.aClass2_Sub2_Sub9_1 = Static14.method299(local39);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class12_Sub2 local7 = this.method325();
		if (local7 != null) {
			local7.method2715(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt461 = local7.method2718();
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "()I")
	@Override
	public int method2718() {
		return this.anInt461;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)Lclient!cg;")
	private Class12_Sub2 method325() {
		@Pc(4) Class2_Sub2_Sub5 local4 = Static56.method1110(this.anInt471);
		@Pc(22) Class12_Sub2 local22;
		if (this.aBoolean21) {
			local22 = local4.method565(-1);
		} else {
			local22 = local4.method565(this.anInt470);
		}
		return local22 == null ? null : local22;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IZ)V")
	public void method326(@OriginalArg(0) int arg0) {
		if (this.aBoolean21) {
			return;
		}
		this.anInt472 += arg0;
		while (this.anInt472 > this.aClass2_Sub2_Sub9_1.anIntArray235[this.anInt470]) {
			this.anInt472 -= this.aClass2_Sub2_Sub9_1.anIntArray235[this.anInt470];
			this.anInt470++;
			if (this.aClass2_Sub2_Sub9_1.anIntArray233.length <= this.anInt470) {
				this.aBoolean21 = true;
				return;
			}
		}
	}
}
