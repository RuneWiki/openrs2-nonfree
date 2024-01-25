import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class8_Sub2_Sub1 extends Class8_Sub2 implements Interface7 {

	@OriginalMember(owner = "client!gi", name = "N", descriptor = "Lclient!wg;")
	public final Class216 aClass216_1;

	@OriginalMember(owner = "client!gi", name = "T", descriptor = "Z")
	private final boolean aBoolean187;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!vq;Lclient!bi;IIIIIIIZIIII)V")
	public Class8_Sub2_Sub1(@OriginalArg(0) Class47 arg0, @OriginalArg(1) Class18 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg6, arg7, arg8, arg10, arg11, arg12, Static172.method3327(arg2, arg3));
		this.aClass216_1 = new Class216(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
		this.aBoolean187 = arg1.anInt503 != 0 && !arg9;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!vq;)V")
	@Override
	public void method5591(@OriginalArg(1) Class47 arg0) {
		this.aClass216_1.method5538(arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5592() {
		return this.aClass216_1.method5541();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILclient!vq;)Lclient!ni;")
	@Override
	public Class38 method5588(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1) {
		return this.aClass216_1.method5549(0, false, 0, arg1, false, arg0);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!vq;IIB)Z")
	@Override
	public boolean method5623(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class38 local16 = this.aClass216_1.method5549(super.anInt5892, false, super.anInt5898, arg0, false, 65536);
		if (local16 == null) {
			return false;
		} else {
			@Pc(31) Class57 local31 = arg0.method2706();
			local31.method4189(super.anInt5893 + super.anInt5898, super.anInt5897, super.anInt5894 + super.anInt5892);
			return local16.method1905(arg1, arg2, local31, false);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!vq;I)V")
	@Override
	public void method5593(@OriginalArg(0) Class47 arg0) {
		this.aClass216_1.method5543(arg0);
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)I")
	@Override
	public int method5590() {
		return this.aClass216_1.anInt6611;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)I")
	@Override
	public int method5589() {
		return this.aClass216_1.anInt6617;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	@Override
	public void method5587() {
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!vq;B)V")
	@Override
	public void method5627(@OriginalArg(0) Class47 arg0) {
		@Pc(24) Class38 local24 = this.aClass216_1.method5549(super.anInt5892, false, super.anInt5898, arg0, true, 131072);
		if (local24 != null) {
			this.aClass216_1.method5540(false, super.anInt5892 >> 7, super.anInt5898 >> 7, super.anInt5892 >> 7, arg0, super.anInt5898 >> 7, local24);
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)I")
	@Override
	public int method5594() {
		return this.aClass216_1.anInt6616;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLclient!vq;)Lclient!bf;")
	@Override
	public Class2_Sub2 method5624(@OriginalArg(1) Class47 arg0) {
		@Pc(16) Class38 local16 = this.aClass216_1.method5549(super.anInt5892, false, super.anInt5898, arg0, true, 1024);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class57 local23 = arg0.method2706();
		local23.method4189(super.anInt5898 + super.anInt5893, super.anInt5897, super.anInt5892 + super.anInt5894);
		@Pc(40) Class2_Sub2 local40 = null;
		if (this.aBoolean187) {
			local40 = Static248.method4393(1);
		}
		if (this.aClass216_1.aClass2_Sub4_6 == null) {
			local16.method1925(local23, local40 == null ? null : local40.aClass2_Sub5Array1[0], 0);
		} else {
			@Pc(70) Class176 local70 = this.aClass216_1.aClass2_Sub4_6.method3927();
			arg0.method2760(local16, local70, local23, local40 == null ? null : local40.aClass2_Sub5Array1[0]);
		}
		this.aClass216_1.method5540(true, super.anInt5892 >> 7, super.anInt5898 >> 7, super.anInt5892 >> 7, arg0, super.anInt5898 >> 7, local16);
		return local40;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)I")
	@Override
	public int method5020() {
		return this.aClass216_1.method5542();
	}
}
