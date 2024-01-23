import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class66 {

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "Lclient!qc;")
	private Class90 aClass90_10 = new Class90(256);

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "Lclient!qc;")
	private Class90 aClass90_11 = new Class90(256);

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "Lclient!pa;")
	private Class86 aClass86_39;

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "Lclient!pa;")
	private Class86 aClass86_40;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lclient!pa;Lclient!pa;)V")
	public Class66(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1) {
		this.aClass86_39 = arg0;
		this.aClass86_40 = arg1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([III)Lclient!qa;")
	public Class1_Sub15_Sub1 method1842(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass86_39.method3319() == 1) {
			return this.method1845(arg1, 0, arg0);
		} else if (this.aClass86_39.method3323(arg1) == 1) {
			return this.method1845(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(BII[I)Lclient!qa;")
	private Class1_Sub15_Sub1 method1845(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(11) int local11 = (arg1 >>> 12 | (arg1 & 0xF0000FFF) << 4) ^ arg0;
		@Pc(17) int local17 = local11 | arg1 << 16;
		@Pc(34) long local34 = (long) local17;
		@Pc(41) Class1_Sub15_Sub1 local41 = (Class1_Sub15_Sub1) this.aClass90_11.method2819(local34);
		if (local41 != null) {
			return local41;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(59) Class71 local59 = Static240.method2006(this.aClass86_39, arg1, arg0);
			if (local59 == null) {
				return null;
			}
			local41 = local59.method2008();
			this.aClass90_11.method2817(local41, local34);
			if (arg2 != null) {
				arg2[0] -= local41.aByteArray49.length;
			}
			return local41;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ[I)Lclient!qa;")
	public Class1_Sub15_Sub1 method1846(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass86_40.method3319() == 1) {
			return this.method1850(0, arg0, arg1);
		} else if (this.aClass86_40.method3323(arg0) == 1) {
			return this.method1850(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBI[I)Lclient!qa;")
	private Class1_Sub15_Sub1 method1850(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ ((arg0 & 0x10000FFF) << 4 | arg0 >>> 12);
		@Pc(32) int local32 = local15 | arg0 << 16;
		@Pc(37) long local37 = (long) local32 ^ 0x100000000L;
		@Pc(44) Class1_Sub15_Sub1 local44 = (Class1_Sub15_Sub1) this.aClass90_11.method2819(local37);
		if (local44 != null) {
			return local44;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(66) Class1_Sub23 local66 = (Class1_Sub23) this.aClass90_10.method2819(local37);
			if (local66 == null) {
				local66 = Static167.method2760(this.aClass86_40, arg0, arg1);
				if (local66 == null) {
					return null;
				}
				this.aClass90_10.method2817(local66, local37);
			}
			local44 = local66.method2756(arg2);
			if (local44 == null) {
				return null;
			} else {
				local66.method3525();
				this.aClass90_11.method2817(local44, local37);
				return local44;
			}
		} else {
			return null;
		}
	}
}
