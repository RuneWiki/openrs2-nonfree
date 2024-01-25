import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class84 {

	@OriginalMember(owner = "client!ee", name = "i", descriptor = "Lclient!kea;")
	private final Class187 aClass187_10 = new Class187(256);

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "Lclient!kea;")
	private final Class187 aClass187_11 = new Class187(256);

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!pu;")
	private final Class270 aClass270_25;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!pu;")
	private final Class270 aClass270_24;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!pu;Lclient!pu;)V")
	public Class84(@OriginalArg(0) Class270 arg0, @OriginalArg(1) Class270 arg1) {
		this.aClass270_25 = arg1;
		this.aClass270_24 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[I)Lclient!mm;")
	public Class1_Sub17_Sub1 method1741(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass270_25.method5674() == 1) {
			return this.method1743(arg1, arg0, 0);
		} else if (this.aClass270_25.method5685(arg0) == 1) {
			return this.method1743(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([IIII)Lclient!mm;")
	private Class1_Sub17_Sub1 method1743(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = ((arg2 & 0x10000FFF) << 4 | arg2 >>> 12) ^ arg1;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub17_Sub1 local33 = (Class1_Sub17_Sub1) this.aClass187_11.method3797(local26);
		if (local33 != null) {
			return local33;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(52) Class1_Sub50 local52 = (Class1_Sub50) this.aClass187_10.method3797(local26);
			if (local52 == null) {
				local52 = Static582.method7789(this.aClass270_25, arg2, arg1);
				if (local52 == null) {
					return null;
				}
				this.aClass187_10.method3795(local52, local26);
			}
			local33 = local52.method7787(arg0);
			if (local33 == null) {
				return null;
			} else {
				local52.method7859();
				this.aClass187_11.method3795(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[II)Lclient!mm;")
	private Class1_Sub17_Sub1 method1745(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg2 ^ (arg0 >>> 12 | (arg0 & 0x80000FFF) << 4);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub17_Sub1 local31 = (Class1_Sub17_Sub1) this.aClass187_11.method3797(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(60) Class90 local60 = Static600.method1812(this.aClass270_24, arg0, arg2);
			if (local60 == null) {
				return null;
			}
			local31 = local60.method1814();
			this.aClass187_11.method3795(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray67.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I[II)Lclient!mm;")
	public Class1_Sub17_Sub1 method1746(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass270_24.method5674() == 1) {
			return this.method1745(0, arg0, arg1);
		} else if (this.aClass270_24.method5685(arg1) == 1) {
			return this.method1745(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}
}
