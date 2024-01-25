import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class250 {

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
	public int anInt6713;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "Lclient!mq;")
	private final Class154 aClass154_56 = new Class154(64);

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "Lclient!mq;")
	public final Class154 aClass154_57 = new Class154(50);

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "Lclient!gt;")
	public final Class92 aClass92_1 = new Class92(250);

	@OriginalMember(owner = "client!wr", name = "A", descriptor = "Lclient!eu;")
	private final Class67 aClass67_1 = new Class67();

	@OriginalMember(owner = "client!wr", name = "q", descriptor = "Lclient!fc;")
	public final Class71 aClass71_94;

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "Lclient!qb;")
	private final Class184 aClass184_2;

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "Z")
	private boolean aBoolean496;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "Lclient!fc;")
	private final Class71 aClass71_93;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "I")
	public final int anInt6709;

	@OriginalMember(owner = "client!wr", name = "o", descriptor = "I")
	public final int anInt6708;

	@OriginalMember(owner = "client!wr", name = "C", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray45;

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray44;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lclient!dk;IZLclient!qb;Lclient!fc;Lclient!fc;)V")
	public Class250(@OriginalArg(0) Class48 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class184 arg3, @OriginalArg(4) Class71 arg4, @OriginalArg(5) Class71 arg5) {
		this.aClass71_94 = arg5;
		this.aClass184_2 = arg3;
		this.aBoolean496 = arg2;
		this.aClass71_93 = arg4;
		this.anInt6709 = arg1;
		if (this.aClass71_93 == null) {
			this.anInt6708 = 0;
		} else {
			@Pc(54) int local54 = this.aClass71_93.method1553() - 1;
			this.anInt6708 = local54 * 256 + this.aClass71_93.method1580(local54);
		}
		this.aStringArray45 = new String[] { null, null, Static223.aClass221_143.method5229(this.anInt6709), null, null };
		this.aStringArray44 = new String[] { null, null, null, null, Static375.aClass221_146.method5229(this.anInt6709) };
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
	public void method5725() {
		@Pc(2) Class154 local2 = this.aClass154_56;
		synchronized (this.aClass154_56) {
			this.aClass154_56.method3746();
		}
		local2 = this.aClass154_57;
		synchronized (this.aClass154_57) {
			this.aClass154_57.method3746();
		}
		@Pc(42) Class92 local42 = this.aClass92_1;
		synchronized (this.aClass92_1) {
			this.aClass92_1.method2238();
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)V")
	public void method5726() {
		@Pc(2) Class154 local2 = this.aClass154_57;
		synchronized (this.aClass154_57) {
			this.aClass154_57.method3748();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IZ)V")
	public void method5727(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean496) {
			this.aBoolean496 = arg0;
			this.method5733();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)V")
	public void method5730() {
		@Pc(6) Class92 local6 = this.aClass92_1;
		synchronized (this.aClass92_1) {
			this.aClass92_1.method2237();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IB)V")
	public void method5731(@OriginalArg(0) int arg0) {
		this.anInt6713 = arg0;
		@Pc(15) Class154 local15 = this.aClass154_57;
		synchronized (this.aClass154_57) {
			this.aClass154_57.method3748();
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(IB)V")
	public void method5732() {
		@Pc(6) Class154 local6 = this.aClass154_56;
		synchronized (this.aClass154_56) {
			this.aClass154_56.method3758(5);
		}
		local6 = this.aClass154_57;
		synchronized (this.aClass154_57) {
			this.aClass154_57.method3758(5);
		}
		@Pc(44) Class92 local44 = this.aClass92_1;
		synchronized (this.aClass92_1) {
			this.aClass92_1.method2243();
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(I)V")
	public void method5733() {
		@Pc(6) Class154 local6 = this.aClass154_56;
		synchronized (this.aClass154_56) {
			this.aClass154_56.method3748();
		}
		local6 = this.aClass154_57;
		synchronized (this.aClass154_57) {
			this.aClass154_57.method3748();
		}
		@Pc(44) Class92 local44 = this.aClass92_1;
		synchronized (this.aClass92_1) {
			this.aClass92_1.method2237();
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)Lclient!is;")
	public Class117 method5735(@OriginalArg(0) int arg0) {
		@Pc(8) Class154 local8 = this.aClass154_56;
		@Pc(18) Class117 local18;
		synchronized (this.aClass154_56) {
			local18 = (Class117) this.aClass154_56.method3751((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass71_93.method1555(Static42.method898(arg0), Static156.method2600(arg0));
		local18 = new Class117();
		local18.aClass250_2 = this;
		local18.anInt2882 = arg0;
		local18.aStringArray18 = new String[] { null, null, Static223.aClass221_143.method5229(this.anInt6709), null, null };
		local18.aStringArray19 = new String[] { null, null, null, null, Static375.aClass221_146.method5229(this.anInt6709) };
		if (local39 != null) {
			local18.method2646(new Class2_Sub13(local39));
		}
		local18.method2648();
		if (local18.anInt2884 != -1) {
			local18.method2638(this.method5735(local18.anInt2884), this.method5735(local18.anInt2837));
		}
		if (local18.anInt2829 != -1) {
			local18.method2636(this.method5735(local18.anInt2847), this.method5735(local18.anInt2829));
		}
		if (!this.aBoolean496 && local18.aBoolean210) {
			local18.aString27 = Static317.aClass221_197.method5229(this.anInt6709);
			local18.aBoolean209 = false;
			local18.anIntArray326 = null;
			local18.aStringArray18 = this.aStringArray45;
			local18.aStringArray19 = this.aStringArray44;
			local18.anInt2876 = 0;
			if (local18.aClass214_15 != null) {
				@Pc(195) boolean local195 = false;
				for (@Pc(200) Class2 local200 = local18.aClass214_15.method5060(); local200 != null; local200 = local18.aClass214_15.method5064()) {
					@Pc(210) Class61 local210 = this.aClass184_2.method4403((int) local200.aLong208);
					if (local210.aBoolean126) {
						local200.method5745();
					} else {
						local195 = true;
					}
				}
				if (!local195) {
					local18.aClass214_15 = null;
				}
			}
		}
		@Pc(237) Class154 local237 = this.aClass154_56;
		synchronized (this.aClass154_56) {
			this.aClass154_56.method3745((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IBIILclient!km;Lclient!wh;II)Lclient!aq;")
	public Class5 method5737(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class82 arg3, @OriginalArg(5) Class247 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		this.aClass67_1.anInt1695 = arg3.anInt5188;
		this.aClass67_1.anInt1694 = arg6;
		this.aClass67_1.anInt1690 = arg1;
		this.aClass67_1.anInt1693 = arg0;
		this.aClass67_1.aBoolean146 = arg4 != null;
		this.aClass67_1.anInt1696 = arg5;
		this.aClass67_1.anInt1692 = arg2;
		return (Class5) this.aClass92_1.method2246(this.aClass67_1);
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZZILclient!km;Lclient!km;Lclient!oj;IILclient!wh;III)Lclient!aq;")
	public Class5 method5738(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class82 arg3, @OriginalArg(4) Class82 arg4, @OriginalArg(5) Class13 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class247 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class5 local16 = this.method5737(arg2, arg8, arg6, arg4, arg7, arg10, arg9);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class117 local25 = this.method5735(arg9);
		if (arg2 > 1 && local25.anIntArray324 != null) {
			@Pc(38) int local38 = -1;
			for (@Pc(40) int local40 = 0; local40 < 10; local40++) {
				if (arg2 >= local25.anIntArray325[local40] && local25.anIntArray325[local40] != 0) {
					local38 = local25.anIntArray324[local40];
				}
			}
			if (local38 != -1) {
				local25 = this.method5735(local38);
			}
		}
		@Pc(88) int[] local88 = local25.method2644(arg8, arg7, arg6, arg4, arg3, arg10, arg5, arg1, arg2);
		if (local88 == null) {
			return null;
		}
		@Pc(102) Class5 local102;
		if (arg0) {
			local102 = arg3.method4456(local88, 36, 36, 32);
		} else {
			local102 = arg4.method4456(local88, 36, 36, 32);
		}
		if (!arg0) {
			@Pc(118) Class67 local118 = new Class67();
			local118.anInt1694 = arg9;
			local118.aBoolean146 = arg7 != null;
			local118.anInt1695 = arg4.anInt5188;
			local118.anInt1693 = arg2;
			local118.anInt1692 = arg6;
			local118.anInt1696 = arg10;
			local118.anInt1690 = arg8;
			this.aClass92_1.method2242(local118, local102);
		}
		return local102;
	}
}
