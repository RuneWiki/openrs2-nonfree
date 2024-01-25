import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([SII)[S")
	public static short[] method8106(@OriginalArg(0) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static651.method755(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
