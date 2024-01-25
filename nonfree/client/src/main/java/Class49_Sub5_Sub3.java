import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class49_Sub5_Sub3 extends Class49_Sub5 implements Interface18 {

	@OriginalMember(owner = "client!rv", name = "C", descriptor = "Lclient!ud;")
	private Class291 aClass291_7;

	@OriginalMember(owner = "client!rv", name = "w", descriptor = "Z")
	private final boolean aBoolean538;

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "Z")
	private boolean aBoolean539;

	@OriginalMember(owner = "client!rv", name = "T", descriptor = "Z")
	private final boolean aBoolean541;

	@OriginalMember(owner = "client!rv", name = "E", descriptor = "B")
	private final byte aByte109;

	@OriginalMember(owner = "client!rv", name = "x", descriptor = "B")
	private final byte aByte108;

	@OriginalMember(owner = "client!rv", name = "N", descriptor = "S")
	private final short aShort127;

	@OriginalMember(owner = "client!rv", name = "s", descriptor = "Z")
	private final boolean aBoolean537;

	@OriginalMember(owner = "client!rv", name = "U", descriptor = "Lclient!r;")
	private Class145 aClass145_6;

	@OriginalMember(owner = "client!rv", name = "G", descriptor = "Lclient!k;")
	private Class1_Sub1_Sub9 aClass1_Sub1_Sub9_5;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!qa;Lclient!bu;IIIIZIZ)V")
	public Class49_Sub5_Sub3(@OriginalArg(0) Class122 arg0, @OriginalArg(1) Class36 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		super(arg3, arg4, arg5, arg1.anInt951, arg1.aBoolean60, arg1.aBoolean52);
		super.anInt7467 = arg3;
		super.anInt7464 = arg5;
		this.aBoolean538 = arg6;
		this.aBoolean539 = arg8;
		this.aBoolean541 = arg1.anInt992 != 0 && !arg6;
		this.aByte109 = (byte) arg7;
		this.aByte108 = (byte) arg2;
		this.aShort127 = (short) arg1.anInt952;
		this.aBoolean537 = arg0.method7248() && arg1.aBoolean59 && !this.aBoolean538 && Static544.aClass1_Sub22_Sub1_1.method4655(Static374.anInt6861) != 0;
		@Pc(69) int local69 = 2048;
		if (this.aBoolean539) {
			local69 |= 0x10000;
		}
		@Pc(84) Class305 local84 = this.method6265(local69, this.aBoolean537, arg0);
		if (local84 != null) {
			this.aClass145_6 = local84.aClass145_7;
			this.aClass1_Sub1_Sub9_5 = local84.aClass1_Sub1_Sub9_6;
			if (this.aBoolean539) {
				this.aClass145_6 = this.aClass145_6.method6672((byte) 0, local69, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)I")
	@Override
	public int method7465() {
		return 22;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7455(@OriginalArg(0) Class122 arg0) {
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!qa;II)Lclient!r;")
	private Class145 method6263(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass145_6 != null && arg0.method7225(this.aClass145_6.ba(), arg1) == 0) {
			return this.aClass145_6;
		} else {
			@Pc(26) Class305 local26 = this.method6265(arg1, false, arg0);
			return local26 == null ? null : local26.aClass145_7;
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(ILclient!qa;)Lclient!ud;")
	@Override
	public Class291 method7460(@OriginalArg(1) Class122 arg0) {
		if (this.aClass291_7 == null) {
			this.aClass291_7 = Static158.method2472(this.method6263(arg0, 0), super.anInt7464, super.anInt7470, super.anInt7467);
		}
		return this.aClass291_7;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7466(@OriginalArg(1) Class122 arg0) {
		@Pc(25) Class1_Sub1_Sub9 local25;
		if (this.aClass1_Sub1_Sub9_5 == null && this.aBoolean537) {
			@Pc(18) Class305 local18 = this.method6265(262144, true, arg0);
			local25 = local18 == null ? null : local18.aClass1_Sub1_Sub9_6;
		} else {
			local25 = this.aClass1_Sub1_Sub9_5;
			this.aClass1_Sub1_Sub9_5 = null;
		}
		if (local25 != null) {
			Static449.method6410(local25, this.aByte108, super.anInt7467, super.anInt7464, null);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IZLclient!qa;I)Lclient!vq;")
	private Class305 method6265(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class122 arg2) {
		@Pc(13) Class36 local13 = Static308.aClass96_4.method2274(this.aShort127 & 0xFFFF);
		@Pc(21) Class205 local21;
		@Pc(25) Class205 local25;
		if (this.aBoolean538) {
			local21 = Static209.aClass205Array2[this.aByte108];
			local25 = Static16.aClass205Array1[0];
		} else {
			local21 = Static16.aClass205Array1[this.aByte108];
			if (this.aByte108 >= 3) {
				local25 = null;
			} else {
				local25 = Static16.aClass205Array1[this.aByte108 + 1];
			}
		}
		return local13.method963(super.anInt7464, local21, super.anInt7467, 22, arg0, arg2, super.anInt7470, local25, this.aByte109, arg1);
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)I")
	@Override
	public int method7469() {
		return this.aByte109;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	@Override
	public Class145 method7468(@OriginalArg(0) int arg0, @OriginalArg(2) Class122 arg1) {
		return this.method6263(arg1, arg0);
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)I")
	@Override
	public int method7467() {
		return this.aShort127 & 0xFFFF;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BLclient!qa;)Lclient!qba;")
	@Override
	public Class72_Sub7 method7453(@OriginalArg(1) Class122 arg0) {
		if (this.aClass145_6 == null) {
			return null;
		}
		@Pc(11) Class118 local11 = arg0.method7256();
		local11.oa(super.anInt7467, super.anInt7470, super.anInt7464);
		@Pc(29) Class72_Sub7 local29 = null;
		if (this.aBoolean541) {
			local29 = Static186.method2914(1);
		}
		this.aClass145_6.method6686(local11, local29 == null ? null : local29.aClass72_Sub2Array1[0], 0);
		return local29;
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method7451() {
		return this.aBoolean539;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)V")
	@Override
	public void method7457() {
		this.aBoolean539 = false;
		if (this.aClass145_6 != null) {
			this.aClass145_6.m(this.aClass145_6.ba() & 0xFFFEFFFF);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIILclient!qa;IZLclient!lb;)V")
	@Override
	public void method7456(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class49 arg5) {
		if (arg5 instanceof Class49_Sub5_Sub3) {
			@Pc(5) Class49_Sub5_Sub3 local5 = (Class49_Sub5_Sub3) arg5;
			if (this.aClass145_6 != null && local5.aClass145_6 != null) {
				this.aClass145_6.method6674(local5.aClass145_6, arg3, arg1, arg0, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILclient!qa;I)Z")
	@Override
	public boolean method7452(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class122 arg2) {
		@Pc(9) Class145 local9 = this.method6263(arg2, 131072);
		if (local9 == null) {
			return false;
		} else {
			@Pc(14) Class118 local14 = arg2.method7256();
			local14.oa(super.anInt7467, super.anInt7470, super.anInt7464);
			return local9.method6683(arg0, arg1, local14, false);
		}
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)V")
	@Override
	public void method7472() {
		if (this.aClass145_6 != null) {
			this.aClass145_6.method6668();
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lclient!qa;I)V")
	@Override
	public void method7470(@OriginalArg(0) Class122 arg0) {
		@Pc(31) Class1_Sub1_Sub9 local31;
		if (this.aClass1_Sub1_Sub9_5 == null && this.aBoolean537) {
			@Pc(24) Class305 local24 = this.method6265(262144, true, arg0);
			local31 = local24 == null ? null : local24.aClass1_Sub1_Sub9_6;
		} else {
			local31 = this.aClass1_Sub1_Sub9_5;
			this.aClass1_Sub1_Sub9_5 = null;
		}
		if (local31 != null) {
			Static371.method5720(local31, this.aByte108, super.anInt7467, super.anInt7464, null);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7471() {
		return this.aBoolean537;
	}
}
