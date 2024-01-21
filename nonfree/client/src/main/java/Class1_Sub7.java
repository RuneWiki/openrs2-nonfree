import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!r", name = "r", descriptor = "I")
	private int anInt3248 = 0;

	@OriginalMember(owner = "client!r", name = "y", descriptor = "I")
	private int anInt3253 = -32768;

	@OriginalMember(owner = "client!r", name = "I", descriptor = "I")
	private int anInt3260 = 0;

	@OriginalMember(owner = "client!r", name = "F", descriptor = "Z")
	public boolean aBoolean143 = false;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "I")
	private final int anInt3254;

	@OriginalMember(owner = "client!r", name = "J", descriptor = "I")
	public final int anInt3261;

	@OriginalMember(owner = "client!r", name = "H", descriptor = "I")
	public final int anInt3259;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "I")
	public final int anInt3255;

	@OriginalMember(owner = "client!r", name = "E", descriptor = "I")
	public final int anInt3257;

	@OriginalMember(owner = "client!r", name = "v", descriptor = "I")
	public final int anInt3251;

	@OriginalMember(owner = "client!r", name = "t", descriptor = "Lclient!ta;")
	private Class5_Sub2_Sub22 aClass5_Sub2_Sub22_3;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IIIIIII)V")
	public Class1_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt3254 = arg0;
		this.anInt3261 = arg2;
		this.anInt3259 = arg4;
		this.anInt3255 = arg1;
		this.anInt3257 = arg3;
		this.anInt3251 = arg5 + arg6;
		@Pc(39) int local39 = Static181.method2739(this.anInt3254).anInt3309;
		if (local39 == -1) {
			this.aBoolean143 = true;
		} else {
			this.aBoolean143 = false;
			this.aClass5_Sub2_Sub22_3 = Static14.method253(local39);
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(7) Class1_Sub1 local7 = this.method2454();
		if (local7 != null) {
			local7.method2445(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt3253 = local7.method2449();
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)Lclient!a;")
	private Class1_Sub1 method2454() {
		@Pc(8) Class5_Sub2_Sub17 local8 = Static181.method2739(this.anInt3254);
		@Pc(16) Class1_Sub1 local16;
		if (this.aBoolean143) {
			local16 = local8.method2506(-1);
		} else {
			local16 = local8.method2506(this.anInt3248);
		}
		return local16 == null ? null : local16;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
	@Override
	public int method2449() {
		return this.anInt3253;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(II)V")
	public void method2455(@OriginalArg(0) int arg0) {
		if (this.aBoolean143) {
			return;
		}
		this.anInt3260 += arg0;
		while (this.aClass5_Sub2_Sub22_3.anIntArray375[this.anInt3248] < this.anInt3260) {
			this.anInt3260 -= this.aClass5_Sub2_Sub22_3.anIntArray375[this.anInt3248];
			this.anInt3248++;
			if (this.anInt3248 >= this.aClass5_Sub2_Sub22_3.anIntArray374.length) {
				this.aBoolean143 = true;
				return;
			}
		}
	}
}
