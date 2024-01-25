import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public final class Class272 {

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "I")
	public int anInt7613;

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "Lclient!wm;")
	private final Class267 aClass267_86 = new Class267(64);

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "Lclient!wm;")
	public final Class267 aClass267_87 = new Class267(50);

	@OriginalMember(owner = "client!wu", name = "w", descriptor = "Lclient!td;")
	public final Class232 aClass232_1 = new Class232(250);

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "Lclient!cr;")
	private final Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "Lclient!ph;")
	private final Class187 aClass187_136;

	@OriginalMember(owner = "client!wu", name = "A", descriptor = "Lclient!qr;")
	private final Class204 aClass204_2;

	@OriginalMember(owner = "client!wu", name = "k", descriptor = "Lclient!ph;")
	public final Class187 aClass187_135;

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "Z")
	private boolean aBoolean500;

	@OriginalMember(owner = "client!wu", name = "r", descriptor = "I")
	public final int anInt7609;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "I")
	public final int anInt7599;

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray59;

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray60;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!kp;IZLclient!qr;Lclient!ph;Lclient!ph;)V")
	public Class272(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class204 arg3, @OriginalArg(4) Class187 arg4, @OriginalArg(5) Class187 arg5) {
		this.aClass187_136 = arg4;
		this.aClass204_2 = arg3;
		this.aClass187_135 = arg5;
		this.aBoolean500 = arg2;
		this.anInt7609 = arg1;
		if (this.aClass187_136 == null) {
			this.anInt7599 = 0;
		} else {
			@Pc(54) int local54 = this.aClass187_136.method4302() - 1;
			this.anInt7599 = local54 * 256 + this.aClass187_136.method4306(local54);
		}
		this.aStringArray59 = new String[] { null, null, Static44.aClass182_36.method4155(this.anInt7609), null, null };
		this.aStringArray60 = new String[] { null, null, null, null, Static310.aClass182_191.method4155(this.anInt7609) };
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V")
	public void method6062() {
		@Pc(6) Class232 local6 = this.aClass232_1;
		synchronized (this.aClass232_1) {
			this.aClass232_1.method5168();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
	public void method6063() {
		@Pc(2) Class267 local2 = this.aClass267_86;
		synchronized (this.aClass267_86) {
			this.aClass267_86.method6013();
		}
		local2 = this.aClass267_87;
		synchronized (this.aClass267_87) {
			this.aClass267_87.method6013();
		}
		@Pc(44) Class232 local44 = this.aClass232_1;
		synchronized (this.aClass232_1) {
			this.aClass232_1.method5165();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZ)V")
	public void method6064(@OriginalArg(0) int arg0) {
		this.anInt7613 = arg0;
		@Pc(9) Class267 local9 = this.aClass267_87;
		synchronized (this.aClass267_87) {
			this.aClass267_87.method6011();
		}
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
	public void method6065() {
		@Pc(2) Class267 local2 = this.aClass267_86;
		synchronized (this.aClass267_86) {
			this.aClass267_86.method6011();
		}
		local2 = this.aClass267_87;
		synchronized (this.aClass267_87) {
			this.aClass267_87.method6011();
		}
		@Pc(36) Class232 local36 = this.aClass232_1;
		synchronized (this.aClass232_1) {
			this.aClass232_1.method5168();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BZ)V")
	public void method6067(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean500 != arg0) {
			this.aBoolean500 = arg0;
			this.method6065();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(II)Lclient!ds;")
	public Class60 method6068(@OriginalArg(0) int arg0) {
		@Pc(8) Class267 local8 = this.aClass267_86;
		@Pc(18) Class60 local18;
		synchronized (this.aClass267_86) {
			local18 = (Class60) this.aClass267_86.method6014((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class187 local31 = this.aClass187_136;
		@Pc(44) byte[] local44;
		synchronized (this.aClass187_136) {
			local44 = this.aClass187_136.method4300(Static181.method2973(arg0), Static288.method4073(arg0));
		}
		local18 = new Class60();
		local18.anInt1682 = arg0;
		local18.aClass272_1 = this;
		local18.aStringArray14 = new String[] { null, null, Static44.aClass182_36.method4155(this.anInt7609), null, null };
		local18.aStringArray15 = new String[] { null, null, null, null, Static310.aClass182_191.method4155(this.anInt7609) };
		if (local44 != null) {
			local18.method1526(new Class10_Sub8(local44));
		}
		local18.method1539();
		if (local18.anInt1691 != -1) {
			local18.method1524(this.method6068(local18.anInt1716), this.method6068(local18.anInt1691));
		}
		if (local18.anInt1722 != -1) {
			local18.method1541(this.method6068(local18.anInt1722), this.method6068(local18.anInt1705));
		}
		if (!this.aBoolean500 && local18.aBoolean113) {
			local18.aString11 = Static349.aClass182_215.method4155(this.anInt7609);
			local18.aStringArray15 = this.aStringArray60;
			local18.anIntArray131 = null;
			local18.anInt1724 = 0;
			local18.aStringArray14 = this.aStringArray59;
			local18.lb = false;
			if (local18.aClass167_9 != null) {
				@Pc(204) boolean local204 = false;
				for (@Pc(209) Class10 local209 = local18.aClass167_9.method3702(); local209 != null; local209 = local18.aClass167_9.method3708()) {
					@Pc(219) Class155 local219 = this.aClass204_2.method4526((int) local209.aLong264);
					if (local219.aBoolean287) {
						local209.method6033();
					} else {
						local204 = true;
					}
				}
				if (!local204) {
					local18.aClass167_9 = null;
				}
			}
		}
		@Pc(244) Class267 local244 = this.aClass267_86;
		synchronized (this.aClass267_86) {
			this.aClass267_86.method6008(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V")
	public void method6069() {
		@Pc(2) Class267 local2 = this.aClass267_87;
		synchronized (this.aClass267_87) {
			this.aClass267_87.method6011();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!za;IIZZLclient!za;ILclient!la;Lclient!fd;II)Lclient!o;")
	public Class80 method6070(@OriginalArg(0) int arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) Class50 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class57 arg8, @OriginalArg(9) Class75 arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class80 local16 = this.method6072(arg9, arg7, arg0, arg10, arg6, arg3, arg2);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class60 local25 = this.method6068(arg10);
		if (arg7 > 1 && local25.anIntArray129 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg7 >= local25.anIntArray132[local35] && local25.anIntArray132[local35] != 0) {
					local33 = local25.anIntArray129[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method6068(local33);
			}
		}
		@Pc(82) int[] local82 = local25.method1528(arg6, arg7, arg9, arg0, arg4, arg3, arg2, arg1, arg8);
		if (local82 == null) {
			return null;
		}
		@Pc(101) Class80 local101;
		if (arg5) {
			local101 = arg1.method5823(local82, 36, 36, 32);
		} else {
			local101 = arg6.method5823(local82, 36, 36, 32);
		}
		if (!arg5) {
			@Pc(117) Class44 local117 = new Class44();
			local117.anInt1139 = arg6.anInt7375;
			local117.anInt1134 = arg7;
			local117.anInt1136 = arg10;
			local117.anInt1133 = arg2;
			local117.anInt1138 = arg0;
			local117.anInt1137 = arg3;
			local117.aBoolean70 = arg9 != null;
			this.aClass232_1.method5161(local101, local117);
		}
		return local101;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!fd;IIILclient!za;III)Lclient!o;")
	public Class80 method6072(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class50 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass44_1.aBoolean70 = arg0 != null;
		this.aClass44_1.anInt1138 = arg2;
		this.aClass44_1.anInt1136 = arg3;
		this.aClass44_1.anInt1134 = arg1;
		this.aClass44_1.anInt1133 = arg6;
		this.aClass44_1.anInt1137 = arg5;
		this.aClass44_1.anInt1139 = arg4.anInt7375;
		return (Class80) this.aClass232_1.method5160(this.aClass44_1);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BI)V")
	public void method6074() {
		@Pc(2) Class267 local2 = this.aClass267_86;
		synchronized (this.aClass267_86) {
			this.aClass267_86.method6007(5);
		}
		local2 = this.aClass267_87;
		synchronized (this.aClass267_87) {
			this.aClass267_87.method6007(5);
		}
		@Pc(46) Class232 local46 = this.aClass232_1;
		synchronized (this.aClass232_1) {
			this.aClass232_1.method5159();
		}
	}
}
