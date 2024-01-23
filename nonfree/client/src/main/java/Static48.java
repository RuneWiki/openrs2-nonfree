import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
	public static int anInt870;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "Lclient!ui;")
	public static Class103 aClass103_6 = new Class103(32);

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!qe;")
	public static Class78 aClass78_164 = Static199.method3560("Starte 3D)2Softwarebibliothek)3");

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "J")
	public static long aLong32 = 0L;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BII[B)Lclient!qe;")
	public static Class78 method629(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(15) Class78 local15 = new Class78();
		local15.anInt3831 = 0;
		local15.aByteArray48 = new byte[arg0];
		for (@Pc(24) int local24 = arg1; local24 < arg1 + arg0; local24++) {
			if (arg2[local24] != 0) {
				local15.aByteArray48[local15.anInt3831++] = arg2[local24];
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)Z")
	public static boolean method633() {
		return Static11.aBoolean8;
	}
}
