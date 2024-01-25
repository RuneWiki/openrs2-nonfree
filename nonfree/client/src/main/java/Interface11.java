import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public interface Interface11 {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)I")
	int method5045();

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II[BI)V")
	void method5046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2);

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)J")
	long method5047();

	@OriginalMember(owner = "client!hca", name = "b", descriptor = "(B)I")
	int method5048();
}
