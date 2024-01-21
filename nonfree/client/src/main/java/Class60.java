import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class60 {

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Lclient!bd;")
	private final Class7 aClass7_11 = new Class7(256);

	@OriginalMember(owner = "client!q", name = "C", descriptor = "Lclient!kb;")
	private final Class41 aClass41_22;

	@OriginalMember(owner = "client!q", name = "x", descriptor = "Lclient!kb;")
	private final Class41 aClass41_21;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!kb;Lclient!kb;)V")
	public Class60(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1) {
		this.aClass41_22 = arg1;
		this.aClass41_21 = arg0;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "([IZII)Lclient!vb;")
	private Class1_Sub9_Sub1 method1634(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11 = (arg2 >>> 12 | (arg2 & 0xA0000FFF) << 4) ^ arg1;
		@Pc(21) int local21 = local11 | arg2 << 16;
		@Pc(24) long local24 = (long) local21;
		@Pc(31) Class1_Sub9_Sub1 local31 = (Class1_Sub9_Sub1) this.aClass7_11.method287(local24);
		if (local31 != null) {
			return local31;
		} else if (arg0 == null || arg0[0] > 0) {
			@Pc(58) Class37 local58 = Static134.method1005(this.aClass41_21, arg2, arg1);
			if (local58 == null) {
				return null;
			}
			local31 = local58.method1007();
			this.aClass7_11.method291(local31, local24);
			if (arg0 != null) {
				arg0[0] -= local31.aByteArray39.length;
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[II)Lclient!vb;")
	public Class1_Sub9_Sub1 method1637(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		if (this.aClass41_21.method1720() == 1) {
			return this.method1634(arg0, arg1, 0);
		} else if (this.aClass41_21.method1700(arg1) == 1) {
			return this.method1634(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)Lclient!vb;")
	private Class1_Sub9_Sub1 method1638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		@Pc(15) int local15 = arg1 ^ (arg0 >>> 12 | (arg0 & 0x20000FFF) << 4);
		@Pc(21) int local21 = local15 | arg0 << 16;
		@Pc(35) long local35 = (long) local21 ^ 0x100000000L;
		@Pc(42) Class1_Sub9_Sub1 local42 = (Class1_Sub9_Sub1) this.aClass7_11.method287(local35);
		if (local42 != null) {
			return local42;
		} else if (arg2 == null || arg2[0] > 0) {
			@Pc(60) Class21 local60 = Static35.method674(this.aClass41_22, arg0, arg1);
			if (local60 == null) {
				return null;
			}
			local42 = local60.method678();
			this.aClass7_11.method291(local42, local35);
			if (arg2 != null) {
				arg2[0] -= local42.aByteArray39.length;
			}
			return local42;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II[I)Lclient!vb;")
	public Class1_Sub9_Sub1 method1639(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.aClass41_22.method1720() == 1) {
			return this.method1638(0, arg0, arg1);
		} else if (this.aClass41_22.method1700(arg0) == 1) {
			return this.method1638(arg0, 0, arg1);
		} else {
			throw new RuntimeException();
		}
	}
}
