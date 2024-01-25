import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public interface Interface12 {

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(B[ILclient!gfa;J)Ljava/lang/String;")
	String method3230(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class116 arg1, @OriginalArg(3) long arg2);
}
