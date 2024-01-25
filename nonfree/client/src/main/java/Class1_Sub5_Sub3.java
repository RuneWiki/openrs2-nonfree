import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class1_Sub5_Sub3 extends Class1_Sub5 implements Interface8 {

	@OriginalMember(owner = "client!vg", name = "w", descriptor = "Z")
	private final boolean aBoolean473;

	@OriginalMember(owner = "client!vg", name = "u", descriptor = "S")
	private final short aShort93;

	@OriginalMember(owner = "client!vg", name = "s", descriptor = "B")
	private final byte aByte70;

	@OriginalMember(owner = "client!vg", name = "P", descriptor = "Z")
	private boolean aBoolean476;

	@OriginalMember(owner = "client!vg", name = "K", descriptor = "B")
	private final byte aByte72;

	@OriginalMember(owner = "client!vg", name = "y", descriptor = "B")
	private final byte aByte71;

	@OriginalMember(owner = "client!vg", name = "E", descriptor = "Z")
	private final boolean aBoolean475;

	@OriginalMember(owner = "client!vg", name = "x", descriptor = "Z")
	private final boolean aBoolean474;

	@OriginalMember(owner = "client!vg", name = "J", descriptor = "Lclient!qh;")
	public Class159 aClass159_6;

	@OriginalMember(owner = "client!vg", name = "G", descriptor = "Lclient!ph;")
	private Class2_Sub7_Sub11 aClass2_Sub7_Sub11_5;

	static {
		new Class62("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(Lclient!oj;Lclient!cu;IIIIZIIZ)V")
	public Class1_Sub5_Sub3(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9) {
		super(arg3, arg4, arg5, Static331.method5339(arg7, arg8));
		super.anInt6721 = (short) arg3;
		this.aBoolean473 = arg1.anInt1274 != 0 && !arg6;
		this.aShort93 = (short) arg1.anInt1234;
		super.anInt6720 = (short) arg5;
		this.aByte70 = (byte) arg7;
		this.aBoolean476 = arg9;
		this.aByte72 = (byte) arg2;
		this.aByte71 = (byte) arg8;
		this.aBoolean475 = arg6;
		this.aBoolean474 = arg0.method2476() && arg1.aBoolean100 && !this.aBoolean475 && Static266.anInt5047 != 0;
		@Pc(67) int local67 = 1024;
		if (this.aBoolean476) {
			local67 |= 0x8000;
		}
		@Pc(82) Class187 local82 = this.method5827(local67, arg0, this.aBoolean474);
		if (local82 != null) {
			this.aClass159_6 = local82.aClass159_5;
			this.aClass2_Sub7_Sub11_5 = local82.aClass2_Sub7_Sub11_4;
			if (this.aBoolean476) {
				this.aClass159_6 = this.aClass159_6.method4927((byte) 0, local67, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6028(@OriginalArg(1) Class48 arg0) {
		@Pc(32) Class2_Sub7_Sub11 local32;
		if (this.aClass2_Sub7_Sub11_5 == null && this.aBoolean474) {
			@Pc(25) Class187 local25 = this.method5827(131072, arg0, true);
			local32 = local25 == null ? null : local25.aClass2_Sub7_Sub11_4;
		} else {
			local32 = this.aClass2_Sub7_Sub11_5;
			this.aClass2_Sub7_Sub11_5 = null;
		}
		if (local32 != null) {
			Static78.method1356(local32, this.aByte72, super.anInt6721, super.anInt6720, null);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!oj;IZ)Lclient!pr;")
	private Class187 method5827(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(19) Class47 local19 = Static230.aClass96_4.method2303(this.aShort93 & 0xFFFF);
		@Pc(42) Class149 local42;
		@Pc(28) Class149 local28;
		if (this.aBoolean475) {
			local28 = Static210.aClass149Array5[0];
			local42 = Static248.aClass149Array3[this.aByte72];
		} else {
			if (this.aByte72 >= 3) {
				local28 = null;
			} else {
				local28 = Static210.aClass149Array5[this.aByte72 + 1];
			}
			local42 = Static210.aClass149Array5[this.aByte72];
		}
		return local19.method896(local42, local28, this.aByte70, arg2, this.aByte71, super.anInt6721, super.anInt6719, super.anInt6720, arg1, arg0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZLclient!a;IBLclient!oj;)V")
	@Override
	public void method6019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class1 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class48 arg5) {
		if (arg3 instanceof Class1_Sub5_Sub3) {
			@Pc(5) Class1_Sub5_Sub3 local5 = (Class1_Sub5_Sub3) arg3;
			if (this.aClass159_6 != null && local5.aClass159_6 != null) {
				this.aClass159_6.method4973(local5.aClass159_6, arg0, arg1, arg4, arg2);
			}
		} else if (arg3 instanceof Class1_Sub2_Sub2) {
			@Pc(28) Class1_Sub2_Sub2 local28 = (Class1_Sub2_Sub2) arg3;
			if (this.aClass159_6 != null && local28.aClass159_3 != null) {
				this.aClass159_6.method4973(local28.aClass159_3, arg0, arg1, arg4, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method6033() {
		return this.aBoolean474;
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method6015() {
		return this.aBoolean476;
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6032(@OriginalArg(1) Class48 arg0) {
		@Pc(14) Class2_Sub7_Sub11 local14;
		if (this.aClass2_Sub7_Sub11_5 == null && this.aBoolean474) {
			@Pc(25) Class187 local25 = this.method5827(131072, arg0, true);
			local14 = local25 == null ? null : local25.aClass2_Sub7_Sub11_4;
		} else {
			local14 = this.aClass2_Sub7_Sub11_5;
			this.aClass2_Sub7_Sub11_5 = null;
		}
		if (local14 != null) {
			Static169.method5042(local14, this.aByte72, super.anInt6721, super.anInt6720, null);
		}
	}

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)I")
	@Override
	public int method6031() {
		return this.aByte71;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)I")
	@Override
	public int method6034() {
		return this.aShort93 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILclient!oj;)Lclient!qh;")
	private Class159 method5828(@OriginalArg(0) int arg0, @OriginalArg(2) Class48 arg1) {
		if (this.aClass159_6 != null && arg1.method2448(this.aClass159_6.method4951(), arg0) == 0) {
			return this.aClass159_6;
		} else {
			@Pc(32) Class187 local32 = this.method5827(arg0, arg1, false);
			return local32 == null ? null : local32.aClass159_5;
		}
	}

	@OriginalMember(owner = "client!vg", name = "d", descriptor = "(ILclient!oj;)V")
	@Override
	public void method6023(@OriginalArg(1) Class48 arg0) {
	}

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
	@Override
	public void method6020() {
		this.aBoolean476 = false;
		if (this.aClass159_6 != null) {
			this.aClass159_6.method4958(this.aClass159_6.method4951() & 0xFFFF7FFF);
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!oj;B)Lclient!qh;")
	@Override
	public Class159 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1) {
		return this.method5828(arg0, arg1);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
	@Override
	public void method6030() {
		if (this.aClass159_6 != null) {
			this.aClass159_6.method4928();
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILclient!oj;II)Z")
	@Override
	public boolean method6016(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class159 local16 = this.method5828(65536, arg1);
		if (local16 == null) {
			return false;
		} else {
			@Pc(21) Class21 local21 = arg1.method2445();
			local21.method3711(super.anInt6721, super.anInt6719, super.anInt6720);
			return local16.method4931(arg0, arg2, local21, false);
		}
	}

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(ILclient!oj;)Lclient!mg;")
	@Override
	public Class7_Sub5 method6013(@OriginalArg(1) Class48 arg0) {
		if (this.aClass159_6 == null) {
			return null;
		}
		@Pc(11) Class21 local11 = arg0.method2445();
		local11.method3711(super.anInt6721, super.anInt6719, super.anInt6720);
		@Pc(26) Class7_Sub5 local26 = null;
		if (this.aBoolean473) {
			local26 = Static234.method4211(1);
		}
		this.aClass159_6.method4952(local11, local26 == null ? null : local26.aClass7_Sub6Array1[0], 0);
		return local26;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)I")
	@Override
	public int method6027() {
		return this.aByte70;
	}
}
