import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public interface Interface27 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "([BBII)V")
	void method8092(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)J")
	long method8093();

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)I")
	int method8094();

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)I")
	int method8095();
}
