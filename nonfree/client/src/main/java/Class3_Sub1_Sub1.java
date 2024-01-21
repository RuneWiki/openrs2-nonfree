import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
	private final int anInt72 = 16;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "[Lclient!he;")
	private final Class28[] aClass28Array1 = new Class28[8];

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "Lclient!he;")
	private final Class28 aClass28_2 = new Class28();

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
	private int anInt73 = 0;

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
	private int anInt74 = 0;

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
	private int anInt75 = -1;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub1() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass28Array1[local24] = new Class28();
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!j;)V")
	public synchronized void method52(@OriginalArg(0) Class3_Sub1 arg0) {
		@Pc(5) Class28 local5 = this.aClass28Array1[Static110.method58(arg0)];
		local5.method881(arg0);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!w;Lclient!k;)V")
	private void method53(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		while (arg0 != this.aClass28_2.aClass3_39 && ((Class3_Sub8) arg0).anInt1396 <= arg1.anInt1396) {
			arg0 = arg0.aClass3_95;
		}
		this.aClass28_2.method885(arg0, arg1);
		this.anInt75 = ((Class3_Sub8) this.aClass28_2.aClass3_39.aClass3_95).anInt1396;
	}

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method145(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt75 < 0) {
				this.method56(arg0);
				return;
			}
			if (this.anInt73 + arg0 < this.anInt75) {
				this.anInt73 += arg0;
				this.method56(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt75 - this.anInt73;
			this.method56(local29);
			arg0 -= local29;
			this.anInt73 += local29;
			this.method54();
			@Pc(50) Class3_Sub8 local50 = (Class3_Sub8) this.aClass28_2.method884();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1045(this);
				if (local58 < 0) {
					local50.anInt1396 = 0;
					this.method55(local50);
				} else {
					local50.anInt1396 = local58;
					this.method53(local50.aClass3_95, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "()V")
	private void method54() {
		if (this.anInt73 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub8 local8 = (Class3_Sub8) this.aClass28_2.method884(); local8 != null; local8 = (Class3_Sub8) this.aClass28_2.method875()) {
			local8.anInt1396 -= this.anInt73;
		}
		this.anInt75 -= this.anInt73;
		this.anInt73 = 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!k;)V")
	private void method55(@OriginalArg(0) Class3_Sub8 arg0) {
		arg0.method1883();
		arg0.method1044();
		@Pc(9) Class3 local9 = this.aClass28_2.aClass3_39.aClass3_95;
		if (local9 == this.aClass28_2.aClass3_39) {
			this.anInt75 = -1;
		} else {
			this.anInt75 = ((Class3_Sub8) local9).anInt1396;
		}
	}

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
	private void method56(@OriginalArg(0) int arg0) {
		this.anInt74 -= arg0;
		if (this.anInt74 < 0) {
			this.anInt74 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class28 local19 = this.aClass28Array1[local13];
			for (@Pc(24) Class3_Sub1 local24 = (Class3_Sub1) local19.method884(); local24 != null; local24 = (Class3_Sub1) local19.method875()) {
				local24.method145(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "(Lclient!j;)V")
	public synchronized void method57(@OriginalArg(0) Class3_Sub1 arg0) {
		arg0.method1883();
	}

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "([III)I")
	private int method59(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt74 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class28 local24;
		@Pc(29) Class3_Sub1 local29;
		@Pc(33) int local33;
		if (this.anInt74 <= 0) {
			this.anInt74 += Static80.anInt2188 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass28Array1[local18];
				for (local29 = (Class3_Sub1) local24.method884(); local29 != null; local29 = (Class3_Sub1) local24.method875()) {
					local33 = Static110.method58(local29);
					if (local33 != local18) {
						this.aClass28Array1[local33].method881(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass28Array1[local18];
			for (local29 = (Class3_Sub1) local24.method884(); local29 != null; local29 = (Class3_Sub1) local24.method875()) {
				local29.aBoolean10 = false;
				if (local29.aClass3_Sub7_3 != null) {
					local29.aClass3_Sub7_3.anInt2689 = 0;
				}
			}
		}
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 255;
		local33 = 7;
		while (local93 != 0) {
			@Pc(102) int local102;
			@Pc(107) int local107;
			if (local33 < 0) {
				local102 = local33 & 0x3;
				local107 = -(local33 >> 2);
			} else {
				local102 = local33;
				local107 = 0;
			}
			for (@Pc(118) int local118 = local93 >>> local102 & 0x11111111; local118 != 0; local118 >>>= 0x4) {
				if ((local118 & 0x1) != 0) {
					local93 &= ~(0x1 << local102);
					@Pc(137) Class28 local137 = this.aClass28Array1[local102];
					for (@Pc(142) Class3_Sub1 local142 = (Class3_Sub1) local137.method884(); local142 != null; local142 = (Class3_Sub1) local137.method875()) {
						if (!local142.aBoolean10) {
							@Pc(149) Class3_Sub7 local149 = local142.aClass3_Sub7_3;
							if (local149 == null || local149.anInt2689 <= local107) {
								if (local91 < this.anInt72) {
									@Pc(172) int local172 = local142.method143(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt2689 += local172;
									}
								} else {
									local142.method145(arg2);
								}
								local142.aBoolean10 = true;
							} else {
								local93 |= 0x1 << local102;
							}
						}
					}
				}
				local102 += 4;
				local107++;
			}
			local33--;
		}
		return local91;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method143(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt75 < 0) {
				return this.method59(arg0, arg1, arg2);
			}
			if (this.anInt73 + arg2 < this.anInt75) {
				this.anInt73 += arg2;
				return this.method59(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt75 - this.anInt73;
			local39 = this.method59(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt73 += local33;
			this.method54();
			@Pc(61) Class3_Sub8 local61 = (Class3_Sub8) this.aClass28_2.method884();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method1045(this);
				if (local69 < 0) {
					local61.anInt1396 = 0;
					this.method55(local61);
				} else {
					local61.anInt1396 = local69;
					this.method53(local61.aClass3_95, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}
}
