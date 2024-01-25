import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray16;

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "Z")
	public static boolean aBoolean725 = false;

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILclient!jn;)I")
	public static int method8365(@OriginalArg(1) Class176 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method3996(Static501.anInt6753)) {
			local5++;
		}
		if (arg0.method3996(Static219.anInt4026)) {
			local5++;
		}
		if (arg0.method3996(Static347.anInt6680)) {
			local5++;
		}
		if (arg0.method3996(Static459.anInt8549)) {
			local5++;
		}
		if (arg0.method3996(Static445.anInt8285)) {
			local5++;
		}
		if (arg0.method3996(Static306.anInt6141)) {
			local5++;
		}
		if (arg0.method3996(Static207.anInt3873)) {
			local5++;
		}
		if (arg0.method3996(Static16.anInt268)) {
			local5++;
		}
		if (arg0.method3996(Static357.anInt6964)) {
			local5++;
		}
		if (arg0.method3996(Static307.anInt6167)) {
			local5++;
		}
		if (arg0.method3996(Static346.anInt6666)) {
			local5++;
		}
		if (arg0.method3996(Static492.anInt8941)) {
			local5++;
		}
		if (arg0.method3996(Static452.anInt8508)) {
			local5++;
		}
		if (arg0.method3996(Static162.anInt3312)) {
			local5++;
		}
		if (arg0.method3996(Static512.anInt9189)) {
			local5++;
		}
		if (arg0.method3996(Static499.anInt3410)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIB[B)[B")
	public static byte[] method8367(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static597.method3730(arg1, arg0, local11, 0, 32768);
		return local11;
	}
}
