import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class4 {

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!ah;")
	private final Class5 aClass5_1 = new Class5(256);

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "Lclient!ah;")
	private final Class5 aClass5_2 = new Class5(256);

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Lclient!vb;")
	private final Class82 aClass82_2;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!vb;")
	private final Class82 aClass82_1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!vb;Lclient!vb;)V")
	public Class4(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class82 arg1) {
		this.aClass82_2 = arg1;
		this.aClass82_1 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II[II)Lclient!dc;")
	private Class1_Sub11_Sub1 method125(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		@Pc(25) int local25 = arg0 ^ (arg2 >>> 12 | arg2 << 4 & 0xFFFE);
		@Pc(31) int local31 = local25 | arg2 << 16;
		@Pc(34) long local34 = (long) local31;
		@Pc(41) Class1_Sub11_Sub1 local41 = (Class1_Sub11_Sub1) this.aClass5_2.method134(local34);
		if (local41 != null) {
			return local41;
		} else if (arg1 == null || arg1[0] > 0) {
			@Pc(62) Class21 local62 = Static189.method825(this.aClass82_1, arg2, arg0);
			if (local62 == null) {
				return null;
			}
			local41 = local62.method826();
			this.aClass5_2.method138(local41, local34);
			if (arg1 != null) {
				arg1[0] -= local41.aByteArray4.length;
			}
			return local41;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B[II)Lclient!dc;")
	public Class1_Sub11_Sub1 method126(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass82_1.method2958() == 1) {
			return this.method125(arg1, arg0, 0);
		} else if (this.aClass82_1.method2966(arg1) == 1) {
			return this.method125(0, arg0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II[II)Lclient!dc;")
	private Class1_Sub11_Sub1 method130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		@Pc(19) int local19 = arg0 ^ (arg1 >>> 12 | (arg1 & 0x40000FFF) << 4);
		@Pc(25) int local25 = local19 | arg1 << 16;
		@Pc(30) long local30 = (long) local25 ^ 0x100000000L;
		@Pc(37) Class1_Sub11_Sub1 local37 = (Class1_Sub11_Sub1) this.aClass5_2.method134(local30);
		if (local37 != null) {
			return local37;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(59) Class1_Sub14 local59 = (Class1_Sub14) this.aClass5_1.method134(local30);
			if (local59 == null) {
				local59 = Static55.method982(this.aClass82_2, arg1, arg0);
				if (local59 == null) {
					return null;
				}
				this.aClass5_1.method138(local59, local30);
			}
			local37 = local59.method978(arg2);
			if (local37 == null) {
				return null;
			} else {
				local59.method3134();
				this.aClass5_2.method138(local37, local30);
				return local37;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "([III)Lclient!dc;")
	public Class1_Sub11_Sub1 method131(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass82_2.method2958() == 1) {
			return this.method130(arg1, 0, arg0);
		} else if (this.aClass82_2.method2966(arg1) == 1) {
			return this.method130(0, arg1, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
