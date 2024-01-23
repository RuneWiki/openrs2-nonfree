import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class39 {

	@OriginalMember(owner = "client!di", name = "p", descriptor = "Lclient!ol;")
	private Class117 aClass117_3 = new Class117(256);

	@OriginalMember(owner = "client!di", name = "r", descriptor = "Lclient!ol;")
	private Class117 aClass117_4 = new Class117(256);

	@OriginalMember(owner = "client!di", name = "o", descriptor = "Lclient!kb;")
	private Class83 aClass83_32;

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Lclient!kb;")
	private Class83 aClass83_31;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!kb;Lclient!kb;)V")
	public Class39(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class83 arg1) {
		this.aClass83_32 = arg1;
		this.aClass83_31 = arg0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(III[I)Lclient!qj;")
	private Class1_Sub4_Sub1 method1022(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(17) int local17 = arg1 ^ (arg0 >>> 12 | (arg0 & 0xC0000FFF) << 4);
		@Pc(27) int local27 = local17 | arg0 << 16;
		@Pc(30) long local30 = (long) local27;
		@Pc(37) Class1_Sub4_Sub1 local37 = (Class1_Sub4_Sub1) this.aClass117_4.method3438(local30);
		if (local37 != null) {
			return local37;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(59) Class118 local59 = Static307.method3527(this.aClass83_31, arg0, arg1);
			if (local59 == null) {
				return null;
			}
			local37 = local59.method3526();
			this.aClass117_4.method3445(local37, local30);
			if (arg2 != null) {
				arg2[0] -= local37.aByteArray65.length;
			}
			return local37;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB[I)Lclient!qj;")
	public Class1_Sub4_Sub1 method1023(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass83_32.method2327() == 1) {
			return this.method1028(arg0, arg1, 0);
		} else if (this.aClass83_32.method2317(arg0) == 1) {
			return this.method1028(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I[II)Lclient!qj;")
	public Class1_Sub4_Sub1 method1026(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass83_31.method2327() == 1) {
			return this.method1022(0, arg1, arg0);
		} else if (this.aClass83_31.method2317(arg1) == 1) {
			return this.method1022(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(I[IBI)Lclient!qj;")
	private Class1_Sub4_Sub1 method1028(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int local15 = (arg2 >>> 12 | (arg2 & 0x90000FFF) << 4) ^ arg0;
		@Pc(21) int local21 = local15 | arg2 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub4_Sub1 local33 = (Class1_Sub4_Sub1) this.aClass117_4.method3438(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(56) Class1_Sub13 local56 = (Class1_Sub13) this.aClass117_3.method3438(local26);
			if (local56 == null) {
				local56 = Static103.method1703(this.aClass83_32, arg2, arg0);
				if (local56 == null) {
					return null;
				}
				this.aClass117_3.method3445(local56, local26);
			}
			local33 = local56.method1704(arg1);
			if (local33 == null) {
				return null;
			} else {
				local56.method4742();
				this.aClass117_4.method3445(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}
}
