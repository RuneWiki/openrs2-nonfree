import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!bk", name = "V", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!bk", name = "bb", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!hs;)V")
	public Class21_Sub1(@OriginalArg(0) Class103 arg0) {
		super.anInt864 = 3;
		this.method784(true);
		super.aBoolean68 = true;
		super.aBoolean70 = true;
		super.anInt877 = 1;
		super.anInt868 = 127;
		super.anInt863 = 127;
		super.anInt871 = 255;
		super.anInt874 = 0;
		super.anInt879 = 0;
		super.aBoolean73 = true;
		super.anInt869 = 0;
		super.aBoolean78 = true;
		super.aBoolean79 = true;
		super.anInt870 = 0;
		super.aBoolean66 = true;
		super.aBoolean81 = true;
		super.aBoolean74 = true;
		super.aBoolean76 = true;
		super.aBoolean65 = true;
		super.anInt882 = 0;
		super.aBoolean71 = false;
		super.anInt872 = 2;
		if (Static102.anInt619 >= 96) {
			Static26.method712(2);
		} else {
			Static26.method712(0);
		}
		super.aBoolean72 = false;
		super.anInt862 = 0;
		super.aBoolean77 = true;
		super.aBoolean80 = true;
		super.anInt867 = 2;
		super.anInt878 = 2;
		super.aBoolean82 = false;
		super.anInt866 = 0;
		super.anInt881 = Static348.anInt7448 == 1 ? 2 : 4;
		super.aBoolean69 = false;
		@Pc(129) Class203 local129 = null;
		try {
			@Pc(134) Class190 local134 = arg0.method2841("");
			while (local134.anInt5799 == 0) {
				Static135.method2458(1L);
			}
			if (local134.anInt5799 == 1) {
				local129 = (Class203) local134.anObject7;
				@Pc(156) byte[] local156 = new byte[(int) local129.method4991()];
				@Pc(171) int local171;
				for (@Pc(158) int local158 = 0; local158 < local156.length; local158 += local171) {
					local171 = local129.method4994(local158, local156.length - local158, local156);
					if (local171 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method792(new Class3_Sub2(local156));
			}
		} catch (@Pc(201) Exception local201) {
		}
		try {
			if (local129 != null) {
				local129.method4993();
			}
		} catch (@Pc(208) Exception local208) {
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZLclient!hs;)V")
	public void method782(@OriginalArg(1) Class103 arg0) {
		@Pc(5) Class203 local5 = null;
		try {
			@Pc(14) Class190 local14 = arg0.method2841("");
			while (local14.anInt5799 == 0) {
				Static135.method2458(1L);
			}
			if (local14.anInt5799 == 1) {
				local5 = (Class203) local14.anObject7;
				@Pc(35) Class3_Sub2 local35 = this.method789();
				local5.method4996(local35.anInt7620, 0, local35.aByteArray95);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local5 != null) {
				local5.method4993();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)V")
	public void method784(@OriginalArg(0) boolean arg0) {
		super.aBoolean75 = arg0;
		if (Static55.aClass25_1 != null) {
			Static55.aClass25_1.method859(!this.method787(Static347.anInt6318));
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Z")
	public boolean method787(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean83 ? super.aBoolean75 : true;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)Lclient!bt;")
	public Class3_Sub2 method789() {
		@Pc(8) Class3_Sub2 local8 = new Class3_Sub2(41);
		local8.method6001(17);
		local8.method6001(super.anInt864);
		local8.method6001(super.aBoolean75 ? 1 : 0);
		local8.method6001(super.aBoolean68 ? 1 : 0);
		local8.method6001(super.aBoolean65 ? 1 : 0);
		local8.method6001(super.aBoolean70 ? 1 : 0);
		local8.method6001(0);
		local8.method6001(super.aBoolean79 ? 1 : 0);
		local8.method6001(super.aBoolean66 ? 1 : 0);
		local8.method6001(super.aBoolean78 ? 1 : 0);
		local8.method6001(super.anInt872);
		local8.method6001(super.anInt870);
		local8.method6001(super.aBoolean74 ? 1 : 0);
		local8.method6001(super.aBoolean71 ? 1 : 0);
		local8.method6001(super.aBoolean73 ? 1 : 0);
		local8.method6001(super.aBoolean76 ? 1 : 0);
		local8.method6001(super.anInt869);
		local8.method6001(super.aBoolean81 ? 1 : 0);
		local8.method6001(super.anInt868);
		local8.method6001(super.anInt871);
		local8.method6001(super.anInt863);
		local8.method6045(super.anInt874);
		local8.method6045(super.anInt882);
		local8.method6001(Static438.method5860());
		local8.method6008(super.anInt862);
		local8.method6001(super.anInt878);
		local8.method6001(super.aBoolean69 ? 1 : 0);
		local8.method6001(super.aBoolean72 ? 1 : 0);
		local8.method6001(super.anInt866);
		local8.method6001(super.aBoolean82 ? 1 : 0);
		local8.method6001(super.aBoolean77 ? 1 : 0);
		local8.method6001(super.anInt877);
		local8.method6001(super.aBoolean80 ? 1 : 0);
		local8.method6001(super.anInt867);
		local8.method6001(super.anInt881);
		local8.method6001(super.aBoolean67 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(ZI)I")
	public int method790(@OriginalArg(1) int arg0) {
		if (this.aBoolean84) {
			return 0;
		} else if (this.method787(arg0)) {
			return super.aBoolean68 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)Z")
	public boolean method791(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean75 : true;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!bt;)V")
	private void method792(@OriginalArg(1) Class3_Sub2 arg0) {
		if (arg0.aByteArray95.length - arg0.anInt7620 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method6053();
		if (local21 < 0 || local21 > 17) {
			return;
		}
		@Pc(53) byte local53;
		if (local21 == 17) {
			local53 = 40;
		} else if (local21 == 16) {
			local53 = 38;
		} else if (local21 == 15) {
			local53 = 37;
		} else if (local21 == 14) {
			local53 = 36;
		} else if (local21 == 13) {
			local53 = 35;
		} else if (local21 == 12) {
			local53 = 34;
		} else if (local21 == 11) {
			local53 = 33;
		} else if (local21 == 10) {
			local53 = 32;
		} else if (local21 == 9) {
			local53 = 31;
		} else if (local21 == 8) {
			local53 = 30;
		} else if (local21 == 7) {
			local53 = 29;
		} else if (local21 == 6) {
			local53 = 28;
		} else if (local21 == 5) {
			local53 = 28;
		} else if (local21 == 4) {
			local53 = 24;
		} else if (local21 == 3) {
			local53 = 23;
		} else if (local21 == 2) {
			local53 = 22;
		} else if (local21 == 1) {
			local53 = 23;
		} else {
			local53 = 19;
		}
		if (arg0.aByteArray95.length - arg0.anInt7620 < local53) {
			return;
		}
		super.anInt864 = arg0.method6053();
		if (super.anInt864 < 1) {
			super.anInt864 = 1;
		} else if (super.anInt864 > 4) {
			super.anInt864 = 4;
		}
		this.method784(arg0.method6053() == 1);
		super.aBoolean68 = arg0.method6053() == 1;
		super.aBoolean65 = arg0.method6053() == 1;
		super.aBoolean70 = arg0.method6053() == 1;
		super.anInt877 = arg0.method6053() == 1 ? 1 : 0;
		super.aBoolean79 = arg0.method6053() == 1;
		super.aBoolean66 = arg0.method6053() == 1;
		super.aBoolean78 = arg0.method6053() == 1;
		super.anInt872 = arg0.method6053();
		if (super.anInt872 > 2) {
			super.anInt872 = 2;
		}
		if (local21 >= 17) {
			super.anInt870 = arg0.method6053();
		}
		if (local21 >= 2) {
			super.aBoolean74 = arg0.method6053() == 1;
			if (local21 >= 17) {
				super.aBoolean71 = arg0.method6053() == 1;
			}
		} else {
			super.aBoolean74 = arg0.method6053() == 1;
			arg0.method6053();
		}
		super.aBoolean73 = arg0.method6053() == 1;
		super.aBoolean76 = arg0.method6053() == 1;
		super.anInt869 = arg0.method6053();
		if (super.anInt869 > 2) {
			super.anInt869 = 2;
		}
		super.anInt879 = super.anInt869;
		super.aBoolean81 = arg0.method6053() == 1;
		super.anInt868 = arg0.method6053();
		if (super.anInt868 > 127) {
			super.anInt868 = 127;
		}
		super.anInt871 = arg0.method6053();
		super.anInt863 = arg0.method6053();
		if (super.anInt863 > 127) {
			super.anInt863 = 127;
		}
		if (local21 >= 1) {
			super.anInt874 = arg0.method6004();
			super.anInt882 = arg0.method6004();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method6053();
		}
		@Pc(490) int local490;
		if (local21 >= 4) {
			local490 = arg0.method6053();
			if (local490 < 0 || local490 > 2) {
				local490 = 0;
			}
			if (Static102.anInt619 < 96) {
				local490 = 0;
			}
			Static26.method712(local490);
		}
		if (local21 >= 5) {
			super.anInt862 = arg0.method6014();
		}
		local490 = 0;
		if (local21 >= 6) {
			super.anInt878 = local490 = arg0.method6053();
		}
		if (super.anInt878 != 1 && super.anInt878 != 2) {
			super.anInt878 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean69 = arg0.method6053() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean72 = arg0.method6053() == 1;
		}
		if (local21 >= 9) {
			super.anInt866 = arg0.method6053();
		}
		if (super.anInt866 < 0 || super.anInt866 > Static140.method2523(Static102.anInt619)) {
			super.anInt866 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean82 = arg0.method6053() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean77 = arg0.method6053() != 0;
		}
		if (local21 >= 12) {
			super.anInt877 = arg0.method6053();
		}
		if (super.anInt877 < 0 || super.anInt877 > 2) {
			super.anInt877 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean80 = arg0.method6053() == 1;
		}
		if (local21 >= 14) {
			super.anInt867 = arg0.method6053();
		} else if (local490 == 0) {
			super.anInt867 = 2;
		} else {
			super.anInt867 = 1;
		}
		if (super.anInt867 < 0 || super.anInt867 > 3) {
			super.anInt867 = 2;
		}
		if (local21 >= 15) {
			super.anInt881 = arg0.method6053();
			if (super.anInt881 < 0 || super.anInt881 > 4) {
				super.anInt881 = Static348.anInt7448 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean67 = arg0.method6053() == 1;
		}
		if (local21 < 17 && super.anInt867 == 0) {
			super.anInt867 = 2;
		}
	}
}
