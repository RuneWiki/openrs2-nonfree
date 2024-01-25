import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class231 {

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
	public int anInt6781;

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "Lclient!dc;")
	private final Class44 aClass44_50 = new Class44(64);

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "Lclient!dc;")
	public final Class44 aClass44_51 = new Class44(50);

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "Lclient!ve;")
	public final Class251 aClass251_1 = new Class251(250);

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "Lclient!j;")
	private final Class125 aClass125_1 = new Class125();

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "Lclient!oj;")
	private final Class181 aClass181_2;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "Lclient!he;")
	private final Class100 aClass100_79;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "Z")
	private boolean aBoolean432;

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
	public final int anInt6774;

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "Lclient!he;")
	public final Class100 aClass100_80;

	@OriginalMember(owner = "client!tf", name = "u", descriptor = "I")
	public final int anInt6780;

	@OriginalMember(owner = "client!tf", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray40;

	@OriginalMember(owner = "client!tf", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray41;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!ci;IZLclient!oj;Lclient!he;Lclient!he;)V")
	public Class231(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class181 arg3, @OriginalArg(4) Class100 arg4, @OriginalArg(5) Class100 arg5) {
		this.aClass181_2 = arg3;
		this.aClass100_79 = arg4;
		this.aBoolean432 = arg2;
		this.anInt6774 = arg1;
		this.aClass100_80 = arg5;
		if (this.aClass100_79 == null) {
			this.anInt6780 = 0;
		} else {
			@Pc(54) int local54 = this.aClass100_79.method2516() - 1;
			this.anInt6780 = this.aClass100_79.method2523(local54) + local54 * 256;
		}
		this.aStringArray40 = new String[] { null, null, Static438.aClass267_107.method6581(this.anInt6774), null, null };
		this.aStringArray41 = new String[] { null, null, null, null, Static53.aClass267_18.method6581(this.anInt6774) };
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
	public void method5637() {
		@Pc(11) Class44 local11 = this.aClass44_51;
		synchronized (this.aClass44_51) {
			this.aClass44_51.method1351();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILclient!wb;Lclient!eq;III)Lclient!qg;")
	public Class87 method5638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class259 arg2, @OriginalArg(4) Class66 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass125_1.anInt3572 = arg0;
		this.aClass125_1.anInt3580 = arg5;
		this.aClass125_1.anInt3573 = arg1;
		this.aClass125_1.anInt3569 = arg3.anInt5948;
		this.aClass125_1.anInt3568 = arg6;
		this.aClass125_1.aBoolean231 = arg2 != null;
		this.aClass125_1.anInt3577 = arg4;
		return (Class87) this.aClass251_1.method6117(this.aClass125_1);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V")
	public void method5639(@OriginalArg(1) int arg0) {
		this.anInt6781 = arg0;
		@Pc(13) Class44 local13 = this.aClass44_51;
		synchronized (this.aClass44_51) {
			this.aClass44_51.method1351();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BZ)V")
	public void method5640(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean432) {
			this.aBoolean432 = arg0;
			this.method5642();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!eq;IZLclient!wb;IZILclient!hr;IILclient!eq;)Lclient!qg;")
	public Class87 method5641(@OriginalArg(0) int arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class259 arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class29 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class66 arg10) {
		@Pc(16) Class87 local16 = this.method5638(arg2, arg8, arg4, arg1, arg9, arg6, arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class4 local25 = this.method5648(arg9);
		if (arg8 > 1 && local25.anIntArray7 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg8 >= local25.anIntArray6[local35] && local25.anIntArray6[local35] != 0) {
					local33 = local25.anIntArray7[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method5648(local33);
			}
		}
		@Pc(86) int[] local86 = local25.method68(arg1, arg4, arg7, arg6, arg0, arg5, arg8, arg10, arg2);
		if (local86 == null) {
			return null;
		}
		@Pc(100) Class87 local100;
		if (arg3) {
			local100 = arg10.method5018(local86, 36, 36, 32);
		} else {
			local100 = arg1.method5018(local86, 36, 36, 32);
		}
		if (!arg3) {
			@Pc(134) Class125 local134 = new Class125();
			local134.anInt3580 = arg6;
			local134.anInt3577 = arg9;
			local134.anInt3573 = arg8;
			local134.anInt3568 = arg0;
			local134.anInt3569 = arg1.anInt5948;
			local134.anInt3572 = arg2;
			local134.aBoolean231 = arg4 != null;
			this.aClass251_1.method6124(local134, local100);
		}
		return local100;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public void method5642() {
		@Pc(12) Class44 local12 = this.aClass44_50;
		synchronized (this.aClass44_50) {
			this.aClass44_50.method1351();
		}
		local12 = this.aClass44_51;
		synchronized (this.aClass44_51) {
			this.aClass44_51.method1351();
		}
		@Pc(42) Class251 local42 = this.aClass251_1;
		synchronized (this.aClass251_1) {
			this.aClass251_1.method6118();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)V")
	public void method5643() {
		@Pc(2) Class44 local2 = this.aClass44_50;
		synchronized (this.aClass44_50) {
			this.aClass44_50.method1352(5);
		}
		local2 = this.aClass44_51;
		synchronized (this.aClass44_51) {
			this.aClass44_51.method1352(5);
		}
		@Pc(38) Class251 local38 = this.aClass251_1;
		synchronized (this.aClass251_1) {
			this.aClass251_1.method6121();
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public void method5644() {
		@Pc(6) Class251 local6 = this.aClass251_1;
		synchronized (this.aClass251_1) {
			this.aClass251_1.method6118();
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V")
	public void method5647() {
		@Pc(6) Class44 local6 = this.aClass44_50;
		synchronized (this.aClass44_50) {
			this.aClass44_50.method1348();
		}
		local6 = this.aClass44_51;
		synchronized (this.aClass44_51) {
			this.aClass44_51.method1348();
		}
		@Pc(36) Class251 local36 = this.aClass251_1;
		synchronized (this.aClass251_1) {
			this.aClass251_1.method6119();
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lclient!ac;")
	public Class4 method5648(@OriginalArg(0) int arg0) {
		@Pc(8) Class44 local8 = this.aClass44_50;
		@Pc(18) Class4 local18;
		synchronized (this.aClass44_50) {
			local18 = (Class4) this.aClass44_50.method1353((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass100_79.method2520(Static183.method3929(arg0), Static273.method4131(arg0));
		local18 = new Class4();
		local18.aClass231_1 = this;
		local18.anInt114 = arg0;
		local18.aStringArray1 = new String[] { null, null, Static438.aClass267_107.method6581(this.anInt6774), null, null };
		local18.aStringArray2 = new String[] { null, null, null, null, Static53.aClass267_18.method6581(this.anInt6774) };
		if (local39 != null) {
			local18.method75(new Class6_Sub1(local39));
		}
		local18.method71();
		if (local18.anInt130 != -1) {
			local18.method57(this.method5648(local18.anInt72), this.method5648(local18.anInt130));
		}
		if (local18.anInt112 != -1) {
			local18.method67(this.method5648(local18.anInt112), this.method5648(local18.anInt123));
		}
		if (!this.aBoolean432 && local18.aBoolean8) {
			local18.aString1 = Static46.aClass267_17.method6581(this.anInt6774);
			local18.aStringArray1 = this.aStringArray40;
			local18.anInt96 = 0;
			local18.anIntArray8 = null;
			local18.aBoolean9 = false;
			local18.aStringArray2 = this.aStringArray41;
			if (local18.aClass74_1 != null) {
				@Pc(186) boolean local186 = false;
				for (@Pc(191) Class6 local191 = local18.aClass74_1.method1889(); local191 != null; local191 = local18.aClass74_1.method1881()) {
					@Pc(201) Class171 local201 = this.aClass181_2.method4294((int) local191.aLong229);
					if (local201.aBoolean302) {
						local191.method6525();
					} else {
						local186 = true;
					}
				}
				if (!local186) {
					local18.aClass74_1 = null;
				}
			}
		}
		@Pc(226) Class44 local226 = this.aClass44_50;
		synchronized (this.aClass44_50) {
			this.aClass44_50.method1349(local18, (long) arg0);
			return local18;
		}
	}
}
