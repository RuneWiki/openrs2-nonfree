import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public interface Interface18 {

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(J[IILclient!gh;)Ljava/lang/String;")
	String method351(@OriginalArg(0) long arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Class131 arg2);
}
