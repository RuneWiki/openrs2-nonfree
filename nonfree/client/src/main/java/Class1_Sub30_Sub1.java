import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class1_Sub30_Sub1 extends Class1_Sub30 {

	@OriginalMember(owner = "client!ko", name = "lb", descriptor = "I")
	public static int lb;

	@OriginalMember(owner = "client!ko", name = "nb", descriptor = "I")
	public int anInt4889;

	@OriginalMember(owner = "client!ko", name = "ib", descriptor = "Z")
	public boolean aBoolean399 = false;

	@OriginalMember(owner = "client!ko", name = "sb", descriptor = "Z")
	public boolean aBoolean400 = false;

	@OriginalMember(owner = "client!ko", name = "hb", descriptor = "Z")
	public boolean aBoolean398 = false;

	@OriginalMember(owner = "client!ko", name = "zb", descriptor = "Z")
	public boolean aBoolean401 = false;

	@OriginalMember(owner = "client!ko", name = "Db", descriptor = "Z")
	public boolean aBoolean402 = false;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(Lclient!ft;)V")
	public Class1_Sub30_Sub1(@OriginalArg(0) Class109 arg0) {
		super.anInt4871 = 3;
		super.anInt4882 = 3;
		this.method3922(true);
		super.anInt4861 = 127;
		super.anInt4857 = 2;
		super.anInt4863 = 127;
		super.anInt4869 = 0;
		super.aBoolean380 = true;
		super.anInt4873 = 0;
		super.aBoolean386 = false;
		super.anInt4870 = 0;
		super.aBoolean395 = true;
		super.aBoolean382 = true;
		super.anInt4858 = 127;
		super.aBoolean396 = true;
		super.aBoolean384 = true;
		super.aBoolean391 = true;
		super.anInt4879 = 0;
		super.anInt4865 = 127;
		super.anInt4860 = 0;
		super.aBoolean394 = true;
		super.aBoolean387 = true;
		super.aBoolean388 = true;
		super.anInt4874 = 1;
		super.aBoolean392 = true;
		super.anInt4868 = 127;
		if (Static117.anInt2297 < 96) {
			Static467.method6429(0);
		} else {
			Static467.method6429(2);
		}
		super.anInt4862 = 0;
		super.anInt4878 = 2;
		super.anInt4856 = Static464.anInt7967 == 1 ? 2 : 4;
		super.aBoolean381 = true;
		super.aBoolean389 = true;
		super.anInt4881 = 2;
		super.aBoolean383 = false;
		super.anInt4864 = 0;
		super.aBoolean390 = false;
		super.anInt4875 = 0;
		super.aBoolean385 = false;
		@Pc(150) Class91 local150 = null;
		try {
			@Pc(156) Class260 local156 = arg0.method2169(true, "");
			while (local156.anInt7041 == 0) {
				Static391.method5400(1L);
			}
			if (local156.anInt7041 == 1) {
				local150 = (Class91) local156.anObject16;
				@Pc(178) byte[] local178 = new byte[(int) local150.method1840()];
				@Pc(193) int local193;
				for (@Pc(180) int local180 = 0; local180 < local178.length; local180 += local193) {
					local193 = local150.method1839(local178.length - local180, local180, local178);
					if (local193 == -1) {
						throw new IOException("EOF");
					}
				}
				this.method3911(new Class1_Sub35(local178));
			}
		} catch (@Pc(219) Exception local219) {
		}
		try {
			if (local150 != null) {
				local150.method1833();
			}
		} catch (@Pc(226) Exception local226) {
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(III)I")
	private int method3910(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(26) byte local26;
		if (arg0 > 20000) {
			this.method3914();
			local26 = 4;
		} else if (arg0 > 10000) {
			this.method3915();
			local26 = 3;
		} else if (arg0 > 5000) {
			local26 = 2;
			this.method3913();
		} else {
			this.method3921(true);
			local26 = 1;
		}
		if (Static113.anInt2222 != arg1) {
			super.anInt4881 = arg1;
			Static523.method7235(arg1);
		}
		this.method3923(Static362.aClass109_5);
		return local26;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILclient!mo;)V")
	private void method3911(@OriginalArg(1) Class1_Sub35 arg0) {
		if (arg0.aByteArray85.length - arg0.anInt7214 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method5750();
		if (local21 < 0 || local21 > 22) {
			return;
		}
		@Pc(51) byte local51;
		if (local21 == 22) {
			local51 = 45;
		} else if (local21 == 21) {
			local51 = 44;
		} else if (local21 == 20) {
			local51 = 43;
		} else if (local21 == 19) {
			local51 = 42;
		} else if (local21 == 18) {
			local51 = 41;
		} else if (local21 == 17) {
			local51 = 40;
		} else if (local21 == 16) {
			local51 = 38;
		} else if (local21 == 15) {
			local51 = 37;
		} else if (local21 == 14) {
			local51 = 36;
		} else if (local21 == 13) {
			local51 = 35;
		} else if (local21 == 12) {
			local51 = 34;
		} else if (local21 == 11) {
			local51 = 33;
		} else if (local21 == 10) {
			local51 = 32;
		} else if (local21 == 9) {
			local51 = 31;
		} else if (local21 == 8) {
			local51 = 30;
		} else if (local21 == 7) {
			local51 = 29;
		} else if (local21 == 6) {
			local51 = 28;
		} else if (local21 == 5) {
			local51 = 28;
		} else if (local21 == 4) {
			local51 = 24;
		} else if (local21 == 3) {
			local51 = 23;
		} else if (local21 == 2) {
			local51 = 22;
		} else if (local21 == 1) {
			local51 = 23;
		} else {
			local51 = 19;
		}
		if (local51 > arg0.aByteArray85.length - arg0.anInt7214) {
			return;
		}
		super.anInt4882 = arg0.method5750();
		if (super.anInt4882 < 1) {
			super.anInt4882 = 1;
		} else if (super.anInt4882 > 4) {
			super.anInt4882 = 4;
		}
		this.method3922(arg0.method5750() == 1);
		super.aBoolean382 = arg0.method5750() == 1;
		super.aBoolean392 = arg0.method5750() == 1;
		super.aBoolean387 = arg0.method5750() == 1;
		super.anInt4874 = arg0.method5750() == 1 ? 1 : 0;
		super.aBoolean396 = arg0.method5750() == 1;
		super.aBoolean384 = arg0.method5750() == 1;
		super.aBoolean395 = arg0.method5750() == 1;
		super.anInt4857 = arg0.method5750();
		if (super.anInt4857 > 2) {
			super.anInt4857 = 2;
		}
		if (local21 >= 17) {
			super.anInt4879 = arg0.method5750();
		}
		if (local21 >= 2) {
			super.aBoolean388 = arg0.method5750() == 1;
			if (local21 >= 17) {
				super.aBoolean386 = arg0.method5750() == 1;
			}
		} else {
			super.aBoolean388 = arg0.method5750() == 1;
			arg0.method5750();
		}
		super.aBoolean391 = arg0.method5750() == 1;
		super.aBoolean380 = arg0.method5750() == 1;
		super.anInt4870 = arg0.method5750();
		if (super.anInt4870 > 2) {
			super.anInt4870 = 2;
		}
		super.anInt4869 = super.anInt4870;
		super.aBoolean394 = arg0.method5750() == 1;
		super.anInt4863 = arg0.method5750();
		if (super.anInt4863 > 127) {
			super.anInt4863 = 127;
		}
		if (local21 >= 20) {
			super.anInt4861 = arg0.method5750();
			if (super.anInt4861 > 127) {
				super.anInt4861 = 127;
			}
		} else {
			super.anInt4861 = super.anInt4863;
		}
		super.anInt4865 = arg0.method5750();
		super.anInt4858 = arg0.method5750();
		if (super.anInt4858 > 127) {
			super.anInt4858 = 127;
		}
		if (local21 >= 21) {
			super.anInt4868 = arg0.method5750();
			if (super.anInt4868 > 127) {
				super.anInt4868 = 127;
			}
		} else {
			super.anInt4868 = super.anInt4865;
		}
		if (local21 >= 1) {
			super.anInt4873 = arg0.method5771();
			super.anInt4860 = arg0.method5771();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method5750();
		}
		@Pc(569) int local569;
		if (local21 >= 4) {
			local569 = arg0.method5750();
			if (local569 < 0 || local569 > 2) {
				local569 = 0;
			}
			if (Static117.anInt2297 < 96) {
				local569 = 0;
			}
			Static467.method6429(local569);
		}
		if (local21 >= 5) {
			super.anInt4862 = arg0.method5804();
		}
		local569 = 0;
		if (local21 >= 6) {
			super.anInt4878 = local569 = arg0.method5750();
		}
		if (super.anInt4878 != 1 && super.anInt4878 != 2) {
			super.anInt4878 = 2;
		}
		if (local21 >= 7) {
			super.aBoolean385 = arg0.method5750() == 1;
		}
		if (local21 >= 8) {
			super.aBoolean383 = arg0.method5750() == 1;
		}
		if (local21 >= 9) {
			super.anInt4864 = arg0.method5750();
		}
		if (super.anInt4864 < 0 || super.anInt4864 > Static497.method4932(Static117.anInt2297)) {
			super.anInt4864 = 0;
		}
		if (local21 >= 10) {
			super.aBoolean390 = arg0.method5750() != 0;
		}
		if (local21 >= 11) {
			super.aBoolean389 = arg0.method5750() != 0;
		}
		if (local21 >= 12) {
			super.anInt4874 = arg0.method5750();
		}
		if (super.anInt4874 < 0 || super.anInt4874 > 2) {
			super.anInt4874 = 1;
		}
		if (local21 >= 13) {
			super.aBoolean381 = arg0.method5750() == 1;
		}
		if (local21 >= 14) {
			super.anInt4881 = arg0.method5750();
		} else if (local569 == 0) {
			super.anInt4881 = 2;
		} else {
			super.anInt4881 = 1;
		}
		if (super.anInt4881 < 0 || super.anInt4881 > 5) {
			super.anInt4881 = 2;
		}
		if (local21 >= 15) {
			super.anInt4856 = arg0.method5750();
			if (super.anInt4856 < 0 || super.anInt4856 > 4) {
				super.anInt4856 = Static464.anInt7967 == 1 ? 2 : 4;
			}
		}
		if (local21 >= 16) {
			super.aBoolean397 = arg0.method5750() == 1;
			try {
				if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
					super.aBoolean397 = false;
				}
			} catch (@Pc(837) Throwable local837) {
			}
		}
		if (local21 < 17 && super.anInt4881 == 0) {
			super.anInt4881 = 2;
		}
		if (local21 >= 18) {
			super.anInt4871 = arg0.method5750();
			if (super.anInt4871 < 0 || super.anInt4871 > 4) {
				super.anInt4871 = 0;
			}
		}
		if (local21 >= 19) {
			super.anInt4875 = arg0.method5750();
		} else if (super.anInt4871 == 1 || super.anInt4871 == 2) {
			super.anInt4875 = 2;
		} else if (super.anInt4871 == 3) {
			super.anInt4875 = 1;
		} else {
			super.anInt4875 = 0;
		}
		if (local21 >= 22) {
			super.anInt4867 = arg0.method5750();
		}
		if (super.anInt4881 == 0 && Static117.anInt2297 < 96 && super.anInt4871 != 1 && super.anInt4871 != 0) {
			this.method3921(false);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZI)Z")
	public boolean method3912(@OriginalArg(1) int arg0) {
		return arg0 == 0 ? super.aBoolean393 : true;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)V")
	public void method3913() {
		this.method3922(true);
		super.aBoolean386 = false;
		super.anInt4857 = super.anInt4879 = 0;
		super.aBoolean397 = false;
		super.aBoolean388 = false;
		super.aBoolean392 = true;
		super.aBoolean391 = false;
		super.aBoolean380 = false;
		super.anInt4874 = 0;
		super.aBoolean387 = false;
		super.anInt4870 = super.anInt4869 = 0;
		super.aBoolean384 = false;
		super.aBoolean382 = false;
		super.aBoolean396 = false;
		super.aBoolean395 = false;
		Static467.method6429(0);
		super.aBoolean390 = false;
		super.aBoolean381 = true;
		super.anInt4864 = 0;
		this.method3924();
		this.method3918(2);
		super.anInt4871 = 2;
		Static34.method7180();
		Static475.method6481();
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V")
	public void method3914() {
		this.method3922(true);
		super.aBoolean396 = true;
		super.aBoolean392 = true;
		super.anInt4874 = 1;
		super.aBoolean395 = true;
		super.aBoolean397 = true;
		super.aBoolean391 = true;
		super.aBoolean386 = true;
		super.aBoolean388 = true;
		super.aBoolean384 = true;
		super.anInt4857 = super.anInt4879 = 2;
		super.aBoolean382 = true;
		super.aBoolean380 = true;
		super.aBoolean387 = true;
		super.anInt4870 = super.anInt4869 = 0;
		if (Static117.anInt2297 <= 95) {
			Static467.method6429(0);
		} else {
			Static467.method6429(2);
		}
		super.aBoolean390 = false;
		super.aBoolean381 = true;
		super.anInt4864 = 0;
		this.method3924();
		this.method3918(0);
		super.anInt4871 = 4;
		Static34.method7180();
		Static475.method6481();
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	public void method3915() {
		this.method3922(true);
		super.aBoolean386 = false;
		super.aBoolean397 = true;
		super.aBoolean384 = true;
		super.aBoolean387 = true;
		super.anInt4857 = super.anInt4879 = 1;
		super.aBoolean382 = true;
		super.aBoolean388 = true;
		super.anInt4874 = 1;
		super.aBoolean395 = true;
		super.aBoolean396 = true;
		super.anInt4870 = super.anInt4869 = 0;
		super.aBoolean392 = true;
		super.aBoolean380 = true;
		super.aBoolean391 = false;
		if (Static117.anInt2297 > 95) {
			Static467.method6429(1);
		} else {
			Static467.method6429(0);
		}
		super.aBoolean390 = false;
		super.aBoolean381 = true;
		super.anInt4864 = 0;
		this.method3924();
		this.method3918(1);
		super.anInt4871 = 3;
		Static34.method7180();
		Static475.method6481();
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(II)I")
	public int method3916(@OriginalArg(1) int arg0) {
		if (this.aBoolean399) {
			return 0;
		} else if (this.method3917(arg0)) {
			return super.aBoolean382 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(II)Z")
	public boolean method3917(@OriginalArg(1) int arg0) {
		return arg0 == 0 && !this.aBoolean398 ? super.aBoolean393 : true;
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(II)V")
	public void method3918(@OriginalArg(0) int arg0) {
		super.anInt4875 = arg0;
		Static208.aClass359Array1 = null;
		Static260.aBoolean351 = true;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)I")
	public int method3919(@OriginalArg(1) int arg0) {
		if (Static137.method2089(arg0) && !Static179.method7292(Static216.anInt4135)) {
			return Static117.anInt2297 < 96 && Static156.method2273(arg0) && super.anInt4875 == 0 ? 1 : super.anInt4875;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "(II)I")
	private int method3920(@OriginalArg(1) int arg0) {
		@Pc(22) byte local22;
		if (arg0 > 12000) {
			local22 = 4;
			this.method3914();
		} else if (arg0 > 5000) {
			this.method3915();
			local22 = 3;
		} else if (arg0 <= 2000) {
			local22 = 1;
			this.method3921(true);
		} else {
			this.method3913();
			local22 = 2;
		}
		if (Static113.anInt2222 != 2) {
			super.anInt4881 = 2;
			Static523.method7235(2);
		}
		this.method3923(Static362.aClass109_5);
		return local22;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZ)V")
	public void method3921(@OriginalArg(1) boolean arg0) {
		this.method3922(false);
		super.aBoolean382 = false;
		super.aBoolean380 = false;
		super.aBoolean392 = false;
		super.aBoolean391 = false;
		super.aBoolean396 = false;
		super.anInt4870 = super.anInt4869 = 0;
		super.aBoolean387 = false;
		super.aBoolean388 = false;
		super.aBoolean397 = false;
		super.anInt4874 = 0;
		super.aBoolean395 = false;
		super.aBoolean386 = false;
		super.anInt4857 = super.anInt4879 = 0;
		super.aBoolean384 = false;
		Static467.method6429(0);
		super.aBoolean390 = false;
		super.aBoolean381 = false;
		super.anInt4864 = 0;
		this.method3924();
		this.method3918(2);
		super.anInt4871 = 1;
		if (arg0) {
			Static34.method7180();
		}
		Static475.method6481();
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(ZI)V")
	public void method3922(@OriginalArg(0) boolean arg0) {
		super.aBoolean393 = arg0;
		if (Static518.aClass96_4 != null) {
			Static518.aClass96_4.method1931(!this.method3917(Static113.anInt2222));
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLclient!ft;)V")
	public void method3923(@OriginalArg(1) Class109 arg0) {
		@Pc(7) Class91 local7 = null;
		try {
			@Pc(19) Class260 local19 = arg0.method2169(true, "");
			while (local19.anInt7041 == 0) {
				Static391.method5400(1L);
			}
			if (local19.anInt7041 == 1) {
				local7 = (Class91) local19.anObject16;
				@Pc(43) Class1_Sub35 local43 = new Class1_Sub35(Static316.method4384());
				this.method3902(local43);
				local7.method1834(local43.anInt7214, 0, local43.aByteArray85);
			}
		} catch (@Pc(57) Exception local57) {
		}
		try {
			if (local7 != null) {
				local7.method1833();
			}
		} catch (@Pc(64) Exception local64) {
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V")
	private void method3924() {
		if (Static464.anInt7967 <= 1) {
			super.anInt4856 = 2;
		} else {
			super.anInt4856 = 4;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)I")
	private int method3925() {
		@Pc(27) byte local27;
		if (Static117.anInt2297 >= 96) {
			@Pc(19) int local19 = Static136.method2085();
			if (local19 <= 100) {
				this.method3914();
				local27 = 4;
			} else if (local19 <= 500) {
				local27 = 3;
				this.method3915();
			} else if (local19 > 1000) {
				local27 = 1;
				this.method3921(true);
			} else {
				this.method3913();
				local27 = 2;
			}
		} else {
			local27 = 1;
			this.method3921(true);
		}
		if (Static113.anInt2222 != 0) {
			super.anInt4881 = 0;
			Static523.method7235(0);
		}
		this.method3923(Static362.aClass109_5);
		return local27;
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(B)I")
	public int method3927() {
		@Pc(13) boolean local13 = false;
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		if (Static362.aClass109_5.aBoolean206 && !Static362.aClass109_5.aBoolean205) {
			if (Static148.aString19.startsWith("win")) {
				local15 = true;
				if (!Static148.aString24.startsWith("amd64") && !Static148.aString24.startsWith("x86_64")) {
					local13 = true;
				}
				local17 = true;
			} else {
				local15 = true;
			}
		}
		if (this.aBoolean400) {
			local13 = false;
		}
		if (this.aBoolean402) {
			local17 = false;
		}
		if (this.aBoolean401) {
			local15 = false;
		}
		if (!local13 && !local15 && !local17) {
			return this.method3925();
		}
		@Pc(72) int local72 = -1;
		@Pc(74) int local74 = -1;
		@Pc(76) int local76 = -1;
		if (local13) {
			try {
				local72 = Static286.method6607(1000, 2);
			} catch (@Pc(85) Exception local85) {
			}
		}
		if (local17) {
			try {
				local76 = Static286.method6607(1000, 3);
				if (Static113.anInt2222 == 3) {
					@Pc(103) Class162 local103 = Static16.aClass134_1.method6962();
					@Pc(108) long local108 = local103.aLong120 & 0xFFFFFFFFFFFFL;
					@Pc(111) int local111 = local103.anInt4278;
					if (local111 == 4318) {
						local15 &= local108 >= 64425238954L;
					} else if (local111 == 4098) {
						local15 &= local108 >= 60129613779L;
					}
				}
			} catch (@Pc(147) Exception local147) {
			}
		}
		if (local15) {
			try {
				local74 = Static286.method6607(1000, 1);
			} catch (@Pc(157) Exception local157) {
			}
		}
		if (local72 == -1 && local74 == -1 && local76 == -1) {
			return this.method3925();
		}
		local74 = (int) ((float) local74 * 1.1F);
		local76 = (int) ((float) local76 * 1.1F);
		if (local72 > local76 && local74 < local72) {
			return this.method3920(local72);
		} else if (local76 <= local74) {
			return this.method3910(local74, 1);
		} else {
			return this.method3910(local76, 3);
		}
	}
}
