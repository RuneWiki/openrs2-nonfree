import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public interface Interface4 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "([IIBJ)Ljava/lang/String;")
	String method2587(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) long arg2);
}
