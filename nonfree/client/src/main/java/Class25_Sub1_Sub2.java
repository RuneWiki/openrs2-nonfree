import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class25_Sub1_Sub2 extends Class25_Sub1 implements Interface8 {

	@OriginalMember(owner = "client!da", name = "J", descriptor = "Lclient!th;")
	public final Class190 aClass190_1;

	@OriginalMember(owner = "client!da", name = "P", descriptor = "Z")
	private final boolean aBoolean86;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lclient!en;Lclient!nl;IIIIIIIZIIIII)V")
	public Class25_Sub1_Sub2(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, arg1.anInt4136 == 1, Static70.method1551(arg2, arg3));
		this.aClass190_1 = new Class190(arg0, arg1, arg2, arg3, super.aByte62, arg5, arg6, arg8, arg9, arg14);
		this.aBoolean86 = arg1.anInt4164 != 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!en;IBLclient!fs;IZ)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	@Override
	public void method5553() {
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(21) Class101 local21 = this.aClass190_1.method5231(super.anInt5773, false, arg2, false, super.anInt5769, 65536);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class112 local28 = arg2.method4798();
			local28.method3589(super.anInt5769, super.anInt5772, super.anInt5773);
			return local21.method5187(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILclient!en;)Lclient!mj;")
	@Override
	public Class101 method5548(@OriginalArg(1) int arg0, @OriginalArg(2) Class59 arg1) {
		return this.aClass190_1.method5231(0, false, arg1, false, 0, arg0);
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "(I)I")
	@Override
	public int method5554() {
		return this.aClass190_1.anInt5881;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
		@Pc(16) Class101 local16 = this.aClass190_1.method5231(super.anInt5773, true, arg0, true, super.anInt5769, 131072);
		if (local16 != null) {
			this.aClass190_1.method5228(super.aShort73, super.aShort76, super.aShort74, false, arg0, super.aShort75, local16);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!en;)V")
	@Override
	public void method5550(@OriginalArg(1) Class59 arg0) {
		this.aClass190_1.method5223(arg0);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		@Pc(16) Class101 local16 = this.aClass190_1.method5231(super.anInt5773, true, arg0, false, super.anInt5769, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(31) Class112 local31 = arg0.method4798();
		local31.method3589(super.anInt5769, super.anInt5772, super.anInt5773);
		@Pc(41) Class63_Sub3 local41 = null;
		if (this.aBoolean86) {
			local41 = Static273.method4667(1);
		}
		if (this.aClass190_1.aClass63_Sub5_6 == null) {
			local16.method5172(local31, local41 == null ? null : local41.aClass63_Sub7Array1[0], 0);
		} else {
			@Pc(71) Class21 local71 = this.aClass190_1.aClass63_Sub5_6.method4125();
			arg0.method4811(local16, local71, local31, local41 == null ? null : local41.aClass63_Sub7Array1[0]);
		}
		this.aClass190_1.method5228(super.aShort73, super.aShort76, super.aShort74, true, arg0, super.aShort75, local16);
		return local41;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)I")
	@Override
	public int method5552() {
		return this.aClass190_1.anInt5878;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5551() {
		return this.aClass190_1.method5229();
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5585() {
		return false;
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)I")
	@Override
	public int method5096() {
		return this.aClass190_1.method5230();
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	@Override
	public void method5588() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)I")
	@Override
	public int method5549() {
		return this.aClass190_1.anInt5883;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!en;B)V")
	@Override
	public void method5555(@OriginalArg(0) Class59 arg0) {
		this.aClass190_1.method5227(arg0);
	}
}
