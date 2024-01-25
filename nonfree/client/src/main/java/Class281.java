import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public final class Class281 {

	@OriginalMember(owner = "client!qr", name = "D", descriptor = "I")
	public int anInt8460;

	@OriginalMember(owner = "client!qr", name = "e", descriptor = "Lclient!gg;")
	private final Class112 aClass112_51 = new Class112(64);

	@OriginalMember(owner = "client!qr", name = "x", descriptor = "Lclient!gg;")
	public final Class112 aClass112_52 = new Class112(50);

	@OriginalMember(owner = "client!qr", name = "y", descriptor = "Lclient!rs;")
	public final Class295 aClass295_1 = new Class295(250);

	@OriginalMember(owner = "client!qr", name = "z", descriptor = "Lclient!gs;")
	private final Class118 aClass118_1 = new Class118();

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "Lclient!kha;")
	public final Class181 aClass181_95;

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "Z")
	private boolean aBoolean725;

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
	public final int anInt8452;

	@OriginalMember(owner = "client!qr", name = "C", descriptor = "Lclient!co;")
	private final Class49 aClass49_1;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "Lclient!kha;")
	private final Class181 aClass181_94;

	@OriginalMember(owner = "client!qr", name = "k", descriptor = "I")
	public final int anInt8448;

	@OriginalMember(owner = "client!qr", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray36;

	@OriginalMember(owner = "client!qr", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray35;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!dh;IZLclient!co;Lclient!kha;Lclient!kha;)V")
	public Class281(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class49 arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(5) Class181 arg5) {
		this.aClass181_95 = arg5;
		this.aBoolean725 = arg2;
		this.anInt8452 = arg1;
		this.aClass49_1 = arg3;
		this.aClass181_94 = arg4;
		if (this.aClass181_94 == null) {
			this.anInt8448 = 0;
		} else {
			@Pc(54) int local54 = this.aClass181_94.method5029() - 1;
			this.anInt8448 = this.aClass181_94.method5025(local54) + local54 * 256;
		}
		this.aStringArray36 = new String[] { null, null, Static287.aClass176_7.method4986(this.anInt8452), null, null };
		this.aStringArray35 = new String[] { null, null, null, null, Static287.aClass176_8.method4986(this.anInt8452) };
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BI)V")
	public void method6970(@OriginalArg(1) int arg0) {
		this.anInt8460 = arg0;
		@Pc(9) Class112 local9 = this.aClass112_52;
		synchronized (this.aClass112_52) {
			this.aClass112_52.method3638();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V")
	public void method6971() {
		@Pc(9) Class295 local9 = this.aClass295_1;
		synchronized (this.aClass295_1) {
			this.aClass295_1.method7266();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(ZI)V")
	public void method6974(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean725) {
			this.aBoolean725 = arg0;
			this.method6981();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(II)Lclient!nq;")
	public Class237 method6975(@OriginalArg(1) int arg0) {
		@Pc(8) Class112 local8 = this.aClass112_51;
		@Pc(20) Class237 local20;
		synchronized (this.aClass112_51) {
			local20 = (Class237) this.aClass112_51.method3640((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(33) Class181 local33 = this.aClass181_94;
		@Pc(48) byte[] local48;
		synchronized (this.aClass181_94) {
			local48 = this.aClass181_94.method5023(Static414.method6479(arg0), Static188.method3759(arg0));
		}
		local20 = new Class237();
		local20.aClass281_2 = this;
		local20.anInt7307 = arg0;
		local20.aStringArray30 = new String[] { null, null, Static287.aClass176_7.method4986(this.anInt8452), null, null };
		local20.aStringArray29 = new String[] { null, null, null, null, Static287.aClass176_8.method4986(this.anInt8452) };
		if (local48 != null) {
			local20.method6067(new Class3_Sub15(local48));
		}
		local20.method6075();
		if (local20.anInt7311 != -1) {
			local20.method6065(this.method6975(local20.anInt7325), this.method6975(local20.anInt7311));
		}
		if (local20.anInt7309 != -1) {
			local20.method6071(this.method6975(local20.anInt7309), this.method6975(local20.anInt7299));
		}
		if (!this.aBoolean725 && local20.aBoolean630) {
			local20.aString84 = Static287.aClass176_5.method4986(this.anInt8452);
			local20.aStringArray29 = this.aStringArray35;
			local20.aBoolean629 = false;
			local20.anIntArray441 = null;
			local20.anInt7266 = 0;
			local20.aStringArray30 = this.aStringArray36;
			if (local20.aClass307_36 != null) {
				@Pc(210) boolean local210 = false;
				for (@Pc(215) Class3 local215 = local20.aClass307_36.method7421(); local215 != null; local215 = local20.aClass307_36.method7428()) {
					@Pc(225) Class140 local225 = this.aClass49_1.method1857((int) local215.aLong277);
					if (local225.aBoolean453) {
						local215.method8671();
					} else {
						local210 = true;
					}
				}
				if (!local210) {
					local20.aClass307_36 = null;
				}
			}
		}
		@Pc(250) Class112 local250 = this.aClass112_51;
		synchronized (this.aClass112_51) {
			this.aClass112_51.method3636((long) arg0, local20);
			return local20;
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V")
	public void method6976() {
		@Pc(6) Class112 local6 = this.aClass112_52;
		synchronized (this.aClass112_52) {
			this.aClass112_52.method3638();
		}
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "(I)V")
	public void method6977() {
		@Pc(6) Class112 local6 = this.aClass112_51;
		synchronized (this.aClass112_51) {
			this.aClass112_51.method3643();
		}
		local6 = this.aClass112_52;
		synchronized (this.aClass112_52) {
			this.aClass112_52.method3643();
		}
		@Pc(42) Class295 local42 = this.aClass295_1;
		synchronized (this.aClass295_1) {
			this.aClass295_1.method7258();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BIIIILclient!vea;ILclient!ha;)Lclient!ac;")
	public Class5 method6979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class352 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class33 arg6) {
		this.aClass118_1.anInt4454 = arg6.anInt7410;
		this.aClass118_1.anInt4457 = arg1;
		this.aClass118_1.anInt4465 = arg3;
		this.aClass118_1.aBoolean375 = arg4 != null;
		this.aClass118_1.anInt4467 = arg2;
		this.aClass118_1.anInt4456 = arg5;
		this.aClass118_1.anInt4459 = arg0;
		return (Class5) this.aClass295_1.method7267(this.aClass118_1);
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V")
	public void method6981() {
		@Pc(6) Class112 local6 = this.aClass112_51;
		synchronized (this.aClass112_51) {
			this.aClass112_51.method3638();
		}
		local6 = this.aClass112_52;
		synchronized (this.aClass112_52) {
			this.aClass112_52.method3638();
		}
		@Pc(42) Class295 local42 = this.aClass295_1;
		synchronized (this.aClass295_1) {
			this.aClass295_1.method7266();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IZ)V")
	public void method6984() {
		@Pc(2) Class112 local2 = this.aClass112_51;
		synchronized (this.aClass112_51) {
			this.aClass112_51.method3637(5);
		}
		local2 = this.aClass112_52;
		synchronized (this.aClass112_52) {
			this.aClass112_52.method3637(5);
		}
		@Pc(44) Class295 local44 = this.aClass295_1;
		synchronized (this.aClass295_1) {
			this.aClass295_1.method7259();
		}
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(IILclient!vea;Lclient!da;IIIIZLclient!ha;Lclient!ha;Z)Lclient!ac;")
	public Class5 method6985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class352 arg2, @OriginalArg(3) Class25 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) Class33 arg8, @OriginalArg(10) Class33 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class5 local16 = this.method6979(arg0, arg4, arg1, arg5, arg2, arg6, arg9);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class237 local25 = this.method6975(arg1);
		if (arg0 > 1 && local25.anIntArray442 != null) {
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < 10; local43++) {
				if (arg0 >= local25.anIntArray443[local43] && local25.anIntArray443[local43] != 0) {
					local41 = local25.anIntArray442[local43];
				}
			}
			if (local41 != -1) {
				local25 = this.method6975(local41);
			}
		}
		@Pc(95) int[] local95 = local25.method6066(arg5, arg6, arg3, arg4, arg9, arg2, arg0, arg10, arg8);
		if (local95 == null) {
			return null;
		}
		@Pc(110) Class5 local110;
		if (arg7) {
			local110 = arg8.method6204(32, 36, local95, 36);
		} else {
			local110 = arg9.method6204(32, 36, local95, 36);
		}
		if (!arg7) {
			@Pc(127) Class118 local127 = new Class118();
			local127.aBoolean375 = arg2 != null;
			local127.anInt4456 = arg6;
			local127.anInt4465 = arg5;
			local127.anInt4467 = arg1;
			local127.anInt4454 = arg9.anInt7410;
			local127.anInt4459 = arg0;
			local127.anInt4457 = arg4;
			this.aClass295_1.method7269(local110, local127);
		}
		return local110;
	}
}
