import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class31 {

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!bf;")
	private final Class10 aClass10_3 = new Class10(256);

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!bf;")
	private final Class10 aClass10_4 = new Class10(256);

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!ga;")
	private final Class30 aClass30_21;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "Lclient!ga;")
	private final Class30 aClass30_20;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!ga;Lclient!ga;)V")
	public Class31(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class30 arg1) {
		this.aClass30_21 = arg1;
		this.aClass30_20 = arg0;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIB[I)Lclient!gf;")
	private Class1_Sub9_Sub1 method992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = (arg0 >>> 12 | (arg0 & 0xB0000FFF) << 4) ^ arg1;
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(26) long local26 = (long) local21 ^ 0x100000000L;
		@Pc(33) Class1_Sub9_Sub1 local33 = (Class1_Sub9_Sub1) this.aClass10_4.method256(local26);
		if (local33 != null) {
			return local33;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(58) Class1_Sub15 local58 = (Class1_Sub15) this.aClass10_3.method256(local26);
			if (local58 == null) {
				local58 = Static117.method2072(this.aClass30_21, arg0, arg1);
				if (local58 == null) {
					return null;
				}
				this.aClass10_3.method263(local58, local26);
			}
			local33 = local58.method2067(arg2);
			if (local33 == null) {
				return null;
			} else {
				local58.method3141();
				this.aClass10_4.method263(local33, local26);
				return local33;
			}
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([IIII)Lclient!gf;")
	private Class1_Sub9_Sub1 method993(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(20) int local20 = arg1 ^ ((arg2 & 0xFFF) << 4 | arg2 >>> 12);
		@Pc(26) int local26 = local20 | arg2 << 16;
		@Pc(29) long local29 = (long) local26;
		@Pc(36) Class1_Sub9_Sub1 local36 = (Class1_Sub9_Sub1) this.aClass10_4.method256(local29);
		if (local36 != null) {
			return local36;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(54) Class6 local54 = Static183.method175(this.aClass30_20, arg2, arg1);
			if (local54 == null) {
				return null;
			}
			local36 = local54.method173();
			this.aClass10_4.method263(local36, local29);
			if (arg0 != null) {
				arg0[0] -= local36.aByteArray13.length;
			}
			return local36;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI[I)Lclient!gf;")
	public Class1_Sub9_Sub1 method995(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass30_20.method1291() == 1) {
			return this.method993(arg1, arg0, 0);
		} else if (this.aClass30_20.method1278(arg0) == 1) {
			return this.method993(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([III)Lclient!gf;")
	public Class1_Sub9_Sub1 method997(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (this.aClass30_21.method1291() == 1) {
			return this.method992(0, arg1, arg0);
		} else if (this.aClass30_21.method1278(arg1) == 1) {
			return this.method992(arg1, 0, arg0);
		} else {
			throw new RuntimeException();
		}
	}
}
