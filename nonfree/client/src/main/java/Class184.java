import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sn")
public final class Class184 {

	@OriginalMember(owner = "client!sn", name = "C", descriptor = "I")
	public int anInt5974;

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "Lclient!jg;")
	private final Class107 aClass107_47 = new Class107(64);

	@OriginalMember(owner = "client!sn", name = "y", descriptor = "Lclient!jg;")
	public final Class107 aClass107_48 = new Class107(50);

	@OriginalMember(owner = "client!sn", name = "z", descriptor = "Lclient!bn;")
	public final Class27 aClass27_1 = new Class27(250);

	@OriginalMember(owner = "client!sn", name = "A", descriptor = "Lclient!wm;")
	private final Class222 aClass222_1 = new Class222();

	@OriginalMember(owner = "client!sn", name = "w", descriptor = "Z")
	private boolean aBoolean527;

	@OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
	public final int anInt5965;

	@OriginalMember(owner = "client!sn", name = "l", descriptor = "Lclient!iq;")
	public final Class104 aClass104_154;

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "Lclient!iq;")
	private final Class104 aClass104_155;

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
	public int anInt5966;

	@OriginalMember(owner = "client!sn", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray39;

	@OriginalMember(owner = "client!sn", name = "D", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray40;

	static {
		new Class140("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!rg;IZLclient!iq;Lclient!iq;)V")
	public Class184(@OriginalArg(0) Class172 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class104 arg3, @OriginalArg(4) Class104 arg4) {
		this.aBoolean527 = arg2;
		this.anInt5965 = arg1;
		this.aClass104_154 = arg4;
		this.aClass104_155 = arg3;
		if (this.aClass104_155 != null) {
			@Pc(46) int local46 = this.aClass104_155.method2757() - 1;
			this.anInt5966 = local46 * 256 + this.aClass104_155.method2745(local46);
		}
		this.aStringArray39 = new String[] { null, null, Static95.aClass140_46.method4155(this.anInt5965), null, null };
		this.aStringArray40 = new String[] { null, null, null, null, Static225.aClass140_117.method4155(this.anInt5965) };
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)V")
	public void method5039() {
		@Pc(6) Class107 local6 = this.aClass107_47;
		synchronized (this.aClass107_47) {
			this.aClass107_47.method3012();
		}
		local6 = this.aClass107_48;
		synchronized (this.aClass107_48) {
			this.aClass107_48.method3012();
		}
		@Pc(36) Class27 local36 = this.aClass27_1;
		synchronized (this.aClass27_1) {
			this.aClass27_1.method433();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)Lclient!ko;")
	public Class122 method5040(@OriginalArg(1) int arg0) {
		@Pc(8) Class107 local8 = this.aClass107_47;
		@Pc(18) Class122 local18;
		synchronized (this.aClass107_47) {
			local18 = (Class122) this.aClass107_47.method3021((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(39) byte[] local39 = this.aClass104_155.method2756(Static111.method2168(arg0), Static200.method3773(arg0));
		local18 = new Class122();
		local18.aClass184_1 = this;
		local18.anInt3894 = arg0;
		local18.aStringArray26 = new String[] { null, null, Static95.aClass140_46.method4155(this.anInt5965), null, null };
		local18.aStringArray27 = new String[] { null, null, null, null, Static225.aClass140_117.method4155(this.anInt5965) };
		if (local39 != null) {
			local18.method3405(new Class2_Sub12(local39));
		}
		local18.method3400();
		if (local18.anInt3914 != -1) {
			local18.method3412(this.method5040(local18.anInt3914), this.method5040(local18.anInt3939));
		}
		if (local18.anInt3935 != -1) {
			local18.method3411(this.method5040(local18.anInt3935), this.method5040(local18.anInt3918));
		}
		if (!this.aBoolean527 && local18.aBoolean337) {
			local18.aString37 = Static223.aClass140_115.method4155(this.anInt5965);
			local18.anIntArray296 = null;
			local18.aStringArray27 = this.aStringArray40;
			local18.aBoolean336 = false;
			local18.anInt3900 = 0;
			local18.aStringArray26 = this.aStringArray39;
			if (local18.aClass41_17 != null) {
				@Pc(195) boolean local195 = false;
				for (@Pc(200) Class2 local200 = local18.aClass41_17.method896(); local200 != null; local200 = local18.aClass41_17.method904()) {
					@Pc(208) Class2_Sub9_Sub15 local208 = Static176.method3422((int) local200.aLong219);
					if (local208.aBoolean383) {
						local200.method5723();
					} else {
						local195 = true;
					}
				}
				if (!local195) {
					local18.aClass41_17 = null;
				}
			}
		}
		@Pc(235) Class107 local235 = this.aClass107_47;
		synchronized (this.aClass107_47) {
			this.aClass107_47.method3018((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V")
	public void method5041(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean527 != arg0) {
			this.aBoolean527 = arg0;
			this.method5045();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
	public void method5043() {
		@Pc(6) Class107 local6 = this.aClass107_48;
		synchronized (this.aClass107_48) {
			this.aClass107_48.method3015();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BI)V")
	public void method5044(@OriginalArg(1) int arg0) {
		this.anInt5974 = arg0;
		@Pc(16) Class107 local16 = this.aClass107_48;
		synchronized (this.aClass107_48) {
			this.aClass107_48.method3015();
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V")
	public void method5045() {
		@Pc(12) Class107 local12 = this.aClass107_47;
		synchronized (this.aClass107_47) {
			this.aClass107_47.method3015();
		}
		local12 = this.aClass107_48;
		synchronized (this.aClass107_48) {
			this.aClass107_48.method3015();
		}
		@Pc(42) Class27 local42 = this.aClass27_1;
		synchronized (this.aClass27_1) {
			this.aClass27_1.method428();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lclient!we;ILclient!lp;IILclient!dr;ILclient!dr;ZIZI)Lclient!kr;")
	public Class46 method5047(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class37 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class37 arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class46 local16 = this.method5049(arg5, arg10, arg1, arg8, arg4, arg3, arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class122 local25 = this.method5040(arg8);
		if (arg10 > 1 && local25.lb != null) {
			@Pc(38) int local38 = -1;
			for (@Pc(40) int local40 = 0; local40 < 10; local40++) {
				if (arg10 >= local25.anIntArray297[local40] && local25.anIntArray297[local40] != 0) {
					local38 = local25.lb[local40];
				}
			}
			if (local38 != -1) {
				local25 = this.method5040(local38);
			}
		}
		@Pc(91) int[] local91 = local25.method3406(arg9, arg6, arg10, arg2, arg5, arg4, arg1, arg3, arg0);
		if (local91 == null) {
			return null;
		}
		@Pc(105) Class46 local105;
		if (arg7) {
			local105 = arg6.method3729(local91, 36, 36, 32);
		} else {
			local105 = arg4.method3729(local91, 36, 36, 32);
		}
		if (!arg7) {
			@Pc(121) Class222 local121 = new Class222();
			local121.anInt6881 = arg8;
			local121.anInt6873 = arg1;
			local121.anInt6872 = arg10;
			local121.anInt6877 = arg4.anInt4312;
			local121.anInt6878 = arg5;
			local121.aBoolean609 = arg0 != null;
			local121.anInt6879 = arg3;
			this.aClass27_1.method423(local121, local105);
		}
		return local105;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIILclient!dr;ILclient!we;)Lclient!kr;")
	public Class46 method5049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class37 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class217 arg6) {
		this.aClass222_1.anInt6872 = arg1;
		this.aClass222_1.anInt6878 = arg0;
		this.aClass222_1.anInt6879 = arg5;
		this.aClass222_1.anInt6877 = arg4.anInt4312;
		this.aClass222_1.aBoolean609 = arg6 != null;
		this.aClass222_1.anInt6881 = arg3;
		this.aClass222_1.anInt6873 = arg2;
		return (Class46) this.aClass27_1.method430(this.aClass222_1);
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V")
	public void method5052() {
		@Pc(6) Class27 local6 = this.aClass27_1;
		synchronized (this.aClass27_1) {
			this.aClass27_1.method428();
		}
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(BI)V")
	public void method5053() {
		@Pc(2) Class107 local2 = this.aClass107_47;
		synchronized (this.aClass107_47) {
			this.aClass107_47.method3011(5);
		}
		local2 = this.aClass107_48;
		synchronized (this.aClass107_48) {
			this.aClass107_48.method3011(5);
		}
		@Pc(43) Class27 local43 = this.aClass27_1;
		synchronized (this.aClass27_1) {
			this.aClass27_1.method429();
		}
	}
}
