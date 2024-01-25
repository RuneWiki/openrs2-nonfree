import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!bo", name = "Q", descriptor = "Z")
	public boolean aBoolean88 = false;

	@OriginalMember(owner = "client!bo", name = "S", descriptor = "Z")
	public boolean aBoolean89 = false;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!qn;)V")
	public Class28_Sub1(@OriginalArg(0) Class209 arg0) {
		super.anInt1043 = 3;
		this.method834(true);
		super.aBoolean83 = true;
		super.anInt1034 = 2;
		super.aBoolean78 = true;
		super.anInt1031 = 0;
		super.aBoolean74 = true;
		super.anInt1024 = 0;
		super.aBoolean84 = true;
		super.aBoolean80 = true;
		super.aBoolean86 = true;
		super.anInt1038 = 0;
		super.aBoolean77 = true;
		super.aBoolean73 = true;
		super.anInt1040 = 1;
		super.aBoolean71 = true;
		super.anInt1042 = 127;
		super.anInt1033 = 255;
		super.anInt1036 = 127;
		super.aBoolean72 = true;
		super.anInt1035 = 0;
		if (Static270.anInt4876 < 96) {
			Static88.method4156(0);
		} else {
			Static88.method4156(2);
		}
		super.anInt1022 = 0;
		super.aBoolean85 = false;
		super.anInt1023 = 2;
		super.anInt1026 = Static417.anInt7458 == 1 ? 2 : 4;
		super.anInt1032 = 2;
		super.aBoolean82 = false;
		super.anInt1037 = 0;
		super.aBoolean76 = true;
		super.aBoolean79 = false;
		super.aBoolean81 = true;
		@Pc(125) Class46 local125 = null;
		try {
			@Pc(130) Class122 local130 = arg0.method4698("");
			while (local130.anInt3557 == 0) {
				Static88.method4161(1L);
			}
			if (local130.anInt3557 == 1) {
				local125 = (Class46) local130.anObject7;
				@Pc(155) byte[] local155 = new byte[(int) local125.method1368()];
				@Pc(169) int local169;
				for (@Pc(157) int local157 = 0; local157 < local155.length; local157 += local169) {
					local169 = local125.method1365(local155, local155.length - local157, local157);
					if (local169 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method829(new Class6_Sub1(local155));
			}
		} catch (@Pc(194) Exception local194) {
		}
		try {
			if (local125 != null) {
				local125.method1367();
			}
		} catch (@Pc(201) Exception local201) {
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Z")
	public boolean method828(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean87 : true;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!ae;I)V")
	private void method829(@OriginalArg(0) Class6_Sub1 arg0) {
		if (arg0.aByteArray96.length - arg0.anInt7898 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method6433();
		if (local21 < 0 || local21 > 16) {
			return;
		}
		@Pc(44) byte local44;
		if (local21 == 16) {
			local44 = 38;
		} else if (local21 == 15) {
			local44 = 37;
		} else if (local21 == 14) {
			local44 = 36;
		} else if (local21 == 13) {
			local44 = 35;
		} else if (local21 == 12) {
			local44 = 34;
		} else if (local21 == 11) {
			local44 = 33;
		} else if (local21 == 10) {
			local44 = 32;
		} else if (local21 == 9) {
			local44 = 31;
		} else if (local21 == 8) {
			local44 = 30;
		} else if (local21 == 7) {
			local44 = 29;
		} else if (local21 == 6) {
			local44 = 28;
		} else if (local21 == 5) {
			local44 = 28;
		} else if (local21 == 4) {
			local44 = 24;
		} else if (local21 == 3) {
			local44 = 23;
		} else if (local21 == 2) {
			local44 = 22;
		} else if (local21 == 1) {
			local44 = 23;
		} else {
			local44 = 19;
		}
		if (local44 > arg0.aByteArray96.length - arg0.anInt7898) {
			return;
		}
		super.anInt1043 = arg0.method6433();
		if (super.anInt1043 < 1) {
			super.anInt1043 = 1;
		} else if (super.anInt1043 > 4) {
			super.anInt1043 = 4;
		}
		this.method834(arg0.method6433() == 1);
		super.aBoolean72 = arg0.method6433() == 1;
		super.aBoolean78 = arg0.method6433() == 1;
		super.aBoolean71 = arg0.method6433() == 1;
		super.anInt1040 = arg0.method6433() == 1 ? 1 : 0;
		super.aBoolean80 = arg0.method6433() == 1;
		super.aBoolean83 = arg0.method6433() == 1;
		super.aBoolean77 = arg0.method6433() == 1;
		super.anInt1034 = arg0.method6433();
		if (super.anInt1034 > 2) {
			super.anInt1034 = 2;
		}
		if (local21 >= 2) {
			super.aBoolean74 = arg0.method6433() == 1;
		} else {
			super.aBoolean74 = arg0.method6433() == 1;
			arg0.method6433();
		}
		super.aBoolean86 = arg0.method6433() == 1;
		super.aBoolean84 = arg0.method6433() == 1;
		super.anInt1035 = arg0.method6433();
		if (super.anInt1035 > 2) {
			super.anInt1035 = 2;
		}
		super.anInt1038 = super.anInt1035;
		super.aBoolean73 = arg0.method6433() == 1;
		super.anInt1042 = arg0.method6433();
		if (super.anInt1042 > 127) {
			super.anInt1042 = 127;
		}
		super.anInt1033 = arg0.method6433();
		super.anInt1036 = arg0.method6433();
		if (super.anInt1036 > 127) {
			super.anInt1036 = 127;
		}
		if (local21 >= 1) {
			super.anInt1031 = arg0.method6485();
			super.anInt1024 = arg0.method6485();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method6433();
		}
		@Pc(459) int local459;
		if (local21 >= 4) {
			local459 = arg0.method6433();
			if (local459 < 0 || local459 > 2) {
				local459 = 0;
			}
			if (Static270.anInt4876 < 96) {
				local459 = 0;
			}
			Static88.method4156(local459);
		}
		if (local21 >= 5) {
			super.anInt1022 = arg0.method6442();
		}
		local459 = 0;
		if (local21 >= 6) {
			super.anInt1023 = local459 = arg0.method6433();
		}
		if (super.anInt1023 != 1 && super.anInt1023 != 2) {
			super.anInt1023 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean79 = arg0.method6433() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean85 = arg0.method6433() == 1;
		}
		if (local21 >= 9) {
			super.anInt1037 = arg0.method6433();
		}
		if (super.anInt1037 < 0 || super.anInt1037 > Static190.method580(Static270.anInt4876)) {
			super.anInt1037 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean82 = arg0.method6433() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean81 = arg0.method6433() != 0;
		}
		if (local21 >= 12) {
			super.anInt1040 = arg0.method6433();
		}
		if (super.anInt1040 < 0 || super.anInt1040 > 2) {
			super.anInt1040 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean76 = arg0.method6433() == 1;
		}
		if (local21 >= 14) {
			super.anInt1032 = arg0.method6433();
		} else if (local459 == 0) {
			super.anInt1032 = 2;
		} else {
			super.anInt1032 = 1;
		}
		if (super.anInt1032 < 0 || super.anInt1032 > 3) {
			super.anInt1032 = 2;
		}
		if (local21 >= 15) {
			super.anInt1026 = arg0.method6433();
			if (super.anInt1026 < 0 || super.anInt1026 > 4) {
				super.anInt1026 = Static417.anInt7458 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean75 = arg0.method6433() != 1;
		}
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(II)I")
	public int method830(@OriginalArg(1) int arg0) {
		if (this.aBoolean89) {
			return 0;
		} else if (this.method832(arg0)) {
			return super.aBoolean72 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!qn;)V")
	public void method831(@OriginalArg(1) Class209 arg0) {
		@Pc(7) Class46 local7 = null;
		try {
			@Pc(12) Class122 local12 = arg0.method4698("");
			while (local12.anInt3557 == 0) {
				Static88.method4161(1L);
			}
			if (local12.anInt3557 == 1) {
				local7 = (Class46) local12.anObject7;
				@Pc(35) Class6_Sub1 local35 = this.method833();
				local7.method1366(local35.anInt7898, 0, local35.aByteArray96);
			}
		} catch (@Pc(45) Exception local45) {
		}
		try {
			if (local7 != null) {
				local7.method1367();
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(II)Z")
	public boolean method832(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean88 ? super.aBoolean87 : true;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Lclient!ae;")
	public Class6_Sub1 method833() {
		@Pc(8) Class6_Sub1 local8 = new Class6_Sub1(39);
		local8.method6439(16);
		local8.method6439(super.anInt1043);
		local8.method6439(super.aBoolean87 ? 1 : 0);
		local8.method6439(super.aBoolean72 ? 1 : 0);
		local8.method6439(super.aBoolean78 ? 1 : 0);
		local8.method6439(super.aBoolean71 ? 1 : 0);
		local8.method6439(0);
		local8.method6439(super.aBoolean80 ? 1 : 0);
		local8.method6439(super.aBoolean83 ? 1 : 0);
		local8.method6439(super.aBoolean77 ? 1 : 0);
		local8.method6439(super.anInt1034);
		local8.method6439(super.aBoolean74 ? 1 : 0);
		local8.method6439(super.aBoolean86 ? 1 : 0);
		local8.method6439(super.aBoolean84 ? 1 : 0);
		local8.method6439(super.anInt1035);
		local8.method6439(super.aBoolean73 ? 1 : 0);
		local8.method6439(super.anInt1042);
		local8.method6439(super.anInt1033);
		local8.method6439(super.anInt1036);
		local8.method6453(super.anInt1031);
		local8.method6453(super.anInt1024);
		local8.method6439(Static193.method3051());
		local8.method6461(super.anInt1022);
		local8.method6439(super.anInt1023);
		local8.method6439(super.aBoolean79 ? 1 : 0);
		local8.method6439(super.aBoolean85 ? 1 : 0);
		local8.method6439(super.anInt1037);
		local8.method6439(super.aBoolean82 ? 1 : 0);
		local8.method6439(super.aBoolean81 ? 1 : 0);
		local8.method6439(super.anInt1040);
		local8.method6439(super.aBoolean76 ? 1 : 0);
		local8.method6439(super.anInt1032);
		local8.method6439(super.anInt1026);
		local8.method6439(super.aBoolean75 ? 0 : 1);
		return local8;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZI)V")
	public void method834(@OriginalArg(0) boolean arg0) {
		super.aBoolean87 = arg0;
		if (Static448.aClass104_4 != null) {
			Static448.aClass104_4.method2619(!this.method832(Static294.anInt5208));
		}
	}
}
