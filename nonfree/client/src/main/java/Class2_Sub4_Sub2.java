import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class2_Sub4_Sub2 extends Class2_Sub4 {

	@OriginalMember(owner = "client!r", name = "y", descriptor = "[Lclient!ie;")
	private final Class34[] aClass34Array1 = new Class34[8];

	@OriginalMember(owner = "client!r", name = "z", descriptor = "I")
	private final int anInt2339 = 16;

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Lclient!ie;")
	private final Class34 aClass34_43 = new Class34();

	@OriginalMember(owner = "client!r", name = "E", descriptor = "I")
	private int anInt2341 = 0;

	@OriginalMember(owner = "client!r", name = "C", descriptor = "I")
	private int anInt2340 = 0;

	@OriginalMember(owner = "client!r", name = "F", descriptor = "I")
	private int anInt2342 = -1;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub2() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass34Array1[local24] = new Class34();
		}
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1656(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt2342 < 0) {
				return this.method1665(arg0, arg1, arg2);
			}
			if (this.anInt2340 + arg2 < this.anInt2342) {
				this.anInt2340 += arg2;
				return this.method1665(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt2342 - this.anInt2340;
			local39 = this.method1665(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2340 += local33;
			this.method1660();
			@Pc(61) Class2_Sub6 local61 = (Class2_Sub6) this.aClass34_43.method872();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method802(this);
				if (local69 < 0) {
					local61.anInt1130 = 0;
					this.method1664(local61);
				} else {
					local61.anInt1130 = local69;
					this.method1661(local61.aClass2_95, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}

	@OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
	private void method1658(@OriginalArg(0) int arg0) {
		this.anInt2341 -= arg0;
		if (this.anInt2341 < 0) {
			this.anInt2341 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class34 local19 = this.aClass34Array1[local13];
			for (@Pc(24) Class2_Sub4 local24 = (Class2_Sub4) local19.method872(); local24 != null; local24 = (Class2_Sub4) local19.method879()) {
				local24.method1655(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1655(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2342 < 0) {
				this.method1658(arg0);
				return;
			}
			if (this.anInt2340 + arg0 < this.anInt2342) {
				this.anInt2340 += arg0;
				this.method1658(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2342 - this.anInt2340;
			this.method1658(local29);
			arg0 -= local29;
			this.anInt2340 += local29;
			this.method1660();
			@Pc(50) Class2_Sub6 local50 = (Class2_Sub6) this.aClass34_43.method872();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method802(this);
				if (local58 < 0) {
					local50.anInt1130 = 0;
					this.method1664(local50);
				} else {
					local50.anInt1130 = local58;
					this.method1661(local50.aClass2_95, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ub;)V")
	public synchronized void method1659(@OriginalArg(0) Class2_Sub4 arg0) {
		@Pc(5) Class34 local5 = this.aClass34Array1[Static115.method1663(arg0)];
		local5.method878(arg0);
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "()V")
	private void method1660() {
		if (this.anInt2340 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub6 local8 = (Class2_Sub6) this.aClass34_43.method872(); local8 != null; local8 = (Class2_Sub6) this.aClass34_43.method879()) {
			local8.anInt1130 -= this.anInt2340;
		}
		this.anInt2342 -= this.anInt2340;
		this.anInt2340 = 0;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!cd;Lclient!ha;)V")
	private void method1661(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub6 arg1) {
		while (arg0 != this.aClass34_43.aClass2_37 && ((Class2_Sub6) arg0).anInt1130 <= arg1.anInt1130) {
			arg0 = arg0.aClass2_95;
		}
		this.aClass34_43.method875(arg0, arg1);
		this.anInt2342 = ((Class2_Sub6) this.aClass34_43.aClass2_37.aClass2_95).anInt1130;
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(Lclient!ub;)V")
	public synchronized void method1662(@OriginalArg(0) Class2_Sub4 arg0) {
		arg0.method2045();
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!ha;)V")
	private void method1664(@OriginalArg(0) Class2_Sub6 arg0) {
		arg0.method2045();
		arg0.method801();
		@Pc(9) Class2 local9 = this.aClass34_43.aClass2_37.aClass2_95;
		if (local9 == this.aClass34_43.aClass2_37) {
			this.anInt2342 = -1;
		} else {
			this.anInt2342 = ((Class2_Sub6) local9).anInt1130;
		}
	}

	@OriginalMember(owner = "client!r", name = "b", descriptor = "([III)I")
	private int method1665(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2341 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class34 local24;
		@Pc(29) Class2_Sub4 local29;
		@Pc(33) int local33;
		if (this.anInt2341 <= 0) {
			this.anInt2341 += Static57.anInt1657 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass34Array1[local18];
				for (local29 = (Class2_Sub4) local24.method872(); local29 != null; local29 = (Class2_Sub4) local24.method879()) {
					local33 = Static115.method1663(local29);
					if (local33 != local18) {
						this.aClass34Array1[local33].method878(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass34Array1[local18];
			for (local29 = (Class2_Sub4) local24.method872(); local29 != null; local29 = (Class2_Sub4) local24.method879()) {
				local29.aBoolean105 = false;
				if (local29.aClass2_Sub8_3 != null) {
					local29.aClass2_Sub8_3.anInt2286 = 0;
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
					@Pc(137) Class34 local137 = this.aClass34Array1[local102];
					for (@Pc(142) Class2_Sub4 local142 = (Class2_Sub4) local137.method872(); local142 != null; local142 = (Class2_Sub4) local137.method879()) {
						if (!local142.aBoolean105) {
							@Pc(149) Class2_Sub8 local149 = local142.aClass2_Sub8_3;
							if (local149 == null || local149.anInt2286 <= local107) {
								if (local91 < this.anInt2339) {
									@Pc(172) int local172 = local142.method1656(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt2286 += local172;
									}
								} else {
									local142.method1655(arg2);
								}
								local142.aBoolean105 = true;
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
}
