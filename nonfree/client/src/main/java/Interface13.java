import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public interface Interface13 {

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(B)I")
	int method8067();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II[BI)V")
	void method8068(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)I")
	int method8069();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)J")
	long method8070();
}
