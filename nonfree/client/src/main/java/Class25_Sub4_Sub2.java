import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class25_Sub4_Sub2 extends Class25_Sub4 implements Interface8 {

	@OriginalMember(owner = "client!nd", name = "G", descriptor = "Lclient!th;")
	public final Class190 aClass190_3;

	@OriginalMember(owner = "client!nd", name = "L", descriptor = "Z")
	private final boolean aBoolean278;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!en;Lclient!nl;IIIIIIZI)V")
	public Class25_Sub4_Sub2(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		super(arg5, arg6, arg7, arg1.aBoolean300, arg1.aBoolean294);
		this.aClass190_3 = new Class190(arg0, arg1, 22, arg2, arg3, arg4, arg5, arg7, arg8, arg9);
		this.aBoolean278 = arg1.anInt4164 != 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!en;B)V")
	@Override
	public void method5555(@OriginalArg(0) Class59 arg0) {
		this.aClass190_3.method5227(arg0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
	@Override
	public int method5549() {
		return this.aClass190_3.anInt5883;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5551() {
		return this.aClass190_3.method5229();
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)I")
	@Override
	public int method5552() {
		return this.aClass190_3.anInt5878;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		@Pc(16) Class101 local16 = this.aClass190_3.method5231(super.anInt3916, true, arg0, false, super.anInt3915, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(29) Class112 local29 = arg0.method4798();
		local29.method3589(super.anInt3915, super.anInt3913, super.anInt3916);
		@Pc(39) Class63_Sub3 local39 = null;
		if (this.aBoolean278) {
			local39 = Static273.method4667(1);
		}
		if (this.aClass190_3.aClass63_Sub5_6 == null) {
			local16.method5172(local29, local39 == null ? null : local39.aClass63_Sub7Array1[0], 0);
		} else {
			@Pc(55) Class21 local55 = this.aClass190_3.aClass63_Sub5_6.method4125();
			arg0.method4811(local16, local55, local29, local39 == null ? null : local39.aClass63_Sub7Array1[0]);
		}
		this.aClass190_3.method5228(super.anInt3915 >> 7, super.anInt3915 >> 7, super.anInt3916 >> 7, true, arg0, super.anInt3916 >> 7, local16);
		return local39;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLclient!en;)V")
	@Override
	public void method5550(@OriginalArg(1) Class59 arg0) {
		this.aClass190_3.method5223(arg0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BILclient!en;)Lclient!mj;")
	@Override
	public Class101 method5548(@OriginalArg(1) int arg0, @OriginalArg(2) Class59 arg1) {
		return this.aClass190_3.method5231(0, false, arg1, false, 0, arg0);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
		@Pc(20) Class101 local20 = this.aClass190_3.method5231(super.anInt3916, true, arg0, true, super.anInt3915, 131072);
		if (local20 != null) {
			this.aClass190_3.method5228(super.anInt3915 >> 7, super.anInt3915 >> 7, super.anInt3916 >> 7, false, arg0, super.anInt3916 >> 7, local20);
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!en;IBLclient!fs;IZ)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	@Override
	public void method5553() {
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
	@Override
	public void method5588() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(22) Class101 local22 = this.aClass190_3.method5231(super.anInt3916, false, arg2, false, super.anInt3915, 65536);
		if (local22 == null) {
			return false;
		} else {
			@Pc(29) Class112 local29 = arg2.method4798();
			local29.method3589(super.anInt3915, super.anInt3913, super.anInt3916);
			return local22.method5187(arg0, arg1, local29, false);
		}
	}

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5585() {
		return false;
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)I")
	@Override
	public int method5554() {
		return this.aClass190_3.anInt5881;
	}
}
