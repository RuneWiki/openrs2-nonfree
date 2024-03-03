import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lclient!ml;ILjava/lang/String;I)Lclient!cc;", line = 114)
	public static Class32 method4096(@OriginalArg(0) Class152 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2) {
		if (arg1 == 0) {
			return arg0.method3762(arg2);
		}
		@Pc(43) Class32 local43;
		if (arg1 == 1) {
			try {
				Static391.method4631("openjs", arg0.anApplet1, new Object[] { (new URL(arg0.anApplet1.getCodeBase(), arg2)).toString() });
				local43 = new Class32();
				local43.anInt992 = 1;
				return local43;
			} catch (@Pc(49) Throwable local49) {
				local43 = new Class32();
				local43.anInt992 = 2;
				return local43;
			}
		} else if (arg1 == 2) {
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_blank");
				local43 = new Class32();
				local43.anInt992 = 1;
				return local43;
			} catch (@Pc(85) Exception local85) {
				local43 = new Class32();
				local43.anInt992 = 2;
				return local43;
			}
		} else if (arg1 == 3) {
			try {
				Static391.method4629(arg0.anApplet1, "loggedout");
			} catch (@Pc(105) Throwable local105) {
			}
			try {
				arg0.anApplet1.getAppletContext().showDocument(new URL(arg0.anApplet1.getCodeBase(), arg2), "_top");
				local43 = new Class32();
				local43.anInt992 = 1;
				return local43;
			} catch (@Pc(127) Exception local127) {
				local43 = new Class32();
				local43.anInt992 = 2;
				return local43;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(CI)B", line = 388)
	public static byte method4100(@OriginalArg(0) char arg0) {
		@Pc(28) byte local28;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local28 = (byte) arg0;
		} else if (arg0 == '€') {
			local28 = -128;
		} else if (arg0 == '‚') {
			local28 = -126;
		} else if (arg0 == 'ƒ') {
			local28 = -125;
		} else if (arg0 == '„') {
			local28 = -124;
		} else if (arg0 == '…') {
			local28 = -123;
		} else if (arg0 == '†') {
			local28 = -122;
		} else if (arg0 == '‡') {
			local28 = -121;
		} else if (arg0 == 'ˆ') {
			local28 = -120;
		} else if (arg0 == '‰') {
			local28 = -119;
		} else if (arg0 == 'Š') {
			local28 = -118;
		} else if (arg0 == '‹') {
			local28 = -117;
		} else if (arg0 == 'Œ') {
			local28 = -116;
		} else if (arg0 == 'Ž') {
			local28 = -114;
		} else if (arg0 == '‘') {
			local28 = -111;
		} else if (arg0 == '’') {
			local28 = -110;
		} else if (arg0 == '“') {
			local28 = -109;
		} else if (arg0 == '”') {
			local28 = -108;
		} else if (arg0 == '•') {
			local28 = -107;
		} else if (arg0 == '–') {
			local28 = -106;
		} else if (arg0 == '—') {
			local28 = -105;
		} else if (arg0 == '˜') {
			local28 = -104;
		} else if (arg0 == '™') {
			local28 = -103;
		} else if (arg0 == 'š') {
			local28 = -102;
		} else if (arg0 == '›') {
			local28 = -101;
		} else if (arg0 == 'œ') {
			local28 = -100;
		} else if (arg0 == 'ž') {
			local28 = -98;
		} else if (arg0 == 'Ÿ') {
			local28 = -97;
		} else {
			local28 = 63;
		}
		return local28;
	}
}
