import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class152 {

	@OriginalMember(owner = "client!iu", name = "d", descriptor = "Lclient!nj;")
	private final Class212 aClass212_13 = new Class212(256);

	@OriginalMember(owner = "client!iu", name = "k", descriptor = "Lclient!nj;")
	private final Class212 aClass212_14 = new Class212(256);

	@OriginalMember(owner = "client!iu", name = "j", descriptor = "Lclient!pq;")
	private final Class251 aClass251_73;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "Lclient!pq;")
	private final Class251 aClass251_72;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!pq;Lclient!pq;)V")
	public Class152(@OriginalArg(0) Class251 arg0, @OriginalArg(1) Class251 arg1) {
		this.aClass251_73 = arg0;
		this.aClass251_72 = arg1;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "([IIBI)Lclient!mda;")
	private Class6_Sub12_Sub1 method3239(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ ((arg1 & 0x40000FFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(31) long local31 = (long) local21 ^ 0x100000000L;
		@Pc(38) Class6_Sub12_Sub1 local38 = (Class6_Sub12_Sub1) this.aClass212_14.method5106(local31);
		if (local38 != null) {
			return local38;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(57) Class6_Sub50 local57 = (Class6_Sub50) this.aClass212_13.method5106(local31);
			if (local57 == null) {
				local57 = Static531.method7395(this.aClass251_72, arg1, arg2);
				if (local57 == null) {
					return null;
				}
				this.aClass212_13.method5104(local31, local57);
			}
			local38 = local57.method7394(arg0);
			if (local38 == null) {
				return null;
			} else {
				local57.method7849();
				this.aClass212_14.method5104(local31, local38);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(II[I)Lclient!mda;")
	public Class6_Sub12_Sub1 method3240(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass251_72.method5847() == 1) {
			return this.method3239(arg1, 0, arg0);
		} else if (this.aClass251_72.method5849(arg0) == 1) {
			return this.method3239(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "(II[I)Lclient!mda;")
	public Class6_Sub12_Sub1 method3241(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass251_73.method5847() == 1) {
			return this.method3243(0, arg1, arg0);
		} else if (this.aClass251_73.method5849(arg0) == 1) {
			return this.method3243(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I[IZI)Lclient!mda;")
	private Class6_Sub12_Sub1 method3243(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg0 >>> 12 | (arg0 & 0xB0000FFF) << 4);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class6_Sub12_Sub1 local31 = (Class6_Sub12_Sub1) this.aClass212_14.method5106(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class309 local52 = Static590.method6852(this.aClass251_73, arg0, arg2);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method6851();
			this.aClass212_14.method5104(local24, local31);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray66.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
