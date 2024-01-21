import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class2_Sub10_Sub2 extends Class2_Sub10 {

	@OriginalMember(owner = "client!ta", name = "A", descriptor = "[Lclient!s;")
	private final Class52[] aClass52Array1 = new Class52[8];

	@OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
	private final int anInt2727 = 16;

	@OriginalMember(owner = "client!ta", name = "C", descriptor = "Lclient!s;")
	private final Class52 aClass52_10 = new Class52();

	@OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
	private int anInt2728 = 0;

	@OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
	private int anInt2730 = 0;

	@OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
	private int anInt2729 = -1;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class2_Sub10_Sub2() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass52Array1[local24] = new Class52();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ad;)V")
	private void method1670(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.method1794();
		arg0.method110();
		@Pc(9) Class2 local9 = this.aClass52_10.aClass2_85.aClass2_96;
		if (local9 == this.aClass52_10.aClass2_85) {
			this.anInt2729 = -1;
		} else {
			this.anInt2729 = ((Class2_Sub2) local9).anInt236;
		}
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "()V")
	private void method1671() {
		if (this.anInt2730 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub2 local8 = (Class2_Sub2) this.aClass52_10.method1587(); local8 != null; local8 = (Class2_Sub2) this.aClass52_10.method1588()) {
			local8.anInt236 -= this.anInt2730;
		}
		this.anInt2729 -= this.anInt2730;
		this.anInt2730 = 0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1668(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt2729 < 0) {
				return this.method1672(arg0, arg1, arg2);
			}
			if (this.anInt2730 + arg2 < this.anInt2729) {
				this.anInt2730 += arg2;
				return this.method1672(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt2729 - this.anInt2730;
			local39 = this.method1672(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt2730 += local33;
			this.method1671();
			@Pc(61) Class2_Sub2 local61 = (Class2_Sub2) this.aClass52_10.method1587();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method111(this);
				if (local69 < 0) {
					local61.anInt236 = 0;
					this.method1670(local61);
				} else {
					local61.anInt236 = local69;
					this.method1675(local61.aClass2_96, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "([III)I")
	private int method1672(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2728 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class52 local24;
		@Pc(29) Class2_Sub10 local29;
		@Pc(33) int local33;
		if (this.anInt2728 <= 0) {
			this.anInt2728 += Static42.anInt1353 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass52Array1[local18];
				for (local29 = (Class2_Sub10) local24.method1587(); local29 != null; local29 = (Class2_Sub10) local24.method1588()) {
					local33 = Static115.method1676(local29);
					if (local33 != local18) {
						this.aClass52Array1[local33].method1584(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass52Array1[local18];
			for (local29 = (Class2_Sub10) local24.method1587(); local29 != null; local29 = (Class2_Sub10) local24.method1588()) {
				local29.aBoolean149 = false;
				if (local29.aClass2_Sub4_3 != null) {
					local29.aClass2_Sub4_3.anInt2060 = 0;
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
					@Pc(137) Class52 local137 = this.aClass52Array1[local102];
					for (@Pc(142) Class2_Sub10 local142 = (Class2_Sub10) local137.method1587(); local142 != null; local142 = (Class2_Sub10) local137.method1588()) {
						if (!local142.aBoolean149) {
							@Pc(149) Class2_Sub4 local149 = local142.aClass2_Sub4_3;
							if (local149 == null || local149.anInt2060 <= local107) {
								if (local91 < this.anInt2727) {
									@Pc(172) int local172 = local142.method1668(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt2060 += local172;
									}
								} else {
									local142.method1669(arg2);
								}
								local142.aBoolean149 = true;
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

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	private void method1673(@OriginalArg(0) int arg0) {
		this.anInt2728 -= arg0;
		if (this.anInt2728 < 0) {
			this.anInt2728 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class52 local19 = this.aClass52Array1[local13];
			for (@Pc(24) Class2_Sub10 local24 = (Class2_Sub10) local19.method1587(); local24 != null; local24 = (Class2_Sub10) local19.method1588()) {
				local24.method1669(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ga;)V")
	public synchronized void method1674(@OriginalArg(0) Class2_Sub10 arg0) {
		arg0.method1794();
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1669(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt2729 < 0) {
				this.method1673(arg0);
				return;
			}
			if (this.anInt2730 + arg0 < this.anInt2729) {
				this.anInt2730 += arg0;
				this.method1673(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt2729 - this.anInt2730;
			this.method1673(local29);
			arg0 -= local29;
			this.anInt2730 += local29;
			this.method1671();
			@Pc(50) Class2_Sub2 local50 = (Class2_Sub2) this.aClass52_10.method1587();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method111(this);
				if (local58 < 0) {
					local50.anInt236 = 0;
					this.method1670(local50);
				} else {
					local50.anInt236 = local58;
					this.method1675(local50.aClass2_96, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!q;Lclient!ad;)V")
	private void method1675(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub2 arg1) {
		while (arg0 != this.aClass52_10.aClass2_85 && ((Class2_Sub2) arg0).anInt236 <= arg1.anInt236) {
			arg0 = arg0.aClass2_96;
		}
		this.aClass52_10.method1592(arg0, arg1);
		this.anInt2729 = ((Class2_Sub2) this.aClass52_10.aClass2_85.aClass2_96).anInt236;
	}

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(Lclient!ga;)V")
	public synchronized void method1677(@OriginalArg(0) Class2_Sub10 arg0) {
		@Pc(5) Class52 local5 = this.aClass52Array1[Static115.method1676(arg0)];
		local5.method1584(arg0);
	}
}
