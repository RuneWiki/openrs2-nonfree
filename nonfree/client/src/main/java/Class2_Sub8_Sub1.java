import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class2_Sub8_Sub1 extends Class2_Sub8 {

	@OriginalMember(owner = "client!f", name = "G", descriptor = "I")
	private final int anInt1093 = 16;

	@OriginalMember(owner = "client!f", name = "H", descriptor = "[Lclient!nb;")
	private final Class36[] aClass36Array1 = new Class36[8];

	@OriginalMember(owner = "client!f", name = "E", descriptor = "Lclient!nb;")
	private final Class36 aClass36_2 = new Class36();

	@OriginalMember(owner = "client!f", name = "I", descriptor = "I")
	private int anInt1094 = 0;

	@OriginalMember(owner = "client!f", name = "K", descriptor = "I")
	private int anInt1096 = -1;

	@OriginalMember(owner = "client!f", name = "J", descriptor = "I")
	private int anInt1095 = 0;

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class2_Sub8_Sub1() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass36Array1[local24] = new Class36();
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ad;)V")
	private void method741(@OriginalArg(0) Class2_Sub2 arg0) {
		arg0.method1695();
		arg0.method111();
		@Pc(9) Class2 local9 = this.aClass36_2.aClass2_77.aClass2_93;
		if (local9 == this.aClass36_2.aClass2_77) {
			this.anInt1096 = -1;
		} else {
			this.anInt1096 = ((Class2_Sub2) local9).anInt154;
		}
	}

	@OriginalMember(owner = "client!f", name = "e", descriptor = "(I)V")
	private void method742(@OriginalArg(0) int arg0) {
		this.anInt1095 -= arg0;
		if (this.anInt1095 < 0) {
			this.anInt1095 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class36 local19 = this.aClass36Array1[local13];
			for (@Pc(24) Class2_Sub8 local24 = (Class2_Sub8) local19.method1365(); local24 != null; local24 = (Class2_Sub8) local19.method1361()) {
				local24.method1671(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method1670(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt1096 < 0) {
				return this.method747(arg0, arg1, arg2);
			}
			if (this.anInt1094 + arg2 < this.anInt1096) {
				this.anInt1094 += arg2;
				return this.method747(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt1096 - this.anInt1094;
			local39 = this.method747(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt1094 += local33;
			this.method743();
			@Pc(61) Class2_Sub2 local61 = (Class2_Sub2) this.aClass36_2.method1365();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method110(this);
				if (local69 < 0) {
					local61.anInt154 = 0;
					this.method741(local61);
				} else {
					local61.anInt154 = local69;
					this.method745(local61.aClass2_93, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()V")
	private void method743() {
		if (this.anInt1094 <= 0) {
			return;
		}
		for (@Pc(8) Class2_Sub2 local8 = (Class2_Sub2) this.aClass36_2.method1365(); local8 != null; local8 = (Class2_Sub2) this.aClass36_2.method1361()) {
			local8.anInt154 -= this.anInt1094;
		}
		this.anInt1096 -= this.anInt1094;
		this.anInt1094 = 0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ld;Lclient!ad;)V")
	private void method745(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class2_Sub2 arg1) {
		while (arg0 != this.aClass36_2.aClass2_77 && ((Class2_Sub2) arg0).anInt154 <= arg1.anInt154) {
			arg0 = arg0.aClass2_93;
		}
		this.aClass36_2.method1357(arg1, arg0);
		this.anInt1096 = ((Class2_Sub2) this.aClass36_2.aClass2_77.aClass2_93).anInt154;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(Lclient!je;)V")
	public synchronized void method746(@OriginalArg(0) Class2_Sub8 arg0) {
		@Pc(5) Class36 local5 = this.aClass36Array1[Static111.method744(arg0)];
		local5.method1363(arg0);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "([III)I")
	private int method747(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1095 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class36 local24;
		@Pc(29) Class2_Sub8 local29;
		@Pc(33) int local33;
		if (this.anInt1095 <= 0) {
			this.anInt1095 += Static27.anInt1162 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass36Array1[local18];
				for (local29 = (Class2_Sub8) local24.method1365(); local29 != null; local29 = (Class2_Sub8) local24.method1361()) {
					local33 = Static111.method744(local29);
					if (local33 != local18) {
						this.aClass36Array1[local33].method1363(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass36Array1[local18];
			for (local29 = (Class2_Sub8) local24.method1365(); local29 != null; local29 = (Class2_Sub8) local24.method1361()) {
				local29.aBoolean140 = false;
				if (local29.aClass2_Sub9_3 != null) {
					local29.aClass2_Sub9_3.anInt1215 = 0;
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
					@Pc(137) Class36 local137 = this.aClass36Array1[local102];
					for (@Pc(142) Class2_Sub8 local142 = (Class2_Sub8) local137.method1365(); local142 != null; local142 = (Class2_Sub8) local137.method1361()) {
						if (!local142.aBoolean140) {
							@Pc(149) Class2_Sub9 local149 = local142.aClass2_Sub9_3;
							if (local149 == null || local149.anInt1215 <= local107) {
								if (local91 < this.anInt1093) {
									@Pc(172) int local172 = local142.method1670(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt1215 += local172;
									}
								} else {
									local142.method1671(arg2);
								}
								local142.aBoolean140 = true;
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

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method1671(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt1096 < 0) {
				this.method742(arg0);
				return;
			}
			if (this.anInt1094 + arg0 < this.anInt1096) {
				this.anInt1094 += arg0;
				this.method742(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt1096 - this.anInt1094;
			this.method742(local29);
			arg0 -= local29;
			this.anInt1094 += local29;
			this.method743();
			@Pc(50) Class2_Sub2 local50 = (Class2_Sub2) this.aClass36_2.method1365();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method110(this);
				if (local58 < 0) {
					local50.anInt154 = 0;
					this.method741(local50);
				} else {
					local50.anInt154 = local58;
					this.method745(local50.aClass2_93, local50);
				}
			}
		} while (arg0 != 0);
	}
}
