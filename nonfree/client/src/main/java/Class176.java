import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public abstract class Class176 {

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "[B")
	public static final byte[] aByteArray46 = new byte[32896];

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray46[local6++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local8 * local8 + local11 * local11 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!pm;)Lclient!pm;")
	public abstract Class4_Sub5_Sub6 method3973(@OriginalArg(1) Class4_Sub5_Sub6 arg0);
}
