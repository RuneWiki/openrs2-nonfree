import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!lba", name = "e", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_51 = new Class303(1, 3);

	@OriginalMember(owner = "client!lba", name = "f", descriptor = "Lclient!dba;")
	public static final Class63 aClass63_14 = new Class63();

	@OriginalMember(owner = "client!lba", name = "g", descriptor = "J")
	public static long aLong130 = 0L;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IB)Z")
	public static boolean method3974(@OriginalArg(0) int arg0) {
		if (Static414.aBooleanArray22[arg0]) {
			return true;
		} else if (Static527.aClass322_143.method6830(arg0)) {
			@Pc(25) int local25 = Static527.aClass322_143.method6831(arg0);
			if (local25 == 0) {
				Static414.aBooleanArray22[arg0] = true;
				return true;
			}
			if (Static380.aClass361ArrayArray2[arg0] == null) {
				Static380.aClass361ArrayArray2[arg0] = new Class361[local25];
			}
			for (@Pc(49) int local49 = 0; local49 < local25; local49++) {
				if (Static380.aClass361ArrayArray2[arg0][local49] == null) {
					@Pc(63) byte[] local63 = Static527.aClass322_143.method6802(arg0, local49);
					if (local63 != null) {
						@Pc(75) Class361 local75 = Static380.aClass361ArrayArray2[arg0][local49] = new Class361();
						local75.anInt9594 = (arg0 << 16) + local49;
						if (local63[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local75.method7886(new Class3_Sub11(local63));
					}
				}
			}
			Static414.aBooleanArray22[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BII)V")
	public static void method3978(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(1, arg1);
		local8.method7326();
		local8.anInt8802 = arg0;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(JZIIIIILclient!tf;)V")
	public static void method3980(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class322 arg3) {
		Static91.anInt1912 = arg1;
		Static187.aLong102 = arg0;
		Static417.anInt7075 = 10000;
		Static225.anInt3978 = arg2;
		Static218.aBoolean295 = false;
		Static361.anInt8636 = 0;
		Static565.anInt9228 = 1;
		Static410.anInt7034 = 10000;
		Static24.aClass322_5 = arg3;
	}

	@OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)V")
	public static void method3983() {
		@Pc(8) Class3_Sub7_Sub18 local8 = Static543.method7218(15, 0);
		local8.method7329();
	}
}
