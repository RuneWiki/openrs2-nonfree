import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public abstract class Class192 {

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "[I")
	public static final int[] anIntArray641 = new int[120];

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 120; local6++) {
			@Pc(11) int local11 = local6 + 1;
			@Pc(24) int local24 = (int) (Math.pow(2.0D, (double) local11 / 7.0D) * 300.0D + (double) local11);
			local4 += local24;
			anIntArray641[local6] = local4 / 4;
		}
	}

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "()V")
	protected Class192() {
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BI)Z")
	public abstract boolean method7787(@OriginalArg(1) int arg0) throws IOException;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III[B)V")
	public abstract void method7790(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
	public abstract void method7791();

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "([BIII)I")
	public abstract int method7792(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) throws IOException;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V")
	public abstract void method7793();
}
