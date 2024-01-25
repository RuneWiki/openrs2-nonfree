import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class269 {

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "Lclient!mn;")
	private final Class167 aClass167_37 = new Class167(256);

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "Lclient!mn;")
	private final Class167 aClass167_38 = new Class167(256);

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "Lclient!ph;")
	private final Class187 aClass187_131;

	@OriginalMember(owner = "client!wo", name = "h", descriptor = "Lclient!ph;")
	private final Class187 aClass187_132;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!ph;Lclient!ph;)V")
	public Class269(@OriginalArg(0) Class187 arg0, @OriginalArg(1) Class187 arg1) {
		this.aClass187_131 = arg1;
		this.aClass187_132 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[II)Lclient!wq;")
	public Class10_Sub25_Sub1 method6019(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass187_131.method4302() == 1) {
			return this.method6021(0, arg0, arg1);
		} else if (this.aClass187_131.method4306(arg1) == 1) {
			return this.method6021(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z[II)Lclient!wq;")
	public Class10_Sub25_Sub1 method6020(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass187_132.method4302() == 1) {
			return this.method6023(0, arg1, arg0);
		} else if (this.aClass187_132.method4306(arg1) == 1) {
			return this.method6023(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II[II)Lclient!wq;")
	private Class10_Sub25_Sub1 method6021(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg0 & 0xE0000FFF) << 4 | arg0 >>> 12) ^ arg2;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class10_Sub25_Sub1 local33 = (Class10_Sub25_Sub1) this.aClass167_38.method3709(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class10_Sub17 local52 = (Class10_Sub17) this.aClass167_37.method3709(local26);
			if (local52 == null) {
				local52 = Static112.method1969(this.aClass187_131, arg0, arg2);
				if (local52 == null) {
					return null;
				}
				this.aClass167_37.method3705(local52, local26);
			}
			local33 = local52.method1960(arg1);
			if (local33 == null) {
				return null;
			} else {
				local52.method6033();
				this.aClass167_38.method3705(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(II[II)Lclient!wq;")
	private Class10_Sub25_Sub1 method6023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | (arg0 & 0x10000FFF) << 4) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class10_Sub25_Sub1 local31 = (Class10_Sub25_Sub1) this.aClass167_38.method3709(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(54) Class251 local54 = Static469.method5444(this.aClass187_132, arg0, arg1);
			if (local54 == null) {
				return null;
			}
			local31 = local54.method5445();
			this.aClass167_38.method3705(local31, local24);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray94.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
