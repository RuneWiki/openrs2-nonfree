import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public interface Interface8 {

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)I")
	int method5113();

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)I")
	int method5114();

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)J")
	long method5115();

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(III[B)V")
	void method5116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2);
}
