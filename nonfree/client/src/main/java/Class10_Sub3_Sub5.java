import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class10_Sub3_Sub5 extends Class10_Sub3 {

	@OriginalMember(owner = "client!md", name = "K", descriptor = "Lclient!pj;")
	private Class1_Sub7 aClass1_Sub7_4;

	@OriginalMember(owner = "client!md", name = "P", descriptor = "I")
	private int anInt3933 = 0;

	@OriginalMember(owner = "client!md", name = "D", descriptor = "I")
	private final int anInt3925 = -1;

	@OriginalMember(owner = "client!md", name = "eb", descriptor = "I")
	private int anInt3946 = 0;

	@OriginalMember(owner = "client!md", name = "E", descriptor = "Z")
	public boolean aBoolean247 = false;

	@OriginalMember(owner = "client!md", name = "V", descriptor = "I")
	private int anInt3938 = -32768;

	@OriginalMember(owner = "client!md", name = "T", descriptor = "I")
	private final int anInt3936;

	@OriginalMember(owner = "client!md", name = "W", descriptor = "I")
	public final int anInt3939;

	@OriginalMember(owner = "client!md", name = "J", descriptor = "Lclient!gn;")
	private Class79 aClass79_2;

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class10_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
		this.anInt3936 = arg0;
		this.anInt3939 = arg2 + arg1;
		@Pc(40) int local40 = Static76.method1908(this.anInt3936).anInt2302;
		if (local40 == -1) {
			this.aBoolean247 = true;
		} else {
			this.aBoolean247 = false;
			this.aClass79_2 = Static233.method4080(local40);
		}
		if (arg2 == this.anInt3939) {
			Static273.method4631(super.anInt5908, this.anInt3946, super.anInt5910, false, this.aClass79_2);
		}
	}

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5343(@OriginalArg(0) Class46 arg0) {
		@Pc(9) Class45 local9 = this.method3656(0, arg0);
		if (local9 != null) {
			this.method3660(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(BI)V")
	public void method3653(@OriginalArg(1) int arg0) {
		if (this.aBoolean247) {
			return;
		}
		this.anInt3933 += arg0;
		while (this.anInt3933 > this.aClass79_2.anIntArray215[this.anInt3946]) {
			this.anInt3933 -= this.aClass79_2.anIntArray215[this.anInt3946];
			this.anInt3946++;
			if (this.anInt3946 >= this.aClass79_2.anIntArray217.length) {
				this.aBoolean247 = true;
				break;
			}
		}
		if (!this.aBoolean247) {
			Static273.method4631(super.anInt5908, this.anInt3946, super.anInt5910, false, this.aClass79_2);
		}
	}

	@OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
	@Override
	public void method5340() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!e;IIZLclient!hm;I)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
	public void method3655() {
		if (this.aClass1_Sub7_4 != null) {
			this.aClass1_Sub7_4.method4328();
		}
	}

	@OriginalMember(owner = "client!md", name = "f", descriptor = "(I)I")
	@Override
	public int method5345() {
		return this.anInt3938;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IILclient!e;)Lclient!id;")
	private Class45 method3656(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		@Pc(13) Class78 local13 = Static76.method1908(this.anInt3936);
		return this.aBoolean247 ? local13.method2266(-1, -1, arg0, arg1, 0) : local13.method2266(this.anInt3925, this.anInt3946, arg0, arg1, this.anInt3933);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIILclient!e;)Z")
	@Override
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	@Override
	public Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0) {
		@Pc(9) Class45 local9 = this.method3656(1024, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class51 local16 = arg0.method5145();
		local16.method3548(super.anInt5910, super.anInt5907, super.anInt5908);
		if (this.aClass1_Sub7_4 == null) {
			local9.method1794(local16, null, 0);
		} else {
			@Pc(43) Class109 local43 = this.aClass1_Sub7_4.method4320();
			arg0.method5116(local9, local43, local16, null);
		}
		this.anInt3938 = local9.method1781();
		this.method3660(local9, arg0);
		return null;
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5339() {
		return false;
	}

	@OriginalMember(owner = "client!md", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass1_Sub7_4 != null) {
			this.aClass1_Sub7_4.method4328();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(Lclient!id;Lclient!e;B)V")
	private void method3660(@OriginalArg(0) Class45 arg0, @OriginalArg(1) Class46 arg1) {
		@Pc(10) Class115[] local10 = arg0.method1787();
		@Pc(13) Class101[] local13 = arg0.method1776();
		if ((this.aClass1_Sub7_4 == null || this.aClass1_Sub7_4.aBoolean319) && (local10 != null || local13 != null)) {
			this.aClass1_Sub7_4 = new Class1_Sub7(Static153.anInt3257);
		}
		if (this.aClass1_Sub7_4 != null) {
			this.aClass1_Sub7_4.method4319(arg1, (long) Static153.anInt3257, local10, local13);
			this.aClass1_Sub7_4.method4323(super.aByte64, super.aShort83, super.aShort80, super.aShort82, super.aShort81);
		}
	}
}
