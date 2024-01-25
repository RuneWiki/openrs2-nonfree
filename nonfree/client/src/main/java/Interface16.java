import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public interface Interface16 {

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lclient!go;[IIJ)Ljava/lang/String;")
	String method5293(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) long arg2);
}
