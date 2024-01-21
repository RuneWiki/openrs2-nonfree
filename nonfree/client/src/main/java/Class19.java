import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ed")
public final class Class19 {

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!af;")
	private final Class7 aClass7_4 = new Class7(256);

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "Lclient!af;")
	private final Class7 aClass7_5 = new Class7(256);

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!dd;")
	private final Class14 aClass14_11;

	@OriginalMember(owner = "client!ed", name = "c", descriptor = "Lclient!dd;")
	private final Class14 aClass14_10;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!dd;Lclient!dd;)V")
	public Class19(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class14 arg1) {
		this.aClass14_11 = arg1;
		this.aClass14_10 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "([III)Lclient!p;")
	public Class8_Sub9_Sub1 method529(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass14_11.method1151() == 1) {
			return this.method535(0, arg1, arg0);
		} else if (this.aClass14_11.method1144(arg1) == 1) {
			return this.method535(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZII[I)Lclient!p;")
	private Class8_Sub9_Sub1 method530(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(11) int local11 = (arg0 << 4 & 0xFFFD | arg0 >>> 12) ^ arg1;
		@Pc(21) int local21 = local11 | arg0 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class8_Sub9_Sub1 local31 = (Class8_Sub9_Sub1) this.aClass7_5.method45(local24);
		if (local31 != null) {
			return local31;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(49) Class57 local49 = Static139.method1328(this.aClass14_10, arg0, arg1);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method1329();
			this.aClass7_5.method48(local31, local24);
			if (arg2 != null) {
				arg2[0] -= local31.aByteArray37.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "([III)Lclient!p;")
	public Class8_Sub9_Sub1 method532(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass14_10.method1151() == 1) {
			return this.method530(0, arg1, arg0);
		} else if (this.aClass14_10.method1144(arg1) == 1) {
			return this.method530(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[I)Lclient!p;")
	private Class8_Sub9_Sub1 method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(11) int local11 = (arg0 << 4 & 0xFFF8 | arg0 >>> 12) ^ arg1;
		@Pc(17) int local17 = local11 | arg0 << 16;
		@Pc(22) long local22 = (long) local17 ^ 0x100000000L;
		@Pc(33) Class8_Sub9_Sub1 local33 = (Class8_Sub9_Sub1) this.aClass7_5.method45(local22);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(62) Class8_Sub3 local62 = (Class8_Sub3) this.aClass7_4.method45(local22);
			if (local62 == null) {
				local62 = Static12.method209(this.aClass14_11, arg0, arg1);
				if (local62 == null) {
					return null;
				}
				this.aClass7_4.method48(local62, local22);
			}
			local33 = local62.method207(arg2);
			if (local33 == null) {
				return null;
			} else {
				local62.method2013();
				this.aClass7_5.method48(local33, local22);
				return local33;
			}
		} else {
			return null;
		}
	}
}
