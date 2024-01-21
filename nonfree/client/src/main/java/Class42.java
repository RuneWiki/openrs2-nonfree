import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class42 {

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!mc;")
	private final Class48 aClass48_8 = new Class48(256);

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "Lclient!mc;")
	private final Class48 aClass48_9 = new Class48(256);

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "Lclient!ie;")
	private final Class35 aClass35_17;

	@OriginalMember(owner = "client!kd", name = "t", descriptor = "Lclient!ie;")
	private final Class35 aClass35_16;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!ie;Lclient!ie;)V")
	public Class42(@OriginalArg(0) Class35 arg0, @OriginalArg(1) Class35 arg1) {
		this.aClass35_17 = arg0;
		this.aClass35_16 = arg1;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIBI)Lclient!m;")
	private Class1_Sub17_Sub1 method1112(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = arg1 ^ (arg2 >>> 12 | (arg2 & 0xC0000FFF) << 4);
		@Pc(17) int local17 = local11 | arg2 << 16;
		@Pc(20) long local20 = (long) local17;
		@Pc(31) Class1_Sub17_Sub1 local31 = (Class1_Sub17_Sub1) this.aClass48_9.method1340(local20);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class72 local52 = Static139.method1828(this.aClass35_17, arg2, arg1);
			if (local52 == null) {
				return null;
			}
			local31 = local52.method1826();
			this.aClass48_9.method1336(local20, local31);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray32.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[I)Lclient!m;")
	public Class1_Sub17_Sub1 method1114(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass35_17.method1568() == 1) {
			return this.method1112(arg1, arg0, 0);
		} else if (this.aClass35_17.method1579(arg0) == 1) {
			return this.method1112(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "([IIZ)Lclient!m;")
	public Class1_Sub17_Sub1 method1118(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass35_16.method1568() == 1) {
			return this.method1120(0, arg1, arg0);
		} else if (this.aClass35_16.method1579(arg1) == 1) {
			return this.method1120(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[II)Lclient!m;")
	private Class1_Sub17_Sub1 method1120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 << 4 & 0xFFF8 | arg0 >>> 12);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub17_Sub1 local33 = (Class1_Sub17_Sub1) this.aClass48_9.method1340(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(60) Class1_Sub24 local60 = (Class1_Sub24) this.aClass48_8.method1340(local26);
			if (local60 == null) {
				local60 = Static131.method2026(this.aClass35_16, arg0, arg1);
				if (local60 == null) {
					return null;
				}
				this.aClass48_8.method1336(local26, local60);
			}
			local33 = local60.method2035(arg2);
			if (local33 == null) {
				return null;
			} else {
				local60.method2039();
				this.aClass48_9.method1336(local26, local33);
				return local33;
			}
		} else {
			return null;
		}
	}
}
