import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class177_Sub1 extends Class177 {

	@OriginalMember(owner = "client!pe", name = "Y", descriptor = "[I")
	public static final int[] anIntArray334 = new int[64];

	@OriginalMember(owner = "client!pe", name = "O", descriptor = "Z")
	public boolean aBoolean365 = false;

	@OriginalMember(owner = "client!pe", name = "S", descriptor = "Z")
	public boolean aBoolean366 = false;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!ml;)V", line = 444)
	public Class177_Sub1(@OriginalArg(0) Class152 arg0) {
		super.anInt4869 = 3;
		this.method4494(true);
		super.anInt4878 = 127;
		super.aBoolean364 = true;
		super.anInt4875 = 0;
		super.anInt4872 = 127;
		super.aBoolean361 = true;
		super.anInt4885 = 1;
		super.anInt4874 = 0;
		super.aBoolean355 = true;
		super.aBoolean353 = true;
		super.anInt4876 = 2;
		super.anInt4881 = 0;
		super.anInt4883 = 0;
		super.aBoolean358 = true;
		super.aBoolean348 = true;
		super.anInt4879 = 255;
		super.aBoolean352 = true;
		super.aBoolean350 = true;
		super.aBoolean359 = true;
		super.aBoolean349 = true;
		if (Class208.anInt5790 < 96) {
			Static25.method864(0);
		} else {
			Static25.method864(2);
		}
		super.aBoolean363 = true;
		super.aBoolean357 = true;
		super.aBoolean362 = false;
		super.anInt4884 = 2;
		super.anInt4873 = 0;
		super.anInt4871 = Class141.anInt3695 == 1 ? 2 : 4;
		super.aBoolean356 = false;
		super.anInt4868 = 2;
		super.anInt4877 = 0;
		super.aBoolean351 = false;
		@Pc(125) Class204 local125 = null;
		try {
			@Pc(129) Class32 local129 = arg0.method3751();
			while (local129.anInt992 == 0) {
				Static214.method4024(1L);
			}
			if (local129.anInt992 == 1) {
				local125 = (Class204) local129.anObject2;
				@Pc(153) byte[] local153 = new byte[(int) local125.method5197()];
				@Pc(168) int local168;
				for (@Pc(155) int local155 = 0; local155 < local153.length; local155 += local168) {
					local168 = local125.method5195(local153.length - local155, local155, local153);
					if (local168 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method4500(new Class2_Sub4(local153));
			}
		} catch (@Pc(193) Exception local193) {
		}
		try {
			if (local125 != null) {
				local125.method5194();
			}
		} catch (@Pc(200) Exception local200) {
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)I", line = 16)
	public int method4493(@OriginalArg(1) int arg0) {
		if (this.aBoolean366) {
			return 0;
		} else if (this.method4496(arg0)) {
			return super.aBoolean349 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V", line = 37)
	public void method4494(@OriginalArg(0) boolean arg0) {
		super.aBoolean354 = arg0;
		if (Static334.aClass202_4 != null) {
			Static334.aClass202_4.method5161(!this.method4496(Class2_Sub10.anInt1760));
		}
	}

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)Lclient!bt;", line = 51)
	public Class2_Sub4 method4495() {
		@Pc(8) Class2_Sub4 local8 = new Class2_Sub4(39);
		local8.method4843(16);
		local8.method4843(super.anInt4869);
		local8.method4843(super.aBoolean354 ? 1 : 0);
		local8.method4843(super.aBoolean349 ? 1 : 0);
		local8.method4843(super.aBoolean359 ? 1 : 0);
		local8.method4843(super.aBoolean350 ? 1 : 0);
		local8.method4843(0);
		local8.method4843(super.aBoolean353 ? 1 : 0);
		local8.method4843(super.aBoolean355 ? 1 : 0);
		local8.method4843(super.aBoolean358 ? 1 : 0);
		local8.method4843(super.anInt4876);
		local8.method4843(super.aBoolean364 ? 1 : 0);
		local8.method4843(super.aBoolean361 ? 1 : 0);
		local8.method4843(super.aBoolean348 ? 1 : 0);
		local8.method4843(super.anInt4881);
		local8.method4843(super.aBoolean352 ? 1 : 0);
		local8.method4843(super.anInt4878);
		local8.method4843(super.anInt4879);
		local8.method4843(super.anInt4872);
		local8.method4844(super.anInt4874);
		local8.method4844(super.anInt4883);
		local8.method4843(Static172.method3392());
		local8.method4814(super.anInt4877);
		local8.method4843(super.anInt4884);
		local8.method4843(super.aBoolean362 ? 1 : 0);
		local8.method4843(super.aBoolean351 ? 1 : 0);
		local8.method4843(super.anInt4873);
		local8.method4843(super.aBoolean356 ? 1 : 0);
		local8.method4843(super.aBoolean363 ? 1 : 0);
		local8.method4843(super.anInt4885);
		local8.method4843(super.aBoolean357 ? 1 : 0);
		local8.method4843(super.anInt4868);
		local8.method4843(super.anInt4871);
		local8.method4843(super.aBoolean360 ? 0 : 1);
		return local8;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)Z", line = 98)
	public boolean method4496(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean365 ? super.aBoolean354 : true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IB)Z", line = 116)
	public boolean method4497(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean354 : true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!ml;)V", line = 134)
	public void method4498(@OriginalArg(1) Class152 arg0) {
		@Pc(7) Class204 local7 = null;
		try {
			@Pc(17) Class32 local17 = arg0.method3751();
			while (local17.anInt992 == 0) {
				Static214.method4024(1L);
			}
			if (local17.anInt992 == 1) {
				local7 = (Class204) local17.anObject2;
				@Pc(39) Class2_Sub4 local39 = this.method4495();
				local7.method5196(local39.aByteArray73, local39.anInt5289, 0);
			}
		} catch (@Pc(49) Exception local49) {
		}
		try {
			if (local7 != null) {
				local7.method5194();
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!bt;)V", line = 183)
	private void method4500(@OriginalArg(1) Class2_Sub4 arg0) {
		if (arg0.aByteArray73.length - arg0.anInt5289 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4816();
		if (local21 < 0 || local21 > 16) {
			return;
		}
		@Pc(34) byte local34;
		if (local21 == 16) {
			local34 = 38;
		} else if (local21 == 15) {
			local34 = 37;
		} else if (local21 == 14) {
			local34 = 36;
		} else if (local21 == 13) {
			local34 = 35;
		} else if (local21 == 12) {
			local34 = 34;
		} else if (local21 == 11) {
			local34 = 33;
		} else if (local21 == 10) {
			local34 = 32;
		} else if (local21 == 9) {
			local34 = 31;
		} else if (local21 == 8) {
			local34 = 30;
		} else if (local21 == 7) {
			local34 = 29;
		} else if (local21 == 6) {
			local34 = 28;
		} else if (local21 == 5) {
			local34 = 28;
		} else if (local21 == 4) {
			local34 = 24;
		} else if (local21 == 3) {
			local34 = 23;
		} else if (local21 == 2) {
			local34 = 22;
		} else if (local21 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (local34 > arg0.aByteArray73.length - arg0.anInt5289) {
			return;
		}
		super.anInt4869 = arg0.method4816();
		if (super.anInt4869 < 1) {
			super.anInt4869 = 1;
		} else if (super.anInt4869 > 4) {
			super.anInt4869 = 4;
		}
		this.method4494(arg0.method4816() == 1);
		super.aBoolean349 = arg0.method4816() == 1;
		super.aBoolean359 = arg0.method4816() == 1;
		super.aBoolean350 = arg0.method4816() == 1;
		super.anInt4885 = arg0.method4816() == 1 ? 1 : 0;
		super.aBoolean353 = arg0.method4816() == 1;
		super.aBoolean355 = arg0.method4816() == 1;
		super.aBoolean358 = arg0.method4816() == 1;
		super.anInt4876 = arg0.method4816();
		if (super.anInt4876 > 2) {
			super.anInt4876 = 2;
		}
		if (local21 < 2) {
			super.aBoolean364 = arg0.method4816() == 1;
			arg0.method4816();
		} else {
			super.aBoolean364 = arg0.method4816() == 1;
		}
		super.aBoolean361 = arg0.method4816() == 1;
		super.aBoolean348 = arg0.method4816() == 1;
		super.anInt4881 = arg0.method4816();
		if (super.anInt4881 > 2) {
			super.anInt4881 = 2;
		}
		super.anInt4875 = super.anInt4881;
		super.aBoolean352 = arg0.method4816() == 1;
		super.anInt4878 = arg0.method4816();
		if (super.anInt4878 > 127) {
			super.anInt4878 = 127;
		}
		super.anInt4879 = arg0.method4816();
		super.anInt4872 = arg0.method4816();
		if (super.anInt4872 > 127) {
			super.anInt4872 = 127;
		}
		if (local21 >= 1) {
			super.anInt4874 = arg0.method4830();
			super.anInt4883 = arg0.method4830();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method4816();
		}
		@Pc(437) int local437;
		if (local21 >= 4) {
			local437 = arg0.method4816();
			if (local437 < 0 || local437 > 2) {
				local437 = 0;
			}
			if (Class208.anInt5790 < 96) {
				local437 = 0;
			}
			Static25.method864(local437);
		}
		if (local21 >= 5) {
			super.anInt4877 = arg0.method4837();
		}
		local437 = 0;
		if (local21 >= 6) {
			super.anInt4884 = local437 = arg0.method4816();
		}
		if (super.anInt4884 != 1 && super.anInt4884 != 2) {
			super.anInt4884 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean362 = arg0.method4816() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean351 = arg0.method4816() == 1;
		}
		if (local21 >= 9) {
			super.anInt4873 = arg0.method4816();
		}
		if (super.anInt4873 < 0 || super.anInt4873 > Static266.method5020(Class208.anInt5790)) {
			super.anInt4873 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean356 = arg0.method4816() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean363 = arg0.method4816() != 0;
		}
		if (local21 >= 12) {
			super.anInt4885 = arg0.method4816();
		}
		if (super.anInt4885 < 0 || super.anInt4885 > 2) {
			super.anInt4885 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean357 = arg0.method4816() == 1;
		}
		if (local21 >= 14) {
			super.anInt4868 = arg0.method4816();
		} else if (local437 == 0) {
			super.anInt4868 = 2;
		} else {
			super.anInt4868 = 1;
		}
		if (super.anInt4868 < 0 || super.anInt4868 > 3) {
			super.anInt4868 = 2;
		}
		if (local21 >= 15) {
			super.anInt4871 = arg0.method4816();
			if (super.anInt4871 < 0 || super.anInt4871 > 4) {
				super.anInt4871 = Class141.anInt3695 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean360 = arg0.method4816() != 1;
		}
	}
}
