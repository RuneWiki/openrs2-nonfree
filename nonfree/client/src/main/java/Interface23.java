import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public interface Interface23 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(JI[ILclient!ja;)Ljava/lang/String;")
	String method4316(@OriginalArg(0) long arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class158 arg2);
}
