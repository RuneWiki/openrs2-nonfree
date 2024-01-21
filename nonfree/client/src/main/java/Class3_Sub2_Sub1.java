import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class3_Sub2_Sub1 extends Class3_Sub2 {

	@OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
	private final int anInt500 = 32;

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "[Lclient!p;")
	private final Class51[] aClass51Array1 = new Class51[8];

	@OriginalMember(owner = "client!cc", name = "A", descriptor = "Lclient!p;")
	private final Class51 aClass51_2 = new Class51();

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
	private int anInt503 = 0;

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
	private int anInt501 = -1;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
	private int anInt502 = 0;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub1() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass51Array1[local24] = new Class51();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "([III)I")
	private int method337(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt502 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class51 local24;
		@Pc(29) Class3_Sub2 local29;
		@Pc(33) int local33;
		if (this.anInt502 <= 0) {
			this.anInt502 += Static17.anInt610 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass51Array1[local18];
				for (local29 = (Class3_Sub2) local24.method1316(); local29 != null; local29 = (Class3_Sub2) local24.method1310()) {
					local33 = Static117.method344(local29);
					if (local33 != local18) {
						this.aClass51Array1[local33].method1313(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass51Array1[local18];
			for (local29 = (Class3_Sub2) local24.method1316(); local29 != null; local29 = (Class3_Sub2) local24.method1310()) {
				local29.aBoolean100 = false;
				if (local29.aClass3_Sub4_3 != null) {
					local29.aClass3_Sub4_3.anInt1299 = 0;
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
					@Pc(137) Class51 local137 = this.aClass51Array1[local102];
					for (@Pc(142) Class3_Sub2 local142 = (Class3_Sub2) local137.method1316(); local142 != null; local142 = (Class3_Sub2) local137.method1310()) {
						if (!local142.aBoolean100) {
							@Pc(149) Class3_Sub4 local149 = local142.aClass3_Sub4_3;
							if (local149 == null || local149.anInt1299 <= local107) {
								if (local91 < this.anInt500) {
									@Pc(172) int local172 = local142.method1378(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt1299 += local172;
									}
								} else {
									local142.method1380(arg2);
								}
								local142.aBoolean100 = true;
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

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1380(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt501 < 0) {
				this.method339(arg0);
				return;
			}
			if (this.anInt503 + arg0 < this.anInt501) {
				this.anInt503 += arg0;
				this.method339(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt501 - this.anInt503;
			this.method339(local29);
			arg0 -= local29;
			this.anInt503 += local29;
			this.method338();
			@Pc(50) Class3_Sub3 local50 = (Class3_Sub3) this.aClass51_2.method1316();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method471(this);
				if (local58 < 0) {
					local50.anInt754 = 0;
					this.method342(local50);
				} else {
					local50.anInt754 = local58;
					this.method341(local50.aClass3_102, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
	private void method338() {
		if (this.anInt503 <= 0) {
			return;
		}
		for (@Pc(8) Class3_Sub3 local8 = (Class3_Sub3) this.aClass51_2.method1316(); local8 != null; local8 = (Class3_Sub3) this.aClass51_2.method1310()) {
			local8.anInt754 -= this.anInt503;
		}
		this.anInt501 -= this.anInt503;
		this.anInt503 = 0;
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
	private void method339(@OriginalArg(0) int arg0) {
		this.anInt502 -= arg0;
		if (this.anInt502 < 0) {
			this.anInt502 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class51 local19 = this.aClass51Array1[local13];
			for (@Pc(24) Class3_Sub2 local24 = (Class3_Sub2) local19.method1316(); local24 != null; local24 = (Class3_Sub2) local19.method1310()) {
				local24.method1380(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ac;)V")
	public synchronized void method340(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(5) Class51 local5 = this.aClass51Array1[Static117.method344(arg0)];
		local5.method1313(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!la;Lclient!eb;)V")
	private void method341(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class3_Sub3 arg1) {
		while (arg0 != this.aClass51_2.aClass3_67 && ((Class3_Sub3) arg0).anInt754 <= arg1.anInt754) {
			arg0 = arg0.aClass3_102;
		}
		this.aClass51_2.method1306(arg0, arg1);
		this.anInt501 = ((Class3_Sub3) this.aClass51_2.aClass3_67.aClass3_102).anInt754;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!eb;)V")
	private void method342(@OriginalArg(0) Class3_Sub3 arg0) {
		arg0.method1966();
		arg0.method472();
		@Pc(9) Class3 local9 = this.aClass51_2.aClass3_67.aClass3_102;
		if (local9 == this.aClass51_2.aClass3_67) {
			this.anInt501 = -1;
		} else {
			this.anInt501 = ((Class3_Sub3) local9).anInt754;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1378(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt501 < 0) {
				return this.method337(arg0, arg1, arg2);
			}
			if (this.anInt503 + arg2 < this.anInt501) {
				this.anInt503 += arg2;
				return this.method337(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt501 - this.anInt503;
			local39 = this.method337(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt503 += local33;
			this.method338();
			@Pc(61) Class3_Sub3 local61 = (Class3_Sub3) this.aClass51_2.method1316();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method471(this);
				if (local69 < 0) {
					local61.anInt754 = 0;
					this.method342(local61);
				} else {
					local61.anInt754 = local69;
					this.method341(local61.aClass3_102, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!ac;)V")
	public synchronized void method343(@OriginalArg(0) Class3_Sub2 arg0) {
		arg0.method1966();
	}
}
