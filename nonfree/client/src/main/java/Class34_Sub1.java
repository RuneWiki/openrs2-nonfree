import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tu")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!tu", name = "lb", descriptor = "[I")
	public static final int[] lb = new int[Static397.anInt7180];

	@OriginalMember(owner = "client!tu", name = "Y", descriptor = "Z")
	public boolean aBoolean460 = false;

	@OriginalMember(owner = "client!tu", name = "mb", descriptor = "Z")
	public boolean aBoolean461 = false;

	static {
		new Class158("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class34_Sub1(@OriginalArg(0) Class183 arg0) {
		super.anInt7168 = 3;
		this.method5477(true);
		super.anInt7175 = 127;
		super.anInt7173 = 127;
		super.anInt7164 = 0;
		super.aBoolean444 = true;
		super.aBoolean457 = true;
		super.aBoolean447 = true;
		super.aBoolean443 = true;
		super.anInt7176 = 0;
		super.aBoolean442 = false;
		super.anInt7158 = 0;
		super.aBoolean455 = true;
		super.aBoolean456 = true;
		super.anInt7156 = 0;
		super.aBoolean459 = true;
		super.aBoolean452 = true;
		super.aBoolean448 = true;
		super.aBoolean451 = true;
		super.anInt7161 = 0;
		super.anInt7157 = 255;
		super.anInt7160 = 2;
		super.anInt7166 = 1;
		if (Static155.anInt3339 >= 96) {
			Static176.method2984(2);
		} else {
			Static176.method2984(0);
		}
		super.anInt7174 = 2;
		super.aBoolean445 = false;
		super.anInt7162 = 2;
		super.aBoolean450 = true;
		super.anInt7170 = 0;
		super.aBoolean446 = true;
		super.aBoolean454 = false;
		super.aBoolean453 = false;
		super.anInt7171 = Static142.anInt3100 == 1 ? 2 : 4;
		super.anInt7165 = 0;
		@Pc(129) Class128 local129 = null;
		try {
			@Pc(135) Class157 local135 = arg0.method4157("", true);
			while (local135.anInt4667 == 0) {
				Static289.method4249(1L);
			}
			if (local135.anInt4667 == 1) {
				local129 = (Class128) local135.anObject13;
				@Pc(159) byte[] local159 = new byte[(int) local129.method3092()];
				@Pc(173) int local173;
				for (@Pc(161) int local161 = 0; local161 < local159.length; local161 += local173) {
					local173 = local129.method3093(local159.length - local161, local161, local159);
					if (local173 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method5467(new Class1_Sub3(local159));
			}
		} catch (@Pc(203) Exception local203) {
		}
		try {
			if (local129 != null) {
				local129.method3091();
			}
		} catch (@Pc(210) Exception local210) {
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!ia;I)V")
	private void method5467(@OriginalArg(0) Class1_Sub3 arg0) {
		if (arg0.aByteArray14.length - arg0.anInt1710 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method1171();
		if (local21 < 0 || local21 > 17) {
			return;
		}
		@Pc(40) byte local40;
		if (local21 == 17) {
			local40 = 40;
		} else if (local21 == 16) {
			local40 = 38;
		} else if (local21 == 15) {
			local40 = 37;
		} else if (local21 == 14) {
			local40 = 36;
		} else if (local21 == 13) {
			local40 = 35;
		} else if (local21 == 12) {
			local40 = 34;
		} else if (local21 == 11) {
			local40 = 33;
		} else if (local21 == 10) {
			local40 = 32;
		} else if (local21 == 9) {
			local40 = 31;
		} else if (local21 == 8) {
			local40 = 30;
		} else if (local21 == 7) {
			local40 = 29;
		} else if (local21 == 6) {
			local40 = 28;
		} else if (local21 == 5) {
			local40 = 28;
		} else if (local21 == 4) {
			local40 = 24;
		} else if (local21 == 3) {
			local40 = 23;
		} else if (local21 == 2) {
			local40 = 22;
		} else if (local21 == 1) {
			local40 = 23;
		} else {
			local40 = 19;
		}
		if (arg0.aByteArray14.length - arg0.anInt1710 < local40) {
			return;
		}
		super.anInt7168 = arg0.method1171();
		if (super.anInt7168 < 1) {
			super.anInt7168 = 1;
		} else if (super.anInt7168 > 4) {
			super.anInt7168 = 4;
		}
		this.method5477(arg0.method1171() == 1);
		super.aBoolean457 = arg0.method1171() == 1;
		super.aBoolean455 = arg0.method1171() == 1;
		super.aBoolean448 = arg0.method1171() == 1;
		super.anInt7166 = arg0.method1171() == 1 ? 1 : 0;
		super.aBoolean456 = arg0.method1171() == 1;
		super.aBoolean444 = arg0.method1171() == 1;
		super.aBoolean452 = arg0.method1171() == 1;
		super.anInt7160 = arg0.method1171();
		if (super.anInt7160 > 2) {
			super.anInt7160 = 2;
		}
		if (local21 >= 17) {
			super.anInt7156 = arg0.method1171();
		}
		if (local21 < 2) {
			super.aBoolean459 = arg0.method1171() == 1;
			arg0.method1171();
		} else {
			super.aBoolean459 = arg0.method1171() == 1;
			if (local21 >= 17) {
				super.aBoolean442 = arg0.method1171() == 1;
			}
		}
		super.aBoolean451 = arg0.method1171() == 1;
		super.aBoolean447 = arg0.method1171() == 1;
		super.anInt7176 = arg0.method1171();
		if (super.anInt7176 > 2) {
			super.anInt7176 = 2;
		}
		super.anInt7161 = super.anInt7176;
		super.aBoolean443 = arg0.method1171() == 1;
		super.anInt7173 = arg0.method1171();
		if (super.anInt7173 > 127) {
			super.anInt7173 = 127;
		}
		super.anInt7157 = arg0.method1171();
		super.anInt7175 = arg0.method1171();
		if (super.anInt7175 > 127) {
			super.anInt7175 = 127;
		}
		if (local21 >= 1) {
			super.anInt7158 = arg0.method1177();
			super.anInt7164 = arg0.method1177();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method1171();
		}
		@Pc(471) int local471;
		if (local21 >= 4) {
			local471 = arg0.method1171();
			if (local471 < 0 || local471 > 2) {
				local471 = 0;
			}
			if (Static155.anInt3339 < 96) {
				local471 = 0;
			}
			Static176.method2984(local471);
		}
		if (local21 >= 5) {
			super.anInt7170 = arg0.method1188();
		}
		local471 = 0;
		if (local21 >= 6) {
			super.anInt7174 = local471 = arg0.method1171();
		}
		if (super.anInt7174 != 1 && super.anInt7174 != 2) {
			super.anInt7174 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean445 = arg0.method1171() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean454 = arg0.method1171() == 1;
		}
		if (local21 >= 9) {
			super.anInt7165 = arg0.method1171();
		}
		if (super.anInt7165 < 0 || super.anInt7165 > Static380.method5247(Static155.anInt3339)) {
			super.anInt7165 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean453 = arg0.method1171() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean450 = arg0.method1171() != 0;
		}
		if (local21 >= 12) {
			super.anInt7166 = arg0.method1171();
		}
		if (super.anInt7166 < 0 || super.anInt7166 > 2) {
			super.anInt7166 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean446 = arg0.method1171() == 1;
		}
		if (local21 >= 14) {
			super.anInt7162 = arg0.method1171();
		} else if (local471 == 0) {
			super.anInt7162 = 2;
		} else {
			super.anInt7162 = 1;
		}
		if (super.anInt7162 < 0 || super.anInt7162 > 3) {
			super.anInt7162 = 2;
		}
		if (local21 >= 15) {
			super.anInt7171 = arg0.method1171();
			if (super.anInt7171 < 0 || super.anInt7171 > 4) {
				super.anInt7171 = Static142.anInt3100 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean458 = arg0.method1171() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean458 = false;
				}
			} catch (@Pc(728) Throwable local728) {
			}
		}
		if (local21 < 17 && super.anInt7162 == 0) {
			super.anInt7162 = 2;
		}
	}

	@OriginalMember(owner = "client!tu", name = "c", descriptor = "(II)Z")
	public boolean method5469(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean449 : true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(BI)I")
	public int method5470(@OriginalArg(1) int arg0) {
		if (this.aBoolean460) {
			return 0;
		} else if (this.method5471(arg0)) {
			return super.aBoolean457 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "(II)Z")
	public boolean method5471(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean461 ? super.aBoolean449 : true;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lclient!nv;Z)V")
	public void method5473(@OriginalArg(0) Class183 arg0) {
		@Pc(5) Class128 local5 = null;
		try {
			@Pc(11) Class157 local11 = arg0.method4157("", true);
			while (local11.anInt4667 == 0) {
				Static289.method4249(1L);
			}
			if (local11.anInt4667 == 1) {
				local5 = (Class128) local11.anObject13;
				@Pc(30) Class1_Sub3 local30 = this.method5476();
				local5.method3089(local30.anInt1710, 0, local30.aByteArray14);
			}
		} catch (@Pc(40) Exception local40) {
		}
		try {
			if (local5 != null) {
				local5.method3091();
			}
		} catch (@Pc(47) Exception local47) {
		}
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)Lclient!ia;")
	public Class1_Sub3 method5476() {
		@Pc(8) Class1_Sub3 local8 = new Class1_Sub3(41);
		local8.method1208(17);
		local8.method1208(super.anInt7168);
		local8.method1208(super.aBoolean449 ? 1 : 0);
		local8.method1208(super.aBoolean457 ? 1 : 0);
		local8.method1208(super.aBoolean455 ? 1 : 0);
		local8.method1208(super.aBoolean448 ? 1 : 0);
		local8.method1208(0);
		local8.method1208(super.aBoolean456 ? 1 : 0);
		local8.method1208(super.aBoolean444 ? 1 : 0);
		local8.method1208(super.aBoolean452 ? 1 : 0);
		local8.method1208(super.anInt7160);
		local8.method1208(super.anInt7156);
		local8.method1208(super.aBoolean459 ? 1 : 0);
		local8.method1208(super.aBoolean442 ? 1 : 0);
		local8.method1208(super.aBoolean451 ? 1 : 0);
		local8.method1208(super.aBoolean447 ? 1 : 0);
		local8.method1208(super.anInt7176);
		local8.method1208(super.aBoolean443 ? 1 : 0);
		local8.method1208(super.anInt7173);
		local8.method1208(super.anInt7157);
		local8.method1208(super.anInt7175);
		local8.method1227(super.anInt7158);
		local8.method1227(super.anInt7164);
		local8.method1208(Static301.method4354());
		local8.method1197(super.anInt7170);
		local8.method1208(super.anInt7174);
		local8.method1208(super.aBoolean445 ? 1 : 0);
		local8.method1208(super.aBoolean454 ? 1 : 0);
		local8.method1208(super.anInt7165);
		local8.method1208(super.aBoolean453 ? 1 : 0);
		local8.method1208(super.aBoolean450 ? 1 : 0);
		local8.method1208(super.anInt7166);
		local8.method1208(super.aBoolean446 ? 1 : 0);
		local8.method1208(super.anInt7162);
		local8.method1208(super.anInt7171);
		local8.method1208(super.aBoolean458 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI)V")
	public void method5477(@OriginalArg(0) boolean arg0) {
		super.aBoolean449 = arg0;
		if (Static455.aClass161_4 != null) {
			Static455.aClass161_4.method3630(!this.method5471(Static262.anInt2805));
		}
	}
}
