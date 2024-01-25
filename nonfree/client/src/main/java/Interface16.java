import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public interface Interface16 {

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!db;[IIJ)Ljava/lang/String;")
	String method4897(@OriginalArg(0) Class57 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2);
}
