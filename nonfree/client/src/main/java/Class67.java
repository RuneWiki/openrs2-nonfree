import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class67 {

	@OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
	public int anInt2181;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_8 = new Class288(64);

	@OriginalMember(owner = "client!dn", name = "s", descriptor = "Lclient!uaa;")
	public final Class288 aClass288_9 = new Class288(50);

	@OriginalMember(owner = "client!dn", name = "t", descriptor = "Lclient!op;")
	public final Class225 aClass225_1 = new Class225(250);

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "Lclient!ln;")
	private final Class189 aClass189_1 = new Class189();

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "Lclient!gp;")
	public final Class117 aClass117_51;

	@OriginalMember(owner = "client!dn", name = "c", descriptor = "Z")
	private boolean aBoolean140;

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "Lclient!gp;")
	private final Class117 aClass117_50;

	@OriginalMember(owner = "client!dn", name = "w", descriptor = "Lclient!vb;")
	private final Class298 aClass298_4;

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	public final int anInt2171;

	@OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
	public final int anInt2179;

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray16;

	@OriginalMember(owner = "client!dn", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray15;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Lclient!jc;IZLclient!vb;Lclient!gp;Lclient!gp;)V")
	public Class67(@OriginalArg(0) Class155 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class298 arg3, @OriginalArg(4) Class117 arg4, @OriginalArg(5) Class117 arg5) {
		this.aClass117_51 = arg5;
		this.aBoolean140 = arg2;
		this.aClass117_50 = arg4;
		this.aClass298_4 = arg3;
		this.anInt2171 = arg1;
		if (this.aClass117_50 == null) {
			this.anInt2179 = 0;
		} else {
			@Pc(49) int local49 = this.aClass117_50.method2972() - 1;
			this.anInt2179 = local49 * 256 + this.aClass117_50.method2951(local49);
		}
		this.aStringArray16 = new String[] { null, null, Static204.aClass40_61.method1063(this.anInt2171), null, null };
		this.aStringArray15 = new String[] { null, null, null, null, Static536.aClass40_153.method1063(this.anInt2171) };
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V")
	public void method2004() {
		@Pc(20) Class288 local20 = this.aClass288_9;
		synchronized (this.aClass288_9) {
			this.aClass288_9.method6744();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
	public void method2005() {
		@Pc(12) Class288 local12 = this.aClass288_8;
		synchronized (this.aClass288_8) {
			this.aClass288_8.method6735(5);
		}
		local12 = this.aClass288_9;
		synchronized (this.aClass288_9) {
			this.aClass288_9.method6735(5);
		}
		@Pc(44) Class225 local44 = this.aClass225_1;
		synchronized (this.aClass225_1) {
			this.aClass225_1.method5538();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)Lclient!bb;")
	public Class22 method2006(@OriginalArg(1) int arg0) {
		@Pc(16) Class288 local16 = this.aClass288_8;
		@Pc(26) Class22 local26;
		synchronized (this.aClass288_8) {
			local26 = (Class22) this.aClass288_8.method6745((long) arg0);
		}
		if (local26 != null) {
			return local26;
		}
		@Pc(39) Class117 local39 = this.aClass117_50;
		@Pc(52) byte[] local52;
		synchronized (this.aClass117_50) {
			local52 = this.aClass117_50.method2962(Static156.method2836(arg0), Static512.method6837(arg0));
		}
		local26 = new Class22();
		local26.anInt567 = arg0;
		local26.aClass67_1 = this;
		local26.aStringArray8 = new String[] { null, null, Static204.aClass40_61.method1063(this.anInt2171), null, null };
		local26.aStringArray9 = new String[] { null, null, null, null, Static536.aClass40_153.method1063(this.anInt2171) };
		if (local52 != null) {
			local26.method687(new Class5_Sub3(local52));
		}
		local26.method679();
		if (local26.anInt538 != -1) {
			local26.method690(this.method2006(local26.anInt565), this.method2006(local26.anInt538));
		}
		if (local26.anInt564 != -1) {
			local26.method684(this.method2006(local26.anInt564), this.method2006(local26.anInt543));
		}
		if (!this.aBoolean140 && local26.aBoolean19) {
			local26.aString15 = Static426.aClass40_123.method1063(this.anInt2171);
			local26.aStringArray9 = this.aStringArray15;
			local26.aBoolean18 = false;
			local26.aStringArray8 = this.aStringArray16;
			local26.anInt584 = 0;
			local26.anIntArray35 = null;
			if (local26.aClass42_2 != null) {
				@Pc(205) boolean local205 = false;
				for (@Pc(210) Class5 local210 = local26.aClass42_2.method1103(); local210 != null; local210 = local26.aClass42_2.method1105()) {
					@Pc(220) Class135 local220 = this.aClass298_4.method6969((int) local210.aLong253);
					if (local220.aBoolean226) {
						local210.method7425();
					} else {
						local205 = true;
					}
				}
				if (!local205) {
					local26.aClass42_2 = null;
				}
			}
		}
		@Pc(245) Class288 local245 = this.aClass288_8;
		synchronized (this.aClass288_8) {
			this.aClass288_8.method6746(local26, (long) arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILclient!qn;IBILclient!qa;IZLclient!ra;IZLclient!qa;)Lclient!ha;")
	public Class25 method2007(@OriginalArg(0) int arg0, @OriginalArg(1) Class248 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class62 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class13 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class62 arg10) {
		@Pc(16) Class25 local16 = this.method2011(arg0, arg3, arg4, arg2, arg5, arg1, arg8);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class22 local25 = this.method2006(arg8);
		if (arg0 > 1 && local25.anIntArray34 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (local25.anIntArray33[local37] <= arg0 && local25.anIntArray33[local37] != 0) {
					local35 = local25.anIntArray34[local37];
				}
			}
			if (local35 != -1) {
				local25 = this.method2006(local35);
			}
		}
		@Pc(86) int[] local86 = local25.method676(arg1, arg2, arg5, arg7, arg10, arg3, arg0, arg4, arg6);
		if (local86 == null) {
			return null;
		}
		@Pc(100) Class25 local100;
		if (arg9) {
			local100 = arg10.method7021(local86, 36, 36, 32);
		} else {
			local100 = arg4.method7021(local86, 36, 36, 32);
		}
		if (!arg9) {
			@Pc(116) Class189 local116 = new Class189();
			local116.anInt5841 = arg3;
			local116.anInt5835 = arg2;
			local116.anInt5842 = arg0;
			local116.aBoolean406 = arg1 != null;
			local116.anInt5839 = arg5;
			local116.anInt5836 = arg4.anInt8664;
			local116.anInt5843 = arg8;
			this.aClass225_1.method5536(local116, local100);
		}
		return local100;
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
	public void method2008() {
		@Pc(2) Class225 local2 = this.aClass225_1;
		synchronized (this.aClass225_1) {
			this.aClass225_1.method5542();
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V")
	public void method2009() {
		@Pc(2) Class288 local2 = this.aClass288_8;
		synchronized (this.aClass288_8) {
			this.aClass288_8.method6742();
		}
		local2 = this.aClass288_9;
		synchronized (this.aClass288_9) {
			this.aClass288_9.method6742();
		}
		@Pc(42) Class225 local42 = this.aClass225_1;
		synchronized (this.aClass225_1) {
			this.aClass225_1.method5540();
		}
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)V")
	public void method2010() {
		@Pc(2) Class288 local2 = this.aClass288_8;
		synchronized (this.aClass288_8) {
			this.aClass288_8.method6744();
		}
		local2 = this.aClass288_9;
		synchronized (this.aClass288_9) {
			this.aClass288_9.method6744();
		}
		@Pc(56) Class225 local56 = this.aClass225_1;
		synchronized (this.aClass225_1) {
			this.aClass225_1.method5542();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BIILclient!qa;IILclient!qn;I)Lclient!ha;")
	public Class25 method2011(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class248 arg5, @OriginalArg(7) int arg6) {
		this.aClass189_1.aBoolean406 = arg5 != null;
		this.aClass189_1.anInt5843 = arg6;
		this.aClass189_1.anInt5841 = arg1;
		this.aClass189_1.anInt5836 = arg2.anInt8664;
		this.aClass189_1.anInt5842 = arg0;
		this.aClass189_1.anInt5839 = arg4;
		this.aClass189_1.anInt5835 = arg3;
		return (Class25) this.aClass225_1.method5545(this.aClass189_1);
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)V")
	public void method2012(@OriginalArg(0) int arg0) {
		this.anInt2181 = arg0;
		@Pc(9) Class288 local9 = this.aClass288_9;
		synchronized (this.aClass288_9) {
			this.aClass288_9.method6744();
		}
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(BZ)V")
	public void method2013(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean140 != arg0) {
			this.aBoolean140 = arg0;
			this.method2010();
		}
	}
}
