import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public class Class210 implements Interface12 {

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "Lclient!fw;")
	public final Class114 aClass114_9;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "I")
	public final int anInt6227;

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "Lclient!dg;")
	public final Class72 aClass72_8;

	@OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
	public final int anInt6224;

	@OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
	public final int anInt6225;

	static {
		for (@Pc(8) int local8 = 0; local8 < 26; local8++) {
			aCharArray6[local8] = (char) (local8 + 65);
		}
		for (@Pc(22) int local22 = 26; local22 < 52; local22++) {
			aCharArray6[local22] = (char) (local22 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray6[local38] = (char) (local38 - 4);
		}
		aCharArray6[62] = '+';
		aCharArray6[63] = '/';
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(ILclient!fw;Lclient!dg;II)V")
	public Class210(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass114_9 = arg1;
		this.anInt6227 = arg4;
		this.aClass72_8 = arg2;
		this.anInt6224 = arg0;
		this.anInt6225 = arg3;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class136 method5811() {
		return Static310.aClass136_85;
	}
}
