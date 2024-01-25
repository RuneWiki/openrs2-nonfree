import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public interface Interface2 {

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!go;)Z")
	boolean method5234(@OriginalArg(1) Interface2 arg0);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)J")
	long method5235();
}
