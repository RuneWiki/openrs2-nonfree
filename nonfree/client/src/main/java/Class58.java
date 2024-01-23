import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class58 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "Lclient!il;")
	private Class86 aClass86_9 = new Class86(256);

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!il;")
	private Class86 aClass86_10 = new Class86(256);

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!nm;")
	private Class119 aClass119_35;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!nm;")
	private Class119 aClass119_34;

	@OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lclient!nm;Lclient!nm;)V")
	public Class58(@OriginalArg(0) Class119 arg0, @OriginalArg(1) Class119 arg1) {
		this.aClass119_35 = arg0;
		this.aClass119_34 = arg1;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([III)Lclient!pc;")
	public Class1_Sub23_Sub1 method1664(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass119_34.method3234() == 1) {
			return this.method1667(0, arg0, arg1);
		} else if (this.aClass119_34.method3217(arg1) == 1) {
			return this.method1667(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([IIBI)Lclient!pc;")
	private Class1_Sub23_Sub1 method1665(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = ((arg1 & 0xC0000FFF) << 4 | arg1 >>> 12) ^ arg2;
		@Pc(17) int local17 = local11 | arg1 << 16;
		@Pc(24) long local24 = (long) local17;
		@Pc(31) Class1_Sub23_Sub1 local31 = (Class1_Sub23_Sub1) this.aClass86_10.method2136(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(54) Class101 local54 = Static321.method2528(this.aClass119_35, arg1, arg2);
			if (local54 == null) {
				return null;
			}
			local31 = local54.method2529();
			this.aClass86_10.method2144(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray133.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BI[II)Lclient!pc;")
	private Class1_Sub23_Sub1 method1667(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg0 << 4 & 0xFFF4 | arg0 >>> 12) ^ arg2;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(35) Class1_Sub23_Sub1 local35 = (Class1_Sub23_Sub1) this.aClass86_10.method2136(local26);
		if (local35 != null) {
			return local35;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(57) Class1_Sub6 local57 = (Class1_Sub6) this.aClass86_9.method2136(local26);
			if (local57 == null) {
				local57 = Static32.method546(this.aClass119_34, arg0, arg2);
				if (local57 == null) {
					return null;
				}
				this.aClass86_9.method2144(local57, local26);
			}
			local35 = local57.method549(arg1);
			if (local35 == null) {
				return null;
			} else {
				local57.method4573();
				this.aClass86_10.method2144(local35, local26);
				return local35;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(II[I)Lclient!pc;")
	public Class1_Sub23_Sub1 method1669(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass119_35.method3234() == 1) {
			return this.method1665(arg1, 0, arg0);
		} else if (this.aClass119_35.method3217(arg0) == 1) {
			return this.method1665(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
