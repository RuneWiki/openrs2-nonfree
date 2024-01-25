import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ro")
public final class Class206 {

	@OriginalMember(owner = "client!ro", name = "C", descriptor = "I")
	public int anInt5993;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "Lclient!fa;")
	private final Class68 aClass68_40 = new Class68(64);

	@OriginalMember(owner = "client!ro", name = "w", descriptor = "Lclient!fa;")
	public final Class68 aClass68_41 = new Class68(50);

	@OriginalMember(owner = "client!ro", name = "x", descriptor = "Lclient!sq;")
	public final Class220 aClass220_1 = new Class220(250);

	@OriginalMember(owner = "client!ro", name = "y", descriptor = "Lclient!mt;")
	private final Class154 aClass154_1 = new Class154();

	@OriginalMember(owner = "client!ro", name = "A", descriptor = "Lclient!ph;")
	private final Class180 aClass180_2;

	@OriginalMember(owner = "client!ro", name = "n", descriptor = "Lclient!fs;")
	public final Class76 aClass76_77;

	@OriginalMember(owner = "client!ro", name = "r", descriptor = "Lclient!fs;")
	private final Class76 aClass76_78;

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "Z")
	private boolean aBoolean555;

	@OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
	public final int anInt5988;

	@OriginalMember(owner = "client!ro", name = "m", descriptor = "I")
	public final int anInt5987;

	@OriginalMember(owner = "client!ro", name = "D", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray31;

	@OriginalMember(owner = "client!ro", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray30;

	@OriginalMember(owner = "client!ro", name = "<init>", descriptor = "(Lclient!jk;IZLclient!ph;Lclient!fs;Lclient!fs;)V")
	public Class206(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class180 arg3, @OriginalArg(4) Class76 arg4, @OriginalArg(5) Class76 arg5) {
		this.aClass180_2 = arg3;
		this.aClass76_77 = arg5;
		this.aClass76_78 = arg4;
		this.aBoolean555 = arg2;
		this.anInt5988 = arg1;
		if (this.aClass76_78 == null) {
			this.anInt5987 = 0;
		} else {
			@Pc(49) int local49 = this.aClass76_78.method2100() - 1;
			this.anInt5987 = this.aClass76_78.method2108(local49) + local49 * 256;
		}
		this.aStringArray31 = new String[] { null, null, Static147.aClass83_57.method2267(this.anInt5988), null, null };
		this.aStringArray30 = new String[] { null, null, null, null, Static374.aClass83_128.method2267(this.anInt5988) };
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZLclient!cj;Lclient!la;IILclient!ya;ZIIIZLclient!ya;)Lclient!l;")
	public Class57 method4699(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class37 arg1, @OriginalArg(2) Class46 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class19 arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) Class19 arg10) {
		@Pc(16) Class57 local16 = this.method4700(arg10, arg3, arg1, arg4, arg7, arg9, arg8);
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class211 local30 = this.method4703(arg3);
		if (arg7 > 1 && local30.anIntArray436 != null) {
			@Pc(38) int local38 = -1;
			for (@Pc(40) int local40 = 0; local40 < 10; local40++) {
				if (local30.anIntArray437[local40] <= arg7 && local30.anIntArray437[local40] != 0) {
					local38 = local30.anIntArray436[local40];
				}
			}
			if (local38 != -1) {
				local30 = this.method4703(local38);
			}
		}
		@Pc(92) int[] local92 = local30.method4774(arg1, arg0, arg2, arg7, arg9, arg4, arg10, arg8, arg5);
		if (local92 == null) {
			return null;
		}
		@Pc(106) Class57 local106;
		if (arg6) {
			local106 = arg5.method4265(local92, 36, 36, 32);
		} else {
			local106 = arg10.method4265(local92, 36, 36, 32);
		}
		if (!arg6) {
			@Pc(122) Class154 local122 = new Class154();
			local122.aBoolean438 = arg1 != null;
			local122.anInt4761 = arg9;
			local122.anInt4759 = arg3;
			local122.anInt4769 = arg4;
			local122.anInt4758 = arg7;
			local122.anInt4762 = arg10.anInt5532;
			local122.anInt4765 = arg8;
			this.aClass220_1.method4953(local106, local122);
		}
		return local106;
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!ya;IILclient!cj;IIII)Lclient!l;")
	public Class57 method4700(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class37 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass154_1.anInt4765 = arg6;
		this.aClass154_1.anInt4762 = arg0.anInt5532;
		this.aClass154_1.anInt4769 = arg3;
		this.aClass154_1.anInt4761 = arg5;
		this.aClass154_1.aBoolean438 = arg2 != null;
		this.aClass154_1.anInt4759 = arg1;
		this.aClass154_1.anInt4758 = arg4;
		return (Class57) this.aClass220_1.method4946(this.aClass154_1);
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V")
	public void method4701() {
		@Pc(6) Class220 local6 = this.aClass220_1;
		synchronized (this.aClass220_1) {
			this.aClass220_1.method4951();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
	public void method4702() {
		@Pc(12) Class68 local12 = this.aClass68_40;
		synchronized (this.aClass68_40) {
			this.aClass68_40.method1791();
		}
		local12 = this.aClass68_41;
		synchronized (this.aClass68_41) {
			this.aClass68_41.method1791();
		}
		@Pc(44) Class220 local44 = this.aClass220_1;
		synchronized (this.aClass220_1) {
			this.aClass220_1.method4952();
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(II)Lclient!rv;")
	public Class211 method4703(@OriginalArg(1) int arg0) {
		@Pc(8) Class68 local8 = this.aClass68_40;
		@Pc(18) Class211 local18;
		synchronized (this.aClass68_40) {
			local18 = (Class211) this.aClass68_40.method1787((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(41) byte[] local41 = this.aClass76_78.method2104(Static24.method4082(arg0), Static379.method5009(arg0));
		local18 = new Class211();
		local18.anInt6171 = arg0;
		local18.aClass206_1 = this;
		local18.aStringArray34 = new String[] { null, null, Static147.aClass83_57.method2267(this.anInt5988), null, null };
		local18.aStringArray33 = new String[] { null, null, null, null, Static374.aClass83_128.method2267(this.anInt5988) };
		if (local41 != null) {
			local18.method4790(new Class4_Sub12(local41));
		}
		local18.method4791();
		if (local18.anInt6175 != -1) {
			local18.method4787(this.method4703(local18.anInt6162), this.method4703(local18.anInt6175));
		}
		if (local18.anInt6185 != -1) {
			local18.method4779(this.method4703(local18.anInt6138), this.method4703(local18.anInt6185));
		}
		if (!this.aBoolean555 && local18.aBoolean565) {
			local18.aString61 = Static397.aClass83_21.method2267(this.anInt5988);
			local18.anInt6181 = 0;
			local18.aStringArray34 = this.aStringArray31;
			local18.anIntArray435 = null;
			local18.aBoolean564 = false;
			local18.aStringArray33 = this.aStringArray30;
			if (local18.aClass102_36 != null) {
				@Pc(200) boolean local200 = false;
				for (@Pc(205) Class4 local205 = local18.aClass102_36.method2705(); local205 != null; local205 = local18.aClass102_36.method2704()) {
					@Pc(215) Class133 local215 = this.aClass180_2.method4121((int) local205.aLong224);
					if (local215.aBoolean385) {
						local205.method5684();
					} else {
						local200 = true;
					}
				}
				if (!local200) {
					local18.aClass102_36 = null;
				}
			}
		}
		@Pc(240) Class68 local240 = this.aClass68_40;
		synchronized (this.aClass68_40) {
			this.aClass68_40.method1779((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZZ)V")
	public void method4704(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean555) {
			this.aBoolean555 = arg0;
			this.method4707();
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(II)V")
	public void method4706() {
		@Pc(2) Class68 local2 = this.aClass68_40;
		synchronized (this.aClass68_40) {
			this.aClass68_40.method1788(5);
		}
		local2 = this.aClass68_41;
		synchronized (this.aClass68_41) {
			this.aClass68_41.method1788(5);
		}
		@Pc(38) Class220 local38 = this.aClass220_1;
		synchronized (this.aClass220_1) {
			this.aClass220_1.method4950();
		}
	}

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "(B)V")
	public void method4707() {
		@Pc(2) Class68 local2 = this.aClass68_40;
		synchronized (this.aClass68_40) {
			this.aClass68_40.method1777();
		}
		local2 = this.aClass68_41;
		synchronized (this.aClass68_41) {
			this.aClass68_41.method1777();
		}
		@Pc(42) Class220 local42 = this.aClass220_1;
		synchronized (this.aClass220_1) {
			this.aClass220_1.method4951();
		}
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(B)V")
	public void method4710() {
		@Pc(2) Class68 local2 = this.aClass68_41;
		synchronized (this.aClass68_41) {
			this.aClass68_41.method1777();
		}
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(II)V")
	public void method4712(@OriginalArg(0) int arg0) {
		this.anInt5993 = arg0;
		@Pc(13) Class68 local13 = this.aClass68_41;
		synchronized (this.aClass68_41) {
			this.aClass68_41.method1777();
		}
	}
}
