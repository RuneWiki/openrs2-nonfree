import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static629 {

	@OriginalMember(owner = "client!vea", name = "t", descriptor = "I")
	public static int anInt10037;

	@OriginalMember(owner = "client!vea", name = "o", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_257 = new Class381(7, 6);

	@OriginalMember(owner = "client!vea", name = "u", descriptor = "J")
	public static long aLong287 = 1L;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BII)I")
	public static int method8579(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) double local16 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(23) double local23 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(31) double local31 = (local16 - local23) * Math.random() + local23;
		return (int) (Math.pow(2.0D, local31) + 0.5D);
	}
}
