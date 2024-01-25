import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class3_Sub4_Sub3 extends Class3_Sub4 implements Interface10 {

	@OriginalMember(owner = "client!or", name = "B", descriptor = "Lclient!ck;")
	public final Class42 aClass42_3;

	@OriginalMember(owner = "client!or", name = "P", descriptor = "Z")
	private final boolean aBoolean349;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!qq;Lclient!in;IIIIIZIIIIII)V")
	public Class3_Sub4_Sub3(@OriginalArg(0) Class28 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13) {
		super(arg4, arg5, arg6, arg8, arg9, arg10, Static318.method4505(arg11, arg12));
		this.aClass42_3 = new Class42(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
		this.aBoolean349 = arg1.anInt2984 != 0 && !arg7;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(B)I")
	@Override
	public int method5812() {
		return this.aClass42_3.anInt1029;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(I)V")
	@Override
	public void method5810() {
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5806() {
		return this.aClass42_3.method960();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5809(@OriginalArg(1) Class28 arg0) {
		this.aClass42_3.method967(arg0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!qq;I)V")
	@Override
	public void method5813(@OriginalArg(0) Class28 arg0) {
		this.aClass42_3.method965(arg0);
	}

	@OriginalMember(owner = "client!or", name = "c", descriptor = "(I)I")
	@Override
	public int method5811() {
		return this.aClass42_3.anInt1023;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)I")
	@Override
	public int method5807() {
		return this.aClass42_3.anInt1043;
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(B)I")
	@Override
	public int method4354() {
		return this.aClass42_3.method961();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!qq;BII)Z")
	@Override
	public boolean method5797(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class39 local18 = this.aClass42_3.method968(false, super.anInt4917, super.anInt4924, arg0, false, 131072);
		if (local18 == null) {
			return false;
		} else {
			@Pc(25) Class132 local25 = arg0.method3564();
			local25.method3986(super.anInt4922 + super.anInt4924, super.anInt4914, super.anInt4917 + super.anInt4920);
			return local18.method4888(arg1, arg2, local25, false);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!qq;ZI)Lclient!cd;")
	@Override
	public Class39 method5808(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1) {
		return this.aClass42_3.method968(false, 0, 0, arg0, false, arg1);
	}

	@OriginalMember(owner = "client!or", name = "b", descriptor = "(ZLclient!qq;)V")
	@Override
	public void method5792(@OriginalArg(1) Class28 arg0) {
		@Pc(16) Class39 local16 = this.aClass42_3.method968(true, super.anInt4917, super.anInt4924, arg0, false, 262144);
		if (local16 != null) {
			@Pc(23) int local23 = super.anInt4924 >> 7;
			@Pc(28) int local28 = super.anInt4917 >> 7;
			this.aClass42_3.method966(local28, local23, local23, local16, false, arg0, local28);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BLclient!qq;)Lclient!km;")
	@Override
	public Class48_Sub6 method5790(@OriginalArg(1) Class28 arg0) {
		@Pc(16) Class39 local16 = this.aClass42_3.method968(true, super.anInt4917, super.anInt4924, arg0, false, 2048);
		if (local16 == null) {
			return null;
		}
		@Pc(33) Class132 local33 = arg0.method3564();
		local33.method3986(super.anInt4924 + super.anInt4922, super.anInt4914, super.anInt4917 + super.anInt4920);
		@Pc(50) Class48_Sub6 local50 = null;
		if (this.aBoolean349) {
			local50 = Static403.method5489(1);
		}
		if (this.aClass42_3.aClass48_Sub1_1 == null) {
			local16.method4910(local33, local50 == null ? null : local50.aClass48_Sub7Array1[0], 0);
		} else {
			@Pc(80) Class115 local80 = this.aClass42_3.aClass48_Sub1_1.method1293();
			arg0.method3571(local16, local80, local33, local50 == null ? null : local50.aClass48_Sub7Array1[0]);
		}
		@Pc(99) int local99 = super.anInt4924 >> 7;
		@Pc(104) int local104 = super.anInt4917 >> 7;
		this.aClass42_3.method966(local104, local99, local99, local16, true, arg0, local104);
		return local50;
	}
}
