import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public interface Interface6 {

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([IJBI)Ljava/lang/String;")
	String method937(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2);
}
