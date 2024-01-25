import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class3_Sub27_Sub1 extends Class3_Sub27 {

	@OriginalMember(owner = "client!jaa", name = "Db", descriptor = "I")
	public int anInt4825;

	@OriginalMember(owner = "client!jaa", name = "mb", descriptor = "Z")
	public boolean aBoolean399 = false;

	@OriginalMember(owner = "client!jaa", name = "Ab", descriptor = "Z")
	public boolean aBoolean401 = false;

	@OriginalMember(owner = "client!jaa", name = "rb", descriptor = "Z")
	public boolean aBoolean400 = false;

	@OriginalMember(owner = "client!jaa", name = "Cb", descriptor = "Z")
	public boolean aBoolean402 = false;

	@OriginalMember(owner = "client!jaa", name = "Hb", descriptor = "Z")
	public boolean aBoolean403 = false;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lclient!ufa;)V")
	public Class3_Sub27_Sub1(@OriginalArg(0) Class326 arg0) {
		super.anInt4805 = 3;
		super.anInt4803 = 3;
		this.method4057(true);
		super.aBoolean396 = true;
		super.anInt4786 = 0;
		super.aBoolean392 = false;
		super.aBoolean397 = true;
		super.aBoolean394 = true;
		super.aBoolean384 = true;
		super.aBoolean382 = true;
		super.aBoolean387 = true;
		super.anInt4795 = 127;
		super.anInt4785 = 2;
		super.aBoolean395 = true;
		super.anInt4790 = 0;
		super.anInt4793 = 127;
		super.aBoolean386 = true;
		super.anInt4797 = 127;
		super.anInt4798 = 0;
		super.anInt4787 = 0;
		super.aBoolean388 = true;
		super.anInt4789 = 1;
		super.anInt4806 = 127;
		super.aBoolean389 = true;
		super.anInt4799 = 127;
		super.anInt4794 = 0;
		if (Static188.anInt3749 >= 96) {
			Static551.method8044(2);
		} else {
			Static551.method8044(0);
		}
		super.anInt4801 = 2;
		super.anInt4807 = 0;
		super.aBoolean390 = false;
		super.anInt4809 = Static223.anInt4521 == 1 ? 2 : 4;
		super.aBoolean383 = true;
		super.aBoolean381 = false;
		super.aBoolean393 = true;
		super.anInt4792 = 2;
		super.anInt4791 = 0;
		super.anInt4802 = 0;
		super.aBoolean380 = false;
		@Pc(148) Class148 local148 = null;
		try {
			@Pc(154) Class66 local154 = arg0.method7783("", true);
			while (local154.anInt2308 == 0) {
				Static1.method125(1L);
			}
			if (local154.anInt2308 == 1) {
				local148 = (Class148) local154.anObject4;
				@Pc(178) byte[] local178 = new byte[(int) local148.method3371()];
				@Pc(192) int local192;
				for (@Pc(180) int local180 = 0; local180 < local178.length; local180 += local192) {
					local192 = local148.method3370(local178.length - local180, local178, local180);
					if (local192 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4047(new Class3_Sub7(local178));
			}
		} catch (@Pc(218) Exception local218) {
		}
		try {
			if (local148 != null) {
				local148.method3377();
			}
		} catch (@Pc(225) Exception local225) {
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(II)Z")
	public boolean method4040(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean402 ? super.aBoolean385 : true;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(BI)V")
	public void method4041(@OriginalArg(1) int arg0) {
		super.anInt4807 = arg0;
		Static502.aClass13Array1 = null;
		Static159.aBoolean265 = true;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(BII)I")
	private int method4042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) byte local16;
		if (arg1 > 20000) {
			local16 = 4;
			this.method4054();
		} else if (arg1 > 10000) {
			this.method4044();
			local16 = 3;
		} else if (arg1 > 5000) {
			this.method4052();
			local16 = 2;
		} else {
			local16 = 1;
			this.method4045();
		}
		if (Static275.anInt5823 != arg0) {
			super.anInt4792 = arg0;
			Static63.method1592(arg0);
		}
		this.method4043(Static480.aClass326_3);
		return local16;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!ufa;Z)V")
	public void method4043(@OriginalArg(0) Class326 arg0) {
		@Pc(11) Class148 local11 = null;
		try {
			@Pc(17) Class66 local17 = arg0.method7783("", true);
			while (local17.anInt2308 == 0) {
				Static1.method125(1L);
			}
			if (local17.anInt2308 == 1) {
				local11 = (Class148) local17.anObject4;
				@Pc(41) Class3_Sub7 local41 = new Class3_Sub7(Static90.method2064());
				this.method4038(local41);
				local11.method3373(local41.anInt7869, local41.aByteArray86, 0);
			}
		} catch (@Pc(55) Exception local55) {
		}
		try {
			if (local11 != null) {
				local11.method3377();
			}
		} catch (@Pc(62) Exception local62) {
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Z)V")
	public void method4044() {
		this.method4057(true);
		super.aBoolean396 = true;
		super.aBoolean392 = false;
		super.aBoolean386 = true;
		super.aBoolean384 = true;
		super.anInt4789 = 1;
		super.anInt4794 = super.anInt4798 = 0;
		super.aBoolean382 = true;
		super.aBoolean391 = true;
		super.aBoolean387 = false;
		super.anInt4785 = super.anInt4790 = 1;
		super.aBoolean389 = true;
		super.aBoolean395 = true;
		super.aBoolean388 = true;
		super.aBoolean397 = true;
		if (Static188.anInt3749 > 95) {
			Static551.method8044(1);
		} else {
			Static551.method8044(0);
		}
		super.aBoolean383 = true;
		super.aBoolean380 = false;
		super.anInt4802 = 0;
		this.method4051();
		this.method4041(1);
		super.anInt4803 = 3;
		Static49.method1242();
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(Z)V")
	public void method4045() {
		this.method4057(false);
		super.aBoolean397 = false;
		super.anInt4794 = super.anInt4798 = 0;
		super.aBoolean384 = false;
		super.aBoolean396 = false;
		super.aBoolean395 = false;
		super.anInt4789 = 0;
		super.aBoolean386 = false;
		super.anInt4785 = super.anInt4790 = 0;
		super.aBoolean382 = false;
		super.aBoolean389 = false;
		super.aBoolean388 = false;
		super.aBoolean391 = false;
		super.aBoolean387 = false;
		super.aBoolean392 = false;
		Static551.method8044(0);
		super.anInt4802 = 0;
		super.aBoolean383 = false;
		super.aBoolean380 = false;
		this.method4051();
		this.method4041(2);
		super.anInt4803 = 1;
		Static49.method1242();
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ILclient!fd;)V")
	private void method4047(@OriginalArg(1) Class3_Sub7 arg0) {
		if (arg0.aByteArray86.length - arg0.anInt7869 < 1) {
			return;
		}
		@Pc(23) int local23 = arg0.method6538();
		if (local23 < 0 || local23 > 22) {
			return;
		}
		@Pc(36) byte local36;
		if (local23 == 22) {
			local36 = 45;
		} else if (local23 == 21) {
			local36 = 44;
		} else if (local23 == 20) {
			local36 = 43;
		} else if (local23 == 19) {
			local36 = 42;
		} else if (local23 == 18) {
			local36 = 41;
		} else if (local23 == 17) {
			local36 = 40;
		} else if (local23 == 16) {
			local36 = 38;
		} else if (local23 == 15) {
			local36 = 37;
		} else if (local23 == 14) {
			local36 = 36;
		} else if (local23 == 13) {
			local36 = 35;
		} else if (local23 == 12) {
			local36 = 34;
		} else if (local23 == 11) {
			local36 = 33;
		} else if (local23 == 10) {
			local36 = 32;
		} else if (local23 == 9) {
			local36 = 31;
		} else if (local23 == 8) {
			local36 = 30;
		} else if (local23 == 7) {
			local36 = 29;
		} else if (local23 == 6) {
			local36 = 28;
		} else if (local23 == 5) {
			local36 = 28;
		} else if (local23 == 4) {
			local36 = 24;
		} else if (local23 == 3) {
			local36 = 23;
		} else if (local23 == 2) {
			local36 = 22;
		} else if (local23 == 1) {
			local36 = 23;
		} else {
			local36 = 19;
		}
		if (arg0.aByteArray86.length - arg0.anInt7869 < local36) {
			return;
		}
		super.anInt4805 = arg0.method6538();
		if (super.anInt4805 < 1) {
			super.anInt4805 = 1;
		} else if (super.anInt4805 > 4) {
			super.anInt4805 = 4;
		}
		this.method4057(arg0.method6538() == 1);
		super.aBoolean395 = arg0.method6538() == 1;
		super.aBoolean382 = arg0.method6538() == 1;
		super.aBoolean396 = arg0.method6538() == 1;
		super.anInt4789 = arg0.method6538() == 1 ? 1 : 0;
		super.aBoolean389 = arg0.method6538() == 1;
		super.aBoolean397 = arg0.method6538() == 1;
		super.aBoolean384 = arg0.method6538() == 1;
		super.anInt4785 = arg0.method6538();
		if (super.anInt4785 > 2) {
			super.anInt4785 = 2;
		}
		if (local23 >= 17) {
			super.anInt4790 = arg0.method6538();
		}
		if (local23 < 2) {
			super.aBoolean388 = arg0.method6538() == 1;
			arg0.method6538();
		} else {
			super.aBoolean388 = arg0.method6538() == 1;
			if (local23 >= 17) {
				super.aBoolean392 = arg0.method6538() == 1;
			}
		}
		super.aBoolean387 = arg0.method6538() == 1;
		super.aBoolean386 = arg0.method6538() == 1;
		super.anInt4794 = arg0.method6538();
		if (super.anInt4794 > 2) {
			super.anInt4794 = 2;
		}
		super.anInt4798 = super.anInt4794;
		super.aBoolean394 = arg0.method6538() == 1;
		super.anInt4799 = arg0.method6538();
		if (super.anInt4799 > 127) {
			super.anInt4799 = 127;
		}
		if (local23 < 20) {
			super.anInt4795 = super.anInt4799;
		} else {
			super.anInt4795 = arg0.method6538();
			if (super.anInt4795 > 127) {
				super.anInt4795 = 127;
			}
		}
		super.anInt4793 = arg0.method6538();
		super.anInt4797 = arg0.method6538();
		if (super.anInt4797 > 127) {
			super.anInt4797 = 127;
		}
		if (local23 >= 21) {
			super.anInt4806 = arg0.method6538();
			if (super.anInt4806 > 127) {
				super.anInt4806 = 127;
			}
		} else {
			super.anInt4806 = super.anInt4793;
		}
		if (local23 >= 1) {
			super.anInt4786 = arg0.method6535();
			super.anInt4787 = arg0.method6535();
		}
		if (local23 >= 3 && local23 < 6) {
			arg0.method6538();
		}
		@Pc(555) int local555;
		if (local23 >= 4) {
			local555 = arg0.method6538();
			if (local555 < 0 || local555 > 2) {
				local555 = 0;
			}
			if (Static188.anInt3749 < 96) {
				local555 = 0;
			}
			Static551.method8044(local555);
		}
		if (local23 >= 5) {
			super.anInt4791 = arg0.method6497();
		}
		local555 = 0;
		if (local23 >= 6) {
			super.anInt4801 = local555 = arg0.method6538();
		}
		if (super.anInt4801 != 1 && super.anInt4801 != 2) {
			super.anInt4801 = 2;
		}
		if (local23 >= 7) {
			super.aBoolean381 = arg0.method6538() == 1;
		}
		if (local23 >= 8) {
			super.aBoolean390 = arg0.method6538() == 1;
		}
		if (local23 >= 9) {
			super.anInt4802 = arg0.method6538();
		}
		if (super.anInt4802 < 0 || super.anInt4802 > Static279.method4841(Static188.anInt3749)) {
			super.anInt4802 = 0;
		}
		if (local23 >= 10) {
			super.aBoolean380 = arg0.method6538() != 0;
		}
		if (local23 >= 11) {
			super.aBoolean393 = arg0.method6538() != 0;
		}
		if (local23 >= 12) {
			super.anInt4789 = arg0.method6538();
		}
		if (super.anInt4789 < 0 || super.anInt4789 > 2) {
			super.anInt4789 = 1;
		}
		if (local23 >= 13) {
			super.aBoolean383 = arg0.method6538() == 1;
		}
		if (local23 >= 14) {
			super.anInt4792 = arg0.method6538();
		} else if (local555 == 0) {
			super.anInt4792 = 2;
		} else {
			super.anInt4792 = 1;
		}
		if (super.anInt4792 < 0 || super.anInt4792 > 5) {
			super.anInt4792 = 2;
		}
		if (local23 >= 15) {
			super.anInt4809 = arg0.method6538();
			if (super.anInt4809 < 0 || super.anInt4809 > 4) {
				super.anInt4809 = Static223.anInt4521 == 1 ? 2 : 4;
			}
		}
		if (local23 >= 16) {
			super.aBoolean391 = arg0.method6538() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean391 = false;
				}
			} catch (@Pc(819) Throwable local819) {
			}
		}
		if (local23 < 17 && super.anInt4792 == 0) {
			super.anInt4792 = 2;
		}
		if (local23 >= 18) {
			super.anInt4803 = arg0.method6538();
			if (super.anInt4803 < 0 || super.anInt4803 > 4) {
				super.anInt4803 = 0;
			}
		}
		if (local23 >= 19) {
			super.anInt4807 = arg0.method6538();
		} else if (super.anInt4803 == 1 || super.anInt4803 == 2) {
			super.anInt4807 = 2;
		} else if (super.anInt4803 == 3) {
			super.anInt4807 = 1;
		} else {
			super.anInt4807 = 0;
		}
		if (local23 >= 22) {
			super.anInt4784 = arg0.method6538();
		}
		if (super.anInt4792 == 0 && Static188.anInt3749 < 96 && super.anInt4803 != 1 && super.anInt4803 != 0) {
			this.method4045();
		}
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IZ)I")
	public int method4048(@OriginalArg(0) int arg0) {
		if (this.aBoolean400) {
			return 0;
		} else if (this.method4040(arg0)) {
			return super.aBoolean395 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(II)I")
	private int method4050(@OriginalArg(0) int arg0) {
		@Pc(19) byte local19;
		if (arg0 > 12000) {
			local19 = 4;
			this.method4054();
		} else if (arg0 > 5000) {
			this.method4044();
			local19 = 3;
		} else if (arg0 <= 2000) {
			local19 = 1;
			this.method4045();
		} else {
			this.method4052();
			local19 = 2;
		}
		if (Static275.anInt5823 != 2) {
			super.anInt4792 = 2;
			Static63.method1592(2);
		}
		this.method4043(Static480.aClass326_3);
		return local19;
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)V")
	private void method4051() {
		if (Static223.anInt4521 > 1) {
			super.anInt4809 = 4;
		} else {
			super.anInt4809 = 2;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
	public void method4052() {
		this.method4057(true);
		super.anInt4794 = super.anInt4798 = 0;
		super.aBoolean396 = false;
		super.aBoolean386 = false;
		super.aBoolean391 = false;
		super.aBoolean392 = false;
		super.aBoolean395 = false;
		super.aBoolean397 = false;
		super.anInt4785 = super.anInt4790 = 0;
		super.anInt4789 = 0;
		super.aBoolean388 = false;
		super.aBoolean387 = false;
		super.aBoolean389 = false;
		super.aBoolean384 = false;
		super.aBoolean382 = true;
		Static551.method8044(0);
		super.aBoolean380 = false;
		super.anInt4802 = 0;
		super.aBoolean383 = true;
		this.method4051();
		this.method4041(2);
		super.anInt4803 = 2;
		Static49.method1242();
	}

	@OriginalMember(owner = "client!jaa", name = "d", descriptor = "(II)Z")
	public boolean method4053(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean385 : true;
	}

	@OriginalMember(owner = "client!jaa", name = "c", descriptor = "(I)V")
	public void method4054() {
		this.method4057(true);
		super.anInt4794 = super.anInt4798 = 0;
		super.aBoolean396 = true;
		super.aBoolean389 = true;
		super.anInt4789 = 1;
		super.aBoolean392 = true;
		super.aBoolean386 = true;
		super.aBoolean384 = true;
		super.aBoolean391 = true;
		super.aBoolean395 = true;
		super.aBoolean397 = true;
		super.aBoolean382 = true;
		super.aBoolean387 = true;
		super.anInt4785 = super.anInt4790 = 2;
		super.aBoolean388 = true;
		if (Static188.anInt3749 > 95) {
			Static551.method8044(2);
		} else {
			Static551.method8044(0);
		}
		super.anInt4802 = 0;
		super.aBoolean380 = false;
		super.aBoolean383 = true;
		this.method4051();
		this.method4041(0);
		super.anInt4803 = 4;
		Static49.method1242();
	}

	@OriginalMember(owner = "client!jaa", name = "h", descriptor = "(I)I")
	public int method4055() {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		if (Static480.aClass326_3.aBoolean802 && !Static480.aClass326_3.aBoolean803) {
			if (Static530.aString119.startsWith("win")) {
				if (!Static530.aString118.startsWith("amd64") && !Static530.aString118.startsWith("x86_64")) {
					local5 = true;
				}
				local7 = true;
				local9 = true;
			} else {
				local7 = true;
			}
		}
		if (this.aBoolean399) {
			local5 = false;
		}
		if (this.aBoolean403) {
			local9 = false;
		}
		if (this.aBoolean401) {
			local7 = false;
		}
		if (!local5 && !local7 && !local9) {
			return this.method4056();
		}
		@Pc(63) int local63 = -1;
		@Pc(65) int local65 = -1;
		if (local5) {
			try {
				local63 = Static577.method8255(1000, 2);
			} catch (@Pc(79) Exception local79) {
			}
		}
		@Pc(82) int local82 = -1;
		if (local9) {
			try {
				local82 = Static577.method8255(1000, 3);
				if (Static275.anInt5823 == 3) {
					@Pc(97) Class242 local97 = Static546.aClass15_16.method5278();
					@Pc(102) long local102 = local97.aLong188 & 0xFFFFFFFFFFFFL;
					@Pc(105) int local105 = local97.anInt7297;
					if (local105 == 4318) {
						local7 &= local102 >= 64425238954L;
					} else if (local105 == 4098) {
						local7 &= local102 >= 60129613779L;
					}
				}
			} catch (@Pc(139) Exception local139) {
			}
		}
		if (local7) {
			try {
				local65 = Static577.method8255(1000, 1);
			} catch (@Pc(149) Exception local149) {
			}
		}
		if (local63 == -1 && local65 == -1 && local82 == -1) {
			return this.method4056();
		}
		local65 = (int) ((float) local65 * 1.1F);
		local82 = (int) ((float) local82 * 1.1F);
		if (local82 < local63 && local63 > local65) {
			return this.method4050(local63);
		} else if (local82 <= local65) {
			return this.method4042(1, local65);
		} else {
			return this.method4042(3, local82);
		}
	}

	@OriginalMember(owner = "client!jaa", name = "i", descriptor = "(I)I")
	private int method4056() {
		@Pc(11) byte local11;
		if (Static188.anInt3749 < 96) {
			this.method4045();
			local11 = 1;
		} else {
			@Pc(15) int local15 = Static229.method3921();
			if (local15 <= 100) {
				this.method4054();
				local11 = 4;
			} else if (local15 <= 500) {
				local11 = 3;
				this.method4044();
			} else if (local15 <= 1000) {
				this.method4052();
				local11 = 2;
			} else {
				this.method4045();
				local11 = 1;
			}
		}
		if (Static275.anInt5823 != 0) {
			super.anInt4792 = 0;
			Static63.method1592(0);
		}
		this.method4043(Static480.aClass326_3);
		return local11;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(ZZ)V")
	public void method4057(@OriginalArg(0) boolean arg0) {
		super.aBoolean385 = arg0;
		if (Static253.aClass146_2 != null) {
			Static253.aClass146_2.method3354(!this.method4040(Static275.anInt5823));
		}
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(IB)I")
	public int method4058(@OriginalArg(0) int arg0) {
		if (Static495.method7496(arg0) && !Static194.method3316(Static75.anInt1880)) {
			return Static188.anInt3749 < 96 && Static492.method7477(arg0) && super.anInt4807 == 0 ? 1 : super.anInt4807;
		} else {
			return 0;
		}
	}
}
