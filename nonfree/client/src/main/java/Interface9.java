import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public interface Interface9 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z[IIJ)Ljava/lang/String;")
	String method3952(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2);
}
