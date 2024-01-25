import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public interface Interface1 {

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(IJLclient!vea;[I)Ljava/lang/String;")
	String method6822(@OriginalArg(1) long arg0, @OriginalArg(2) Class352 arg1, @OriginalArg(3) int[] arg2);
}
