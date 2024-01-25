import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "Lclient!nq;")
	public static Class144 aClass144_21;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString9 = "";

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "Z")
	public static boolean aBoolean65 = true;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II[BI)I")
	public static int method826(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = -1;
		for (@Pc(16) int local16 = arg2; local16 < arg0; local16++) {
			local14 = Class184.anIntArray452[(arg1[local16] ^ local14) & 0xFF] ^ local14 >>> 8;
		}
		return ~local14;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V")
	public static void method828(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static313.aClass11_Sub25_Sub1_5.method5168(arg2);
		Static313.aClass11_Sub25_Sub1_5.method5196(arg1);
		Static313.aClass11_Sub25_Sub1_5.method5191(arg0);
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V")
	public static void method829() {
		Static325.aClass26_7.method333();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)Lclient!aj;")
	public static Class10_Sub1 method830(@OriginalArg(1) int arg0) {
		@Pc(7) Class210[] local7 = Class27_Sub2.aClass210Array1;
		synchronized (Class27_Sub2.aClass210Array1) {
			@Pc(33) Class10_Sub1 local33;
			if (Class27_Sub2.aClass210Array1.length <= arg0 || Class27_Sub2.aClass210Array1[arg0].method5609()) {
				local33 = new Class10_Sub1();
				local33.aClass10_Sub8Array1 = new Class10_Sub8[arg0];
				for (@Pc(55) int local55 = 0; local55 < arg0; local55++) {
					local33.aClass10_Sub8Array1[local55] = new Class10_Sub8();
				}
			} else {
				local33 = (Class10_Sub1) Class27_Sub2.aClass210Array1[arg0].method5611();
				local33.method5452();
				@Pc(40) int local40 = Static257.anIntArray399[arg0]--;
			}
			return local33;
		}
	}
}
