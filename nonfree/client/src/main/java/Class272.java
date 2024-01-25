import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class272 {

	@OriginalMember(owner = "client!ws", name = "A", descriptor = "I")
	public int anInt7774;

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "Lclient!wi;")
	private final Class268 aClass268_62 = new Class268(64);

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "Lclient!wi;")
	public final Class268 aClass268_63 = new Class268(50);

	@OriginalMember(owner = "client!ws", name = "w", descriptor = "Lclient!vj;")
	public final Class257 aClass257_1 = new Class257(250);

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "Lclient!ev;")
	private final Class66 aClass66_1 = new Class66();

	@OriginalMember(owner = "client!ws", name = "f", descriptor = "Lclient!uu;")
	public final Class250 aClass250_104;

	@OriginalMember(owner = "client!ws", name = "r", descriptor = "Z")
	private boolean aBoolean517;

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "Lclient!au;")
	private final Class15 aClass15_2;

	@OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
	public final int anInt7763;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "Lclient!uu;")
	private final Class250 aClass250_105;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
	public final int anInt7762;

	@OriginalMember(owner = "client!ws", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray47;

	@OriginalMember(owner = "client!ws", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray48;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!iv;IZLclient!au;Lclient!uu;Lclient!uu;)V")
	public Class272(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class15 arg3, @OriginalArg(4) Class250 arg4, @OriginalArg(5) Class250 arg5) {
		this.aClass250_104 = arg5;
		this.aBoolean517 = arg2;
		this.aClass15_2 = arg3;
		this.anInt7763 = arg1;
		this.aClass250_105 = arg4;
		if (this.aClass250_105 == null) {
			this.anInt7762 = 0;
		} else {
			@Pc(54) int local54 = this.aClass250_105.method5819() - 1;
			this.anInt7762 = this.aClass250_105.method5815(local54) + local54 * 256;
		}
		this.aStringArray47 = new String[] { null, null, Static290.aClass174_141.method4208(this.anInt7763), null, null };
		this.aStringArray48 = new String[] { null, null, null, null, Static218.aClass174_210.method4208(this.anInt7763) };
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)V")
	public void method6271() {
		@Pc(2) Class268 local2 = this.aClass268_62;
		synchronized (this.aClass268_62) {
			this.aClass268_62.method6173(5);
		}
		local2 = this.aClass268_63;
		synchronized (this.aClass268_63) {
			this.aClass268_63.method6173(5);
		}
		@Pc(40) Class257 local40 = this.aClass257_1;
		synchronized (this.aClass257_1) {
			this.aClass257_1.method5881();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!qa;ILclient!ba;IILclient!qi;Lclient!qa;IIZZI)Lclient!aa;")
	public Class2 method6272(@OriginalArg(0) Class167 arg0, @OriginalArg(2) Class18 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class198 arg4, @OriginalArg(6) Class167 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class2 local16 = this.method6278(arg6, arg4, arg3, arg2, arg0, arg7, arg10);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class209 local25 = this.method6283(arg3);
		if (arg6 > 1 && local25.anIntArray367 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg6 >= local25.anIntArray366[local35] && local25.anIntArray366[local35] != 0) {
					local33 = local25.anIntArray367[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method6283(local33);
			}
		}
		@Pc(85) int[] local85 = local25.method4984(arg0, arg8, arg10, arg2, arg6, arg1, arg4, arg5, arg7);
		if (local85 == null) {
			return null;
		}
		@Pc(99) Class2 local99;
		if (arg9) {
			local99 = arg5.method6021(local85, 36, 36, 32);
		} else {
			local99 = arg0.method6021(local85, 36, 36, 32);
		}
		if (!arg9) {
			@Pc(115) Class66 local115 = new Class66();
			local115.anInt1843 = arg7;
			local115.anInt1842 = arg2;
			local115.aBoolean113 = arg4 != null;
			local115.anInt1844 = arg3;
			local115.anInt1836 = arg6;
			local115.anInt1837 = arg0.anInt7365;
			local115.anInt1838 = arg10;
			this.aClass257_1.method5880(local99, local115);
		}
		return local99;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	public void method6273() {
		@Pc(2) Class268 local2 = this.aClass268_63;
		synchronized (this.aClass268_63) {
			this.aClass268_63.method6160();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZZ)V")
	public void method6275(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean517) {
			this.aBoolean517 = arg0;
			this.method6282();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IILclient!qi;IILclient!qa;II)Lclient!aa;")
	public Class2 method6278(@OriginalArg(0) int arg0, @OriginalArg(2) Class198 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass66_1.anInt1838 = arg6;
		this.aClass66_1.anInt1836 = arg0;
		this.aClass66_1.anInt1844 = arg2;
		this.aClass66_1.anInt1837 = arg4.anInt7365;
		this.aClass66_1.anInt1843 = arg5;
		this.aClass66_1.anInt1842 = arg3;
		this.aClass66_1.aBoolean113 = arg1 != null;
		return (Class2) this.aClass257_1.method5884(this.aClass66_1);
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
	public void method6279() {
		@Pc(2) Class268 local2 = this.aClass268_62;
		synchronized (this.aClass268_62) {
			this.aClass268_62.method6168();
		}
		local2 = this.aClass268_63;
		synchronized (this.aClass268_63) {
			this.aClass268_63.method6168();
		}
		@Pc(41) Class257 local41 = this.aClass257_1;
		synchronized (this.aClass257_1) {
			this.aClass257_1.method5878();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IB)V")
	public void method6280(@OriginalArg(0) int arg0) {
		this.anInt7774 = arg0;
		@Pc(9) Class268 local9 = this.aClass268_63;
		synchronized (this.aClass268_63) {
			this.aClass268_63.method6160();
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
	public void method6281() {
		@Pc(10) Class257 local10 = this.aClass257_1;
		synchronized (this.aClass257_1) {
			this.aClass257_1.method5886();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
	public void method6282() {
		@Pc(6) Class268 local6 = this.aClass268_62;
		synchronized (this.aClass268_62) {
			this.aClass268_62.method6160();
		}
		local6 = this.aClass268_63;
		synchronized (this.aClass268_63) {
			this.aClass268_63.method6160();
		}
		@Pc(42) Class257 local42 = this.aClass257_1;
		synchronized (this.aClass257_1) {
			this.aClass257_1.method5886();
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)Lclient!ri;")
	public Class209 method6283(@OriginalArg(1) int arg0) {
		@Pc(8) Class268 local8 = this.aClass268_62;
		@Pc(18) Class209 local18;
		synchronized (this.aClass268_62) {
			local18 = (Class209) this.aClass268_62.method6166((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(36) Class250 local36 = this.aClass250_105;
		@Pc(49) byte[] local49;
		synchronized (this.aClass250_105) {
			local49 = this.aClass250_105.method5806(Static257.method3589(arg0), Static189.method2959(arg0));
		}
		local18 = new Class209();
		local18.anInt6012 = arg0;
		local18.aClass272_2 = this;
		local18.aStringArray36 = new String[] { null, null, Static290.aClass174_141.method4208(this.anInt7763), null, null };
		local18.aStringArray37 = new String[] { null, null, null, null, Static218.aClass174_210.method4208(this.anInt7763) };
		if (local49 != null) {
			local18.method4979(new Class3_Sub25(local49));
		}
		local18.method4969();
		if (local18.anInt6066 != -1) {
			local18.method4986(this.method6283(local18.anInt6034), this.method6283(local18.anInt6066));
		}
		if (local18.anInt6015 != -1) {
			local18.method4983(this.method6283(local18.anInt6029), this.method6283(local18.anInt6015));
		}
		if (!this.aBoolean517 && local18.aBoolean419) {
			local18.lb = Static277.aClass174_136.method4208(this.anInt7763);
			local18.aBoolean418 = false;
			local18.aStringArray37 = this.aStringArray48;
			local18.anInt6028 = 0;
			local18.anIntArray365 = null;
			local18.aStringArray36 = this.aStringArray47;
			if (local18.aClass140_33 != null) {
				@Pc(203) boolean local203 = false;
				for (@Pc(208) Class3 local208 = local18.aClass140_33.method3486(); local208 != null; local208 = local18.aClass140_33.method3485()) {
					@Pc(220) Class32 local220 = this.aClass15_2.method323((int) local208.aLong248);
					if (local220.aBoolean56) {
						local208.method6288();
					} else {
						local203 = true;
					}
				}
				if (!local203) {
					local18.aClass140_33 = null;
				}
			}
		}
		@Pc(245) Class268 local245 = this.aClass268_62;
		synchronized (this.aClass268_62) {
			this.aClass268_62.method6164(local18, (long) arg0);
			return local18;
		}
	}
}
