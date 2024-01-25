import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public interface Interface16 {

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I")
	int method7025();

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II[BI)V")
	void method7026(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)I")
	int method7027();

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)J")
	long method7028();
}
