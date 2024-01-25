import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class337 {

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "[J")
	public static final long[] aLongArray15 = new long[256];

	@OriginalMember(owner = "client!uaa", name = "d", descriptor = "Lclient!jt;")
	private Class166 aClass166_59 = new Class166(128);

	@OriginalMember(owner = "client!uaa", name = "l", descriptor = "Lclient!jt;")
	public Class166 aClass166_60 = new Class166(64);

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "Lclient!vd;")
	public final Class353 aClass353_120;

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "Lclient!vd;")
	private final Class353 aClass353_121;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray15[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;Lclient!vd;)V")
	public Class337(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2, @OriginalArg(3) Class353 arg3) {
		this.aClass353_120 = arg3;
		this.aClass353_121 = arg2;
		this.aClass353_121.method8422(36);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
	public void method8115() {
		@Pc(6) Class166 local6 = this.aClass166_59;
		synchronized (this.aClass166_59) {
			this.aClass166_59.method4811();
		}
		local6 = this.aClass166_60;
		synchronized (this.aClass166_60) {
			this.aClass166_60.method4811();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)V")
	public void method8116() {
		@Pc(2) Class166 local2 = this.aClass166_59;
		synchronized (this.aClass166_59) {
			this.aClass166_59.method4809(5);
		}
		local2 = this.aClass166_60;
		synchronized (this.aClass166_60) {
			this.aClass166_60.method4809(5);
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)V")
	public void method8117() {
		@Pc(2) Class166 local2 = this.aClass166_59;
		synchronized (this.aClass166_59) {
			this.aClass166_59.method4802();
		}
		local2 = this.aClass166_60;
		synchronized (this.aClass166_60) {
			this.aClass166_60.method4802();
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(III)V")
	public void method8118(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.aClass166_59 = new Class166(arg0);
		this.aClass166_60 = new Class166(arg1);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Lclient!fo;")
	public Class105 method8119(@OriginalArg(1) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_59;
		@Pc(16) Class105 local16;
		synchronized (this.aClass166_59) {
			local16 = (Class105) this.aClass166_59.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class353 local29 = this.aClass353_121;
		@Pc(38) byte[] local38;
		synchronized (this.aClass353_121) {
			local38 = this.aClass353_121.method8404(36, arg0);
		}
		local16 = new Class105();
		local16.aClass337_1 = this;
		local16.anInt3412 = arg0;
		if (local38 != null) {
			local16.method3038(new Class6_Sub40(local38));
		}
		local16.method3035();
		@Pc(69) Class166 local69 = this.aClass166_59;
		synchronized (this.aClass166_59) {
			this.aClass166_59.method4803(local16, (long) arg0);
			return local16;
		}
	}
}
