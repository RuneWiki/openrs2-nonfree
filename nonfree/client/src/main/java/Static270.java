import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
	public static int anInt4759 = 0;

	@OriginalMember(owner = "client!kh", name = "A", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("af6443833b5fe71b59d48c713248c50a470e74576cc73d604710f77adab6ea6f42389c4e673467f5961109b904af91f3191b9ce91043cedeead1c7d7b5842805a737131e5f4178ee9d410cc9ff4cbcaf7a62a4af7291e9e89b07395dd390e958fea820c753a82b1a50f232d291accb692a718241f427c460ea4439ac95703322b4cd6682e3636daf7218e9b88cc84f7af1e7c525d479ba03671ce2a001a8aa15f59e6b5b76d6538f059005a5cb5ce06543d62b68bf0de723a2b4f15e3e3b187d51228bcdce921f6dc663e88c9a00da2f03a066a38bb541ed30be3a5fb24bb9f5ca711feac490053a119d22dfe850fd8fb19874a471f79e9350f6915d2e729d587e98437869aecb6ce5e852a34cb93794bf290e99b7d42743ade8311b1457054f4e062c14ac36e95b7ae3f515f6c87a798216e7b6f6fbb5f966e162aa8c497ba1d1d8de37ef2e944b3b7b5c7aac7f3dee32e2df5d8c9fbf02f3b684e5322498f1fc8c20b58f4443429a6ba4ffac73dbb447a86372afa96e230ebb0c7496a7c41e8fb7735e9c8d67742312e6b43ede612dce976ffc4339f44cd2e582839f2166ea15e56d8d4aa6fe12131f698db69723623a022e20d9246e8968e4f8e63d03cf533d0cbaa09446bef3ac3990001c36abb8285c2594909bb70989fc0ac40f268750fd5d96db6f68eb28dd3ac4b465ba1a6619f001853ce161a2b6bd51d517e9702d", 16);

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "([BIILjava/lang/String;II)I")
	public static int method3845(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(5) int arg3) {
		@Pc(15) int local15 = arg1;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg2.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg0[arg3 + local17] = (byte) local25;
			} else if (local25 == '€') {
				arg0[arg3 + local17] = -128;
			} else if (local25 == '‚') {
				arg0[arg3 + local17] = -126;
			} else if (local25 == 'ƒ') {
				arg0[arg3 + local17] = -125;
			} else if (local25 == '„') {
				arg0[arg3 + local17] = -124;
			} else if (local25 == '…') {
				arg0[local17 + arg3] = -123;
			} else if (local25 == '†') {
				arg0[local17 + arg3] = -122;
			} else if (local25 == '‡') {
				arg0[arg3 + local17] = -121;
			} else if (local25 == 'ˆ') {
				arg0[local17 + arg3] = -120;
			} else if (local25 == '‰') {
				arg0[arg3 + local17] = -119;
			} else if (local25 == 'Š') {
				arg0[arg3 + local17] = -118;
			} else if (local25 == '‹') {
				arg0[arg3 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg0[arg3 + local17] = -116;
			} else if (local25 == 'Ž') {
				arg0[local17 + arg3] = -114;
			} else if (local25 == '‘') {
				arg0[local17 + arg3] = -111;
			} else if (local25 == '’') {
				arg0[arg3 + local17] = -110;
			} else if (local25 == '“') {
				arg0[arg3 + local17] = -109;
			} else if (local25 == '”') {
				arg0[arg3 + local17] = -108;
			} else if (local25 == '•') {
				arg0[local17 + arg3] = -107;
			} else if (local25 == '–') {
				arg0[arg3 + local17] = -106;
			} else if (local25 == '—') {
				arg0[arg3 + local17] = -105;
			} else if (local25 == '˜') {
				arg0[arg3 + local17] = -104;
			} else if (local25 == '™') {
				arg0[local17 + arg3] = -103;
			} else if (local25 == 'š') {
				arg0[local17 + arg3] = -102;
			} else if (local25 == '›') {
				arg0[arg3 + local17] = -101;
			} else if (local25 == 'œ') {
				arg0[local17 + arg3] = -100;
			} else if (local25 == 'ž') {
				arg0[local17 + arg3] = -98;
			} else if (local25 == 'Ÿ') {
				arg0[arg3 + local17] = -97;
			} else {
				arg0[arg3 + local17] = 63;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)Z")
	public static boolean method3853(@OriginalArg(1) int arg0) {
		if (arg0 == 4 || arg0 == 46 || arg0 == 11 || arg0 == 16 || arg0 == 1009) {
			return true;
		} else {
			return arg0 == 6 || arg0 == 1001;
		}
	}
}
