import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class53 {

	@OriginalMember(owner = "client!cga", name = "i", descriptor = "Lclient!tca;")
	private final Class333 aClass333_9 = new Class333(256);

	@OriginalMember(owner = "client!cga", name = "m", descriptor = "Lclient!tca;")
	private final Class333 aClass333_10 = new Class333(256);

	@OriginalMember(owner = "client!cga", name = "c", descriptor = "Lclient!uq;")
	private final Class362 aClass362_14;

	@OriginalMember(owner = "client!cga", name = "j", descriptor = "Lclient!uq;")
	private final Class362 aClass362_15;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!uq;Lclient!uq;)V")
	public Class53(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class362 arg1) {
		this.aClass362_14 = arg1;
		this.aClass362_15 = arg0;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "([IBI)Lclient!pv;")
	public Class3_Sub39_Sub1 method1300(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass362_14.method8373() == 1) {
			return this.method1303(arg0, 0, arg1);
		} else if (this.aClass362_14.method8355(arg1) == 1) {
			return this.method1303(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I[IB)Lclient!pv;")
	public Class3_Sub39_Sub1 method1301(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass362_15.method8373() == 1) {
			return this.method1305(arg0, arg1, 0);
		} else if (this.aClass362_15.method8355(arg0) == 1) {
			return this.method1305(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "([IIZI)Lclient!pv;")
	private Class3_Sub39_Sub1 method1303(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg1 << 4 & 0xFFF9 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class3_Sub39_Sub1 local33 = (Class3_Sub39_Sub1) this.aClass333_10.method7489(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(55) Class3_Sub54 local55 = (Class3_Sub54) this.aClass333_9.method7489(local26);
			if (local55 == null) {
				local55 = Static670.method8925(this.aClass362_14, arg1, arg2);
				if (local55 == null) {
					return null;
				}
				this.aClass333_9.method7488(local26, local55);
			}
			local33 = local55.method8927(arg0);
			if (local33 == null) {
				return null;
			} else {
				local55.method9034();
				this.aClass333_10.method7488(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I[III)Lclient!pv;")
	private Class3_Sub39_Sub1 method1305(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(21) int local21 = arg0 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFF5);
		@Pc(27) int local27 = local21 | arg2 << 16;
		@Pc(30) long local30 = (long) local27;
		@Pc(37) Class3_Sub39_Sub1 local37 = (Class3_Sub39_Sub1) this.aClass333_10.method7489(local30);
		if (local37 != null) {
			return local37;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(55) Class210 local55 = Static683.method4984(this.aClass362_15, arg2, arg0);
			if (local55 == null) {
				return null;
			}
			local37 = local55.method4986();
			this.aClass333_10.method7488(local30, local37);
			if (arg1 != null) {
				arg1[0] -= local37.aByteArray67.length;
			}
			return local37;
		} else {
			return null;
		}
	}
}
