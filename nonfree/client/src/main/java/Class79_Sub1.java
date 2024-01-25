import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class79_Sub1 extends Class79 {

	@OriginalMember(owner = "client!nn", name = "V", descriptor = "Z")
	public boolean aBoolean369 = false;

	@OriginalMember(owner = "client!nn", name = "X", descriptor = "Z")
	public boolean aBoolean370 = false;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!dr;)V")
	public Class79_Sub1(@OriginalArg(0) Class59 arg0) {
		super.anInt4928 = 3;
		this.method3964(true);
		super.aBoolean367 = true;
		super.anInt4924 = 2;
		super.aBoolean368 = true;
		super.anInt4931 = 255;
		super.anInt4914 = 0;
		super.aBoolean357 = false;
		super.aBoolean359 = true;
		super.aBoolean365 = true;
		super.anInt4916 = 0;
		super.anInt4927 = 0;
		super.aBoolean354 = true;
		super.anInt4920 = 127;
		super.aBoolean361 = true;
		super.anInt4918 = 0;
		super.aBoolean362 = true;
		super.aBoolean366 = true;
		super.anInt4930 = 0;
		super.anInt4915 = 127;
		super.aBoolean360 = true;
		super.aBoolean358 = true;
		super.anInt4925 = 1;
		if (Static7.anInt219 >= 96) {
			Static404.method5328(2);
		} else {
			Static404.method5328(0);
		}
		super.anInt4926 = 2;
		super.aBoolean351 = true;
		super.aBoolean364 = false;
		super.anInt4929 = 0;
		super.anInt4913 = Static280.anInt5104 == 1 ? 2 : 4;
		super.aBoolean363 = false;
		super.anInt4919 = 0;
		super.anInt4917 = 2;
		super.aBoolean353 = false;
		super.aBoolean355 = true;
		@Pc(131) Class99 local131 = null;
		try {
			@Pc(136) Class138 local136 = arg0.method1355("");
			while (local136.anInt3723 == 0) {
				Static81.method1477(1L);
			}
			if (local136.anInt3723 == 1) {
				local131 = (Class99) local136.anObject7;
				@Pc(160) byte[] local160 = new byte[(int) local131.method2256()];
				@Pc(174) int local174;
				for (@Pc(162) int local162 = 0; local162 < local160.length; local162 += local174) {
					local174 = local131.method2255(local162, local160.length - local162, local160);
					if (local174 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method3965(new Class2_Sub23(local160));
			}
		} catch (@Pc(199) Exception local199) {
		}
		try {
			if (local131 != null) {
				local131.method2257();
			}
		} catch (@Pc(206) Exception local206) {
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)I")
	public int method3962(@OriginalArg(0) int arg0) {
		if (this.aBoolean369) {
			return 0;
		} else if (this.method3966(arg0)) {
			return super.aBoolean367 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)Lclient!si;")
	public Class2_Sub23 method3963() {
		@Pc(8) Class2_Sub23 local8 = new Class2_Sub23(41);
		local8.method5449(17);
		local8.method5449(super.anInt4928);
		local8.method5449(super.aBoolean356 ? 1 : 0);
		local8.method5449(super.aBoolean367 ? 1 : 0);
		local8.method5449(super.aBoolean360 ? 1 : 0);
		local8.method5449(super.aBoolean361 ? 1 : 0);
		local8.method5449(0);
		local8.method5449(super.aBoolean368 ? 1 : 0);
		local8.method5449(super.aBoolean365 ? 1 : 0);
		local8.method5449(super.aBoolean366 ? 1 : 0);
		local8.method5449(super.anInt4924);
		local8.method5449(super.anInt4918);
		local8.method5449(super.aBoolean359 ? 1 : 0);
		local8.method5449(super.aBoolean357 ? 1 : 0);
		local8.method5449(super.aBoolean354 ? 1 : 0);
		local8.method5449(super.aBoolean362 ? 1 : 0);
		local8.method5449(super.anInt4927);
		local8.method5449(super.aBoolean358 ? 1 : 0);
		local8.method5449(super.anInt4920);
		local8.method5449(super.anInt4931);
		local8.method5449(super.anInt4915);
		local8.method5502(super.anInt4916);
		local8.method5502(super.anInt4914);
		local8.method5449(Static38.method5045());
		local8.method5506(super.anInt4919);
		local8.method5449(super.anInt4917);
		local8.method5449(super.aBoolean353 ? 1 : 0);
		local8.method5449(super.aBoolean363 ? 1 : 0);
		local8.method5449(super.anInt4929);
		local8.method5449(super.aBoolean364 ? 1 : 0);
		local8.method5449(super.aBoolean355 ? 1 : 0);
		local8.method5449(super.anInt4925);
		local8.method5449(super.aBoolean351 ? 1 : 0);
		local8.method5449(super.anInt4926);
		local8.method5449(super.anInt4913);
		local8.method5449(super.aBoolean352 ? 1 : 0);
		return local8;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)V")
	public void method3964(@OriginalArg(0) boolean arg0) {
		super.aBoolean356 = arg0;
		if (Static118.aClass165_2 != null) {
			Static118.aClass165_2.method3806(!this.method3966(Static399.anInt6653));
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!si;I)V")
	private void method3965(@OriginalArg(0) Class2_Sub23 arg0) {
		if (arg0.aByteArray130.length - arg0.anInt6952 < 1) {
			return;
		}
		@Pc(20) int local20 = arg0.method5495();
		if (local20 < 0 || local20 > 17) {
			return;
		}
		@Pc(33) byte local33;
		if (local20 == 17) {
			local33 = 40;
		} else if (local20 == 16) {
			local33 = 38;
		} else if (local20 == 15) {
			local33 = 37;
		} else if (local20 == 14) {
			local33 = 36;
		} else if (local20 == 13) {
			local33 = 35;
		} else if (local20 == 12) {
			local33 = 34;
		} else if (local20 == 11) {
			local33 = 33;
		} else if (local20 == 10) {
			local33 = 32;
		} else if (local20 == 9) {
			local33 = 31;
		} else if (local20 == 8) {
			local33 = 30;
		} else if (local20 == 7) {
			local33 = 29;
		} else if (local20 == 6) {
			local33 = 28;
		} else if (local20 == 5) {
			local33 = 28;
		} else if (local20 == 4) {
			local33 = 24;
		} else if (local20 == 3) {
			local33 = 23;
		} else if (local20 == 2) {
			local33 = 22;
		} else if (local20 == 1) {
			local33 = 23;
		} else {
			local33 = 19;
		}
		if (local33 > arg0.aByteArray130.length - arg0.anInt6952) {
			return;
		}
		super.anInt4928 = arg0.method5495();
		if (super.anInt4928 < 1) {
			super.anInt4928 = 1;
		} else if (super.anInt4928 > 4) {
			super.anInt4928 = 4;
		}
		this.method3964(arg0.method5495() == 1);
		super.aBoolean367 = arg0.method5495() == 1;
		super.aBoolean360 = arg0.method5495() == 1;
		super.aBoolean361 = arg0.method5495() == 1;
		super.anInt4925 = arg0.method5495() == 1 ? 1 : 0;
		super.aBoolean368 = arg0.method5495() == 1;
		super.aBoolean365 = arg0.method5495() == 1;
		super.aBoolean366 = arg0.method5495() == 1;
		super.anInt4924 = arg0.method5495();
		if (super.anInt4924 > 2) {
			super.anInt4924 = 2;
		}
		if (local20 >= 17) {
			super.anInt4918 = arg0.method5495();
		}
		if (local20 >= 2) {
			super.aBoolean359 = arg0.method5495() == 1;
			if (local20 >= 17) {
				super.aBoolean357 = arg0.method5495() == 1;
			}
		} else {
			super.aBoolean359 = arg0.method5495() == 1;
			arg0.method5495();
		}
		super.aBoolean354 = arg0.method5495() == 1;
		super.aBoolean362 = arg0.method5495() == 1;
		super.anInt4927 = arg0.method5495();
		if (super.anInt4927 > 2) {
			super.anInt4927 = 2;
		}
		super.anInt4930 = super.anInt4927;
		super.aBoolean358 = arg0.method5495() == 1;
		super.anInt4920 = arg0.method5495();
		if (super.anInt4920 > 127) {
			super.anInt4920 = 127;
		}
		super.anInt4931 = arg0.method5495();
		super.anInt4915 = arg0.method5495();
		if (super.anInt4915 > 127) {
			super.anInt4915 = 127;
		}
		if (local20 >= 1) {
			super.anInt4916 = arg0.method5500();
			super.anInt4914 = arg0.method5500();
		}
		if (local20 >= 3 && local20 < 6) {
			arg0.method5495();
		}
		@Pc(491) int local491;
		if (local20 >= 4) {
			local491 = arg0.method5495();
			if (local491 < 0 || local491 > 2) {
				local491 = 0;
			}
			if (Static7.anInt219 < 96) {
				local491 = 0;
			}
			Static404.method5328(local491);
		}
		if (local20 >= 5) {
			super.anInt4919 = arg0.method5508();
		}
		local491 = 0;
		if (local20 >= 6) {
			super.anInt4917 = local491 = arg0.method5495();
		}
		if (super.anInt4917 != 1 && super.anInt4917 != 2) {
			super.anInt4917 = 2;
		}
		if (local20 >= 7) {
			super.aBoolean353 = arg0.method5495() == 1;
		}
		if (local20 >= 8) {
			super.aBoolean363 = arg0.method5495() == 1;
		}
		if (local20 >= 9) {
			super.anInt4929 = arg0.method5495();
		}
		if (super.anInt4929 < 0 || super.anInt4929 > Static184.method2948(Static7.anInt219)) {
			super.anInt4929 = 0;
		}
		if (local20 >= 10) {
			super.aBoolean364 = arg0.method5495() != 0;
		}
		if (local20 >= 11) {
			super.aBoolean355 = arg0.method5495() != 0;
		}
		if (local20 >= 12) {
			super.anInt4925 = arg0.method5495();
		}
		if (super.anInt4925 < 0 || super.anInt4925 > 2) {
			super.anInt4925 = 1;
		}
		if (local20 >= 13) {
			super.aBoolean351 = arg0.method5495() == 1;
		}
		if (local20 >= 14) {
			super.anInt4926 = arg0.method5495();
		} else if (local491 == 0) {
			super.anInt4926 = 2;
		} else {
			super.anInt4926 = 1;
		}
		if (super.anInt4926 < 0 || super.anInt4926 > 3) {
			super.anInt4926 = 2;
		}
		if (local20 >= 15) {
			super.anInt4913 = arg0.method5495();
			if (super.anInt4913 < 0 || super.anInt4913 > 4) {
				super.anInt4913 = Static280.anInt5104 == 1 ? 2 : 4;
			}
		}
		if (local20 >= 16) {
			super.aBoolean352 = arg0.method5495() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean352 = false;
				}
			} catch (@Pc(762) Throwable local762) {
			}
		}
		if (local20 < 17 && super.anInt4926 == 0) {
			super.anInt4926 = 2;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)Z")
	public boolean method3966(@OriginalArg(0) int arg0) {
		return arg0 == 0 && !this.aBoolean370 ? super.aBoolean356 : true;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)Z")
	public boolean method3967(@OriginalArg(0) int arg0) {
		return arg0 == 0 ? super.aBoolean356 : true;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BLclient!dr;)V")
	public void method3969(@OriginalArg(1) Class59 arg0) {
		@Pc(7) Class99 local7 = null;
		try {
			@Pc(12) Class138 local12 = arg0.method1355("");
			while (local12.anInt3723 == 0) {
				Static81.method1477(1L);
			}
			if (local12.anInt3723 == 1) {
				local7 = (Class99) local12.anObject7;
				@Pc(37) Class2_Sub23 local37 = this.method3963();
				local7.method2252(0, local37.anInt6952, local37.aByteArray130);
			}
		} catch (@Pc(55) Exception local55) {
		}
		try {
			if (local7 != null) {
				local7.method2257();
			}
		} catch (@Pc(62) Exception local62) {
		}
	}
}
