import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class65 {

	@OriginalMember(owner = "client!en", name = "e", descriptor = "Lclient!qo;")
	private final Class196 aClass196_4 = new Class196(256);

	@OriginalMember(owner = "client!en", name = "k", descriptor = "Lclient!qo;")
	private final Class196 aClass196_5 = new Class196(256);

	@OriginalMember(owner = "client!en", name = "i", descriptor = "Lclient!ns;")
	private final Class166 aClass166_72;

	@OriginalMember(owner = "client!en", name = "j", descriptor = "Lclient!ns;")
	private final Class166 aClass166_73;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lclient!ns;Lclient!ns;)V")
	public Class65(@OriginalArg(0) Class166 arg0, @OriginalArg(1) Class166 arg1) {
		this.aClass166_72 = arg1;
		this.aClass166_73 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III[I)Lclient!uq;")
	private Class4_Sub35_Sub1 method1570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg1 << 4 & 0xFFF4 | arg1 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class4_Sub35_Sub1 local31 = (Class4_Sub35_Sub1) this.aClass196_5.method4477(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class55 local57 = Static458.method1453(this.aClass166_73, arg1, arg0);
			if (local57 == null) {
				return null;
			}
			local31 = local57.method1452();
			this.aClass196_5.method4474(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray92.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([IIB)Lclient!uq;")
	public Class4_Sub35_Sub1 method1571(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass166_72.method3695() == 1) {
			return this.method1574(arg0, arg1, 0);
		} else if (this.aClass166_72.method3691(arg1) == 1) {
			return this.method1574(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([III)Lclient!uq;")
	public Class4_Sub35_Sub1 method1573(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass166_73.method3695() == 1) {
			return this.method1570(arg1, 0, arg0);
		} else if (this.aClass166_73.method3691(arg1) == 1) {
			return this.method1570(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B[III)Lclient!uq;")
	private Class4_Sub35_Sub1 method1574(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg1 ^ (arg2 >>> 12 | (arg2 & 0x10000FFF) << 4);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(32) long local32 = (long) local21 ^ 0x100000000L;
		@Pc(39) Class4_Sub35_Sub1 local39 = (Class4_Sub35_Sub1) this.aClass196_5.method4477(local32);
		if (local39 != null) {
			return local39;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(61) Class4_Sub43 local61 = (Class4_Sub43) this.aClass196_4.method4477(local32);
			if (local61 == null) {
				local61 = Static432.method5549(this.aClass166_72, arg2, arg1);
				if (local61 == null) {
					return null;
				}
				this.aClass196_4.method4474(local32, local61);
			}
			local39 = local61.method5553(arg0);
			if (local39 == null) {
				return null;
			} else {
				local61.method5854();
				this.aClass196_5.method4474(local32, local39);
				return local39;
			}
		} else {
			return null;
		}
	}
}
