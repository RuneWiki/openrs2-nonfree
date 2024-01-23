import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!db", name = "M", descriptor = "Lclient!nl;")
	private Class119_Sub1 aClass119_Sub1_1;

	@OriginalMember(owner = "client!db", name = "F", descriptor = "I")
	private int anInt1017 = -1;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "I")
	private int anInt1013 = -32768;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	private int anInt1005 = 0;

	@OriginalMember(owner = "client!db", name = "z", descriptor = "Z")
	public boolean aBoolean71 = false;

	@OriginalMember(owner = "client!db", name = "O", descriptor = "I")
	private int anInt1024 = 0;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public int anInt1007;

	@OriginalMember(owner = "client!db", name = "K", descriptor = "I")
	public int anInt1021;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt1006;

	@OriginalMember(owner = "client!db", name = "A", descriptor = "I")
	private int anInt1012;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "I")
	public int anInt1011;

	@OriginalMember(owner = "client!db", name = "D", descriptor = "I")
	public int anInt1015;

	@OriginalMember(owner = "client!db", name = "J", descriptor = "Lclient!bd;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(IIIIIII)V")
	public Class36_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.anInt1007 = arg4;
		this.anInt1021 = arg2;
		this.anInt1006 = arg6 + arg5;
		this.anInt1012 = arg0;
		this.anInt1011 = arg1;
		this.anInt1015 = arg3;
		@Pc(43) int local43 = Static208.method3532(this.anInt1012).anInt5405;
		if (local43 == -1) {
			this.aBoolean71 = true;
		} else {
			this.aBoolean71 = false;
			this.aClass15_1 = Static35.method706(local43);
		}
		if (arg6 == this.anInt1006) {
			Static225.method3777(this.anInt1024, false, this.anInt1015, this.aClass15_1, this.anInt1021);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method4878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class119_Sub1 arg10) {
		@Pc(7) Class36_Sub2 local7 = this.method802();
		if (local7 != null) {
			local7.method4878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass119_Sub1_1);
			this.anInt1013 = local7.method4881();
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(B)Lclient!r;")
	private Class36_Sub2 method802() {
		@Pc(16) Class167 local16 = Static208.method3532(this.anInt1012);
		@Pc(26) Class36_Sub2 local26;
		if (this.aBoolean71) {
			local26 = local16.method4337(0, -1, -1);
		} else {
			local26 = local16.method4337(this.anInt1005, this.anInt1017, this.anInt1024);
		}
		return local26 == null ? null : local26;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)V")
	public void method803(@OriginalArg(0) int arg0) {
		if (this.aBoolean71) {
			return;
		}
		this.anInt1005 += arg0;
		while (this.anInt1005 > this.aClass15_1.anIntArray28[this.anInt1024]) {
			this.anInt1005 -= this.aClass15_1.anIntArray28[this.anInt1024];
			this.anInt1024++;
			if (this.anInt1024 >= this.aClass15_1.anIntArray26.length) {
				this.aBoolean71 = true;
				break;
			}
		}
		if (!this.aBoolean71) {
			Static225.method3777(this.anInt1024, false, this.anInt1015, this.aClass15_1, this.anInt1021);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "()I")
	@Override
	public int method4881() {
		return this.anInt1013;
	}
}
