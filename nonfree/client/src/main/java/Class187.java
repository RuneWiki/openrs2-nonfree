import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class187 {

	@OriginalMember(owner = "client!ln", name = "g", descriptor = "[I")
	public static final int[] anIntArray455 = new int[256];

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "Lclient!vi;")
	private final Class332 aClass332_121 = new Class332(64);

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "Lclient!pq;")
	private final Class251 aClass251_85;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
	public final int anInt4743;

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
			anIntArray455[local4] = local7;
		}
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class187(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_85 = arg2;
		if (this.aClass251_85 == null) {
			this.anInt4743 = 0;
		} else {
			this.anInt4743 = this.aClass251_85.method5849(16);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	public void method4088() {
		@Pc(8) Class332 local8 = this.aClass332_121;
		synchronized (this.aClass332_121) {
			this.aClass332_121.method7510();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)V")
	public void method4091() {
		@Pc(2) Class332 local2 = this.aClass332_121;
		synchronized (this.aClass332_121) {
			this.aClass332_121.method7497(5);
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(IB)Lclient!gn;")
	public Class123 method4092(@OriginalArg(0) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_121;
		@Pc(16) Class123 local16;
		synchronized (this.aClass332_121) {
			local16 = (Class123) this.aClass332_121.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_85;
		@Pc(38) byte[] local38;
		synchronized (this.aClass251_85) {
			local38 = this.aClass251_85.method5860(16, arg0);
		}
		local16 = new Class123();
		if (local38 != null) {
			local16.method2616(new Class6_Sub14(local38));
		}
		@Pc(65) Class332 local65 = this.aClass332_121;
		synchronized (this.aClass332_121) {
			this.aClass332_121.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
	public void method4093() {
		@Pc(2) Class332 local2 = this.aClass332_121;
		synchronized (this.aClass332_121) {
			this.aClass332_121.method7512();
		}
	}
}
