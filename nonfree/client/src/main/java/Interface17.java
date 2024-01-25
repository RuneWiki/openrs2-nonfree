import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public interface Interface17 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)J")
	long method7364();

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)I")
	int method7365();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z[BII)V")
	void method7366(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)I")
	int method7367();
}
