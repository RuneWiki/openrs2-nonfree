import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class25_Sub3_Sub1 extends Class25_Sub3 implements Interface8 {

	@OriginalMember(owner = "client!hc", name = "F", descriptor = "Lclient!th;")
	public final Class190 aClass190_2;

	@OriginalMember(owner = "client!hc", name = "Q", descriptor = "Z")
	private final boolean aBoolean157;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lclient!en;Lclient!nl;IIIIIIIZIIII)V")
	public Class25_Sub3_Sub1(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class137 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static40.method891(arg2, arg3));
		this.aClass190_2 = new Class190(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean157 = arg1.anInt4164 != 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	@Override
	public void method5553() {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLclient!en;)V")
	@Override
	public void method5550(@OriginalArg(1) Class59 arg0) {
		this.aClass190_2.method5223(arg0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!en;)Lclient!ir;")
	@Override
	public Class63_Sub3 method5590(@OriginalArg(1) Class59 arg0) {
		@Pc(24) Class101 local24 = this.aClass190_2.method5231(super.anInt6244, true, arg0, false, super.anInt6241, 1024);
		if (local24 == null) {
			return null;
		}
		@Pc(31) Class112 local31 = arg0.method4798();
		local31.method3589(super.anInt6251 + super.anInt6241, super.anInt6238, super.anInt6244 + super.anInt6248);
		@Pc(47) Class63_Sub3 local47 = null;
		if (this.aBoolean157) {
			local47 = Static273.method4667(1);
		}
		if (this.aClass190_2.aClass63_Sub5_6 == null) {
			local24.method5172(local31, local47 == null ? null : local47.aClass63_Sub7Array1[0], 0);
		} else {
			@Pc(77) Class21 local77 = this.aClass190_2.aClass63_Sub5_6.method4125();
			arg0.method4811(local24, local77, local31, local47 == null ? null : local47.aClass63_Sub7Array1[0]);
		}
		this.aClass190_2.method5228(super.anInt6241 >> 7, super.anInt6241 >> 7, super.anInt6244 >> 7, true, arg0, super.anInt6244 >> 7, local24);
		return local47;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!en;B)V")
	@Override
	public void method5555(@OriginalArg(0) Class59 arg0) {
		this.aClass190_2.method5227(arg0);
	}

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)I")
	@Override
	public int method5547() {
		return this.aClass190_2.method5230();
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I")
	@Override
	public int method5549() {
		return this.aClass190_2.anInt5883;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)I")
	@Override
	public int method5552() {
		return this.aClass190_2.anInt5878;
	}

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)I")
	@Override
	public int method5554() {
		return this.aClass190_2.anInt5881;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(BILclient!en;)Lclient!mj;")
	@Override
	public Class101 method5548(@OriginalArg(1) int arg0, @OriginalArg(2) Class59 arg1) {
		return this.aClass190_2.method5231(0, false, arg1, false, 0, arg0);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIZLclient!en;)Z")
	@Override
	public boolean method5586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class59 arg2) {
		@Pc(16) Class101 local16 = this.aClass190_2.method5231(super.anInt6244, false, arg2, false, super.anInt6241, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(23) Class112 local23 = arg2.method4798();
			local23.method3589(super.anInt6241 + super.anInt6251, super.anInt6238, super.anInt6248 + super.anInt6244);
			return local16.method5187(arg0, arg1, local23, false);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!en;I)V")
	@Override
	public void method5583(@OriginalArg(0) Class59 arg0) {
		@Pc(20) Class101 local20 = this.aClass190_2.method5231(super.anInt6244, true, arg0, false, super.anInt6241, 131072);
		if (local20 != null) {
			this.aClass190_2.method5228(super.anInt6241 >> 7, super.anInt6241 >> 7, super.anInt6244 >> 7, false, arg0, super.anInt6244 >> 7, local20);
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5551() {
		return this.aClass190_2.method5229();
	}
}
