import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public final class Class138 {

	@OriginalMember(owner = "client!hs", name = "b", descriptor = "Lclient!eq;")
	private final Class99 aClass99_36 = new Class99(256);

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "Lclient!eq;")
	private final Class99 aClass99_37 = new Class99(256);

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "Lclient!in;")
	private final Class157 aClass157_112;

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "Lclient!in;")
	private final Class157 aClass157_113;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Lclient!in;Lclient!in;)V")
	public Class138(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class157 arg1) {
		this.aClass157_112 = arg1;
		this.aClass157_113 = arg0;
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[III)Lclient!ob;")
	private Class2_Sub29_Sub1 method4286(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFF1);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class2_Sub29_Sub1 local31 = (Class2_Sub29_Sub1) this.aClass99_37.method3056(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(49) Class61 local49 = Static647.method2140(this.aClass157_113, arg2, arg0);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method2137();
			this.aClass99_37.method3059(local24, local31);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray97.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(I[II)Lclient!ob;")
	public Class2_Sub29_Sub1 method4287(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass157_113.method4568() == 1) {
			return this.method4286(arg0, arg1, 0);
		} else if (this.aClass157_113.method4561(arg0) == 1) {
			return this.method4286(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "([III)Lclient!ob;")
	public Class2_Sub29_Sub1 method4288(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass157_112.method4568() == 1) {
			return this.method4289(arg1, 0, arg0);
		} else if (this.aClass157_112.method4561(arg1) == 1) {
			return this.method4289(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIB[I)Lclient!ob;")
	private Class2_Sub29_Sub1 method4289(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg0 ^ ((arg1 & 0xFFF) << 4 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(34) long local34 = (long) local21 ^ 0x100000000L;
		@Pc(41) Class2_Sub29_Sub1 local41 = (Class2_Sub29_Sub1) this.aClass99_37.method3056(local34);
		if (local41 != null) {
			return local41;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(60) Class2_Sub22 local60 = (Class2_Sub22) this.aClass99_36.method3056(local34);
			if (local60 == null) {
				local60 = Static220.method4254(this.aClass157_112, arg1, arg0);
				if (local60 == null) {
					return null;
				}
				this.aClass99_36.method3059(local34, local60);
			}
			local41 = local60.method4250(arg2);
			if (local41 == null) {
				return null;
			} else {
				local60.method9253();
				this.aClass99_37.method3059(local34, local41);
				return local41;
			}
		} else {
			return null;
		}
	}
}
