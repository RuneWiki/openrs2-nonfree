import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
	private final int anInt433 = 16;

	@OriginalMember(owner = "client!b", name = "fb", descriptor = "[Lclient!pb;")
	private final Class46[] aClass46Array1 = new Class46[8];

	@OriginalMember(owner = "client!b", name = "gb", descriptor = "Lclient!pb;")
	private final Class46 aClass46_2 = new Class46();

	@OriginalMember(owner = "client!b", name = "hb", descriptor = "I")
	private int anInt434 = 0;

	@OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
	private int anInt435 = -1;

	@OriginalMember(owner = "client!b", name = "jb", descriptor = "I")
	private int anInt436 = 0;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub1() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass46Array1[local24] = new Class46();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!oc;)V")
	public synchronized void method232(@OriginalArg(0) Class2_Sub2 arg0) {
		@Pc(5) Class46 local5 = this.aClass46Array1[Static114.method235(arg0)];
		local5.method1438(arg0);
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method1197(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt435 < 0) {
				this.method237(arg0);
				return;
			}
			if (this.anInt436 + arg0 < this.anInt435) {
				this.anInt436 += arg0;
				this.method237(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt435 - this.anInt436;
			this.method237(local29);
			arg0 -= local29;
			this.anInt436 += local29;
			this.method238();
			@Pc(50) Class2_Sub9 local50 = (Class2_Sub9) this.aClass46_2.method1435();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method1357(this);
				if (local58 < 0) {
					local50.anInt1959 = 0;
					this.method236(local50);
				} else {
					local50.anInt1959 = local58;
					this.method233(local50.aClass2_97, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!nd;Lclient!ne;)V")
	private void method233(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub9 arg1) {
		while (arg0 != this.aClass46_2.aClass2_73 && ((Class2_Sub9) arg0).anInt1959 <= arg1.anInt1959) {
			arg0 = arg0.aClass2_97;
		}
		this.aClass46_2.method1444(arg0, arg1);
		this.anInt435 = ((Class2_Sub9) this.aClass46_2.aClass2_73.aClass2_97).anInt1959;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "([III)I")
	private int method234(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt434 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class46 local24;
		@Pc(29) Class2_Sub2 local29;
		@Pc(33) int local33;
		if (this.anInt434 <= 0) {
			this.anInt434 += Static5.anInt382 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass46Array1[local18];
				for (local29 = (Class2_Sub2) local24.method1435(); local29 != null; local29 = (Class2_Sub2) local24.method1442()) {
					local33 = Static114.method235(local29);
					if (local33 != local18) {
						this.aClass46Array1[local33].method1438(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass46Array1[local18];
			for (local29 = (Class2_Sub2) local24.method1435(); local29 != null; local29 = (Class2_Sub2) local24.method1442()) {
				local29.aBoolean95 = false;
				if (local29.aClass2_Sub12_3 != null) {
					local29.aClass2_Sub12_3.anInt2816 = 0;
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
					@Pc(137) Class46 local137 = this.aClass46Array1[local102];
					for (@Pc(142) Class2_Sub2 local142 = (Class2_Sub2) local137.method1435(); local142 != null; local142 = (Class2_Sub2) local137.method1442()) {
						if (!local142.aBoolean95) {
							@Pc(149) Class2_Sub12 local149 = local142.aClass2_Sub12_3;
							if (local149 == null || local149.anInt2816 <= local107) {
								if (local91 < this.anInt433) {
									@Pc(172) int local172 = local142.method1198(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt2816 += local172;
									}
								} else {
									local142.method1197(arg2);
								}
								local142.aBoolean95 = true;
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

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ne;)V")
	private void method236(@OriginalArg(0) Class2_Sub9 arg0) {
		arg0.method1820();
		arg0.method1356();
		@Pc(9) Class2 local9 = this.aClass46_2.aClass2_73.aClass2_97;
		if (local9 == this.aClass46_2.aClass2_73) {
			this.anInt435 = -1;
		} else {
			this.anInt435 = ((Class2_Sub9) local9).anInt1959;
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V")
	private void method237(@OriginalArg(0) int arg0) {
		this.anInt434 -= arg0;
		if (this.anInt434 < 0) {
			this.anInt434 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class46 local19 = this.aClass46Array1[local13];
			for (@Pc(24) Class2_Sub2 local24 = (Class2_Sub2) local19.method1435(); local24 != null; local24 = (Class2_Sub2) local19.method1442()) {
				local24.method1197(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "()V")
	private void method238() {
		if (this.anInt436 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub9 local8 = (Class2_Sub9) this.aClass46_2.method1435(); local8 != null; local8 = (Class2_Sub9) this.aClass46_2.method1442()) {
			local8.anInt1959 -= this.anInt436;
		}
		this.anInt435 -= this.anInt436;
		this.anInt436 = 0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1198(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt435 < 0) {
				return this.method234(arg0, arg1, arg2);
			}
			if (this.anInt436 + arg2 < this.anInt435) {
				this.anInt436 += arg2;
				return this.method234(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt435 - this.anInt436;
			local39 = this.method234(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt436 += local33;
			this.method238();
			@Pc(61) Class2_Sub9 local61 = (Class2_Sub9) this.aClass46_2.method1435();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method1357(this);
				if (local69 < 0) {
					local61.anInt1959 = 0;
					this.method236(local61);
				} else {
					local61.anInt1959 = local69;
					this.method233(local61.aClass2_97, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(Lclient!oc;)V")
	public synchronized void method239(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.method1820();
	}
}
