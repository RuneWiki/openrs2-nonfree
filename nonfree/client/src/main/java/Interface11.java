import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public interface Interface11 {

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([IJLclient!fp;I)Ljava/lang/String;")
	String method4063(@OriginalArg(0) int[] arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class83 arg2);
}
