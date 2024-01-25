import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class301 {

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Lclient!sg;")
	public Class306 aClass306_2;

	@OriginalMember(owner = "client!sd", name = "e", descriptor = "Ljava/lang/String;")
	private String aString99 = "";

	@OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
	public int anInt8959 = 70;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	private int anInt8949 = -1;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	public int anInt8956 = -1;

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
	private int anInt8958 = -1;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	private int anInt8952 = -1;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
	public int anInt8966 = 16777215;

	@OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
	public int anInt8964 = -1;

	@OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
	public int anInt8960 = -1;

	@OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
	public int anInt8970 = 0;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	private int anInt8950 = -1;

	@OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
	public int anInt8965 = 0;

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
	public int anInt8962 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!tn;I)V")
	public void method7382(@OriginalArg(0) Class3_Sub15 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8401();
			if (local13 == 0) {
				return;
			}
			this.method7383(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!tn;I)V")
	private void method7383(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt8960 = arg1.method8414();
		} else if (arg0 == 2) {
			this.anInt8966 = arg1.method8421();
		} else if (arg0 == 3) {
			this.anInt8950 = arg1.method8414();
		} else if (arg0 == 4) {
			this.anInt8958 = arg1.method8414();
		} else if (arg0 == 5) {
			this.anInt8949 = arg1.method8414();
		} else if (arg0 == 6) {
			this.anInt8952 = arg1.method8414();
		} else if (arg0 == 7) {
			this.anInt8970 = arg1.method8444();
		} else if (arg0 == 8) {
			this.aString99 = arg1.method8416();
		} else if (arg0 == 9) {
			this.anInt8959 = arg1.method8414();
		} else if (arg0 == 10) {
			this.anInt8962 = arg1.method8444();
		} else if (arg0 == 11) {
			this.anInt8964 = 0;
		} else if (arg0 == 12) {
			this.anInt8956 = arg1.method8401();
		} else if (arg0 == 13) {
			this.anInt8965 = arg1.method8444();
		} else if (arg0 == 14) {
			this.anInt8964 = arg1.method8414();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BLclient!ha;)Lclient!ac;")
	public Class5 method7385(@OriginalArg(1) Class33 arg0) {
		if (this.anInt8952 < 0) {
			return null;
		}
		@Pc(21) Class5 local21 = (Class5) this.aClass306_2.aClass112_55.method3640((long) this.anInt8952);
		if (local21 == null) {
			this.method7390(arg0);
			local21 = (Class5) this.aClass306_2.aClass112_55.method3640((long) this.anInt8952);
		}
		return local21;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(BLclient!ha;)Lclient!ac;")
	public Class5 method7386(@OriginalArg(1) Class33 arg0) {
		if (this.anInt8949 < 0) {
			return null;
		}
		@Pc(24) Class5 local24 = (Class5) this.aClass306_2.aClass112_55.method3640((long) this.anInt8949);
		if (local24 == null) {
			this.method7390(arg0);
			local24 = (Class5) this.aClass306_2.aClass112_55.method3640((long) this.anInt8949);
		}
		return local24;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!ha;)Lclient!ac;")
	public Class5 method7387(@OriginalArg(1) Class33 arg0) {
		if (this.anInt8958 < 0) {
			return null;
		}
		@Pc(26) Class5 local26 = (Class5) this.aClass306_2.aClass112_55.method3640((long) this.anInt8958);
		if (local26 == null) {
			this.method7390(arg0);
			local26 = (Class5) this.aClass306_2.aClass112_55.method3640((long) this.anInt8958);
		}
		return local26;
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method7388(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = this.aString99;
		while (true) {
			@Pc(19) int local19 = local8.indexOf("%1");
			if (local19 < 0) {
				return local8;
			}
			local8 = local8.substring(0, local19) + Static165.method3467(arg0, false) + local8.substring(local19 + 2);
		}
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(BLclient!ha;)V")
	private void method7390(@OriginalArg(1) Class33 arg0) {
		@Pc(14) Class181 local14 = this.aClass306_2.aClass181_106;
		@Pc(37) Class28 local37;
		if (this.anInt8950 >= 0 && this.aClass306_2.aClass112_55.method3640((long) this.anInt8950) == null && local14.method5040(this.anInt8950)) {
			local37 = Static649.method605(local14, this.anInt8950);
			this.aClass306_2.aClass112_55.method3636((long) this.anInt8950, arg0.method6161(local37, true));
		}
		if (this.anInt8949 >= 0 && this.aClass306_2.aClass112_55.method3640((long) this.anInt8949) == null && local14.method5040(this.anInt8949)) {
			local37 = Static649.method605(local14, this.anInt8949);
			this.aClass306_2.aClass112_55.method3636((long) this.anInt8949, arg0.method6161(local37, true));
		}
		if (this.anInt8958 >= 0 && this.aClass306_2.aClass112_55.method3640((long) this.anInt8958) == null && local14.method5040(this.anInt8958)) {
			local37 = Static649.method605(local14, this.anInt8958);
			this.aClass306_2.aClass112_55.method3636((long) this.anInt8958, arg0.method6161(local37, true));
		}
		if (this.anInt8952 >= 0 && this.aClass306_2.aClass112_55.method3640((long) this.anInt8952) == null && local14.method5040(this.anInt8952)) {
			local37 = Static649.method605(local14, this.anInt8952);
			this.aClass306_2.aClass112_55.method3636((long) this.anInt8952, arg0.method6161(local37, true));
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!ha;I)Lclient!ac;")
	public Class5 method7391(@OriginalArg(0) Class33 arg0) {
		if (this.anInt8950 < 0) {
			return null;
		}
		@Pc(21) Class5 local21 = (Class5) this.aClass306_2.aClass112_55.method3640((long) this.anInt8950);
		if (local21 == null) {
			this.method7390(arg0);
			local21 = (Class5) this.aClass306_2.aClass112_55.method3640((long) this.anInt8950);
		}
		return local21;
	}
}
