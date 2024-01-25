import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public interface Interface20 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLclient!mha;[IJ)Ljava/lang/String;")
	String method8030(@OriginalArg(1) Class222 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) long arg2);
}
