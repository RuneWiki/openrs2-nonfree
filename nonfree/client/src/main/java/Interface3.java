import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public interface Interface3 {

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIJ[I)Ljava/lang/String;")
	String method4730(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int[] arg2);
}
