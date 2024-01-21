import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kh")
public final class Class50 {

	@OriginalMember(owner = "client!kh", name = "s", descriptor = "Lclient!wh;")
	private final Class99 aClass99_8 = new Class99(256);

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "Lclient!wh;")
	private final Class99 aClass99_9 = new Class99(256);

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!sd;")
	private final Class60 aClass60_22;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!sd;")
	private final Class60 aClass60_21;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lclient!sd;Lclient!sd;)V")
	public Class50(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1) {
		this.aClass60_22 = arg1;
		this.aClass60_21 = arg0;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([III)Lclient!mg;")
	public Class1_Sub19_Sub1 method1894(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass60_21.method2330() == 1) {
			return this.method1900(arg1, arg0, 0);
		} else if (this.aClass60_21.method2342(arg1) == 1) {
			return this.method1900(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[II)Lclient!mg;")
	private Class1_Sub19_Sub1 method1898(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg2 ^ (arg0 >>> 12 | (arg0 & 0xB0000FFF) << 4);
		@Pc(26) int local26 = local20 | arg0 << 16;
		@Pc(35) long local35 = (long) local26 ^ 0x100000000L;
		@Pc(42) Class1_Sub19_Sub1 local42 = (Class1_Sub19_Sub1) this.aClass99_9.method3292(local35);
		if (local42 != null) {
			return local42;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(61) Class1_Sub18 local61 = (Class1_Sub18) this.aClass99_8.method3292(local35);
			if (local61 == null) {
				local61 = Static110.method2013(this.aClass60_22, arg0, arg2);
				if (local61 == null) {
					return null;
				}
				this.aClass99_8.method3290(local61, local35);
			}
			local42 = local61.method2012(arg1);
			if (local42 == null) {
				return null;
			} else {
				local61.method3295();
				this.aClass99_9.method3290(local42, local35);
				return local42;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI[I)Lclient!mg;")
	public Class1_Sub19_Sub1 method1899(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass60_22.method2330() == 1) {
			return this.method1898(0, arg1, arg0);
		} else if (this.aClass60_22.method2342(arg0) == 1) {
			return this.method1898(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ[II)Lclient!mg;")
	private Class1_Sub19_Sub1 method1900(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0x30000FFF) << 4 | arg2 >>> 12) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub19_Sub1 local31 = (Class1_Sub19_Sub1) this.aClass99_9.method3292(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class84 local52 = Static218.method2937(this.aClass60_21, arg2, arg0);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method2938();
			this.aClass99_9.method3290(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray35.length;
			}
			return local31;
		} else {
			return null;
		}
	}
}
