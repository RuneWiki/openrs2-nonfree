import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class2_Sub4_Sub1 extends Class2_Sub4 implements Interface2 {

	@OriginalMember(owner = "client!db", name = "n", descriptor = "Lclient!ah;")
	public final Class8 aClass8_2;

	@OriginalMember(owner = "client!db", name = "x", descriptor = "Z")
	private final boolean aBoolean97;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!za;Lclient!ii;IIIIIZIII)V")
	public Class2_Sub4_Sub1(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg4, arg5, arg6, Static75.method1129(arg9, arg8));
		this.aClass8_2 = new Class8(arg0, arg1, arg8, arg9, arg2, arg3, super.anInt6418, super.anInt6416, arg7, arg10);
		this.aBoolean97 = arg1.anInt3001 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)I")
	@Override
	public int method6037() {
		return this.aClass8_2.anInt215;
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	@Override
	public void method6041() {
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		return this.aClass8_2.method161();
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) Class57 local21 = this.aClass8_2.method155(super.anInt6418, arg0, false, false, 131072, super.anInt6416);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class29 local28 = arg0.method5866();
			local28.U(super.anInt6418, super.anInt6419, super.anInt6416);
			return local21.method6071(arg1, arg2, local28, false);
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I")
	@Override
	public int method6034() {
		return this.aClass8_2.anInt196;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I")
	@Override
	public int method6035() {
		return this.aClass8_2.anInt219;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method6040(@OriginalArg(0) Class200 arg0) {
		this.aClass8_2.method152(arg0);
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		@Pc(21) Class57 local21 = this.aClass8_2.method155(super.anInt6418, arg0, true, false, 2048, super.anInt6416);
		if (local21 == null) {
			return null;
		}
		@Pc(28) Class29 local28 = arg0.method5866();
		local28.U(super.anInt6418, super.anInt6419, super.anInt6416);
		@Pc(38) Class88_Sub2 local38 = null;
		if (this.aBoolean97) {
			local38 = Static232.method3033(1);
		}
		if (this.aClass8_2.aClass88_Sub6_1 == null) {
			local21.method6060(local28, local38 == null ? null : local38.aClass88_Sub8Array1[0], 0);
		} else {
			@Pc(68) Class255 local68 = this.aClass8_2.aClass88_Sub6_1.method5045();
			arg0.method5869(local21, local68, local28, local38 == null ? null : local38.aClass88_Sub8Array1[0]);
		}
		@Pc(87) int local87 = super.anInt6418 >> 7;
		@Pc(92) int local92 = super.anInt6416 >> 7;
		this.aClass8_2.method156(local92, arg0, true, local21, local87, local87, local92);
		return local38;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method6036(@OriginalArg(1) Class200 arg0) {
		this.aClass8_2.method154(arg0);
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!za;IZ)Lclient!e;")
	@Override
	public Class57 method6038(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		return this.aClass8_2.method155(0, arg0, false, false, arg1, 0);
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	@Override
	public void method6022() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6024() {
		return false;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
		@Pc(16) Class57 local16 = this.aClass8_2.method155(super.anInt6418, arg0, true, true, 262144, super.anInt6416);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt6418 >> 7;
			@Pc(28) int local28 = super.anInt6416 >> 7;
			this.aClass8_2.method156(local28, arg0, false, local16, local23, local23, local28);
		}
	}
}
