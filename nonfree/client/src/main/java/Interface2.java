import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public interface Interface2 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZJ[I)Ljava/lang/String;")
	String method2419(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2);
}
