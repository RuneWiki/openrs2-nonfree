import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class219 {

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "Z")
	public boolean aBoolean590 = true;

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	private int anInt6554 = -1;

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
	private final int anInt6553;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "Lclient!sc;")
	private final Class184 aClass184_2;

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_42;

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
	private final int anInt6555;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
	private final int anInt6552;

	@OriginalMember(owner = "client!wq", name = "i", descriptor = "Lclient!oc;")
	private Interface4 anInterface4_5;

	@OriginalMember(owner = "client!wq", name = "j", descriptor = "Lclient!io;")
	private Class47_Sub2 aClass47_Sub2_2;

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "Lclient!rq;")
	private Class18_Sub1 aClass18_Sub1_7;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!hj;Lclient!sc;Lclient!dl;IIIII)V")
	public Class219(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) Class184 arg1, @OriginalArg(2) Class41_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6553 = arg7;
		this.aClass184_2 = arg1;
		this.aClass2_Sub1_42 = arg0;
		this.anInt6555 = arg6;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(52) int local52;
		@Pc(54) int local54;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local52 = local29 + arg2.anInt6179 * (local33 + local35);
			for (local54 = 0; local54 < local23; local54++) {
				@Pc(63) short[] local63 = arg2.aShortArrayArray1[local52++];
				if (local63 != null) {
					local25 += local63.length;
				}
			}
		}
		this.anInt6552 = local25;
		if (local25 > 0) {
			@Pc(91) Class1_Sub7 local91 = new Class1_Sub7(local25 * 2);
			@Pc(124) short[] local124;
			@Pc(128) int local128;
			@Pc(115) int local115;
			if (this.aClass2_Sub1_42.aBoolean204) {
				for (local52 = 0; local52 < local23; local52++) {
					local54 = local29 + arg2.anInt6179 * (local33 + local52);
					for (local115 = 0; local115 < local23; local115++) {
						local124 = arg2.aShortArrayArray1[local54++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local91.method3128(local124[local128] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local52 = 0; local52 < local23; local52++) {
					local54 = arg2.anInt6179 * (local33 + local52) + local29;
					for (local115 = 0; local115 < local23; local115++) {
						local124 = arg2.aShortArrayArray1[local54++];
						if (local124 != null) {
							for (local128 = 0; local128 < local124.length; local128++) {
								local91.method3138(local124[local128] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface4_5 = this.aClass2_Sub1_42.method2318(local91.aByteArray58, local91.anInt3368, false);
			this.aClass47_Sub2_2 = new Class47_Sub2(this.aClass2_Sub1_42, 5123, null, 1);
		} else {
			this.aClass18_Sub1_7 = null;
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(III[B)V")
	public void method5721(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass47_Sub2_2.method4265(arg1, this.aClass2_Sub1_42.method2341(5123) * arg0);
		this.method5724(this.aClass47_Sub2_2, arg0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public void method5722() {
		this.method5724(this.anInterface4_5, this.anInt6552);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
	private void method5723() {
		if (!this.aBoolean590) {
			return;
		}
		this.aBoolean590 = false;
		@Pc(11) byte[] local11 = this.aClass184_2.aByteArray88;
		@Pc(13) byte[] local13 = Static354.aByteArray95;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.aClass184_2.anInt5449;
		@Pc(29) int local29 = this.aClass184_2.anInt5449 * this.anInt6553 + this.anInt6555;
		@Pc(31) int local31;
		@Pc(42) int local42;
		for (local31 = -128; local31 < 0; local31++) {
			local15 = (local15 << 8) - local15;
			for (local42 = -128; local42 < 0; local42++) {
				if (local11[local29++] != 0) {
					local15++;
				}
			}
			local29 += local19 - 128;
		}
		if (this.aClass18_Sub1_7 != null && this.anInt6554 == local15) {
			this.aBoolean590 = false;
			return;
		}
		this.anInt6554 = local15;
		local31 = 0;
		local29 = this.anInt6553 * local19 + this.anInt6555;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(105) int local105 = -128; local105 < 0; local105++) {
				if (local11[local29] == 0) {
					@Pc(120) int local120 = 0;
					if (local11[local29 - 1] != 0) {
						local120++;
					}
					if (local11[local29 + 1] != 0) {
						local120++;
					}
					if (local11[local29 - local19] != 0) {
						local120++;
					}
					if (local11[local19 + local29] != 0) {
						local120++;
					}
					local13[local31++] = (byte) (local120 * 17);
				} else {
					local13[local31++] = 68;
				}
				local29++;
			}
			local29 += this.aClass184_2.anInt5449 - 128;
		}
		if (this.aClass18_Sub1_7 == null) {
			this.aClass18_Sub1_7 = new Class18_Sub1(this.aClass2_Sub1_42, 3553, 6406, 128, 128, false, Static354.aByteArray95, 6406, false);
			this.aClass18_Sub1_7.method500(false, false);
			this.aClass18_Sub1_7.method4852(true);
		} else {
			this.aClass18_Sub1_7.method502(128, 128, Static354.aByteArray95, 6406, false);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!oc;I)V")
	private void method5724(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method5723();
			this.aClass2_Sub1_42.method2376(this.aClass18_Sub1_7);
			this.aClass2_Sub1_42.method2371(arg0, 0, arg1);
		}
	}
}
