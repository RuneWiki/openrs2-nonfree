import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "Ljava/awt/Image;")
	public static Image anImage11;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_102 = new Class81(95, -1);

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(III)I")
	public static int method3407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg1 - 1 & arg0 >> 31;
		return local19 + ((arg0 >>> 31) + arg0) % arg1;
	}
}
