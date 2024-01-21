import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class3_Sub1_Sub8 extends Class3_Sub1 {

	@OriginalMember(owner = "client!hc", name = "yb", descriptor = "I")
	public int anInt1313;

	@OriginalMember(owner = "client!hc", name = "Gb", descriptor = "I")
	private int anInt1318;

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
	private int anInt1301 = 128;

	@OriginalMember(owner = "client!hc", name = "lb", descriptor = "I")
	public int anInt1307 = -1;

	@OriginalMember(owner = "client!hc", name = "ob", descriptor = "I")
	private int anInt1308 = 0;

	@OriginalMember(owner = "client!hc", name = "pb", descriptor = "I")
	private int anInt1309 = 0;

	@OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
	private int anInt1302 = 128;

	@OriginalMember(owner = "client!hc", name = "Cb", descriptor = "I")
	private int anInt1315 = 0;

	@OriginalMember(owner = "client!hc", name = "Bb", descriptor = "[S")
	private final short[] aShortArray11 = new short[6];

	@OriginalMember(owner = "client!hc", name = "mb", descriptor = "[S")
	private final short[] aShortArray10 = new short[6];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!m;I)V")
	private void method808(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1318 = arg0.method974();
		} else if (arg1 == 2) {
			this.anInt1307 = arg0.method974();
		} else if (arg1 == 4) {
			this.anInt1302 = arg0.method974();
		} else if (arg1 == 5) {
			this.anInt1301 = arg0.method974();
		} else if (arg1 == 6) {
			this.anInt1309 = arg0.method974();
		} else if (arg1 == 7) {
			this.anInt1308 = arg0.method981();
		} else if (arg1 == 8) {
			this.anInt1315 = arg0.method981();
		} else if (arg1 >= 40 && arg1 < 50) {
			this.aShortArray10[arg1 - 40] = (short) arg0.method974();
		} else if (arg1 >= 50 && arg1 < 60) {
			this.aShortArray11[arg1 - 50] = (short) arg0.method974();
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILclient!m;)V")
	public void method812(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method981();
			if (local13 == 0) {
				return;
			}
			this.method808(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Lclient!oa;")
	public Class3_Sub1_Sub5_Sub7 method814(@OriginalArg(1) int arg0) {
		@Pc(13) Class3_Sub1_Sub5_Sub7 local13 = (Class3_Sub1_Sub5_Sub7) Static110.aClass66_26.method1970((long) this.anInt1313);
		if (local13 == null) {
			@Pc(29) Class3_Sub1_Sub5_Sub2 local29 = Static34.method676(Static106.aClass16_130, this.anInt1318);
			if (local29 == null) {
				return null;
			}
			for (@Pc(35) int local35 = 0; local35 < 6; local35++) {
				if (this.aShortArray10[0] != 0) {
					local29.method693(this.aShortArray10[local35], this.aShortArray11[local35]);
				}
			}
			local13 = local29.method688(this.anInt1308 + 64, this.anInt1315 + 850, -30, -50, -30);
			Static110.aClass66_26.method1969((long) this.anInt1313, local13);
		}
		@Pc(98) Class3_Sub1_Sub5_Sub7 local98;
		if (this.anInt1307 == -1 || arg0 == -1) {
			local98 = local13.method1472(true);
		} else {
			local98 = Static111.method2009(this.anInt1307).method2124(arg0, local13);
		}
		if (this.anInt1302 != 128 || this.anInt1301 != 128) {
			local98.method1476(this.anInt1302, this.anInt1301, this.anInt1302);
		}
		if (this.anInt1309 != 0) {
			if (this.anInt1309 == 90) {
				local98.method1473();
			}
			if (this.anInt1309 == 180) {
				local98.method1473();
				local98.method1473();
			}
			if (this.anInt1309 == 270) {
				local98.method1473();
				local98.method1473();
				local98.method1473();
			}
		}
		return local98;
	}
}
