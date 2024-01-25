import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class8_Sub1_Sub3_Sub5 extends Class8_Sub1_Sub3 {

	@OriginalMember(owner = "client!ti", name = "ab", descriptor = "Lclient!kq;")
	private Class8_Sub5 aClass8_Sub5_8;

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
	private int anInt9594 = 0;

	@OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
	private int anInt9601 = 0;

	@OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
	private int anInt9612 = 0;

	@OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
	private final int anInt9604 = -1;

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
	private int anInt9608 = 0;

	@OriginalMember(owner = "client!ti", name = "rb", descriptor = "Z")
	private boolean aBoolean739 = true;

	@OriginalMember(owner = "client!ti", name = "db", descriptor = "Z")
	public boolean aBoolean740 = false;

	@OriginalMember(owner = "client!ti", name = "mb", descriptor = "I")
	private int anInt9613 = 0;

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
	public final int anInt9603;

	@OriginalMember(owner = "client!ti", name = "pb", descriptor = "I")
	private final int anInt9600;

	@OriginalMember(owner = "client!ti", name = "O", descriptor = "Lclient!hs;")
	private Class165 aClass165_3;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
	public Class8_Sub1_Sub3_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
		this.anInt9612 = arg12;
		this.anInt9603 = arg1 + arg2;
		this.anInt9600 = arg0;
		@Pc(53) Class160 local53 = Static421.aClass385_2.method9166(this.anInt9600);
		@Pc(56) int local56 = local53.anInt3635;
		if (local56 == -1) {
			this.aBoolean740 = true;
		} else {
			this.aClass165_3 = Static158.aClass317_1.method7882(local56, 100);
			this.aBoolean740 = false;
		}
		if (arg2 == this.anInt9603) {
			Static268.method4004(this.aClass165_3, this, this.anInt9613);
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!df;IZIIILclient!ha;)V")
	@Override
	public void method8901(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class57 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ha;III)Lclient!ka;")
	private Class164 method8233(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 <= 69) {
			this.aClass165_3 = null;
		}
		@Pc(16) Class160 local16 = Static421.aClass385_2.method9166(arg1);
		@Pc(21) Class22 local21 = Static220.aClass22Array2[super.aByte145];
		@Pc(37) Class22 local37 = super.aByte146 < 3 ? Static220.aClass22Array2[super.aByte146 + 1] : null;
		return this.aBoolean740 ? local16.method3179(super.anInt10357, local37, -1, local21, arg0, 0, -1, Static158.aClass317_1, arg3, super.anInt10363, super.anInt10355) : local16.method3179(super.anInt10357, local37, this.anInt9613, local21, arg0, this.anInt9601, this.anInt9604, Static158.aClass317_1, arg3, super.anInt10363, super.anInt10355);
	}

	@OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass8_Sub5_8 != null) {
			this.aClass8_Sub5_8.method4913();
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ha;I)Lclient!cca;")
	@Override
	public Class59 method8904(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int arg1) {
		if (arg1 <= 65) {
			this.method8899((byte) -14);
		}
		return null;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method8897(@OriginalArg(0) boolean arg0) {
		return arg0 ? true : this.aBoolean739;
	}

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "(I)V")
	@Override
	public void method8898(@OriginalArg(0) int arg0) {
		if (arg0 == -38) {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8906(@OriginalArg(0) byte arg0) {
		if (arg0 != 27) {
			this.aClass8_Sub5_8 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public void method8234(@OriginalArg(0) int arg0) {
		if (this.aClass8_Sub5_8 != null) {
			this.aClass8_Sub5_8.method4913();
		}
		if (arg0 >= -46) {
			this.method8237((byte) -128, -66);
		}
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8899(@OriginalArg(0) byte arg0) {
		if (arg0 != 94) {
			this.method8234(97);
		}
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	@Override
	public Class8_Sub10 method8909(@OriginalArg(0) byte arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(24) Class164 local24 = this.method8233(arg1, this.anInt9600, 88, (this.anInt9612 == 0 ? 0 : 5) | 0x800);
		if (arg0 != -104) {
			this.anInt9601 = 122;
		}
		if (local24 == null) {
			return null;
		}
		if (this.anInt9612 != 0) {
			local24.a(this.anInt9612 * 2048);
		}
		@Pc(54) Class203 local54 = arg1.method7672();
		local54.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
		this.method8235(arg1, local54, local24);
		@Pc(73) Class8_Sub10 local73 = Static213.method3056(false, 0, 1);
		if (Static565.aBoolean768) {
			local24.method9092(local54, local73.aClass8_Sub7Array1[0], Static243.anInt4189, 0);
		} else {
			local24.method9073(local54, local73.aClass8_Sub7Array1[0], 0);
		}
		if (this.aClass8_Sub5_8 != null) {
			@Pc(105) Class193 local105 = this.aClass8_Sub5_8.method4912();
			if (Static565.aBoolean768) {
				arg1.method7662(local105, Static243.anInt4189);
			} else {
				arg1.method7728(local105);
			}
		}
		this.aBoolean739 = local24.F();
		this.anInt9608 = local24.fa();
		this.anInt9594 = local24.ma();
		return local73;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!ha;ZLclient!qq;Lclient!ka;)V")
	private void method8235(@OriginalArg(0) Class57 arg0, @OriginalArg(2) Class203 arg1, @OriginalArg(3) Class164 arg2) {
		arg2.method9090(arg1);
		@Pc(17) Class189[] local17 = arg2.method9081();
		@Pc(20) Class161[] local20 = arg2.method9070();
		if ((this.aClass8_Sub5_8 == null || this.aClass8_Sub5_8.aBoolean440) && (local17 != null || local20 != null)) {
			this.aClass8_Sub5_8 = Static321.method4911(Static44.anInt740, true);
		}
		if (this.aClass8_Sub5_8 != null) {
			this.aClass8_Sub5_8.method4903(arg0, (long) Static44.anInt740, local17, local20);
			this.aClass8_Sub5_8.method4917(super.aByte145, super.aShort109, super.aShort110, super.aShort108, super.aShort107);
		}
	}

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)I")
	@Override
	protected int method8911() {
		this.method8906((byte) 99);
		return this.anInt9594;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!ha;B)Z")
	@Override
	public boolean method8895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class57 arg2, @OriginalArg(3) byte arg3) {
		if (arg3 > -43) {
			this.anInt9601 = -54;
		}
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(ILclient!ha;)V")
	@Override
	public void method8907(@OriginalArg(0) int arg0, @OriginalArg(1) Class57 arg1) {
		@Pc(13) Class164 local13 = this.method8233(arg1, this.anInt9600, arg0 + 111, arg0);
		if (local13 != null) {
			@Pc(18) Class203 local18 = arg1.method7672();
			local18.method8332(super.anInt10355, super.anInt10357, super.anInt10363);
			this.method8235(arg1, local18, local13);
		}
	}

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "(I)I")
	@Override
	public int method8900(@OriginalArg(0) int arg0) {
		if (arg0 != -2226) {
			this.method8237((byte) -101, -3);
		}
		return this.anInt9608;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)V")
	public void method8237(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		if (this.aBoolean740) {
			return;
		}
		if (arg0 <= 109) {
			this.method8904((Class57) null, 79);
		}
		this.anInt9601 += arg1;
		while (this.anInt9601 > this.aClass165_3.anIntArray225[this.anInt9613]) {
			this.anInt9601 -= this.aClass165_3.anIntArray225[this.anInt9613];
			this.anInt9613++;
			if (this.anInt9613 >= this.aClass165_3.anIntArray226.length) {
				this.aBoolean740 = true;
				break;
			}
		}
		if (!this.aBoolean740) {
			Static268.method4004(this.aClass165_3, this, this.anInt9613);
		}
	}
}
