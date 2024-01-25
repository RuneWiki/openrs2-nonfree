import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class155 {

	@OriginalMember(owner = "client!hr", name = "k", descriptor = "Lclient!uda;")
	public Class361 aClass361_2;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
	private int anInt3670 = -1;

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
	public int anInt3665 = -1;

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "I")
	public int anInt3675 = 0;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "I")
	private int anInt3677 = -1;

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "I")
	public int anInt3685 = -1;

	@OriginalMember(owner = "client!hr", name = "v", descriptor = "I")
	public int anInt3683 = 70;

	@OriginalMember(owner = "client!hr", name = "w", descriptor = "I")
	private int anInt3684 = -1;

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
	private int anInt3680 = -1;

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "Ljava/lang/String;")
	private String aString33 = "";

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
	public int anInt3672 = 0;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	public int anInt3674 = -1;

	@OriginalMember(owner = "client!hr", name = "D", descriptor = "I")
	public int anInt3688 = 16777215;

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "I")
	public int anInt3686 = 0;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!es;Z)V")
	public void method3352(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method8865();
			if (local11 == 0) {
				return;
			}
			this.method3353(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!es;B)V")
	private void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt3674 = arg1.method8859();
		} else if (arg0 == 2) {
			this.anInt3688 = arg1.method8827();
		} else if (arg0 == 3) {
			this.anInt3680 = arg1.method8859();
		} else if (arg0 == 4) {
			this.anInt3670 = arg1.method8859();
		} else if (arg0 == 5) {
			this.anInt3677 = arg1.method8859();
		} else if (arg0 == 6) {
			this.anInt3684 = arg1.method8859();
		} else if (arg0 == 7) {
			this.anInt3686 = arg1.method8834();
		} else if (arg0 == 8) {
			this.aString33 = arg1.method8844();
		} else if (arg0 == 9) {
			this.anInt3683 = arg1.method8859();
		} else if (arg0 == 10) {
			this.anInt3675 = arg1.method8834();
		} else if (arg0 == 11) {
			this.anInt3685 = 0;
		} else if (arg0 == 12) {
			this.anInt3665 = arg1.method8865();
		} else if (arg0 == 13) {
			this.anInt3672 = arg1.method8834();
		} else if (arg0 == 14) {
			this.anInt3685 = arg1.method8859();
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ha;B)V")
	private void method3358(@OriginalArg(0) Class33 arg0) {
		@Pc(15) Class34 local15 = this.aClass361_2.aClass34_119;
		@Pc(41) Class51 local41;
		if (this.anInt3680 >= 0 && this.aClass361_2.aClass352_66.method7653((long) this.anInt3680) == null && local15.method1235(this.anInt3680)) {
			local41 = Static682.method1664(local15, this.anInt3680);
			this.aClass361_2.aClass352_66.method7655((long) this.anInt3680, arg0.method8147(local41, true));
		}
		if (this.anInt3677 >= 0 && this.aClass361_2.aClass352_66.method7653((long) this.anInt3677) == null && local15.method1235(this.anInt3677)) {
			local41 = Static682.method1664(local15, this.anInt3677);
			this.aClass361_2.aClass352_66.method7655((long) this.anInt3677, arg0.method8147(local41, true));
		}
		if (this.anInt3670 >= 0 && this.aClass361_2.aClass352_66.method7653((long) this.anInt3670) == null && local15.method1235(this.anInt3670)) {
			local41 = Static682.method1664(local15, this.anInt3670);
			this.aClass361_2.aClass352_66.method7655((long) this.anInt3670, arg0.method8147(local41, true));
		}
		if (this.anInt3684 >= 0 && this.aClass361_2.aClass352_66.method7653((long) this.anInt3684) == null && local15.method1235(this.anInt3684)) {
			local41 = Static682.method1664(local15, this.anInt3684);
			this.aClass361_2.aClass352_66.method7655((long) this.anInt3684, arg0.method8147(local41, true));
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ha;I)Lclient!tf;")
	public Class17 method3360(@OriginalArg(0) Class33 arg0) {
		if (this.anInt3677 < 0) {
			return null;
		}
		@Pc(18) Class17 local18 = (Class17) this.aClass361_2.aClass352_66.method7653((long) this.anInt3677);
		if (local18 == null) {
			this.method3358(arg0);
			local18 = (Class17) this.aClass361_2.aClass352_66.method7653((long) this.anInt3677);
		}
		return local18;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method3362(@OriginalArg(0) int arg0) {
		@Pc(14) String local14 = this.aString33;
		while (true) {
			@Pc(18) int local18 = local14.indexOf("%1");
			if (local18 < 0) {
				return local14;
			}
			local14 = local14.substring(0, local18) + Static438.method6053(false, arg0) + local14.substring(local18 + 2);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILclient!ha;)Lclient!tf;")
	public Class17 method3363(@OriginalArg(1) Class33 arg0) {
		if (this.anInt3684 < 0) {
			return null;
		}
		@Pc(26) Class17 local26 = (Class17) this.aClass361_2.aClass352_66.method7653((long) this.anInt3684);
		if (local26 == null) {
			this.method3358(arg0);
			local26 = (Class17) this.aClass361_2.aClass352_66.method7653((long) this.anInt3684);
		}
		return local26;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLclient!ha;)Lclient!tf;")
	public Class17 method3364(@OriginalArg(1) Class33 arg0) {
		if (this.anInt3680 < 0) {
			return null;
		}
		@Pc(27) Class17 local27 = (Class17) this.aClass361_2.aClass352_66.method7653((long) this.anInt3680);
		if (local27 == null) {
			this.method3358(arg0);
			local27 = (Class17) this.aClass361_2.aClass352_66.method7653((long) this.anInt3680);
		}
		return local27;
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(Lclient!ha;I)Lclient!tf;")
	public Class17 method3365(@OriginalArg(0) Class33 arg0) {
		if (this.anInt3670 < 0) {
			return null;
		}
		@Pc(23) Class17 local23 = (Class17) this.aClass361_2.aClass352_66.method7653((long) this.anInt3670);
		if (local23 == null) {
			this.method3358(arg0);
			local23 = (Class17) this.aClass361_2.aClass352_66.method7653((long) this.anInt3670);
		}
		return local23;
	}
}
