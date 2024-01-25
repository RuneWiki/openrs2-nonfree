import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!ra", name = "bb", descriptor = "Z")
	public boolean aBoolean406 = false;

	@OriginalMember(owner = "client!ra", name = "cb", descriptor = "Z")
	public boolean aBoolean407 = false;

	static {
		new Class242("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lclient!hu;)V")
	public Class67_Sub1(@OriginalArg(0) Class114 arg0) {
		super.anInt5842 = 3;
		this.method4534(true);
		super.aBoolean390 = false;
		super.aBoolean391 = true;
		super.aBoolean389 = true;
		super.aBoolean403 = true;
		super.anInt5855 = 127;
		super.anInt5860 = 0;
		super.anInt5849 = 0;
		super.aBoolean405 = true;
		super.aBoolean392 = true;
		super.aBoolean395 = true;
		super.anInt5848 = 0;
		super.aBoolean399 = true;
		super.anInt5859 = 255;
		super.anInt5856 = 1;
		super.anInt5858 = 0;
		super.anInt5865 = 2;
		super.anInt5852 = 127;
		super.aBoolean404 = true;
		super.anInt5847 = 0;
		super.aBoolean400 = true;
		super.aBoolean388 = true;
		if (Static346.anInt6291 < 96) {
			Static324.method5215(0);
		} else {
			Static324.method5215(2);
		}
		super.aBoolean397 = true;
		super.aBoolean398 = false;
		super.anInt5851 = 0;
		super.aBoolean393 = true;
		super.aBoolean401 = false;
		super.anInt5866 = 2;
		super.aBoolean402 = false;
		super.anInt5845 = Static278.anInt7278 == 1 ? 2 : 4;
		super.anInt5854 = 0;
		super.anInt5863 = 2;
		@Pc(129) Class154 local129 = null;
		try {
			@Pc(134) Class108 local134 = arg0.method2363("");
			while (local134.anInt2803 == 0) {
				Static20.method1515(1L);
			}
			if (local134.anInt2803 == 1) {
				local129 = (Class154) local134.anObject4;
				@Pc(156) byte[] local156 = new byte[(int) local129.method3331()];
				@Pc(171) int local171;
				for (@Pc(158) int local158 = 0; local158 < local156.length; local158 += local171) {
					local171 = local129.method3333(local158, local156.length - local158, local156);
					if (local171 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4527(new Class4_Sub30(local156));
			}
		} catch (@Pc(196) Exception local196) {
		}
		try {
			if (local129 != null) {
				local129.method3335();
			}
		} catch (@Pc(203) Exception local203) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!tl;I)V")
	private void method4527(@OriginalArg(0) Class4_Sub30 arg0) {
		if (arg0.aByteArray79.length - arg0.anInt6244 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4864();
		if (local21 < 0 || local21 > 17) {
			return;
		}
		@Pc(56) byte local56;
		if (local21 == 17) {
			local56 = 40;
		} else if (local21 == 16) {
			local56 = 38;
		} else if (local21 == 15) {
			local56 = 37;
		} else if (local21 == 14) {
			local56 = 36;
		} else if (local21 == 13) {
			local56 = 35;
		} else if (local21 == 12) {
			local56 = 34;
		} else if (local21 == 11) {
			local56 = 33;
		} else if (local21 == 10) {
			local56 = 32;
		} else if (local21 == 9) {
			local56 = 31;
		} else if (local21 == 8) {
			local56 = 30;
		} else if (local21 == 7) {
			local56 = 29;
		} else if (local21 == 6) {
			local56 = 28;
		} else if (local21 == 5) {
			local56 = 28;
		} else if (local21 == 4) {
			local56 = 24;
		} else if (local21 == 3) {
			local56 = 23;
		} else if (local21 == 2) {
			local56 = 22;
		} else if (local21 == 1) {
			local56 = 23;
		} else {
			local56 = 19;
		}
		if (arg0.aByteArray79.length - arg0.anInt6244 < local56) {
			return;
		}
		super.anInt5842 = arg0.method4864();
		if (super.anInt5842 < 1) {
			super.anInt5842 = 1;
		} else if (super.anInt5842 > 4) {
			super.anInt5842 = 4;
		}
		this.method4534(arg0.method4864() == 1);
		super.aBoolean405 = arg0.method4864() == 1;
		super.aBoolean389 = arg0.method4864() == 1;
		super.aBoolean392 = arg0.method4864() == 1;
		super.anInt5856 = arg0.method4864() == 1 ? 1 : 0;
		super.aBoolean395 = arg0.method4864() == 1;
		super.aBoolean404 = arg0.method4864() == 1;
		super.aBoolean400 = arg0.method4864() == 1;
		super.anInt5865 = arg0.method4864();
		if (super.anInt5865 > 2) {
			super.anInt5865 = 2;
		}
		if (local21 >= 17) {
			super.anInt5849 = arg0.method4864();
		}
		if (local21 < 2) {
			super.aBoolean403 = arg0.method4864() == 1;
			arg0.method4864();
		} else {
			super.aBoolean403 = arg0.method4864() == 1;
			if (local21 >= 17) {
				super.aBoolean390 = arg0.method4864() == 1;
			}
		}
		super.aBoolean388 = arg0.method4864() == 1;
		super.aBoolean399 = arg0.method4864() == 1;
		super.anInt5858 = arg0.method4864();
		if (super.anInt5858 > 2) {
			super.anInt5858 = 2;
		}
		super.anInt5848 = super.anInt5858;
		super.aBoolean391 = arg0.method4864() == 1;
		super.anInt5852 = arg0.method4864();
		if (super.anInt5852 > 127) {
			super.anInt5852 = 127;
		}
		super.anInt5859 = arg0.method4864();
		super.anInt5855 = arg0.method4864();
		if (super.anInt5855 > 127) {
			super.anInt5855 = 127;
		}
		if (local21 >= 1) {
			super.anInt5860 = arg0.method4877();
			super.anInt5847 = arg0.method4877();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method4864();
		}
		@Pc(474) int local474;
		if (local21 >= 4) {
			local474 = arg0.method4864();
			if (local474 < 0 || local474 > 2) {
				local474 = 0;
			}
			if (Static346.anInt6291 < 96) {
				local474 = 0;
			}
			Static324.method5215(local474);
		}
		if (local21 >= 5) {
			super.anInt5851 = arg0.method4872();
		}
		local474 = 0;
		if (local21 >= 6) {
			super.anInt5863 = local474 = arg0.method4864();
		}
		if (super.anInt5863 != 1 && super.anInt5863 != 2) {
			super.anInt5863 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean401 = arg0.method4864() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean402 = arg0.method4864() == 1;
		}
		if (local21 >= 9) {
			super.anInt5854 = arg0.method4864();
		}
		if (super.anInt5854 < 0 || super.anInt5854 > Static236.method3282(Static346.anInt6291)) {
			super.anInt5854 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean398 = arg0.method4864() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean393 = arg0.method4864() != 0;
		}
		if (local21 >= 12) {
			super.anInt5856 = arg0.method4864();
		}
		if (super.anInt5856 < 0 || super.anInt5856 > 2) {
			super.anInt5856 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean397 = arg0.method4864() == 1;
		}
		if (local21 >= 14) {
			super.anInt5866 = arg0.method4864();
		} else if (local474 == 0) {
			super.anInt5866 = 2;
		} else {
			super.anInt5866 = 1;
		}
		if (super.anInt5866 < 0 || super.anInt5866 > 3) {
			super.anInt5866 = 2;
		}
		if (local21 >= 15) {
			super.anInt5845 = arg0.method4864();
			if (super.anInt5845 < 0 || super.anInt5845 > 4) {
				super.anInt5845 = Static278.anInt7278 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean396 = arg0.method4864() == 1;
		}
		if (local21 < 17 && super.anInt5866 == 0) {
			super.anInt5866 = 2;
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZLclient!hu;)V")
	public void method4528(@OriginalArg(1) Class114 arg0) {
		@Pc(12) Class154 local12 = null;
		try {
			@Pc(17) Class108 local17 = arg0.method2363("");
			while (local17.anInt2803 == 0) {
				Static20.method1515(1L);
			}
			if (local17.anInt2803 == 1) {
				local12 = (Class154) local17.anObject4;
				@Pc(40) Class4_Sub30 local40 = this.method4529();
				local12.method3336(local40.anInt6244, local40.aByteArray79, 0);
			}
		} catch (@Pc(54) Exception local54) {
		}
		try {
			if (local12 != null) {
				local12.method3335();
			}
		} catch (@Pc(61) Exception local61) {
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)Lclient!tl;")
	public Class4_Sub30 method4529() {
		@Pc(8) Class4_Sub30 local8 = new Class4_Sub30(41);
		local8.method4871(17);
		local8.method4871(super.anInt5842);
		local8.method4871(super.aBoolean394 ? 1 : 0);
		local8.method4871(super.aBoolean405 ? 1 : 0);
		local8.method4871(super.aBoolean389 ? 1 : 0);
		local8.method4871(super.aBoolean392 ? 1 : 0);
		local8.method4871(0);
		local8.method4871(super.aBoolean395 ? 1 : 0);
		local8.method4871(super.aBoolean404 ? 1 : 0);
		local8.method4871(super.aBoolean400 ? 1 : 0);
		local8.method4871(super.anInt5865);
		local8.method4871(super.anInt5849);
		local8.method4871(super.aBoolean403 ? 1 : 0);
		local8.method4871(super.aBoolean390 ? 1 : 0);
		local8.method4871(super.aBoolean388 ? 1 : 0);
		local8.method4871(super.aBoolean399 ? 1 : 0);
		local8.method4871(super.anInt5858);
		local8.method4871(super.aBoolean391 ? 1 : 0);
		local8.method4871(super.anInt5852);
		local8.method4871(super.anInt5859);
		local8.method4871(super.anInt5855);
		local8.method4846(super.anInt5860);
		local8.method4846(super.anInt5847);
		local8.method4871(Static344.method4802());
		local8.method4861(super.anInt5851);
		local8.method4871(super.anInt5863);
		local8.method4871(super.aBoolean401 ? 1 : 0);
		local8.method4871(super.aBoolean402 ? 1 : 0);
		local8.method4871(super.anInt5854);
		local8.method4871(super.aBoolean398 ? 1 : 0);
		local8.method4871(super.aBoolean393 ? 1 : 0);
		local8.method4871(super.anInt5856);
		local8.method4871(super.aBoolean397 ? 1 : 0);
		local8.method4871(super.anInt5866);
		local8.method4871(super.anInt5845);
		local8.method4871(super.aBoolean396 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(II)Z")
	public boolean method4530(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean394 : true;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(II)Z")
	public boolean method4531(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean407 ? super.aBoolean394 : true;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZB)V")
	public void method4534(@OriginalArg(0) boolean arg0) {
		super.aBoolean394 = arg0;
		if (Static2.aClass74_13 != null) {
			Static2.aClass74_13.method1689(!this.method4531(Static286.anInt5207));
		}
	}

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(II)I")
	public int method4535(@OriginalArg(1) int arg0) {
		if (this.aBoolean406) {
			return 0;
		} else if (this.method4531(arg0)) {
			return super.aBoolean405 ? 2 : 1;
		} else {
			return 1;
		}
	}
}
