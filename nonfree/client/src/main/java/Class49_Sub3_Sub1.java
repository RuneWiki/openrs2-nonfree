import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ew")
public final class Class49_Sub3_Sub1 extends Class49_Sub3 implements Interface18 {

	@OriginalMember(owner = "client!ew", name = "J", descriptor = "Lclient!ud;")
	private Class291 aClass291_2;

	@OriginalMember(owner = "client!ew", name = "W", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!ew", name = "O", descriptor = "B")
	private final byte aByte41;

	@OriginalMember(owner = "client!ew", name = "G", descriptor = "Z")
	private final boolean aBoolean156;

	@OriginalMember(owner = "client!ew", name = "ab", descriptor = "S")
	private final short aShort38;

	@OriginalMember(owner = "client!ew", name = "z", descriptor = "B")
	private final byte aByte40;

	@OriginalMember(owner = "client!ew", name = "K", descriptor = "Z")
	private final boolean aBoolean157;

	@OriginalMember(owner = "client!ew", name = "T", descriptor = "Z")
	private final boolean aBoolean158;

	@OriginalMember(owner = "client!ew", name = "V", descriptor = "Lclient!r;")
	private Class145 aClass145_3;

	@OriginalMember(owner = "client!ew", name = "C", descriptor = "Lclient!k;")
	private Class1_Sub1_Sub9 aClass1_Sub1_Sub9_3;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!qa;Lclient!bu;IIIIZIIIII)V")
	public Class49_Sub3_Sub1(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg3, arg4, arg5, arg7, arg8, arg9, Static546.method2435(arg10, arg11));
		super.anInt9071 = arg5;
		this.aByte42 = (byte) arg2;
		this.aByte41 = (byte) arg10;
		this.aBoolean156 = arg6;
		this.aShort38 = (short) arg1.anInt952;
		this.aByte40 = (byte) arg11;
		super.anInt9077 = arg3;
		this.aBoolean157 = arg1.anInt992 != 0 && !arg6;
		this.aBoolean158 = arg0.method7248() && arg1.aBoolean59 && !this.aBoolean156 && Static544.aClass1_Sub22_Sub1_1.method4655(Static374.anInt6861) != 0;
		@Pc(80) Class305 local80 = this.method2096(2048, this.aBoolean158, arg0);
		if (local80 != null) {
			this.aClass145_3 = local80.aClass145_7;
			this.aClass1_Sub1_Sub9_3 = local80.aClass1_Sub1_Sub9_6;
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		if (this.aClass291_2 == null) {
			this.aClass291_2 = Static158.method2472(this.method2095(arg0, 0), super.anInt9071, super.anInt9070, super.anInt9077);
		}
		return this.aClass291_2;
	}

	@OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)I")
	@Override
	public int method7469() {
		return this.aByte40;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7466(@OriginalArg(1) Class122 arg0) {
		@Pc(36) Class1_Sub1_Sub9 local36;
		if (this.aClass1_Sub1_Sub9_3 == null && this.aBoolean158) {
			@Pc(29) Class305 local29 = this.method2096(262144, true, arg0);
			local36 = local29 == null ? null : local29.aClass1_Sub1_Sub9_6;
		} else {
			local36 = this.aClass1_Sub1_Sub9_3;
			this.aClass1_Sub1_Sub9_3 = null;
		}
		if (local36 != null) {
			Static449.method6410(local36, this.aByte42, super.anInt9077, super.anInt9071, null);
		}
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)I")
	@Override
	public int method7467() {
		return this.aShort38 & 0xFFFF;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		if (this.aClass145_3 == null) {
			return null;
		}
		@Pc(19) Class118 local19 = arg0.method7256();
		local19.oa(super.anInt9077 + super.anInt9076, super.anInt9070, super.anInt9068 + super.anInt9071);
		@Pc(35) Class72_Sub7 local35 = null;
		if (this.aBoolean157) {
			local35 = Static186.method2914(1);
		}
		this.aClass145_3.method6686(local19, local35 == null ? null : local35.aClass72_Sub2Array1[0], 0);
		return local35;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)I")
	@Override
	public int method7465() {
		return this.aByte41;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7471() {
		return this.aBoolean158;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!qa;II)Lclient!r;")
	private Class145 method2095(@OriginalArg(0) Class122 arg0, @OriginalArg(2) int arg1) {
		if (this.aClass145_3 != null && arg0.method7225(this.aClass145_3.ba(), arg1) == 0) {
			return this.aClass145_3;
		} else {
			@Pc(31) Class305 local31 = this.method2096(arg1, false, arg0);
			return local31 == null ? null : local31.aClass145_7;
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	@Override
	public Class145 method7468(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		return this.method2095(arg1, arg0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7470(@OriginalArg(0) Class122 arg0) {
		@Pc(14) Class1_Sub1_Sub9 local14;
		if (this.aClass1_Sub1_Sub9_3 == null && this.aBoolean158) {
			@Pc(25) Class305 local25 = this.method2096(262144, true, arg0);
			local14 = local25 == null ? null : local25.aClass1_Sub1_Sub9_6;
		} else {
			local14 = this.aClass1_Sub1_Sub9_3;
			this.aClass1_Sub1_Sub9_3 = null;
		}
		if (local14 != null) {
			Static371.method5720(local14, this.aByte42, super.anInt9077, super.anInt9071, null);
		}
	}

	@OriginalMember(owner = "client!ew", name = "g", descriptor = "(I)I")
	@Override
	public int method7462() {
		return this.aClass145_3 == null ? 0 : this.aClass145_3.TA();
	}

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)V")
	@Override
	public void method7472() {
		if (this.aClass145_3 != null) {
			this.aClass145_3.method6668();
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		@Pc(9) Class145 local9 = this.method2095(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(20) Class118 local20 = arg2.method7256();
			local20.oa(super.anInt9077, super.anInt9070, super.anInt9071);
			return local9.method6683(arg0, arg1, local20, false);
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIZLclient!qa;)Lclient!vq;")
	private Class305 method2096(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class122 arg2) {
		@Pc(13) Class36 local13 = Static308.aClass96_4.method2274(this.aShort38 & 0xFFFF);
		@Pc(33) Class205 local33;
		@Pc(28) Class205 local28;
		if (this.aBoolean156) {
			local28 = Static16.aClass205Array1[0];
			local33 = Static209.aClass205Array2[this.aByte42];
		} else {
			local33 = Static16.aClass205Array1[this.aByte42];
			if (this.aByte42 >= 3) {
				local28 = null;
			} else {
				local28 = Static16.aClass205Array1[this.aByte42 + 1];
			}
		}
		return local13.method963(super.anInt9071, local33, super.anInt9077, this.aByte41, arg0, arg2, super.anInt9070, local28, this.aByte40, arg1);
	}
}
