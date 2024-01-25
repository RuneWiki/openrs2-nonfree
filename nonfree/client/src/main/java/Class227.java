import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class227 {

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "Lclient!ew;")
	private final Class72 aClass72_38 = new Class72(256);

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "Lclient!ew;")
	private final Class72 aClass72_39 = new Class72(256);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "Lclient!dk;")
	private final Class54 aClass54_102;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "Lclient!dk;")
	private final Class54 aClass54_103;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!dk;Lclient!dk;)V")
	public Class227(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1) {
		this.aClass54_102 = arg0;
		this.aClass54_103 = arg1;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZI[II)Lclient!he;")
	private Class2_Sub22_Sub1 method4842(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = arg0 ^ (arg2 << 4 & 0xFFF4 | arg2 >>> 12);
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class2_Sub22_Sub1 local31 = (Class2_Sub22_Sub1) this.aClass72_39.method1659(local24);
		if (local31 != null) {
			return local31;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(49) Class106 local49 = Static465.method2204(this.aClass54_102, arg2, arg0);
			if (local49 == null) {
				return null;
			}
			local31 = local49.method2206();
			this.aClass72_39.method1653(local31, local24);
			if (arg1 != null) {
				arg1[0] -= local31.aByteArray18.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II[I)Lclient!he;")
	public Class2_Sub22_Sub1 method4843(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass54_102.method1107() == 1) {
			return this.method4842(arg0, arg1, 0);
		} else if (this.aClass54_102.method1123(arg0) == 1) {
			return this.method4842(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "([III)Lclient!he;")
	public Class2_Sub22_Sub1 method4844(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass54_103.method1107() == 1) {
			return this.method4846(0, arg0, arg1);
		} else if (this.aClass54_103.method1123(arg1) == 1) {
			return this.method4846(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I[III)Lclient!he;")
	private Class2_Sub22_Sub1 method4846(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | arg0 << 4 & 0xFFF3) ^ arg2;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class2_Sub22_Sub1 local33 = (Class2_Sub22_Sub1) this.aClass72_39.method1659(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(52) Class2_Sub31 local52 = (Class2_Sub31) this.aClass72_38.method1659(local26);
			if (local52 == null) {
				local52 = Static262.method3519(this.aClass54_103, arg0, arg2);
				if (local52 == null) {
					return null;
				}
				this.aClass72_38.method1653(local52, local26);
			}
			local33 = local52.method3512(arg1);
			if (local33 == null) {
				return null;
			} else {
				local52.method5703();
				this.aClass72_39.method1653(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}
}
