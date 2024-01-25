import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class371 {

	@OriginalMember(owner = "client!vda", name = "x", descriptor = "I")
	public int anInt9768;

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "Lclient!pja;")
	private final Class279 aClass279_58 = new Class279(64);

	@OriginalMember(owner = "client!vda", name = "q", descriptor = "Lclient!pja;")
	public final Class279 aClass279_59 = new Class279(50);

	@OriginalMember(owner = "client!vda", name = "u", descriptor = "Lclient!jga;")
	public final Class192 aClass192_1 = new Class192(250);

	@OriginalMember(owner = "client!vda", name = "w", descriptor = "Lclient!fc;")
	private final Class114 aClass114_1 = new Class114();

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "Lclient!gj;")
	public final Class143 aClass143_135;

	@OriginalMember(owner = "client!vda", name = "z", descriptor = "Lclient!hu;")
	private final Class165 aClass165_2;

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "I")
	public final int anInt9761;

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "Z")
	private boolean aBoolean719;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "Lclient!gj;")
	private final Class143 aClass143_134;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
	public final int anInt9754;

	@OriginalMember(owner = "client!vda", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray71;

	@OriginalMember(owner = "client!vda", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray70;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!im;IZLclient!hu;Lclient!gj;Lclient!gj;)V")
	public Class371(@OriginalArg(0) Class181 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class165 arg3, @OriginalArg(4) Class143 arg4, @OriginalArg(5) Class143 arg5) {
		this.aClass143_135 = arg5;
		this.aClass165_2 = arg3;
		this.anInt9761 = arg1;
		this.aBoolean719 = arg2;
		this.aClass143_134 = arg4;
		if (this.aClass143_134 == null) {
			this.anInt9754 = 0;
		} else {
			@Pc(54) int local54 = this.aClass143_134.method3116() - 1;
			this.anInt9754 = local54 * 256 + this.aClass143_134.method3123(local54);
		}
		this.aStringArray71 = new String[] { null, null, Static569.aClass335_8.method7694(this.anInt9761), null, null };
		this.aStringArray70 = new String[] { null, null, null, null, Static569.aClass335_9.method7694(this.anInt9761) };
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)V")
	public void method8304(@OriginalArg(0) int arg0) {
		this.anInt9768 = arg0;
		@Pc(9) Class279 local9 = this.aClass279_59;
		synchronized (this.aClass279_59) {
			this.aClass279_59.method6638();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BI)Lclient!gn;")
	public Class146 method8305(@OriginalArg(1) int arg0) {
		@Pc(8) Class279 local8 = this.aClass279_58;
		@Pc(18) Class146 local18;
		synchronized (this.aClass279_58) {
			local18 = (Class146) this.aClass279_58.method6631((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class143 local31 = this.aClass143_134;
		@Pc(44) byte[] local44;
		synchronized (this.aClass143_134) {
			local44 = this.aClass143_134.method3125(Static645.method8451(arg0), Static214.method3384(arg0));
		}
		local18 = new Class146();
		local18.anInt3691 = arg0;
		local18.aClass371_1 = this;
		local18.aStringArray29 = new String[] { null, null, Static569.aClass335_8.method7694(this.anInt9761), null, null };
		local18.aStringArray28 = new String[] { null, null, null, null, Static569.aClass335_9.method7694(this.anInt9761) };
		if (local44 != null) {
			local18.method3208(new Class3_Sub17(local44));
		}
		local18.method3202();
		if (local18.anInt3673 != -1) {
			local18.method3200(this.method8305(local18.anInt3709), this.method8305(local18.anInt3673));
		}
		if (local18.anInt3727 != -1) {
			local18.method3203(this.method8305(local18.anInt3727), this.method8305(local18.anInt3663));
		}
		if (local18.anInt3726 != -1) {
			local18.method3199(this.method8305(local18.anInt3726), this.method8305(local18.anInt3687));
		}
		if (!this.aBoolean719 && local18.aBoolean291) {
			local18.aString46 = Static569.aClass335_5.method7694(this.anInt9761);
			local18.aStringArray29 = this.aStringArray71;
			local18.aBoolean290 = false;
			local18.aStringArray28 = this.aStringArray70;
			local18.anInt3715 = 0;
			local18.anIntArray253 = null;
			if (local18.aClass62_20 != null) {
				@Pc(223) boolean local223 = false;
				for (@Pc(228) Class3 local228 = local18.aClass62_20.method1680(); local228 != null; local228 = local18.aClass62_20.method1681()) {
					@Pc(238) Class328 local238 = this.aClass165_2.method3812((int) local228.aLong309);
					if (local238.aBoolean663) {
						local228.method8770();
					} else {
						local223 = true;
					}
				}
				if (!local223) {
					local18.aClass62_20 = null;
				}
			}
		}
		@Pc(263) Class279 local263 = this.aClass279_58;
		synchronized (this.aClass279_58) {
			this.aClass279_58.method6635(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIILclient!ha;Lclient!qha;I)Lclient!nf;")
	public Class102 method8306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class16 arg4, @OriginalArg(6) Class293 arg5, @OriginalArg(7) int arg6) {
		this.aClass114_1.anInt2885 = arg2;
		this.aClass114_1.anInt2884 = arg0;
		this.aClass114_1.aBoolean231 = arg5 != null;
		this.aClass114_1.anInt2878 = arg3;
		this.aClass114_1.anInt2883 = arg4.anInt9594;
		this.aClass114_1.anInt2882 = arg6;
		this.aClass114_1.anInt2881 = arg1;
		return (Class102) this.aClass192_1.method4419(this.aClass114_1);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	public void method8307() {
		@Pc(14) Class279 local14 = this.aClass279_58;
		synchronized (this.aClass279_58) {
			this.aClass279_58.method6637();
		}
		local14 = this.aClass279_59;
		synchronized (this.aClass279_59) {
			this.aClass279_59.method6637();
		}
		@Pc(44) Class192 local44 = this.aClass192_1;
		synchronized (this.aClass192_1) {
			this.aClass192_1.method4420();
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
	public void method8309() {
		@Pc(2) Class279 local2 = this.aClass279_59;
		synchronized (this.aClass279_59) {
			this.aClass279_59.method6638();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B)V")
	public void method8310() {
		@Pc(2) Class192 local2 = this.aClass192_1;
		synchronized (this.aClass192_1) {
			this.aClass192_1.method4422();
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(II)V")
	public void method8312() {
		@Pc(2) Class279 local2 = this.aClass279_58;
		synchronized (this.aClass279_58) {
			this.aClass279_58.method6630(5);
		}
		local2 = this.aClass279_59;
		synchronized (this.aClass279_59) {
			this.aClass279_59.method6630(5);
		}
		@Pc(44) Class192 local44 = this.aClass192_1;
		synchronized (this.aClass192_1) {
			this.aClass192_1.method4425();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZZIILclient!da;Lclient!ha;Lclient!qha;ILclient!ha;BII)Lclient!nf;")
	public Class102 method8313(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class69 arg4, @OriginalArg(5) Class16 arg5, @OriginalArg(6) Class293 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class16 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(22) Class102 local22 = this.method8306(arg2, arg3, arg7, arg9, arg5, arg6, arg10);
		if (local22 != null) {
			return local22;
		}
		@Pc(31) Class146 local31 = this.method8305(arg2);
		if (arg9 > 1 && local31.anIntArray255 != null) {
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < 10; local43++) {
				if (arg9 >= local31.anIntArray252[local43] && local31.anIntArray252[local43] != 0) {
					local41 = local31.anIntArray255[local43];
				}
			}
			if (local41 != -1) {
				local31 = this.method8305(local41);
			}
		}
		@Pc(95) int[] local95 = local31.method3191(arg7, arg4, arg8, arg5, arg1, arg6, arg10, arg3, arg9);
		if (local95 == null) {
			return null;
		}
		@Pc(110) Class102 local110;
		if (arg0) {
			local110 = arg8.method8131(36, local95, 32, 36);
		} else {
			local110 = arg5.method8131(36, local95, 32, 36);
		}
		if (!arg0) {
			@Pc(127) Class114 local127 = new Class114();
			local127.anInt2883 = arg5.anInt9594;
			local127.aBoolean231 = arg6 != null;
			local127.anInt2885 = arg7;
			local127.anInt2882 = arg10;
			local127.anInt2884 = arg2;
			local127.anInt2878 = arg9;
			local127.anInt2881 = arg3;
			this.aClass192_1.method4423(local127, local110);
		}
		return local110;
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
	public void method8314() {
		@Pc(2) Class279 local2 = this.aClass279_58;
		synchronized (this.aClass279_58) {
			this.aClass279_58.method6638();
		}
		local2 = this.aClass279_59;
		synchronized (this.aClass279_59) {
			this.aClass279_59.method6638();
		}
		@Pc(44) Class192 local44 = this.aClass192_1;
		synchronized (this.aClass192_1) {
			this.aClass192_1.method4422();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IZ)V")
	public void method8315(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean719 != arg0) {
			this.aBoolean719 = arg0;
			this.method8314();
		}
	}
}
