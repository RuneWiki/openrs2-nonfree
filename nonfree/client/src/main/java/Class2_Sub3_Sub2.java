import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class2_Sub3_Sub2 extends Class2_Sub3 implements Interface2 {

	@OriginalMember(owner = "client!np", name = "A", descriptor = "Lclient!ah;")
	public final Class8 aClass8_3;

	@OriginalMember(owner = "client!np", name = "z", descriptor = "Z")
	private final boolean aBoolean294;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!za;Lclient!ii;IIIIIZII)V")
	public Class2_Sub3_Sub2(@OriginalArg(0) Class200 arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(arg4, arg5, arg6, arg1.anInt2998, arg1.aBoolean187, arg1.aBoolean190);
		this.aClass8_3 = new Class8(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
		this.aBoolean294 = arg1.anInt3001 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!za;IZ)Lclient!e;")
	@Override
	public Class57 method6038(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1) {
		return this.aClass8_3.method155(0, arg0, false, false, arg1, 0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)I")
	@Override
	public int method6037() {
		return this.aClass8_3.anInt215;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)V")
	@Override
	public void method6041() {
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6039() {
		return this.aClass8_3.method161();
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
		@Pc(16) Class57 local16 = this.aClass8_3.method155(super.anInt7157, arg0, true, true, 262144, super.anInt7159);
		if (local16 != null) {
			@Pc(27) int local27 = super.anInt7157 >> 7;
			@Pc(32) int local32 = super.anInt7159 >> 7;
			this.aClass8_3.method156(local32, arg0, false, local16, local27, local27, local32);
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		@Pc(16) Class57 local16 = this.aClass8_3.method155(super.anInt7157, arg0, true, false, 2048, super.anInt7159);
		if (local16 == null) {
			return null;
		}
		@Pc(27) Class29 local27 = arg0.method5866();
		local27.U(super.anInt7157, super.anInt7154, super.anInt7159);
		@Pc(37) Class88_Sub2 local37 = null;
		if (this.aBoolean294) {
			local37 = Static232.method3033(1);
		}
		if (this.aClass8_3.aClass88_Sub6_1 == null) {
			local16.method6060(local27, local37 == null ? null : local37.aClass88_Sub8Array1[0], 0);
		} else {
			@Pc(53) Class255 local53 = this.aClass8_3.aClass88_Sub6_1.method5045();
			arg0.method5869(local16, local53, local27, local37 == null ? null : local37.aClass88_Sub8Array1[0]);
		}
		@Pc(86) int local86 = super.anInt7157 >> 7;
		@Pc(91) int local91 = super.anInt7159 >> 7;
		this.aClass8_3.method156(local91, arg0, true, local16, local86, local86, local91);
		return local37;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!za;B)V")
	@Override
	public void method6040(@OriginalArg(0) Class200 arg0) {
		this.aClass8_3.method152(arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
	@Override
	public int method6034() {
		return this.aClass8_3.anInt196;
	}

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(I)V")
	@Override
	public void method6022() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6024() {
		return false;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class57 local16 = this.aClass8_3.method155(super.anInt7157, arg0, false, false, 131072, super.anInt7159);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class29 local23 = arg0.method5866();
			local23.U(super.anInt7157, super.anInt7154, super.anInt7159);
			return local16.method6071(arg1, arg2, local23, false);
		}
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)I")
	@Override
	public int method6035() {
		return this.aClass8_3.anInt219;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLclient!za;)V")
	@Override
	public void method6036(@OriginalArg(1) Class200 arg0) {
		this.aClass8_3.method154(arg0);
	}
}
