import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class406 {

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "I")
	public int anInt11255;

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "Lclient!si;")
	private final Class338 aClass338_65 = new Class338(64);

	@OriginalMember(owner = "client!wo", name = "g", descriptor = "Lclient!si;")
	public final Class338 aClass338_66 = new Class338(50);

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "Lclient!pl;")
	public final Class290 aClass290_1 = new Class290(250);

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "Lclient!via;")
	private final Class388 aClass388_1 = new Class388();

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
	public final int anInt11247;

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "Lclient!fc;")
	private final Class106 aClass106_2;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "Z")
	private boolean aBoolean812;

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "Lclient!lb;")
	public final Class221 aClass221_165;

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "Lclient!lb;")
	private final Class221 aClass221_164;

	@OriginalMember(owner = "client!wo", name = "z", descriptor = "Lclient!iga;")
	private final Class169 aClass169_11;

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "I")
	public final int anInt11253;

	@OriginalMember(owner = "client!wo", name = "w", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray41;

	@OriginalMember(owner = "client!wo", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray42;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!iga;IZLclient!fc;Lclient!lb;Lclient!lb;)V")
	public Class406(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) Class221 arg4, @OriginalArg(5) Class221 arg5) {
		this.anInt11247 = arg1;
		this.aClass106_2 = arg3;
		this.aBoolean812 = arg2;
		this.aClass221_165 = arg5;
		this.aClass221_164 = arg4;
		this.aClass169_11 = arg0;
		if (this.aClass221_164 == null) {
			this.anInt11253 = 0;
		} else {
			@Pc(59) int local59 = this.aClass221_164.method5080() - 1;
			this.anInt11253 = local59 * 256 + this.aClass221_164.method5065(local59);
		}
		if (this.aClass169_11 == Static615.aClass169_7) {
			this.aStringArray41 = new String[] { null, null, Static476.aClass279_8.method6992(this.anInt11247), null, null, Static476.aClass279_22.method6992(this.anInt11247) };
		} else {
			this.aStringArray41 = new String[] { null, null, Static476.aClass279_8.method6992(this.anInt11247), null, null, null };
		}
		this.aStringArray42 = new String[] { null, null, null, null, Static476.aClass279_9.method6992(this.anInt11247) };
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ha;IIIIIILclient!maa;)Lclient!bka;")
	public Class9 method9390(@OriginalArg(0) Class67 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class236 arg6) {
		this.aClass388_1.anInt10817 = arg0.anInt9130;
		this.aClass388_1.anInt10822 = arg1;
		this.aClass388_1.aBoolean781 = arg6 != null;
		this.aClass388_1.anInt10816 = arg5;
		this.aClass388_1.anInt10823 = arg2;
		this.aClass388_1.anInt10821 = arg4;
		this.aClass388_1.anInt10818 = arg3;
		return (Class9) this.aClass290_1.method7136(this.aClass388_1);
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)V")
	public void method9392() {
		@Pc(2) Class338 local2 = this.aClass338_65;
		synchronized (this.aClass338_65) {
			this.aClass338_65.method8047();
		}
		local2 = this.aClass338_66;
		synchronized (this.aClass338_66) {
			this.aClass338_66.method8047();
		}
		@Pc(36) Class290 local36 = this.aClass290_1;
		synchronized (this.aClass290_1) {
			this.aClass290_1.method7132();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)V")
	public void method9393(@OriginalArg(1) int arg0) {
		this.anInt11255 = arg0;
		@Pc(17) Class338 local17 = this.aClass338_66;
		synchronized (this.aClass338_66) {
			this.aClass338_66.method8051();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)Lclient!eh;")
	public Class91 method9394(@OriginalArg(0) int arg0) {
		@Pc(8) Class338 local8 = this.aClass338_65;
		@Pc(18) Class91 local18;
		synchronized (this.aClass338_65) {
			local18 = (Class91) this.aClass338_65.method8049((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(32) Class221 local32 = this.aClass221_164;
		@Pc(45) byte[] local45;
		synchronized (this.aClass221_164) {
			local45 = this.aClass221_164.method5089(Static167.method2673(arg0), Static356.method5131(arg0));
		}
		local18 = new Class91();
		local18.anInt2718 = arg0;
		local18.aClass406_1 = this;
		local18.aStringArray7 = (String[]) this.aStringArray41.clone();
		local18.aStringArray6 = (String[]) this.aStringArray42.clone();
		if (local45 != null) {
			local18.method2364(new Class3_Sub28(local45));
		}
		local18.method2376();
		if (local18.anInt2681 != -1) {
			local18.method2372(this.method9394(local18.anInt2697), this.method9394(local18.anInt2681));
		}
		if (local18.anInt2678 != -1) {
			local18.method2374(this.method9394(local18.anInt2682), this.method9394(local18.anInt2678));
		}
		if (local18.anInt2732 != -1) {
			local18.method2369(this.method9394(local18.anInt2706), this.method9394(local18.anInt2732));
		}
		if (!this.aBoolean812 && local18.aBoolean223) {
			local18.aString47 = Static476.aClass279_5.method6992(this.anInt11247);
			local18.anIntArray130 = null;
			local18.aBoolean224 = false;
			local18.aStringArray6 = this.aStringArray42;
			local18.anInt2690 = 0;
			local18.aStringArray7 = this.aStringArray41;
			if (local18.aClass136_17 != null) {
				@Pc(192) boolean local192 = false;
				for (@Pc(197) Class3 local197 = local18.aClass136_17.method3509(); local197 != null; local197 = local18.aClass136_17.method3506()) {
					@Pc(207) Class319 local207 = this.aClass106_2.method2677((int) local197.aLong382);
					if (local207.aBoolean676) {
						local197.method9446();
					} else {
						local192 = true;
					}
				}
				if (!local192) {
					local18.aClass136_17 = null;
				}
			}
		}
		@Pc(238) Class338 local238 = this.aClass338_65;
		synchronized (this.aClass338_65) {
			this.aClass338_65.method8044((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Lclient!ha;IIIILclient!ha;IZLclient!maa;IZLclient!da;)Lclient!bka;")
	public Class9 method9395(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class67 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class236 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class44 arg10) {
		@Pc(16) Class9 local16 = this.method9390(arg4, arg2, arg3, arg8, arg1, arg5, arg7);
		if (local16 != null) {
			return local16;
		}
		@Pc(26) Class91 local26 = this.method9394(arg8);
		if (arg2 > 1 && local26.anIntArray129 != null) {
			@Pc(36) int local36 = -1;
			for (@Pc(38) int local38 = 0; local38 < 10; local38++) {
				if (arg2 >= local26.anIntArray128[local38] && local26.anIntArray128[local38] != 0) {
					local36 = local26.anIntArray129[local38];
				}
			}
			if (local36 != -1) {
				local26 = this.method9394(local36);
			}
		}
		@Pc(99) int[] local99 = local26.method2366(arg3, arg0, arg1, arg2, arg4, arg7, arg10, arg9, arg5);
		if (local99 == null) {
			return null;
		}
		@Pc(121) Class9 local121;
		if (arg6) {
			local121 = arg0.method7688(local99, 36, 36, 32);
		} else {
			local121 = arg4.method7688(local99, 36, 36, 32);
		}
		if (!arg6) {
			@Pc(138) Class388 local138 = new Class388();
			local138.anInt10817 = arg4.anInt9130;
			local138.anInt10822 = arg2;
			local138.anInt10818 = arg8;
			local138.aBoolean781 = arg7 != null;
			local138.anInt10816 = arg5;
			local138.anInt10823 = arg3;
			local138.anInt10821 = arg1;
			this.aClass290_1.method7128(local121, local138);
		}
		return local121;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)V")
	public void method9396() {
		@Pc(6) Class338 local6 = this.aClass338_66;
		synchronized (this.aClass338_66) {
			this.aClass338_66.method8051();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZI)V")
	public void method9397(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean812) {
			this.aBoolean812 = arg0;
			this.method9400();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V")
	public void method9398() {
		@Pc(2) Class338 local2 = this.aClass338_65;
		synchronized (this.aClass338_65) {
			this.aClass338_65.method8052(5);
		}
		local2 = this.aClass338_66;
		synchronized (this.aClass338_66) {
			this.aClass338_66.method8052(5);
		}
		@Pc(40) Class290 local40 = this.aClass290_1;
		synchronized (this.aClass290_1) {
			this.aClass290_1.method7137();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V")
	public void method9399() {
		@Pc(14) Class290 local14 = this.aClass290_1;
		synchronized (this.aClass290_1) {
			this.aClass290_1.method7131();
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
	public void method9400() {
		@Pc(2) Class338 local2 = this.aClass338_65;
		synchronized (this.aClass338_65) {
			this.aClass338_65.method8051();
		}
		local2 = this.aClass338_66;
		synchronized (this.aClass338_66) {
			this.aClass338_66.method8051();
		}
		@Pc(42) Class290 local42 = this.aClass290_1;
		synchronized (this.aClass290_1) {
			this.aClass290_1.method7131();
		}
	}
}
