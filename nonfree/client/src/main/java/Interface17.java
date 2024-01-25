import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public interface Interface17 {

	@OriginalMember(owner = "client!ika", name = "b", descriptor = "(B)I")
	int method8310();

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(B)I")
	int method8311();

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(I)J")
	long method8312();

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(I[BII)V")
	void method8313(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);
}
