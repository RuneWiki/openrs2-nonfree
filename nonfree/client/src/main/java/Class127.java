import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ge")
public final class Class127 {

	@OriginalMember(owner = "client!ge", name = "t", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
	private int anInt3359;

	@OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
	private int anInt3361;

	@OriginalMember(owner = "client!ge", name = "s", descriptor = "Ljava/lang/Object;")
	private Object anObject6;

	@OriginalMember(owner = "client!ge", name = "m", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "Lclient!qr;")
	private Class306 aClass306_14;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "Ljava/lang/String;")
	private String aString30 = "null";

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V")
	private void method3095() {
		@Pc(33) Class5_Sub37 local33;
		if (this.anObject6 instanceof Class306) {
			@Pc(9) Class306 local9 = (Class306) this.anObject6;
			this.aClass306_14 = new Class306(local9.method6937());
			for (@Pc(22) Class5_Sub46 local22 = (Class5_Sub46) local9.method6941(); local22 != null; local22 = (Class5_Sub46) local9.method6940()) {
				local33 = new Class5_Sub37(local22.aString87, (int) local22.aLong312);
				this.aClass306_14.method6944(local33, Static230.method3630(local22.aString87), -12002);
			}
			return;
		}
		@Pc(57) String[] local57 = (String[]) this.anObject6;
		this.aClass306_14 = new Class306(Static146.method2737(local57.length));
		for (@Pc(68) int local68 = 0; local68 < local57.length; local68++) {
			if (local57[local68] != null) {
				local33 = new Class5_Sub37(local57[local68], local68);
				this.aClass306_14.method6944(local33, Static230.method3630(local57[local68]), -12002);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method3098(@OriginalArg(0) String arg0) {
		if (this.anObject6 == null) {
			return false;
		}
		if (this.aClass306_14 == null) {
			this.method3095();
		}
		for (@Pc(28) Class5_Sub37 local28 = (Class5_Sub37) this.aClass306_14.method6943(Static230.method3630(arg0)); local28 != null; local28 = (Class5_Sub37) this.aClass306_14.method6945()) {
			if (local28.aString76.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	private void method3099() {
		@Pc(44) Class5_Sub43 local44;
		if (this.anObject6 instanceof Class306) {
			@Pc(68) Class306 local68 = (Class306) this.anObject6;
			this.aClass306_14 = new Class306(local68.method6937());
			for (@Pc(83) Class5_Sub43 local83 = (Class5_Sub43) local68.method6941(); local83 != null; local83 = (Class5_Sub43) local68.method6940()) {
				local44 = new Class5_Sub43((int) local83.aLong312);
				this.aClass306_14.method6944(local44, (long) local83.anInt6989, -12002);
			}
			return;
		}
		@Pc(20) Integer[] local20 = (Integer[]) this.anObject6;
		this.aClass306_14 = new Class306(Static146.method2737(local20.length));
		for (@Pc(31) int local31 = 0; local31 < local20.length; local31++) {
			if (local20[local31] != null) {
				local44 = new Class5_Sub43(local31);
				this.aClass306_14.method6944(local44, (long) local20[local31], -12002);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IB)I")
	public int method3101(@OriginalArg(0) int arg0) {
		if (this.anObject6 == null) {
			return this.anInt3359;
		} else if (this.anObject6 instanceof Class306) {
			@Pc(64) Class5_Sub43 local64 = (Class5_Sub43) ((Class306) this.anObject6).method6943((long) arg0);
			return local64 == null ? this.anInt3359 : local64.anInt6989;
		} else {
			@Pc(26) Integer[] local26 = (Integer[]) this.anObject6;
			if (arg0 >= 0 && arg0 < local26.length) {
				@Pc(46) Integer local46 = local26[arg0];
				return local46 == null ? this.anInt3359 : local46;
			} else {
				return this.anInt3359;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method3102(@OriginalArg(0) int arg0) {
		if (this.anObject6 == null) {
			return this.aString30;
		} else if (this.anObject6 instanceof Class306) {
			@Pc(63) Class5_Sub46 local63 = (Class5_Sub46) ((Class306) this.anObject6).method6943((long) arg0);
			return local63 == null ? this.aString30 : local63.aString87;
		} else {
			@Pc(26) String[] local26 = (String[]) this.anObject6;
			if (arg0 >= 0 && local26.length > arg0) {
				@Pc(46) String local46 = local26[arg0];
				return local46 == null ? this.aString30 : local46;
			} else {
				return this.aString30;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(II)Z")
	public boolean method3103(@OriginalArg(1) int arg0) {
		if (this.anObject6 == null) {
			return false;
		}
		if (this.aClass306_14 == null) {
			this.method3099();
		}
		@Pc(34) Class5_Sub43 local34 = (Class5_Sub43) this.aClass306_14.method6943((long) arg0);
		return local34 != null;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLclient!wq;)V")
	public void method3104(@OriginalArg(1) Class5_Sub36 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method7291();
			if (local5 == 0) {
				return;
			}
			this.method3106(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(B)I")
	public int method3105() {
		return this.anInt3361;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!wq;)V")
	private void method3106(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub36 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static92.method8227(arg1.method7318());
		} else if (arg0 == 2) {
			this.aChar3 = Static92.method8227(arg1.method7318());
		} else if (arg0 == 3) {
			this.aString30 = arg1.method7281();
		} else if (arg0 == 4) {
			this.anInt3359 = arg1.method7268();
		} else {
			@Pc(84) int local84;
			if (arg0 == 5 || arg0 == 6) {
				this.anInt3361 = arg1.method7333();
				@Pc(76) Class306 local76 = new Class306(Static146.method2737(this.anInt3361));
				for (@Pc(78) int local78 = 0; local78 < this.anInt3361; local78++) {
					local84 = arg1.method7268();
					@Pc(94) Class5 local94;
					if (arg0 == 5) {
						local94 = new Class5_Sub46(arg1.method7281());
					} else {
						local94 = new Class5_Sub43(arg1.method7268());
					}
					local76.method6944(local94, (long) local84, -12002);
				}
				this.anObject6 = local76;
			} else {
				@Pc(137) int local137;
				@Pc(153) int local153;
				if (arg0 == 7) {
					local137 = arg1.method7333();
					this.anInt3361 = arg1.method7333();
					@Pc(186) String[] local186 = new String[local137];
					for (local84 = 0; local84 < this.anInt3361; local84++) {
						local153 = arg1.method7333();
						local186[local153] = arg1.method7281();
					}
					this.anObject6 = local186;
				} else if (arg0 == 8) {
					local137 = arg1.method7333();
					this.anInt3361 = arg1.method7333();
					@Pc(145) Integer[] local145 = new Integer[local137];
					for (local84 = 0; local84 < this.anInt3361; local84++) {
						local153 = arg1.method7333();
						local145[local153] = Integer.valueOf(arg1.method7268());
					}
					this.anObject6 = local145;
				}
			}
		}
	}
}
