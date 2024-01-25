import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public interface Interface2 {

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)J")
	long method8501();

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(III[B)V")
	void method8502(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(B)I")
	int method8503();

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)I")
	int method8504();
}
