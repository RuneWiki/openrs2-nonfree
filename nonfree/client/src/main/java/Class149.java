import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class149 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "Lclient!vd;")
	private Class140 aClass140_19 = new Class140(256);

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "Lclient!vd;")
	private Class140 aClass140_20 = new Class140(256);

	@OriginalMember(owner = "client!wg", name = "k", descriptor = "Lclient!hc;")
	private Class51 aClass51_86;

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "Lclient!hc;")
	private Class51 aClass51_85;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!hc;Lclient!hc;)V")
	public Class149(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class51 arg1) {
		this.aClass51_86 = arg1;
		this.aClass51_85 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(III[I)Lclient!ec;")
	private Class1_Sub7_Sub1 method4157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(25) int local25 = arg0 ^ (arg1 << 4 & 0xFFF5 | arg1 >>> 12);
		@Pc(31) int local31 = local25 | arg1 << 16;
		@Pc(34) long local34 = (long) local31;
		@Pc(41) Class1_Sub7_Sub1 local41 = (Class1_Sub7_Sub1) this.aClass140_20.method4014(local34);
		if (local41 != null) {
			return local41;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(59) Class76 local59 = Static273.method2416(this.aClass51_85, arg1, arg0);
			if (local59 == null) {
				return null;
			}
			local41 = local59.method2415();
			this.aClass140_20.method4011(local41, local34);
			if (arg2 != null) {
				arg2[0] -= local41.aByteArray21.length;
			}
			return local41;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[IIB)Lclient!ec;")
	private Class1_Sub7_Sub1 method4160(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = arg2 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFF5);
		@Pc(21) int local21 = local11 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub7_Sub1 local33 = (Class1_Sub7_Sub1) this.aClass140_20.method4014(local26);
		if (local33 != null) {
			return local33;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(55) Class1_Sub18 local55 = (Class1_Sub18) this.aClass140_19.method4014(local26);
			if (local55 == null) {
				local55 = Static130.method2472(this.aClass51_86, arg0, arg2);
				if (local55 == null) {
					return null;
				}
				this.aClass140_19.method4011(local55, local26);
			}
			local33 = local55.method2474(arg1);
			if (local33 == null) {
				return null;
			} else {
				local55.method4186();
				this.aClass140_20.method4011(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[II)Lclient!ec;")
	public Class1_Sub7_Sub1 method4161(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass51_86.method1859() == 1) {
			return this.method4160(0, arg0, arg1);
		} else if (this.aClass51_86.method1875(arg1) == 1) {
			return this.method4160(arg1, arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[IB)Lclient!ec;")
	public Class1_Sub7_Sub1 method4162(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aClass51_85.method1859() == 1) {
			return this.method4157(arg0, 0, arg1);
		} else if (this.aClass51_85.method1875(arg0) == 1) {
			return this.method4157(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
