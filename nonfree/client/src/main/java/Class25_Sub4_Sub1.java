import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class25_Sub4_Sub1 extends Class25_Sub4 implements Interface8 {

	@OriginalMember(owner = "client!km", name = "B", descriptor = "B")
	private final byte aByte39;

	@OriginalMember(owner = "client!km", name = "T", descriptor = "Z")
	private final boolean aBoolean237;

	@OriginalMember(owner = "client!km", name = "U", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!km", name = "t", descriptor = "S")
	private final short aShort45;

	@OriginalMember(owner = "client!km", name = "I", descriptor = "Z")
	private final boolean aBoolean236;

	@OriginalMember(owner = "client!km", name = "H", descriptor = "Z")
	private boolean aBoolean235;

	@OriginalMember(owner = "client!km", name = "x", descriptor = "Z")
	private final boolean aBoolean234;

	@OriginalMember(owner = "client!km", name = "s", descriptor = "Lclient!lg;")
	private Class5_Sub9_Sub14 aClass5_Sub9_Sub14_3;

	@OriginalMember(owner = "client!km", name = "C", descriptor = "Lclient!mj;")
	private Class101 aClass101_3;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(Lclient!en;Lclient!nl;IIIIZIZ)V")
	public Class25_Sub4_Sub1(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.aBoolean300, arg1.aBoolean294);
		this.aByte39 = (byte) arg7;
		this.aBoolean237 = arg1.anInt4164 != 0;
		this.aByte40 = (byte) arg2;
		this.aShort45 = (short) arg1.anInt4114;
		super.anInt3915 = (short) arg3;
		this.aBoolean236 = arg6;
		this.aBoolean235 = arg8;
		super.anInt3916 = (short) arg5;
		this.aBoolean234 = arg0.method4842() && arg1.aBoolean295 && !this.aBoolean236 && Static134.anInt2750 != 0;
		@Pc(64) int local64 = 1024;
		if (this.aBoolean235) {
			local64 |= 0x8000;
		}
		@Pc(79) Class72 local79 = this.method3059(this.aBoolean234, local64, arg0);
		if (local79 != null) {
			this.aClass5_Sub9_Sub14_3 = local79.aClass5_Sub9_Sub14_2;
			this.aClass101_3 = local79.aClass101_2;
			if (this.aBoolean235) {
				this.aClass101_3 = this.aClass101_3.method5184((byte) 0, local64, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(I)I")
	@Override
	public int method5554() {
		return 22;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
	@Override
	public int method5549() {
		return this.aShort45 & 0xFFFF;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!en;B)V")
	@Override
	public void method5555(@OriginalArg(0) Class59 arg0) {
		@Pc(25) Class5_Sub9_Sub14 local25;
		if (this.aClass5_Sub9_Sub14_3 == null && this.aBoolean234) {
			@Pc(18) Class72 local18 = this.method3059(true, 131072, arg0);
			local25 = local18 == null ? null : local18.aClass5_Sub9_Sub14_2;
		} else {
			local25 = this.aClass5_Sub9_Sub14_3;
			this.aClass5_Sub9_Sub14_3 = null;
		}
		if (local25 != null) {
			Static161.method2990(local25, this.aByte40, super.anInt3915, super.anInt3916, null);
		}
	}

	@OriginalMember(owner = "client!km", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5585() {
		return this.aBoolean235;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!en;IBLclient!fs;IZ)V")
	@Override
	public void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class25 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		if (!(arg3 instanceof Class25_Sub4_Sub1)) {
			return;
		}
		@Pc(13) Class25_Sub4_Sub1 local13 = (Class25_Sub4_Sub1) arg3;
		if (this.aClass101_3 != null && local13.aClass101_3 != null) {
			this.aClass101_3.method5181(local13.aClass101_3, arg2, arg0, arg4, arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BILclient!en;)Lclient!mj;")
	@Override
	public Class101 method5548(@OriginalArg(1) int arg0, @OriginalArg(2) Class59 arg1) {
		return this.method3058(arg0, arg1);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(15) Class101 local15 = this.method3058(65536, arg2);
		if (local15 == null) {
			return false;
		} else {
			@Pc(20) Class112 local20 = arg2.method4798();
			local20.method3589(super.anInt3915, super.anInt3913, super.anInt3916);
			return local15.method5187(arg0, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		if (this.aClass101_3 == null) {
			return null;
		}
		@Pc(11) Class112 local11 = arg0.method4798();
		local11.method3589(super.anInt3915, super.anInt3913, super.anInt3916);
		@Pc(21) Class63_Sub3 local21 = null;
		if (this.aBoolean237) {
			local21 = Static273.method4667(1);
		}
		this.aClass101_3.method5172(local11, local21 == null ? null : local21.aClass63_Sub7Array1[0], 0);
		return local21;
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)I")
	@Override
	public int method5552() {
		return this.aByte39;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BLclient!en;)V")
	@Override
	public void method5550(@OriginalArg(1) Class59 arg0) {
		@Pc(29) Class5_Sub9_Sub14 local29;
		if (this.aClass5_Sub9_Sub14_3 == null && this.aBoolean234) {
			@Pc(22) Class72 local22 = this.method3059(true, 131072, arg0);
			local29 = local22 == null ? null : local22.aClass5_Sub9_Sub14_2;
		} else {
			local29 = this.aClass5_Sub9_Sub14_3;
			this.aClass5_Sub9_Sub14_3 = null;
		}
		if (local29 != null) {
			Static204.method3634(local29, this.aByte40, super.anInt3915, super.anInt3916, null);
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IILclient!en;)Lclient!mj;")
	private Class101 method3058(@OriginalArg(0) int arg0, @OriginalArg(2) Class59 arg1) {
		if (this.aClass101_3 != null && arg1.method4792(this.aClass101_3.method5171(), arg0) == 0) {
			return this.aClass101_3;
		} else {
			@Pc(31) Class72 local31 = this.method3059(false, arg0, arg1);
			return local31 == null ? null : local31.aClass101_2;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZILclient!en;I)Lclient!gi;")
	private Class72 method3059(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class59 arg2) {
		@Pc(12) Class137 local12 = Static228.method3923(this.aShort45 & 0xFFFF);
		@Pc(29) Class3 local29;
		@Pc(24) Class3 local24;
		if (this.aBoolean236) {
			local24 = Static262.aClass3Array3[0];
			local29 = Static93.aClass3Array1[this.aByte40];
		} else {
			local29 = Static262.aClass3Array3[this.aByte40];
			if (this.aByte40 < 3) {
				local24 = Static262.aClass3Array3[this.aByte40 + 1];
			} else {
				local24 = null;
			}
		}
		return local12.method3706(super.anInt3913, local24, this.aByte39, 22, arg0, super.anInt3915, arg1, arg2, local29, super.anInt3916);
	}

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5551() {
		return this.aBoolean234;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
	@Override
	public void method5553() {
		if (this.aClass101_3 != null) {
			this.aClass101_3.method5189();
		}
	}

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
	@Override
	public void method5588() {
		this.aBoolean235 = false;
		if (this.aClass101_3 != null) {
			this.aClass101_3.method5145(this.aClass101_3.method5171() & 0xFFFF7FFF);
		}
	}
}
