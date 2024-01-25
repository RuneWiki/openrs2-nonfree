import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class225 {

	@OriginalMember(owner = "client!mn", name = "A", descriptor = "I")
	public int anInt5621;

	@OriginalMember(owner = "client!mn", name = "h", descriptor = "Lclient!bh;")
	private final Class32 aClass32_58 = new Class32(64);

	@OriginalMember(owner = "client!mn", name = "v", descriptor = "Lclient!bh;")
	public final Class32 aClass32_59 = new Class32(50);

	@OriginalMember(owner = "client!mn", name = "w", descriptor = "Lclient!kca;")
	public final Class185 aClass185_1 = new Class185(250);

	@OriginalMember(owner = "client!mn", name = "x", descriptor = "Lclient!vba;")
	private final Class357 aClass357_1 = new Class357();

	@OriginalMember(owner = "client!mn", name = "z", descriptor = "Lclient!dda;")
	private final Class66 aClass66_2;

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Lclient!wu;")
	private final Class380 aClass380_86;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "Z")
	private boolean aBoolean407;

	@OriginalMember(owner = "client!mn", name = "i", descriptor = "Lclient!wu;")
	public final Class380 aClass380_87;

	@OriginalMember(owner = "client!mn", name = "p", descriptor = "I")
	public final int anInt5616;

	@OriginalMember(owner = "client!mn", name = "s", descriptor = "I")
	public final int anInt5618;

	@OriginalMember(owner = "client!mn", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray29;

	@OriginalMember(owner = "client!mn", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray28;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(Lclient!wj;IZLclient!dda;Lclient!wu;Lclient!wu;)V")
	public Class225(@OriginalArg(0) Class375 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class66 arg3, @OriginalArg(4) Class380 arg4, @OriginalArg(5) Class380 arg5) {
		this.aClass66_2 = arg3;
		this.aClass380_86 = arg4;
		this.aBoolean407 = arg2;
		this.aClass380_87 = arg5;
		this.anInt5616 = arg1;
		if (this.aClass380_86 == null) {
			this.anInt5618 = 0;
		} else {
			@Pc(49) int local49 = this.aClass380_86.method8639() - 1;
			this.anInt5618 = local49 * 256 + this.aClass380_86.method8631(local49);
		}
		this.aStringArray29 = new String[] { null, null, Static434.aClass271_7.method5972(this.anInt5616), null, null };
		this.aStringArray28 = new String[] { null, null, null, null, Static434.aClass271_8.method5972(this.anInt5616) };
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V")
	public void method4780() {
		@Pc(2) Class32 local2 = this.aClass32_58;
		synchronized (this.aClass32_58) {
			this.aClass32_58.method634(5);
		}
		local2 = this.aClass32_59;
		synchronized (this.aClass32_59) {
			this.aClass32_59.method634(5);
		}
		@Pc(38) Class185 local38 = this.aClass185_1;
		synchronized (this.aClass185_1) {
			this.aClass185_1.method3989();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IBIIIILclient!me;Lclient!ha;)Lclient!cw;")
	public Class61 method4781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class218 arg5, @OriginalArg(7) Class95 arg6) {
		this.aClass357_1.anInt9599 = arg1;
		this.aClass357_1.anInt9594 = arg3;
		this.aClass357_1.anInt9601 = arg4;
		this.aClass357_1.aBoolean702 = arg5 != null;
		this.aClass357_1.anInt9596 = arg2;
		this.aClass357_1.anInt9595 = arg6.anInt8154;
		this.aClass357_1.anInt9598 = arg0;
		return (Class61) this.aClass185_1.method3984(this.aClass357_1);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZIIILclient!me;ZLclient!da;Lclient!ha;ILclient!ha;IZ)Lclient!cw;")
	public Class61 method4782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class218 arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class62 arg5, @OriginalArg(7) Class95 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class95 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class61 local16 = this.method4781(arg9, arg7, arg2, arg0, arg1, arg3, arg6);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class34 local25 = this.method4789(arg1);
		if (arg9 > 1 && local25.anIntArray75 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (local25.anIntArray76[local37] <= arg9 && local25.anIntArray76[local37] != 0) {
					local35 = local25.anIntArray75[local37];
				}
			}
			if (local35 != -1) {
				local25 = this.method4789(local35);
			}
		}
		@Pc(83) int[] local83 = local25.method697(arg2, arg0, arg8, arg3, arg9, arg7, arg6, arg5, arg10);
		if (local83 == null) {
			return null;
		}
		@Pc(107) Class61 local107;
		if (arg4) {
			local107 = arg8.method6953(local83, 36, 36, 32);
		} else {
			local107 = arg6.method6953(local83, 36, 36, 32);
		}
		if (!arg4) {
			@Pc(124) Class357 local124 = new Class357();
			local124.anInt9599 = arg7;
			local124.anInt9596 = arg2;
			local124.anInt9594 = arg0;
			local124.anInt9598 = arg9;
			local124.anInt9595 = arg6.anInt8154;
			local124.anInt9601 = arg1;
			local124.aBoolean702 = arg3 != null;
			this.aClass185_1.method3988(local124, local107);
		}
		return local107;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
	public void method4783() {
		@Pc(2) Class185 local2 = this.aClass185_1;
		synchronized (this.aClass185_1) {
			this.aClass185_1.method3983();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public void method4785() {
		@Pc(6) Class32 local6 = this.aClass32_58;
		synchronized (this.aClass32_58) {
			this.aClass32_58.method640();
		}
		local6 = this.aClass32_59;
		synchronized (this.aClass32_59) {
			this.aClass32_59.method640();
		}
		@Pc(42) Class185 local42 = this.aClass185_1;
		synchronized (this.aClass185_1) {
			this.aClass185_1.method3983();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Z)V")
	public void method4786() {
		@Pc(2) Class32 local2 = this.aClass32_59;
		synchronized (this.aClass32_59) {
			this.aClass32_59.method640();
		}
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(II)V")
	public void method4787(@OriginalArg(1) int arg0) {
		this.anInt5621 = arg0;
		@Pc(9) Class32 local9 = this.aClass32_59;
		synchronized (this.aClass32_59) {
			this.aClass32_59.method640();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BZ)V")
	public void method4788(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean407 != arg0) {
			this.aBoolean407 = arg0;
			this.method4785();
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)Lclient!bj;")
	public Class34 method4789(@OriginalArg(0) int arg0) {
		@Pc(8) Class32 local8 = this.aClass32_58;
		@Pc(20) Class34 local20;
		synchronized (this.aClass32_58) {
			local20 = (Class34) this.aClass32_58.method630((long) arg0);
		}
		if (local20 != null) {
			return local20;
		}
		@Pc(33) Class380 local33 = this.aClass380_86;
		@Pc(46) byte[] local46;
		synchronized (this.aClass380_86) {
			local46 = this.aClass380_86.method8620(Static624.method8353(arg0), Static339.method4573(arg0));
		}
		local20 = new Class34();
		local20.aClass225_1 = this;
		local20.anInt869 = arg0;
		local20.aStringArray3 = new String[] { null, null, Static434.aClass271_7.method5972(this.anInt5616), null, null };
		local20.aStringArray4 = new String[] { null, null, null, null, Static434.aClass271_8.method5972(this.anInt5616) };
		if (local46 != null) {
			local20.method695(new Class2_Sub22(local46));
		}
		local20.method696();
		if (local20.anInt881 != -1) {
			local20.method699(this.method4789(local20.anInt899), this.method4789(local20.anInt881));
		}
		if (local20.anInt851 != -1) {
			local20.method698(this.method4789(local20.anInt845), this.method4789(local20.anInt851));
		}
		if (!this.aBoolean407 && local20.aBoolean67) {
			local20.aString11 = Static434.aClass271_5.method5972(this.anInt5616);
			local20.aBoolean66 = false;
			local20.anIntArray77 = null;
			local20.anInt874 = 0;
			local20.aStringArray4 = this.aStringArray28;
			local20.aStringArray3 = this.aStringArray29;
			if (local20.aClass118_7 != null) {
				@Pc(208) boolean local208 = false;
				for (@Pc(213) Class2 local213 = local20.aClass118_7.method2596(); local213 != null; local213 = local20.aClass118_7.method2597()) {
					@Pc(223) Class238 local223 = this.aClass66_2.method1439((int) local213.aLong280);
					if (local223.aBoolean440) {
						local213.method8653();
					} else {
						local208 = true;
					}
				}
				if (!local208) {
					local20.aClass118_7 = null;
				}
			}
		}
		@Pc(248) Class32 local248 = this.aClass32_58;
		synchronized (this.aClass32_58) {
			this.aClass32_58.method629(local20, (long) arg0);
			return local20;
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	public void method4791() {
		@Pc(12) Class32 local12 = this.aClass32_58;
		synchronized (this.aClass32_58) {
			this.aClass32_58.method632();
		}
		local12 = this.aClass32_59;
		synchronized (this.aClass32_59) {
			this.aClass32_59.method632();
		}
		@Pc(42) Class185 local42 = this.aClass185_1;
		synchronized (this.aClass185_1) {
			this.aClass185_1.method3986();
		}
	}
}
