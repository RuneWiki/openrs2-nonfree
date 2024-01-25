import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public interface Interface13 {

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lclient!ui;IJ[I)Ljava/lang/String;")
	String method506(@OriginalArg(0) Class329 arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2);
}
