import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ls")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 implements Interface5 {

	@OriginalMember(owner = "client!ls", name = "J", descriptor = "Lclient!ie;")
	public final Class97 aClass97_3;

	@OriginalMember(owner = "client!ls", name = "D", descriptor = "Z")
	private final boolean aBoolean331;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(Lclient!vm;Lclient!ds;IIIIIIIZI)V")
	public Class2_Sub4_Sub2(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10) {
		super(arg6, arg7, arg8, Static252.method4347(arg3, arg2));
		this.aClass97_3 = new Class97(arg0, arg1, arg2, arg3, arg4, arg5, super.anInt3993, super.anInt3992, arg9, arg10);
		this.aBoolean331 = arg1.anInt1336 != 0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLclient!vm;)V")
	@Override
	public void method4732(@OriginalArg(1) Class92 arg0) {
		this.aClass97_3.method2536(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!vm;Z)Lclient!dn;")
	@Override
	public Class17_Sub2 method5413(@OriginalArg(0) Class92 arg0) {
		@Pc(16) Class5 local16 = this.aClass97_3.method2533(arg0, super.anInt3992, 1024, super.anInt3993, true, false);
		if (local16 == null) {
			return null;
		}
		@Pc(23) Class23 local23 = arg0.method4466();
		local23.method5091(super.anInt3993, super.anInt3999, super.anInt3992);
		@Pc(33) Class17_Sub2 local33 = null;
		if (this.aBoolean331) {
			local33 = Static238.method4100(1);
		}
		if (this.aClass97_3.aClass17_Sub3_3 == null) {
			local16.method4029(local23, local33 == null ? null : local33.aClass17_Sub6Array1[0], 0);
		} else {
			@Pc(49) Class88 local49 = this.aClass97_3.aClass17_Sub3_3.method1067();
			arg0.method4451(local16, local49, local23, local33 == null ? null : local33.aClass17_Sub6Array1[0]);
		}
		this.aClass97_3.method2537(super.anInt3992 >> 7, arg0, super.anInt3993 >> 7, super.anInt3992 >> 7, true, local16, super.anInt3993 >> 7);
		return local33;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!vm;I)V")
	@Override
	public void method5409(@OriginalArg(0) Class92 arg0) {
		@Pc(16) Class5 local16 = this.aClass97_3.method2533(arg0, super.anInt3992, 131072, super.anInt3993, true, true);
		if (local16 != null) {
			this.aClass97_3.method2537(super.anInt3992 >> 7, arg0, super.anInt3993 >> 7, super.anInt3992 >> 7, false, local16, super.anInt3993 >> 7);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method4728() {
		return this.aClass97_3.method2531();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLclient!vm;)V")
	@Override
	public void method4730(@OriginalArg(1) Class92 arg0) {
		this.aClass97_3.method2535(arg0);
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)I")
	@Override
	public int method4734() {
		return this.aClass97_3.anInt2857;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lclient!vm;II)Lclient!jn;")
	@Override
	public Class5 method4727(@OriginalArg(0) Class92 arg0, @OriginalArg(2) int arg1) {
		return this.aClass97_3.method2533(arg0, 0, arg1, 0, false, false);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)I")
	@Override
	public int method4729() {
		return this.aClass97_3.anInt2863;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)I")
	@Override
	public int method4733() {
		return this.aClass97_3.anInt2846;
	}

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
	@Override
	public void method5408() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZIIILclient!ai;ILclient!vm;)V")
	@Override
	public void method5406(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class92 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ls", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method5411() {
		return false;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIILclient!vm;)Z")
	@Override
	public boolean method5414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class92 arg2) {
		@Pc(21) Class5 local21 = this.aClass97_3.method2533(arg2, super.anInt3992, 65536, super.anInt3993, false, false);
		if (local21 == null) {
			return false;
		} else {
			@Pc(28) Class23 local28 = arg2.method4466();
			local28.method5091(super.anInt3993, super.anInt3999, super.anInt3992);
			return local21.method3995(arg0, arg1, local28, false);
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
	@Override
	public void method4731() {
	}
}
