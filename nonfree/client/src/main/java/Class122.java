import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public final class Class122 {

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "[[Lclient!ce;")
	private Class49[][] aClass49ArrayArray1;

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "Lclient!pga;")
	private final Class95_Sub3 aClass95_Sub3_8;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Lclient!sba;")
	private final Class76_Sub3 aClass76_Sub3_1;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public final int anInt3112;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
	private final int anInt3108;

	@OriginalMember(owner = "client!gf", name = "m", descriptor = "I")
	private final int anInt3117;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "[B")
	public final byte[] aByteArray38;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	private final int anInt3113;

	@OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
	private final int anInt3118;

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!pga;Lclient!sba;)V")
	public Class122(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class76_Sub3 arg1) {
		this.aClass95_Sub3_8 = arg0;
		this.aClass76_Sub3_1 = arg1;
		this.anInt3112 = (this.aClass76_Sub3_1.anInt8792 * this.aClass76_Sub3_1.anInt8791 >> this.aClass95_Sub3_8.anInt8351) + 2;
		this.anInt3108 = (this.aClass76_Sub3_1.anInt8794 * this.aClass76_Sub3_1.anInt8792 >> this.aClass95_Sub3_8.anInt8351) + 2;
		this.anInt3117 = this.aClass95_Sub3_8.anInt8351 + 7 - this.aClass76_Sub3_1.anInt8795;
		this.aByteArray38 = new byte[this.anInt3112 * this.anInt3108];
		this.anInt3113 = this.aClass76_Sub3_1.anInt8791 >> this.anInt3117;
		this.anInt3118 = this.aClass76_Sub3_1.anInt8794 >> this.anInt3117;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!r;BII)V")
	public void method2626(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub2_Sub19_Sub2 local6 = (Class2_Sub2_Sub19_Sub2) arg0;
		arg1 += local6.anInt9925 + 1;
		arg2 += local6.anInt9932 + 1;
		@Pc(28) int local28 = arg1 + this.anInt3112 * arg2;
		@Pc(30) int local30 = 0;
		@Pc(42) int local42 = local6.anInt9931;
		@Pc(45) int local45 = local6.anInt9929;
		@Pc(51) int local51 = this.anInt3112 - local45;
		@Pc(53) int local53 = 0;
		@Pc(60) int local60;
		if (arg2 <= 0) {
			local60 = 1 - arg2;
			local42 -= local60;
			local30 = local60 * local45;
			arg2 = 1;
			local28 += local60 * this.anInt3112;
		}
		if (this.anInt3108 <= local42 + arg2) {
			local60 = arg2 + local42 + 1 - this.anInt3108;
			local42 -= local60;
		}
		if (arg1 <= 0) {
			local60 = 1 - arg1;
			local45 -= local60;
			local28 += local60;
			arg1 = 1;
			local51 += local60;
			local53 = local60;
			local30 += local60;
		}
		if (this.anInt3112 <= arg1 + local45) {
			local60 = arg1 + local45 + 1 - this.anInt3112;
			local45 -= local60;
			local53 += local60;
			local51 += local60;
		}
		if (local45 > 0 && local42 > 0) {
			Static643.method8640(local6.aByteArray114, local30, local42, this.aByteArray38, local51, local45, local28, local53);
			this.method2632(local42, arg1, arg2, local45);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI[[ZIZI)V")
	public void method2628(@OriginalArg(1) int arg0, @OriginalArg(2) boolean[][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		this.aClass95_Sub3_8.method7076(false);
		this.aClass95_Sub3_8.method7033(false);
		this.aClass95_Sub3_8.method7137(1);
		this.aClass95_Sub3_8.method7026(1);
		this.aClass95_Sub3_8.method7148(false, false, -2);
		@Pc(41) float local41 = 1.0F / (float) (this.aClass95_Sub3_8.anInt8355 * 128);
		@Pc(45) int local45;
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg3) {
			for (local45 = 0; local45 < this.anInt3118; local45++) {
				local52 = local45 << this.anInt3117;
				local59 = local45 + 1 << this.anInt3117;
				label138: for (local61 = 0; local61 < this.anInt3113; local61++) {
					if (this.aClass49ArrayArray1[local61][local45] != null) {
						@Pc(75) int local75 = local61 << this.anInt3117;
						@Pc(82) int local82 = local61 + 1 << this.anInt3117;
						for (@Pc(84) int local84 = local75; local84 < local82; local84++) {
							if (-arg0 <= local84 - arg4 && arg0 >= local84 - arg4) {
								for (@Pc(100) int local100 = local52; local100 < local59; local100++) {
									if (-arg0 <= local100 - arg2 && local100 - arg2 <= arg0 && arg1[local84 + arg0 - arg4][local100 + arg0 - arg2]) {
										@Pc(144) Class177_Sub1 local144 = this.aClass95_Sub3_8.method7017();
										local144.method3840(local41, 1.0F, local41);
										local144.method7872(-local61, -local45, 0);
										this.aClass95_Sub3_8.method7099(Static409.aClass85_3);
										this.aClass49ArrayArray1[local61][local45].method920();
										continue label138;
									}
								}
							}
						}
					}
				}
			}
		} else {
			for (local45 = 0; local45 < this.anInt3118; local45++) {
				local52 = local45 << this.anInt3117;
				local59 = local45 + 1 << this.anInt3117;
				for (local61 = 0; local61 < this.anInt3113; local61++) {
					@Pc(231) Class49 local231 = this.aClass49ArrayArray1[local61][local45];
					if (local231 != null) {
						@Pc(242) Interface10 local242 = this.aClass95_Sub3_8.method7075(local231.anInt1183 * 3);
						@Pc(247) Buffer local247 = local242.method7385();
						if (local247 != null) {
							@Pc(255) Stream local255 = this.aClass95_Sub3_8.method7086(local247);
							@Pc(257) int local257 = 0;
							@Pc(262) int local262 = local61 << this.anInt3117;
							@Pc(269) int local269 = local61 + 1 << this.anInt3117;
							for (@Pc(271) int local271 = local52; local271 < local59; local271++) {
								if (-arg0 <= local271 - arg2 && arg0 >= local271 - arg2) {
									@Pc(294) int local294 = local262 + this.aClass76_Sub3_1.anInt8791 * local271;
									for (@Pc(296) int local296 = local262; local296 < local269; local296++) {
										if (local296 - arg4 >= -arg0 && local296 - arg4 <= arg0 && arg1[local296 + arg0 - arg4][local271 + arg0 - arg2]) {
											@Pc(333) short[] local333 = this.aClass76_Sub3_1.aShortArrayArray26[local294];
											if (local333 != null) {
												@Pc(339) int local339;
												if (Stream.a()) {
													for (local339 = 0; local339 < local333.length; local339++) {
														local255.e(local333[local339] & 0xFFFF);
														local257++;
													}
												} else {
													for (local339 = 0; local339 < local333.length; local339++) {
														local255.b(local333[local339] & 0xFFFF);
														local257++;
													}
												}
											}
										}
										local294++;
									}
								}
							}
							local255.c();
							if (local242.method7384() && local257 > 0) {
								@Pc(403) Class177_Sub1 local403 = this.aClass95_Sub3_8.method7017();
								local403.method3840(local41, 1.0F, local41);
								local403.method7872(-local61, -local45, 0);
								this.aClass95_Sub3_8.method7099(Static409.aClass85_3);
								local231.method922(local242, local257 / 3);
							}
						}
					}
				}
			}
		}
		this.aClass95_Sub3_8.method7105();
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!r;III)V")
	public void method2629(@OriginalArg(0) Class2_Sub2_Sub19 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2_Sub2_Sub19_Sub2 local14 = (Class2_Sub2_Sub19_Sub2) arg0;
		arg2 += local14.anInt9932 + 1;
		arg1 += local14.anInt9925 + 1;
		@Pc(35) int local35 = this.anInt3112 * arg2 + arg1;
		@Pc(37) int local37 = 0;
		@Pc(40) int local40 = local14.anInt9931;
		@Pc(43) int local43 = local14.anInt9929;
		@Pc(48) int local48 = this.anInt3112 - local43;
		@Pc(57) int local57;
		if (arg2 <= 0) {
			local57 = 1 - arg2;
			arg2 = 1;
			local37 = local57 * local43;
			local40 -= local57;
			local35 += this.anInt3112 * local57;
		}
		@Pc(78) int local78 = 0;
		if (local40 + arg2 >= this.anInt3108) {
			local57 = local40 + arg2 + 1 - this.anInt3108;
			local40 -= local57;
		}
		if (arg1 <= 0) {
			local57 = 1 - arg1;
			local35 += local57;
			local43 -= local57;
			arg1 = 1;
			local37 += local57;
			local78 = local57;
			local48 += local57;
		}
		if (local43 + arg1 >= this.anInt3112) {
			local57 = local43 + arg1 + 1 - this.anInt3112;
			local43 -= local57;
			local78 += local57;
			local48 += local57;
		}
		if (local43 > 0 && local40 > 0) {
			Static609.method8209(local48, local43, local37, this.aByteArray38, local40, local35, local14.aByteArray114, local78);
			this.method2632(local40, arg1, arg2, local43);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!r;II)Z")
	public boolean method2631(@OriginalArg(1) Class2_Sub2_Sub19 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class2_Sub2_Sub19_Sub2 local6 = (Class2_Sub2_Sub19_Sub2) arg0;
		arg2 += local6.anInt9932 + 1;
		arg1 += local6.anInt9925 + 1;
		@Pc(27) int local27 = arg2 * this.anInt3112 + arg1;
		@Pc(30) int local30 = local6.anInt9931;
		@Pc(33) int local33 = local6.anInt9929;
		@Pc(39) int local39 = this.anInt3112 - local33;
		@Pc(49) int local49;
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			local30 -= local49;
			local27 += local49 * this.anInt3112;
			arg2 = 1;
		}
		if (this.anInt3108 <= local30 + arg2) {
			local49 = local30 + arg2 + 1 - this.anInt3108;
			local30 -= local49;
		}
		if (arg1 <= 0) {
			local49 = 1 - arg1;
			arg1 = 1;
			local39 += local49;
			local27 += local49;
			local33 -= local49;
		}
		if (local33 + arg1 >= this.anInt3112) {
			local49 = local33 + arg1 + 1 - this.anInt3112;
			local33 -= local49;
			local39 += local49;
		}
		if (local33 > 0 && local30 > 0) {
			local39 += this.anInt3112 * 7;
			return Static451.method2191(local30, this.aByteArray38, local27, local33, local39);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIII)V")
	private void method2632(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass49ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg1 - 1 >> 7;
		@Pc(25) int local25 = arg3 + arg1 - 1 - 1 >> 7;
		@Pc(37) int local37 = arg2 - 1 >> 7;
		@Pc(47) int local47 = arg0 + arg2 - 1 - 1 >> 7;
		for (@Pc(49) int local49 = local15; local49 <= local25; local49++) {
			@Pc(56) Class49[] local56 = this.aClass49ArrayArray1[local49];
			for (@Pc(58) int local58 = local37; local58 <= local47; local58++) {
				if (local56[local58] != null) {
					local56[local58].aBoolean84 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public void method2633() {
		this.aClass49ArrayArray1 = new Class49[this.anInt3113][this.anInt3118];
		for (@Pc(20) int local20 = 0; local20 < this.anInt3118; local20++) {
			for (@Pc(24) int local24 = 0; local24 < this.anInt3113; local24++) {
				this.aClass49ArrayArray1[local24][local20] = new Class49(this.aClass95_Sub3_8, this, this.aClass76_Sub3_1, local24, local20, this.anInt3117, local24 * 128 + 1, local20 * 128 + 1);
				if (this.aClass49ArrayArray1[local24][local20].anInt1183 == 0) {
					this.aClass49ArrayArray1[local24][local20] = null;
				}
			}
		}
	}
}
