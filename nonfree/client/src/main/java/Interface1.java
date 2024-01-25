import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public interface Interface1 {

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!bg;)Z")
	boolean method5432(@OriginalArg(1) Interface1 arg0);

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)J")
	long method5433();
}
