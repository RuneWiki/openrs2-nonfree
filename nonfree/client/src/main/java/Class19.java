import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class19 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
	public static final int[] anIntArray9 = new int[256];

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
	public int anInt383;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!wi;")
	private final Class268 aClass268_4 = new Class268(64);

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Lclient!wi;")
	public final Class268 aClass268_5 = new Class268(50);

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "Lclient!wi;")
	public final Class268 aClass268_6 = new Class268(5);

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Lclient!uu;")
	public final Class250 aClass250_11;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!iv;")
	public final Class113 aClass113_1;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!uu;")
	private final Class250 aClass250_10;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Z")
	public boolean aBoolean20;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray9[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!iv;IZLclient!uu;Lclient!uu;)V")
	public Class19(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class250 arg3, @OriginalArg(4) Class250 arg4) {
		this.aClass250_11 = arg4;
		this.aClass113_1 = arg0;
		this.aClass250_10 = arg3;
		this.aBoolean20 = arg2;
		if (this.aClass250_10 != null) {
			@Pc(41) int local41 = this.aClass250_10.method5819() - 1;
			this.aClass250_10.method5815(local41);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
	public void method396(@OriginalArg(1) int arg0) {
		this.anInt383 = arg0;
		@Pc(9) Class268 local9 = this.aClass268_5;
		synchronized (this.aClass268_5) {
			this.aClass268_5.method6160();
		}
		local9 = this.aClass268_6;
		synchronized (this.aClass268_6) {
			this.aClass268_6.method6160();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
	public void method397(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean20) {
			this.aBoolean20 = arg0;
			this.method402();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method398() {
		@Pc(6) Class268 local6 = this.aClass268_5;
		synchronized (this.aClass268_5) {
			this.aClass268_5.method6160();
		}
		local6 = this.aClass268_6;
		synchronized (this.aClass268_6) {
			this.aClass268_6.method6160();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V")
	public void method400() {
		@Pc(2) Class268 local2 = this.aClass268_4;
		synchronized (this.aClass268_4) {
			this.aClass268_4.method6173(5);
		}
		local2 = this.aClass268_5;
		synchronized (this.aClass268_5) {
			this.aClass268_5.method6173(5);
		}
		local2 = this.aClass268_6;
		synchronized (this.aClass268_6) {
			this.aClass268_6.method6173(5);
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(BI)Lclient!mv;")
	public Class158 method401(@OriginalArg(1) int arg0) {
		@Pc(6) Class268 local6 = this.aClass268_4;
		@Pc(16) Class158 local16;
		synchronized (this.aClass268_4) {
			local16 = (Class158) this.aClass268_4.method6166((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class250 local29 = this.aClass250_10;
		@Pc(50) byte[] local50;
		synchronized (this.aClass250_10) {
			local50 = this.aClass250_10.method5806(Static227.method3267(arg0), Static227.method3268(arg0));
		}
		local16 = new Class158();
		local16.anInt4476 = arg0;
		local16.aClass19_2 = this;
		if (local50 != null) {
			local16.method3712(new Class3_Sub25(local50));
		}
		local16.method3706();
		@Pc(81) Class268 local81 = this.aClass268_4;
		synchronized (this.aClass268_4) {
			this.aClass268_4.method6164(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public void method402() {
		@Pc(2) Class268 local2 = this.aClass268_4;
		synchronized (this.aClass268_4) {
			this.aClass268_4.method6160();
		}
		local2 = this.aClass268_5;
		synchronized (this.aClass268_5) {
			this.aClass268_5.method6160();
		}
		local2 = this.aClass268_6;
		synchronized (this.aClass268_6) {
			this.aClass268_6.method6160();
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public void method403() {
		@Pc(6) Class268 local6 = this.aClass268_4;
		synchronized (this.aClass268_4) {
			this.aClass268_4.method6168();
		}
		local6 = this.aClass268_5;
		synchronized (this.aClass268_5) {
			this.aClass268_5.method6168();
		}
		local6 = this.aClass268_6;
		synchronized (this.aClass268_6) {
			this.aClass268_6.method6168();
		}
	}
}
