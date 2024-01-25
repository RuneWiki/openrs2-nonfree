import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class227 {

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!bj;")
	private final Class27 aClass27_35 = new Class27(256);

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "Lclient!bj;")
	private final Class27 aClass27_36 = new Class27(256);

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "Lclient!vh;")
	private final Class250 aClass250_79;

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "Lclient!vh;")
	private final Class250 aClass250_80;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!vh;Lclient!vh;)V")
	public Class227(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class250 arg1) {
		this.aClass250_79 = arg1;
		this.aClass250_80 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IB[I)Lclient!nv;")
	public Class1_Sub32_Sub1 method5315(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass250_80.method5666() == 1) {
			return this.method5321(0, arg0, arg1);
		} else if (this.aClass250_80.method5653(arg0) == 1) {
			return this.method5321(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I[IIB)Lclient!nv;")
	private Class1_Sub32_Sub1 method5316(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg2 & 0x80000FFF) << 4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub32_Sub1 local33 = (Class1_Sub32_Sub1) this.aClass27_36.method553(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class1_Sub15 local52 = (Class1_Sub15) this.aClass27_35.method553(local26);
			if (local52 == null) {
				local52 = Static137.method1943(this.aClass250_79, arg2, arg0);
				if (local52 == null) {
					return null;
				}
				this.aClass27_35.method564(local26, local52);
			}
			local33 = local52.method1938(arg1);
			if (local33 == null) {
				return null;
			} else {
				local52.method6071();
				this.aClass27_36.method564(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z[II)Lclient!nv;")
	public Class1_Sub32_Sub1 method5318(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass250_79.method5666() == 1) {
			return this.method5316(arg1, arg0, 0);
		} else if (this.aClass250_79.method5653(arg1) == 1) {
			return this.method5316(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(II[II)Lclient!nv;")
	private Class1_Sub32_Sub1 method5321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 << 4 & 0xFFFE | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub32_Sub1 local31 = (Class1_Sub32_Sub1) this.aClass27_36.method553(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(55) Class241 local55 = Static462.method5504(this.aClass250_80, arg0, arg1);
			if (local55 == null) {
				return null;
			}
			local31 = local55.method5507();
			this.aClass27_36.method564(local24, local31);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray62.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
