import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class10_Sub5_Sub1 extends Class10_Sub5 {

	@OriginalMember(owner = "client!fe", name = "x", descriptor = "[Lclient!bb;")
	private final Class9[] aClass9Array1 = new Class9[8];

	@OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
	private final int anInt913 = 16;

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "Lclient!bb;")
	private final Class9 aClass9_4 = new Class9();

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
	private int anInt914 = -1;

	@OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
	private int anInt915 = 0;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
	private int anInt916 = 0;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
	public Class10_Sub5_Sub1() {
		for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
			this.aClass9Array1[local24] = new Class9();
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method881(@OriginalArg(0) int arg0) {
		do {
			if (this.anInt914 < 0) {
				this.method544(arg0);
				return;
			}
			if (this.anInt915 + arg0 < this.anInt914) {
				this.anInt915 += arg0;
				this.method544(arg0);
				return;
			}
			@Pc(29) int local29 = this.anInt914 - this.anInt915;
			this.method544(local29);
			arg0 -= local29;
			this.anInt915 += local29;
			this.method545();
			@Pc(50) Class10_Sub4 local50 = (Class10_Sub4) this.aClass9_4.method72();
			synchronized (local50) {
				@Pc(58) int local58 = local50.method522(this);
				if (local58 < 0) {
					local50.anInt878 = 0;
					this.method548(local50);
				} else {
					local50.anInt878 = local58;
					this.method546(local50.aClass10_94, local50);
				}
			}
		} while (arg0 != 0);
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	private void method544(@OriginalArg(0) int arg0) {
		this.anInt916 -= arg0;
		if (this.anInt916 < 0) {
			this.anInt916 = 0;
		}
		for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
			@Pc(19) Class9 local19 = this.aClass9Array1[local13];
			for (@Pc(24) Class10_Sub5 local24 = (Class10_Sub5) local19.method72(); local24 != null; local24 = (Class10_Sub5) local19.method81()) {
				local24.method881(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()V")
	private void method545() {
		if (this.anInt915 <= 0) {
			return;
		}
		for (@Pc(8) Class10_Sub4 local8 = (Class10_Sub4) this.aClass9_4.method72(); local8 != null; local8 = (Class10_Sub4) this.aClass9_4.method81()) {
			local8.anInt878 -= this.anInt915;
		}
		this.anInt914 -= this.anInt915;
		this.anInt915 = 0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([III)I")
	@Override
	public synchronized int method879(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(39) int local39;
		do {
			if (this.anInt914 < 0) {
				return this.method550(arg0, arg1, arg2);
			}
			if (this.anInt915 + arg2 < this.anInt914) {
				this.anInt915 += arg2;
				return this.method550(arg0, arg1, arg2);
			}
			@Pc(33) int local33 = this.anInt914 - this.anInt915;
			local39 = this.method550(arg0, arg1, local33);
			arg1 += local33;
			arg2 -= local33;
			this.anInt915 += local33;
			this.method545();
			@Pc(61) Class10_Sub4 local61 = (Class10_Sub4) this.aClass9_4.method72();
			synchronized (local61) {
				@Pc(69) int local69 = local61.method522(this);
				if (local69 < 0) {
					local61.anInt878 = 0;
					this.method548(local61);
				} else {
					local61.anInt878 = local69;
					this.method546(local61.aClass10_94, local61);
				}
			}
		} while (arg2 != 0);
		return local39;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!dc;Lclient!f;)V")
	private void method546(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10_Sub4 arg1) {
		while (arg0 != this.aClass9_4.aClass10_1 && ((Class10_Sub4) arg0).anInt878 <= arg1.anInt878) {
			arg0 = arg0.aClass10_94;
		}
		this.aClass9_4.method80(arg1, arg0);
		this.anInt914 = ((Class10_Sub4) this.aClass9_4.aClass10_1.aClass10_94).anInt878;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ic;)V")
	public synchronized void method547(@OriginalArg(0) Class10_Sub5 arg0) {
		@Pc(5) Class9 local5 = this.aClass9Array1[Static109.method549(arg0)];
		local5.method78(arg0);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!f;)V")
	private void method548(@OriginalArg(0) Class10_Sub4 arg0) {
		arg0.method1654();
		arg0.method521();
		@Pc(9) Class10 local9 = this.aClass9_4.aClass10_1.aClass10_94;
		if (local9 == this.aClass9_4.aClass10_1) {
			this.anInt914 = -1;
		} else {
			this.anInt914 = ((Class10_Sub4) local9).anInt878;
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "([III)I")
	private int method550(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt916 -= arg2;
		@Pc(18) int local18;
		@Pc(24) Class9 local24;
		@Pc(29) Class10_Sub5 local29;
		@Pc(33) int local33;
		if (this.anInt916 <= 0) {
			this.anInt916 += Static29.anInt894 >> 4;
			for (local18 = 0; local18 < 8; local18++) {
				local24 = this.aClass9Array1[local18];
				for (local29 = (Class10_Sub5) local24.method72(); local29 != null; local29 = (Class10_Sub5) local24.method81()) {
					local33 = Static109.method549(local29);
					if (local33 != local18) {
						this.aClass9Array1[local33].method78(local29);
					}
				}
			}
		}
		for (local18 = 0; local18 < 8; local18++) {
			local24 = this.aClass9Array1[local18];
			for (local29 = (Class10_Sub5) local24.method72(); local29 != null; local29 = (Class10_Sub5) local24.method81()) {
				local29.aBoolean77 = false;
				if (local29.aClass10_Sub9_3 != null) {
					local29.aClass10_Sub9_3.anInt1838 = 0;
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
					@Pc(137) Class9 local137 = this.aClass9Array1[local102];
					for (@Pc(142) Class10_Sub5 local142 = (Class10_Sub5) local137.method72(); local142 != null; local142 = (Class10_Sub5) local137.method81()) {
						if (!local142.aBoolean77) {
							@Pc(149) Class10_Sub9 local149 = local142.aClass10_Sub9_3;
							if (local149 == null || local149.anInt1838 <= local107) {
								if (local91 < this.anInt913) {
									@Pc(172) int local172 = local142.method879(arg0, arg1, arg2);
									local91 += local172;
									if (local149 != null) {
										local149.anInt1838 += local172;
									}
								} else {
									local142.method881(arg2);
								}
								local142.aBoolean77 = true;
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
