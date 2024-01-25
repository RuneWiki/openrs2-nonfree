import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public interface Interface13 {

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "([ILclient!dc;JZ)Ljava/lang/String;")
	String method1825(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class68 arg1, @OriginalArg(2) long arg2);
}
