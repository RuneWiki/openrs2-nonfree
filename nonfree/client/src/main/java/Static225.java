import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!hja", name = "P", descriptor = "I")
	public static int anInt4595;

	@OriginalMember(owner = "client!hja", name = "L", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("c4e8e4a9aa32287496b19c94e6b63f3640a45c59a9a15b0ab82d073ac04732c4060889627974b9828a597fd844480ffb8335512f10411be71c505b31963e155984d9554a6e93a56b1a94086466f0069724e987cd8984a6cba9dab6806da005461c69e45ec50c9041ef074d2ebb4004a88e52d57a96a164f08283445b77b31f4247b49b257ab84cb010efe9a9c5c1260df98105d493184f912e22f4a01fdba22fddeb1398c225204fd2412888af23597e9b6298c5ec48fb59c190628af706836fe7363d7e014574926a6a77db7ea8f2fa62c320f7e1e672ffd6798e579866ea69b27fcecbf8cd06ce868396d70086605b10a5c80a74b816c7ffe3a5691dcac64a79e6859956080837be487430e84f01879f74609c3caa0a26d92ef47695b46a893b08ba2a74e8db148cb4b7d3ff341973106634865ba299eaf1e4a85bc865e7810da5c80f67be006d3899ecb9c29c1025f8d326276b178ce5ada293536e77092dd5fcd319702f461de6d67a3432683f67dec6665e3e02a0521fb823820ff5fb4710c4c71e837f173e7fd568849516e4c12eb1fb2f86bfbbd2dd65745ff177cd1d75beb4cf4a9eea6eb4c85fba9a8a80b20a396ed10617b4d16518ac412fc5b3eff2307d0d7f1cdc2ce52a08f36bb8a1a2a717b045b2a8e79d36765780a0e4656d1852047e70c7d1db692f56649b001e0516fb8c49f5c200f238ab995a66880b99", 16);

	@OriginalMember(owner = "client!hja", name = "O", descriptor = "[C")
	public static final char[] aCharArray5 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(Lclient!gh;Lclient!ea;IILclient!sea;BII)V")
	public static void method4155(@OriginalArg(0) Class15_Sub3_Sub3_Sub1_Sub2 arg0, @OriginalArg(1) Class15_Sub3_Sub3_Sub1_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class331 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class2_Sub12 local12 = new Class2_Sub12();
		local12.anInt1210 = arg5;
		local12.anInt1207 = arg6 << 9;
		local12.anInt1202 = arg3 << 9;
		if (arg4 != null) {
			local12.aClass331_1 = arg4;
			@Pc(33) int local33 = arg4.anInt9454;
			@Pc(36) int local36 = arg4.anInt9425;
			if (arg2 == 1 || arg2 == 3) {
				local36 = arg4.anInt9454;
				local33 = arg4.anInt9425;
			}
			local12.anInt1206 = arg4.anInt9445;
			local12.anInt1200 = arg6 + local33 << 9;
			local12.aBoolean65 = arg4.aBoolean699;
			local12.anIntArray64 = arg4.anIntArray485;
			local12.anInt1208 = arg4.anInt9436 << 9;
			local12.anInt1212 = arg4.anInt9460 << 9;
			local12.anInt1195 = arg4.anInt9458;
			local12.anInt1199 = arg4.anInt9404;
			local12.anInt1201 = arg3 + local36 << 9;
			local12.anInt1211 = arg4.anInt9412;
			local12.anInt1204 = arg4.anInt9409;
			local12.anInt1197 = arg4.anInt9401;
			local12.aBoolean66 = arg4.aBoolean686;
			if (arg4.anIntArray486 != null) {
				local12.aBoolean67 = true;
				local12.method1170();
			}
			if (local12.anIntArray64 != null) {
				local12.anInt1209 = local12.anInt1204 + (int) ((double) (local12.anInt1197 - local12.anInt1204) * Math.random());
			}
			Static158.aClass271_21.method7174(local12);
		} else if (arg0 != null) {
			local12.aClass15_Sub3_Sub3_Sub1_Sub2_2 = arg0;
			@Pc(153) Class312 local153 = arg0.aClass312_1;
			if (local153.anIntArray458 != null) {
				local12.aBoolean67 = true;
				local153 = local153.method7953(Static113.aClass282_1);
			}
			if (local153 != null) {
				local12.anInt1200 = local153.anInt9095 + arg6 << 9;
				local12.anInt1201 = local153.anInt9095 + arg3 << 9;
				local12.anInt1211 = Static623.method9262(arg0);
				local12.anInt1208 = local153.anInt9076 << 9;
				local12.aBoolean65 = local153.aBoolean660;
				local12.anInt1195 = local153.anInt9061;
				local12.anInt1212 = local153.anInt9084 << 9;
				local12.anInt1206 = local153.anInt9059;
				local12.anInt1199 = local153.anInt9101;
			}
			Static148.aClass271_11.method7174(local12);
		} else if (arg1 != null) {
			local12.aClass15_Sub3_Sub3_Sub1_Sub1_1 = arg1;
			local12.anInt1200 = arg6 + arg1.method3690() << 9;
			local12.anInt1201 = arg1.method3690() + arg3 << 9;
			local12.anInt1211 = Static170.method3354(arg1);
			local12.anInt1208 = 0;
			local12.anInt1206 = arg1.anInt2380;
			local12.anInt1212 = arg1.anInt2390 << 9;
			local12.anInt1199 = 256;
			local12.aBoolean65 = arg1.aBoolean177;
			local12.anInt1195 = 256;
			Static555.aClass335_42.method8356(local12, (long) arg1.anInt3977);
		}
	}

	@OriginalMember(owner = "client!hja", name = "a", descriptor = "(JB)V")
	public static void method4156(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static293.anInt7589;
		@Pc(27) int local27;
		if (local7 != Static461.anInt8253) {
			@Pc(19) int local19 = local7 - Static461.anInt8253;
			local27 = (int) (arg0 * (long) local19 / 320L);
			if (local19 > 0) {
				if (local27 == 0) {
					local27 = 1;
				} else if (local19 < local27) {
					local27 = local19;
				}
			} else if (local27 == 0) {
				local27 = -1;
			} else if (local19 > local27) {
				local27 = local19;
			}
			Static461.anInt8253 += local27;
		}
		@Pc(76) int local76 = Static106.anInt1972;
		Static320.aFloat118 += (float) arg0 * Static24.aFloat3 / 40.0F * 8.0F;
		Static278.aFloat108 += Static584.aFloat89 * (float) arg0 / 40.0F * 8.0F;
		if (Static386.anInt7301 != local76) {
			local27 = local76 - Static386.anInt7301;
			@Pc(114) int local114 = (int) (arg0 * (long) local27 / 320L);
			if (local27 <= 0) {
				if (local114 == 0) {
					local114 = -1;
				} else if (local27 > local114) {
					local114 = local27;
				}
			} else if (local114 == 0) {
				local114 = 1;
			} else if (local27 < local114) {
				local114 = local27;
			}
			Static386.anInt7301 += local114;
		}
		Static27.method474();
	}
}
