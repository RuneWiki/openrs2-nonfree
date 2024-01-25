import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
	public static int anInt3473;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "[I")
	public static final int[] anIntArray201 = new int[2];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(JB)V")
	public static void method3054(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZII)Lclient!tf;")
	public static Class8_Sub10 method3056(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class98[] local7 = Class170.aClass98Array1;
		synchronized (Class170.aClass98Array1) {
			if (arg1 != 0) {
				anInt3473 = -26;
			}
			@Pc(33) Class8_Sub10 local33;
			if (Class170.aClass98Array1.length <= arg2 || Class170.aClass98Array1[arg2].method1781()) {
				local33 = new Class8_Sub10();
				local33.aClass8_Sub7Array1 = new Class8_Sub7[arg2];
				for (@Pc(39) int local39 = 0; local39 < arg2; local39++) {
					local33.aClass8_Sub7Array1[local39] = new Class8_Sub7();
				}
			} else {
				local33 = (Class8_Sub10) Class170.aClass98Array1[arg2].method1785();
				local33.method8893();
				@Pc(78) int local78 = Static223.anIntArray208[arg2]--;
			}
			local33.aBoolean731 = arg0;
			return local33;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILclient!la;I)Lclient!ju;")
	public static Class192 method3061(@OriginalArg(2) Class208 arg0, @OriginalArg(3) int arg1) {
		@Pc(16) byte[] local16 = arg0.method4991(arg1, 0, 7);
		return local16 == null ? null : new Class192(local16);
	}
}
