import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class203 {

	@OriginalMember(owner = "client!ln", name = "A", descriptor = "I")
	public int anInt5739;

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "Lclient!pca;")
	private final Class245 aClass245_44 = new Class245(64);

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "Lclient!pca;")
	public final Class245 aClass245_45 = new Class245(50);

	@OriginalMember(owner = "client!ln", name = "w", descriptor = "Lclient!dq;")
	public final Class74 aClass74_1 = new Class74(250);

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "Lclient!ee;")
	private final Class83 aClass83_1 = new Class83();

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "Lclient!jo;")
	private final Class168 aClass168_71;

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Z")
	private boolean aBoolean437;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "Lclient!jo;")
	public final Class168 aClass168_70;

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "Lclient!gm;")
	private final Class118 aClass118_1;

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
	public final int anInt5726;

	@OriginalMember(owner = "client!ln", name = "u", descriptor = "I")
	public final int anInt5738;

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray35;

	@OriginalMember(owner = "client!ln", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray34;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!jda;IZLclient!gm;Lclient!jo;Lclient!jo;)V")
	public Class203(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class118 arg3, @OriginalArg(4) Class168 arg4, @OriginalArg(5) Class168 arg5) {
		this.aClass168_71 = arg4;
		this.aBoolean437 = arg2;
		this.aClass168_70 = arg5;
		this.aClass118_1 = arg3;
		this.anInt5726 = arg1;
		if (this.aClass168_71 == null) {
			this.anInt5738 = 0;
		} else {
			@Pc(49) int local49 = this.aClass168_71.method4456() - 1;
			this.anInt5738 = local49 * 256 + this.aClass168_71.method4443(local49);
		}
		this.aStringArray35 = new String[] { null, null, Static222.aClass152_6.method4002(this.anInt5726), null, null };
		this.aStringArray34 = new String[] { null, null, null, null, Static222.aClass152_7.method4002(this.anInt5726) };
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)Lclient!ia;")
	public Class145 method4899(@OriginalArg(0) int arg0) {
		@Pc(16) Class245 local16 = this.aClass245_44;
		@Pc(26) Class145 local26;
		synchronized (this.aClass245_44) {
			local26 = (Class145) this.aClass245_44.method6082((long) arg0);
		}
		if (local26 != null) {
			return local26;
		}
		@Pc(39) Class168 local39 = this.aClass168_71;
		@Pc(52) byte[] local52;
		synchronized (this.aClass168_71) {
			local52 = this.aClass168_71.method4435(Static110.method2280(arg0), Static177.method3527(arg0));
		}
		local26 = new Class145();
		local26.anInt4458 = arg0;
		local26.aClass203_2 = this;
		local26.aStringArray27 = new String[] { null, null, Static222.aClass152_6.method4002(this.anInt5726), null, null };
		local26.aStringArray26 = new String[] { null, null, null, null, Static222.aClass152_7.method4002(this.anInt5726) };
		if (local52 != null) {
			local26.method3858(new Class6_Sub26(local52));
		}
		local26.method3849();
		if (local26.anInt4451 != -1) {
			local26.method3845(this.method4899(local26.anInt4455), this.method4899(local26.anInt4451));
		}
		if (local26.anInt4471 != -1) {
			local26.method3847(this.method4899(local26.anInt4437), this.method4899(local26.anInt4471));
		}
		if (!this.aBoolean437 && local26.aBoolean360) {
			local26.aString52 = Static222.aClass152_4.method4002(this.anInt5726);
			local26.aBoolean359 = false;
			local26.aStringArray26 = this.aStringArray34;
			local26.aStringArray27 = this.aStringArray35;
			local26.anIntArray288 = null;
			local26.anInt4459 = 0;
			if (local26.aClass305_22 != null) {
				@Pc(206) boolean local206 = false;
				for (@Pc(211) Class6 local211 = local26.aClass305_22.method7445(); local211 != null; local211 = local26.aClass305_22.method7449()) {
					@Pc(221) Class99 local221 = this.aClass118_1.method3497((int) local211.aLong252);
					if (local221.aBoolean238) {
						local211.method8151();
					} else {
						local206 = true;
					}
				}
				if (!local206) {
					local26.aClass305_22 = null;
				}
			}
		}
		@Pc(246) Class245 local246 = this.aClass245_44;
		synchronized (this.aClass245_44) {
			this.aClass245_44.method6075(local26, (long) arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(II)V")
	public void method4900(@OriginalArg(1) int arg0) {
		this.anInt5739 = arg0;
		@Pc(13) Class245 local13 = this.aClass245_45;
		synchronized (this.aClass245_45) {
			this.aClass245_45.method6079();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public void method4901() {
		@Pc(2) Class245 local2 = this.aClass245_44;
		synchronized (this.aClass245_44) {
			this.aClass245_44.method6076();
		}
		local2 = this.aClass245_45;
		synchronized (this.aClass245_45) {
			this.aClass245_45.method6076();
		}
		@Pc(38) Class74 local38 = this.aClass74_1;
		synchronized (this.aClass74_1) {
			this.aClass74_1.method2137();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	public void method4903() {
		@Pc(2) Class245 local2 = this.aClass245_45;
		synchronized (this.aClass245_45) {
			this.aClass245_45.method6079();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IBILclient!oa;ZIILclient!oa;ILclient!ta;Lclient!dea;Z)Lclient!xa;")
	public Class66 method4905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class9 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class9 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class73 arg8, @OriginalArg(10) Class67 arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class66 local16 = this.method4909(arg7, arg6, arg4, arg0, arg9, arg5, arg1);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class145 local25 = this.method4899(arg4);
		if (arg7 > 1 && local25.anIntArray287 != null) {
			@Pc(35) int local35 = -1;
			for (@Pc(37) int local37 = 0; local37 < 10; local37++) {
				if (arg7 >= local25.anIntArray286[local37] && local25.anIntArray286[local37] != 0) {
					local35 = local25.anIntArray287[local37];
				}
			}
			if (local35 != -1) {
				local25 = this.method4899(local35);
			}
		}
		@Pc(84) int[] local84 = local25.method3846(arg2, arg1, arg10, arg9, arg6, arg0, arg7, arg8, arg5);
		if (local84 == null) {
			return null;
		}
		@Pc(104) Class66 local104;
		if (arg3) {
			local104 = arg2.method5423(local84, 36, 36, 32);
		} else {
			local104 = arg6.method5423(local84, 36, 36, 32);
		}
		if (!arg3) {
			@Pc(120) Class83 local120 = new Class83();
			local120.anInt2547 = arg6.anInt6348;
			local120.anInt2548 = arg7;
			local120.aBoolean215 = arg9 != null;
			local120.anInt2550 = arg1;
			local120.anInt2555 = arg5;
			local120.anInt2549 = arg0;
			local120.anInt2557 = arg4;
			this.aClass74_1.method2139(local104, local120);
		}
		return local104;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(II)V")
	public void method4906() {
		@Pc(2) Class245 local2 = this.aClass245_44;
		synchronized (this.aClass245_44) {
			this.aClass245_44.method6083(5);
		}
		local2 = this.aClass245_45;
		synchronized (this.aClass245_45) {
			this.aClass245_45.method6083(5);
		}
		@Pc(42) Class74 local42 = this.aClass74_1;
		synchronized (this.aClass74_1) {
			this.aClass74_1.method2142();
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	public void method4907() {
		@Pc(10) Class74 local10 = this.aClass74_1;
		synchronized (this.aClass74_1) {
			this.aClass74_1.method2141();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZZ)V")
	public void method4908(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean437) {
			this.aBoolean437 = arg0;
			this.method4910();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!oa;IIILclient!dea;II)Lclient!xa;")
	public Class66 method4909(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class67 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass83_1.anInt2548 = arg0;
		this.aClass83_1.anInt2555 = arg5;
		this.aClass83_1.anInt2549 = arg3;
		this.aClass83_1.anInt2547 = arg1.anInt6348;
		this.aClass83_1.aBoolean215 = arg4 != null;
		this.aClass83_1.anInt2557 = arg2;
		this.aClass83_1.anInt2550 = arg6;
		return (Class66) this.aClass74_1.method2133(this.aClass83_1);
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
	public void method4910() {
		@Pc(2) Class245 local2 = this.aClass245_44;
		synchronized (this.aClass245_44) {
			this.aClass245_44.method6079();
		}
		local2 = this.aClass245_45;
		synchronized (this.aClass245_45) {
			this.aClass245_45.method6079();
		}
		@Pc(43) Class74 local43 = this.aClass74_1;
		synchronized (this.aClass74_1) {
			this.aClass74_1.method2141();
		}
	}
}
