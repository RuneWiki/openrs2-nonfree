import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public interface Interface5 {

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([IJII)Ljava/lang/String;")
	String method2687(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2);
}
