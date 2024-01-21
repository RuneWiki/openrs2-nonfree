import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class13 {

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Lclient!db;")
	private final Class16 aClass16_2 = new Class16(256);

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Lclient!db;")
	private final Class16 aClass16_3 = new Class16(256);

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!c;")
	private final Class10 aClass10_18;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Lclient!c;")
	private final Class10 aClass10_19;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!c;Lclient!c;)V")
	public Class13(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1) {
		this.aClass10_18 = arg1;
		this.aClass10_19 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([IIII)Lclient!qe;")
	private Class2_Sub19_Sub1 method348(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg1 << 4 & 0xFFF9 | arg1 >>> 12);
		@Pc(21) int local21 = local15 | arg1 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class2_Sub19_Sub1 local31 = (Class2_Sub19_Sub1) this.aClass16_3.method479(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(54) Class86 local54 = Static189.method2754(this.aClass10_19, arg1, arg2);
			if (local54 == null) {
				return null;
			}
			local31 = local54.method2751();
			this.aClass16_3.method480(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray38.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([III)Lclient!qe;")
	public Class2_Sub19_Sub1 method349(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass10_19.method1599() == 1) {
			return this.method348(arg0, 0, arg1);
		} else if (this.aClass10_19.method1588(arg1) == 1) {
			return this.method348(arg0, arg1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(II[II)Lclient!qe;")
	private Class2_Sub19_Sub1 method350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | arg0 << 4 & 0xFFFF) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(31) long local31 = (long) local21 ^ 0x100000000L;
		@Pc(38) Class2_Sub19_Sub1 local38 = (Class2_Sub19_Sub1) this.aClass16_3.method479(local31);
		if (local38 != null) {
			return local38;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(57) Class2_Sub18 local57 = (Class2_Sub18) this.aClass16_2.method479(local31);
			if (local57 == null) {
				local57 = Static125.method1941(this.aClass10_18, arg0, arg1);
				if (local57 == null) {
					return null;
				}
				this.aClass16_2.method480(local57, local31);
			}
			local38 = local57.method1946(arg2);
			if (local38 == null) {
				return null;
			} else {
				local57.method2808();
				this.aClass16_3.method480(local38, local31);
				return local38;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "([III)Lclient!qe;")
	public Class2_Sub19_Sub1 method352(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass10_18.method1599() == 1) {
			return this.method350(0, arg1, arg0);
		} else if (this.aClass10_18.method1588(arg1) == 1) {
			return this.method350(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
