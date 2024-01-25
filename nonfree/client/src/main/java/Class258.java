import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class258 {

	@OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
	public int anInt8024;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Lclient!of;")
	private final Class236 aClass236_73 = new Class236(64);

	@OriginalMember(owner = "client!pj", name = "t", descriptor = "Lclient!of;")
	public final Class236 aClass236_74 = new Class236(50);

	@OriginalMember(owner = "client!pj", name = "u", descriptor = "Lclient!gf;")
	public final Class115 aClass115_1 = new Class115(250);

	@OriginalMember(owner = "client!pj", name = "v", descriptor = "Lclient!kea;")
	private final Class174 aClass174_1 = new Class174();

	@OriginalMember(owner = "client!pj", name = "z", descriptor = "Lclient!qia;")
	private final Class274 aClass274_2;

	@OriginalMember(owner = "client!pj", name = "l", descriptor = "Lclient!oh;")
	private final Class237 aClass237_111;

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "Z")
	private boolean aBoolean578;

	@OriginalMember(owner = "client!pj", name = "q", descriptor = "Lclient!oh;")
	public final Class237 aClass237_112;

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
	public final int anInt8013;

	@OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
	public final int anInt8017;

	@OriginalMember(owner = "client!pj", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray20;

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray21;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lclient!nb;IZLclient!qia;Lclient!oh;Lclient!oh;)V")
	public Class258(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class274 arg3, @OriginalArg(4) Class237 arg4, @OriginalArg(5) Class237 arg5) {
		this.aClass274_2 = arg3;
		this.aClass237_111 = arg4;
		this.aBoolean578 = arg2;
		this.aClass237_112 = arg5;
		this.anInt8013 = arg1;
		if (this.aClass237_111 == null) {
			this.anInt8017 = 0;
		} else {
			@Pc(54) int local54 = this.aClass237_111.method6311() - 1;
			this.anInt8017 = this.aClass237_111.method6315(local54) + local54 * 256;
		}
		this.aStringArray20 = new String[] { null, null, Static121.aClass84_7.method2710(this.anInt8013), null, null };
		this.aStringArray21 = new String[] { null, null, null, null, Static121.aClass84_8.method2710(this.anInt8013) };
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
	public void method6643(@OriginalArg(0) int arg0) {
		this.anInt8024 = arg0;
		@Pc(17) Class236 local17 = this.aClass236_74;
		synchronized (this.aClass236_74) {
			this.aClass236_74.method6253();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILclient!da;Lclient!ha;IZLclient!uba;Lclient!ha;IZ)Lclient!hu;")
	public Class21 method6644(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class27 arg3, @OriginalArg(5) Class16 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class337 arg7, @OriginalArg(9) Class16 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class21 local16 = this.method6645(arg9, arg2, arg5, arg4, arg1, arg7, arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class284 local25 = this.method6652(arg1);
		if (arg5 > 1 && local25.anIntArray464 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg5 >= local25.anIntArray463[local35] && local25.anIntArray463[local35] != 0) {
					local33 = local25.anIntArray464[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method6652(local33);
			}
		}
		@Pc(81) int[] local81 = local25.method7046(arg0, arg5, arg4, arg9, arg3, arg8, arg2, arg10, arg7);
		if (local81 == null) {
			return null;
		}
		@Pc(98) Class21 local98;
		if (arg6) {
			local98 = arg8.method6132(32, local81, 36, 36);
		} else {
			local98 = arg4.method6132(32, local81, 36, 36);
		}
		if (!arg6) {
			@Pc(120) Class174 local120 = new Class174();
			local120.anInt5773 = arg9;
			local120.anInt5768 = arg2;
			local120.anInt5777 = arg4.anInt7420;
			local120.anInt5772 = arg0;
			local120.aBoolean410 = arg7 != null;
			local120.anInt5770 = arg1;
			local120.anInt5771 = arg5;
			this.aClass115_1.method3367(local120, local98);
		}
		return local98;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIILclient!ha;ILclient!uba;II)Lclient!hu;")
	public Class21 method6645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class337 arg5, @OriginalArg(7) int arg6) {
		this.aClass174_1.anInt5777 = arg3.anInt7420;
		this.aClass174_1.anInt5771 = arg2;
		this.aClass174_1.anInt5770 = arg4;
		this.aClass174_1.anInt5773 = arg0;
		this.aClass174_1.aBoolean410 = arg5 != null;
		this.aClass174_1.anInt5772 = arg6;
		this.aClass174_1.anInt5768 = arg1;
		return (Class21) this.aClass115_1.method3378(this.aClass174_1);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
	public void method6646() {
		@Pc(2) Class236 local2 = this.aClass236_74;
		synchronized (this.aClass236_74) {
			this.aClass236_74.method6253();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
	public void method6647() {
		@Pc(2) Class236 local2 = this.aClass236_73;
		synchronized (this.aClass236_73) {
			this.aClass236_73.method6253();
		}
		local2 = this.aClass236_74;
		synchronized (this.aClass236_74) {
			this.aClass236_74.method6253();
		}
		@Pc(42) Class115 local42 = this.aClass115_1;
		synchronized (this.aClass115_1) {
			this.aClass115_1.method3370();
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)V")
	public void method6648() {
		@Pc(2) Class236 local2 = this.aClass236_73;
		synchronized (this.aClass236_73) {
			this.aClass236_73.method6243(5);
		}
		local2 = this.aClass236_74;
		synchronized (this.aClass236_74) {
			this.aClass236_74.method6243(5);
		}
		@Pc(44) Class115 local44 = this.aClass115_1;
		synchronized (this.aClass115_1) {
			this.aClass115_1.method3373();
		}
	}

	@OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
	public void method6649() {
		@Pc(2) Class115 local2 = this.aClass115_1;
		synchronized (this.aClass115_1) {
			this.aClass115_1.method3370();
		}
	}

	@OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)V")
	public void method6650() {
		@Pc(10) Class236 local10 = this.aClass236_73;
		synchronized (this.aClass236_73) {
			this.aClass236_73.method6245();
		}
		local10 = this.aClass236_74;
		synchronized (this.aClass236_74) {
			this.aClass236_74.method6245();
		}
		@Pc(40) Class115 local40 = this.aClass115_1;
		synchronized (this.aClass115_1) {
			this.aClass115_1.method3372();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
	public void method6651(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean578) {
			this.aBoolean578 = arg0;
			this.method6647();
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)Lclient!rba;")
	public Class284 method6652(@OriginalArg(1) int arg0) {
		@Pc(8) Class236 local8 = this.aClass236_73;
		@Pc(20) Class284 local20;
		synchronized (this.aClass236_73) {
			local20 = (Class284) this.aClass236_73.method6242((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(33) Class237 local33 = this.aClass237_111;
		@Pc(48) byte[] local48;
		synchronized (this.aClass237_111) {
			local48 = this.aClass237_111.method6314(Static286.method4817(arg0), Static627.method8458(arg0));
		}
		local20 = new Class284();
		local20.aClass258_16 = this;
		local20.anInt8520 = arg0;
		local20.aStringArray26 = new String[] { null, null, Static121.aClass84_7.method2710(this.anInt8013), null, null };
		local20.aStringArray25 = new String[] { null, null, null, null, Static121.aClass84_8.method2710(this.anInt8013) };
		if (local48 != null) {
			local20.method7049(new Class8_Sub8(local48));
		}
		local20.method7052();
		if (local20.anInt8566 != -1) {
			local20.method7043(this.method6652(local20.anInt8563), this.method6652(local20.anInt8566));
		}
		if (local20.anInt8555 != -1) {
			local20.method7059(this.method6652(local20.anInt8555), this.method6652(local20.anInt8519));
		}
		if (!this.aBoolean578 && local20.aBoolean604) {
			local20.aString88 = Static121.aClass84_5.method2710(this.anInt8013);
			local20.aBoolean605 = false;
			local20.aStringArray25 = this.aStringArray21;
			local20.anInt8577 = 0;
			local20.anIntArray462 = null;
			local20.aStringArray26 = this.aStringArray20;
			if (local20.aClass253_31 != null) {
				@Pc(211) boolean local211 = false;
				for (@Pc(216) Class8 local216 = local20.aClass253_31.method6593(); local216 != null; local216 = local20.aClass253_31.method6595()) {
					@Pc(226) Class82 local226 = this.aClass274_2.method6933((int) local216.aLong285);
					if (local226.aBoolean230) {
						local216.method8640();
					} else {
						local211 = true;
					}
				}
				if (!local211) {
					local20.aClass253_31 = null;
				}
			}
		}
		@Pc(253) Class236 local253 = this.aClass236_73;
		synchronized (this.aClass236_73) {
			this.aClass236_73.method6241((long) arg0, local20);
			return local20;
		}
	}
}
