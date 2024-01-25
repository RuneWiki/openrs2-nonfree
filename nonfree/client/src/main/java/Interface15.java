import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public interface Interface15 extends Interface4 {

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZILclient!jaclib/memory/Source;I)Z")
	boolean method5527(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!km", name = "b", descriptor = "(I)Z")
	boolean method5528();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method5529();

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(III)Z")
	boolean method5530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
	void method7409();
}
